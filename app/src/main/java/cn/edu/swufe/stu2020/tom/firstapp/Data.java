package cn.edu.swufe.stu2020.tom.firstapp;

import android.app.Activity;

public class Data extends Activity {
    private int image;
    private String title;
    private String content;

    public Data(int image,String title,String content){
        this.image = image;
        this.content = content;
        this.title = title;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getContent() {
        return content;
    }
}
