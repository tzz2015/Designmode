package com.example.fwms.designmode;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Toast;

import com.example.fwms.designmode.build.Car;
import com.example.fwms.designmode.build.CarBuilder;
import com.example.fwms.designmode.build.SUVCarBuilder;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private static Toast toast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.tv_singleton).setOnClickListener(this);
        findViewById(R.id.tv_build).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.tv_singleton://单例模式
                showToast(getApplicationContext(), Singleton.getSingleton().getText());
                break;
            case R.id.tv_build://创建者模式
                createBuil();
                break;
        }
    }

    private void createBuil() {
        CarBuilder builder = new SUVCarBuilder();
        Car car = builder.setColor("黑色")
                .setPower("2.0T")
                .setHeight(2)
                .create();
        showToast(getApplicationContext(),car.getColor()+"!"+car.getPower()+"!"+car.getHeight());
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
