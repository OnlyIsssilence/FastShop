package com.example.foolishfan.user_v10.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.foolishfan.user_v10.R;

public class UserActivity extends AppCompatActivity {
    private Button mReturnButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user);
        mReturnButton = (Button)findViewById(R.id.returnback);

    }
    public void back_to_login(View view) {
        //setContentView(R.layout.login);
        Intent intent3 = new Intent(UserActivity.this, LoginActivity.class);
        startActivity(intent3);
        finish();

    }
}