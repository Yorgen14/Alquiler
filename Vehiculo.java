
/**
 * Write a description of class Vehiculo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Vehiculo
{
    private String modelo;
    private String anio;
    private String placa;
    private double tarifadiaria;
    private boolean disponible;

    public Vehiculo() {
    }

    public Vehiculo(String modelo, String anio, String placa, double tarifadiaria, boolean disponible) {
        this.modelo = modelo;
        this.anio = anio;
        this.placa = placa;
        this.tarifadiaria = tarifadiaria;
        this.disponible = disponible;
    }

    public String getModelo() {
        return modelo;
    }

    public String getAnio() {
        return anio;
    }

    public String getPlaca() {
        return placa;
    }

    public double getTarifadiaria() {
        return tarifadiaria;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setTarifadiaria(double tarifadiaria) {
        this.tarifadiaria = tarifadiaria;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
}
