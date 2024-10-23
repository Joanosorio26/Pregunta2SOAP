package pe.edu.cibertec.DSWII_EF_SOAP_JOAN_OSORIO_P2.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

@Configuration
public class VisitaWsdConfig {

    @Bean(name = "visitas")
    public DefaultWsdl11Definition visitaWsdl11Definition(XsdSchema visitaEsquema) {
        DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
        wsdl11Definition.setPortTypeName("VisitasPort");
        wsdl11Definition.setLocationUri("/ws/visitas");
        wsdl11Definition.setTargetNamespace("http://www.cibertec.edu.pe/ws/objects");
        wsdl11Definition.setSchema(visitaEsquema);
        return wsdl11Definition;
    }

    @Bean
    public XsdSchema visitaEsquema() {
        return new SimpleXsdSchema(new ClassPathResource("xsd/visita.xsd")); // Asegúrate de que este archivo exista en el directorio adecuado
    }
}
