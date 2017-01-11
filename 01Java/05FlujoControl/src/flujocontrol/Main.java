
package flujocontrol;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    
        String [] array = new String[5];
        String cad="";
        
        Scanner s = new Scanner(System.in);
        
        for (int i=0; i<5; i++){
            System.out.println("Introduce un nombre");
            array [i] = s.nextLine();
        }
        
        for (int i=0; i< array.length; i++) {
            cad = cad + array[i];
            System.out.println(array[i]);
        }
        
        System.out.println(cad);
    }
    
}
