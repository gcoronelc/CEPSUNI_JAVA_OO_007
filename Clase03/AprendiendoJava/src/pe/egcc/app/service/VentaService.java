package pe.egcc.app.service;

public class VentaService {

  private double precio;
  private int cant;
  private double importe;

  /**
   * Constructor por defecto
   */
  public VentaService() {
  }

  /**
   * Constructor adicional.
   *
   * @param precio
   * @param cant
   */
  public VentaService(double precio, int cant) {
    this.precio = precio;
    this.cant = cant;
    this.importe = precio * cant;
  }

  /**
   * Otro constructor adicional.
   *
   * @param precio
   * @param cant
   * @param importe
   */
  public VentaService(double precio, int cant, double importe) {
    this.precio = precio;
    this.cant = cant;
    this.importe = importe;
  }

  public double getPrecio() {
    return precio;
  }

  public void setPrecio(double precio) {
    this.precio = precio;
  }

  public int getCant() {
    return cant;
  }

  public void setCant(int cant) {
    this.cant = cant;
  }

  public double getImporte() {
    return importe;
  }

  public void setImporte(double importe) {
    this.importe = importe;
  }

}
