
abstract class Persona {

    //ATRIBUTOS  //////////////////////////////////////////////////////////////////////
    String nombre, rut, ciudad, sexo;
    int edad;

    //METODOS CONSTRUCTORES //////////////////////////////////////////////////////////////////////
    public Persona() {
        this.nombre = "NA";
        this.rut = "NA";
        this.ciudad = "NA";
        this.sexo = "NA";
        this.edad = 1;
    }

    public Persona(String nombre) {
        this.nombre = nombre;
        this.rut = "NA";
        this.ciudad = "NA";
        this.sexo = "NA";
        this.edad = 1;
    }

    public Persona(String nombre, String rut) {
        this.nombre = nombre;
        this.rut = rut;
        this.ciudad = "NA";
        this.sexo = "NA";
        this.edad = 1;
    }

    public Persona(String nombre, String rut, String ciudad) {
        this.nombre = nombre;
        this.rut = rut;
        this.ciudad = ciudad;
        this.sexo = "NA";
        this.edad = 1;
    }

    public Persona(String nombre, String rut, String ciudad, String sexo) {
        this.nombre = nombre;
        this.rut = rut;
        this.ciudad = ciudad;
        this.sexo = sexo;
        this.edad = 1;
    }

    public Persona(String nombre, String rut, String ciudad, String sexo, int edad) {
        this.nombre = nombre;
        this.rut = rut;
        this.ciudad = ciudad;
        this.sexo = sexo;
        this.edad = edad;
    }

    //METODOS ACCESORES //////////////////////////////////////////////////////////////////////
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {

        this.sexo = sexo;
    }


public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    //METODOS OPERACIONALES //////////////////////////////////////////////////////////////////////
    public String gastarDinero() {
        return "Puede gastar dinero.";
    }

    public void socilizar() {
        System.out.println("Puede socializar.");
    }

    //METODOS DE PUBLICACION //////////////////////////////////////////////////////////////////////
    public void showAtributosVertical(){
        System.out.println("Nombre      : " + this.nombre);
        System.out.println("Rut         : " + this.rut);
        System.out.println("Ciudad      : " + this.ciudad);
        System.out.println("Sexo        : " + this.sexo);
        System.out.println("Edad        : " + this.edad);
    }
   
    public void showAtributosHorizontal() {
        System.out.print(this.nombre);
        this.generaEspacios(this.nombre, 14);
        System.out.print(this.rut);
        this.generaEspacios(this.rut, 12);
        System.out.print(this.ciudad);
        this.generaEspacios(this.ciudad, 12);
        System.out.print(this.sexo);
        this.generaEspacios(this.sexo, 14);
        System.out.print(this.edad);
        this.generaEspacios(this.edad, 12);
    }

    public void generaEspacios(Object atri, int largoFormato) {
        int pal = 0, largo;
        largo = atri.toString().length();
        pal = largoFormato - largo;
        for (int i = 0; i < pal; i++) {
            System.out.print(" ");
        }
    }
 
    public void soloMetodos(){
        this.gastarDinero();
    }
    
    public void infoTotal(){
        this.showAtributosVertical();
        System.out.println("");
        this.soloMetodos();
    }
}

