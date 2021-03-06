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

        radioGroupCheck(first_answer_rg, getString(R.string.question_one_answer3));

        radioGroupCheck(second_answer_rg, getString(R.string.question_two_answer1));

        editTextCheck(third_answer, getString(R.string.question_three_answer));

        checkboxCheck(fourth_answer_1, fourth_answer_2);

        checkboxCheck(fifth_answer_1, fifth_answer_2);

        editTextCheck(sixth_answer, getString(R.string.question_six_answer));

        radioGroupCheck(seventh_answer_rg, getString(R.string.question_seven_answer3));

        editTextCheck(eight_answer, getString(R.string.question_eight_answer));

        radioGroupCheck(ninth_answer_rg, getString(R.string.question_nine_answer3));

        radioGroupCheck(tenth_answer_rg, getString(R.string.question_ten_answer1));

        if (score == 10) {
            Toast.makeText(getApplicationContext(), getString(R.string.awesome_message) + score + getString(R.string.message_ending), Toast.LENGTH_LONG).show();
        } else if ( score > 4 && score < 10 ) {
            Toast.makeText(getApplicationContext(), getString(R.string.good_message) + score + getString(R.string.message_ending), Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(getApplicationContext(), getString(R.string.try_again_message) + score + getString(R.string.message_ending), Toast.LENGTH_LONG).show();
        }
        score = 0;
    }

    /**
     * Method for checking right answers in questions with 2 right options
     * @param rightCheckbox1 - first right answer
     * @param rightCheckbox2 - second right answer
     */
    public void checkboxCheck(int rightCheckbox1, int rightCheckbox2) {
        CheckBox rightAnswer1 = (CheckBox) findViewById(rightCheckbox1);
        CheckBox rightAnswer2 = (CheckBox) findViewById(rightCheckbox2);
        if (rightAnswer1.isChecked() && rightAnswer2.isChecked()) {
            score ++;
        }
    }

    /**
     * Method for checking right answer in questions with Radio group
     * @param radioGroupId - Radio group id
     * @param rightAnswer - String with a right answer
     */
    public void radioGroupCheck(int radioGroupId, String rightAnswer) {
        RadioGroup radioGroupCheck = (RadioGroup) findViewById(radioGroupId);
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

    /**
     * Method for checking right answer in EditText field
     * @param editTextId - edit text id
     * @param rightAnswer - String with a right answer
     */
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
