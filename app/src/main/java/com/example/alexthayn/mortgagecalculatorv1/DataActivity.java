package com.example.alexthayn.mortgagecalculatorv1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by Alex Thayn on 3/5/2018.
 */

public class DataActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstance){
        super.onCreate(savedInstance);
        setContentView(R.layout.activity_data);
    }

    public void goBack(View v){
        this.finish();
    }
}
