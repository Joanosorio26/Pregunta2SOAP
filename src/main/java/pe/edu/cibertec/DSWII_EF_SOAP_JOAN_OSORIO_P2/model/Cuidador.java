package pe.edu.cibertec.DSWII_EF_SOAP_JOAN_OSORIO_P2.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "cuidadores")
public class Cuidador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idcuidador;

    private String nombre;
    private String apellido;
    private String telefono;
    private String curso;
    private Integer experiencia;


}
