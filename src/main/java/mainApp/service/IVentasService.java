package mainApp.service;

import java.util.List;

import mainApp.dto.Ventas;

public interface IVentasService {

	//Metodos del CRUD
	public List<Ventas> listVentas(); //Listar All 

	public Ventas saveVentas(Ventas ventas);	//Guarda un Ventas CREATE

	public Ventas ventasXID(Integer id); //Leer datos de un Ventas READ

	public Ventas updateVentas(Ventas ventas); //Actualiza datos del Ventas UPDATE

	public void deleteVentas(Integer id);// Elimina el Ventas DELETE

}
