package com.example.reika.count;

import android.graphics.Color;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;



public class MainActivity extends ActionBarActivity {

    //test aiueo
    TextView text;
    int number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = (TextView)findViewById(R.id.textView);
        text.setText("0");
    }

    public void plus(View v){
        number = number + 1;
            text.setText(String.valueOf(number));

        if (number < 10){
            text.setTextColor(Color.BLACK);
        }
    }

    public void minus(View v){
        number = number - 1;
            text.setText(String.valueOf(number));

        if (number < 10){
            text.setTextColor(Color.RED);
        }
    }

    public void clear(View v){
        number = 0;
            text.setText(String.valueOf(number));

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
