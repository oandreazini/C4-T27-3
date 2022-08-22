package mainApp.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ventas")
public class Ventas {

	// Atributos de entidad ventas
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@ManyToOne
	@JoinColumn(name = "cajero")
	private Cajeros cajeros;

	@ManyToOne
	@JoinColumn(name = "maquina")
	private MaquinasRegistradoras maquinasRegistradoras;

	@ManyToOne
	@JoinColumn(name = "producto")
	private Productos productos;

	//Constructores
	public Ventas() {
	}

	/**
	 * 
	 * @param id
	 * @param cajeros
	 * @param maquinasRegistradoras
	 * @param productos
	 */
	public Ventas(int id, Cajeros cajeros, MaquinasRegistradoras maquinasRegistradoras, Productos productos) {
		this.id = id;
		this.cajeros = cajeros;
		this.maquinasRegistradoras = maquinasRegistradoras;
		this.productos = productos;
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
	public Cajeros getCajeros() {
		return cajeros;
	}
	
	/**
	 * 
	 * @param cajeros
	 */
	public void setCajeros(Cajeros cajeros) {
		this.cajeros = cajeros;
	}
	
	/**
	 * 
	 * @return
	 */
	public MaquinasRegistradoras getMaquinasRegistradoras() {
		return maquinasRegistradoras;
	}
	
	/**
	 * 
	 * @param maquinasRegistradoras
	 */
	public void setMaquinasRegistradoras(MaquinasRegistradoras maquinasRegistradoras) {
		this.maquinasRegistradoras = maquinasRegistradoras;
	}
	
	/**
	 * 
	 * @return
	 */
	public Productos getProductos() {
		return productos;
	}
	
	/**
	 * 
	 * @param productos
	 */
	public void setProductos(Productos productos) {
		this.productos = productos;
	}

	@Override
	public String toString() {
		return "Ventas [id=" + id + ", cajeros=" + cajeros + ", maquinasRegistradoras=" + maquinasRegistradoras
				+ ", productos=" + productos + "]";
	}

}
