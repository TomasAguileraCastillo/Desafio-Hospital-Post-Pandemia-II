package cl.praxis.DesafioHospitalPostPandemia_II.model.dto;

public class Patients {

    //Atributos
    private int id ;
    private String rut;
    private String nombre;
    private String apellido;
    private String direccion ;
    private String telefono;
    private String correo;
    private String nombreContacto;
    private int telefonoContacto;
    private String diagnostico;

    //Constructor Vacio


    public Patients() {
    }

    //Constructor Completo

    public Patients(int id, String rut, String nombre, String apellido, String direccion, String telefono, String correo, String nombreContacto, int telefonoContacto, String diagnostico) {
        this.id = id;
        this.rut = rut;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correo = correo;
        this.nombreContacto = nombreContacto;
        this.telefonoContacto = telefonoContacto;
        this.diagnostico = diagnostico;
    }


    //Metodos

    @Override
    public String toString() {
        return "Patients{" +
                "id=" + id +
                ", rut='" + rut + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                ", correo='" + correo + '\'' +
                ", nombreContacto='" + nombreContacto + '\'' +
                ", telefonoContacto=" + telefonoContacto +
                ", diagnostico='" + diagnostico + '\'' +
                '}';
    }


    //Getters y Setters


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNombreContacto() {
        return nombreContacto;
    }

    public void setNombreContacto(String nombreContacto) {
        this.nombreContacto = nombreContacto;
    }

    public int getTelefonoContacto() {
        return telefonoContacto;
    }

    public void setTelefonoContacto(int telefonoContacto) {
        this.telefonoContacto = telefonoContacto;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }
}
