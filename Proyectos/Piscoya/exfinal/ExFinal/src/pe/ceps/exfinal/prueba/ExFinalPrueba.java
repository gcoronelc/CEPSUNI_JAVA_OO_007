
package pe.ceps.exfinal.prueba;

import pe.ceps.exfinal.modelo.ExFinalModelo;

public class ExFinalPrueba {
    public static void main(String[] args) {
        //Datos
        double costo = 700;
        int vacantes = 30;
        double pagoH = 80;
        //Proceso
        ExFinalModelo modelo = new ExFinalModelo();
        double ingreso = modelo.calcIngreso(costo,vacantes);
        double publicidad = modelo.calcPub(ingreso);
        double logistica = modelo.calcLog(ingreso);
        double materiales = modelo.calcMat(ingreso);
        double pagoprof = modelo.calcProf(pagoH);
        double gasto = modelo.calcGasto(publicidad, logistica, materiales, pagoprof);
        double utilidad = modelo.calcUtil(ingreso, gasto);
        //Reporte
        System.out.println("INPUT");
        System.out.println("Costo: " + costo);
        System.out.println("Pago por hora: " + pagoH);
        System.out.println("OUTPUT");
        System.out.println("Ingreso: " + ingreso);
        System.out.println("Gastos de publicidad: " + publicidad);
        System.out.println("Gastos de logistica: " + logistica);
        System.out.println("Gastos de materiales: " + materiales);
        System.out.println("Pago de profesor: " + pagoprof);
        System.out.println("Gastos totales: " + gasto);
        System.out.println("Utiliad: " + utilidad);
    }
}
