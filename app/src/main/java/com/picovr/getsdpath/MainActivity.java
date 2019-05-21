package com.picovr.getsdpath;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=findViewById(R.id.text1);

        androidGetSDdir();
    }

    // Get SD card path
    public void androidGetSDdir() {
        //eg: storage/3263-3533
        String dir = Externalstoragedirectory.getSDdir(this);
        Log.e(TAG, "androidGetSDdir: " + dir );
        textView.setText(dir);
    }
}
