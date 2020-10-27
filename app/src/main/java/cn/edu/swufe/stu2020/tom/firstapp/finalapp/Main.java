package cn.edu.swufe.stu2020.tom.firstapp.finalapp;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.WindowManager;
import androidx.appcompat.app.AppCompatActivity;
import static com.google.android.material.snackbar.BaseTransientBottomBar.handler;
public class Main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(cn.edu.swufe.stu2020.tom.firstapp.R.layout.activity_main2);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        handler.postDelayed(new Runnable){
            public void run(){
                SharedPreferences preferences =getSharedPreferences("welcome",MODE_PRIVATE);
                SharedPreferences.Editor editor=preferences.edit();
                int flag = preferences.getInt("flag",0);
                if(flag == 0){
                    Intent intent = new Intent(Main.this)
                }
            }

        }
    }
}