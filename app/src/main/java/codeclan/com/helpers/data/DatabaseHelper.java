package codeclan.com.helpers.data;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by yanren on 23/11/2017.
 */

public class DatabaseHelper extends SQLiteOpenHelper {
    public static final String DATABASE_NAME = "Tasks.db";
    public static final String TABLE_NAME = "Tasks_table";
    public static final String COL_1 = "ID";
    public static final String COL_2 = "STARTING_TIME";
    public static final String COL_3 = "FINISHING-TIME";
    public static final String COL_4 = "TASK_DESCRIPTION";



    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, 2);

    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table " + TABLE_NAME
                + "(ID INTEGER PRIMARY KEY AUTOINCREMENT, STARTING_TIME INTEGER, FINISHING_TIME INTEGER, TASK_DESCRIPTION TEXT )");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);
    }

    public boolean insertData(String startingTime, String finishingTime, String taskDescription){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_2, startingTime);
        contentValues.put(COL_3, finishingTime);
        contentValues.put(COL_4, taskDescription);
        long result = db.insert(TABLE_NAME, null, contentValues);
        if(result == -1)
            return false;
        else
            return true;
    }

    public Cursor getAllData() {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor res = db.rawQuery("select * from " + TABLE_NAME, null);
        return res;
    }

    public boolean updateData(String id, String startingTime, String finishingTime, String taskDescription) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_1, id);
        contentValues.put(COL_2, startingTime);
        contentValues.put(COL_3, finishingTime);
        contentValues.put(COL_4, taskDescription);
        db.update(TABLE_NAME, contentValues, "ID = ?", new String[] {id});
        return true;
    }

    public Integer deleteData(String id) {
        SQLiteDatabase db = this.getWritableDatabase();
        return db.delete(TABLE_NAME, "ID = ?", new String[] {id});
    }
}

