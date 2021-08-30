package com.example.taskmaster;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button addTask = findViewById(R.id.button1);
        addTask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent addTask1= new Intent(MainActivity.this,AddTask.class);
                startActivity(addTask1);
            }
        });
        Button allTasks = findViewById(R.id.button2);
        allTasks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent addTask2= new Intent(MainActivity.this,AllTasks.class);
                startActivity(addTask2);
            }
        });
    }

}