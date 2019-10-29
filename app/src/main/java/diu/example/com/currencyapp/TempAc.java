package diu.example.com.currencyapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class TempAc extends AppCompatActivity {
    Button button0, button1, button2,button3, button4, button5,buttonCon,buttonReset;
    EditText ntext;
    TextView Show;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temp);

        button0 = (Button) findViewById(R.id.F2C);
        button1 = (Button) findViewById(R.id.C2F);
        button2 = (Button) findViewById(R.id.C2K);
        button3 = (Button) findViewById(R.id.K2C);
        button4 = (Button) findViewById(R.id.K2F);
        button5 = (Button) findViewById(R.id.F2K);
        buttonReset = (Button) findViewById(R.id.resetBtn);
        ntext =(EditText) findViewById(R.id.number);
        Show = (TextView) findViewById(R.id.show);

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double bdt=Double.parseDouble(String.valueOf(ntext.getText()));
                Double Amount=((bdt - 32)*5.0/9.0);
                String result1=String.valueOf(Amount);
                Show.setText( result1 +"°c");
            }
        });


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double bdt=Double.parseDouble(String.valueOf(ntext.getText()));
                Double Amount=((bdt * 9.0/5.0)+32);
                String result1=String.valueOf(Amount);
                Show.setText( result1 +"°c");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double bdt=Double.parseDouble(String.valueOf(ntext.getText()));
                Double Amount=(bdt + 273.15);
                String result1=String.valueOf(Amount);
                Show.setText( result1 +"°c");
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double bdt=Double.parseDouble(String.valueOf(ntext.getText()));
                Double Amount=(bdt - 273.15);
                String result1=String.valueOf(Amount);
                Show.setText( result1 +"°c");
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double bdt=Double.parseDouble(String.valueOf(ntext.getText()));
                Double Amount=((bdt - 273.15)*9.0/5.0);
                String result1=String.valueOf(Amount);
                Show.setText( result1 +"°c");
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double bdt=Double.parseDouble(String.valueOf(ntext.getText()));
                Double Amount=((bdt - 32)*9.0/5.0+273.15);
                String result1=String.valueOf(Amount);
                Show.setText( result1 +"°c");
            }
        });

        buttonReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText ntext=(EditText)findViewById(R.id.number);
                ntext.setText("");

                Show = (TextView) findViewById(R.id.show);
                Show.setText("Show The Result");
            }
        });
    }
}
