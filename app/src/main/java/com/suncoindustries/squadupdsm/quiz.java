package com.suncoindustries.squadupdsm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;

public class quiz extends AppCompatActivity {

    EditText name = (EditText)findViewById(R.id.EditTextName);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
    }

    public void onRadioButtonClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        switch (view.getId()){
            case R.id.he:
                if(checked)
                    //
                break;
            case R.id.she:
                //
                break;
            case R.id.them:
                //
                break;
        }
        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.radio_superman:
                if (checked)
                    // insert into database
                    break;
            case R.id.radio_spiderman:
                if (checked)
                    // insert into database
                    break;
            case R.id.radio_batman:
                if(checked)
                    //insert into database
                    break;
        }
    }

    public void completeSignUpProcedure(View view)
    {
        Intent intent = new Intent(this, profile.class);
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_quiz, menu);
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
