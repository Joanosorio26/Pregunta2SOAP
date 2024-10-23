package pe.edu.cibertec.DSWII_EF_SOAP_JOAN_OSORIO_P2.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.DSWII_EF_SOAP_JOAN_OSORIO_P2.exception.NotFoundException;
import pe.edu.cibertec.DSWII_EF_SOAP_JOAN_OSORIO_P2.model.Visita;
import pe.edu.cibertec.DSWII_EF_SOAP_JOAN_OSORIO_P2.repository.VisitaRepository;
import pe.edu.cibertec.DSWII_EF_SOAP_JOAN_OSORIO_P2.service.IVisitaService;
import pe.edu.cibertec.DSWII_EF_SOAP_JOAN_OSORIO_P2.util.convert.VisitaConvert;
import pe.edu.cibertec.ws.objects.GetVisitaResponse;
import pe.edu.cibertec.ws.objects.GetVisitasResponse;
import pe.edu.cibertec.ws.objects.PostVisitaRequest;
import pe.edu.cibertec.ws.objects.PostVisitaResponse;

@RequiredArgsConstructor
@Service
public class VisitaService implements IVisitaService {
    private final VisitaRepository visitaRepository;
    private final VisitaConvert visitaConvert;

    // Listar todas las visitas
    @Override
    public GetVisitasResponse listarVisitas() {
        GetVisitasResponse getVisitasResponse = new GetVisitasResponse();
        getVisitasResponse.getVisitas().addAll(
                visitaConvert.mapToVisitawsList(visitaRepository.findAll())
        ); // Corregido: Paréntesis de cierre movido al lugar correcto
        return getVisitasResponse;
    }

    // Obtener una visita por ticket
    @Override
    public GetVisitaResponse obtenerVisitaPorId(Integer ticket) {
        GetVisitaResponse visitaResponse = new GetVisitaResponse();
        Visita visita = visitaRepository.findById(ticket).orElse(null);
        if (visita == null) {
            throw new NotFoundException("La visita con ticket " + ticket + " no existe.");
        }
        visitaResponse.setVisita(
                visitaConvert.mapToVisitaws(visita)
        );
        return visitaResponse;
    }

    // Registrar una nueva visita
    @Override
    public PostVisitaResponse registrarVisita(PostVisitaRequest request) {
        PostVisitaResponse postVisitaResponse = new PostVisitaResponse();
        Visita nuevaVisita = visitaRepository.save(
                visitaConvert.mapToVisita(request.getVisita())
        );
        postVisitaResponse.setVisita(
                visitaConvert.mapToVisitaws(nuevaVisita)
        );
        return postVisitaResponse;
    }
}
