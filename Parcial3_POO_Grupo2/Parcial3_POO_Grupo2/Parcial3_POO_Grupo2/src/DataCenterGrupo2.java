
import java.util.ArrayList;

public class DataCenterGrupo2 {

    //INICIALIZACION DE ARRAYLIST
    ArrayList<Vendedor> listVendedor = new ArrayList<>();
    ArrayList<Cliente> listCliente = new ArrayList<>();
    ArrayList<Camioneta> listCamioneta = new ArrayList<>();
    ArrayList<Auto> listAuto = new ArrayList<>();
    ArrayList<Arriendo> listArriendo = new ArrayList<>();
    ArrayList<Pais> listPais = new ArrayList<>();

    ///////////////////////////////////////////////////////////////////////////
    //METODOS ALMACEN VENDEDOR
    public boolean buscarIdVendedor(int idBusqueda) {
        int x = 0;
        boolean buscado = false;
        while (x < listVendedor.size()) {
            Vendedor auxiliar = this.listVendedor.get(x);
            if (idBusqueda == auxiliar.codEmpleado) {
                buscado = true;
                break;
            }
            x++;
        }
        return buscado;
    }

    public Vendedor returnVendedor(int idBusqueda) {
        int x = 0;
        boolean buscado = false;
        buscado = this.buscarIdVendedor(idBusqueda);

        if (buscado) {
            while (x < listVendedor.size()) {
                Vendedor auxiliar = this.listVendedor.get(x);
                if (idBusqueda == auxiliar.codEmpleado) {
                    return auxiliar;
                }
                x++;
            }
        }
        return null;
    }

    public void addVendedor(Vendedor vendedor) {
        this.listVendedor.add(vendedor);
    }

    public void removeVendedor(Vendedor vendedor) {
        this.listVendedor.remove(vendedor);
    }

    ///////////////////////////////////////////////////////////////////////////
    //METODOS ALMACEN CLIENTE
    public boolean buscarCodCliente(int idBusqueda) {
        int x = 0;
        boolean buscado = false;
        while (x < listCliente.size()) {
            Cliente auxiliar = this.listCliente.get(x);
            if (idBusqueda == auxiliar.codCliente) {
                buscado = true;
                break;
            }
            x++;
        }
        return buscado;
    }

    public Cliente returnCliente(int idBusqueda) {
        int x = 0;
        boolean buscado = false;
        buscado = this.buscarCodCliente(idBusqueda);

        if (buscado) {
            while (x < listCliente.size()) {
                Cliente auxiliar = this.listCliente.get(x);
                if (idBusqueda == auxiliar.codCliente) {
                    return auxiliar;
                }
                x++;
            }
        }
        return null;
    }

    public void addCliente(Cliente cliente) {
        this.listCliente.add(cliente);
    }

    public void removeCliente(Cliente cliente) {
        this.listCliente.remove(cliente);
    }

    //METODOS ALMACEN CLIENTE, PARA REPORTES
    //REPORTE DE CLIENTE POR CIUDAD
    public ArrayList<Cliente> returnClienteCiudad(String ciudadBuscada) {
        ArrayList<Cliente> listaTemp = new ArrayList<>();
        int x = 0;
        while (x < this.listCliente.size()) {
            Cliente paso = this.listCliente.get(x);
            if (paso.getCiudad().equals(ciudadBuscada)) {
                listaTemp.add(paso);

            }
            x++;
        }
        return listaTemp;
    }

    //REPORTE DE CLIENTE POR TIPO
    public ArrayList<Cliente> returnClienteTipo(String tipoCliente) {
        ArrayList<Cliente> listaTemp = new ArrayList<>();
        int x = 0;

        while (x < this.listCliente.size()) {
            Cliente paso = this.listCliente.get(x);
            if (paso.getTipoCliente().equals(tipoCliente)) {
                listaTemp.add(paso);
            }
            x++;

        }
        return listaTemp;

    }

    //REPORTE CLIENTE POR SEXO
    public ArrayList<Cliente> returnClienteSexo(String sexoCliente) {
        ArrayList<Cliente> listaTemp = new ArrayList<>();
        int x = 0;

        while (x < this.listCliente.size()) {
            Cliente paso = this.listCliente.get(x);
            if (paso.getSexo().equals(sexoCliente)) {
                listaTemp.add(paso);
            }
            x++;
        }
        return listaTemp;
    }

