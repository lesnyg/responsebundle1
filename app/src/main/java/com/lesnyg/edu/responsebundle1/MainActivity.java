package com.lesnyg.edu.responsebundle1;

import android.app.Activity;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        //String text = null;
        //Bundle bundle = new Bundle();
        //bundle.putString("text", text);
        Intent intent = new Intent(this, secondActivity.class);
        //intent.putExtras(bundle);
        startActivityForResult(intent, Activity.RESULT_FIRST_USER);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {

        if(data.hasExtra("resultValue"))
            Toast.makeText(getApplicationContext(),data.getStringExtra("resultValue"),Toast.LENGTH_LONG).show();


    }
}