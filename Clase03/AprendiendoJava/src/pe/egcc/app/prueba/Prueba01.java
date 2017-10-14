package pe.egcc.app.prueba;

import pe.egcc.app.service.MateService;

public class Prueba01 {

  public static void main(String[] args) {
    
    MateService service = new MateService();
    
    System.out.println("5 + 6: " + service.sumar(5, 6));
    System.out.println("5.0 + 6.0: " + service.sumar(5.0, 6.0));
    
  }
  
}
