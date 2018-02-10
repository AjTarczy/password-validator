package ca.ajtarczy.passwordvalidator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void buttonClick(View v) {
        EditText inputBox = findViewById(R.id.inputField); //sets the EditText on screen to an object
        TextView outputBox = findViewById(R.id.outputField); //sets the TextView on screen to an object
        String pw = inputBox.getText().toString();
        if (pw == "")
            outputBox.setText("Please enter something into the field above.");
        else {
            int result = Validator.validate(pw);
            if (result >= 3) {
                outputBox.setText("Your password is strong.");
            }
            else
                outputBox.setText("Your password is weak.");
        }



    }



}
