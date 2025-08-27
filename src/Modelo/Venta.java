package Modelo;
import java.util.Date;

/**
 *
 * @author Daniela
 */
public class Venta {
    private int idVenta;
    private String fecha ;
    private double montoTotal;
    private int idReservacion;
    
    
    public Venta(int idVenta, String fecha,double montoTotal,int idReservacion){
    this.idVenta=idVenta; 
    this.fecha=fecha;
    this.montoTotal=montoTotal;
    this.idReservacion=idReservacion;
    }
    public Venta() {
    }

    public int getIdVenta() {
        return idVenta;
    }

    public String getFecha() {
        return fecha;
    }

    public double getMontoTotal() {
        return montoTotal;
    }

    public int getIdReservacion() {
        return idReservacion;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setMontoTotal(double montoTotal) {
        this.montoTotal = montoTotal;
    }

    public void setIdReservacion(int idReservacion) {
        this.idReservacion = idReservacion;
    }

    @Override
    public String toString() {
        return "Venta{" + "idVenta=" + idVenta + ", fecha=" + fecha + ", montoTotal=" + montoTotal + ", idReservacion=" + idReservacion + '}';
    }
    
    
}