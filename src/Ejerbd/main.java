
package Ejerbd;


public class main {
    public static void main(String[] args){
    menu menu=new menu();
    leer leer=new leer();
    modificar modificar=new modificar();
    insertar insertar=new insertar();
    borrar borrar=new borrar();
    int op=0;
    while(op!=5){
    op=menu.elegir();
    switch(op){
        case 1:
            leer.leerTabla();
            break;
        case 2:
            insertar.insertarDatos();
            break;
        case 3:
            modificar.mod();
            break;
        case 4:
            borrar.borrar();
            break;
        case 5:
            break;
    }
    }
    }
    
}
