package com.example.covid_19notificationupdater;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    private int positionCountry;
    TextView tvCountry,tvCases,tvRecovered,tvCritical,tvActive,tvTodayCases,tvTodayDeaths,tvTotalDeaths;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Intent intent = getIntent();
        positionCountry = intent.getIntExtra("position",0);

        getSupportActionBar().setTitle("Details of "+AffectedCountries.countryModelList.get(positionCountry).getCountry());
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);



        tvCountry = findViewById(R.id.detailCountry);
        tvCases = findViewById(R.id.detailCases);
        tvRecovered = findViewById(R.id.detailRecovered);
        tvCritical = findViewById(R.id.detailCritical);
        tvActive = findViewById(R.id.detailActive);
        tvTodayCases = findViewById(R.id.detailTodayCases);
        tvTodayDeaths = findViewById(R.id.detailTodayDeaths);
        tvTotalDeaths = findViewById(R.id.detailDeaths);

        tvCountry.setText(AffectedCountries.countryModelList.get(positionCountry).getCountry());
        tvCases.setText(AffectedCountries.countryModelList.get(positionCountry).getCases());
        tvRecovered.setText(AffectedCountries.countryModelList.get(positionCountry).getRecovered());
        tvCritical.setText(AffectedCountries.countryModelList.get(positionCountry).getCritical());
        tvActive.setText(AffectedCountries.countryModelList.get(positionCountry).getActive());
        tvTodayCases.setText(AffectedCountries.countryModelList.get(positionCountry).getTodayCases());
        tvTodayDeaths.setText(AffectedCountries.countryModelList.get(positionCountry).getTodayDeaths());
        tvTotalDeaths.setText(AffectedCountries.countryModelList.get(positionCountry).getDeaths());


    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()==android.R.id.home)
            finish();
        return super.onOptionsItemSelected(item);
    }
}
