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

import mainApp.dto.Productos;
import mainApp.service.ProductosServiceImpl;

@RestController
@RequestMapping("/api")
public class ProductosController {
	
	@Autowired
	ProductosServiceImpl productosServiceImpl;
	
	@GetMapping("/productos")
	public List<Productos> listProductos() {
		return productosServiceImpl.listProductos();
	}

	@PostMapping("/productos")
	public Productos saveProductos(@RequestBody Productos productos) {

		return productosServiceImpl.saveProductos(productos);
	}

	@GetMapping("/productos/{id}")
	public Productos productosXID(@PathVariable(name = "id") Integer id) {

		return productosServiceImpl.productosXID(id);

	}

	@PutMapping("/productos/{id}")
	public Productos updateProductos(@PathVariable(name = "id") Integer id, @RequestBody Productos productos) {

		Productos productos_select;
		Productos productos_update;

		productos_select = productosServiceImpl.productosXID(id);

		productos_select.setNombre(productos.getNombre());
		productos_select.setPrecio(productos.getPrecio());
		productos_select.setVentas(productos.getVentas());

		productos_update = productosServiceImpl.updateProductos(productos_select);

		System.out.println("El productos actualizado es: " + productos_update);

		return productos_update;
	}

	@DeleteMapping("/productos/{id}")
	public void deleteProductos(@PathVariable(name = "id") Integer id) {
		productosServiceImpl.deleteProductos(id);
	}

}
