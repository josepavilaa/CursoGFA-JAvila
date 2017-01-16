
package archivos;

import java.security.Timestamp;


public interface IEscribible {
    public void escribir(String url);
    public IEscribible leer(String url, long imestamp);
    
    
    
}
