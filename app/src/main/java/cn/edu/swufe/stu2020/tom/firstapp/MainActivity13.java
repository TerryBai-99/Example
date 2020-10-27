package cn.edu.swufe.stu2020.tom.firstapp;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity13 extends AppCompatActivity {
    @SuppressLint("MissingSuperCall")
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ListView listView = this.findViewById(R.id.list_view);
        List<Data> list =new ArrayList<>();
        int[] images = {R.drawable.ic_launcher_background};
        String titleText = "标题";
        String contentText = "内容";
        for(int i =0;i<20;i++){
            Data data = new Data(images[0],titleText+i,contentText+i);
            list.add(data);
        }
        MyBaseAdapter myBaseAdapter =new MyBaseAdapter(list,this);
        listView.setAdapter(myBaseAdapter);

    }
}
