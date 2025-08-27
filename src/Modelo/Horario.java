package Modelo;

/**
 *
 * @author omarsilverio
 */
public class Horario{
    
       private int idHorario;
       private String fechayhora;
       private int cupo;
       
       public Horario(int idHorario, String fechayhora, int cupo){
           this.idHorario = idHorario;
           this.cupo = cupo;
           this.fechayhora = fechayhora;
       }
       
       public Horario(String fechayhora, int cupo){
           this.idHorario = -1;
           this.cupo= cupo;
           this.fechayhora = fechayhora;
       }

    public int getIdHorario() {
        return idHorario;
    }

    public void setIdHorario(int idHorario) {
        this.idHorario = idHorario;
    }

    public String getFechayhora() {
        return fechayhora;
    }

    public void setFechayhora(String fechayhora) {
        this.fechayhora = fechayhora;
    }

    public int getCupo() {
        return cupo;
    }

    public void setCupo(int cupo) {
        this.cupo = cupo;
    }

    
    @Override
    public String toString(){
        return String.format("identificadorHorario%d fecha y hora de partida: %s  identificador reservacion: %d ", idHorario, fechayhora, cupo);
    }
    
}
