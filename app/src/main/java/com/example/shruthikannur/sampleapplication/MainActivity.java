package com.example.shruthikannur.sampleapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.content.Intent;

import java.util.HashMap;
import java.util.Set;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intentExtra = getIntent();
        /*
        HashMap<String, String> paramValueMap = new HashMap<String, String>();
        String parameters = "parameter1=ValueSentFromSendParam&parameter2=Value2SentFromSendParam";
        if(!parameters.equals("")) {
            String[] params = parameters.split("&");
            for(int i = 0; i < params.length; i++) {
                String[] pair = params[i].split("=");
                paramValueMap.put(pair[0], pair[1]);
            }
        }


        intentExtra.addCategory("android.intent.category.LAUNCHER");
        intentExtra.setAction(Intent.ACTION_SEND);
        if(paramValueMap.size() != 0) {
            for(String key : paramValueMap.keySet()) {
                intentExtra.putExtra(key,paramValueMap.get(key));
            }
        }
        */

        Bundle extraBundle = intentExtra.getExtras();
        if (extraBundle != null) {
            System.out.print("ExtraBundle not null");
            Set<String> keys = extraBundle.keySet();
            String val = "";
            for(String k : keys) {
                val = val + k + " = " + extraBundle.get(k) + "\n";
            }
            System.out.print("val = " + val);
            if(val.isEmpty()) {
                val = "";
            }
            TextView myAwesomeTextView = (TextView)findViewById(R.id.display_text_ui);
            myAwesomeTextView.setText(val);
        }
    }
}
