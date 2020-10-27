package cn.edu.swufe.stu2020.tom.firstapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DataBase extends SQLiteOpenHelper {
    private static final int version =1;
    private static final String DB_NAME="myrate.db";
    public static final String TB_NAME="tb_rates";
    private SQLiteDatabase db;
    public DataBase(Context context,String name,SQLiteDatabase.CursorFactory factory,int version){
        super(context,name,factory,version);
    }
    public void onCreate(SQLiteDatabase db){
        db.execSQL("CREATE TABLE RATE(ID INTEGER PRIMARY KEY AUTOINCREMENT,CURNAME TEXT,CURRATE TEXT)");
    }
    public long insert(String table, String nullColumnHack, ContentValues values){
       db.insert(table,nullColumnHack,values);
       return  db.insert(table,nullColumnHack,values);;
    }

    public int update(String table,ContentValues values,String whereClause,String[] whereArgs){
       db.update(table,values,whereClause,whereArgs);
       return db.update(table,values,whereClause,whereArgs);
    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldversion, int newversion) {

    }
}
