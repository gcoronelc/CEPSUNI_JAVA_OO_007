package pe.egcc.Cursos.CursoDto;

public class CursoDto {

  private int vacante;
  private int tiempo;
  private int pagoHora;

  private double costo;
  private double ingresos;
  private double gastosPubli;
  private double gastosLog;
  private double gastosMat;
  private double pagoProf;
  private double utilidad;

  public CursoDto(int vacante, int tiempo, int pagoHora, double costo) {
    this.vacante = vacante;
    this.tiempo = tiempo;
    this.pagoHora = pagoHora;
    this.costo = costo;

  }

  public int getPagoHora() {
    return pagoHora;
  }

  public void setPagoHora(int pagoHora) {
    this.pagoHora = pagoHora;
  }

  public int getTiempo() {
    return tiempo;
  }

  public void setTiempo(int tiempo) {
    this.tiempo = tiempo;
  }

  public int getVacante() {
    return vacante;
  }

  public void setVacante(int vacante) {
    this.vacante = vacante;
  }

  public double getCosto() {
    return costo;
  }

  public void setCosto(double costo) {
    this.costo = costo;
  }

  public double getIngresos() {
    return ingresos;
  }

  public void setIngresos(double ingresos) {
    this.ingresos = ingresos;
  }

  public double getGastosPubli() {
    return gastosPubli;
  }

  public void setGastosPubli(double gastosPubli) {
    this.gastosPubli = gastosPubli;
  }

  public double getGastosLog() {
    return gastosLog;
  }

  public void setGastosLog(double gastosLog) {
    this.gastosLog = gastosLog;
  }

  public double getGastosMat() {
    return gastosMat;
  }

  public void setGastosMat(double gastosMat) {
    this.gastosMat = gastosMat;
  }

  public double getPagoProf() {
    return pagoProf;
  }

  public void setPagoProf(double pagoProf) {
    this.pagoProf = pagoProf;
  }

  public double getUtilidad() {
    return utilidad;
  }

  public void setUtilidad(double utilidad) {
    this.utilidad = utilidad;
  }

}
