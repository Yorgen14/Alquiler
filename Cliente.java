
/**
 * Write a description of class Cliente here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cliente
{
     private String nombre;
    private String direccion;
    private String numero;
    private String email;
    private int clienteid;

    public Cliente() {
    }

    public Cliente(String nombre, String direccion, String numero, String email, int clienteid) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.numero = numero;
        this.email = email;
        this.clienteid = clienteid;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getNumero() {
        return numero;
    }

    public String getEmail() {
        return email;
    }

    public int getClienteid() {
        return clienteid;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setClienteid(int clienteid) {
        this.clienteid = clienteid;
    }
    
}
