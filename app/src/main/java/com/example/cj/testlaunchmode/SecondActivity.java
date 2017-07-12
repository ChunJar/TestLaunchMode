package com.example.cj.testlaunchmode;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.View;
import android.widget.Button;

/**
 * Created by CJ on 2017/7/12.
 */

public class SecondActivity extends Activity implements View.OnClickListener {
    private Button btn;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        btn = (Button) findViewById(R.id.second_btn);
        btn.setOnClickListener(this);
        Log.i("TAG", "页面二onCreate方法被调用");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("TAG", "页面二onDestroy方法被调用");
    }

    public void onClick(View v) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
