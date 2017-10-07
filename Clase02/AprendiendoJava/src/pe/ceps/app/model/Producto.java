package pe.ceps.app.model;

public class Producto {

  private String nombre;
  private double precio;
  private int stock;
  private boolean activo;

  /**
   * Constructor por defecto
   */
  public Producto() {
//    this.nombre = "Curso de Java";
//    this.precio = 500.0;
//    this.stock = 15;
//    this.activo = true;
    this("Curso de Java", 600.0, 20, true);
    System.out.println("Objeto creado.");
  }

  /**
   * Constructor adicional.
   * 
   * @param nombre Nombre del producto.
   * @param precio Precio del producto.
   * @param stock Stock del producto.
   * @param activo Determina si esta disponible o no lo esta.
   */
  public Producto(String nombre, double precio, int stock, boolean activo) {
    this.nombre = nombre;
    this.precio = precio;
    this.stock = stock;
    this.activo = activo;
  }
  
  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public double getPrecio() {
    return precio;
  }

  public void setPrecio(double precio) {
    this.precio = precio;
  }

  public int getStock() {
    return stock;
  }

  public void setStock(int stock) {
    this.stock = stock;
  }

  public boolean isActivo() {
    return activo;
  }

  public void setActivo(boolean activo) {
    this.activo = activo;
  }

  @Override
  protected void finalize() throws Throwable {
    System.err.println("Chau objeto.");
  }
  
}
