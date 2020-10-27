package cn.edu.swufe.stu2020.tom.firstapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

public class MainActivity14 extends Activity {
    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);



        ListView listView = ((ListView) findViewById(R.id.list));

        /**

         * 下面的一行代码与可如下两行等价

         * View listEmptyView = View.inflate(this, R.layout.layout_empty, null);

         * ((ViewGroup) listView.getParent()).addView(listEmptyView, -1, -1);

         */

        View listEmptyView = View.inflate(this, R.layout.if_empty, (ViewGroup) listView.getParent());

        listView.setEmptyView(listEmptyView);

    }
    }

