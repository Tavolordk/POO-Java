package paquete1;

public class Usuario {
  //Acceso por defecto este acceso lo podemos a todas las clases del mismo paquete
   String password;
   //Todos tanto internos como externos pueden acceder a el
    public String nombre;
    //Es el mas restringido y solo la misma clase puede acceder a el
    private String direccion;
    //Estos solo tienen acceso los hijos
    protected long sueldo;
    String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    protected long getSueldo() {
        return sueldo;
    }
    public void setSueldo(long sueldo) {
        this.sueldo = sueldo;
    }

    
}
