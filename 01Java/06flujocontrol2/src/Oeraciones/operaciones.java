
package Oeraciones;


public class operaciones {

int suma;
    int mayor;

    public int suma(int a[]) {
        for (int i = 0; i < a.length; i++) {
            suma += a[i];
        }
        return suma;
    }

    public int media(int a[]) {
        suma(a);
        return suma / a.length;
    }

    public int mayor(int a[]) {
       for (int i = 0; i < a.length; i++) {
           
          if (i ==0) {
              mayor = a[i];
          } 
        
          if (mayor < a[i]){
          
              mayor= a[i];
          }
       } 
       return  mayor;
    }
}

