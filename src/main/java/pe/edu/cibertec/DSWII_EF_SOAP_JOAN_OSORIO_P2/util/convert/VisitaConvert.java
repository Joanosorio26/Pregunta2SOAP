package pe.edu.cibertec.DSWII_EF_SOAP_JOAN_OSORIO_P2.util.convert;

import org.springframework.stereotype.Component;
import pe.edu.cibertec.DSWII_EF_SOAP_JOAN_OSORIO_P2.model.Visita;
import pe.edu.cibertec.ws.objects.Visitaws;

import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
public class VisitaConvert {

    // Mapea de Visitaws a Visita (de la solicitud al modelo)
    public Visita mapToVisita(Visitaws visitaWs) {
        Visita visita = new Visita();
        visita.setTicket(visitaWs.getTicket());
        visita.setNombre_visitante(visitaWs.getNombreVisitante());
        visita.setRecorrido(visitaWs.getRecorrido());
        visita.setNumero_personas(visitaWs.getNumeroPersonas());

        // Convertir XMLGregorianCalendar a Date
        if (visitaWs.getFechaVisita() != null) {
            visita.setFecha_visita(visitaWs.getFechaVisita().toGregorianCalendar().getTime());
        }

        return visita;
    }

    // Mapea de Visita a Visitaws (del modelo a la respuesta)
    public Visitaws mapToVisitaws(Visita visita) {
        Visitaws visitaWs = new Visitaws();
        visitaWs.setTicket(visita.getTicket());
        visitaWs.setNombreVisitante(visita.getNombre_visitante());
        visitaWs.setRecorrido(visita.getRecorrido());
        visitaWs.setNumeroPersonas(visita.getNumero_personas());

        // Convertir Date a XMLGregorianCalendar
        if (visita.getFecha_visita() != null) {
            try {
                XMLGregorianCalendar xmlDate = DatatypeFactory.newInstance()
                        .newXMLGregorianCalendar(visita.getFecha_visita().toString());
                visitaWs.setFechaVisita(xmlDate);
            } catch (Exception e) {
                // Manejar la excepción según sea necesario
                e.printStackTrace();
            }
        }

        return visitaWs;
    }

    // Mapea una lista de Visitaws a Visita
    public List<Visita> mapToVisitaList(List<Visitaws> visitaWsList) {
        List<Visita> visitaList = new ArrayList<>();
        for (Visitaws visitaWs : visitaWsList) {
            visitaList.add(mapToVisita(visitaWs));
        }
        return visitaList;
    }

    // Mapea una lista de Visita a Visitaws
    public List<Visitaws> mapToVisitawsList(List<Visita> visitaList) {
        List<Visitaws> visitaWsList = new ArrayList<>();
        for (Visita visita : visitaList) {
            visitaWsList.add(mapToVisitaws(visita));
        }
        return visitaWsList;
    }
}
