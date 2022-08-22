
//     -x-x-x-x-x-x-x-x-x-x-x-x-x- Assignment No->> 3 -x-x-x-x-x-x-x-x-x-x-x-x-x-

package com.example.assignment_3;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    ImageView image_View;
    Button cat, dog, jaguar, parrot;
    int result1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        initListeners();
    }

    private void initViews() {
        image_View = findViewById(R.id.image_view);
        cat = findViewById(R.id.cat);
        dog = findViewById(R.id.dog);
        parrot = findViewById(R.id.parrot);
        jaguar = findViewById(R.id.jaguar);
    }

    private void initListeners() {
        cat.setOnClickListener(this);
        dog.setOnClickListener(this);
        parrot.setOnClickListener(this);
        jaguar.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if (view == cat) {
            Intent cat = new Intent(
                    MainActivity.this, Cat_Images.class
            );
            startActivityForResult(cat, 1);
        } else if (view == dog) {
            Intent dog = new Intent(
                    MainActivity.this, Dog_Images.class
            );
            startActivityForResult(dog, 2);
        } else if (view == parrot) {
            Intent parrot = new Intent(
                    MainActivity.this, Parrot_Images.class
            );
            startActivityForResult(parrot, 3);
        } else if (view == jaguar) {
            Intent jaguar = new Intent(
                    MainActivity.this, Jaguar_Images.class
            );
            startActivityForResult(jaguar, 4);
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        Bundle bundle1 = data.getExtras();

        if (requestCode == 1) {
            result1 = bundle1.getInt("cats");
            image_View.setImageResource(result1);
        } else if (requestCode == 2) {
            result1 = bundle1.getInt("dogs");
            image_View.setImageResource(result1);
        } else if (requestCode == 3) {
            result1 = bundle1.getInt("parrots");
            image_View.setImageResource(result1);
        } else if (requestCode == 4) {
            result1 = bundle1.getInt("jaguars");
            image_View.setImageResource(result1);
        }
    }
}