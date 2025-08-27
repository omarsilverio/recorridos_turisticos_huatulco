package Controlador;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import Modelo.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author omarsilverio
 */
public class ServiciosBDD {    
   
   public ServiciosBDD(){ }
   //Agrega un horario a la base de datos
   public static boolean agregarHorario(Connection conexion, Horario horario) throws SQLException{       
       try{
         PreparedStatement consulta = conexion.prepareStatement("Insert  Into horario"  + "(fechaHora,cupo) Values(?,?)");
         consulta.setString(1, horario.getFechayhora());
         consulta.setInt(2, horario.getCupo());
         consulta.executeUpdate();    
         return true;
      }catch(SQLException ex){
         return false;
      }           
   }
   //Agrega un recorrido a la base de datos
   public static boolean agregarRecorrido(Connection conexion, Recorrido recorrido) throws SQLException{       
       try{
          String sentencia = "Insert Into recorrido(idRecorrido,nombre,tiempoRecorrido,precio,descripcion)"
                  + " Values(?,?,?,?,?)";          
         PreparedStatement consulta = conexion.prepareStatement(sentencia);
         consulta.setInt(1, recorrido.getIdRecorrido());
         consulta.setString(2, recorrido.getNombre());         
         consulta.setInt(3, recorrido.getDuracion());
         consulta.setDouble(4, recorrido.getPrecio_Unitario());
         consulta.setString(5, recorrido.getDescripcionM());         
         consulta.executeUpdate();  
         return true;
      }catch(SQLException ex){
         return false;
      }           
   }
   public static boolean agregarReservacion(Connection conexion, Reservacion reservacion){
       try{
            String sentencia = "Insert Into reservacion(idReservacion,fechaHora,cantidadP)"
                  + " Values(?,?,?)";          
         PreparedStatement consulta = conexion.prepareStatement(sentencia);
         consulta.setInt(1, reservacion.getIdReservacion());
         consulta.setString(2, reservacion.getFechayHora());
         consulta.setInt(3, reservacion.getCantidadPersonas());
         consulta.executeUpdate();
        return true;
       }catch(SQLException ex){
           return false;
       }
   }
   public static boolean agregarTransporte(Connection conexion, Transporte transporte){
       try{
            String sentencia = "Insert Into transporte(idTransporte,nombre,capacidad,idEmpleado)"
                  + " Values(?,?,?)";          
         PreparedStatement consulta = conexion.prepareStatement(sentencia);
         consulta.setInt(1, transporte.getIdTransporte());
         consulta.setString(2, transporte.getNombre());
         consulta.setInt(3, transporte.getCapacidad());
         consulta.setInt(4, transporte.getIdEmpelado());
         consulta.executeUpdate();
        return true;
       }catch(SQLException ex){
           return false;
       }
   }
    public static boolean agregarVenta(Connection conexion, Venta venta){
       try{
            String sentencia = "Insert Into venta(idVenta,fecha,montoTotal,idReservacion)"
                  + " Values(?,?,?,?)";          
         PreparedStatement consulta = conexion.prepareStatement(sentencia);
         consulta.setInt(1, venta.getIdVenta());
         consulta.setString(2, venta.getFecha());
         consulta.setDouble(3, venta.getMontoTotal());
         consulta.setInt(4, venta.getIdReservacion());
         consulta.executeUpdate();
        return true;
       }catch(SQLException ex){
           return false;
       }
   }
   
   //Agrega un cliente a la base de datos
   public static boolean agregarCliente(Connection conexion, Cliente cliente) throws SQLException{
       try{
           String sentencia = "Insert Into cliente(idCliente,nombreC,numeroTel)"
                  + " Values(?,?,?)";           
           PreparedStatement consulta = conexion.prepareStatement(sentencia);
           consulta.setInt(1, cliente.getIdCliente());
           consulta.setString(2, cliente.getNombre());
           consulta.setString(3, cliente.getNum_telefono());
           consulta.executeUpdate();
           return true;
       }catch(SQLException ex){
         return false;  
      }           
   }
   public static boolean agregarHorarioRecorrido(Connection conexion, Horario h,Recorrido recorrido) throws SQLException{       
       try{
           String sentencia = "Insert Into HorarioRecorrido(idHorario,idRecorrido)"
                  + " Values(?,?)";           
           PreparedStatement consulta = conexion.prepareStatement(sentencia);
           consulta.setInt(1, 1234);
           consulta.setInt(2, 123);
           consulta.executeUpdate();
           return true;
       }catch(SQLException ex){
           JOptionPane.showMessageDialog(null, ex.getMessage());
         return false;  
      }           
   }
    public static boolean agregarClienteReservacion(Connection conexion, Horario h,Recorrido recorrido) throws SQLException{
       try{
           String sentencia = "Insert Into HorarioRecorrido(idHorario,idRecorrido)"
                  + " Values(?,?)";           
           PreparedStatement consulta = conexion.prepareStatement(sentencia);
           consulta.setInt(1, h.getIdHorario());
           consulta.setInt(2, recorrido.getIdRecorrido());
           consulta.executeUpdate();
           return true;
       }catch(SQLException ex){
         return false;  
      }           
   }
   public static List<Integer> getHorariosRecorridos(Connection conexion,Recorrido recorrido)  throws SQLException{      
       List<Integer> lst = new ArrayList<Integer>();
        String sentencia = "select * from HorarioRecorrido where idRecorrido = " + recorrido.getIdRecorrido();
         PreparedStatement consulta = conexion.prepareStatement(sentencia);
         ResultSet resultado = consulta.executeQuery();
         while(resultado.next()){            
            lst.add(resultado.getInt("idHorario"));
         }             
         return lst;         
   }
   public static List<Venta> getVentas(Connection conexion)  throws SQLException{      
       List<Venta> lst = new ArrayList<Venta>();
        String sentencia = "select * from venta";
         PreparedStatement consulta = conexion.prepareStatement(sentencia);
         ResultSet resultado = consulta.executeQuery();
         while(resultado.next()){
            Venta venta = new Venta(resultado.getInt("idVenta"), resultado.getString("fecha"), resultado.getDouble("montoTotal"),resultado.getInt("idReservacion"));
            lst.add(venta);
         }             
         return lst;         
   }
   
   
   //Obtiene los horaios de la base de datos
   public static List<Horario> getHorarios(Connection conexion) throws SQLException{
       List<Horario> listaHorarios = new ArrayList<Horario>();
       try{
         PreparedStatement consulta = conexion.prepareStatement("SELECT * FROM horario" );         
         ResultSet resultado = consulta.executeQuery();
         while(resultado.next()){
            Horario horario = new Horario(resultado.getInt("idHorario"), resultado.getString("fechaHora"), resultado.getInt("cupo"));
            listaHorarios.add(horario);
         }
      }catch(SQLException ex){
         return null;
      }
       return listaHorarios;       
   }
   //Obtiene los recorridos de la base de datos
   public static List<Recorrido> getRecorridos(Connection conexion) throws SQLException{
       List<Recorrido> listaRecorridos = new ArrayList<Recorrido>();
       try{
         PreparedStatement consulta = conexion.prepareStatement("SELECT * FROM recorrido" );         
         ResultSet resultado = consulta.executeQuery();
         while(resultado.next()){
            Recorrido horario = new Recorrido(resultado.getInt("idRecorrido"), resultado.getString("nombre"), resultado.getInt("tiempoRecorrido"),resultado.getDouble("precio"),resultado.getString("descripcion"));
            listaRecorridos.add(horario);
         }
      }catch(SQLException ex){
         return null;
      }
       return listaRecorridos;       
   }
   
   
    
    
}
