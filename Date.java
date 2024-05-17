
/**
 * Write a description of class Date here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Date
{
    private int dia;
    private int mes;
    private int anio;

    public Date() {
    }

    public Date(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
}
