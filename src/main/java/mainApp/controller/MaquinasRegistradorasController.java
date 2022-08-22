package mainApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mainApp.dto.MaquinasRegistradoras;
import mainApp.service.MaquinasRegistradorasServiceImpl;

@RestController
@RequestMapping("/api")
public class MaquinasRegistradorasController {

	@Autowired
	MaquinasRegistradorasServiceImpl maquinasRegistradorasServiceImpl;

	@GetMapping("/maquinasRegistradoras")
	public List<MaquinasRegistradoras> listMaquinasRegistradoras() {
		return maquinasRegistradorasServiceImpl.listMaquinasRegistradoras();
	}

	@PostMapping("/maquinasRegistradoras")
	public MaquinasRegistradoras saveMaquinasRegistradoras(@RequestBody MaquinasRegistradoras maquinasRegistradoras) {

		return maquinasRegistradorasServiceImpl.saveMaquinasRegistradoras(maquinasRegistradoras);
	}

	@GetMapping("/maquinasRegistradoras/{id}")
	public MaquinasRegistradoras maquinasRegistradorasXID(@PathVariable(name = "id") Integer id) {

		return maquinasRegistradorasServiceImpl.maquinasRegistradorasXID(id);

	}

	@PutMapping("/maquinasRegistradoras/{id}")
	public MaquinasRegistradoras updateMaquinasRegistradoras(@PathVariable(name = "id") Integer id, @RequestBody MaquinasRegistradoras maquinasRegistradoras) {

		MaquinasRegistradoras maquinasRegistradoras_select;
		MaquinasRegistradoras maquinasRegistradoras_update;

		maquinasRegistradoras_select = maquinasRegistradorasServiceImpl.maquinasRegistradorasXID(id);

		maquinasRegistradoras_select.setPiso(maquinasRegistradoras.getPiso());
		maquinasRegistradoras_select.setVentas(maquinasRegistradoras.getVentas());

		maquinasRegistradoras_update = maquinasRegistradorasServiceImpl.updateMaquinasRegistradoras(maquinasRegistradoras_select);

		System.out.println("El maquinasRegistradoras actualizado es: " + maquinasRegistradoras_update);

		return maquinasRegistradoras_update;
	}

	@DeleteMapping("/maquinasRegistradoras/{id}")
	public void deleteMaquinasRegistradoras(@PathVariable(name = "id") Integer id) {
		maquinasRegistradorasServiceImpl.deleteMaquinasRegistradoras(id);
	}

}
