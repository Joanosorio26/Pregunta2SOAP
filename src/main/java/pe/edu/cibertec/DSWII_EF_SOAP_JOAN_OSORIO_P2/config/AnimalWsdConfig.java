package pe.edu.cibertec.DSWII_EF_SOAP_JOAN_OSORIO_P2.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

@Configuration
public class AnimalWsdConfig {

    @Bean(name = "animales")
    public DefaultWsdl11Definition animalWsdl11Definition(XsdSchema animalEsquema) {
        DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
        wsdl11Definition.setPortTypeName("AnimalesPort");
        wsdl11Definition.setLocationUri("/ws/animales");
        wsdl11Definition.setTargetNamespace("http://www.cibertec.edu.pe/ws/objects");
        wsdl11Definition.setSchema(animalEsquema);
        return wsdl11Definition;
    }

    @Bean
    public XsdSchema animalEsquema() {
        return new SimpleXsdSchema(new ClassPathResource("xsd/animal.xsd"));
    }
}