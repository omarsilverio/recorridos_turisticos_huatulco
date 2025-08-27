package Modelo;
/**
 * @author clau
 *
 */
public class Recorrido {
	 
		private int idRecorrdio;
		private String nombre;		
		private int duracion;
		private double precio_Unitario;
		private String descripcionM;
		private Transporte idTransporte;
		
		/**
		 * @param idRecorrdio
		 * @param nombre		
		 * @param duracion
		 * @param precio_Unitario
		 * @param descripcionM
		 * @param idTransporte
		 */
		public Recorrido(int idRecorrdio, String nombre, int duracion,
				double precio_Unitario, String descripcionM, Transporte idTransporte) {
			
			this.idRecorrdio = idRecorrdio;
			this.nombre = nombre;			
			this.duracion = duracion;
			this.precio_Unitario = precio_Unitario;
			this.descripcionM = descripcionM;
			this.idTransporte = idTransporte;
		}
                public Recorrido(int idRecorrdio, String nombre,int duracion,
				double precio_Unitario, String descripcionM) {
			
			this.idRecorrdio = idRecorrdio;
			this.nombre = nombre;			
			this.duracion = duracion;
			this.precio_Unitario = precio_Unitario;
			this.descripcionM = descripcionM;
			this.idTransporte = null;
		}
		
		/**
		 * @return the idRecorrdio
		 */
		public int getIdRecorrido() {
			return idRecorrdio;
		}
		/**
		 * @param idRecorrdio the idRecorrdio to set
		 */
		public void setIdRecorrido(int idRecorrdio) {
			this.idRecorrdio = idRecorrdio;
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
		 * @return the duracion
		 */
		public int getDuracion() {
			return duracion;
		}
		/**
		 * @param duracion the duracion to set
		 */
		public void setDuracion(int duracion) {
			this.duracion = duracion;
		}
		/**
		 * @return the precio_Unitario
		 */
		public double getPrecio_Unitario() {
			return precio_Unitario;
		}
		/**
		 * @param precio_Unitario the precio_Unitario to set
		 */
		public void setPrecio_Unitario(double precio_Unitario) {
			this.precio_Unitario = precio_Unitario;
		}
		/**
		 * @return the descripcionM
		 */
		public String getDescripcionM() {
			return descripcionM;
		}
		/**
		 * @param descripcionM the descripcionM to set
		 */
		public void setDescripcionM(String descripcionM) {
			this.descripcionM = descripcionM;
		}
		/**
		 * @return the idTransporte
		 */
		public Transporte getIdTransporte() {
			return idTransporte;
		}
		/**
		 * @param idTransporte the idTransporte to set
		 */
		public void setIdTransporte(Transporte idTransporte) {
			this.idTransporte = idTransporte;
		}
		
		@Override
		public String toString() {
			return "Recorrido [idRecorrdio=" + idRecorrdio + ", nombre=" + nombre +  ", duracion=" + duracion + ", precio_Unitario=" + precio_Unitario + ", descripcionM="
					+ descripcionM + "]";
		}
		

}
