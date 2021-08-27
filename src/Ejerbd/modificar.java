
package Ejerbd;
import java.util.Scanner;
import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class modificar {
    public void mod(){
            Scanner entrada = new Scanner(System.in);
            PreparedStatement ps;
            ResultSet rs;
            int cod,edad,resultado;
            String nombre,apellido;
    try{
    conexion con = new  conexion();
    Connection conexion=con.getConnection();
    
    System.out.println("Ingrese el codigo del alumno: ");
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
    System.out.println("ingrese un nuevo nombre: ");
    nombre=entrada.nextLine();
    System.out.println("Ingrese el nuevo apellido: ");
    apellido=entrada.nextLine();
    System.out.println("Ingrese la nueva edad: ");
    edad=entrada.nextInt();
    
    ps=conexion.prepareStatement("update alumnos set nombre=?,apellido=?,edad=? where id=?");
    ps.setString(1, nombre);
    ps.setString(2, apellido);
    ps.setInt(3, edad);
    ps.setInt(4,cod);
    resultado= ps.executeUpdate();
    }else{
    System.out.println("No existe ese registro");
    }
    conexion.close();
    
    }catch(Exception ex){
    System.out.println("Error: "+ex);
    }
    
    
    }
}
