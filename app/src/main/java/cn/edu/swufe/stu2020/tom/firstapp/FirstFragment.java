package cn.edu.swufe.stu2020.tom.firstapp;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

public class FirstFragment extends Fragment {

    private TextView tvTitle;
    private TextView tvResult;
    private EditText editInput;
    private Button btnC2F;
    private Button btnF2C;


    protected void onCreat(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvTitle = (TextView)findViewById(R.id.tv_title);
        tvResult = (TextView) findViewById(R.id.tv_result);
        editInput = (EditText) findViewById(R.id.value_hint);
        btnC2F = (Button) findViewById(R.id.celsius_to_fahren);
        btnF2C = (Button) findViewById(R.id.fahren_to_celsius);

        btnC2F.setOnClickListener(this);
        btnF2C.setOnClickListener(this);
    }

    public void onClick(View v){
        switch (v.getId()){
            case R.id.celsius_to_fahren:
                outputValue(false);
                break;
            case R.id.fahren_to_celsius:
                outputValue(true);
                break;
            default:
        }
    }

    private boolean checkValidInput(){
        if(editInput.getText().length()==0){
            String errorMsg = getResources().getString(R.string.msg_error_input);
            Toast.makeText((this,errorMsg,Toast.LENGTH_LONG).show();
            return false;
        }else{
            return true;
        }

    }

    private void outputValue(boolean isF2C){
        if(checkValidInput()){
            if(checkValidInput()){
                float inputValue = Float.parseFloat(editInput.getText().toString());
                if(isF2C){
                    String title = getResources().getString(R.string.fahren);
                    title = title + String.valueOf(inputValue);
                    title = title +getResources().getString(R.string.celsius);
                    tvTitle.setText(title);
                    tvResult.setText(String.valueOf(getF2C()));
                }else{
                    String title = getResources().getString(R.string.celsius);
                    title = title + String.valueOf(inputValue);
                    title = title + getResources().getString(R.string.fahren);
                    tvTitle.setText(title);
                    tvResult.setText(String.valueOf(getC2F(inputValue)));
                }

            }
        }
    }
    private float getF2C(float f){
        return ((f-32.0f)/1.8f);
    }
    private float getC2F(float c){
        return (c*1.8f)+32.0f;
    }
    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false);
    }
    public void abc(View v){
        Log.i(tag,msg);//gyfyey
    }
    EditText edit=(EditText)findViewById(R.id.edit_text);
    String inputText=edit.getText().toString();

}