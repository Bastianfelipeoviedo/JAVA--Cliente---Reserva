package reservaempresa;

/**
 *
 * @author Bastian
 */
public class Cliente {
    
  
    // 1.- Definicion de atributos (SIEMPRE PRIVADOS)
        private String nombre;
        private String apellido;
        private int edad;
        private int celular;
        private String correoElectronico;
        private boolean Nuevo;
   
public Cliente ()
{
     // 2.- Creación de método constructor sin parámetros de entrada
    // Su objetivo es creat objetos con valores por defecto
    
    this.nombre =  " ";
    this.apellido = " ";
    this.celular = 0;
    this.correoElectronico = "";
    this.edad = 0;
    
}

    // 3.- Métodos Accesadores(GET) y Mutadores(SET)

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public boolean isNuevo() {
        return Nuevo;
    }

    public void setNuevo(boolean Nuevo) {
        this.Nuevo = Nuevo;
    }

    

    public void mostrarInformacioncliente()
    {
    
        
        System.out.println("Nombre Cliente                 : " + getNombre() );
        System.out.println("Apellido Cliente               : " + getApellido());
        System.out.println("Edad Cliente                   : " + getEdad());
        System.out.println("Celular Cliente                : " + getCelular());
        System.out.println("Correo Electronico             : " +getCorreoElectronico());
        System.out.println("Cliente Nuevo              : " +isNuevo());
    }
        















}
   

        





    
    


