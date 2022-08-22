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

import mainApp.dto.Ventas;
import mainApp.service.VentasServiceImpl;

@RestController
@RequestMapping("/api")
public class VentasController {
	
	@Autowired
	VentasServiceImpl ventasServiceImpl;
	
	@GetMapping("/ventas")
	public List<Ventas> listVentas() {
		return ventasServiceImpl.listVentas();
	}

	@PostMapping("/ventas")
	public Ventas saveVentas(@RequestBody Ventas ventas) {

		return ventasServiceImpl.saveVentas(ventas);
	}

	@GetMapping("/ventas/{id}")
	public Ventas ventasXID(@PathVariable(name = "id") Integer id) {

		return ventasServiceImpl.ventasXID(id);

	}

	@PutMapping("/ventas/{id}")
	public Ventas updateVentas(@PathVariable(name = "id") Integer id, @RequestBody Ventas ventas) {

		Ventas ventas_select;
		Ventas ventas_update;

		ventas_select = ventasServiceImpl.ventasXID(id);

		ventas_select.setCajeros(ventas.getCajeros());
		ventas_select.setMaquinasRegistradoras(ventas.getMaquinasRegistradoras());
		ventas_select.setProductos(ventas.getProductos());

		ventas_update = ventasServiceImpl.updateVentas(ventas_select);

		System.out.println("El ventas actualizado es: " + ventas_update);

		return ventas_update;
	}

	@DeleteMapping("/ventas/{id}")
	public void deleteVentas(@PathVariable(name = "id") Integer id) {
		ventasServiceImpl.deleteVentas(id);
	}
}
