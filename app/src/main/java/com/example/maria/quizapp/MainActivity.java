package com.example.maria.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int score = 0;

    //Questions firstQuestions = new Questions("Which of the following European cities is not a national capital?","Zurich");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button submitBtn = (Button) findViewById(R.id.submit_btn);
        submitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // First question
                RadioGroup firstQRG = (RadioGroup) findViewById(R.id.first_answer_rg);
                int firstAnswer = firstQRG.getCheckedRadioButtonId();
                RadioButton firstAnswerRB = (RadioButton) findViewById(firstAnswer);
                String firstCheckedValue = firstAnswerRB.getText().toString();
                if (firstCheckedValue.equals("Zurich")) {
                    score ++;
                }

                // Second question
                RadioGroup secondQRG = (RadioGroup) findViewById(R.id.second_answer_rg);
                int secondAnswer = secondQRG.getCheckedRadioButtonId();
                RadioButton secondAnswerRB = (RadioButton) findViewById(secondAnswer);
                String secondAnswerValue = secondAnswerRB.getText().toString();
                if (secondAnswerValue.equals("Estonia")) {
                    score ++;
                }

                // Third question
                EditText thirdQET = (EditText) findViewById(R.id.third_answer);
                String thirdAnswer = thirdQET.getText().toString();
                if (thirdAnswer.equals("Germany") ) {
                    score ++;
                }

                Toast.makeText(getApplicationContext(), "Your score is " + score + " points!", Toast.LENGTH_LONG).show();


            }


        });



    }

//    public void checkRadioButtons(int radioGroupId, String correctAnswer) {
//        RadioGroup radioGroup = (RadioGroup) findViewById(radioGroupId);
//        int checkedAnswer = radioGroup.getCheckedRadioButtonId();
//        RadioButton checkedRadioButton = (RadioButton) findViewById(checkedAnswer);
//        String checkedAnswerValue = checkedRadioButton.getText().toString();
//        if (checkedAnswerValue.equals(correctAnswer)) {
//            score ++;
//        }
//
//    }


}
