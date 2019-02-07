package com.example.lenovo.myapplication3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private CheckBox check1,ckeck2,check3;
    private Button button;
    private TextView textview;

    private EditText editText1;
    private Button show;
    private TextView result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1=(EditText) findViewById(R.id.editText);
        show= (Button) findViewById(R.id.ButtonId);

        result= (TextView) findViewById(R.id.resultTextViewId);

        result.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {

        String s= editText1.getText().toString();
        result.setText("Typed: "+s);
    }
}
