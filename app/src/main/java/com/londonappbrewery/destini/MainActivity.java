package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    TextView mainText;
    Button button1,button2;
    int mIndex=1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainText=(TextView)findViewById(R.id.storyTextView);
        button1=(Button)findViewById(R.id.buttonTop);
        button2=(Button)findViewById(R.id.buttonBottom);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mIndex==1 || mIndex==2)
                {
                    mainText.setText(R.string.T3_Story);
                    button1.setText(R.string.T3_Ans1);
                    button2.setText(R.string.T3_Ans2);
                    mIndex=3;
                }
                else if (mIndex==3)
                { mainText.setText(R.string.T6_End);
                    button1.setVisibility(View.GONE);
                    button2.setVisibility(View.GONE);
                }

            }
        });


        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mIndex==1)
                {
                    mainText.setText(R.string.T2_Story);
                    button1.setText(R.string.T2_Ans1);
                    button2.setText(R.string.T2_Ans2);
                    mIndex=2;
                }
                else if (mIndex==2)
                {mainText.setText(R.string.T4_End);
                    button1.setVisibility(View.GONE);
                    button2.setVisibility(View.GONE);

                }
                else if (mIndex==3)
                {mainText.setText(R.string.T5_End);
                    button1.setVisibility(View.GONE);
                    button2.setVisibility(View.GONE);

                }

            }
        });

    }

}
