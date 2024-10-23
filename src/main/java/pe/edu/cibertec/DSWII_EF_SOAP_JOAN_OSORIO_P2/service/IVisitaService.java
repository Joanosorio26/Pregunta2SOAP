package pe.edu.cibertec.DSWII_EF_SOAP_JOAN_OSORIO_P2.service;

import pe.edu.cibertec.ws.objects.GetVisitaResponse;
import pe.edu.cibertec.ws.objects.GetVisitasResponse;
import pe.edu.cibertec.ws.objects.PostVisitaRequest;
import pe.edu.cibertec.ws.objects.PostVisitaResponse;

public interface IVisitaService {
    GetVisitasResponse listarVisitas(); // Buscar todas las visitas

    GetVisitaResponse obtenerVisitaPorId(Integer ticket); // Buscar visita por ticket

    PostVisitaResponse registrarVisita(PostVisitaRequest request); // Crear nueva visita
}
