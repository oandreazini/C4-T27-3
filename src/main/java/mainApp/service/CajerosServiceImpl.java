package mainApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mainApp.dao.ICajerosDAO;
import mainApp.dto.Cajeros;

@Service
public class CajerosServiceImpl implements ICajerosService{

	// Utilizamos los metodos de la interface ICajerosDAO, es como si instaciaramos.
	@Autowired
	ICajerosDAO iCajerosDAO;
	
	@Override
	public List<Cajeros> listCajeros() {
		
		return iCajerosDAO.findAll();
	}

	@Override
	public Cajeros saveCajeros(Cajeros cajeros) {
		
		return iCajerosDAO.save(cajeros);
	}

	@Override
	public Cajeros cajerosXID(Integer id) {
	
		return iCajerosDAO.findById(id).get();
	}

	@Override
	public Cajeros updateCajeros(Cajeros cajeros) {
		
		return  iCajerosDAO.save(cajeros);
	}

	@Override
	public void deleteCajeros(Integer id) {
		iCajerosDAO.deleteById(id);

	}

}
