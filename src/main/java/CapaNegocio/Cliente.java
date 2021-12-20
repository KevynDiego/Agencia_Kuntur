package CapaNegocio;
import java.util.*;

public class Cliente {
    
//atributos
    private String nombres;
    private String apellidos;
    private String Dni;
    private String NroCelular;
    private String NroTarjeta;
    private Date FechaViaje;
    public ArrayList<BoletaDigital>Solicita=new ArrayList();
    

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return Dni;
    }

    public void setDni(String Dni) {
        this.Dni = Dni;
    }

    public String getNroCelular() {
        return NroCelular;
    }

    public void setNroCelular(String NroCelular) {
        this.NroCelular = NroCelular;
    }

    public String getNroTarjeta() {
        return NroTarjeta;
    }

    public void setNroTarjeta(String NroTarjeta) {
        this.NroTarjeta = NroTarjeta;
    }

    public Date getFechaViaje() {
        return FechaViaje;
    }

    public void setFechaViaje(Date FechaViaje) {
        this.FechaViaje = FechaViaje;
    }

    
    
}
