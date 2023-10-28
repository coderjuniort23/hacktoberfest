package com.bibo.tictactoe;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,reset;
   TextView forx,for0;
    String b1,b2,b3,b4,b5,b6,b7,b8,b9;
    int count=0,countx=0,county=0;
    int flag=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       init();
    }
    private void init(){
        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        btn3=findViewById(R.id.btn3);
        btn4=findViewById(R.id.btn4);
        btn5=findViewById(R.id.btn5);
        btn6=findViewById(R.id.btn6);
        btn7=findViewById(R.id.btn7);
        btn8=findViewById(R.id.btn8);
        btn9=findViewById(R.id.btn9);
        forx=findViewById(R.id.forx);
        for0=findViewById(R.id.for0);
        reset=findViewById(R.id.reset);



    }

    public void Check(View view){
        Button btncurrent= (Button) view;
        if(btncurrent.getText().toString()== "") {
            count++;
            if (flag == 0) {
                btncurrent.setText("X");
                flag = 1;
            } else {
                btncurrent.setText("0");
                flag = 0;
            }

            if (count > 4) {
                b1 = btn1.getText().toString();
                b2 = btn2.getText().toString();
                b3 = btn3.getText().toString();
                b4 = btn4.getText().toString();
                b5 = btn5.getText().toString();
                b6 = btn6.getText().toString();
                b7 = btn7.getText().toString();
                b8 = btn8.getText().toString();
                b9 = btn9.getText().toString();


                if (b1.equals(b2) && b2.equals(b3) && !b1.equals("")) {
                    //1
                    Toast.makeText(this, "Winner is " + b1, Toast.LENGTH_SHORT).show();
                      countwinners(b1);
                    reset();

                } else if (b4.equals(b5) && b5.equals(b6) && !b5.equals("")) {
                    //2
                    Toast.makeText(this, "Winner is " + b4, Toast.LENGTH_SHORT).show();
                    countwinners(b4);
                    reset();
                } else if (b7.equals(b8) && b8.equals(b9) && !b7.equals("")) {
                    Toast.makeText(this, "Winner is " + b7, Toast.LENGTH_SHORT).show();
                    countwinners(b7);
                    //3
                    reset();
                } else if (b1.equals(b4) && b4.equals(b7) && !b7.equals("")) {
                    //4
                    Toast.makeText(this, "Winner is" + b1, Toast.LENGTH_SHORT).show();
                    countwinners(b1);
                    reset();
                } else if (b2.equals(b5) && b5.equals(b8) && !b8.equals("")) {
                    //5
                    Toast.makeText(this, "Winner is " + b2, Toast.LENGTH_SHORT).show();
                    countwinners(b2);
                    reset();
                } else if (b3.equals(b6) && b6.equals(b9) && !b9.equals("")) {
                    //6
                    Toast.makeText(this, "Winner is " + b3, Toast.LENGTH_SHORT).show();
                    countwinners(b3);
                    reset();
                } else if (b1.equals(b5) && b5.equals(b9) && !b5.equals("")) {
                    //7
                    Toast.makeText(this, "Winner is " + b1, Toast.LENGTH_SHORT).show();
                    countwinners(b1);
                    reset();
                } else if (b3.equals(b5) && b5.equals(b7) && !b5.equals("")) {
                    //8
                    Toast.makeText(this, "Winner is " + b3, Toast.LENGTH_SHORT).show();
                    countwinners(b3);
                    reset();
                } else if (count==9) {
                    reset();
                }

            }
        }



    }
    public void resetGame(View view) {
        btn1.setText("");
        btn2.setText("");
        btn3.setText("");
        btn4.setText("");
        btn5.setText("");
        btn6.setText("");
        btn7.setText("");
        btn8.setText("");
        btn9.setText("");
        count = 0;
        flag = 0;
        Toast.makeText(this,"Resetted",Toast.LENGTH_SHORT).show();

    }
    public  void reset(){
        btn1.setText("");
        btn2.setText("");
        btn3.setText("");
        btn4.setText("");
        btn5.setText("");
        btn6.setText("");
        btn7.setText("");
        btn8.setText("");
        btn9.setText("");
        count=0;
        flag=0;
    }

    public void countwinners(String a){
        if(a.equals("X")){
            countx++;
            forx.setText("X- "+countx);
        }else {
            county++;
            for0.setText("Zero-"+county);
        }
    }






}