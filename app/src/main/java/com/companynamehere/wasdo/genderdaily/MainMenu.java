package com.companynamehere.wasdo.genderdaily;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
        System.out.println("cant stop wont stop");
    }
    public void changeScreen(){
        setContentView(R.layout.activity_userinfo_list);
    }
}
