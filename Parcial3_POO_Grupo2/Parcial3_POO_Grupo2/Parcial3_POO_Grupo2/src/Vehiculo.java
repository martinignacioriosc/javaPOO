
abstract class Vehiculo {

    //ATRIBUTOS //////////////////////////////////////////////////////////////////////
    private int codigoVehiculo, ano, valorArriendo;
    private String marca;
    Pais pais;

    //METODOS CONSTRUCTORES //////////////////////////////////////////////////////////////////////
    public Vehiculo() {
        this.codigoVehiculo = 1;
        this.marca = "NA";
        this.ano = 1;
        this.valorArriendo = 1;
        this.pais = new Pais();
    }

    public Vehiculo(int codigoVehiculo) {
        this.codigoVehiculo = codigoVehiculo;
        this.marca = "NA";
        this.ano = 1;
        this.valorArriendo = 1;
        this.pais = new Pais();
    }

    public Vehiculo(int codigoVehiculo, String marca) {
        this.codigoVehiculo = codigoVehiculo;
        this.marca = marca;
        this.ano = 1;
        this.valorArriendo = 1;
        this.pais = new Pais();
    }

    public Vehiculo(int codigoVehiculo, String marca, int ano) {
        this.codigoVehiculo = codigoVehiculo;
        this.marca = marca;
        this.ano = 1;
        this.valorArriendo = 1;
        this.pais = new Pais();
    }

    public Vehiculo(int codigoVehiculo, String marca, int ano, int valorArriendo) {
        this.codigoVehiculo = codigoVehiculo;
        this.marca = marca;
        this.ano = ano;
        this.valorArriendo = valorArriendo;
        this.pais = new Pais();
    }

    public Vehiculo(int codigoVehiculo, String marca, int ano, int valorArriendo, Pais pais) {
        this.codigoVehiculo = codigoVehiculo;
        this.marca = marca;
        this.ano = ano;
        this.valorArriendo = valorArriendo;
        this.pais = pais;
    }

    //METODOS ACCESORES //////////////////////////////////////////////////////////////////////
    public int getCodigoVehiculo() {
        return codigoVehiculo;
    }

    public void setCodigoVehiculo(int codigoVehiculo) {
        this.codigoVehiculo = codigoVehiculo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int año) {
        this.ano = año;
    }

    public int getValorArriendo() {
        return valorArriendo;
    }

    public void setValorArriendo(int valorArriendo) {
        this.valorArriendo = valorArriendo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    //METODOS OPERACIONALES //////////////////////////////////////////////////////////////////////
    public String disponibleArriendo() {
        return "Vehiculo disponible para arriendo.";
    }

    //METODOS DE PUBLICACION //////////////////////////////////////////////////////////////////////
    public void showAtributosVertical() {
        System.out.println("Código vehículo     : " + this.codigoVehiculo);
        System.out.println("Marca               : " + this.marca);
        System.out.println("Año                 : " + this.ano);
        System.out.println("Valor de arriendo   : " + this.valorArriendo);
        System.out.println("País de fabricación : " + this.pais.getNombrePais());
    }

    public void showAtributosHorizontal() {
        System.out.print(this.codigoVehiculo);
        this.generaEspacios(this.codigoVehiculo, 12);
        System.out.print(this.ano);
        this.generaEspacios(this.ano, 12);
        System.out.print(this.marca);
        this.generaEspacios(this.marca, 12);
        System.out.print(this.pais.getNombrePais());
        this.generaEspacios(this.pais.getNombrePais(), 12);
        System.out.print(this.valorArriendo);
        this.generaEspacios(this.valorArriendo, 12);

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
        this.disponibleArriendo();
    }

    public void infoTotal() {
        this.showAtributosVertical();
        System.out.println("");
        this.soloMetodos();
    }

}
