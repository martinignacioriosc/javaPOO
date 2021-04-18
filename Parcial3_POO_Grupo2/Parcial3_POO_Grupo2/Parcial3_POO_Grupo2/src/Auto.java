
public class Auto extends Vehiculo {

    //ATRIBUTOS //////////////////////////////////////////////////////////////////////
    private String portaEquipaje;
    private String tipoAuto;

    //METODOS CONSTRUCTORES //////////////////////////////////////////////////////////////////////
    public Auto() {
        this.portaEquipaje = "NA";
        this.tipoAuto = "NA";
    }

    public Auto(String portaEquipaje, String tipoAuto) {
        this.portaEquipaje = portaEquipaje;
        this.tipoAuto = tipoAuto;
    }

    public Auto(int codigoVehiculo, String marca, int ano, int valorArriendo, Pais pais, String portaEquipaje, String tipoAuto) {
        super(codigoVehiculo, marca, ano, valorArriendo, pais);
        this.portaEquipaje = portaEquipaje;
        this.tipoAuto = tipoAuto;
    }

    //METODOS ACCESORES //////////////////////////////////////////////////////////////////////
    public String getPortaEquipaje() {
        return portaEquipaje;
    }

    public void setPortaEquipaje(String portaEquipaje) {
        this.portaEquipaje = portaEquipaje;
    }

    public String getTipoAuto() {
        return tipoAuto;
    }

    public void setTipoAuto(String tipoAuto) {
        this.tipoAuto = tipoAuto;
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
        System.out.println("Tipo de vehiculo: Auto");
        System.out.println("Portaequipaje   : " + this.portaEquipaje);
        System.out.println("Tipo auto       : " + this.tipoAuto);
    }

    @Override
    public void showAtributosHorizontal() {

        super.showAtributosHorizontal();
        String auto = "Auto";
        System.out.print("Auto");
        this.generaEspacios(auto, 12);
        System.out.print(this.portaEquipaje);
        this.generaEspacios(this.portaEquipaje, 14);
        System.out.print(this.tipoAuto);
        this.generaEspacios(this.tipoAuto, 14);
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
