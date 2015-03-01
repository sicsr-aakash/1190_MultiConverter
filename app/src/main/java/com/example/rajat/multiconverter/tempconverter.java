package com.example.rajat.multiconverter;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;


public class tempconverter extends ActionBarActivity {
    private EditText text;
    private EditText t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tempconverter);

        text = (EditText) findViewById(R.id.editText5);
        t = (EditText) findViewById(R.id.editText6);
    }


    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button:
                RadioButton fButton = (RadioButton) findViewById(R.id.radio5);
                RadioButton cButton = (RadioButton) findViewById(R.id.radio6);
                if (text.getText().length() == 0) {
                    Toast.makeText(this, "Please enter a valid number",
                            Toast.LENGTH_LONG).show();
                    return;
                }

                float inputValue = Float.parseFloat(text.getText().toString());
                if (fButton.isChecked()) {
                    t.setText(String
                            .valueOf(ConverterUtil.convertFToC(inputValue)));
                    fButton.setChecked(false);
                    cButton.setChecked(true);
                } else {
                    t.setText(String
                            .valueOf(ConverterUtil.convertCToF(inputValue)));
                    cButton.setChecked(false);
                    fButton.setChecked(true);
                }
                break;
        }
    }




















    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_tempconverter, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
