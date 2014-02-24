package br.com.saborcaboclo.openhelper;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class PratosOpenHelper extends SQLiteOpenHelper {

	public static final String NOME_DB = "pratos.db";
	public static final int VERSAO_DB = 1;

	public PratosOpenHelper(Context context) {
		super(context, NOME_DB, null, VERSAO_DB);
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		Log.d("ciro", "OPENHELPER 1");
		String sqlCreate = "CREATE TABLE PRATOS ("
				+ "ID INTEGER NOT NULL,"
				+ "NOME VARCHAR(20) NOT NULL," 
				+ "INGREDIENTES TEXT NOT NULL,"
				+ "RECEITA TEXT NOT NULL,"
				+ "RENDIMENTO VARCHAR(20),"
				+ "DIFICULDADE VARCHAR(20),"
				+ "TMP_PREP VARCHAR(20),"
				+ "CATEGORIA VARCHAR(20),"
				+ "FOTO TEXT,"
				+ "PRIMARY KEY (ID));";

		db.execSQL(sqlCreate);
		Log.d("ciro", "OPENHELPER 2");
		String sqlInsert = "INSERT INTO PRATOS VALUES("
				//ID
				+ "'1',"
				//NOME
				+ "'Receita de Moqueca de Peixe com Pir�o',"
				//INGREDIENTES
				+ "'1kg de peixe (pequenos, pacu, por exemplo) inteiros \n"
				+ "2 colheres (sopa) de coentro picado \n"
				+ "1 cebola m�dia cortada em quartos \n "
				+ "2 colheres de cebolinha verde picada \n"
				+ "2 tomates m�dios sem sementes, cortados \n"
				+ "Sal e pimenta do reino a gosto \n"
				+ "2 colheres (sopa) de suco de lim�o. \n"
				+ "Pir�o: \n"
				+ "1 colher (sopa) de azeite de oliva \n"
				+ "1 cebola pequena bem picada \n"
				+ "1 colher (sopa) de coentro picado \n"
				+ "1 x�cara de farinha de mandioca \n"
				+ "4 x�caras de �gua',"
				//RECEITA
				+ "'Limpe os peixes, lave e deixe escorrer. \n"
				+ "No copo do liquidificador, coloque coentro, cebola, cebolinha, tomates, sal, pimenta do reino e bata at� triturar. \n"
				+ "Coloque os peixes em uma tigela, tempere com suco de lim�o, cubra com a mistura triturada envolvendo bem e deixe descansar por 1 hora. \n "
				+ "Acenda a churrasqueira ou pr� aque�a o forno em temperatura alta (220� C). \n"
				+ "Coloque os peixes em uma folha nova e bem lavada de bananeira, enrole-a sobre os peixes, leve � grelha ou ao forno e asse por cerca de 30 minutos. \n"
				+ "Pir�o: \n"
				+ "Coloque azeite em uma panela, aque�a em fogo alto, junte cebola, deixe dourar, acrescente coentro e misture por cerca de 2 minutos.  \n"
				+ "Dissolva farinha de mandioca na �gua, despeje na panela e cozinhe, mexendo sempre para n�o empelotar, at� obter um pir�o homog�neo e cremoso. \n"
				+ "Tire do fogo e sirva a moqueca acompanhada do pir�o.',"
				//RENDIMENTO
				+ "'04 por��es',"
				//DIFICULDADE
				+ "'f�cil',"
				//TMP_PREP (tempo de preparo)
				+ "'50 min',"
				//CATEGORIA
				+ "'PEIXES',"
				//FOTO
				+ "'1');";
		db.execSQL(sqlInsert);
		Log.d("ciro", "OPENHELPER 3");
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		onCreate(db);

	}

}
