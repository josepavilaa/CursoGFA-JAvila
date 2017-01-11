
package flujocontrol2;
import Oeraciones.operaciones;
import java.util.Scanner;


public class Main {

  
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Defina el tamaño del arreglo con un valor entero:");
        
        int [] array = new int[Integer.parseInt(s.nextLine())];
               
        
        for (int i=0; i<array.length; i++){
            System.out.println("Introduce un numero");
            array [i] = Integer.parseInt(s.nextLine());
        }
        
        System.out.println("Elija la operacion 1.Suma 2.-Calcular media 3.- Número Mayor");
        
       operaciones ope = new operaciones();
        
        switch (Integer.parseInt(s.nextLine())) {
            case 1:
                System.out.println("La suma es " + ope.suma(array));
                break;
            case 2:
                System.out.println("La media es:" + ope.media(array));
                break;
            case 3 :
                System.out.println("El numero mayor es "+ ope.mayor(array));
                break;
        }
    }
    
}
