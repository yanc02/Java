




public class persona {

    private int id;
    private String nombre;
    private String apellido;
    private String cedula;


    /**Contructors*/
    public persona(int id, String nombre, String apellido, String cedula) {

        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;

    }


    public persona(){

    }

    /**  Getters and setters*/



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

}
