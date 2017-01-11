
package pkg04arreglos;

public class Main {

    public static void main(String[] args) {
        
        //Arreglo inicializado con valores 'Default' -0
    int [] Entero = new int[10];
    Entero[0]=10;
        //Arreglo inicializado convalores propios    
        int [] EnteroB = {1,2,3,4,5};
        
        String [] Cadena = new String[10];
        boolean [] B = new boolean[10];
        
        System.out.println(Entero[0]);
        System.out.println(B[0]);
        
        int [][] EnteroBidimensional = new int [2][4];
        int [][] EnteroBidimensionalB = {{1,2,3},{4,5,6}};
    }
    
}
