package abhishek.example.com.matrixcalculator;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button inverseB=(Button)findViewById(R.id.inverseB);
        inverseB.setText(Html.fromHtml("B <sup> -1 </sup>"));

        Button inverseA=(Button)findViewById(R.id.inverseA);
        inverseA.setText(Html.fromHtml("A <sup> -1 </sup>"));

        Button transposeA=(Button)findViewById(R.id.Atranpose);
        transposeA.setText(Html.fromHtml("A <sup> T </sup>"));

        Button transposeB=(Button)findViewById(R.id.Btranspose);
        transposeB.setText(Html.fromHtml("B <sup> T </sup>"));

        Button buttonA = (Button)findViewById(R.id.buttonA);
        buttonA.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, InputA.class);
                startActivity(intent);
            }
        });

        Button buttonB = (Button)findViewById(R.id.buttonB);
        buttonB.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, B_Input.class);
                startActivity(intent);
            }
        });

        Button buttonC = (Button)findViewById(R.id.buttonC);
        buttonC.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, C_Input.class);
                startActivity(intent);
            }
        });

        Button buttonK = (Button)findViewById(R.id.buttonK);
        buttonK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder mBuilder = new AlertDialog.Builder(MainActivity.this);
                View mView = getLayoutInflater().inflate(R.layout.custom_dialog_k,null);

                mBuilder.setView(mView);
                AlertDialog dialog = mBuilder.create();
                dialog.show();
            }
        });
    }

}