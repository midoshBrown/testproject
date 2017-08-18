package com.example.moha.test1.View;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.moha.test1.Interfaces.OnResultFromPresenterListener;
import com.example.moha.test1.Presenter.Presenter;
import com.example.moha.test1.R;

public class MainActivity extends AppCompatActivity implements OnResultFromPresenterListener, View.OnClickListener {

    private TextView txv1;
    public  Presenter presenter;
    private EditText edt1;
    private Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        presenter=new Presenter(this);


        txv1=(TextView) findViewById(R.id.txv1);
        txv1.setOnClickListener(this);

        edt1= (EditText) findViewById(R.id.edt1);
        edt1.setOnClickListener(this);

        btn1= (Button) findViewById(R.id.btn1);
        btn1.setOnClickListener(this);



    }


    @Override
    public void onClick(View v) {
        int i=v.getId();
        switch (i){
            case R.id.btn1:
                presenter.OnSubmitMsg(edt1.getText().toString());
                edt1.getText().clear();
                break;
        }
    }

    @Override
    public void showMsg(String s) {
            txv1.setText(s);
    }


}
