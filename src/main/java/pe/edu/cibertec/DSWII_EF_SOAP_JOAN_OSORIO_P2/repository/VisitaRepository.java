package pe.edu.cibertec.DSWII_EF_SOAP_JOAN_OSORIO_P2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.cibertec.DSWII_EF_SOAP_JOAN_OSORIO_P2.model.Visita;
@Repository
public interface VisitaRepository extends JpaRepository<Visita, Integer> {
}