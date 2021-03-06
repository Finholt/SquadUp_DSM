package com.suncoindustries.squadupdsm;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class InterestQuiz extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interest_quiz);

        //Sets the pronouns for the dropdown spinner
        Spinner spinner = (Spinner) findViewById(R.id.pronouns);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.pronouns, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {

                //  String toast = String.format("Pronoun selected is:", parent.getItemAtPosition(pos));
                //  Toast.makeText(getApplicationContext(), toast, Toast.LENGTH_SHORT).show();
            }

            //Appears if nothing is selected for the dropdown.  Should never occur since there is a default selection
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                Toast.makeText(getApplicationContext(), "Please select a pronoun", Toast.LENGTH_SHORT).show();
            }
        });
    }


    //Creates a toast indicating the success of connecting to Google Cal.  Not enough time to actually connect to the api
    public void googleCalButton(View view) {
        Toast.makeText(getApplicationContext(), "Calendar Imported Successfully", Toast.LENGTH_SHORT).show();
    }


    //Moves to the next quiz page when the button is clicked
    public void nextQuizProcedure(View view) {
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
