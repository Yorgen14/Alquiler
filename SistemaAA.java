
/**
 * Write a description of class SistemaAA here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.List;
import java.util.ArrayList;

public class SistemaAA {
    private List<Cliente> clientes;
    private List<Vehiculo> vehiculos;
    private List<Reserva> reservas;

    public SistemaAA() {
        clientes = new ArrayList<>();
        vehiculos = new ArrayList<>();
        reservas = new ArrayList<>();
    }

    
    public List<Cliente> getClientes() {
        return clientes;
    }

    public List<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public List<Reserva> getReservas() {
        return reservas;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    public void setVehiculos(List<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    public void setReservas(List<Reserva> reservas) {
        this.reservas = reservas;
    }
    
  
}
