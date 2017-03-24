package com.andy.android;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import static com.andy.android.R.id.a;


public class xmlDesign extends Activity {
    /**
     * Called when the activity is first created.
     */
    RadioButton r1 = null;
    RadioButton r2 = null;
    RadioButton r3 = null;
    RadioButton r4 = null;
    RadioGroup radioGroup = null;
    private TextView tv_result;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        // 获得单选按钮组
        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        tv_result = (TextView) findViewById(R.id.tv_result);

        // 获得单选按钮
        r1 = (RadioButton) findViewById(a);
        r2 = (RadioButton) findViewById(R.id.b);
        r3 = (RadioButton) findViewById(R.id.c);
        r4 = (RadioButton) findViewById(R.id.d);
        r1.setClickable(true);
        // 监听单选按钮
//        radioGroup.setOnCheckedChangeListener(mChangeRadio);
        Button btn1_sure = (Button) findViewById(R.id.sure);
        Button btn2_cancel = (Button) findViewById(R.id.cancel);
        btn1_sure.setOnClickListener(new btn1_sure());//为Button设置监听事件
        btn2_cancel.setOnClickListener(new btn2_cancel());
    }

    class btn1_sure implements OnClickListener { //按钮事件监听器类，实现OnClickListener接口
        @Override
        public void onClick(View v) {//实现OnClickListener接口中的onClick方法
            String ans = "";
            if (r1.isChecked()) {
                ans = "on";
            } else if (r2.isChecked()) {
                ans = "at";
            } else if (r3.isChecked()) {
                ans = "of";
            } else if (r4.isChecked()) {
                ans = "in";
            }
            /* new 一个Intent 对象，并指定class */
            Intent intent = new Intent();
            //设置Intent对象要启动的Activity
            intent.setClass(xmlDesign.this, otherActivity.class);
            /* new 一个Bundle对象，并将要传递的数据传入 */
            Bundle bundle = new Bundle();
            bundle.putString("ans", ans);
            /* 将Bundle 对象assign 给Intent */
            intent.putExtras(bundle);
            //启动指定Activity并等待返回的结果，其中0是请求码，用于标识该请求
            startActivityForResult(intent, 0);
        }
    }

    class btn2_cancel implements OnClickListener {
        /*
        (API中查找，android.widget public class RadioGroup
        void clearCheck()
        Clears the selection.
         */
        @Override
        public void onClick(View v) {
            // TODO Auto-generated method stub
            radioGroup.clearCheck();
            tv_result.setText("");
        }

    }


    protected void onActivityResult(int requestCode, int resultCode,
                                    Intent data) {
        super.onActivityResult(requestCode,resultCode,data);
//当requestCode、resultCode同时为0，也就是处理特定的结果
        if (requestCode == 0
                && resultCode == 0) {


/* 取得来自Activity2 的数据，并显示于画面上 */
            Bundle bunde = data.getBundleExtra("result_bundle");
            String ans = bunde.getString("result_data");
            Log.i("zhouweizhi<<" , ans);
            tv_result.setText(ans);

        }
    }
}
