package com.example.rajat.multiconverter;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;


public class weightconverter extends ActionBarActivity {
    private EditText text;
    private EditText t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weightconverter);

        text = (EditText) findViewById(R.id.editText);
        t = (EditText) findViewById(R.id.editText2);

    }


    // this method is called at button click because we assigned the nage to the
    // "OnClick property" of the button
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button:
                RadioButton kgButton = (RadioButton) findViewById(R.id.radio1);
                RadioButton pButton = (RadioButton) findViewById(R.id.radio2);
                if (text.getText().length() == 0) {
                    Toast.makeText(this, "Please enter a valid number",
                            Toast.LENGTH_LONG).show();
                    return;
                }

                float inputValue = Float.parseFloat(text.getText().toString());
                if (kgButton.isChecked()) {

                    t.setText(String
                            .valueOf(ConverterUtil.convertPToKG(inputValue)));
                    kgButton.setChecked(false);
                    pButton.setChecked(true);

                }
                else {
                    pButton.setChecked(false);
                    kgButton.setChecked(true);
                    t.setText(String
                            .valueOf(ConverterUtil.convertKGToP(inputValue)));


                }
                break;
        }
    }

}


