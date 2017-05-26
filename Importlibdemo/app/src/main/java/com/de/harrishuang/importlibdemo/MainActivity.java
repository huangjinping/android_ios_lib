package com.de.harrishuang.importlibdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.google.myjson.Gson;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Gson  gson=new Gson();
       String name=   gson.toJson("sdsds中国禁卫军");

     System.out.println("显示输出的内容"+name);

        String temp="显示的数据问题";
        System.out.print("========>>>>>>>>>");
        System.out.print("========>>>>>>>>>");
        System.out.print("========>>>>>>>>>");
        System.out.print("========>>>>>>>>>");
        System.out.print("========>>>>>>>>>");
        System.out.print("========>>>>>>>>>");
        System.out.print("========>>>>>>>>>");
        System.out.print("========>>>>>>>>>");
        System.out.print("========>>>>>>>>>");
        System.out.print("========>>>>>>>>>");
        System.out.print("========>>>>>>>>>");
        System.out.print("========>>>>>>>>>");
        System.out.print("========>>>>>>>>>");
        System.out.print("========>>>>>>>>>");
        System.out.print("========>>>>>>>>>");
        System.out.print("========>>>>>>>>>");
        System.out.print("========>>>>>>>>>");
        System.out.print("========>>>>>>>>>");
        System.out.print("========>>>>>>>>>");
        System.out.print("========>>>>>>>>>");
        System.out.print("========>>>>>>>>>");
        System.out.print("========>>>>>>>>>");
        System.out.print("========>>>>>>>>>");
        System.out.print("========>>>>>>>>>");

        ////





        /////////

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
