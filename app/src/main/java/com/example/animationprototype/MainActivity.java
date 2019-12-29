package com.example.animationprototype;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

//    ConstraintLayout jumpOutLayout;
    ListView testList;
    Dialog myDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myDialog = new Dialog(this);

//        jumpOutLayout = findViewById(R.id.jumpOutLayout);
        testList = findViewById(R.id.testList);

        ArrayList<String> list = new ArrayList<>();
        for (int i=0; i<10; i++)
            list.add("test" + i);
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, list);
        testList.setAdapter(adapter);
        testList.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//        Animation anim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.test_anim);
//        jumpOutLayout.setVisibility(View.VISIBLE);
//        jumpOutLayout.bringToFront();
//        jumpOutLayout.startAnimation(anim);
        showPopup();
    }

    private void showPopup() {
        myDialog.setContentView(R.layout.custom_dialog);
        myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        myDialog.show();
    }
}
