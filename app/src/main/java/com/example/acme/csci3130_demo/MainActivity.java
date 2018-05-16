package com.example.acme.csci3130_demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button gobble = findViewById(R.id.replace_text_button);
        gobble.setOnClickListener(new View.OnClickListener() {
            public void onClick (View v) {
                EditText textInput = findViewById(R.id.text_input);
                Editable newText = textInput.getText();
                TextView mainText = findViewById(R.id.main_text);
                mainText.setText(newText);
            }
        });
    }
}
