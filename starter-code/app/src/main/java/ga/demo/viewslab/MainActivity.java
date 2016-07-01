package ga.demo.viewslab;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button mButton1, mButton2, mButton3, mButton4, mButton5, mButton6, mButton7, mButton8, mButton9, mButton10;
    TextView mTextView1, mTextView2, mTextView3, mTextView4, mTextView5, mTextView6, mTextView7, mTextView8;
    TextView mTextView9, mTextView10, mTextView11, mTextView12, mTextView13, mTextView14, mTextView15;
    TextView mTextView16, mTextView17, mTextView18, mTextView19, mTextView20;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mButton1 = (Button) findViewById(R.id.button_1);
        mButton2 = (Button) findViewById(R.id.button_2);
        mButton3 = (Button) findViewById(R.id.button_3);
        mButton4 = (Button) findViewById(R.id.button_4);
        mButton5 = (Button) findViewById(R.id.button_5);
        mButton6 = (Button) findViewById(R.id.button_6);
        mButton7 = (Button) findViewById(R.id.button_7);
        mButton8 = (Button) findViewById(R.id.button_8);
        mButton9 = (Button) findViewById(R.id.button_9);
        mButton10 = (Button) findViewById(R.id.button_10);
        mTextView1 = (TextView) findViewById(R.id.textview_1);
        mTextView2 = (TextView) findViewById(R.id.textview_2);
        mTextView3 = (TextView) findViewById(R.id.textview_3);
        mTextView4 = (TextView) findViewById(R.id.textview_4);
        mTextView5 = (TextView) findViewById(R.id.textview_5);
        mTextView6 = (TextView) findViewById(R.id.textview_6);
        mTextView7 = (TextView) findViewById(R.id.textview_7);
        mTextView8 = (TextView) findViewById(R.id.textview_8);
        mTextView9 = (TextView) findViewById(R.id.textview_9);
        mTextView10 = (TextView) findViewById(R.id.textview_10);
        mTextView11 = (TextView) findViewById(R.id.textview_11);
        mTextView12 = (TextView) findViewById(R.id.textview_12);
        mTextView13 = (TextView) findViewById(R.id.textview_13);
        mTextView14 = (TextView) findViewById(R.id.textview_14);
        mTextView15 = (TextView) findViewById(R.id.textview_15);
        mTextView16 = (TextView) findViewById(R.id.textview_16);
        mTextView17 = (TextView) findViewById(R.id.textview_17);
        mTextView18 = (TextView) findViewById(R.id.textview_18);
        mTextView19 = (TextView) findViewById(R.id.textview_19);
        mTextView20 = (TextView) findViewById(R.id.textview_20);

        View.OnClickListener buttonClick = new View.OnClickListener() {


            @Override
            public void onClick(View view) {

                switch (view.getId()) {
                    case R.id.button_1:
                        Toast.makeText(view.getContext(), "You clicked 1 and 2!", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.button_2:
                        Toast.makeText(view.getContext(), "You clicked 3 and 4!", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.button_3:
                        Toast.makeText(view.getContext(), "You clicked 5 and 6!", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.button_4:
                        Toast.makeText(view.getContext(), "You clicked 7 and 8!", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.button_5:
                        Toast.makeText(view.getContext(), "You clicked 9 and 10!", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.button_6:
                        Toast.makeText(view.getContext(), "You clicked 11 and 12!", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.button_7:
                        Toast.makeText(view.getContext(), "You clicked 13 and 14!", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.button_8:
                        Toast.makeText(view.getContext(), "You clicked 15 and 16!", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.button_9:
                        Toast.makeText(view.getContext(), "You clicked 17 and 18!", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.button_10:
                        Toast.makeText(view.getContext(), "You clicked 19 and 20!", Toast.LENGTH_SHORT).show();
                        break;
                    default:
                        Toast.makeText(view.getContext(), "nope", Toast.LENGTH_SHORT).show();
                }
            }

        };
        mButton1.setOnClickListener(buttonClick);
        mButton2.setOnClickListener(buttonClick);
        mButton3.setOnClickListener(buttonClick);
        mButton4.setOnClickListener(buttonClick);
        mButton5.setOnClickListener(buttonClick);
        mButton6.setOnClickListener(buttonClick);
        mButton7.setOnClickListener(buttonClick);
        mButton8.setOnClickListener(buttonClick);
        mButton9.setOnClickListener(buttonClick);
        mButton10.setOnClickListener(buttonClick);
    }


}
