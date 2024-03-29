package com.example.taskmaster;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.widget.Button;
import android.widget.EditText;

public class SettingsPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings_page);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Button saveUsername = findViewById(R.id.save);
            saveUsername.setOnClickListener((view)->{

            SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(SettingsPage.this);

            SharedPreferences.Editor sharedPreferencesEditor = sharedPreferences.edit();

            EditText userName1 = findViewById(R.id.userName1);

            String userName = userName1.getText().toString();

            sharedPreferencesEditor.putString("userName", userName);

            sharedPreferencesEditor.apply();

        });
    }


}