    //REPORTE CLIENTES POR ANTIGUEDAD LAB +6
    public ArrayList<Cliente> returnClienteAntiguedad() {
        ArrayList<Cliente> listaTemp = new ArrayList<>();
        int x = 0;

        while (x < this.listCliente.size()) {
            Cliente paso = this.listCliente.get(x);
            if (paso.antiguedadLab >= 6) {
                listaTemp.add(paso);
            }
            x++;
        }
        return listaTemp;
    }

///////////////////////////////////////////////////////////////////////////
//METODOS ALMACEN CAMIONETA
    public boolean buscarIdCamioneta(int idBusqueda) {
        int x = 0;
        boolean buscado = false;
        while (x < listCamioneta.size()) {
            Camioneta auxiliar = this.listCamioneta.get(x);
            if (idBusqueda == auxiliar.getCodigoVehiculo()) {
                buscado = true;
                break;
            }
            x++;
        }
        return buscado;
    }

    public Camioneta returnCamioneta(int idBusqueda) {
        int x = 0;
        boolean buscado = false;
        buscado = this.buscarIdCamioneta(idBusqueda);

        if (buscado) {
            while (x < listCamioneta.size()) {
                Camioneta auxiliar = this.listCamioneta.get(x);
                if (idBusqueda == auxiliar.getCodigoVehiculo()) {
                    return auxiliar;
                }
                x++;
            }

        }
        return null;
    }

    public void addCamioneta(Camioneta camioneta) {
        this.listCamioneta.add(camioneta);
    }

    public void removeCamioneta(Camioneta camioneta) {
        this.listCamioneta.remove(camioneta);
    }

    public ArrayList<Camioneta> returnCamionetaPais(int codPaisBuscado) {
        ArrayList<Camioneta> listaTemp = new ArrayList<>();
        int x = 0;
        while (x < this.listCamioneta.size()) {
            Camioneta paso = this.listCamioneta.get(x);
            if (paso.pais.getCodigoPais() == codPaisBuscado) {
                listaTemp.add(paso);

            }
            x++;
        }
        return listaTemp;
    }

    public ArrayList<Camioneta> returnTipoCamioneta() {
        return this.listCamioneta;
    }

    public ArrayList<Camioneta> returnCamioneta2015() {
        ArrayList<Camioneta> listaTemp = new ArrayList<>();
        int x = 0;
        while (x < this.listCamioneta.size()) {
            Camioneta paso = this.listCamioneta.get(x);
            if (paso.getAno() > 2015) {
                listaTemp.add(paso);

            }
            x++;
        }
        return listaTemp;
    }

    public ArrayList<Camioneta> returnCamionetaMarca(String marcaVehiculo) {
        ArrayList<Camioneta> listaTemp = new ArrayList<>();
        int x = 0;
        while (x < this.listCamioneta.size()) {
            Camioneta paso = this.listCamioneta.get(x);
            if (paso.getMarca().equals(marcaVehiculo)) {
                listaTemp.add(paso);

            }
            x++;
        }
        return listaTemp;
    }

    ///////////////////////////////////////////////////////////////////////////
    //METODOS ALMACEN AUTOS
    public boolean buscarIdAuto(int idAuto) {
        int x = 0;
        boolean buscado = false;
        while (x < listAuto.size()) {
            Auto auxiliar = this.listAuto.get(x);
            if (idAuto == auxiliar.getCodigoVehiculo()) {
                buscado = true;
                break;
            }
            x++;
        }
        return buscado;
    }

    public Auto returnAuto(int idAuto) {
        int x = 0;
        boolean buscado = false;
        buscado = this.buscarIdAuto(idAuto);

        if (buscado) {
            while (x < listAuto.size()) {
                Auto auxiliar = this.listAuto.get(x);
                if (idAuto == auxiliar.getCodigoVehiculo()) {
                    return auxiliar;
                }
                x++;
            }

        }
        return null;
    }

    public void addAuto(Auto auto) {
        this.listAuto.add(auto);
    }

