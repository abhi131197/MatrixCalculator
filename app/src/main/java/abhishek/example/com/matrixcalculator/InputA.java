package abhishek.example.com.matrixcalculator;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

public class InputA extends AppCompatActivity {

    int count = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input2);

        final LinearLayout l1 = (LinearLayout) findViewById(R.id.layout_11);
        l1.setWeightSum(count);
        Button plusbtn = (Button) findViewById(R.id.plus);
        Button minusbtn = (Button) findViewById(R.id.minus);
        Button mxn = (Button)findViewById(R.id.size);
        final Button sizebuttontext = (Button) findViewById(R.id.size);
        plusbtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                l1.removeAllViews();
                count++;
                for (int i = 0; i < count; i++) {
                    LinearLayout l = new LinearLayout(InputA.this);
                    //l.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT, 1f));
                    l1.addView(l);
                    l.setWeightSum(count);

                    for (int j = 0; j < count; j++) {
                        EditText newedit = new EditText(InputA.this);
                        newedit.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT, 1f));
                        newedit.setText("0");
                        l.addView(newedit);
                    }
                }
                sizebuttontext.setText(""+count+" X "+count);
            }

        });

        minusbtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                count--;
                l1.removeAllViews();
                for (int i = count; i > 0; i--) {

                    LinearLayout l = new LinearLayout(InputA.this);
                    //l.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT, 1f));
                    l1.addView(l);
                    l.setWeightSum(count);

                    for (int j = count; j > 0; j--) {
                        Button newcreatebtn = new Button(InputA.this);
                        newcreatebtn.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT, 1f));
                        newcreatebtn.setText("i");
                        l.addView(newcreatebtn);
                    }
                }
                sizebuttontext.setText(""+count+" X "+count);
            }

        });

        mxn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                AlertDialog.Builder mBuilder = new AlertDialog.Builder(InputA.this);
                View mView = getLayoutInflater().inflate(R.layout.custom_dialog,null);

                mBuilder.setView(mView);
                AlertDialog dialog = mBuilder.create();
                dialog.show();
            }
        });
    }
}









