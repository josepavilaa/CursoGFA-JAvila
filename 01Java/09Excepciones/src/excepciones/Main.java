
package excepciones;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        
        Boleto b = new Boleto();
        Date d = new Date("05/25/2017");
        
        try {
            b.setFecha(d);
        } catch (FechaInvalidaException e) {
            System.out.println("Fecha invalida");
            e.printStackTrace();
        } finally{
            System.out.println(b.getFecha());
            System.out.println("Siempre se va a ejecutar");
            
        }
    }
        
    }
   /*
    public static void main(String[] args) {
       try{
            a.add("d");
            System.out.println(args[2]);
            d = Integer.parseInt(s);
        }catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("Posición no valida!");
        }catch (NumberFormatException ex){
            System.out.println("Eror de formato");
        }catch (Exception ex){
            ex.printStackTrace();
            System.out.println("Excepxión generica");
        }
    
    System.out.println("Final");
    }
    
    
    
}*/
