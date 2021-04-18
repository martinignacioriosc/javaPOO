
public class Cliente extends Persona {

    //ATRIBUTOS //////////////////////////////////////////////////////////////////////
    int codCliente, antiguedadLab;
    String tipoCliente;

    //METODOS CONSTRUCTORES //////////////////////////////////////////////////////////////////////
    public Cliente() {
        this.codCliente = 1;
        this.antiguedadLab = 1;
        this.tipoCliente = "NA";
    }

    public Cliente(int codCliente, int antiguedadLab, String tipoCliente) {
        this.codCliente = codCliente;
        this.antiguedadLab = antiguedadLab;
        this.tipoCliente = tipoCliente;
    }

    public Cliente(String nombre, String rut, String ciudad, String sexo, int edad, int codCliente, int antiguedadLab, String tipoCliente) {
        super(nombre, rut, ciudad, sexo, edad);
        this.codCliente = codCliente;
        this.antiguedadLab = antiguedadLab;
        this.tipoCliente = tipoCliente;
    }

    //METODOS ACCESORES //////////////////////////////////////////////////////////////////////
    public void setCodCliente(int codCliente) {
        this.codCliente = codCliente;
    }

    public int getCodCliente() {
        return codCliente;
    }

    public void setAntiguedadLab(int antiguedadLab) {
        this.antiguedadLab = antiguedadLab;
    }

    public int getAntiguedadLab() {
        return antiguedadLab;
    }

    public void setTipoCliente(String tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public String getTipoCliente() {
        return tipoCliente;
    }

    //METODOS OPERACIONALES //////////////////////////////////////////////////////////////////////
    public String cotizarArriendo() {
        return "El cliente cotiza arriendos.";
    }

    public void pagarArriendo() {
        System.out.println("El cliente paga arriendo.");
    }

    //METODOS DE PUBLICACION //////////////////////////////////////////////////////////////////////
    @Override
    public void showAtributosVertical() {
        super.showAtributosVertical();
        System.out.println("Codigo cliente      : " + this.codCliente);
        System.out.println("Antiguedad laboral  : " + this.antiguedadLab);
        System.out.println("Tipo cliente        : " + this.tipoCliente);
    }

    @Override
    public void showAtributosHorizontal() {
        super.showAtributosHorizontal();
        System.out.print(this.getCodCliente());
        this.generaEspacios(this.getCodCliente(), 16);
        System.out.print(this.getAntiguedadLab());
        this.generaEspacios(this.antiguedadLab, 16);
        System.out.print(this.tipoCliente);
        this.generaEspacios(this.tipoCliente, 12);
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
        this.cotizarArriendo();
        this.pagarArriendo();
    }

    @Override
    public void infoTotal() {
        this.showAtributosVertical();
        System.out.println("");
        this.soloMetodos();
        
    }
}





