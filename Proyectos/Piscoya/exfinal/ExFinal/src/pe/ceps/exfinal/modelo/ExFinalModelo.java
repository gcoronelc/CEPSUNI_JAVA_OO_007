package pe.ceps.exfinal.modelo;

public class ExFinalModelo {
    public double calcIngreso(double costo, int vacantes){
        double ingreso;
        ingreso = costo*vacantes;
        return dosDec(ingreso);
    }
    public double calcPub(double ingreso){
        double publicidad;
        publicidad = 0.07*ingreso;
        return dosDec(publicidad);
    }    
    public double calcLog(double ingreso){
        double logistica;
        logistica = 0.08*ingreso;
        return dosDec(logistica);
    }
    public double calcMat(double ingreso){
        double materiales;
        materiales = 0.06*ingreso;
        return dosDec(materiales);
    }
    public double calcProf(double pagoH){
        int horas = 30;
        double pagoprof;
        pagoprof = pagoH*horas;
        return dosDec(pagoprof);
    }
    public double calcGasto(double publicidad, double logistica, double materiales, double pagoprof){
        double gasto;
        gasto = publicidad + logistica + materiales + pagoprof;
        return dosDec(gasto);
    }
    public double calcUtil(double ingreso, double gasto){
        double utilidad;
        utilidad = ingreso - gasto;
        return dosDec(utilidad);
    }
    private double dosDec(double valor){
    valor *= 100;
    valor = Math.round(valor);
    valor /= 100;
    return valor;
    }
}
