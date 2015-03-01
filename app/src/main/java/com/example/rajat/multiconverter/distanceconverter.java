package com.example.rajat.multiconverter;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;


public class distanceconverter extends ActionBarActivity {
    private EditText text;
    private EditText disp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_distanceconverter);
        text = (EditText) findViewById(R.id.editText1);
        disp = (EditText) findViewById(R.id.editText2) ;
    }


    // this method is called at button click because we assigned the name to the
    // "OnClick property" of the button
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button:
                RadioButton kmButton = (RadioButton) findViewById(R.id.radio1);
                RadioButton mButton = (RadioButton) findViewById(R.id.radio2);
                if (text.getText().length() == 0) {
                    Toast.makeText(this, "Please enter a valid number",
                            Toast.LENGTH_LONG).show();
                    return;
                }

                float inputValue = Float.parseFloat(text.getText().toString());
                if (kmButton.isChecked()) {
                    disp.setText(String
                            .valueOf(ConverterUtil.convertMToKM(inputValue)));
                    kmButton.setChecked(false);
                    mButton.setChecked(true);
                } else {
                    text.setText(String
                            .valueOf(ConverterUtil.convertKMToM(inputValue)));
                    mButton.setChecked(false);
                    kmButton.setChecked(true);
                }
                break;
        }
    }

}

/*
  @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_distanceconverter, menu);
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
}*/
