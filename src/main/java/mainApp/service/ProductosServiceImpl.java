package mainApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mainApp.dao.IProductosDAO;
import mainApp.dto.Productos;

@Service
public class ProductosServiceImpl implements IProductosService{

	// Utilizamos los metodos de la interface ICajerosDAO, es como si instaciaramos.
	@Autowired
	IProductosDAO iProductosDAO;

	@Override
	public List<Productos> listProductos() {

		return iProductosDAO.findAll();
	}

	@Override
	public Productos saveProductos(Productos productos) {
		
		return iProductosDAO.save(productos);
	}

	@Override
	public Productos productosXID(Integer id) {

		return iProductosDAO.findById(id).get();
	}

	@Override
	public Productos updateProductos(Productos productos) {

		return iProductosDAO.save(productos);
	}

	@Override
	public void deleteProductos(Integer id) {
		iProductosDAO.deleteById(id);

	}



}
