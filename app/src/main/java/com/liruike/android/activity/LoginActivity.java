package com.liruike.android.activity;

import android.app.Activity;
import android.os.Bundle;

import com.tools.test.R;

/**
 * A login screen that offers login via email/password.
 */
public class LoginActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

}

