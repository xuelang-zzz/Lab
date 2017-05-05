package com.example.a13616.cwmcalculator;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends Activity implements OnClickListener
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
    public int fg = 0;    //设置一个标志位并初始化，用于判断用户点击了加减乘除中的哪一个运算

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
    public void onClick(View arg0)      //arg0方法
    {
        // TODO Auto-generated method stub
        switch(arg0.getId()) {
            case R.id.btn_0:
                print.append("0");
                break;
            case R.id.btn_1:
                print.append("1");
                break;
            case R.id.btn_2:
                print.append("2");
                break;
            case R.id.btn_3:
                print.append("3");
                break;
            case R.id.btn_4:
                print.append("4");
                break;
            case R.id.btn_5:
                print.append("5");
                break;
            case R.id.btn_6:
                print.append("6");
                break;
            case R.id.btn_7:
                print.append("7");
                break;
            case R.id.btn_8:
                print.append("8");
                break;
            case R.id.btn_9:
                print.append("9");
                break;
            case R.id.btn_point:
                print.append(".");
                break;
            case R.id.btn_add:
                fg = 1;  //当用户点击加号时，标志位设为1
                num1 = print.getText().toString();
                print.setText("");
                break;
            case R.id.btn_subtract:
                fg = 2;   //当用户点击减号时，标志位设为2
                num1 = print.getText().toString();
                print.setText("");
                break;
            case R.id.btn_multiply:
                fg = 3;     //当用户点击乘号时，标志位设为3
                num1 = print.getText().toString();
                print.setText("");
                break;
            case R.id.btn_divide:
                fg = 4;     //当用户点击除号时，标志位设为4
                num1 = print.getText().toString();
                print.setText("");
                break;
            case R.id.btn_equals:
                switch (fg) { //根据之前fg的设定值，选择输出哪一种运算的结果
                    case 0:
                        //print.setText(num1);
                        print.append("0");
                        Log.d("num1", num1);
                        Log.d("num2", num2);
                        break;
                    case 1:
                        //print.setText("fg=1");
                        num2 = print.getText().toString();
                        Double result1 = Double.parseDouble(num1)
                                + Double.parseDouble(num2);
                        CharSequence r1 = result1.toString();
                        print.setText(result1 + "");
                        Log.d("num1", num1);
                        Log.d("num2", num2);
                        Log.d("result", result1.toString());
                        break;
                    case 2:
                        // print.setText("fg=2");
                        num2 = print.getText().toString();
                        Double result2 = (Double.parseDouble(num1)
                                - Double.parseDouble(num2));
                        CharSequence r2 = result2.toString();
                        print.setText(result2 + "");
                        Log.d("num1", num1);
                        Log.d("num2", num2);
                        Log.d("result", result2.toString());
                        break;
                    case 3:
                        // print.setText("fg=3");
                        num2 = print.getText().toString();
                        Double result3 = Double.parseDouble(num1)
                                * Double.parseDouble(num2);
                        CharSequence re3 = result3.toString();
                        print.setText(result3 + "");
                        Log.d("num1", num1);
                        Log.d("num2", num2);
                        Log.d("result", result3.toString());
                        break;
                    case 4:
                        // print.setText("fg=4");
                        num2 = print.getText().toString();
                        Double result4 = Double.parseDouble(num1)
                                / Double.parseDouble(num2);
                        CharSequence r4 = result4.toString();
                        print.setText(result4 + "");
                        Log.d("num1", num1);
                        Log.d("num2", num2);
                        Log.d("result", result4.toString());
                        break;

                    default:
                        break;
                }
                break;
            case R.id.btn_clear:
                fg = 0;
                num1 = "0";
                num2 = "0";
                print.setText("");
                break;
            default:
                break;
        }

    }
}
