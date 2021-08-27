
package Ejerbd;
import java.util.Scanner;

public class menu {
    private int opcion;
    
    public int elegir(){
    Scanner entrada=new Scanner(System.in);
    
    System.out.println("");
    System.out.println("MENU:");
    System.out.println("1_mostrar datos");
    System.out.println("2_ingresar datos");
    System.out.println("3_modificar datos");
    System.out.println("4_eliminar datos");
    System.out.println("5_Salir");
    System.out.println("Ingrese una opcion");
    opcion=entrada.nextInt();
    System.out.println("");
    return opcion;
    
    }
    
}
