package com.example.assignment_3;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.annotation.Nullable;

public class Jaguar_Images extends Activity implements View.OnClickListener {
    private ImageView jaguar1, jaguar2, jaguar3, jaguar4;

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
        jaguar1.setImageResource(R.drawable.jaguar1);
        jaguar2.setImageResource(R.drawable.jaguar02);
        jaguar3.setImageResource(R.drawable.jaguar3);
        jaguar4.setImageResource(R.drawable.jaguar04);

    }

    private void initViews() {
        jaguar1 = findViewById(R.id.image1);
        jaguar2 = findViewById(R.id.image2);
        jaguar3 = findViewById(R.id.image3);
        jaguar4 = findViewById(R.id.image4);
    }

    private void initListners() {
        jaguar1.setOnClickListener(this);
        jaguar2.setOnClickListener(this);
        jaguar3.setOnClickListener(this);
        jaguar4.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view == jaguar1) {
            Intent result_intent = new Intent(
                    Jaguar_Images.this, MainActivity.class
            );
            result_intent.putExtra("jaguars", R.drawable.jaguar1);
            setResult(1, result_intent);
            finish();
        } else if (view == jaguar2) {
            Intent result_intent = new Intent(
                    Jaguar_Images.this, MainActivity.class
            );
            result_intent.putExtra("jaguars", R.drawable.jaguar02);
            setResult(1, result_intent);
            finish();
        } else if (view == jaguar3) {
            Intent result_intent = new Intent(
                    Jaguar_Images.this, MainActivity.class
            );
            result_intent.putExtra("jaguars", R.drawable.jaguar3);
            setResult(1, result_intent);
            finish();
        } else if (view == jaguar4) {
            Intent result_intent = new Intent(
                    Jaguar_Images.this, MainActivity.class
            );
            result_intent.putExtra("jaguars", R.drawable.jaguar04);
            setResult(1, result_intent);
            finish();
        }
    }
}