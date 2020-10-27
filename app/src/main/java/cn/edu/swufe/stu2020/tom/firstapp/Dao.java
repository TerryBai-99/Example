package cn.edu.swufe.stu2020.tom.firstapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

public  class Dao {
    private Context context;
    private SQLiteDatabase db;

    public Dao(Context context){
        this.context=context;
      DataBase dataBase = new DataBase(context,"rate",null,1);
      db=dataBase.getReadableDatabase();
    }
    public long insert(String table, String nullColumnHack, ContentValues values){
        return db.insert(table,nullColumnHack,values);
    }

    public int update(String table,ContentValues values,String whereClause,String[] whereArgs){
        return db.update(table,values,whereClause,whereArgs);
    }

//    public  int delete(String table,String whereClause,Object[] whereArgs);
//    public abstract Cursor query (String query);


}
