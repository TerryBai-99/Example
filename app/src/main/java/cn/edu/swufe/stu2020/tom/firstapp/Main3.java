package cn.edu.swufe.stu2020.tom.firstapp;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.LogRecord;

public class Main3 extends AppCompatActivity  {
    public List<Fruit> fruitList=new ArrayList<>();

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main3);
        initFruits();
        FruitAdapter adapter=new FruitAdapter(Main3.this,R.layout.fruit_item,fruitList);
        ListView listView=findViewById(R.id.list_view);
        listView.setAdapter(adapter);
    }

    private void initFruits() {
        for(int i=0;i<10;i++){
            Fruit a=new Fruit("欧元：7.989880",R.drawable.ic_menu_camera);
            fruitList.add(a);
            Fruit b=new Fruit("美元：6.789800",R.drawable.ic_launcher_background);
            fruitList.add(b);
            Fruit c=new Fruit("韩元：0.005898",R.drawable.ic_launcher_foreground);
            fruitList.add(c);
            Fruit d=new Fruit("D",R.drawable.ic_launcher_background);
            fruitList.add(d);
        }
    }

}
