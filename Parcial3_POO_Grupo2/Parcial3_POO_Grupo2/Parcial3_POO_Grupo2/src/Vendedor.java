
public class Vendedor extends Persona {
    
    //ATRIBUTOS  ////////////////////////////////////////////////////////////////////// 
    int codEmpleado;
    String cargo, jornada;

    //METODOS CONSTRUCTORES //////////////////////////////////////////////////////////////////////
    public Vendedor() {
        super.nombre = "NA";
        super.rut = "NA";
        super.ciudad = "NA";
        super.sexo = "NA";
        super.edad = 1;
        this.codEmpleado = 1;
        this.cargo = "NA";
        this.jornada = "NA";
    }

    public Vendedor(int codEmpleado, String cargo, String jornada) {
        super.nombre = "NA";
        super.rut = "NA";
        super.ciudad = "NA";
        super.sexo = "NA";
        super.edad = 1;
        this.codEmpleado = codEmpleado;
        this.cargo = cargo;
        this.jornada = jornada;
    }

    public Vendedor(String nombre, String rut, String ciudad, String sexo, int edad, int codEmpleado, String cargo, String jornada) {
        super(nombre, rut, ciudad, sexo, edad);
        this.codEmpleado = codEmpleado;
        this.cargo = cargo;
        this.jornada = jornada;
    }

    //METODOS ACCESORES //////////////////////////////////////////////////////////////////////
    public void setCodEmpleado(int codEmpleado) {
        this.codEmpleado = codEmpleado;

    }

    public int getCodEmpleado() {
        return codEmpleado;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;

    }

    public String getCargo() {
        return cargo;
    }

    public void setJornada(String jornada) {
        this.jornada = jornada;

    }

    public String getJornada() {
        return jornada;
    }

    //METODOS OPERACIONALES //////////////////////////////////////////////////////////////////////
    public void realizarArriendo() {
        System.out.println("El vendedor realiza un Arriendo.");
    }

    //METODOS DE PUBLICACION //////////////////////////////////////////////////////////////////////
    @Override
    public void showAtributosVertical() {
        super.showAtributosVertical();
        System.out.println("El codigo del empleado es  : " + this.codEmpleado);
        System.out.println("El cargo del empleado es   : " + this.cargo);
        System.out.println("La jornada del empleado es : " + this.jornada);
    }

    @Override
    public void showAtributosHorizontal() {
        super.showAtributosHorizontal();
        System.out.print(this.codEmpleado);
        this.generaEspacios(this.codEmpleado, 10);
        System.out.print(this.cargo);
        this.generaEspacios(this.cargo, 12);
        System.out.print(this.jornada);
        this.generaEspacios(this.jornada, 8);

    }

    @Override
    public void generaEspacios(Object atri, int largoFormato) {
        int pal = 0, largo;
        largo = atri.toString().length();
        pal = largoFormato - largo;
        for (int i = 0; i < pal; i++) {
            System.out.print(" ");
        }
    }
    @Override
    public void soloMetodos() {
        super.gastarDinero();
    }

    @Override
    public void infoTotal() {
        this.showAtributosVertical();
        System.out.println("");
        this.soloMetodos();
    }

}





