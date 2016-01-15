package ru.sersh_perm.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        String user = "ЖЫвотное";
        String gift = "дырку от бублика";

        user = getIntent().getExtras().getString("username");
        gift = getIntent().getExtras().getString("gift");

        TextView infoTextView = (TextView)findViewById(R.id.textViewInfo);
        infoTextView.setText(user + ", вам передали " + gift);
    }
}
