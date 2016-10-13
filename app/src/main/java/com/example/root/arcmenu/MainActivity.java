package com.example.root.arcmenu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.sa90.materialarcmenu.ArcMenu;
import com.sa90.materialarcmenu.StateChangeListener;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ArcMenu arcMenu = (ArcMenu) findViewById(R.id.arcmenu_android_example_layout);
        arcMenu.setStateChangeListener(new StateChangeListener() {
            @Override
            public void onMenuOpened() {

            }

            @Override
            public void onMenuClosed() {

            }
        });
    }

    public void check(View view) {
        Toast.makeText(getApplicationContext(),"Hello!",Toast.LENGTH_SHORT).show();
    }
}
