package com.example.android.runtimelocalization;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button save_button;
    TextView first_name, last_name, phone_number;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        save_button = findViewById(R.id.save_button);
        first_name = findViewById(R.id.first_name);
        last_name = findViewById(R.id.last_name);
        phone_number = findViewById(R.id.phone_number);

        updateUI();


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int menuItem = item.getItemId();

        if (menuItem == R.id.en) {
            getSupportActionBar().setTitle("EN");
            SplashScreenActivity.setDictionaryBasedOnLanguages(getResources().getString(R.string.en_title));
            updateUI();
        } else if (menuItem == R.id.tr) {
            getSupportActionBar().setTitle("TR");
            SplashScreenActivity.setDictionaryBasedOnLanguages(getResources().getString(R.string.tr_title));
            updateUI();
        }
        return super.onOptionsItemSelected(item);
    }


    public void updateUI() {
        first_name.setText(SplashScreenActivity.langBasedMap.get(getResources().getString(R.string.first_name)));
        last_name.setText(SplashScreenActivity.langBasedMap.get(getResources().getString(R.string.last_name)));
        phone_number.setText(SplashScreenActivity.langBasedMap.get(getResources().getString(R.string.phone_number)));
        save_button.setText(SplashScreenActivity.langBasedMap.get(getResources().getString(R.string.save_button)));
    }


}
