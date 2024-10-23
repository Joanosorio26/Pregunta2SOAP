package pe.edu.cibertec.DSWII_EF_SOAP_JOAN_OSORIO_P2.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.DSWII_EF_SOAP_JOAN_OSORIO_P2.exception.NotFoundException;
import pe.edu.cibertec.DSWII_EF_SOAP_JOAN_OSORIO_P2.model.Animal;
import pe.edu.cibertec.DSWII_EF_SOAP_JOAN_OSORIO_P2.repository.AnimalRepository;
import pe.edu.cibertec.DSWII_EF_SOAP_JOAN_OSORIO_P2.service.IAnimalService;
import pe.edu.cibertec.DSWII_EF_SOAP_JOAN_OSORIO_P2.util.convert.AnimalConvert;
import pe.edu.cibertec.ws.objects.GetAnimalResponse;
import pe.edu.cibertec.ws.objects.GetAnimalesResponse;
import pe.edu.cibertec.ws.objects.PostAnimalRequest;
import pe.edu.cibertec.ws.objects.PostAnimalResponse;



@RequiredArgsConstructor
@Service
public class AnimalService  implements IAnimalService {
    private final AnimalRepository animalRepository;
    private final AnimalConvert animalConvert;

    // Listar todos los animales
    @Override
    public GetAnimalesResponse listarAnimales() {
        GetAnimalesResponse getAnimalesResponse = new GetAnimalesResponse();
        getAnimalesResponse.getAnimales().addAll(
                animalConvert.mapToAnimalwsList(animalRepository.findAll())
        );
        return getAnimalesResponse;
    }

    // Obtener un animal por ID
    @Override
    public GetAnimalResponse obtenerAnimalxId(Integer id) {
        GetAnimalResponse animalResponse = new GetAnimalResponse();
        Animal animal = animalRepository.findById(id).orElse(null);
        if (animal == null) {
            throw new NotFoundException("El animal con ID " + id + " no existe.");
        }
        animalResponse.setAnimal(
                animalConvert.mapToAnimalws(animal)
        );
        return animalResponse;
    }

    // Registrar un nuevo animal
    @Override
    public PostAnimalResponse registrarAnimal(PostAnimalRequest request) {
        PostAnimalResponse postAnimalResponse = new PostAnimalResponse();
        Animal nuevoAnimal = animalRepository.save(
                animalConvert.mapToAnimal(request.getAnimal())
        );
        postAnimalResponse.setAnimal(
                animalConvert.mapToAnimalws(nuevoAnimal)
        );
        return postAnimalResponse;
    }
}
