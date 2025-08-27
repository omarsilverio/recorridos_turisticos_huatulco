package Modelo;
/**
 * @author clau
 *
 */


public class Reservacion {

	private int idReservacion;
	private int cantidadPersonas;
	private String fechayHora;
	
	/**
	 * @param idReservacion
	 * @param cantidadPersonas
	 * @param fechayhora 
	 */
	public Reservacion(int idReservacion,String fechayhora, int cantidadPersonas) {
		
		this.idReservacion = idReservacion;
		this.cantidadPersonas = cantidadPersonas;
		this.fechayHora = fechayhora;
	}

    public int getIdReservacion() {
        return idReservacion;
    }

    public void setIdReservacion(int idReservacion) {
        this.idReservacion = idReservacion;
    }

    public int getCantidadPersonas() {
        return cantidadPersonas;
    }

    public void setCantidadPersonas(int cantidadPersonas) {
        this.cantidadPersonas = cantidadPersonas;
    }

    public String getFechayHora() {
        return fechayHora;
    }

    public void setFechayHora(String fechayHora) {
        this.fechayHora = fechayHora;
    }	
	
	@Override
	public String toString() {
		return "Reservacion [idReservacion=" + idReservacion + ", fechahora=" + fechayHora + ", cantidadP=" + cantidadPersonas
				+ "]";
	}
	

}
