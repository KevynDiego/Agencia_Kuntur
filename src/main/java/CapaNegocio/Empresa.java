package CapaNegocio;

import java.util.ArrayList;

public class Empresa {
    //atributos
    private String Ruc;
    private String Nombre;
    private String Precio;
    private String PaqueteTuristico;
    public ArrayList<Compra>Realiza=new ArrayList();

    public String getRuc() {
        return Ruc;
    }

    public void setRuc(String Ruc) {
        this.Ruc = Ruc;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getPrecio() {
        return Precio;
    }

    public void setPrecio(String Precio) {
        this.Precio = Precio;
    }

    public String getPaqueteTuristico() {
        return PaqueteTuristico;
    }

    public void setPaqueteTuristico(String PaqueteTuristico) {
        this.PaqueteTuristico = PaqueteTuristico;
    }
    
}   