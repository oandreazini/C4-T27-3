package mainApp.service;

import java.util.List;

import mainApp.dto.Productos;

public interface IProductosService {

	//Metodos del CRUD
	public List<Productos> listProductos(); //Listar All 

	public Productos saveProductos(Productos productos);	//Guarda un Productos CREATE

	public Productos productosXID(Integer id); //Leer datos de un Productos READ

	public Productos updateProductos(Productos productos); //Actualiza datos del Productos UPDATE

	public void deleteProductos(Integer id);// Elimina el Productos DELETE

}
