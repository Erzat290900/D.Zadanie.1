package com.example.dzadanie1;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static String EXTRA_KEY = "ExtraKey";
    public static final String EXTRA_IMAGE = "ImageKey";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void BtnClick(View view) {
        Intent intent = new Intent(MainActivity.this, ActivityTwo.class);
        intent.putExtra(EXTRA_KEY,"");
        intent.putExtra(EXTRA_IMAGE, R.drawable.ic_launcher_background);
        startActivityForResult(intent, 2);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 2 && resultCode == RESULT_OK) {
            String text = data.getStringExtra(EXTRA_KEY);
            Toast.makeText(this, text, Toast.LENGTH_SHORT).show();
        }
    }
}