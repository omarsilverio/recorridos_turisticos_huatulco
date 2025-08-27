package Modelo;
/**
 *
 * @author Daniela
 */
public class Transporte {
    private int idTransporte;
    private String nombre;
    private int capacidad;
    private int idEmpelado;
    
    
    public Transporte(int idTransporte, String nombre,int capacidad, int idEmpelado){
     this.idTransporte=idTransporte;
     this.nombre=nombre;
     this.capacidad=capacidad;
     this.idEmpelado=idEmpelado;
    }

    public Transporte() {
    }

    public int getIdTransporte() {
        return idTransporte;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public int getIdEmpelado() {
        return idEmpelado;
    }

    public void setIdTransporte(int idTransporte) {
        this.idTransporte = idTransporte;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public void setIdEmpelado(int idEmpelado) {
        this.idEmpelado = idEmpelado;
    }

    @Override
    public String toString() {
        return "Transporte{" + "idTransporte=" + idTransporte + ", nombre=" + nombre + ", capacidad=" + capacidad + ", idEmpelado=" + idEmpelado + '}';
    }
    
}
