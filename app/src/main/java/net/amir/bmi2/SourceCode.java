package net.amir.bmi2;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class SourceCode extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_source_code);

        TextView tv = (TextView) findViewById(R.id.tvLink);
        tv.setMovementMethod(LinkMovementMethod.getInstance());

        ActionBar ab = getSupportActionBar();
        ab.setTitle("Source Code");
    }
}