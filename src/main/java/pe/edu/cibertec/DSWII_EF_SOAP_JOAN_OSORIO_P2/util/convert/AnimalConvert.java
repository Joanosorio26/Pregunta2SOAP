package pe.edu.cibertec.DSWII_EF_SOAP_JOAN_OSORIO_P2.util.convert;

import org.springframework.stereotype.Component;
import pe.edu.cibertec.DSWII_EF_SOAP_JOAN_OSORIO_P2.model.Animal;
import pe.edu.cibertec.ws.objects.Animalws;

import java.util.ArrayList;
import java.util.List;

@Component
public class AnimalConvert {

    // Mapea de Animalws a Animal (de la solicitud al modelo)
    public Animal mapToAnimal(Animalws animalws) {
        Animal animal = new Animal();
        animal.setIdanimal(animalws.getIdanimal());
        animal.setNombre(animalws.getNombre());
        animal.setEspecie(animalws.getEspecie());
        animal.setEdad(animalws.getEdad());
        animal.setHabitat(animalws.getHabitat());
        return animal;
    }

    // Mapea de Animal a Animalws (del modelo a la respuesta)
    public Animalws mapToAnimalws(Animal animal) {
        Animalws animalws = new Animalws();
        animalws.setIdanimal(animal.getIdanimal());
        animalws.setNombre(animal.getNombre());
        animalws.setEspecie(animal.getEspecie());
        animalws.setEdad(animal.getEdad());
        animalws.setHabitat(animal.getHabitat());
        return animalws;
    }

    // Mapea una lista de Animalws a Animal
    public List<Animal> mapToAnimalList(List<Animalws> animalwsList) {
        List<Animal> animalList = new ArrayList<>();
        for (Animalws animalws : animalwsList) {
            animalList.add(mapToAnimal(animalws));
        }
        return animalList;
    }

    // Mapea una lista de Animal a Animalws
    public List<Animalws> mapToAnimalwsList(List<Animal> animalList) {
        List<Animalws> animalwsList = new ArrayList<>();
        for (Animal animal : animalList) {
            animalwsList.add(mapToAnimalws(animal));
        }
        return animalwsList;
    }
}
