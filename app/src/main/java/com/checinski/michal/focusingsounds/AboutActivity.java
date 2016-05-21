package com.checinski.michal.focusingsounds;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class AboutActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        TextView aboutTextView = (TextView) findViewById(R.id.aboutTextView);

        InputStream is = this.getResources().openRawResource(R.raw.about);

        BufferedReader reader = new BufferedReader(new InputStreamReader(is));

        String data="";
        StringBuffer sbuffer = new StringBuffer();

        if (is != null) {
            try {
                while ((data = reader.readLine()) != null) {
                    sbuffer.append(data + "\n");
                }
                is.close();
            } catch (IOException e) {
            }
        }

        aboutTextView.setText(sbuffer.toString());

    }
}
