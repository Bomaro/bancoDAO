package br.com.powell.db;

import br.com.powell.utils.ConstantsUtils;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHelper extends SQLiteOpenHelper{

	private static String name = "carro.db";
	private static int version = 1;

	public DBHelper(Context context) {
		super(context, name , null, version );
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		db.execSQL(ConstantsUtils.CRIA_TABELA_CARRO);
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO Auto-generated method stub
		
	}

}
