package com.banzaraktsaeva.geekbrains_lesson1;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SwitchCompat;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

import java.sql.Time;
import java.util.Calendar;
import java.util.Date;

/*
1. Создать проект со следующими пользовательскими элементами: TextView, EditText, Button, Switch, CheckBox, ToggleButton.
Для работы использовать LinearLayout. Использовать различные шрифты, цвета, размеры, прочие атрибуты.
2. Создать ещё один макет (если не получается, то проект) с несколькими EditText, где использовать атрибут inputType:
text, textPersonName, phone, number, textPassword, textEmailAddress и другие значения.
3. Добавить в проект элемент CalendarView.
 */

public class MainActivity extends AppCompatActivity {

    TextView textView;
    EditText editText;
    Button button;
    SwitchCompat switchCompat;
    CheckBox checkBox;
    ToggleButton toggleButton;
    String houseName;
    Button buttonIntent;
    CalendarView calendarView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.text_view);
        editText = findViewById(R.id.edit_text);
        button = findViewById(R.id.button);
        switchCompat = findViewById(R.id.switch_view);
        checkBox = findViewById(R.id.checkbox);
        toggleButton = findViewById(R.id.toggle_button);
        buttonIntent = findViewById(R.id.button_intent);
        calendarView = findViewById(R.id.calendarView);

        button.setOnClickListener(v -> {
            houseName = editText.getText().toString();
            Toast.makeText(MainActivity.this, houseName + " сохранено", Toast.LENGTH_SHORT).show();
        }

        );

         switchCompat.setOnCheckedChangeListener((buttonView, isChecked) -> {
            //меняем бэкраунд
            if (isChecked) {
                findViewById(R.id.background).setBackgroundResource(R.drawable.ic_launcher_background_v2);
            } else {
                findViewById(R.id.background).setBackgroundResource(R.drawable.ic_launcher_background_v3);
            }



            //getWindow().setBackgroundDrawableResource(R.drawable.ic_launcher_background_v2);
        });

        //calendarView.setMinDate(new Date());


    }

    public void intentResume(View view){
        Intent intent = new Intent(MainActivity.this, ResumeActivity.class);
        startActivity(intent);
    }
}
