package br.com.powell.bancodao;

import br.com.powell.business.CarroBusiness;
import br.com.powell.model.Carro;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {
	
	private Button buttonAdicionar;
	private Button buttonMostrar;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		buttonAdicionar = (Button) findViewById(R.id.buttonAdicionar);
		buttonMostrar = (Button) findViewById(R.id.buttonMostrar);
		
		buttonAdicionar.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Carro carro = new Carro(1L, "Fusca", "Preto");
				new CarroBusiness(MainActivity.this).adiciona(carro);
			}
		});
	}
	
	@Override
	public void onDestroy(){
		super.onDestroy();
		new CarroBusiness(getApplicationContext()).fechaBanco();
	}

}
