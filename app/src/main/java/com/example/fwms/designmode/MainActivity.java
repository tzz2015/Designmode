package com.example.fwms.designmode;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private static Toast toast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.tv_singleton).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.tv_singleton://单例模式
                showToast(getApplicationContext(), Singleton.getSingleton().getText());
                break;
        }
    }


    public static void showToast(Context context, String title) {
        if (toast == null) {
            toast = Toast.makeText(context, title, Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER, 0, 0);
        } else {
            toast.setText(title);
        }
        toast.show();
    }
}
