package cn.edu.swufe.stu2020.tom.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class change extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change);
        //final EditText editText_key = (EditText)findViewById(R.id.editText_key);
        //SharedPreferences sp =getPreferences("rate",MODE_PRIVATE);
    }

    public void onClick(View v){
        EditText editTextrmb = (EditText)findViewById(R.id.rmb);
        EditText editTextdollar = (EditText)findViewById(R.id.dollar);
        double rmb=0;
        double dollar;
        double rate=9;
        String a;
        String s;
        String b;
        if(v.getId()==R.id.change){
            a=editTextrmb.getText().toString();
            if("".equals(a)){
                rmb = 0;
            }
            else {
                rmb = Double.parseDouble(a);

            }
            if(rate==0){
                Toast.makeText(change.this,"汇率有误",Toast.LENGTH_SHORT).show();

            }
            else{
                dollar=rmb/rate;
                editTextdollar.setText(dollar+"");
            }
        }
        else {
            a=editTextdollar.getText().toString();
            if("".equals(a)){
                dollar=0;
            }
            else{
                dollar = Double.parseDouble(a);
            }
            if(rate==0){
                Toast.makeText(change.this,"输入有误",Toast.LENGTH_SHORT).show();

            }
            else{
                rmb=dollar*rate;
                editTextrmb.setText(rmb+"");

            }
        }
    }
}