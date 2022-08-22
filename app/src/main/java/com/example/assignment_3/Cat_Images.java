package com.example.assignment_3;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class Cat_Images extends Activity implements View.OnClickListener {
    private ImageView cat1, cat2, cat3, cat4;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);
        initViews();
        initListeners();
        extractInput();
    }

    private void extractInput() {
        Intent cat = getIntent();
        Bundle bundle = cat.getExtras();
        cat1.setImageResource(R.drawable.cat1);
        cat2.setImageResource(R.drawable.cat2);
        cat3.setImageResource(R.drawable.cat3);
        cat4.setImageResource(R.drawable.cat4);
    }

    private void initViews() {
        cat1 = findViewById(R.id.image1);
        cat2 = findViewById(R.id.image2);
        cat3 = findViewById(R.id.image3);
        cat4 = findViewById(R.id.image4);
    }

    private void initListeners() {
        cat1.setOnClickListener(this);
        cat2.setOnClickListener(this);
        cat3.setOnClickListener(this);
        cat4.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view == cat1) {
            Intent result_intent = new Intent(
                    Cat_Images.this, MainActivity.class
            );
            result_intent.putExtra("cats", R.drawable.cat1);
            setResult(1, result_intent);
            finish();
        } else if (view == cat2) {
            Intent result_intent = new Intent(
                    Cat_Images.this, MainActivity.class
            );
            result_intent.putExtra("cats", R.drawable.cat2);
            setResult(1, result_intent);
            finish();
        } else if (view == cat3) {
            Intent result_intent = new Intent(
                    Cat_Images.this, MainActivity.class
            );
            result_intent.putExtra("cats", R.drawable.cat3);
            setResult(1, result_intent);
            finish();
        } else if (view == cat4) {
            Intent result_intent = new Intent(
                    Cat_Images.this, MainActivity.class
            );
            result_intent.putExtra("cats", R.drawable.cat4);
            setResult(1, result_intent);
            finish();
        }
    }
}