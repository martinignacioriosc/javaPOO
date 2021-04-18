
public class Camioneta extends Vehiculo {

    //ATRIBUTOS //////////////////////////////////////////////////////////////////////
    private int capacidadCarga;
    private boolean dobleCabina;

    //METODOS CONSTRUCTORES //////////////////////////////////////////////////////////////////////
    public Camioneta() {
        this.capacidadCarga = 1;
        this.dobleCabina = false;
    }

    public Camioneta(int capacidadCarga, boolean dobleCabina) {
        this.capacidadCarga = capacidadCarga;
        this.dobleCabina = dobleCabina;
    }

    public Camioneta(int codigoVehiculo, String marca, int ano, int valorArriendo, Pais pais, int capacidadCarga, boolean dobleCabina) {
        super(codigoVehiculo, marca, ano, valorArriendo, pais);
        this.capacidadCarga = capacidadCarga;
        this.dobleCabina = dobleCabina;
    }

    //METODOS ACCESORES //////////////////////////////////////////////////////////////////////
    public int getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(int capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    public boolean isDobleCabina() {
        return dobleCabina;
    }

    public void setDobleCabina(boolean dobleCabina) {
        this.dobleCabina = dobleCabina;
    }

    @Override
    public Pais getPais() {
        return pais;
    }

    @Override
    public void setPais(Pais pais) {
        this.pais = pais;
    }

    //METODOS DE PUBLICACION //////////////////////////////////////////////////////////////////////
    @Override
    public void showAtributosVertical() {
        super.showAtributosVertical();
        System.out.println("Tipo de vehiculo    : Camioneta");
        System.out.println("Capacidad de carga  : " + this.capacidadCarga);
        System.out.println("Doble cabina        : " + this.dobleCabina);
    }

    @Override
    public void showAtributosHorizontal() {
        super.showAtributosHorizontal();
        String camioneta = "Camioneta";
        System.out.print("Camioneta");
        this.generaEspacios(camioneta, 16);
        System.out.print(this.capacidadCarga);
        this.generaEspacios(this.capacidadCarga, 14);
        System.out.print(this.dobleCabina);
        this.generaEspacios(this.dobleCabina, 10);
        System.out.println("");
    }

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
        super.disponibleArriendo();
    }

    @Override
    public void infoTotal() {
        this.showAtributosVertical();
        System.out.println("");
        this.soloMetodos();
    }
}
