package cn.edu.swufe.stu2020.tom.firstapp;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class MyBaseAdapter extends BaseAdapter {
    List<Data> list;
    Context context;

    public MyBaseAdapter(List<Data> list,Context context){
        this.list=list;
        this.context=context;
    }
    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = View.inflate(context,R.layout.content_main,null);
        Data nowData = list.get(position);
        ImageView imageView = convertView.findViewById(R.id.img);
        TextView title = convertView.findViewById(R.id.title);
        TextView content = convertView.findViewById(R.id.content);
        imageView.setBackgroundResource(nowData.getImage());
        title.setText(""+nowData.getTitle());
        content.setText(""+nowData.getContent());
        return convertView;
    }

}
