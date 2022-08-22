package mainApp.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "productos")
public class Productos {

	// Atributos de entidad productos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "nombre")
	private String nombre;
	@Column(name = "precio")
	private Integer precio;

	@OneToMany
	@JoinColumn(name="id")
	private List<Ventas> ventas;

	//Constructores

	public Productos() {

	}

	/**
	 * 
	 * @param id
	 * @param nombre
	 * @param precio
	 * @param ventas
	 */
	public Productos(int id, String nombre, Integer precio, List<Ventas> ventas) {

		this.id = id;
		this.nombre = nombre;
		this.precio = precio;
		this.ventas = ventas;
	}
	
	// getter y setter
	/**
	 * 
	 * @return
	 */
	public int getId() {
		return id;
	}
	
	/**
	 * 
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}
	
	/**
	 * 
	 * @return
	 */
	public String getNombre() {
		return nombre;
	}
	
	/**
	 * 
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/**
	 * 
	 * @return
	 */
	public Integer getPrecio() {
		return precio;
	}
	
	/**
	 * 
	 * @param precio
	 */
	public void setPrecio(Integer precio) {
		this.precio = precio;
	}
	
	/**
	 * 
	 * @return
	 */
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Ventas")
	public List<Ventas> getVentas() {
		return ventas;
	}
	
	/**
	 * 
	 * @param ventas
	 */
	public void setVentas(List<Ventas> ventas) {
		this.ventas = ventas;
	}

	@Override
	public String toString() {
		return "Productos [id=" + id + ", nombre=" + nombre + ", precio=" + precio + ", ventas=" + ventas + "]";
	}

}
