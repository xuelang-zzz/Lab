package com.example.a13616.call1;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.telephony.PhoneNumberUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class call extends Activity {
        public void onCreate(Bundle savedInstanceState){
            super.onCreate(savedInstanceState);
            setContentView(R.layout.main);
            final EditText phonenumber=(EditText)findViewById(R.id.phonenumber);
            final Button button=(Button)findViewById(R.id.Button1);
            button.setOnClickListener(new Button.OnClickListener(){
                public void onClick(View b){
                    String call=phonenumber.getText().toString();
                    if (PhoneNumberUtils.isGlobalPhoneNumber(call)) {
                        //Intent I = new Intent(Intent.ACTION_CALL, Uri.parse("tel://" + call));
                        //Intent I=new Intent(Intent.ACTION_DIAL,Uri.parse("tel://"+call));
                        Intent I = new Intent();
                        I.setAction(Intent.ACTION_CALL);
                        I.setData(Uri.parse("tel://" + call));
                        startActivity(I);
                    }
                    else {
                        Toast.makeText(call.this, R.string.notify_incorrect_phonenumber, Toast.LENGTH_LONG).show();
                    }
                }
            });
        }
        }