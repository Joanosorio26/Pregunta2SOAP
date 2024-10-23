package pe.edu.cibertec.DSWII_EF_SOAP_JOAN_OSORIO_P2.endpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import pe.edu.cibertec.DSWII_EF_SOAP_JOAN_OSORIO_P2.service.IAnimalService;
import pe.edu.cibertec.ws.objects.*;

@Endpoint
public class AnimalEndPoint {

    private static final String NAMESPACE_URI = "http://www.cibertec.edu.pe/ws/objects";

    @Autowired
    private IAnimalService animalService;

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getAnimalesRequest")
    @ResponsePayload
    public GetAnimalesResponse getAnimales(@RequestPayload GetAnimalesRequest request) {
        return animalService.listarAnimales();
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getAnimalRequest")
    @ResponsePayload
    public GetAnimalResponse getAnimalXid(@RequestPayload GetAnimalRequest request) {
        return animalService.obtenerAnimalxId(request.getIdanimal());
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "postAnimalRequest")
    @ResponsePayload
    public PostAnimalResponse saveAnimal(@RequestPayload PostAnimalRequest request) {
        return animalService.registrarAnimal(request);
    }
}