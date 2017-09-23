package pe.ceps.ventaapp.service;

public class VentaService {

  public double calcDescuento(double precio, int cant) {
    // Varibale
    double dcto;
    // Proceso
    dcto = 0.0;
    if( cant > 8 ){
      dcto = precio * 0.05;
    }
    // Retorno
    return dosDec(dcto);
  }
  
  public double calcTotal(double precio, int cant){
    // Variable
    double total;
    // Proceso
    double dcto = calcDescuento(precio, cant);
    total = (precio - dcto) * cant;
    // Retorno
    return dosDec(total);
  }
  
  public double calcImporte(double total){
    // Variable
    double importe;
    // Proceso
    importe = total / 1.18;
    // Retorno
    return dosDec(importe);
  }
  
  public double calcImpuesto(double total){
    // Variable
    double impuesto;
    // Proceso
    double importe = calcImporte(total);
    impuesto = total - importe;
    // Retorno
    return dosDec(impuesto);
  }
  
  private double dosDec(double valor){
    valor *= 100;
    valor = Math.round(valor);
    valor /= 100;
    return valor;
  }
  
}
