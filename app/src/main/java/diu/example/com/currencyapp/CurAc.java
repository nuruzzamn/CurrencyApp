package diu.example.com.currencyapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class CurAc extends AppCompatActivity {

    public void resetClick(View view){

        EditText resetNumber=(EditText)findViewById(R.id.numberId);
        resetNumber.setText("");

        TextView set1=(TextView)findViewById(R.id.show03);
        set1.setText("");

        TextView set2=(TextView)findViewById(R.id.show1);
        set2.setText("");

        TextView set3=(TextView)findViewById(R.id.show2);
        set3.setText("");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cur);

        EditText num1=(EditText) findViewById(R.id.numberId);
        Button btn=(Button) findViewById(R.id.convert);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText num1=(EditText) findViewById(R.id.numberId);

                if(num1.getText().toString().isEmpty())
                {
                    Toast.makeText(CurAc.this,"Please Enter A Amount",Toast.LENGTH_SHORT).show();
                }

                else
                {
                    Double bdt=Double.parseDouble(String.valueOf(num1.getText()));
                    Double dollarAmount=bdt*0.012;
                    String result1=String.valueOf(dollarAmount);
                    TextView set1=(TextView)findViewById(R.id.show1);
                    set1.setText("  $ "+result1);

                    Double canAmount=bdt*0.0095;
                    String result2=String.valueOf(canAmount);
                    TextView set2=(TextView)findViewById(R.id.show2);
                    set2.setText("  $ "+result2);

                    Double irAmount=bdt*0.010;
                    String result3=String.valueOf(irAmount);
                    TextView set3=(TextView)findViewById(R.id.show03);
                    set3.setText("  ₹ "+result3);
                }
            }
        });
    }
}
