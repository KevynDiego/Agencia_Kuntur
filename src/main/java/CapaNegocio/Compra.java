package CapaNegocio;
import java.util.*;

public class Compra {

    //constructores
    public Compra(String Destino, String Empresa, int Costo, Date Fecha, String HoraSalida, String HoraLlegada) {
        this.Destino = Destino;
        this.Empresa = Empresa;
        this.Costo = Costo;
        this.Fecha = Fecha;
        this.HoraSalida = HoraSalida;
        this.HoraLlegada = HoraLlegada;
    }
    
    //atributos
   private String Destino;
   private String Empresa;
   private int Costo;
   private Date Fecha;
   private String HoraSalida;
   private String HoraLlegada;

    public String getDestino() {
        return Destino;
    }

    public void setDestino(String Destino) {
        this.Destino = Destino;
    }

    public String getEmpresa() {
        return Empresa;
    }

    public void setEmpresa(String Empresa) {
        this.Empresa = Empresa;
    }

    public int getCosto() {
        return Costo;
    }

    public void setCosto(int Costo) {
        this.Costo = Costo;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date Fecha) {
        this.Fecha = Fecha;
    }

    public String getHoraSalida() {
        return HoraSalida;
    }

    public void setHoraSalida(String HoraSalida) {
        this.HoraSalida = HoraSalida;
    }

    public String getHoraLlegada() {
        return HoraLlegada;
    }

    public void setHoraLlegada(String HoraLlegada) {
        this.HoraLlegada = HoraLlegada;
    }

    @Override
    public String toString() {
        return "Compra{" + "Destino=" + Destino + ", Empresa=" + Empresa + 
                ", Costo=" + Costo + ", Fecha=" + Fecha + ", HoraSalida=" + 
                HoraSalida + ", HoraLlegada=" + HoraLlegada + '}';
    }
   
   
}
