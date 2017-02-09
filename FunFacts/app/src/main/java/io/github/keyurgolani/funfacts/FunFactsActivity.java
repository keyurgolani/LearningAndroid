package io.github.keyurgolani.funfacts;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class FunFactsActivity extends AppCompatActivity {

    private FactBook mFactBook = new FactBook();
    private ColorFactory mColorFactory = new ColorFactory();
    // Declare view variable
    private TextView mFactTextView;
    private Button mShowFactButton;
    private RelativeLayout mRelativeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);

        // Assign views from layout files to corresponding variables
        mFactTextView = (TextView) findViewById(R.id.factsTextView);
        mShowFactButton = (Button) findViewById(R.id.showFactButton);
        mRelativeLayout = (RelativeLayout) findViewById(R.id.activity_fun_facts);

        mShowFactButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mFactTextView.setText(mFactBook.randomFact());
                mRelativeLayout.setBackgroundColor(mColorFactory.randomColor());
            }
        });

        Toast.makeText(this, "Welcome to Fun Facts App", Toast.LENGTH_LONG).show();
    }
}
