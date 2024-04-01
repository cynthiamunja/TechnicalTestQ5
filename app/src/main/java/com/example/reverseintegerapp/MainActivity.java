// Write a program that takes an integer as input and returns an integer with reversed digit
// ordering.
// Examples:
// For input 500, the program should return 5.
// For input -56, the program should return -65.
// For input -90, the program should return -9.
// For input 91, the program should return 19.

package com.example.reverseintegerapp;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void reverseNumber(View view) {
        EditText inputEditText = findViewById(R.id.inputEditText);
        TextView resultTextView = findViewById(R.id.resultTextView);

        String inputStr = inputEditText.getText().toString();
        int input = Integer.parseInt(inputStr);
        int reversedNumber = reverseDigits(input);
        resultTextView.setText(String.valueOf(reversedNumber));
    }

    private int reverseDigits(int n) {
        int reversed = 0;
        boolean negative = false;

        if (n < 0) {
            negative = true;
            n = -n;
        }

        while (n != 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n /= 10;
        }

        return negative ? -reversed : reversed;
    }
}
