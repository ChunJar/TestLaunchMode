package com.example.cj.testlaunchmode;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

/**
 * 启动应用程序就会开启Activity栈，位于栈顶的activity被用户可见，每次启动一个activity都会将该activity的实例加入到activity栈中
 * Activity四种启动模式
 * 实现页面一跳转到页面二，并且页面二点击按钮跳转到页面一
 * standard：标准启动模式（默认）。如果需要启动一个Activity就会创建该Activity的实例。
 * 实现页面一跳转到页面二，并且页面二点击按钮跳转到页面二
 * singleTop：如果启动的Activity已经位于栈顶，那么就不会创建一个新的Activity，而是复用位于栈顶的实例对象。
 *              如果不位于栈顶，仍旧重新创建新的Activity对象。
 * 实现页面一跳转到页面二，页面二跳转到页面一
 * singleTask：设置了singleTask启动模式的Activity在启动的时候，如果位于Activity栈中，就会复用该Activity，
 *              在该Activity之上的所有Activity都会依次进行出栈，执行对应的onDestory方法，知道需要启动的Activity位于栈顶。
 *              一般应用在一键退出的功能
 *
 * singleInstance：使用此模式启动的Activity会复用已存在的Activity实例。
 *              不管这个Activity实例位于哪个页面中，都会共享已经启动的Activity实例。
 *              使用了singleInstance启动模式的Activity会单独开启一个共享栈，这个栈中只存在当前的Activity实例。
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("TAG", "主页面onCreate方法被调用");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("TAG", "主页面onDestroy方法被调用");
    }

    public void skip(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }
}
