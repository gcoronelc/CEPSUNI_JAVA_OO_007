package pe.ceps.ventaapp.prueba;

import pe.ceps.ventaapp.service.VentaService;

public class Prueba01 {
  
  public static void main(String[] args) {
    // Datos
    double precio = 580.0;
    int cant = 7;
    // Proceso
    VentaService service = new VentaService();
    double dcto = service.calcDescuento(precio, cant);
    double total = service.calcTotal(precio, cant);
    double importe = service.calcImporte(total);
    double impuesto = service.calcImpuesto(total);
    // Reporte
    System.out.println("INPUT");
    System.out.println("Precio: " + precio);
    System.out.println("Cantidad: " + cant);
    System.out.println("OUTPUT");
    System.out.println("Descuento: " + dcto);
    System.out.println("Importe: " + importe);
    System.out.println("Impuesto: " + impuesto);
    System.out.println("Total: " + total);
  }
  
  
}
