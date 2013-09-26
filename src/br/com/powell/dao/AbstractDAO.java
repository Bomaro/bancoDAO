package br.com.powell.dao;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import br.com.powell.db.DBHelper;

public class AbstractDAO {

	private SQLiteOpenHelper dbHelper;

	public AbstractDAO(Context context) {
		dbHelper = new DBHelper(context);
	}

	public void fechaCursor(Cursor cursor) {
		if (!cursor.isClosed()) {
			cursor.close();
		}
	}

	public SQLiteDatabase retornaBancoParaEscrita() {
		return dbHelper.getWritableDatabase();
	}

	public SQLiteDatabase retornaBancoParaLeitura() {
		return dbHelper.getReadableDatabase();
	}

	public void fechaBanco() {
		if (dbHelper.getWritableDatabase().isOpen()) {
			dbHelper.close();
		}
	}

}
