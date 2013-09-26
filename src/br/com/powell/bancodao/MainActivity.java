package br.com.powell.bancodao;

import java.util.ArrayList;

import br.com.powell.business.CarroBusiness;
import br.com.powell.model.Carro;
import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
	
	private Button buttonAdicionar;
	private Button buttonMostrar;
	private TextView textCarros;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		buttonAdicionar = (Button) findViewById(R.id.buttonAdicionar);
		buttonMostrar = (Button) findViewById(R.id.buttonMostrar);
		textCarros = (TextView) findViewById(R.id.textViewCarros);
		
		buttonAdicionar.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				try{
					Carro carro = new Carro(1L, "Fusca", "Preto");
					new CarroBusiness(MainActivity.this).adiciona(carro);
				}catch(Exception e){
					e.printStackTrace();
					Log.e("", "Faz alguma coisa aqui! " + e.getMessage());
				}
			}
		});
		
		buttonMostrar.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				try{
					ArrayList<Carro> carros = new CarroBusiness(MainActivity.this).retornaTodosCarros();
					textCarros.setText("Primeiro carro inserido foi um: " + carros.get(0).getDescricao());
				}catch(Exception e){
					e.printStackTrace();
					Log.e("", "Faz alguma coisa aqui! " + e.getMessage());
				}
			}
		});
	}
	
	@Override
	public void onDestroy(){
		super.onDestroy();
		new CarroBusiness(getApplicationContext()).fechaBanco();
	}

}
