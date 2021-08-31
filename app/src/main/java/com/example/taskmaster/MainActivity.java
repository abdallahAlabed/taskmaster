package com.example.taskmaster;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        setContentView(R.layout.activity_main);
        Button addTask = findViewById(R.id.button1);
        addTask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent addTask1 = new Intent(MainActivity.this, AddTask.class);
                startActivity(addTask1);
            }
        });


        Button eating = findViewById(R.id.eating);
        eating.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent addTask = new Intent(MainActivity.this, TaskDetail.class);
                addTask.putExtra("addTask","eating");
                startActivity(addTask);

            }
        });

        Button coding = findViewById(R.id.coding);
        coding.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent addTask = new Intent(MainActivity.this, TaskDetail.class);
                addTask.putExtra("addTask","coding");
                startActivity(addTask);
            }
        });

        Button sleeping = findViewById(R.id.sleeping);
        sleeping.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent addTask = new Intent(MainActivity.this, TaskDetail.class);
                addTask.putExtra("addTask","sleeping");
                startActivity(addTask);
            }
        });

        Button allTasks = findViewById(R.id.button2);
        allTasks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent addTask = new Intent(MainActivity.this, AllTasks.class);
                startActivity(addTask);
            }
        });
        Button setting = findViewById(R.id.setting);
        setting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goToSetting = new Intent(MainActivity.this, SettingsPage.class);
                startActivity(goToSetting);
            }
        });

        ArrayList<TaskModel> allTaskModel = new ArrayList<TaskModel>();
        allTaskModel.add(new TaskModel("sleeping","new","بتحلم فيه بس ما بتشوفه "));
        allTaskModel.add(new TaskModel("coding","assigned","يا ريت فالحين فيه "));
        allTaskModel.add(new TaskModel("eating","progress","hallelooya"));

        RecyclerView taskModelRecuclerView = findViewById(R.id.taskRecylerView);
        taskModelRecuclerView.setLayoutManager(new LinearLayoutManager(this));
        taskModelRecuclerView.setAdapter(new TaskAdaptaer(allTaskModel));

    }
    @SuppressLint("SetTextI18n")
    @Override
    protected void onResume() {
        super.onResume();
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(MainActivity.this);
        String userName = sharedPreferences.getString("userName", "abdallah");

        TextView instructorNameView = findViewById(R.id.userName);
        instructorNameView.setText(userName+ " tasks");


    }
}