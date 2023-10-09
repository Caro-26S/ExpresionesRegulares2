
package expresionesregulares2;

public class Persona {
    private String Nombre;
    private String Apellido;
    private String Tipo;
    private String Documento;
    private String Lugar;
    private String Nacionalidad;
    private String Correo;
    private String Contraseña;

    public Persona(String Nombre, String Apellido, String Tipo, String Documento, String Lugar, String Nacionalidad, String Correo, String Contraseña) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Tipo = Tipo;
        this.Documento = Documento;
        this.Lugar = Lugar;
        this.Nacionalidad = Nacionalidad;
        this.Correo = Correo;
        this.Contraseña = Contraseña;
    }
    
    public Persona() {
        this.Nombre = "";
        this.Apellido = "";
        this.Tipo = "";
        this.Documento = "";
        this.Lugar = "";
        this.Nacionalidad = "";
        this.Correo = "";
        this.Contraseña = "";
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public String getDocumento() {
        return Documento;
    }

    public void setDocumento(String Documento) {
        this.Documento = Documento;
    }

    public String getLugar() {
        return Lugar;
    }

    public void setLugar(String Lugar) {
        this.Lugar = Lugar;
    }

    public String getNacionalidad() {
        return Nacionalidad;
    }

    public void setNacionalidad(String Nacionalidad) {
        this.Nacionalidad = Nacionalidad;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }

    
    
}
