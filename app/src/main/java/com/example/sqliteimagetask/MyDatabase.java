package com.example.sqliteimagetask;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class MyDatabase extends SQLiteOpenHelper {


    public MyDatabase(Context context, String dbname,
                      SQLiteDatabase.CursorFactory factory, int dbversion) {

        super(context, dbname, factory, dbversion);

    }



    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table tableimage(image blob);");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
