package com.xml.jaxb.model;


import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.List;

@XmlRootElement(namespace = "concesionario")
@XmlType(propOrder = {"cocheList", "nombre", "localizacion"})
public class Concesionario {

    @XmlElementWrapper(name = "cocheList")
    @XmlElement(name = "coche")
    private List<Coche> cocheList;
    private String Nombre;
    private String Localizacion;


    public void setCocheList(List<Coche> cocheList) {
        this.cocheList = cocheList;
    }

    public List<Coche> getCochesList() {
        return cocheList;
    }


    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getLocalizacion() {
        return Localizacion;
    }

    public void setLocalizacion(String localizacion) {
        Localizacion = localizacion;
    }
}
