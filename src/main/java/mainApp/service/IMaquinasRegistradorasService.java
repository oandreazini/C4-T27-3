package mainApp.service;

import java.util.List;


import mainApp.dto.MaquinasRegistradoras;

public interface IMaquinasRegistradorasService {
	
	//Metodos del CRUD
	public List<MaquinasRegistradoras> listMaquinasRegistradoras(); //Listar All 

	public MaquinasRegistradoras saveMaquinasRegistradoras(MaquinasRegistradoras maquinasRegistradoras);	//Guarda un MaquinasRegistradoras CREATE

	public MaquinasRegistradoras maquinasRegistradorasXID(Integer id); //Leer datos de un MaquinasRegistradoras READ

	public MaquinasRegistradoras updateMaquinasRegistradoras(MaquinasRegistradoras maquinasRegistradoras); //Actualiza datos del MaquinasRegistradoras UPDATE

	public void deleteMaquinasRegistradoras(Integer id);// Elimina el MaquinasRegistradoras DELETE

}
