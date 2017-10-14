package pe.egcc.app.prueba;

import pe.egcc.app.service.Clase1;
import pe.egcc.app.service.Clase2;
import pe.egcc.app.service.Clase3;

public class Prueba08 {

  public static void main(String[] args) {
    
    Clase2 a = new Clase2();
    
    Clase1 b = a;
    
    Clase2 c = (Clase2) b;
    
    // Esta linea genera error en ejecución
    Clase3 d = (Clase3) c;
    
  }
  
}
