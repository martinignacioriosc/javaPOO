
public class Arriendo {

    //ATRIBUTOS  //////////////////////////////////////////////////////////////////////
    private int codArriendo, dia, ano, diasArriendo, costoTotalArriendo;
    private String mes;
    Vehiculo vehiculo;
    Cliente cliente;
    Vendedor vendedor;

    //METODOS CONSTRUCTORES //////////////////////////////////////////////////////////////////////
    public Arriendo() {
        this.codArriendo = 1;
        this.dia = 1;
        this.mes = "NA";
        this.ano = 1;
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.diasArriendo = 1;
        this.costoTotalArriendo = 1;

    }

    public Arriendo(int codArriendo, int dia, String mes, int ano, Cliente cliente, Vendedor vendedor, Vehiculo vehiculo) {
        this.codArriendo = codArriendo;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.vehiculo = vehiculo;
        this.diasArriendo = 1;
        this.costoTotalArriendo = 1;

    }

    public Arriendo(int codArriendo, int dia, String mes, int ano, Cliente cliente, Vendedor vendedor, Vehiculo vehiculo, int diasArriendo, int costoTotalArriendo) {
        this.codArriendo = codArriendo;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.vehiculo = vehiculo;
        this.diasArriendo = diasArriendo;
        this.costoTotalArriendo = costoTotalArriendo;

    }

    //METODOS ACCESORES //////////////////////////////////////////////////////////////////////
    public int getCodArriendo() {
        return codArriendo;
    }

    public void setCodArriendo(int codArriendo) {
        this.codArriendo = codArriendo;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getDiasArriendo() {
        return diasArriendo;
    }

    public void setDiasArriendo(int diasArriendo) {
        this.diasArriendo = diasArriendo;
    }

    public int getCostoArriendo() {
        return costoTotalArriendo;
    }

    public void setCostoArriendo(int costoArriendo) {
        this.costoTotalArriendo = costoArriendo;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    //METODOS OPERACIONALES //////////////////////////////////////////////////////////////////////
    public void aprobadoArriendo() {
        System.out.println("Arriendo aprobado...");
    }

    //METODOS DE PUBLICACION //////////////////////////////////////////////////////////////////////
    public void showAtributosVertical() {
        System.out.println("Nro de arriendo : " + this.codArriendo);
        System.out.println("Día             : " + this.dia);
        System.out.println("Mes             : " + this.mes);
        System.out.println("Año             : " + this.ano);
        System.out.println("Cliente         : " + this.cliente);
        System.out.println("Vendedor        : " + this.vendedor);
        System.out.println("Vehículo        : " + this.vehiculo);
        System.out.println("Días arriendo   : " + this.diasArriendo);
        System.out.println("Costo total     : " + this.costoTotalArriendo);
    }

    public void showAtributosHorizontal() {
        System.out.print(this.codArriendo);
        this.generaespacios(this.codArriendo, 10);
        System.out.print(this.dia);
        this.generaespacios(this.dia, 10);
        System.out.print(this.mes);
        this.generaespacios(this.mes, 10);
        System.out.print(this.ano);
        this.generaespacios(this.ano, 10);
        System.out.print(this.cliente.nombre);
        this.generaespacios(this.cliente.nombre, 16);
        System.out.print(this.cliente.codCliente);
        this.generaespacios(this.cliente.codCliente, 14);
        System.out.print(this.vendedor.nombre);
        this.generaespacios(this.vendedor.nombre, 14);
        System.out.print(this.vendedor.codEmpleado);
        this.generaespacios(this.vendedor.codEmpleado, 14);
        System.out.print(this.vehiculo.getMarca());
        this.generaespacios(this.vehiculo.getMarca(), 14);
        System.out.print(this.vehiculo.getCodigoVehiculo());
        this.generaespacios(this.vehiculo.getCodigoVehiculo(), 14);
        System.out.print(this.diasArriendo);
        this.generaespacios(this.diasArriendo, 12);
        System.out.println(this.costoTotalArriendo);
        this.generaespacios(this.costoTotalArriendo, 12);
    }

    public void generaespacios(Object atri, int largoFormato) {
        int pal = 0, largo;
        largo = atri.toString().length();
        pal = largoFormato - largo;
        for (int i = 0; i < pal; i++) {
            System.out.print(" ");
        }
    }

    public void soloMetodos() {
        this.aprobadoArriendo();
    }

    public void infoTotal() {
        this.showAtributosVertical();
        System.out.println("");
        this.soloMetodos();
    }
}
