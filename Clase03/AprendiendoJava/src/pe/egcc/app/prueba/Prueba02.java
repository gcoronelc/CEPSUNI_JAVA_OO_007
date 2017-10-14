package pe.egcc.app.prueba;

import pe.egcc.app.service.VentaService;

public class Prueba02 {

  public static void main(String[] args) {
    
    VentaService bean1 = new VentaService();
    mostrar(bean1);
    
    VentaService bean2 = new VentaService(456.78, 5);
    mostrar(bean2);

    VentaService bean3 = new VentaService(456.78, 5, 675);
    mostrar(bean3);    
    
  }

  private static void mostrar(VentaService bean) {
    System.out.println("----------------------------------");
    System.out.println("Precio: " + bean.getPrecio());
    System.out.println("Cantidad: " + bean.getCant());
    System.out.println("Importe: " + bean.getImporte());
  }

  
}
