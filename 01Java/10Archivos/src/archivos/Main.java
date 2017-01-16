package archivos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner s2 = new Scanner(System.in);
        
        /*
        System.out.println("Ingresa el Codigo de Error");
        int cError = s.nextInt();
        System.out.println("Ingresa la descripción del Error");
        String descripcion = s2.nextLine();
         
        
        Error e1 = new Error(cError, descripcion);
        e1.escribir("D:\\Alberto\\CursoJava\\Proyectos\\CursoGFA-JAvila\\01Java\\10Archivos\\src\\archivos\\errores.txt");

        */
        
        IEscribible e= new Error();
        e.leer("D:\\Alberto\\CursoJava\\Proyectos\\CursoGFA-JAvila\\01Java\\10Archivos\\src\\archivos\\errores.txt",1484415758240L);
        System.out.println(e);
        }
    }