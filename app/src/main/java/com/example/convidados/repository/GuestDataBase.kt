package com.example.convidados.repository
//conexão com o banco
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.os.Build.VERSION
import com.example.convidados.constantes.DataBaseConstantes

class GuestDataBase (context: Context) : SQLiteOpenHelper (context, NAME,null, VERSION) {


        companion object{
            private const val NAME = "Gdskm"
            private const val VERSION = 1

        }

    override fun onCreate(db: SQLiteDatabase) {
        db.execSQL("CREATE TABLE "+DataBaseConstantes.GUEST.TABLE_NAME+" (" +
                DataBaseConstantes.GUEST.COLUMNS.ID + " integer primary key autoincrement," +
                DataBaseConstantes.GUEST.COLUMNS.NAME + "text," +
                DataBaseConstantes.GUEST.COLUMNS.PRESENCE + " presence integer);")
    }

    override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {
    }
}
