package ru.sersh_perm.helloworld;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private Button mCrowsCounterButton;
    private int mCount = 0;
    private TextView mInfoTextView;
    private int mCountCat = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mCrowsCounterButton = (Button)findViewById(R.id.buttonCrowsCounter);
        mInfoTextView = (TextView)findViewById(R.id.textView);
        mCrowsCounterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mInfoTextView.setText("Я насчитал "+ ++mCount + " ворон");
            }
        });
    }

    public void onClick(View view) {
        mInfoTextView.setText("Hello Kitty!");
    }

    public void onClickCounterCat(View view) {
        mInfoTextView.setText("Я насчитал "+ ++mCountCat + " котов");
    }


    public void onClickAbout(View view) {
        Intent intent = new Intent(MainActivity.this, AboutActivity.class);
        startActivity(intent);
    }

    public void onClickSecondActivity(View view) {
        EditText userEditText = (EditText)findViewById(R.id.editTextKomu);
        EditText giftEditText = (EditText)findViewById(R.id.editTextOpisanie);

        Intent intent = new Intent(MainActivity.this, SecondActivity.class);

        intent.putExtra("username",userEditText.getText().toString());
        intent.putExtra("gift",giftEditText.getText().toString());

        startActivity(intent);
    }
}
