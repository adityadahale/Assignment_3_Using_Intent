package com.example.assignment_3;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.annotation.Nullable;

public class Parrot_Images extends Activity {
    private ImageView parrot1, parrot2, parrot3, parrot4;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);
        initViews();
        initListners();
        extractInput();
    }

    private void extractInput() {
        Intent dog = getIntent();
        Bundle bundle1 = dog.getExtras();
        parrot1.setImageResource(R.drawable.parrot1);
        parrot2.setImageResource(R.drawable.parrot2);
        parrot3.setImageResource(R.drawable.parrot3);
        parrot4.setImageResource(R.drawable.parrot4);

    }

    private void initViews() {
        parrot1 = findViewById(R.id.image1);
        parrot2 = findViewById(R.id.image2);
        parrot3 = findViewById(R.id.image3);
        parrot4 = findViewById(R.id.image4);
    }

    private void initListners() {
        parrot1.setOnClickListener(new Parrot1OnClickListener());
        parrot2.setOnClickListener(new Parrot2OnClickListener());
        parrot3.setOnClickListener(new Parrot3OnClickListener());
        parrot4.setOnClickListener(new Parrot4OnClickListener());
    }

    private class Parrot1OnClickListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            Intent result_intent1 = new Intent(
                    Parrot_Images.this, MainActivity.class
            );
            result_intent1.putExtra("parrots", R.drawable.parrot1);
            setResult(3, result_intent1);
            finish();
        }
    }

    private class Parrot2OnClickListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            Intent result_intent1 = new Intent(
                    Parrot_Images.this, MainActivity.class
            );
            result_intent1.putExtra("parrots", R.drawable.parrot2);
            setResult(3, result_intent1);
            finish();
        }
    }

    private class Parrot3OnClickListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            Intent result_intent1 = new Intent(
                    Parrot_Images.this, MainActivity.class
            );
            result_intent1.putExtra("parrots", R.drawable.parrot3);
            setResult(3, result_intent1);
            finish();
        }
    }

    private class Parrot4OnClickListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            Intent result_intent1 = new Intent(
                    Parrot_Images.this, MainActivity.class
            );
            result_intent1.putExtra("parrots", R.drawable.parrot4);
            setResult(3, result_intent1);
            finish();
        }
    }
}