    public void removeAuto(Auto auto) {
        this.listAuto.remove(auto);

    }

    public ArrayList<Auto> returnAutoPais(int codPaisBuscado) {
        ArrayList<Auto> listaTemp = new ArrayList<>();
        int x = 0;
        while (x < this.listAuto.size()) {
            Auto paso = this.listAuto.get(x);
            if (paso.pais.getCodigoPais() == codPaisBuscado) {
                listaTemp.add(paso);

            }
            x++;
        }
        return listaTemp;
    }

    public ArrayList<Auto> returnTipoAuto() {
        return this.listAuto;
    }

    public ArrayList<Auto> returnAuto2015() {
        ArrayList<Auto> listaTemp = new ArrayList<>();
        int x = 0;
        while (x < this.listAuto.size()) {
            Auto paso = this.listAuto.get(x);
            if (paso.getAno() > 2015) {
                listaTemp.add(paso);

            }
            x++;
        }
        return listaTemp;
    }

    public ArrayList<Auto> returnAutoMarca(String marcaVehiculo) {
        ArrayList<Auto> listaTemp = new ArrayList<>();
        int x = 0;
        while (x < this.listAuto.size()) {
            Auto paso = this.listAuto.get(x);
            if (paso.getMarca().equals(marcaVehiculo)) {
                listaTemp.add(paso);

            }
            x++;
        }
        return listaTemp;
    }

    ///////////////////////////////////////////////////////////////////////////
    //METODOS ALMACEN ARRIENDOS
    public boolean buscarIdArriendo(int idArriendo) {
        int x = 0;
        boolean buscado = false;
        while (x < listArriendo.size()) {
            Arriendo auxiliar = this.listArriendo.get(x);
            if (idArriendo == auxiliar.getCodArriendo()) {
                buscado = true;
                break;
            }
            x++;
        }
        return buscado;
    }

    public Arriendo returnArriendo(int idArriendo) {
        int x = 0;
        boolean buscado = false;
        buscado = this.buscarIdArriendo(idArriendo);

        if (buscado) {
            while (x < listArriendo.size()) {
                Arriendo auxiliar = this.listArriendo.get(x);
                if (idArriendo == auxiliar.getCodArriendo()) {
                    return auxiliar;
                }
                x++;
            }

        }
        return null;
    }

    public void addArriendo(Arriendo arriendo) {
        this.listArriendo.add(arriendo);
    }

    public void removeArriendo(Arriendo arriendo) {
        this.listArriendo.remove(arriendo);
    }

    public ArrayList<Arriendo> returnArriendoMes(String mesArriendo) {
        ArrayList<Arriendo> listaTemp = new ArrayList<>();
        int x = 0;
        while (x < this.listArriendo.size()) {
            Arriendo paso = this.listArriendo.get(x);
            if (paso.getMes().equals(mesArriendo)) {
                listaTemp.add(paso);
            }
            x++;
        }
        return listaTemp;
    }

    public ArrayList<Arriendo> returnArriendoVendedor(int codigoVendedor) {
        ArrayList<Arriendo> listaTemp = new ArrayList<>();
        int x = 0;
        while (x < this.listArriendo.size()) {
            Arriendo paso = this.listArriendo.get(x);
            if (paso.vendedor.codEmpleado == codigoVendedor) {
                listaTemp.add(paso);
            }
            x++;
        }
        return listaTemp;
    }

    public ArrayList<Arriendo> returnArriendoCliente2020(int codigoCliente) {
        ArrayList<Arriendo> listaTemp = new ArrayList<>();
        int x = 0;
        while (x < this.listArriendo.size()) {
            Arriendo paso = this.listArriendo.get(x);
            if (paso.cliente.codCliente == codigoCliente && paso.getAno() == 2020) {
                listaTemp.add(paso);
            }
            x++;
        }
        return listaTemp;
    }

