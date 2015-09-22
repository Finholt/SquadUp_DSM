package com.suncoindustries.squadupdsm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class LoginC extends AppCompatActivity {

    //int counter = 3;
    EditText username = (EditText)findViewById(R.id.password);
    EditText password = (EditText)findViewById(R.id.email);
    public void login(View view) {
        if (username.getText().toString().equals("admin") && password.getText().toString().equals("admin")) {
            Intent intent = new Intent(this, UserProfileC.class);
            startActivity(intent);
        }
        else {
            //wrong password
            Toast.makeText(getApplicationContext(), "Wrong Credentials", Toast.LENGTH_SHORT).show();
            //counter--;
            //if(counter==0){

            }
        }

    public void Register (View view){
        Intent intent = new Intent(this,SignUpC.class);
        startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login2);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_login, menu);
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
