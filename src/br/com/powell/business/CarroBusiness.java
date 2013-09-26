package br.com.powell.business;

import java.util.ArrayList;

import br.com.powell.dao.CarroDAO;
import br.com.powell.model.Carro;
import android.content.Context;
import android.util.Log;

public class CarroBusiness {
	
	private CarroDAO carroDAO;

	public CarroBusiness(Context context) {
		carroDAO = new CarroDAO(context);
	}

	public void adiciona(Carro carro) {
		if(carroDAO.adiciona(carro) > 0){
			Log.d("CarroDao", "Estamos bem!");
		}else{
			Log.e("CarroDao", "Deu zica!");
		}
	}

	public void fechaBanco() {
		carroDAO.fechaBanco();
	}

	public ArrayList<Carro> retornaTodosCarros() {
		return carroDAO.retornaTodosOsCarros();
	}

}