    //SUMADOR DE TOTAL DE ARRIENDOS 2020
    public int returnArriendo2020Total(int codigoCliente) {
        ArrayList<Arriendo> listaTemp = new ArrayList<>();
        int x = 0, sumaValor = 0;
        while (x < this.listArriendo.size()) {
            Arriendo paso = this.listArriendo.get(x);
            if (paso.cliente.codCliente == codigoCliente && paso.getAno() == 2020) {
                sumaValor = sumaValor + paso.getCostoArriendo();
            }
            x++;
        }
        return sumaValor;
    }

    public int returnTotalClienteEmpresa() {
        ArrayList<Arriendo> listaTemp = new ArrayList<>();
        int x = 0, sumaTotal = 0;
        while (x < this.listArriendo.size()) {
            Arriendo paso = this.listArriendo.get(x);
            if (paso.cliente.tipoCliente.equals("Empresa")) {
                sumaTotal = paso.getCostoArriendo() + sumaTotal;
            }
            x++;
        }
        return sumaTotal;
    }

///////////////////////////////////////////////////////////////////////////
//METODOS ALMACEN PAIS
    public boolean buscarPais(int codPais) {
        int x = 0;
        boolean buscado = false;
        while (x < listPais.size()) {
            Pais auxiliar = this.listPais.get(x);
            if (codPais == auxiliar.getCodigoPais()) {
                buscado = true;
                break;
            }
            x++;
        }
        return buscado;
    }

    public Pais returnPais(int codPais) {
        int x = 0;
        boolean buscado = false;
        while (x < listPais.size()) {
            Pais auxiliar = this.listPais.get(x);
            if (codPais == auxiliar.getCodigoPais()) {
                return auxiliar;
            }
            x++;
        }
        return null;
    }

    public void addPais(Pais pais) {
        this.listPais.add(pais);
    }

    public void removePais(Pais pais) {
        this.listPais.remove(pais);
    }

