
package conexionABases;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Funsiones obj = new Funsiones();
        Scanner resp = new Scanner(System.in);
        int op=0;
        do{
            System.out.println("*****************");
            System.out.println("| 1. Insertar.    |");
            System.out.println("| 2. Modificar.   |");
            System.out.println("| 3. Consultar.   |");
            System.out.println("| 4. Eliminar.    |");
            System.out.println("| 5. Cerrar.      |");
            System.out.println("*******************"); 
            op = resp.nextInt();
            
            switch(op){
                case 1:
                    Scanner rsp = new Scanner(System.in);
                    int cod, tel;
                    String nombre, dire;
                    System.out.println("Ingrese Codigo del alumno: ");
                    cod = rsp.nextInt();
                    System.out.println("Ingrese Nombre del alumno: ");
                    nombre = rsp.nextLine();
                    System.out.println("Ingrese Direccion del alumno: ");
                    dire = rsp.nextLine();
                    System.out.println("Ingrese Numero telefonico del alumno: ");
                    tel = rsp.nextInt();
                    obj.insertar(cod, nombre, dire, tel);
                    break;
                case 2:
                    Scanner rp = new Scanner(System.in);
                    int c, t;
                    String nom, dir;
                    System.out.println("Ingrese el codigo donde desea modificar datos: ");
                    c = rp.nextInt();
                    System.out.println("Ingrese Nombre a modificar: ");
                    nom = rp.nextLine();
                    System.out.println("Ingrese Direccion a modificar: ");
                    dir = rp.nextLine();
                    System.out.println("Ingrese Numero a modificar: ");
                    t = rp.nextInt();
                    obj.modificar(c, nom, dir, t);
                    break;
                case 3:
                    obj.consultar();
                    break;
                case 4:
                    Scanner rp1 = new Scanner(System.in);
                    int cd;
                    System.out.println("Ingrese codigo a eliminar: ");
                    cd = rp1.nextInt();
                    obj.eliminar(cd);
                    break;
                case 5:
                    System.exit(0);
                    break;
            }
        }while(true);
    }
}
