package Modelo;
/**
 * @authores
 *        Anaya Carreño Claudia
 *        López de la Rosa Mariam Daniela
 *        Martínez Jimenez Jennifer
 *        Silverio Ibañez Omar
 *        
 *      
 *----------------------------------------------------------------------------------------------------------
 * Ejecución:
 *    
 *
 */
public class Empleado {
    private int idEmpleado;
    private String nombreC;
    private String telefono;
    private double sueldo;

    public Empleado(int idEmpleado, String nombreC,String telefono, double sueldo ){
        this.idEmpleado=0;
        this.nombreC=nombreC;
        this.telefono=telefono;
        this.sueldo=sueldo;
    }

    public Empleado() {
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public String getNombreC() {
        return nombreC;
    }

    public String getTelefono() {
        return telefono;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public void setNombreC(String nombreC) {
        this.nombreC = nombreC;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Empleado{" + "idEmpleado=" + idEmpleado + ", nombreC=" + nombreC + ", telefono=" + telefono + ", sueldo=" + sueldo + '}';
    }

}
