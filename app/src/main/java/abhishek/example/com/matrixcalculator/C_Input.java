package abhishek.example.com.matrixcalculator;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class C_Input extends AppCompatActivity {

    int count=1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c__input);

        final LinearLayout l1 = (LinearLayout) findViewById(R.id.layout_18);
        l1.setWeightSum(count);
        Button plusbtn = (Button) findViewById(R.id.plus4);
        Button minusbtn = (Button) findViewById(R.id.minus4);
        Button mxn = (Button) findViewById(R.id.size4);
        final Button sizebuttontext = (Button) findViewById(R.id.size4);
        plusbtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                l1.removeAllViews();
                count++;
                for (int i = 0; i < count; i++) {
                    LinearLayout l = new LinearLayout(C_Input.this);
                    //l.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT, 1f));
                    l1.addView(l);
                    l.setWeightSum(count);

                    for (int j = 0; j < count; j++) {
                        Button newcreatebtn = new Button(C_Input.this);
                        newcreatebtn.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT, 1f));
                        newcreatebtn.setText("i");
                        l.addView(newcreatebtn);
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

                    LinearLayout l = new LinearLayout(C_Input.this);
                    //l.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT, 1f));
                    l1.addView(l);
                    l.setWeightSum(count);

                    for (int j = count; j > 0; j--) {
                        Button newcreatebtn = new Button(C_Input.this);
                        newcreatebtn.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT, 1f));
                        newcreatebtn.setText("0");
                        l.addView(newcreatebtn);
                    }
                }
                sizebuttontext.setText(""+count+" X "+count);
            }

        });

        mxn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                AlertDialog.Builder mBuilder = new AlertDialog.Builder(C_Input.this);
                View mView = getLayoutInflater().inflate(R.layout.custom_dialog,null);

                mBuilder.setView(mView);
                AlertDialog dialog = mBuilder.create();
                dialog.show();
            }
        });
    }

}
