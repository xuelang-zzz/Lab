package com.example.a13616.logdemo;
import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class LogDemo extends Activity {
    private static final String ACTIVITY_TAG="LogDemo";
    private Button bt;
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        bt = (Button)findViewById(R.id.mybutton);
        bt.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                Log.v(LogDemo.ACTIVITY_TAG, "This is Verbose.");
                Log.d(LogDemo.ACTIVITY_TAG, "This is Debug.");
                Log.i(LogDemo.ACTIVITY_TAG, "This is Information");
                Log.w(LogDemo.ACTIVITY_TAG, "This is Warnning.");
                Log.e(LogDemo.ACTIVITY_TAG, "This is Error.");
            }
        }); }
}
