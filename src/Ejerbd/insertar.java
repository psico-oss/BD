
package Ejerbd;
import java.util.Scanner;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class insertar {
    public void insertarDatos(){
     Scanner entrada = new Scanner(System.in);
    PreparedStatement ps;
    ResultSet rs;
    int resultado,cod,edad;
   String nombre,apellido;
    try{
    conexion con = new  conexion();
    Connection conexion=con.getConnection();
    System.out.println("ingrese el nombre: ");
    nombre=entrada.nextLine();
    System.out.println("Ingrese el apellido: ");
    apellido=entrada.nextLine();
    System.out.println("Ingrese la edad: ");
    edad=entrada.nextInt();
    
    ps=conexion.prepareStatement("INSERT INTO alumnos set nombre=?,apellido=?,edad=?");
    ps.setString(1,nombre);
    ps.setString(2,apellido);
    ps.setInt(3,edad);
    resultado= ps.executeUpdate();
    if(resultado > 0){
    System.out.println("Se agrego correctamente los datos");
    }else{
    System.out.println("Error al insertar el alumno");
    }
    conexion.close();
    }catch(Exception ex){
    System.out.println("Error: "+ex);}
    }
    
}
