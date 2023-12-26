package com.example.messanger;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class RecievedMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recieved_message);

        //создаем intent для приема текста с предыдущей страници 
        Intent intent = getIntent();

        //передаем данные в переменную String
        String message = intent.getStringExtra("message");

        //создаем поле в activity_recieved_message.xml для отобрадение текста
        TextView textView = findViewById(R.id.textViewMessage);

        //передаем в это поле переменную, где содержится наш текст и отображаем на экране
        textView.setText(message);
    }
}