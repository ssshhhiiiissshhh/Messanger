package com.example.messanger;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //создание кнопоки для перехода на другую страницу 
        Button buttonSendMessage = findViewById(R.id.buttonSend);//выбор id в окне разметки activity_main.xml

        // создание editText и тоже обращение по id
        EditText editText = findViewById(R.id.editTextMessage); 
        

        //обращение к кнопке которую создали выше и задаем функцию которая обрабатывает нажатие на кнопку "new View.OnClickListener()"
        buttonSendMessage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //передаем нашу функцию и она будет выполняться при нажатии на кнопку  -> editText.getText().toString() вот это выполняет забор текста и переносит его на другое окно
                launchNextScreen(editText.getText().toString());
            }
        });
    }



    //создание функции перехода на другую сраницу и которая будет передавать введенный текст на этой странице на другую
    private void launchNextScreen(String message)
    {
        //Intent --> выполняет переход на другую страницу
        Intent intent = new Intent(this,RecievedMessageActivity.class); // this -> текущая страница , RecievedMessageActivity.class -> куда переходим

        //выбираем что предаем, хз как это работает не помню)
        intent.putExtra("message",message);

        //запускаем наш intent
        startActivity(intent);
    }
}