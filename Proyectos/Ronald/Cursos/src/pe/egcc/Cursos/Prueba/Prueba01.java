package pe.egcc.Cursos.Prueba;

import pe.egcc.Cursos.CursoDto.CursoDto;
import pe.egcc.Cursos.Service.Service;

public class Prueba01 {

  public static void main(String[] args) {

    CursoDto dto = new CursoDto(30, 30, 80, 700);

    Service service = new Service();
    dto = service.ProcesarUtilidad(dto);

    // reporte
    System.out.println("Ingresos: " + dto.getIngresos());
    System.out.println("Gastos en Publicidad: " + dto.getGastosPubli());
    System.out.println("Gastos en Lógica: " + dto.getGastosLog());
    System.out.println("Gastos en Materiales: " + dto.getGastosMat());
    System.out.println("Pago al profesor: " + dto.getPagoProf());
    System.out.println("Utilidad: " + dto.getUtilidad());

  }
}
