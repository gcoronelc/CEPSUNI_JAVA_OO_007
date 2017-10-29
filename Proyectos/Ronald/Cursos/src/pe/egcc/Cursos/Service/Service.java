package pe.egcc.Cursos.Service;

import pe.egcc.Cursos.CursoDto.CursoDto;

public class Service {

  public CursoDto ProcesarUtilidad(CursoDto dto) {
    double ingresos, gastos, gastosPubli, gastosLog, gastosMat, pagoProf, utilidad;

    ingresos = dto.getCosto() * dto.getVacante();
    gastosPubli = Math.round(100 * ingresos * 0.07) / 100;
    gastosLog = Math.round(100 * ingresos * 0.08) / 100;
    gastosMat = Math.round(100 * ingresos * 0.06) / 100;
    gastos = gastosPubli + gastosLog + gastosMat;
    pagoProf = dto.getPagoHora() * dto.getTiempo();
    utilidad = ingresos - gastos - pagoProf;

    dto.setIngresos(ingresos);
    dto.setGastosPubli(gastosPubli);
    dto.setGastosLog(gastosLog);
    dto.setGastosMat(gastosMat);
    dto.setPagoProf(pagoProf);
    dto.setUtilidad(utilidad);

    return dto;

  }

}
