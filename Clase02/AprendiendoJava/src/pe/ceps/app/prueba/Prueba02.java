package pe.ceps.app.prueba;

import pe.ceps.app.model.Producto;

public class Prueba02 {

  public static void main(String[] args) {
    
    Producto bean = new Producto("Licuadora", 285.70, 200, true);
    
    mostrarBean(bean);
    
  }
  
    private static void mostrarBean(Producto bean) {
    System.out.println("--------------------");
    System.out.println("Nombre: " + bean.getNombre());
    System.out.println("Precio: " + bean.getPrecio());
    System.out.println("Stock: " + bean.getStock());
    System.out.println("Activo: " + bean.isActivo());
  }
    
}
