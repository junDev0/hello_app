package com.abc.app.helloapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity implements View.OnClickListener{

    EditText et_first_num,et_second_num;
    Button bt_plus,bt_minus,bt_multi,bt_divide,bt_rest,bt_equal,bt_clear;
    TextView tv_result;
    int calc_result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }
    public void init(){
        et_first_num = (EditText)findViewById(R.id.et_first_num);
        et_second_num = (EditText)findViewById(R.id.et_second_num);
        bt_plus = (Button)findViewById(R.id.bt_plus);
        bt_minus = (Button)findViewById(R.id.bt_minus);
        bt_multi = (Button)findViewById(R.id.bt_multi);
        bt_divide = (Button)findViewById(R.id.bt_divide);
        bt_rest = (Button)findViewById(R.id.bt_rest);
        bt_equal = (Button)findViewById(R.id.bt_equal);
        bt_clear = (Button)findViewById(R.id.bt_clear);
        tv_result = (TextView)findViewById(R.id.tv_result);


        bt_plus.setOnClickListener(this);
        bt_minus.setOnClickListener(this);
        bt_multi.setOnClickListener(this);
        bt_divide.setOnClickListener(this);
        bt_rest.setOnClickListener(this);
        bt_equal.setOnClickListener(this);
        bt_clear.setOnClickListener(this);

    }
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.bt_plus:
                setCalc_result(Integer.parseInt(et_first_num.getText().toString())+
                        Integer.parseInt(et_second_num.getText().toString()));
                tv_result.setText(et_first_num.getText().toString()+"+"+et_second_num.getText().toString());

            break;
            case R.id.bt_minus:
                setCalc_result(Integer.parseInt(et_first_num.getText().toString())-
                        Integer.parseInt(et_second_num.getText().toString()));
                tv_result.setText(et_first_num.getText().toString()+"-"+et_second_num.getText().toString());

                break;
            case R.id.bt_multi:
                setCalc_result(Integer.parseInt(et_first_num.getText().toString())*
                        Integer.parseInt(et_second_num.getText().toString()));
                tv_result.setText(et_first_num.getText().toString()+"*"+et_second_num.getText().toString());

                break;
            case R.id.bt_divide:
                setCalc_result(Integer.parseInt(et_first_num.getText().toString())/
                        Integer.parseInt(et_second_num.getText().toString()));
                tv_result.setText(et_first_num.getText().toString()+"/"+et_second_num.getText().toString());
                break;
            case R.id.bt_rest:
                setCalc_result(Integer.parseInt(et_first_num.getText().toString())%
                        Integer.parseInt(et_second_num.getText().toString()));
                tv_result.setText(et_first_num.getText().toString()+"%"+et_second_num.getText().toString());
                break;
            case R.id.bt_clear:
                tv_result.setText("");
                setCalc_result(0);
                break;
            case R.id.bt_equal:
                tv_result.setText(String.valueOf(getCalc_result()));

                break;
        }
    }


    public int getCalc_result() {
        return calc_result;
    }

    public void setCalc_result(int calc_result) {
        this.calc_result = calc_result;
    }
}
