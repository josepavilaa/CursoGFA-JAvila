
package archivos;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.Buffer;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import jdk.jfr.events.FileReadEvent;
import jdk.jfr.events.FileWriteEvent;

public class Error implements IEscribible{
    private long timeStamp;
    private int codigoError;
    private String descripcion;

    public Error (){};
    
    public Error(int codigoError, String descripcion){
        this.timeStamp = new Date().getTime();
        this.codigoError = codigoError;
        this.descripcion = descripcion;
    }
    
    public long getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(long timeStamp) {
        this.timeStamp = timeStamp;
    }

    public int getCodigoError() {
        return codigoError;
    }

    public void setCodigoError(int codigoError) {
        this.codigoError = codigoError;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
     
    @Override
    public String toString(){
        return timeStamp + " - " + codigoError +
                " - " + descripcion;
    } 
    
    
    @Override
    public void escribir(String url) {
        FileWriter fw;
        try{
            fw = new FileWriter(url, true);
        String linea= timeStamp + " | " + codigoError + " | " + descripcion + "\n";
            fw.write(linea);
            fw.close();
        } 
        catch (IOException ex) {
            
            System.out.println("El archivo no existe");
        }
    }

    @Override
    public IEscribible leer(String url, long timeStamp) {
        try {
            FileReader fR = new FileReader (url);
            BufferedReader bR = new BufferedReader(fR);
            String linea;
            while ((linea = bR.readLine()) != null){
                String[] sl = linea.split("-");
                if (Long.parseLong (sl[0].trim()) == (timeStamp)){
                    this.timeStamp = timeStamp;
                    this.codigoError = Integer.parseInt (sl[1].trim());
                    this.descripcion = sl[2].trim();
                    return this;
                }
            }    
        }catch (FileNotFoundException ex){
                System.out.println("Archivos no encontrado");
        }catch (IOException ex){
                System.out.println("Error IO");
        }
        return null;
    }
        
        
    }
    
