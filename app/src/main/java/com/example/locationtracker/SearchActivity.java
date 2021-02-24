package com.example.locationtracker;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.AutoCompleteTextView;

import com.example.locationtracker.adapters.PlacesAutoCompleteAdapter;
import com.example.locationtracker.entities.Prediction;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;






public class SearchActivity extends AppCompatActivity {
    private AutoCompleteTextView autoCompleteTextViewPlace;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        autoCompleteTextViewPlace = findViewById(R.id.autoCompleteTextViewPlace);
        loadData();
    }
    private void loadData() {
        List<Prediction> predictions = new ArrayList<>();
        PlacesAutoCompleteAdapter placesAutoCompleteAdapter = new PlacesAutoCompleteAdapter(getApplicationContext(), predictions);
        autoCompleteTextViewPlace.setThreshold(1);
        autoCompleteTextViewPlace.setAdapter(placesAutoCompleteAdapter);
    }
}
