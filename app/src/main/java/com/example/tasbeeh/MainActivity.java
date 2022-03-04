package com.example.tasbeeh;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView tv,tv1;
    int n=0;
    int t=0;
    int count=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv=(TextView) this.findViewById(R.id.textView);
        tv1=(TextView) this.findViewById(R.id.textView2);

    }

    public void Onclick(View view) {
        if (n == 0){
            n=1;
            tv.setText("Subhan Allah");
            t=0;
            tv1.setText(Integer.toString(t));
    }
        else{
            Toast to = Toast.makeText(this, " kindly Complete first tasbeeh select other or reset previous", Toast.LENGTH_LONG);
            to.getView().setBackgroundColor(Color.BLACK);
            to.show();

        }


    }

    public void btn2(View view)
    {
        if (n == 0){
     n=2;
        tv.setText("1st Kalma");
        t=0;
        tv1.setText(Integer.toString(t));
    }
        else
        {
            Toast to = Toast.makeText(this, " kindly Complete first tasbeeh select other or reset previous", Toast.LENGTH_LONG);
            to.getView().setBackgroundColor(Color.BLACK);
            to.show();

        }

    }
    public void btn3(View view)
        {
            if (n == 0)
            { n=3;
        tv.setText("Astaghfar");
        t=0;
        tv1.setText(Integer.toString(t));

    }
            else
            {
                Toast to = Toast.makeText(this, " kindly Complete first tasbeeh select other or reset previous", Toast.LENGTH_LONG);
                to.getView().setBackgroundColor(Color.BLACK);
                to.show();
            }


        }
    public void btn4(View view)
    {
        if (n == 0)
    { n=4;
        tv.setText("Darood");
        t=0;
        tv1.setText(Integer.toString(t));
    }
        else
        {
            Toast to = Toast.makeText(this, " kindly Complete first tasbeeh select other or reset previous", Toast.LENGTH_LONG);
            to.getView().setBackgroundColor(Color.BLACK);
            to.show();
        }


    }
    public void btn5(View view)
    {
        if (n == 0)

    { n=5;
        tv.setText("Ayat Kareema");
        t=0;
        tv1.setText(Integer.toString(t));
    }
        else
        {
            Toast to = Toast.makeText(this, " kindly Complete first tasbeeh select other or reset previous", Toast.LENGTH_LONG);
            to.getView().setBackgroundColor(Color.BLACK);
            to.show();
        }

    }

    public void btn6(View view)

    { n=6;
        tv.setText("Select Tasbeeh");
        n=0;
        t=0;
        tv1.setText(Integer.toString(t));
    }


    public void count(View view) {

        switch(n)
        {
            case 1:
            {
                if(count==0&&t<33)
                {
                    t++;
                    tv1.setText(Integer.toString(t));
                }
                else if(count==0&&t>=33)
                {
                    tv.setText(" ALLHMDULLILAH");
                    count++;
                    t=0;
                    tv1.setText(Integer.toString(t));
                }
                else if(count==1&&t<33)
                {
                    t++;
                    tv1.setText(Integer.toString(t));
                }
                else if(count==1&&t>=33)
                {
                    tv.setText("Allah o Akbar");
                    count++;
                    t=0;
                    tv1.setText(Integer.toString(t));
                }
                else if(count==2&&t<34)
                {
                    t++;
                    tv1.setText(Integer.toString(t));
                }
                else
                {
                    Toast to = Toast.makeText(this, "Tasbeeh finished", Toast.LENGTH_LONG);
                    to.getView().setBackgroundColor(Color.BLACK);
                    to.show();
                    tv.setText("Select Tasbeeh");
                    n=0;
                    t=0;
                    tv1.setText(Integer.toString(t));
                }
                break;
            }
            case 2:
            {
                t+=1;
                if(t<=100)
                {
                    tv1.setText(Integer.toString(t));
                }
                else
                {
                    Toast to=Toast.makeText(this,"Tasbeeh finished",Toast.LENGTH_LONG);
                    to.getView().setBackgroundColor(Color.BLACK);
                    to.show();
                    tv.setText("Select Tasbeeh");
                    n=0;
                    t=0;
                    tv1.setText(Integer.toString(t));
                }
                break;
            }
            case 3:
            {
                t+=1;
                if(t<=100) {
                    tv1.setText(Integer.toString(t));
                }
                else {
                    Toast to = Toast.makeText(this, "Tasbeeh finished", Toast.LENGTH_LONG);
                    to.getView().setBackgroundColor(Color.BLACK);

                    to.show();
                    tv.setText("Select Tasbeeh");
                    n=0;
                    t=0;
                    tv1.setText(Integer.toString(t));
                }
                break;
            }
            case 4:
            {
                t+=1;
                if(t<=100)
                {
                    tv1.setText(Integer.toString(t));
                }
                else {
                    Toast to = Toast.makeText(this, "Tasbeeh finished", Toast.LENGTH_LONG);
                    to.getView().setBackgroundColor(Color.BLACK);
                    to.show();
                    tv.setText("Select Tasbeeh");
                    n=0;
                    t=0;
                    tv1.setText(Integer.toString(t));
                }
                break;
            }
            case 5:






                {
                t+=1;
                if(t<=100)
                {
                    tv1.setText(Integer.toString(t));
                }
                else {
                    Toast to = Toast.makeText(this, "Tasbeeh finished", Toast.LENGTH_LONG);
                    to.getView().setBackgroundColor(Color.BLACK);
                    to.show();
                    tv.setText("Select Tasbeeh");
                    n=0;
                    t=0;
                    tv1.setText(Integer.toString(t));
                }
                break;
            }
        }

    }
}