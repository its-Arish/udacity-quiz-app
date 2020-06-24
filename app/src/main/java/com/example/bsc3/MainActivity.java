package com.example.bsc3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    Button submit;
    int correctAnswers=0 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    private void checkfourth(){
        RadioButton r4 = (RadioButton) findViewById(R.id.r4);
        boolean answer1 = r4.isChecked();
        if (answer1){
            correctAnswers += 1;
        }
    }
    private String getname() {
        EditText userInputLastName = (EditText) findViewById(R.id.text1);
        String name = userInputLastName.getText().toString();
        return name;
    }
    private void checkthird(){
        String name = getname();
        if (name.trim().equalsIgnoreCase("three")){
            correctAnswers += 1;
        }
    }
    private void checksecond(){
        RadioButton r1 = (RadioButton) findViewById(R.id.r1);
        boolean answer2 = r1.isChecked();
        if (answer2){
            correctAnswers += 1;
        }
    }

    private void checkfirst(){
        CheckBox opt1 = (CheckBox) findViewById(R.id.c1);
        CheckBox opt2 = (CheckBox) findViewById(R.id.c2);
        CheckBox opt3 = (CheckBox) findViewById(R.id.c3);
        boolean a1 = opt1.isChecked();
        boolean a2= opt2.isChecked();
        boolean a3 = opt3.isChecked();
        if (a1 && a2 && !a3 ){
            correctAnswers += 1;
        }
    }

    private void checkAll(){
        checkfirst();
        checksecond();
        checkthird();
        checkfourth();
    }

    public void submit(View view) {

        checkAll();
        Toast.makeText(MainActivity.this, "Correct Answers: " + correctAnswers + "/4",
                Toast.LENGTH_LONG).show();
        correctAnswers = 0;
    }
}
