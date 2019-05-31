package com.example.fragmentbasicapp;

import android.content.Intent;
import android.provider.MediaStore;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button activitybutton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        activitybutton=findViewById(R.id.activity_button);
        activitybutton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Activity Button",Toast.LENGTH_LONG).show();
            }
        });

    } @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        int id=item.getItemId();
        switch(id)
        {
            case R.id.action_toggle:
                Intent intent=new Intent(MainActivity.this,Main3Activity.class);
                startActivity(intent);
                Toast.makeText(MainActivity.this,"toggle Clicked",Toast.LENGTH_SHORT).show();
                break;

            case R.id.action_logout:
                Toast.makeText(MainActivity.this, "Logout clicked", Toast.LENGTH_SHORT).show();
                finish();
                break;

            case R.id.action_newfragment:
                Intent n=new Intent(MainActivity.this,Main2Activity.class);
                Toast.makeText(MainActivity.this, " New Fragment clicked", Toast.LENGTH_SHORT).show();
                startActivity(n);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}

