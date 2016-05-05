package com.test.fwc.testfix;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
private TextView textView;
    BugClass bugClass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView  = (TextView)findViewById(R.id.hello);
        bugClass = new BugClass();
        textView.setText(bugClass.bug());
    }
}
