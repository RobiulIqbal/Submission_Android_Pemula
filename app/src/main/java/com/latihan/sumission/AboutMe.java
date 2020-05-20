package com.latihan.sumission;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toolbar;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class AboutMe extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_me);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }


    public void setActionBar(String nama) {
        if (getSupportActionBar() !=null){
            getSupportActionBar().setTitle(nama);}
    }


    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId()== android.R.id.home){
            onBackPressed();
        }return super.onOptionsItemSelected(menuItem);
    }

    public void onBackPressed() {
        super.onBackPressed();
    }
}
