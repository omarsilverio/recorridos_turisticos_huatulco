package Modelo;
/**
 * @author clau
 *
 */
public class Cliente {

	/**
	 * 
	 */
	private int idCliente;
	private String nombre;
	
	private String num_telefono;
	
	

	/**
	 * @param idCliente
	 * @param nombre	 
	 * @param num_telefono
	 */
	public Cliente(int idCliente, String nombre, String num_telefono) {
		
		this.idCliente = idCliente;
		this.nombre = nombre;		
		this.num_telefono = num_telefono;
	}

	/**
	 * @return the idCliente
	 */
	public int getIdCliente() {
		return idCliente;
	}

	/**
	 * @param idCliente the idCliente to set
	 */
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/**
	 * @return the num_telefono
	 */
	public String getNum_telefono() {
		return num_telefono;
	}

	/**
	 * @param num_telefono the num_telefono to set
	 */
	public void setNum_telefono(String num_telefono) {
		this.num_telefono = num_telefono;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Cliente [idCliente=" + idCliente + ", nombre=" + nombre + ", num_telefono="
				+ num_telefono + "]";
	}
	

}
