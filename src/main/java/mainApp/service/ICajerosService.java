package mainApp.service;

import java.util.List;

import mainApp.dto.Cajeros;


public interface ICajerosService {

	//Metodos del CRUD
	public List<Cajeros> listCajeros(); //Listar All 

	public Cajeros saveCajeros(Cajeros cajeros);	//Guarda un Cajeros CREATE

	public Cajeros cajerosXID(Integer id); //Leer datos de un Cajeros READ

	public Cajeros updateCajeros(Cajeros cajeros); //Actualiza datos del Cajeros UPDATE

	public void deleteCajeros(Integer id);// Elimina el Cajeros DELETE
}
