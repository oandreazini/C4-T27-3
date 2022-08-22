package mainApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mainApp.dao.IVentasDAO;
import mainApp.dto.Ventas;

@Service
public class VentasServiceImpl implements IVentasService {

	// Utilizamos los metodos de la interface IVentasDAO, es como si instaciaramos.
	@Autowired
	IVentasDAO iVentasDAO;
	
	@Override
	public List<Ventas> listVentas() {
		
		return iVentasDAO.findAll();
	}

	@Override
	public Ventas saveVentas(Ventas ventas) {
		
		return iVentasDAO.save(ventas);
	}

	@Override
	public Ventas ventasXID(Integer id) {
	
		return iVentasDAO.findById(id).get();
	}

	@Override
	public Ventas updateVentas(Ventas ventas) {
		
		return iVentasDAO.save(ventas);
	}

	@Override
	public void deleteVentas(Integer id) {
		iVentasDAO.deleteById(id);

	}

}
