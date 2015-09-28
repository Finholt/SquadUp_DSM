package com.suncoindustries.squadupdsm;

import android.content.Intent;
import android.os.Bundle;
import android.preference.CheckBoxPreference;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Toast;

public class InterestQuiz extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interest_quiz);
        Spinner spinner = (Spinner) findViewById(R.id.pronouns);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.pronouns, android.R.layout.simple_spinner_item);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {

                String toast = String.format("Pronoun selected is:" + parent.getItemAtPosition(pos));
                Toast.makeText(getApplicationContext(), toast, Toast.LENGTH_SHORT).show();
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent)
            {
                Toast.makeText(getApplicationContext(), "Please select a pronoun", Toast.LENGTH_SHORT).show();
            }
        });
    }


    public void interest_quiz(View view){
        Toast.makeText(getApplicationContext(), "Successfully imported Google Calendar", Toast.LENGTH_SHORT).show();
    }

    public void onCheckboxClicked(View view) {
        boolean checked = ((CheckBox) view).isChecked();


        // Check which checkbox was clicked
        switch(view.getId()) {
            case R.id.icheck1:
                if (checked)
                    Toast.makeText(getApplicationContext(), "Circus: Selected", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(getApplicationContext(), "Circus: Unselected", Toast.LENGTH_SHORT).show();
                break;
            case R.id.icheck2:
                if (checked)
                    Toast.makeText(getApplicationContext(), "Culinary: Selected", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(getApplicationContext(), "Circus: Unselected", Toast.LENGTH_SHORT).show();
                break;
            case R.id.icheck3:
                if (checked)
                    Toast.makeText(getApplicationContext(), "Dance: Selected", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(getApplicationContext(), "Dance: Unselected", Toast.LENGTH_SHORT).show();
                break;
            case R.id.icheck4:
                if (checked)
                    Toast.makeText(getApplicationContext(), "Education: Selected", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(getApplicationContext(), "Education: Unselected", Toast.LENGTH_SHORT).show();
                break;

            case R.id.icheck5:
                if (checked)
                    Toast.makeText(getApplicationContext(), "Film: Selected", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(getApplicationContext(), "Film: Unselected", Toast.LENGTH_SHORT).show();
                break;

            case R.id.icheck6:
                if (checked)
                    Toast.makeText(getApplicationContext(), "Kids: Selected", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(getApplicationContext(), "Kids: Selected", Toast.LENGTH_SHORT).show();
                break;
            case R.id.icheck7:
                if (checked)
                    Toast.makeText(getApplicationContext(), "Literary: Selected", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(getApplicationContext(), "Literary: Unselected", Toast.LENGTH_SHORT).show();
                break;

            case R.id.icheck8:
                if (checked)
                    Toast.makeText(getApplicationContext(), "Music: Selected", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(getApplicationContext(), "Music: Unselected", Toast.LENGTH_SHORT).show();
                break;
            case R.id.icheck9:
                if (checked)
                    Toast.makeText(getApplicationContext(), "Social: Selected", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(getApplicationContext(), "Social: Unselected", Toast.LENGTH_SHORT).show();
                break;
            case R.id.icheck10:
                if (checked)
                    Toast.makeText(getApplicationContext(), "Theatre: Selected", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(getApplicationContext(), "Theatre:Unselected", Toast.LENGTH_SHORT).show();
                break;
            case R.id.icheck11:
                if (checked)
                    Toast.makeText(getApplicationContext(), "Visual Art: Selected", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(getApplicationContext(), "Visual: Unselected", Toast.LENGTH_SHORT).show();
                break;

        }
    }

    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.ccheck1:
                if (checked)
                    Toast.makeText(getApplicationContext(), "Guy Squad Selected", Toast.LENGTH_SHORT).show();
                break;
            case R.id.ccheck2:
                if (checked)
                    Toast.makeText(getApplicationContext(), "Girl Squad Selected", Toast.LENGTH_SHORT).show();
                break;
            case R.id.ccheck3:
                if (checked)
                    Toast.makeText(getApplicationContext(), "Co-Ed Group Selected", Toast.LENGTH_SHORT).show();
                break;
        }
    }


    public void nextQuizProcedure(View view){
        Intent intent = new Intent(this, InterestQuiz2.class);
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        //getMenuInflater().inflate(R.menu.menu_quiz, menu);
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
