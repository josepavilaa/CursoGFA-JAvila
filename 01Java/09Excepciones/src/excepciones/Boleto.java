
package excepciones;
import java.util.Date;

public class Boleto {
    float costo;
    int folio;
    String origen, destino;
    Date fecha;

    public float getCosto() {
        return costo;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }

    public int getFolio() {
        return folio;
    }

    public void setFolio(int folio) {
        this.folio = folio;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) throws FechaInvalidaException{
        if(fecha.before(new Date())) {
            throw new FechaInvalidaException();
        }
        this.fecha = fecha;
    }
    
    
    
}
