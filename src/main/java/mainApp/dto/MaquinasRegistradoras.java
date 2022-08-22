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
@Table(name = "maquinas_registradoras")
public class MaquinasRegistradoras {

	// Atributos de entidad maquinas_registradoras
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "piso")
	private Integer piso;

	@OneToMany
	@JoinColumn(name="id")
	private List<Ventas> ventas;

	//Constructores

	public MaquinasRegistradoras() {

	}

	/**
	 * 
	 * @param id
	 * @param piso
	 * @param ventas
	 */
	public MaquinasRegistradoras(int id, Integer piso, List<Ventas> ventas) {
		
		this.id = id;
		this.piso = piso;
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
	public Integer getPiso() {
		return piso;
	}
	
	/**
	 * 
	 * @param piso
	 */
	public void setPiso(Integer piso) {
		this.piso = piso;
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
		return "MaquinasRegistradoras [id=" + id + ", piso=" + piso + ", ventas=" + ventas + "]";
	}
}
