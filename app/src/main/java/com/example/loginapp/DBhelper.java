package com.example.loginapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DBhelper extends SQLiteOpenHelper {
    public DBhelper(@Nullable Context context) {
        super(context, "Login.db", null, 1);
    }
    public static final String DBNAME = "Login.db";
    @Override
    public void onCreate(SQLiteDatabase MYDB) {
        MYDB.execSQL("create table Mocho(email TEXT, password TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase MYDB, int i, int i1) {
        MYDB.execSQL("drop table if exists student");
        onCreate(MYDB);
    }
    public Boolean insertData (String username, String password){
        SQLiteDatabase MYDB = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("");
    }
}
