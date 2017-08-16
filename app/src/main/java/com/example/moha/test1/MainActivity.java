package com.example.moha.test1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements RemotePresenterView {

    private TextView txv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Presenter prt=new Presenter(this);

        txv1=(TextView) findViewById(R.id.txv1);

    }


    @Override
    public void UpdateMyTextView(String s) {
        txv1.setText(s);

    }
}
