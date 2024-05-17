
/**
 * Write a description of class Reserva here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Reserva
{
    private Cliente cliente;
    private Vehiculo vehiculo;
    private Date fechaInicio;
    private Date fechafin;
    private double costoTotal;

    public Reserva() {
    }

    public Reserva(Cliente cliente, Vehiculo vehiculo, Date fechaInicio, Date fechafin, double costoTotal) {
        this.cliente = cliente;
        this.vehiculo = vehiculo;
        this.fechaInicio = fechaInicio;
        this.fechafin = fechafin;
        this.costoTotal = costoTotal;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public Date getFechafin() {
        return fechafin;
    }

    public double getCostoTotal() {
        return costoTotal;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public void setFechafin(Date fechafin) {
        this.fechafin = fechafin;
    }

    public void setCostoTotal(double costoTotal) {
        this.costoTotal = costoTotal;
    }
}
