package com.suncoindustries.squadupdsm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class Settings extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
    }

    public void toQuizProcedure(View view) {
        Intent intent = new Intent(this, InterestQuiz.class);
        startActivity(intent);
    }

    //Toast for requesting a new squad.  This method would hook up to our backend if we had one.
    public void newSquad(View view) {
        Toast.makeText(getApplicationContext(), "New Squad Requested", Toast.LENGTH_SHORT).show();
    }

    //Toast for updating google cal.  API not implemented in time
    public void toEvents(View view) {
        Toast.makeText(getApplicationContext(), "Updated from Google Calendar", Toast.LENGTH_SHORT).show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        //getMenuInflater().inflate(R.menu.menu_settings, menu);
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
