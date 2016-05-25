package com.example.yejinlei.my_app_portfolio;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    public void myClickbutton(View v){
        toast("POPULAR MOVIES");
    }
    
    public void myClickbutton2(View v){
        toast("STOCK HAWK");
    }

    public void myClickbutton3(View v){
        toast("BUILD IT BIGGER");
    }

    public void myClickbutton4(View v){
        toast("MAKE YOUR APP MATERIAL");
    }


    public void myClickbutton5(View v){
        toast("GO UBIQUITOUS");
    }

    public void myClickbutton6(View v){
        toast("CAPSTONE");
    }

    private void toast(String appName) {
        String msg = "This button will launch my " + appName + " app!";
        Toast.makeText(MainActivity.this, msg, Toast.LENGTH_SHORT).show();
    }
}