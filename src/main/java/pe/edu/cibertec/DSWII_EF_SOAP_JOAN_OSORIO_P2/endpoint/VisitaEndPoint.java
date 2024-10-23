package pe.edu.cibertec.DSWII_EF_SOAP_JOAN_OSORIO_P2.endpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import pe.edu.cibertec.DSWII_EF_SOAP_JOAN_OSORIO_P2.service.IVisitaService;
import pe.edu.cibertec.ws.objects.*;

@Endpoint
public class VisitaEndPoint {

    private static final String NAMESPACE_URI = "http://www.cibertec.edu.pe/ws/objects";

    @Autowired
    private IVisitaService visitaService;

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getVisitasRequest")
    @ResponsePayload
    public GetVisitasResponse getVisitas(@RequestPayload GetVisitasRequest request) {
        return visitaService.listarVisitas();
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getVisitaRequest")
    @ResponsePayload
    public GetVisitaResponse getVisitaPorId(@RequestPayload GetVisitaRequest request) {
        return visitaService.obtenerVisitaPorId(request.getTicket());
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "postVisitaRequest")
    @ResponsePayload
    public PostVisitaResponse saveVisita(@RequestPayload PostVisitaRequest request) {
        return visitaService.registrarVisita(request);
    }
}
