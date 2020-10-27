package cn.edu.swufe.stu2020.tom.firstapp;

//import android.content.Intent;
//import android.os.Bundle;
//import android.os.Handler;
//import android.os.Message;
//import android.util.Log;
//import android.view.View;
//import android.view.Menu;
//import android.widget.Button;
//import android.widget.Toast;
//
//import com.google.android.material.floatingactionbutton.FloatingActionButton;
//import com.google.android.material.snackbar.Snackbar;
//import com.google.android.material.navigation.NavigationView;
//
//import androidx.navigation.NavController;
//import androidx.navigation.Navigation;
//import androidx.navigation.ui.AppBarConfiguration;
//import androidx.navigation.ui.NavigationUI;
//import androidx.drawerlayout.widget.DrawerLayout;
//import androidx.appcompat.app.AppCompatActivity;
//import androidx.appcompat.widget.Toolbar;
//
//public class huilv2 extends AppCompatActivity {
//
//    private AppBarConfiguration mAppBarConfiguration;
//
//
//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.huilv2, menu);
//        return true;
//    }
//
//    @Override
//    public boolean onSupportNavigateUp() {
//        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
//        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
//                || super.onSupportNavigateUp();
//    }
//    protected void onCreat(Bundle savedInstanceState){
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_huilv2);
//        Button btn_change = findViewById(R.id.button3);
//        Button btn_begin = findViewById(R.id.button4);
//        Button btn_exit = findViewById(R.id.button5);
//        btn_change.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent=new Intent(huilv2.this,change.class);
//                startActivity(intent);
//            }
//        });
//
//    }
//    public void open(View btn){
//        Intent second = new Intent();
//
//    }
//    public void dollar(View btn){
//
//
//    }
//    private static final String TAG = "abcd";
//    Handler handler = new Handler(){
//        public void handleMessage(Message msg){
//            if(msg.what==5){
//                String str=(String) msg.obj;
//                Log.i(TAG,"handleMessage:getMessage msg =" + str);
//                // show.setText(str);
//            }
//            super.handleMessage(msg);
//        }
//    };
//    protected void onCreate(Bundle savedInstanceState){
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.main3);
//
//    }
//
//
//    public void run() {
//        Thread t = new Thread((Runnable) this);
//        t.start();
//        Log.i(TAG,"run:");
//        Message msg = handler.obtainMessage(5);
//        msg.obj = "Hello from run()";
//        handler.sendMessage(msg);
//
//    }
//}
