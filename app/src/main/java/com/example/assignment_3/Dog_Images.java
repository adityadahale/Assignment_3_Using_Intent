package com.example.assignment_3;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.annotation.Nullable;

public class Dog_Images extends Activity implements View.OnClickListener {
    private ImageView dog1, dog2, dog3, dog4;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);
        initViews();
        initListeners();
        extractInput();
    }

    private void extractInput() {
        Intent dog = getIntent();
        Bundle bundle1 = dog.getExtras();
        dog1.setImageResource(R.drawable.dog1);
        dog2.setImageResource(R.drawable.dog2);
        dog3.setImageResource(R.drawable.dog3);
        dog4.setImageResource(R.drawable.dog4);
    }

    private void initViews() {
        dog1 = findViewById(R.id.image1);
        dog2 = findViewById(R.id.image2);
        dog3 = findViewById(R.id.image3);
        dog4 = findViewById(R.id.image4);
    }

    private void initListeners() {
        dog1.setOnClickListener(this);
        dog2.setOnClickListener(this);
        dog3.setOnClickListener(this);
        dog4.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view == dog1) {
            Intent result_intent = new Intent(
                    Dog_Images.this, MainActivity.class
            );
            result_intent.putExtra("dogs", R.drawable.dog1);
            setResult(2, result_intent);
            finish();
        } else if (view == dog2) {
            Intent result_intent = new Intent(
                    Dog_Images.this, MainActivity.class
            );
            result_intent.putExtra("dogs", R.drawable.dog2);
            setResult(2, result_intent);
            finish();
        } else if (view == dog3) {
            Intent result_intent = new Intent(
                    Dog_Images.this, MainActivity.class
            );
            result_intent.putExtra("dogs", R.drawable.dog3);
            setResult(2, result_intent);
            finish();
        } else if (view == dog4) {
            Intent result_intent = new Intent(
                    Dog_Images.this, MainActivity.class
            );
            result_intent.putExtra("dogs", R.drawable.dog4);
            setResult(2, result_intent);
            finish();
        }
    }
}