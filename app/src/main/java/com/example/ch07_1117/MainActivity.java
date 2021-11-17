package com.example.ch07_1117;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    LinearLayout baseLayout;
    Button btn1, btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("배경색 바꾸기(컨텍스트 메뉴)");
        baseLayout = findViewById(R.id.baseline);
        btn1 = findViewById(R.id.btn1);
        registerForContextMenu(btn1);
        btn2 = findViewById(R.id.btn2);
        registerForContextMenu(btn2);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

        MenuInflater mInflater = getMenuInflater();
        if (v == btn1){
            menu.setHeaderTitle("배경색 변경");
            menu.setHeaderIcon(R.drawable.icon1);
            mInflater.inflate(R.menu.menu1, menu);
        }
        if(v == btn2){
            mInflater.inflate(R.menu.menu2, menu);
        }
    }
}