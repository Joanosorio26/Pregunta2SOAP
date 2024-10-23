package pe.edu.cibertec.DSWII_EF_SOAP_JOAN_OSORIO_P2.service;

import pe.edu.cibertec.ws.objects.GetAnimalResponse;
import pe.edu.cibertec.ws.objects.GetAnimalesResponse;
import pe.edu.cibertec.ws.objects.PostAnimalRequest;
import pe.edu.cibertec.ws.objects.PostAnimalResponse;

public interface IAnimalService {
    GetAnimalesResponse listarAnimales(); // Buscar todos los animales

    GetAnimalResponse obtenerAnimalxId(Integer id); // Buscar animal por ID

    PostAnimalResponse registrarAnimal(PostAnimalRequest request); // Crear nuevo animal

    //PutAnimalResponse actualizarAnimal(PutAnimalRequest request); // Actualizar animal existente
}

