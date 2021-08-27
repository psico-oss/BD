
package Ejerbd;
import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class leer {
    PreparedStatement ps;
    ResultSet rs;
    
    public void leerTabla(){
    try{
    conexion con = new  conexion();
    Connection conexion=con.getConnection();
    ps = conexion.prepareStatement("select * from alumnos");
    rs = ps.executeQuery();
    int band=0;
    
    while(rs.next()){
    band=1;
    
   System.out.println("Codigo: "+rs.getInt("id")+
           "\n Nombre: "+rs.getString("nombre")+
           "\n Apellido: "+rs.getString("apellido")+
           "\n Edad: "+rs.getInt("edad")+
           "\n");
   
    }
    if(band==0){
    System.out.println("no existen registros");
    }
    conexion.close();
    }catch(Exception ex){
    System.out.println("Error: "+ex);
    }
    
    }
    
}
