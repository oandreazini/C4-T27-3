package mainApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mainApp.dao.IMaquinasRegistradorasDAO;
import mainApp.dto.MaquinasRegistradoras;

@Service
public class MaquinasRegistradorasServiceImpl implements IMaquinasRegistradorasService {

	// Utilizamos los metodos de la interface ICajerosDAO, es como si instaciaramos.
	@Autowired
	IMaquinasRegistradorasDAO iMaquinasRegistradorasDAO;
	
	@Override
	public List<MaquinasRegistradoras> listMaquinasRegistradoras() {
		
		return iMaquinasRegistradorasDAO.findAll();
	}

	@Override
	public MaquinasRegistradoras saveMaquinasRegistradoras(MaquinasRegistradoras maquinasRegistradoras) {
		
		return iMaquinasRegistradorasDAO.save(maquinasRegistradoras);
	}

	@Override
	public MaquinasRegistradoras maquinasRegistradorasXID(Integer id) {
		
		return iMaquinasRegistradorasDAO.findById(id).get();
	}

	@Override
	public MaquinasRegistradoras updateMaquinasRegistradoras(MaquinasRegistradoras maquinasRegistradoras) {
		
		return  iMaquinasRegistradorasDAO.save(maquinasRegistradoras);
	}

	@Override
	public void deleteMaquinasRegistradoras(Integer id) {
		iMaquinasRegistradorasDAO.deleteById(id);
		
	}

}
