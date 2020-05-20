package com.latihan.sumission;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.ContentView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import static android.content.Intent.EXTRA_TITLE;

public class listdata extends AppCompatActivity {
    TextView listnamee, listdataa;
    ImageView listimgg;
    public static final String EXTRA_TITLE = "extra_title";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listdata);

        listnamee = findViewById(R.id.listname);
        listdataa = findViewById(R.id.listdata);
        listimgg = findViewById(R.id.listimg);

        Intent intent = getIntent();
        String title = intent.getStringExtra(EXTRA_TITLE);
        setActionBar(title);

        String receivedNama = intent.getStringExtra("Namaku");
        String receivedData = intent.getStringExtra("Data");
        int receivedImage = intent.getIntExtra("Photo",0);

        listnamee.setText(receivedNama);
        listdataa.setText(receivedData);
        listimgg.setImageResource(receivedImage);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    private void setActionBar(String nama) {
        if (getSupportActionBar() != null){
            getSupportActionBar().setTitle(nama);
        }
    }
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == android.R.id.home){
            onBackPressed();
        }
        return super.onOptionsItemSelected(menuItem);
    }
    public void onBackPressed() {
        super.onBackPressed();
    }
}
