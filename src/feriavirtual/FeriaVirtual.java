
package feriavirtual;

import Interfaz.Logint;
import ws.WSFERIAVIRTUAL;
import ws.WebServiceFV;
import ws.Login;


public class FeriaVirtual {
    private WebServiceFV servicioWeb;
    
  
    public static void main(String[] args) {
     
        
        WSFERIAVIRTUAL servicio = new WSFERIAVIRTUAL();
        WebServiceFV cliente = servicio.getWebServiceFVPort();
        
     
        Logint princ = new Logint();
        princ.setVisible(true);
        princ.setLocationRelativeTo(null);
        
    }
  }
    

