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

import mainApp.dto.Cajeros;
import mainApp.service.CajerosServiceImpl;


@RestController
@RequestMapping("/api")
public class CajerosController {

	@Autowired
	CajerosServiceImpl cajerosServiceImpl;

	@GetMapping("/cajeros")
	public List<Cajeros> listCajeros() {
		return cajerosServiceImpl.listCajeros();
	}

	@PostMapping("/cajeros")
	public Cajeros saveCajeros(@RequestBody Cajeros cajeros) {

		return cajerosServiceImpl.saveCajeros(cajeros);
	}

	@GetMapping("/cajeros/{id}")
	public Cajeros cajerosXID(@PathVariable(name = "id") Integer id) {

		return cajerosServiceImpl.cajerosXID(id);

	}

	@PutMapping("/cajeros/{id}")
	public Cajeros updateCajeros(@PathVariable(name = "id") Integer id, @RequestBody Cajeros cajeros) {

		Cajeros cajeros_select;
		Cajeros cajeros_update;

		cajeros_select = cajerosServiceImpl.cajerosXID(id);

		cajeros_select.setNombre_apellidos(cajeros.getNombre_apellidos());
		cajeros_select.setVentas(cajeros.getVentas());

		cajeros_update = cajerosServiceImpl.updateCajeros(cajeros_select);

		System.out.println("El cajeros actualizado es: " + cajeros_update);

		return cajeros_update;
	}

	@DeleteMapping("/cajeros/{id}")
	public void deleteCajeros(@PathVariable(name = "id") Integer id) {
		cajerosServiceImpl.deleteCajeros(id);
	}
}
