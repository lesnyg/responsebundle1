package com.lesnyg.edu.responsebundle1;

import android.app.Activity;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.ActionMode;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class secondActivity extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


    }

    @Override
    public void finish() {
        EditText editText = findViewById(R.id.editText);

        Intent intent = new Intent();
        Bundle bundle = new Bundle();
        bundle.putString("resultValue",((EditText)editText).getText().toString());
        intent.putExtras(bundle);
        setResult(Activity.RESULT_FIRST_USER,intent);
        super.finish();
    }


}
