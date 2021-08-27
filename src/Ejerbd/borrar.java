
package Ejerbd;
import java.util.Scanner;
import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;



public class borrar {
        public void borrar(){
         Scanner entrada = new Scanner(System.in);
         PreparedStatement ps;
         ResultSet rs;
         int cod,op;
         try{
    conexion con = new  conexion();
    Connection conexion=con.getConnection();   
    System.out.println("Ingrese el codigo del alumno que quiere borrar: ");
    cod=entrada.nextInt();   
    ps=conexion.prepareStatement("select * from alumnos where id="+cod);
    rs = ps.executeQuery();
    if(rs.next()){
    System.out.println("Codigo: "+rs.getInt("id")+
           "\n Nombre: "+rs.getString("nombre")+
           "\n Apellido: "+rs.getString("apellido")+
           "\n Edad: "+rs.getInt("edad")+
           "\n");
    entrada.nextLine();
    System.out.println("Quiere borrar los datos de este usuario?");
    System.out.println("1_Si");
    System.out.println("2_No");
    op=entrada.nextInt();
    
   switch(op){
       case 1:
           ps.executeUpdate("DELETE FROM alumnos WHERE id="+cod);
           System.out.println("los datos se eliminaron con exito");
           break;
   
   
       case 2:
           System.out.println("No se borraron los datos");
           break;
   
   }
         }
        }catch(Exception ex){
                 System.out.println("Error :"+ex);
         
         }
    
}
}
