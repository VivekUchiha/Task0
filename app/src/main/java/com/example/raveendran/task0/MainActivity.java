package com.example.raveendran.task0;
import java.util.Random;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    static int v = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView total = (TextView)findViewById(R.id.total);
        final TextView sum = (TextView)findViewById(R.id.sum);
        final LinearLayout la = (LinearLayout)findViewById(R.id.las);
    Random r = new Random();
    final int n = r.nextInt(1000);




    total.setText(Integer.toString(n));


     final Button button1 = (Button)findViewById(R.id.add1);
         button1.setOnClickListener(new View.OnClickListener()
    {
        public void onClick(View a) {
            v = v +1;
            if(v>n)
                v-=1;
            if(v==n)
            {la.setBackgroundColor(0xFF00FF00);
            }
            sum.setText(Integer.toString(v));
        }

    });
    Button button2 = (Button) findViewById(R.id.add2);
         button2.setOnClickListener(new View.OnClickListener()
    {
        public void onClick(View a) {
            v = v +2;
            if(v>n)
                v-=2;
            if(v==n)
            {la.setBackgroundColor(0xFF00FF00);
            }
            sum.setText(Integer.toString(v));}

    });
    Button button3 = (Button)findViewById(R.id.add5);
         button3.setOnClickListener(new View.OnClickListener()
    {
        public void onClick(View a) {
            v = v +5;
            if(v>n)
                v-=5;
            if(v==n)
            {la.setBackgroundColor(0xFF00FF00);
            }
            sum.setText(Integer.toString(v));}

    });
    Button button4 = (Button)findViewById(R.id.add10);
         button4.setOnClickListener(new View.OnClickListener()
    {
        public void onClick(View a) {
            v = v +10;
            if(v>n)
                v-=10;
            if(v==n) {la.setBackgroundColor(0xFF00FF00);
            }
            sum.setText(Integer.toString(v));}

    });
        Button resets = (Button)findViewById(R.id.reset);
        resets.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View a) {
                v=0;
                sum.setText(Integer.toString(v));
                la.setBackgroundColor(0xFFFFFFFF);}
                        });

}}
