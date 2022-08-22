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
@Table(name = "cajeros")
public class Cajeros {

	// Atributos de entidad cajeros
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "nombre_apellidos")
	private String nombre_apellidos;

	@OneToMany
	@JoinColumn(name="id")
	private List<Ventas> ventas;

	//Constructores

	public Cajeros() {

	}

	/**
	 * 
	 * @param id
	 * @param nombre_apellidos
	 * @param ventas
	 */
	public Cajeros(int id, String nombre_apellidos, List<Ventas> ventas) {

		this.id = id;
		this.nombre_apellidos = nombre_apellidos;
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
	public String getNombre_apellidos() {
		return nombre_apellidos;
	}

	/**
	 * 
	 * @param nombre_apellidos
	 */
	public void setNombre_apellidos(String nombre_apellidos) {
		this.nombre_apellidos = nombre_apellidos;
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
		return "Cajeros [id=" + id + ", nombre_apellidos=" + nombre_apellidos + ", ventas=" + ventas + "]";
	}
}
