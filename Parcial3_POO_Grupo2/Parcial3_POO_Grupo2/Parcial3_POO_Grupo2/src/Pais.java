
public class Pais {

    //ATRIBUTOS //////////////////////////////////////////////////////////////////////
    private int codigoPais;
    private String nombre;

    //METODOS CONSTRUCTORES //////////////////////////////////////////////////////////////////////
    public Pais() {
        this.codigoPais = 1;
        this.nombre = "NA";
    }

    public Pais(String nombre) {
        this.nombre = nombre;
    }

    public Pais(int codigoPais, String nombre) {
        this.codigoPais = codigoPais;
        this.nombre = nombre;
    }

    //METODOS ACCESORES //////////////////////////////////////////////////////////////////////
    public int getCodigoPais() {
        return codigoPais;
    }

    public void setCodigoPais(int codigoPais) {
        this.codigoPais = codigoPais;
    }

    public String getNombrePais() {
        return nombre;
    }

    public void setNombrePais(String nombre) {
        this.nombre = nombre;
    }

    //METODOS OPERACIONALES //////////////////////////////////////////////////////////////////////
    public void bandera(){
        System.out.println("Tiene bandera.");
    }
    
    //METODOS DE PUBLICACION //////////////////////////////////////////////////////////////////////
    public void showAtributosVertical() {
        System.out.println("Código país : "+this.codigoPais);
        System.out.println("Nombre país : "+this.nombre);
    }

    public void showAtributosHorizontal() {
        System.out.print(this.codigoPais);
        this.generaEspacios(this.codigoPais, 10);
        System.out.print(this.nombre);
        this.generaEspacios(this.nombre, 20);
    }

    public void generaEspacios(Object atri, int largoFormato) {
        int pal = 0, largo;
        largo = atri.toString().length();
        pal = largoFormato - largo;
        for (int i = 0; i < pal; i++) {
            System.out.print(" ");
        }
    }

    public void soloMetodos() {
        this.bandera();
    }

    public void infoTotal() {
        this.showAtributosVertical();
        System.out.println("");
        this.soloMetodos();
    }

}




