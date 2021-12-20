package CapaNegocio;

import java.util.Date;


public class BoletaDigital extends Compra
{

    public BoletaDigital(int Total, String Destino, String Empresa, int Costo, Date Fecha, String HoraSalida, String HoraLlegada) {
        super(Destino, Empresa, Costo, Fecha, HoraSalida, HoraLlegada);
        this.Total = Total;
    }
    
    private int Total;

    public int getTotal() {
        return Total;
    }

    public void setTotal(int Total) {
        this.Total = Total;
    }
    
}