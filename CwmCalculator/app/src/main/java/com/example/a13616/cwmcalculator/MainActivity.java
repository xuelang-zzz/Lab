package com.example.a13616.cwmcalculator;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends Activity implements OnClickListener  //OnClickListen:接口
{
    private EditText print;       //显示框
    private Button btn_0;         // 0
    private Button btn_1;         // 1
    private Button btn_2;         // 2
    private Button btn_3;         // 3
    private Button btn_4;         // 4
    private Button btn_5;         // 5
    private Button btn_6;         // 6
    private Button btn_7;         // 7
    private Button btn_8;         // 8
    private Button btn_9;         // 9
    private Button btn_point;    // 小数点
    private Button btn_add;       // 加号
    private Button btn_subtract; // 减号
    private Button btn_multiply; // 乘号
    private Button btn_divide;   // 除号
    private Button btn_equals;   // 等号
    private Button btn_clear;    // 清除显示框
    private String num1 = "0";      //用户输入的第一个数
    private String num2 = "0";      //用户输入的第二个数
    public int fg = 0;    //设置一个标志位，用于判断用户点击了加减乘除中的哪一个运算

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        setTitle("my calculation");
        //以下是计算器界面的每一个控件
        print = (EditText) findViewById(R.id.print);
        btn_0 = (Button) findViewById(R.id.btn_0);
        btn_1 = (Button) findViewById(R.id.btn_1);
        btn_2 = (Button) findViewById(R.id.btn_2);
        btn_3 = (Button) findViewById(R.id.btn_3);
        btn_4 = (Button) findViewById(R.id.btn_4);
        btn_5 = (Button) findViewById(R.id.btn_5);
        btn_6 = (Button) findViewById(R.id.btn_6);
        btn_7 = (Button) findViewById(R.id.btn_7);
        btn_8 = (Button) findViewById(R.id.btn_8);
        btn_9 = (Button) findViewById(R.id.btn_9);
        btn_point = (Button) findViewById(R.id.btn_point);
        btn_add = (Button) findViewById(R.id.btn_add);
        btn_subtract = (Button) findViewById(R.id.btn_subtract);
        btn_multiply = (Button) findViewById(R.id.btn_multiply);
        btn_divide = (Button) findViewById(R.id.btn_divide);
        btn_equals = (Button) findViewById(R.id.btn_equals);
        btn_clear = (Button) findViewById(R.id.btn_clear);

        //为每个Button设置监听器
        //this指代的是在MainActivity中实现了OnClickListen接口
        btn_0.setOnClickListener(this);
        btn_1.setOnClickListener(this);
        btn_2.setOnClickListener(this);
        btn_3.setOnClickListener(this);
        btn_4.setOnClickListener(this);
        btn_5.setOnClickListener(this);
        btn_6.setOnClickListener(this);
        btn_7.setOnClickListener(this);
        btn_8.setOnClickListener(this);
        btn_9.setOnClickListener(this);
        btn_point.setOnClickListener(this);
        btn_add.setOnClickListener(this);
        btn_subtract.setOnClickListener(this);
        btn_multiply.setOnClickListener(this);
        btn_divide.setOnClickListener(this);
        btn_equals.setOnClickListener(this);
        btn_clear.setOnClickListener(this);
    }

    //鼠标点击函数
    @Override
    public void onClick(View v)       //View类型的变量v
    {
        // TODO Auto-generated method stub
    }
}
