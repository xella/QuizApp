package com.example.maria.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import static com.example.maria.quizapp.R.id.eight_answer;
import static com.example.maria.quizapp.R.id.fifth_answer_1;
import static com.example.maria.quizapp.R.id.fifth_answer_2;
import static com.example.maria.quizapp.R.id.first_answer_rg;
import static com.example.maria.quizapp.R.id.fourth_answer_1;
import static com.example.maria.quizapp.R.id.fourth_answer_2;
import static com.example.maria.quizapp.R.id.ninth_answer_rg;
import static com.example.maria.quizapp.R.id.second_answer_rg;
import static com.example.maria.quizapp.R.id.seventh_answer_rg;
import static com.example.maria.quizapp.R.id.sixth_answer;
import static com.example.maria.quizapp.R.id.tenth_answer_rg;
import static com.example.maria.quizapp.R.id.third_answer;

public class MainActivity extends AppCompatActivity {

    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submitBtn(View view) {

        radioGroupCheck(first_answer_rg, "Zurich");

        radioGroupCheck(second_answer_rg, "Estonia");

        editTextCheck(third_answer, "Germany");

        checkboxCheck(fourth_answer_1, fourth_answer_2);

        checkboxCheck(fifth_answer_1, fifth_answer_2);

        editTextCheck(sixth_answer, "Ireland");

        radioGroupCheck(seventh_answer_rg, "Vistula");

        editTextCheck(eight_answer, "Spain");

        radioGroupCheck(ninth_answer_rg, "Hungary");

        radioGroupCheck(tenth_answer_rg, "Eiffel Tower");

        Toast.makeText(getApplicationContext(), "Your score is " + score + " out of 10 points!", Toast.LENGTH_LONG).show();

        score = 0;
    }

    public void checkboxCheck(int rightCheckbox1, int rightCheckbox2) {
        CheckBox rightAnswer1 = (CheckBox) findViewById(rightCheckbox1);
        CheckBox rightAnswer2 = (CheckBox) findViewById(rightCheckbox2);
        if (rightAnswer1.isChecked() && rightAnswer2.isChecked()) {
            score ++;
        }
    }

    public void radioGroupCheck(int checkedRadioId, String rightAnswer) {
        RadioGroup radioGroupCheck = (RadioGroup) findViewById(checkedRadioId);
        int checkedRadioButtonId = radioGroupCheck.getCheckedRadioButtonId();
        RadioButton checkedAnswer = (RadioButton) findViewById(checkedRadioButtonId);
        if (checkedAnswer == null) {
            return;
        }
        String checkedAnswerValue = checkedAnswer.getText().toString();
        if (checkedAnswerValue != null && checkedAnswerValue.equalsIgnoreCase(rightAnswer)) {
            score ++;
        }
    }

    public void editTextCheck(int editTextId, String rightAnswer) {
        EditText editTextCheck = (EditText) findViewById(editTextId);
        if (editTextCheck == null) {
            return;
        }
        String editTextAnswerValue = editTextCheck.getText().toString();
        if (editTextAnswerValue != null && editTextAnswerValue.equalsIgnoreCase(rightAnswer)) {
            score ++;
        }
    }
}
