package br.com.powell.utils;

public class ConstantsUtils {
	
	public static final String TABELA_CARRO = "carro";
	public static final String CARRO_ID = "id";
	public static final String CARRO_DESCRICAO = "descricao";
	public static final String CARRO_COR = "cor";
	public static final String CRIA_TABELA_CARRO = "CREATE TABLE " + TABELA_CARRO + " (" + CARRO_ID +
			" INTEGER PRIMARY KEY, " + CARRO_DESCRICAO + " TEXT, " + CARRO_COR + " TEXT)";

}