    ///////////////////////////////////////////////////////////////////////////
    //METODO DE REGISTRO AUTOMATICO (6 OBJETOS DE CADA CLASE)
    public void cargaRegistroAutomatico() {
        //OBJETO CLIENTE
        Cliente cliente1 = new Cliente("Andres", "19771757", "CQ", "Masculino", 22, 2001, 2, "Empresa");
        this.addCliente(cliente1);
        Cliente cliente2 = new Cliente("Martin", "18771751", "LS", "Masculino", 20, 2002, 3, "Particular");
        this.addCliente(cliente2);
        Cliente cliente3 = new Cliente("Joaquín", "17771752", "CQ", "Masculino", 19, 2003, 4, "Particular");
        this.addCliente(cliente3);
        Cliente cliente4 = new Cliente("Rosio", "16771753", "LS", "Femenino", 20, 2004, 5, "Empresa");
        this.addCliente(cliente4);
        Cliente cliente5 = new Cliente("Kamila", "15771754", "CQ", "Femenino", 20, 2005, 6, "Empresa");
        this.addCliente(cliente5);
        Cliente cliente6 = new Cliente("Mary Jane", "14771755", "ST", "Femenino", 15, 2006, 7, "Particular");
        this.addCliente(cliente6);

        //OBJETO PAIS        
        Pais pais1 = new Pais(5001, "USA");
        this.addPais(pais1);
        Pais pais2 = new Pais(5002, "Francia");
        this.addPais(pais2);
        Pais pais3 = new Pais(5003, "Alemania");
        this.addPais(pais3);
        Pais pais4 = new Pais(5004, "Japon");
        this.addPais(pais4);
        Pais pais5 = new Pais(5005, "India");
        this.addPais(pais5);
        Pais pais6 = new Pais(5006, "España");
        this.addPais(pais6);

        //OBJETO CAMIONETA
        //
        Camioneta camioneta1 = new Camioneta(3001, "Ford", 2010, 20000, pais1, 2000, true);
        this.addCamioneta(camioneta1);
        Camioneta camioneta2 = new Camioneta(3002, "Chevrolet", 1990, 20000, pais1, 2500, true);
        this.addCamioneta(camioneta2);
        Camioneta camioneta3 = new Camioneta(3003, "Ford", 2020, 20000, pais1, 3000, false);
        this.addCamioneta(camioneta3);
        Camioneta camioneta4 = new Camioneta(3004, "Citroen", 2001, 20000, pais2, 3500, false);
        this.addCamioneta(camioneta4);
        Camioneta camioneta5 = new Camioneta(3005, "Mercedez", 1994, 20000, pais3, 4000, true);
        this.addCamioneta(camioneta5);
        Camioneta camioneta6 = new Camioneta(3006, "Volkswagen", 2020, 20000, pais2, 4500, true);
        this.addCamioneta(camioneta6);

        //OBJETO AUTO
        Auto auto1 = new Auto(4001, "Ford", 2016, 30000, pais1, "Si", "Deportivo");
        this.addAuto(auto1);
        Auto auto2 = new Auto(4002, "Chevrolet", 2011, 35000, pais1, "Si", "Tradicional");
        this.addAuto(auto2);
        Auto auto3 = new Auto(4003, "Citroen", 2012, 40000, pais2, "Si", "Deportivo");
        this.addAuto(auto3);
        Auto auto4 = new Auto(4004, "Ford", 2013, 45000, pais1, "No", "Tradicional");
        this.addAuto(auto4);
        Auto auto5 = new Auto(4005, "Chevrolet", 2014, 50000, pais1, "Si", "Deportivo");
        this.addAuto(auto5);
        Auto auto6 = new Auto(4006, "Mercedez", 2020, 55000, pais3, "Si", "Tradicional");
        this.addAuto(auto6);

        //OBJETO VENDEDOR
        Vendedor vendedor1 = new Vendedor("Omar", "204600597", "Ovalle", "Masculino", 21, 1001, "Jefe", "Mañana");
        this.addVendedor(vendedor1);
        Vendedor vendedor2 = new Vendedor("Pia", "204600596", "La Serena", "Femenino", 21, 1002, "Secretario", "Tarde");
        this.addVendedor(vendedor2);
        Vendedor vendedor3 = new Vendedor("Margarita", "204600595", "Coquimbo", "Femenino", 21, 1003, "Contador", "Noche");
        this.addVendedor(vendedor3);
        Vendedor vendedor4 = new Vendedor("Sijistfredo", "204600594", "Copiapó", "Masculino", 21, 1004, "Tecnico", "Mañana");
        this.addVendedor(vendedor4);
        Vendedor vendedor5 = new Vendedor("Benjamin", "204600593", "Santiago", "Masculino", 21, 1005, "Tecnico", "Tarde");
        this.addVendedor(vendedor5);
        Vendedor vendedor6 = new Vendedor("Felipe", "204600592", "Arica", "Masculino", 21, 1006, "Jefe", "Noche");
        this.addVendedor(vendedor6);

        //OBJETO ARRIENDO
        Arriendo arriendo1 = new Arriendo(6001, 20, "Agosto", 2020, cliente1, vendedor6, auto1, 11, 100000);
        this.addArriendo(arriendo1);
        Arriendo arriendo2 = new Arriendo(6002, 21, "Enero", 2019, cliente2, vendedor5, auto2, 12, 101000);
        this.addArriendo(arriendo2);
        Arriendo arriendo3 = new Arriendo(6003, 22, "Febrero", 2020, cliente3, vendedor4, auto3, 13, 102000);
        this.addArriendo(arriendo3);
        Arriendo arriendo4 = new Arriendo(6004, 23, "Marzo", 2017, cliente4, vendedor3, auto4, 14, 103000);
        this.addArriendo(arriendo4);
        Arriendo arriendo5 = new Arriendo(6005, 24, "Abril", 2016, cliente5, vendedor2, auto5, 15, 104000);
        this.addArriendo(arriendo5);
        Arriendo arriendo6 = new Arriendo(6006, 25, "Junio", 2015, cliente6, vendedor1, auto6, 16, 105000);
        this.addArriendo(arriendo6);
    }

    ///////////////////////////////////////////////////////////////////////////
    //GENERA UN CODIGO DE ARRIENDO DE 1 EN 1
    public int generaNuevoId() {
        int nuevoId = 0;
        Arriendo auxiliar = this.listArriendo.get(listArriendo.size() - 1);
        nuevoId = (auxiliar.getCodArriendo() + 1);
        return nuevoId;
    }

    public void grabarArriendo(Arriendo arriendo) {
        this.listArriendo.add(arriendo);
    }
}


