package paquetes;
import matematicas.Matematicas;  // se puede usar * si se quiere abarcar todas las clases, no es lo mas recomendable si solo se usan algunas
import java.util.Scanner;

/**
 *
 * @author ja.avila
 */
public class Main {

    public static void main(String[] args) {
        
    //    Matematicas mat = new Matematicas();
        Scanner lector = new Scanner(System.in);
        float a,b;
        
        System.out.println("Introduce un Número");
        a = lector.nextFloat();
        System.out.println("Introduce otro Número");
        b = lector.nextFloat();
        
        System.out.println("Resultado:" + Matematicas.suma(a,b));
        System.out.println("Resultado:" + Matematicas.resta(a,b));
        System.out.println("Resultado:" + Matematicas.division(a,b));
        System.out.println("Resultado:" + Matematicas.multiplicacion(a,b));
    }
    
}