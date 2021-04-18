
import java.io.*;
import java.util.*;

public class TestArriendoCG {

    static DataCenterGrupo2 bodega = new DataCenterGrupo2();

    //MENU PRINCIPAL
    public static void main(String[] args) throws Exception {
        bodega.cargaRegistroAutomatico();
        BufferedReader bf;
        bf = new BufferedReader(new InputStreamReader(System.in));
        int opcion;
        System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
        System.out.println("");
        System.out.println("GESTOR ARRIENDOS DE VEHÍCULOS - Compañia C.G.");
        System.out.println("");
        System.out.println("||||||||||||||||||||||||||||||||||||||||INACAP||||||||||||||||||||||||||||||||||||");
        do {
            System.out.println("");
            System.out.println(" ***   MENU PRINCIPAL   *** ");
            System.out.println("1) Menu Vendedor");
            System.out.println("2) Menu Clientes");
            System.out.println("3) Menu Camionetas");
            System.out.println("4) Menu Autos");
            System.out.println("5) Menu Pais Fabricacion");
            System.out.println("6) Menu Registrar Arriendos");
            System.out.println("7) Menu Reportes");
            System.out.println("8) Salir");
            do {
                opcion = 0;
                try {
                    System.out.println("");
                    System.out.println("Ingrese opcion: ");
                    opcion = Integer.parseInt(bf.readLine());
                    System.out.println("");
                    System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
                } catch (Exception error) {
                    System.out.println("");
                    System.out.println("ERROR: El programa ha detectado inválido lo ingresado.");
                    System.out.println("");
                }
            } while (opcion < 1 || opcion > 8);
            switch (opcion) {
                case 1:
                    System.out.println("");
                    System.out.println("ESTE MENU SE ENCUENTRA EN CONSTRUCCION.");
                    System.out.println("");
                    System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
                    break;
                case 2:
                    System.out.println("");
                    System.out.println("INGRESANDO AL MENU CLIENTES");
                    menuCliente();
                    System.out.println("");
                    System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
                    break;
                case 3:
                    System.out.println("");
                    System.out.println("ESTE MENU SE ENCUENTRA EN CONSTRUCCION.");
                    System.out.println("");
                    System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||.");
                    break;
                case 4:
                    System.out.println("");
                    System.out.println("INGRESANDO AL MENU AUTOS");
                    menuAutos();
                    System.out.println("");
                    System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||.");
                    break;
                case 5:
                    System.out.println("");
                    System.out.println("INGRESANDO AL MENU PAIS DE FABRICACION");
                    menuPaisFabricacion();
                    System.out.println("");
                    System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||.");
                    break;
                case 6:
                    System.out.println("");
                    System.out.println("INGRESANDO AL MENU REGISTRO DE ARRIENDOS");
                    menuRegistroArriendos();
                    System.out.println("");
                    System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||.");
                    break;
                case 7:
                    System.out.println("");
                    System.out.println("INGRESANDO AL MENU REPORTES");
                    menuReportes();
                    System.out.println("");
                    System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||.");
                    break;
                case 8:
                    System.out.println("");
                    System.out.println("  ** HA FINALIZADO EL PROGRAMA! **");
                    System.out.println("");
                    System.out.println("|||||||||||||||||||||||||||||||GRUPO 2||||||||||||||||||||||||||||||||");
                    System.out.println("||||||||||||||Martín Ríos|||Andrés Castro|||Joaquín Rojas|||||||||||||");
                    System.out.println("|||||||||||||||||||||||POO|||721|||Ernesto Ramos||||||||||||||||||||||");
                    System.out.println("|||||||||||||||||||||||||||||||INACAP|||||||||||||||||||||||||||||||||");
                    break;
            }
        } while (opcion != 8);

    }

    ///////////////////////////////////////////////////////////////////////////
    //MENU DE CLIENTES
    private static void menuCliente() throws Exception {
        BufferedReader bf;
        bf = new BufferedReader(new InputStreamReader(System.in));

        int opcion;
        do {
            System.out.println("");
            System.out.println(" ***   MENU CLIENTE   *** ");
            System.out.println("1)Consultar Cliente");
            System.out.println("2)Agregar Cliente");
            System.out.println("3)Actualizar Cliente");
            System.out.println("4)Eliminar Cliente");
            System.out.println("5)Salir");
            do {
                opcion = 0;
                try {
                    System.out.println("");
                    System.out.println("Ingrese opcion: ");
                    opcion = Integer.parseInt(bf.readLine());
                    System.out.println("");
                    System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
                } catch (Exception error) {
                    System.out.println("");
                    System.out.println("ERROR: El programa ha detectado invalida la opcion ingresada.");
                    System.out.println("");
                    System.out.println("Intente nuevamente.");
                }
            } while (opcion < 1 || opcion > 5);
            switch (opcion) {
                case 1:
                    System.out.println("");
                    System.out.println("INGRESANDO A LA FUNCION CONSULTAR CLIENTE");
                    System.out.println("");
                    windowConsultarCliente();
                    System.out.println("");
                    System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
                    break;
                case 2:
                    System.out.println("");
                    System.out.println("INGRESANDO A LA FUNCION AGREGAR CLIENTE");
                    System.out.println("");
                    windowAddCliente();
                    System.out.println("");
                    System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
                    break;
                case 3:
                    System.out.println("");
                    System.out.println("INGRESANDO A LA FUNCION ACTUALIZAR CLIENTE");
                    System.out.println("");
                    windowActualizarCliente();
                    System.out.println("");
                    System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
                    break;
                case 4:
                    System.out.println("");
                    System.out.println("INGRESANDO A LA FUNCION BORRAR CLIENTE");
                    System.out.println("");
                    windowRemoveCliente();
                    System.out.println("");
                    System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
                    break;
                case 5:
                    System.out.println("");
                    System.out.println("SALIENDO DEL MENÚ CLIENTE");
                    break;
            }
        } while (opcion != 5);

    }

    //MENU CONSULTAR CLIENTE
    private static void windowConsultarCliente() throws Exception {
        BufferedReader bf;
        bf = new BufferedReader(new InputStreamReader(System.in));

        String opcion = "si";
        boolean buscado = false;
        int codCliente = 0, x;
        while (opcion.equals("si")) {
            do {

                try {
                    System.out.println("Ingrese el codigo de cliente a consultar: ");
                    codCliente = Integer.parseInt(bf.readLine());
                    System.out.println("");
                    System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||.");
                } catch (Exception error) {
                    System.out.println("ERROR: El codigo ingresado no es valido. Ingrese datos de tipo entero! ");
                    System.out.println("");
                }
            } while (codCliente < 0);
            buscado = bodega.buscarCodCliente(codCliente);
            if (buscado) {
                Cliente paso = bodega.returnCliente(codCliente);
                System.out.println("");
                System.out.println("  ***    CLIENTE ENCONTRADO!   ***  ");
                System.out.println("Rut             : " + paso.rut);
                System.out.println("Nombre          : " + paso.nombre);
                System.out.println("Sexo            : " + paso.sexo);
                System.out.println("Edad            : " + paso.edad);
                System.out.println("Ciudad          : " + paso.ciudad);
                System.out.println("Codigo Cliente  : " + paso.codCliente);
                System.out.println("Antiguedad lab. : " + paso.antiguedadLab);
                System.out.println("Tipo de Cliente : " + paso.tipoCliente);
                System.out.println("");
            } else {
                System.out.println("ERROR: El codigo del cliente que desea consultar no existe");
            }
            do {
                System.out.println("¿Desea consultar por otro cliente? (si-no) : ");
                opcion = bf.readLine();
            } while (!(opcion.equals("si") || opcion.equals("no")));

        }

    }

    //MENU AÑADIR CLIENTE
    private static void windowAddCliente() throws Exception {
        BufferedReader bf;
        bf = new BufferedReader(new InputStreamReader(System.in));

        String opcion = "si";
        boolean buscado = false;
        int codCliente = 0, x = 0, edad = 0;
        String tipoCliente = "ND";
        String sexo = "NA", nombre = "NA", ciudad = "NA", rut = "NA";
        while (opcion.equals("si")) {
            do {

                try {
                    System.out.println("Ingrese el codigo de cliente a registrar: ");
                    codCliente = Integer.parseInt(bf.readLine());
                    System.out.println("");
                    System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");

                } catch (Exception error) {
                    System.out.println("");
                    System.out.println("ERROR: El codigo ingresado no es valido, ingrese dato de tipo entero! ");
                    System.out.println("");
                }
            } while (x > 0);
            buscado = bodega.buscarCodCliente(codCliente);
            if (buscado == false) {
                Cliente paso = bodega.returnCliente(codCliente);
                System.out.println("");
                System.out.println("  ***    FORMULARIO DE REGISTRO   ***  ");
                System.out.println("");
                do {

                    try {
                        System.out.println("Ingrese el nombre del cliente: ");
                        nombre = bf.readLine();
                    } catch (Exception error) {
                        System.out.println("");
                        System.out.println("ERROR: El codigo ingresado no es valido, ingrese dato de tipo texto! ");
                        System.out.println("");
                    }
                } while (nombre.equals(""));
                do {
                    try {
                        System.out.println("Ingrese el rut del cliente   :");
                        rut = bf.readLine();
                    } catch (Exception error) {
                        System.out.println("");
                        System.out.println("ERROR: El codigo ingresado no es valido, ingrese dato de tipo texto! ");
                        System.out.println("");
                    }
                } while (rut.equals(""));
                try {
                    System.out.println("Ingrese la ciudad del cliente : ");
                    ciudad = bf.readLine();
                } catch (Exception error) {
                    System.out.println("");
                    System.out.println("ERROR: El codigo ingresado no es valido, ingrese dato de tipo texto! ");
                    System.out.println("");
                }
                do {
                    do {
                        try {
                            System.out.println("Ingrese el sexo del cliente : ((M)asculino - (F)emenino)");
                            sexo = bf.readLine().toUpperCase();
                        } catch (Exception error) {
                            System.out.println("");
                            System.out.println("ERROR: El codigo ingresado no es valido, ingrese dato de tipo texto! ");
                            System.out.println("");
                        }
                    } while (!(sexo.equals("M") || sexo.equals("F")));
                    if (sexo.equals("M")) {
                        sexo = "Masculino";
                    } else if (sexo.equals("F")) {
                        sexo = "Femenino";
                    }
                } while (!(sexo.equals("Masculino") || sexo.equals("Femenino")));
                do {

                    try {
                        System.out.println("Ingrese la edad del cliente  : ");
                        edad = Integer.parseInt(bf.readLine());
                    } catch (Exception error) {
                        System.out.println("");
                        System.out.println("ERROR: El codigo ingresado no es valido, ingrese dato de tipo entero! ");
                        System.out.println("");
                    }
                } while (edad < 1);
                System.out.println("Ingrese la antiguedad laboral del cliente : ");
                int antiguedadLab = Integer.parseInt(bf.readLine());
                do {
                    do {
                        try {

                            System.out.println("Ingrese tipo de cliente: ((E)mpresa-(P)articular");
                            tipoCliente = bf.readLine().toUpperCase();
                        } catch (Exception error) {
                            System.out.println("");
                            System.out.println("ERROR: El codigo ingresado no es valido, ingrese dato de tipo texto! ");
                            System.out.println("");
                        }
                    } while (!(tipoCliente.equals("E") || tipoCliente.equals("P")));
                    if (tipoCliente.equals("E")) {
                        tipoCliente = "Empresa";
                    } else if (tipoCliente.equals("P")) {
                        tipoCliente = "Particular";
                    }
                } while (!(tipoCliente.equals("Empresa") || tipoCliente.equals("Particular")));

                Cliente cl = new Cliente(nombre, rut, ciudad, sexo, edad, codCliente, antiguedadLab, tipoCliente);
                bodega.addCliente(cl);

            } else {
                System.out.println("");
                System.out.println("ERROR: El código de Cliente que desea registrar ya existe.");
                System.out.println("");
                System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
            }
            do {
                try {
                    System.out.println("");
                    System.out.println("Desea ingresar otro cliente (si-no) ");
                    opcion = bf.readLine();
                } catch (Exception error) {
                    System.out.println("");
                    System.out.println("ERROR: El codigo ingresado no es valido, ingrese dato de tipo texto! ");
                    System.out.println("");
                }
            } while (!(opcion.equals("si") || opcion.equals("no")));
            System.out.println("");
        }
    }

    //MENU ACTUALIZAR CLIENTE
    private static void windowActualizarCliente() throws Exception {
        BufferedReader bf;
        bf = new BufferedReader(new InputStreamReader(System.in));

        String opcion = "si";
        boolean buscado;
        int id, x;
        String nombre = "NA", ciudad = "NA", sexo = "NA", rut = "NA", tipoCliente = "NA";
        int edad = 0, antiguedadLab = 0;
        while (opcion.equals("si")) {
            id = 0;
            try {
                System.out.println("");
                System.out.println("Ingrese el codigo del cliente a modificar: ");
                id = Integer.parseInt(bf.readLine());
            } catch (Exception error) {
                System.out.println("");
                System.out.println("El tipo de dato ingresado no es valido, intentelo nuevamente.");
                System.out.println("");
            }
            System.out.println("");
            System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
            buscado = bodega.buscarCodCliente(id);
            //String nombre, String rut, String ciudad, String sexo, int edad, int codCliente, int antiguedadLab, String tipoCliente

            if (buscado == true) {
                Cliente paso = bodega.returnCliente(id);
                System.out.println("");
                System.out.println("  ***   CLIENTE ENCONTRADO!   ***  ");
                System.out.println("Codigo Cliente          : " + paso.codCliente);
                System.out.println("    1) Nombre Cliente   : " + paso.nombre);
                System.out.println("    2) Rut              : " + paso.rut);
                System.out.println("    3) Ciudad           : " + paso.ciudad);
                System.out.println("    4) Sexo             : " + paso.sexo);
                System.out.println("    5) Edad             : " + paso.edad);
                System.out.println("    6) Antiguedad Lab.  : " + paso.antiguedadLab);
                System.out.println("    7) Tipo de Cliente  : " + paso.tipoCliente);
                System.out.println("    8) Salir");
                System.out.println("");

                String modificarOtro = "no";
                do {
                    int opcionMod = 0;
                    try {
                        System.out.println("¿Que dato desea modificar?: ");
                        opcionMod = Integer.parseInt(bf.readLine());
                    } catch (Exception error) {
                        System.out.println("");
                        System.out.println("El tipo de dato ingresado no es valido. Intentelo nuevamente.");
                        System.out.println("");
                    }
                    switch (opcionMod) {
                        case 1:
                            do {
                                try {
                                    System.out.println("Ingrese el nuevo nombre del Cliente: ");
                                    nombre = bf.readLine();
                                } catch (Exception error) {
                                    System.out.println("");
                                    System.out.println("ERROR: El codigo ingresado no es valido, ingrese dato de tipo texto! ");
                                    System.out.println("");
                                }
                            } while (nombre.equals(""));
                            paso.setNombre(nombre);
                            break;
                        case 2:
                            do {
                                try {
                                    System.out.println("Ingrese el nuevo rut del Cliente: ");
                                    rut = bf.readLine();
                                } catch (Exception error) {
                                    System.out.println("");
                                    System.out.println("ERROR: El codigo ingresado no es valido, ingrese dato de tipo texto! ");
                                    System.out.println("");
                                }
                            } while (rut.equals(""));
                            paso.setRut(rut);
                            break;
                        case 3:
                            do {
                                try {
                                    System.out.println("Ingrese la nueva ciudad del Cliente: ");
                                    ciudad = bf.readLine();
                                } catch (Exception error) {
                                    System.out.println("");
                                    System.out.println("ERROR: El codigo ingresado no es valido, ingrese dato de tipo texto! ");
                                    System.out.println("");
                                }
                            } while (ciudad.equals(""));
                            paso.setCiudad(ciudad);
                            break;
                        case 4:
                            do {
                                try {
                                    System.out.println("Ingrese el nuevo sexo del Cliente (M - F): ");
                                    sexo = bf.readLine();
                                } catch (Exception error) {
                                    System.out.println("");
                                    System.out.println("ERROR: El codigo ingresado no es valido, ingrese dato de tipo texto! ");
                                    System.out.println("");
                                }
                            } while (!(sexo.equals("M") || sexo.equals("F")));

                            paso.setSexo(sexo);
                            break;
                        case 5:
                            do {

                                try {
                                    System.out.println("Ingrese la nueva edad del Cliente: ");
                                    edad = Integer.parseInt(bf.readLine());
                                } catch (Exception error) {
                                    System.out.println("");
                                    System.out.println("ERROR: El codigo ingresado no es valido, ingrese dato de tipo numerico! ");
                                    System.out.println("");
                                }
                            } while (edad < 1);
                            paso.setEdad(edad);
                            break;
                        case 6:
                            do {

                                try {
                                    System.out.println("Ingrese la nueva antiguedad laboral del Cliente: ");
                                    antiguedadLab = Integer.parseInt(bf.readLine());
                                } catch (Exception error) {
                                    System.out.println("");
                                    System.out.println("ERROR: El codigo ingresado no es valido, ingrese dato de tipo numerico! ");
                                    System.out.println("");
                                }
                            } while (antiguedadLab < 1);
                            paso.setAntiguedadLab(antiguedadLab);
                            break;
                        case 7:
                            do {
                                try {
                                    System.out.println("Ingrese el tipo de Cliente (E - P)");
                                    tipoCliente = bf.readLine();
                                } catch (Exception error) {
                                    System.out.println("");
                                    System.out.println("ERROR: El codigo ingresado no es valido, ingrese dato de tipo texto! ");
                                    System.out.println("");
                                }
                            } while (!(tipoCliente.equals("E") || tipoCliente.equals("P")));
                            if (tipoCliente.equals("E")) {
                                tipoCliente = "Empresa";
                            } else if (tipoCliente.equals("P")) {
                                tipoCliente = "Particular";
                            }
                            paso.setTipoCliente(tipoCliente);
                            break;
                        case 8:
                            System.out.println("");
                            System.out.println("NO SE REALIZARAN MODIFICACIONES...");
                            System.out.println("");
                            break;

                    }
                    if (!(opcionMod == 8)) {
                        do {
                            try {
                                System.out.println("Desea modificar otro dato? (si-no)");
                                modificarOtro = bf.readLine();
                            } catch (Exception error) {
                                System.out.println("");
                                System.out.println("ERROR: El codigo ingresado no es valido, ingrese dato de tipo texto! ");
                                System.out.println("");
                            }
                        } while (!(modificarOtro.equals("si") || modificarOtro.equals("no")));

                    }
                } while (modificarOtro.equals("si"));

            } else {
                System.out.println("ERROR: El Id de cliente que desea modificar no existe.");
            }

            do {
                try {
                    System.out.println("¿Desea modificar otro cliente: (si-no)?");
                    opcion = bf.readLine();
                } catch (Exception error) {
                    System.out.println("");
                    System.out.println("ERROR: El codigo ingresado no es valido, ingrese dato de tipo texto! ");
                    System.out.println("");
                }
            } while (!(opcion.equals("si") || opcion.equals("no")));
            System.out.println("");
        }
    }
    //MENU BORRAR CLIENTE

    private static void windowRemoveCliente() throws Exception {
        BufferedReader bf;
        bf = new BufferedReader(new InputStreamReader(System.in));

        String opcion = "si", nombre, region;
        boolean buscado = false;
        int id, x;

        while (opcion.equals("si")) {
            id = 0;
            do {
                try {
                    System.out.println("Ingrese id del Cliente a eliminar: ");
                    id = Integer.parseInt(bf.readLine());
                } catch (Exception error) {
                    System.out.println("");
                    System.out.println("ERROR: El codigo ingresado no es valido, ingrese dato de tipo numerico! ");
                    System.out.println("");
                }
            } while (id < 0);

            System.out.println("");
            buscado = bodega.buscarCodCliente(id);

            if (buscado == true) {
                Cliente paso = bodega.returnCliente(id);
                String confirmacion = "NA";
                do {
                    try {
                        System.out.println("¿Esta seguro de eliminar al Cliente? (si-no) : ");
                        confirmacion = bf.readLine();
                    } catch (Exception error) {
                        System.out.println("");
                        System.out.println("ERROR: El codigo ingresado no es valido, ingrese dato de tipo texto! ");
                        System.out.println("");
                    }
                } while (!(confirmacion.equals("si") || confirmacion.equals("no")));
                if (confirmacion.equals("si")) {
                    bodega.removeCliente(paso);
                    System.out.println("");
                    System.out.println("  ***   CLIENTE ELIMINADO.   ***  ");
                    System.out.println("");

                } else {
                    break;
                }
            } else {
                System.out.println("ERROR: El Id del Cliente que desea eliminar no existe.");
            }

            do {
                try {
                    System.out.println("¿Desea eliminar otro Cliente: (si-no)?");
                    opcion = bf.readLine();
                } catch (Exception error) {
                    System.out.println("");
                    System.out.println("ERROR: El codigo ingresado no es valido, ingrese dato de tipo texto! ");
                    System.out.println("");
                }
            } while (!(opcion.equals("si") || opcion.equals("no")));

        }
    }

    ///////////////////////////////////////////////////////////////////////////
    //MENU DE AUTOS
    private static void menuAutos() throws Exception {
        BufferedReader bf;
        bf = new BufferedReader(new InputStreamReader(System.in));

        int opcion;
        do {
            System.out.println("");
            System.out.println(" ***   MENU AUTOS   *** ");
            System.out.println("1)Consultar Auto");
            System.out.println("2)Agregar Auto");
            System.out.println("3)Actualizar Auto");
            System.out.println("4)Eliminar Auto");
            System.out.println("5)Salir");
            do {
                opcion = 0;
                try {
                    System.out.println("");
                    System.out.println("Ingrese opcion: ");
                    opcion = Integer.parseInt(bf.readLine());
                    System.out.println("");
                    System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
                } catch (Exception error) {
                    System.out.println("");
                    System.out.println("ERROR: El programa ha detectado invalida la opcion ingresada.");
                    System.out.println("");
                    System.out.println("Intente nuevamente.");
                }
            } while (opcion < 1 || opcion > 5);
            switch (opcion) {
                case 1:
                    System.out.println("");
                    System.out.println("HA INGRESADO A LA FUNCIÓN CONSULTAR AUTO");
                    System.out.println("");
                    windowConsultarAuto();
                    System.out.println("");
                    System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
                    break;
                case 2:
                    System.out.println("");
                    System.out.println("HA INGRESANDO A LA FUNCIÓN AGREGAR AUTO");
                    System.out.println("");
                    windowAddAuto();
                    System.out.println("");
                    System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
                    break;
                case 3:
                    System.out.println("");
                    System.out.println("HA INGRESANDO A LA FUNCIÓN ACTUALIZAR AUTO");
                    System.out.println("");
                    windowActualizarAuto();
                    System.out.println("");
                    System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
                    break;
                case 4:
                    System.out.println("");
                    System.out.println("HA INGRESANDO A LA FUNCIÓN BORRAR AUTO");
                    System.out.println("");
                    windowRemoveAuto();
                    System.out.println("");
                    System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
                    break;
                case 5:
                    System.out.println("");
                    System.out.println("HA SALIDO DEL MENÚ AUTO");
                    break;
            }
        } while (opcion != 5);
    }

    //MENU CONSULTAR AUTO
    private static void windowConsultarAuto() throws Exception {
        BufferedReader bf;
        bf = new BufferedReader(new InputStreamReader(System.in));

        String opcion = "si";
        boolean buscado = false;
        int codVehiculo = 0, x;
        while (opcion.equals("si")) {
            do {
                try {
                    System.out.println("Ingrese el codigo del vehiculo a consultar: ");
                    codVehiculo = Integer.parseInt(bf.readLine());
                } catch (Exception error) {
                    System.out.println("");
                    System.out.println("ERROR: El codigo ingresado no es valido, ingrese datos de tipo entero! ");
                    System.out.println("");
                }
            } while (codVehiculo < 0);
            buscado = bodega.buscarIdAuto(codVehiculo);
            if (buscado) {
                Auto paso = bodega.returnAuto(codVehiculo);
                System.out.println("");
                System.out.println("  ***    AUTO ENCONTRADO!   ***  ");
                System.out.println("Codigo vehiculo          : " + paso.getCodigoVehiculo());
                System.out.println("Marca                    : " + paso.getMarca());
                System.out.println("Año                      : " + paso.getAno());
                System.out.println("Valor Arriendo           : " + paso.getValorArriendo());
                System.out.println("Pais de fabricacion      : " + paso.pais.getNombrePais());
                System.out.println("Porta Equipaje           : " + paso.getPortaEquipaje());
                System.out.println("Tipo de Auto             : " + paso.getTipoAuto());
                System.out.println("");
            } else {
                System.out.println("ERROR: El codigo del vehiculo que desea consultar no existe");
            }
            do {
                try {
                    System.out.println("¿Desea consultar por otro vehiculo? (si-no) : ");
                    opcion = bf.readLine();
                } catch (Exception error) {
                    System.out.println("");
                    System.out.println("ERROR: El codigo ingresado no es valido, ingrese dato de tipo texto! ");
                    System.out.println("");
                }
            } while (!(opcion.equals("si") || opcion.equals("no")));

        }

    }

    //MENU AÑADIR AUTO
    private static void windowAddAuto() throws Exception {
        BufferedReader bf;
        bf = new BufferedReader(new InputStreamReader(System.in));

        String opcion = "si";
        boolean buscado = false;
        int codVehiculo = 0, x, ano = 0, valorArriendo = 0, codPais = 0;
        String marca = "NA", nombrePais = "NA";
        String tipoAuto = "ND", portaEquipaje = "ND", tipoCliente = "ND";
        while (opcion.equals("si")) {
            do {
                try {
                    System.out.println("Ingrese el codigo del vehiculo a registrar: ");
                    codVehiculo = Integer.parseInt(bf.readLine());
                    System.out.println("");
                    System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");

                } catch (Exception error) {
                    System.out.println("ERROR: El codigo ingresado no es valido, ingrese datos de tipo entero! ");
                    System.out.println("");
                }
            } while (codVehiculo < 1);
            buscado = bodega.buscarIdAuto(codVehiculo);
            if (buscado == false) {
                Auto paso = bodega.returnAuto(codVehiculo);
                do {

                    try {
                        System.out.println("Ingrese la marca del vehiculo: ");
                        marca = bf.readLine();
                    } catch (Exception error) {
                        System.out.println("");
                        System.out.println("ERROR: El codigo ingresado no es valido, ingrese dato de tipo texto! ");
                        System.out.println("");
                    }
                } while (marca == "");
                do {
                    try {
                        System.out.println("Ingrese el año del vehiculo");
                        ano = Integer.parseInt(bf.readLine());
                    } catch (Exception error) {
                        System.out.println("");
                        System.out.println("ERROR: El codigo ingresado no es valido, ingrese dato de tipo numerico! ");
                        System.out.println("");
                    }
                } while (ano < 1);
                do {

                    try {
                        System.out.println("Ingrese el valor de arriendo del vehiculo: ");
                        valorArriendo = Integer.parseInt(bf.readLine());
                    } catch (Exception error) {
                        System.out.println("");
                        System.out.println("ERROR: El codigo ingresado no es valido, ingrese dato de tipo numerico! ");
                        System.out.println("");
                    }
                } while (valorArriendo < 1);
                System.out.println("**A continuación se ingresan los datos del pais de fabricación.");
                do {
                    try {
                        System.out.println("Ingrese el codigo del pais: ");
                        codPais = Integer.parseInt(bf.readLine());
                    } catch (Exception error) {
                        System.out.println("");
                        System.out.println("ERROR: El codigo ingresado no es valido, ingrese dato de tipo numerico! ");
                        System.out.println("");
                    }
                } while (codPais < 1);
                do {

                    try {
                        System.out.println("Ingrese el nombre del pais: ");
                        nombrePais = bf.readLine();
                    } catch (Exception error) {
                        System.out.println("");
                        System.out.println("ERROR: El codigo ingresado no es valido, ingrese dato de tipo texto! ");
                        System.out.println("");
                    }

                } while (nombrePais.equals(""));
                while (buscado);
                Pais pais = new Pais(codPais, nombrePais);

                do {
                    try {
                        System.out.println("¿El vehiculo posee porta equipajes? (si-no) : ");
                        portaEquipaje = bf.readLine();
                    } catch (Exception error) {
                        System.out.println("");
                        System.out.println("ERROR: El codigo ingresado no es valido, ingrese dato de tipo texto! ");
                        System.out.println("");
                    }
                } while (!(portaEquipaje.equals("si") || portaEquipaje.equals("no")));

                do {
                    try {
                        System.out.println("Ingrese el tipo: ((D)eportivo-(T)radicional)");
                        tipoAuto = bf.readLine().toUpperCase();
                    } catch (Exception error) {
                        System.out.println("");
                        System.out.println("ERROR: El codigo ingresado no es valido, ingrese dato de tipo texto! ");
                        System.out.println("");
                    }
                } while (!(tipoAuto.equals("T") || tipoAuto.equals("D")));
                if (tipoAuto.equals("D")) {
                    tipoAuto = "Deportivo";
                } else if (tipoAuto.equals("T")) {
                    tipoAuto = "Tradicional";
                }
                Auto auto = new Auto(codVehiculo, marca, ano, valorArriendo, pais, portaEquipaje, tipoAuto);
                bodega.addAuto(auto);

            } else {
                System.out.println("ERROR: El codigo del Vehiculo que desea registrar ya existe.");
            }
            do {
                try {
                    System.out.println("Desea ingresar otro vehiculo (si-no) ");
                    opcion = bf.readLine();
                } catch (Exception error) {
                    System.out.println("");
                    System.out.println("ERROR: El codigo ingresado no es valido, ingrese dato de tipo texto! ");
                    System.out.println("");
                }
            } while (!(opcion.equals("si") || opcion.equals("no")));

        }
    }
//MENU ACTUALIZAR AUTO

    private static void windowActualizarAuto() throws Exception {
        BufferedReader bf;
        bf = new BufferedReader(new InputStreamReader(System.in));

        String opcion = "si";
        boolean buscado;
        int id, x;
        String tipoAuto = "NA";

        while (opcion.equals("si")) {
            System.out.println("");
            System.out.println("Ingrese el codigo del vehiculo a modificar: ");
            id = Integer.parseInt(bf.readLine());
            System.out.println("");
            System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||.");
            buscado = bodega.buscarIdAuto(id);

            if (buscado == true) {
                Auto paso = bodega.returnAuto(id);
                System.out.println("");
                System.out.println("  ***    AUTO ENCONTRADO!   ***  ");
                System.out.println("Codigo vehiculo          : " + paso.getCodigoVehiculo());
                System.out.println("    1)Marca                    : " + paso.getMarca());
                System.out.println("    2)Año                      : " + paso.getAno());
                System.out.println("    3)Valor Arriendo           : " + paso.getValorArriendo());
                System.out.println("    4)Pais de fabricacion      : " + paso.pais.getNombrePais());
                System.out.println("    5)Porta Equipaje           : " + paso.getPortaEquipaje());
                System.out.println("    6)Tipo de Auto             : " + paso.getTipoAuto());
                System.out.println("    7)Salir");

                String modificarOtro = "no";
                do {
                    System.out.println("");
                    System.out.println("");
                    System.out.println("¿Que dato desea modificar?: ");
                    int opcionMod = Integer.parseInt(bf.readLine());
                    switch (opcionMod) {
                        case 1:
                            String marca = "NA";
                            do {
                                try {
                                    System.out.println("Ingrese la nueva Marca del vehiculo: ");
                                    marca = bf.readLine();
                                } catch (Exception error) {
                                    System.out.println("");
                                    System.out.println("ERROR: El codigo ingresado no es valido, ingrese dato de tipo texto! ");
                                    System.out.println("");
                                }
                            } while (marca.equals(""));
                            paso.setMarca(marca);
                            break;
                        case 2:
                            int ano = 0;
                            do {

                                try {
                                    System.out.println("Ingrese el nuevo Año del vehiculo: ");
                                    ano = Integer.parseInt(bf.readLine());
                                } catch (Exception error) {
                                    System.out.println("");
                                    System.out.println("ERROR: El codigo ingresado no es valido, ingrese dato de tipo numerico! ");
                                    System.out.println("");
                                }
                            } while (ano < 1);

                            paso.setAno(ano);
                            break;
                        case 3:
                            int valorArriendo = 0;
                            do {

                                try {
                                    System.out.println("Ingrese el nuevo Valor de arriendo del vehiculo: ");
                                    valorArriendo = Integer.parseInt(bf.readLine());
                                } catch (Exception error) {
                                    System.out.println("");
                                    System.out.println("ERROR: El codigo ingresado no es valido, ingrese dato de tipo numerico! ");
                                    System.out.println("");
                                }
                            } while (valorArriendo < 1);

                            paso.setValorArriendo(valorArriendo);
                            break;

                        case 4:
                            int op = 0;
                            System.out.println(" ***  MODIFICACION PAIS DE FABRICACION   *** ");
                            System.out.println("Codigo Pais                : " + paso.pais.getCodigoPais());
                            System.out.println("1) Nombre Pais:            : " + paso.pais.getNombrePais());
                            System.out.println("2) Salir ");
                            System.out.println("");
                            try {
                                System.out.println("¿Que dato desea modificar?: ");
                                op = Integer.parseInt(bf.readLine());
                            } catch (Exception error) {
                                System.out.println("");
                                System.out.println("ERROR: El codigo ingresado no es valido, ingrese dato de tipo numerico! ");
                                System.out.println("");
                            }

                            switch (op) {
                                case 1:
                                    String nuevoNombrePais = "NA";
                                    try {
                                        System.out.println("Ingrese el nuevo nombre de País: ");
                                        nuevoNombrePais = bf.readLine();
                                    } catch (Exception error) {
                                        System.out.println("");
                                        System.out.println("ERROR: El codigo ingresado no es valido, ingrese dato de tipo texto! ");
                                        System.out.println("");
                                    }
                                    paso.pais.setNombrePais(nuevoNombrePais);
                                    break;
                                case 2:
                                    break;
                            }
                            break;
                        case 5:
                            String portaEquipaje = "NA";
                            try {
                                System.out.println("¿El vehiculo posee porta equipaje?: ");
                                portaEquipaje = bf.readLine();
                            } catch (Exception error) {
                                System.out.println("");
                                System.out.println("ERROR: El codigo ingresado no es valido, ingrese dato de tipo numerico! ");
                                System.out.println("");
                            }
                            paso.setPortaEquipaje(portaEquipaje);
                            break;
                        case 6:
                            do {
                                try {
                                    System.out.println("Ingrese el nuevo tipo de vehiculo ((T)radicional - (D)eportivo) : ");
                                    tipoAuto = bf.readLine();
                                } catch (Exception error) {
                                    System.out.println("");
                                    System.out.println("ERROR: El codigo ingresado no es valido, ingrese dato de tipo texto! ");
                                    System.out.println("");
                                }

                            } while (!(tipoAuto.equals("T") || tipoAuto.equals("D")));
                            if (tipoAuto.equals("T")) {
                                tipoAuto = "Tradicional";
                            } else if (tipoAuto.equals("D")) {
                                tipoAuto = "Deportivo";
                            }
                            paso.setTipoAuto(tipoAuto);
                            break;
                        case 7:
                            System.out.println("");
                            System.out.println("NO SE REALIZARON MODIFICACIONES.");
                            System.out.println("");
                            break;
                    }
                    if (!(opcionMod == 7)) {
                        do {
                            try {
                                System.out.println("Desea modificar otro dato? (si-no)");
                                modificarOtro = bf.readLine();
                            } catch (Exception error) {
                                System.out.println("");
                                System.out.println("ERROR: El codigo ingresado no es valido, ingrese dato de tipo texto! ");
                                System.out.println("");
                            }
                        } while (!(modificarOtro.equals("si") || modificarOtro.equals("no")));

                    }
                } while (modificarOtro.equals("si"));
            } else {
                System.out.println("El codigo del vehiculo que desea modificar no existe :( ");
            }

            do {
                try {
                    System.out.println("¿Desea modificar otro Vehiculo: (si-no)?");
                    opcion = bf.readLine();
                } catch (Exception error) {
                    System.out.println("");
                    System.out.println("ERROR: El codigo ingresado no es valido, ingrese dato de tipo texto! ");
                    System.out.println("");
                }
            } while (!(opcion.equals("si") || opcion.equals("no")));

        }
    }
    //MENU BORRAR AUTO

    private static void windowRemoveAuto() throws Exception {
        BufferedReader bf;
        bf = new BufferedReader(new InputStreamReader(System.in));

        String opcion = "si", confirmacion = "NA";
        boolean buscado = false;
        int id, x;

        while (opcion.equals("si")) {
            id = 0;
            do {

                try {
                    System.out.println("Ingrese codigo del Auto a eliminar: ");
                    id = Integer.parseInt(bf.readLine());
                } catch (Exception error) {
                    System.out.println("");
                    System.out.println("ERROR: El codigo ingresado no es valido, ingrese dato de tipo numerico! ");
                    System.out.println("");
                }
            } while (id < 0);

            buscado = bodega.buscarIdAuto(id);

            if (buscado == true) {
                Auto paso = bodega.returnAuto(id);
                do {
                    try {
                        System.out.println("¿Esta seguro de eliminar el Vehiculo? (si-no) : ");
                        confirmacion = bf.readLine();
                    } catch (Exception error) {
                        System.out.println("");
                        System.out.println("ERROR: El codigo ingresado no es valido, ingrese dato de tipo texto! ");
                        System.out.println("");
                    }
                } while (!(confirmacion.equals("si") || confirmacion.equals("no")));

                if (confirmacion.equals("si")) {
                    bodega.removeAuto(paso);
                    System.out.println("");
                    System.out.println("  ***   AUTO ELIMINADO.   ***  ");
                    System.out.println("");

                } else {
                    break;
                }
            } else {
                System.out.println("ERROR: El Codigo del auto que desea eliminar no existe.");
            }

            do {
                try {
                    System.out.println("¿Desea eliminar otro Auto?: (si-no)?");
                    opcion = bf.readLine();
                } catch (Exception error) {
                    System.out.println("");
                    System.out.println("ERROR: El codigo ingresado no es valido, ingrese dato de tipo texto! ");
                    System.out.println("");
                }
            } while (!(opcion.equals("si") || opcion.equals("no")));

        }
    }
///////////////////////////////////////////////////////////////////////////
//MENU PAIS DE FABRICACION

    private static void menuPaisFabricacion() throws Exception {
        BufferedReader bf;
        bf = new BufferedReader(new InputStreamReader(System.in));

        int opcion;
        do {
            System.out.println("");
            System.out.println(" ***   MENU PAIS DE FABRICACION   *** ");
            System.out.println("1)Consultar Pais de Fabricacion");
            System.out.println("2)Agregar Pais de Fabricacion");
            System.out.println("3)Actualizar Pais de Fabricacion");
            System.out.println("4)Eliminar Pais de Fabricacion");
            System.out.println("5)Salir");
            do {
                opcion = 0;
                try {
                    System.out.println("");
                    System.out.println("Ingrese opcion: ");
                    opcion = Integer.parseInt(bf.readLine());
                    System.out.println("");
                    System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
                } catch (Exception error) {
                    System.out.println("");
                    System.out.println("ERROR: El programa ha detectado invalida la opcion ingresada.");
                    System.out.println("");
                    System.out.println("Intente nuevamente.");
                }
            } while (opcion < 1 || opcion > 5);
            switch (opcion) {
                case 1:
                    System.out.println("");
                    System.out.println("HA INGRESADO A LA FUNCIÓN CONSULTAR PAÍS DE FABRICACIÓN");
                    System.out.println("");
                    windowConsultarPaisFabricacion();
                    System.out.println("");
                    System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||.");
                    break;
                case 2:
                    System.out.println("");
                    System.out.println("HA INGRESADO A LA FUNCIÓN AGREGAR PAÍS DE FABRICACIÓN");
                    System.out.println("");
                    windowAddPaisFabricacion();
                    System.out.println("");
                    System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||.");
                    break;
                case 3:
                    System.out.println("");
                    System.out.println("HA INGRESADO A LA FUNCIÓN ACTUALIZAR PAÍS DE FABRICACIÓN");
                    windowActualizarPaisFabricacion();
                    System.out.println("");
                    System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||.");
                    break;
                case 4:
                    System.out.println("");
                    System.out.println("HA INGRESADO A LA FUNCIÓN BORRAR PAÍS DE FABRICACIÓN");
                    System.out.println("");
                    windowRemovePaisFabricacion();
                    System.out.println("");
                    System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||.");
                    break;
                case 5:
                    System.out.println("");
                    System.out.println("HA SALIDO DEL MENÚ PAÍS DE FABRICACIÓN");
                    System.out.println("");
                    System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||.");
                    break;
            }
        } while (opcion != 5);
    }

    //MENU CONSULTAR PAIS DE FABRICACION
    private static void windowConsultarPaisFabricacion() throws Exception {
        BufferedReader bf;
        bf = new BufferedReader(new InputStreamReader(System.in));

        String opcion = "si";
        boolean buscado = false;
        int codPais = 0, x;
        while (opcion.equals("si")) {
            do {

                try {
                    System.out.println("Ingrese el codigo del Pais de Fabricacion a consultar: ");
                    codPais = Integer.parseInt(bf.readLine());
                    System.out.println("");
                } catch (Exception error) {
                    System.out.println("ERROR: El codigo ingresado no es valido, ingrese datos de tipo entero! ");
                    System.out.println("");
                }
            } while (codPais < 1);

            buscado = bodega.buscarPais(codPais);
            if (buscado) {
                Pais paso = bodega.returnPais(codPais);
                System.out.println("");
                System.out.println("  ***    PAIS DE FABRICACION ENCONTRADO!   ***  ");
                System.out.println("Codigo de Pais          : " + paso.getCodigoPais());
                System.out.println("Nombre de Pais          : " + paso.getNombrePais());
                System.out.println("");
            } else {
                System.out.println("ERROR: El codigo Pais que desea consultar no existe.");
            }
            do {
                try {
                    System.out.println("¿Desea consultar por otro Pais? (si-no) : ");
                    opcion = bf.readLine();
                } catch (Exception error) {
                    System.out.println("");
                    System.out.println("ERROR: El codigo ingresado no es valido, ingrese dato de tipo texto! ");
                    System.out.println("");
                }
            } while (!(opcion.equals("si") || opcion.equals("no")));

        }

    }

    //MENU AÑADIR PAIS DE FABRICACION
    private static void windowAddPaisFabricacion() throws Exception {
        BufferedReader bf;
        bf = new BufferedReader(new InputStreamReader(System.in));

        String opcion = "si";
        boolean buscado = false;
        int codPais = 0, x;
        while (opcion.equals("si")) {
            do {

                try {
                    System.out.println("Ingrese el codigo del Pais de Fabricacion a registrar: ");
                    codPais = Integer.parseInt(bf.readLine());
                    System.out.println("");
                } catch (Exception error) {
                    System.out.println("ERROR: El codigo ingresado no es valido, ingrese datos de tipo entero! ");
                    System.out.println("");
                }
            } while (codPais < 1);

            buscado = bodega.buscarPais(codPais);
            if (buscado == false) {
                String nombre = "NA";
                Pais paso = bodega.returnPais(codPais);
                do {

                    try {
                        System.out.println("Ingrese el nombre del Pais: ");
                        nombre = bf.readLine();
                    } catch (Exception error) {
                        System.out.println("");
                        System.out.println("ERROR: El codigo ingresado no es valido, ingrese dato de tipo texto! ");
                        System.out.println("");
                    }
                } while (nombre.equals(""));

                Pais pais = new Pais(codPais, nombre);
                bodega.addPais(pais);

            } else {
                System.out.println("ERROR: El codigo Pais de Fabricacion que desea registrar ya existe.");
            }
            do {
                try {
                    System.out.println("Desea ingresar otro Pais de Fabricacion (si-no) ");
                    opcion = bf.readLine();
                } catch (Exception error) {
                    System.out.println("");
                    System.out.println("ERROR: El codigo ingresado no es valido, ingrese dato de tipo texto! ");
                    System.out.println("");
                }
            } while (!(opcion.equals("si") || opcion.equals("no")));

        }
    }

    //MENU ACTUALIZAR PAIS DE FABRICACION
    private static void windowActualizarPaisFabricacion() throws Exception {
        BufferedReader bf;
        bf = new BufferedReader(new InputStreamReader(System.in));

        String opcion = "si";
        boolean buscado;
        int id, x;
        String tipoAuto = "NA";

        while (opcion.equals("si")) {
            id = 0;
            do {
                do {
                    try {
                        System.out.println("");
                        System.out.println("Ingrese el codigo del Pais de Fabricacion a modificar: ");
                        id = Integer.parseInt(bf.readLine());
                    } catch (Exception error) {
                        System.out.println("");
                        System.out.println("ERROR: El codigo de pais ingresado no es un dato valido. Ingrese un numero.");
                    }

                } while (id < 1);

                buscado = bodega.buscarPais(id);

                if (buscado == true) {
                    Pais paso = bodega.returnPais(id);
                    System.out.println("");
                    System.out.println("  ***    AUTO ENCONTRADO!   ***  ");
                    System.out.println("Codigo Pais de Fabricacion     : " + paso.getCodigoPais());
                    System.out.println("    1)Nombre                   : " + paso.getNombrePais());
                    System.out.println("    2)Salir");

                    String modificarOtro = "no";
                    int opcionMod = 0;
                    do {
                        System.out.println("");
                        System.out.println("");
                        try {
                            System.out.println("¿Que dato desea modificar?: ");
                            opcionMod = Integer.parseInt(bf.readLine());
                        } catch (Exception error) {
                            System.out.println("");
                            System.out.println("ERROR: El codigo ingresado no es valido, ingrese dato de tipo texto! ");
                            System.out.println("");
                        }
                    } while (!(opcionMod == 1 || opcionMod == 2));
                    switch (opcionMod) {
                        case 1:
                            String nombre = "NA";
                            try {
                                System.out.println("Ingrese el nuevo nombre del Pais de Fabricacion: ");
                                nombre = bf.readLine();
                            } catch (Exception error) {
                                System.out.println("");
                                System.out.println("ERROR: El codigo ingresado no es valido, ingrese dato de tipo texto! ");
                                System.out.println("");
                            }
                            paso.setNombrePais(nombre);
                            break;
                        case 2:
                            System.out.println("");
                            System.out.println("NO SE REALIZARON MODIFICACIONES.");
                            System.out.println("");
                            break;

                    }

                } else {
                    System.out.println("ERROR: El codigo del pais de fabricacion que desea modificar no existe.");
                }

                do {
                    try {
                        System.out.println("¿Desea modificar otro Pais de Fabricacion: (si-no)?");
                        opcion = bf.readLine();
                    } catch (Exception error) {
                        System.out.println("");
                        System.out.println("ERROR: El codigo ingresado no es valido, ingrese dato de tipo texto! ");
                        System.out.println("");
                    }
                } while (!(opcion.equals("si") || opcion.equals("no")));

            } while (!(opcion.equals("no")));
            opcion = "no";
        }
    }

//MENU BORRAR PAIS DE FABRICACION
    private static void windowRemovePaisFabricacion() throws Exception {
        BufferedReader bf;
        bf = new BufferedReader(new InputStreamReader(System.in));

        String opcion = "si", confirmacion = "NA";
        boolean buscado = false;
        int id = 0, x;

        while (opcion.equals("si")) {
            do {
                try {
                    System.out.println("");
                    System.out.println("Ingrese codigo del Pais de Fabricacion a eliminar: ");
                    id = Integer.parseInt(bf.readLine());
                } catch (Exception error) {
                    System.out.println("");
                    System.out.println("El tipo de dato ingresado no es valido, intentelo nuevamente.");
                    System.out.println("");
                }
            } while (id < 1);

            buscado = bodega.buscarPais(id);

            if (buscado == true) {
                Pais paso = bodega.returnPais(id);
                do {
                    try {
                        System.out.println("¿Esta seguro de eliminar el Pais de Fabricacion? (si-no) : ");
                        confirmacion = bf.readLine();
                    } catch (Exception error) {
                        System.out.println("");
                        System.out.println("ERROR: El codigo ingresado no es valido, ingrese dato de tipo texto! ");
                        System.out.println("");
                    }
                } while (!(confirmacion.equals("si") || confirmacion.equals("no")));

                if (confirmacion.equals("si")) {
                    bodega.removePais(paso);
                    System.out.println("");
                    System.out.println("  ***   PAIS DE FABRICACION ELIMINADO.   ***  ");
                    System.out.println("");

                } else {
                    break;
                }
            } else {
                System.out.println("ERROR: El Codigo del Pais de Fabricacio que desea eliminar no existe");
            }

            do {
                try {
                    System.out.println("¿Desea eliminar otro Pais?: (si-no)?");
                    opcion = bf.readLine();
                } catch (Exception error) {
                    System.out.println("");
                    System.out.println("ERROR: El codigo ingresado no es valido, ingrese dato de tipo texto! ");
                    System.out.println("");
                }
            } while (!(opcion.equals("si") || opcion.equals("no")));

        }
    }

    ///////////////////////////////////////////////////////////////////////////
    //MENU REGISTAR ARRIENDOS
    private static void menuRegistroArriendos() throws Exception {
        BufferedReader bf;
        bf = new BufferedReader(new InputStreamReader(System.in));

        int opcion;
        do {
            System.out.println("");
            System.out.println(" ***   MENU DE REGISTRO DE ARRIENDOS   *** ");
            System.out.println("1)Consultar Arriendo");
            System.out.println("2)Generar Arriendo");
            System.out.println("3)Salir");
            do {
                opcion = 0;
                try {
                    System.out.println("");
                    System.out.println("Ingrese opcion: ");
                    opcion = Integer.parseInt(bf.readLine());
                } catch (Exception error) {
                    System.out.println("ERROR: El programa ha detectado invalida la opcion ingresada..");
                }
                System.out.println("");
            } while (opcion < 1 || opcion > 3);
            switch (opcion) {
                case 1:
                    System.out.println("");
                    System.out.println("HA INGRESADO A LA FUNCION CONSULTAR ARRIENDO.");
                    windowConsultarArriendo();
                    System.out.println("");
                    System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||.");
                    break;
                case 2:
                    System.out.println("");
                    System.out.println("HA INGRESADO A LA FUNCION GENERAR ARRIENDO.");
                    windowGenerarArriendo();
                    System.out.println("");
                    System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||.");
                    break;
                case 3:
                    break;

            }
        } while (opcion != 3);
    }

    //MENU CONSULTAR ARRIENDO
    private static void windowConsultarArriendo() throws Exception {
        BufferedReader bf;
        bf = new BufferedReader(new InputStreamReader(System.in));
        //int numeroArriendo, int dia, String mes, int ano, Cliente cliente, Vendedor vendedor, Vehiculo vehiculo, int diasArriendo, int costoArriendo
        String opcion = "si";
        boolean buscado = false;
        int codArriendo = 0, x;
        while (opcion.equals("si")) {
            do {

                try {
                    System.out.println("Ingrese el codigo del Arriendo a consultar: ");
                    codArriendo = Integer.parseInt(bf.readLine());
                } catch (Exception error) {
                    System.out.println("ERROR: El codigo ingresado no es valido, ingrese datos de tipo entero! ");
                }
            } while (codArriendo < 1);

            System.out.println("");
            System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||.");
            buscado = bodega.buscarIdArriendo(codArriendo);
            if (buscado) {
                //(int codArriendo, int dia, String mes, int ano, Cliente cliente(String nombre, String rut, String ciudad, String sexo, int edad, int codCliente, int antiguedadLab, String tipoCliente), Vendedor vendedorString nombre, String rut, String ciudad, String sexo, int edad, int codEmpleado, String cargo, String jornada, 
                //Vehiculo vehiculo(int codigoVehiculo, String marca, int ano, int valorArriendo, Pais pais(int codigoPais, String nombre)), int diasArriendo, int costoArriendo)
                Arriendo paso = bodega.returnArriendo(codArriendo);
                System.out.println("");
                System.out.println("  ***    ARRIENDO ENCONTRADO!   ***  ");
                System.out.println("    Codigo de Arriendo      : " + paso.getCodArriendo());
                System.out.println("    Dia                     : " + paso.getDia());
                System.out.println("    Mes                     : " + paso.getMes());
                System.out.println("    Año                     : " + paso.getAno());
                System.out.println("Cliente                  ");
                System.out.println("    Codigo Cliente          : " + paso.cliente.getCodCliente());
                System.out.println("    Nombre Cliente          : " + paso.cliente.getNombre());
                System.out.println("    Rut Cliente             : " + paso.cliente.getRut());
                System.out.println("    Ciudad Cliente          : " + paso.cliente.getCiudad());
                System.out.println("    Sexo Cliente            : " + paso.cliente.getSexo());
                System.out.println("    Edad Cliente            : " + paso.cliente.getEdad());
                System.out.println("    Antiguedad Lab. Cliente : " + paso.cliente.getAntiguedadLab());
                System.out.println("    Tipo de Cliente         : " + paso.cliente.getTipoCliente());
                System.out.println("Vendedor                 ");
                System.out.println("    Nombre Vendedor         : " + paso.vendedor.getNombre());
                System.out.println("    Rut Vendedor            : " + paso.vendedor.getRut());
                System.out.println("    Ciudad Vendedor         : " + paso.vendedor.getCiudad());
                System.out.println("    Sexo Vendedor           : " + paso.vendedor.getSexo());
                System.out.println("    Edad Vendedor           : " + paso.vendedor.getEdad());
                System.out.println("    Codigo Empleado         : " + paso.vendedor.getCodEmpleado());
                System.out.println("    Cargo                   : " + paso.vendedor.getCargo());
                System.out.println("    Jornada                 : " + paso.vendedor.getJornada());
                System.out.println("Vehiculo                 ");
                System.out.println("    Codigo Vehiculo         : " + paso.vehiculo.getCodigoVehiculo());
                System.out.println("    Marca Vehiculo          : " + paso.vehiculo.getMarca());
                System.out.println("    Año Vehiculo            : " + paso.vehiculo.getAno());
                System.out.println("    Valor Arriendo Vehiculo : " + paso.vehiculo.getValorArriendo());
                System.out.println("    Pais de Fabricación     : " + paso.vehiculo.pais.getNombrePais());
                System.out.println("    Codigo Pais Fabricación : " + paso.vehiculo.pais.getCodigoPais());
                System.out.println("    ");
                System.out.println("Dias de Arriendo            : " + paso.getDiasArriendo());
                System.out.println("Costo Total de Arriendo     : " + paso.getCostoArriendo());
                System.out.println("");
            } else {
                System.out.println("ERROR: El codigo de Arriendo que desea consultar no existe.");
            }
            do {
                try {
                    System.out.println("¿Desea consultar por otro Arriendo? (si-no) : ");
                    opcion = bf.readLine();
                } catch (Exception error) {
                    System.out.println("");
                    System.out.println("ERROR: El codigo ingresado no es valido, ingrese dato de tipo texto! ");
                    System.out.println("");
                }
            } while (!(opcion.equals("si") || opcion.equals("no")));

        }
    }

    //MENU GENERAR ARRIENDO
    private static void windowGenerarArriendo() throws Exception {
        BufferedReader bf;
        bf = new BufferedReader(new InputStreamReader(System.in));

        String opcion = "si";
        boolean buscado = false;
        int x, codArriendo, idCliente = 0, idVehiculo = 0, idVendedor = 0;
        String seguir = "si";
        while (opcion.equals("si")) {
            System.out.println("");
            System.out.println("El Id de Arriendo es el nro: " + bodega.generaNuevoId());
            codArriendo = bodega.generaNuevoId();
            int dia = 0;
            do {
                try {
                    System.out.println("Ingrese el dia de Arriendo                 : ");
                    dia = Integer.parseInt(bf.readLine());
                } catch (Exception error) {
                    System.out.println("");
                    System.out.println("ERROR: El codigo ingresado no es valido, ingrese dato de tipo texto! ");
                    System.out.println("");
                }
            } while (dia < 1);

            String mes = "NA";
            try {
                System.out.println("Ingrese el mes de Arriendo                 : ");
                mes = bf.readLine();
            } catch (Exception error) {
                System.out.println("");
                System.out.println("ERROR: El codigo ingresado no es valido, ingrese dato de tipo texto! ");
                System.out.println("");
            }
            int ano = 0;
            try {
                System.out.println("Ingrese el año de Arriendo                 : ");
                ano = Integer.parseInt(bf.readLine());
            } catch (Exception error) {
                System.out.println("");
                System.out.println("ERROR: El codigo ingresado no es valido, ingrese dato de tipo texto! ");
                System.out.println("");
            }

            //INGRESAR CLIENTE
            Cliente clientePaso = new Cliente();
            while (seguir.equals("si")) {
                try {
                    System.out.println("");
                    System.out.println("CODIGOS DE CLIENTE PARA PRUEBAS");
                    System.out.println("Cliente nro 1: 2001");
                    System.out.println("Cliente nro 2: 2002");
                    System.out.println("Cliente nro 3: 2003");
                    System.out.println("Cliente nro 4: 2004");
                    System.out.println("Cliente nro 5: 2005");
                    System.out.println("Cliente nro 6: 2006");
                    System.out.println("");
                    System.out.println("Digite el codigo numerico de 4 digitos para consultar por un cliente.");
                    System.out.println("");
                    System.out.println("Ingrese el Id de Cliente que desea asociar  : ");
                    idCliente = Integer.parseInt(bf.readLine());
                } catch (Exception error) {
                    System.out.println("");
                    System.out.println("ERROR: El codigo ingresado no es valido, ingrese dato de tipo numerico! ");
                    System.out.println("");
                }
                if (bodega.buscarCodCliente(idCliente) == false) {
                    System.out.println("ERROR: El Id del Cliente que desea asociar no existe.");
                    System.out.println("");
                    System.out.println("¿Desea seguir buscando? (si-no)");
                    seguir = bf.readLine();
                } else if (bodega.buscarCodCliente(idCliente) == true) {
                    clientePaso = bodega.returnCliente(idCliente);
                    seguir = "no";
                }
            }

            System.out.println("");
            System.out.println("      CLIENTE ASOCIADO      ");
            clientePaso.showAtributosVertical();

            //INGRESAR VEHICULO
            Vehiculo vehiculoPaso = null;
            seguir = "si";
            while (seguir.equals("si")) {
                System.out.println("");
                try {
                    System.out.println("");
                    System.out.println("CODIGOS DE VEHICULOS PARA PRUEBAS");
                    System.out.println("Vehiculo nro 1: 3001");
                    System.out.println("Vehiculo nro 2: 3002");
                    System.out.println("Vehiculo nro 3: 3003");
                    System.out.println("Vehiculo nro 4: 3004");
                    System.out.println("Vehiculo nro 5: 3005");
                    System.out.println("Vehiculo nro 6: 3006");
                    System.out.println("");
                    System.out.println("Digite el codigo numerico de 4 digitos para consultar por un vehiculo.");
                    System.out.println("");
                    System.out.println("Ingrese el Id del Vehiculo desea asociar  : ");
                    idVehiculo = Integer.parseInt(bf.readLine());
                } catch (Exception error) {
                    System.out.println("");
                    System.out.println("ERROR: El codigo ingresado no es valido, ingrese dato de tipo numerico! ");
                    System.out.println("");
                }
                if (bodega.buscarIdAuto(idVehiculo) == true) {
                    vehiculoPaso = bodega.returnAuto(idVehiculo);
                    System.out.println("");
                    System.out.println("      VEHICULO ASOCIADO      ");
                    vehiculoPaso.showAtributosVertical();
                    seguir = "no";
                } else if (bodega.buscarIdCamioneta(idVehiculo) == true) {
                    vehiculoPaso = bodega.returnCamioneta(idVehiculo);
                    System.out.println("");
                    System.out.println("      VEHICULO ASOCIADO      ");
                    vehiculoPaso.showAtributosVertical();
                    seguir = "no";
                }
                if (bodega.buscarIdAuto(idVehiculo) == false && bodega.buscarIdCamioneta(idVehiculo) == false) {
                    System.out.println("");
                    System.out.println("ERROR: El Id del Vehiculo que desea asociar no existe.");
                    System.out.println("");
                    try {
                        System.out.println("¿Desea seguir buscando? (si-no)");
                        seguir = bf.readLine();
                    } catch (Exception error) {
                        System.out.println("");
                        System.out.println("ERROR: El codigo ingresado no es valido, ingrese dato de tipo texto! ");
                        System.out.println("");
                    }
                }
            }

            //INGRESAR VENDEDOR
            seguir = "si";
            Vendedor vendedorPaso = new Vendedor();
            while (seguir.equals("si")) {
                System.out.println("");
                try {
                    System.out.println("");
                    System.out.println("CODIGOS DE VENDEDOR PARA PRUEBAS");
                    System.out.println("Vendedor nro 1: 1001");
                    System.out.println("Vendedor nro 2: 1002");
                    System.out.println("Vendedor nro 3: 1003");
                    System.out.println("Vendedor nro 4: 1004");
                    System.out.println("Vendedor nro 5: 1005");
                    System.out.println("Vendedor nro 6: 1006");
                    System.out.println("");
                    System.out.println("Digite el codigo numerico de 4 digitos para consultar por un vendedor.");
                    System.out.println("");
                    System.out.println("Ingrese el Id de Vendedor que desea asociar  : ");
                    idVendedor = Integer.parseInt(bf.readLine());
                } catch (Exception error) {
                    System.out.println("");
                    System.out.println("ERROR: El codigo ingresado no es valido, ingrese dato de tipo numerico! ");
                    System.out.println("");
                }
                if (bodega.buscarIdVendedor(idVendedor) == true) {
                    bodega.buscarIdVendedor(idVendedor);
                    seguir = "no";
                    vendedorPaso = bodega.returnVendedor(idVendedor);
                    System.out.println("");
                    System.out.println("      VENDEDOR ASOCIADO      ");
                    vendedorPaso.showAtributosVertical();
                } else if (bodega.buscarIdVendedor(idVendedor) == false) {
                    System.out.println("");
                    System.out.println("ERROR: El Id del Vendedor que desea asociar no existe.");
                    try {
                        System.out.println("¿Desea seguir buscando? (si-no)");
                        seguir = bf.readLine();
                    } catch (Exception error) {
                        System.out.println("");
                        System.out.println("ERROR: El codigo ingresado no es valido, ingrese dato de tipo texto! ");
                        System.out.println("");
                    }
                }
            }
            System.out.println("");
            int diasArriendo = 0;
            try {
                System.out.println("Ingrese los dias de arriendo: ");
                diasArriendo = Integer.parseInt(bf.readLine());
            } catch (Exception error) {
                System.out.println("");
                System.out.println("ERROR: El codigo ingresado no es valido, ingrese dato de tipo numerico! ");
                System.out.println("");
            }
            int costoArriendo = diasArriendo * vehiculoPaso.getValorArriendo();

            System.out.println("");
            Arriendo arriendo = new Arriendo(codArriendo, dia, mes, ano, clientePaso, vendedorPaso, vehiculoPaso, diasArriendo, costoArriendo);
            bodega.grabarArriendo(arriendo);
            opcion = "no";
            System.out.println("SE HA AGREGADO EL ARRIENDO Nro " + bodega.generaNuevoId());
        }
    }

    //MENU ELIMINAR ARRIENDO
    private static void windowRemoveArriendo() throws Exception {
        BufferedReader bf;
        bf = new BufferedReader(new InputStreamReader(System.in));

        String opcion = "si", confirmacion = "NA";
        Arriendo paso = null;
        boolean buscado = false;
        int id = 0, x;

        while (opcion.equals("si")) {
            try {
                System.out.println("Ingrese codigo de Arriendo a eliminar: ");
                id = Integer.parseInt(bf.readLine());
            } catch (Exception error) {
                System.out.println("");
                System.out.println("ERROR: El codigo ingresado no es valido, ingrese dato de tipo entero! ");
                System.out.println("");
            }
            buscado = bodega.buscarIdArriendo(id);

            if (buscado == true) {
                paso = bodega.returnArriendo(id);
                do {
                    System.out.println("");
                    paso.showAtributosVertical();
                    System.out.println("");
                    try {
                        System.out.println("¿Esta seguro de eliminar el Arriendo? (si-no) : ");
                        confirmacion = bf.readLine();
                    } catch (Exception error) {
                        System.out.println("");
                        System.out.println("ERROR: El codigo ingresado no es valido, ingrese dato de tipo texto! ");
                        System.out.println("");
                    }
                } while (!(confirmacion.equals("si") || confirmacion.equals("no")));

                if (confirmacion.equals("si")) {
                    bodega.removeArriendo(paso);
                    System.out.println("");
                    System.out.println("     ARRIENDO ELIMINADO.     ");
                    System.out.println("");

                } else {
                    break;
                }
            } else {
                System.out.println("ERROR: El Codigo del auto que desea eliminar no existe: ");
            }

            do {
                try {
                    System.out.println("¿Desea eliminar otro Auto?: (si-no)?");
                    opcion = bf.readLine();
                } catch (Exception error) {
                    System.out.println("");
                    System.out.println("ERROR: El codigo ingresado no es valido, ingrese dato de tipo texto! ");
                    System.out.println("");
                }
            } while (!(opcion.equals("si") || opcion.equals("no")));

        }
    }

    //MENU REPORTES
    private static void menuReportes() throws Exception {
        BufferedReader bf;
        bf = new BufferedReader(new InputStreamReader(System.in));

        int opcion;
        do {
            System.out.println("");
            System.out.println(" ***   MENU REPORTES   *** ");
            System.out.println("1)Reporte Vendedores");
            System.out.println("2)Reporte Clientes");
            System.out.println("3)Reporte Vehiculos");
            System.out.println("4)Reporte Arriendos");
            System.out.println("5)Salir");
            do {
                opcion = 0;
                try {
                    System.out.println("");
                    System.out.println("Ingrese opcion: ");
                    opcion = Integer.parseInt(bf.readLine());
                    System.out.println("");
                    System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
                } catch (Exception error) {
                    System.out.println("El programa ha detectado invalida la opcion ingresada =( .");
                }
            } while (opcion < 1 || opcion > 5);
            switch (opcion) {
                case 1:
                    System.out.println("");
                    System.out.println("MENU EN MANTENIMIENTO. VUELVE A INTENTARLO MAS TARDE!");
                    System.out.println("");
                    System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
                    break;
                case 2:
                    System.out.println("");
                    System.out.println("HA INGRESADO AL REGISTRO DE REPORTES DE CLIENTES.");
                    System.out.println("");
                    windowReporteClientes();
                    System.out.println("");
                    System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
                    break;
                case 3:
                    System.out.println("");
                    System.out.println("HA INGRESADO AL REGISTRO DE REPORTES DE VEHICULOS.");
                    System.out.println("");
                    windowReporteVehiculos();
                    System.out.println("");
                    System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
                    break;
                case 4:
                    System.out.println("");
                    System.out.println("HA INGRESADO AL REGISTRO DE REPORTES DE ARRIENDOS.");
                    System.out.println("");
                    windowReporteArriendos();
                    System.out.println("");
                    System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
                    break;
                case 5:
                    break;

            }
        } while (opcion != 5);
    }

    //REPORTES DE CLIENTES menu
    public static void windowReporteClientes() throws Exception {
        BufferedReader bf;
        bf = new BufferedReader(new InputStreamReader(System.in));

        int opcion;
        do {
            //DENTRO DEL MENU REPORTES, CREAMOS UN SUBMENU PARA REPORTE DE CLIENTES
            System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||.");
            System.out.println("");
            System.out.println(" ***   MENÚ DE REPORTES CLIENTES   *** ");
            System.out.println("1)Reporte por ciudad y media Edad");
            System.out.println("2)Reporte por tipo de cliente");
            System.out.println("3)Reporte por Sexo");
            System.out.println("4)Reporte por Antiguedad Laboral");
            System.out.println("5)Salir");
            do {
                opcion = 0;
                try {
                    System.out.println("");
                    System.out.println("Ingrese opción: ");
                    opcion = Integer.parseInt(bf.readLine());
                    System.out.println("");
                    System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||.");
                } catch (Exception error) {
                    System.out.println("");
                    System.out.println("ERROR: El programa ha detectado invalida la opcion ingresada.");
                    System.out.println("");
                    System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
                }
            } while (opcion < 1 || opcion > 5);
            switch (opcion) {
                case 1:
                    System.out.println("");
                    windowReporteClientesCiudad();
                    System.out.println("");
                    break;
                case 2:
                    System.out.println("");
                    windowReporteClientesTipo();
                    System.out.println("");
                    break;
                case 3:
                    System.out.println("");
                    windowReporteClientesSexo();
                    System.out.println("");
                    break;
                case 4:
                    System.out.println("");
                    windowReporteClienteAntLaboral();
                    System.out.println("");;
                    break;
                case 5:
                    break;

            }
        } while (opcion != 5);
    }

    //REPORTE CLIENTES POR CIUDAD Y PROMEDIO DE EDAD DE LOS CLIENTES
    public static void windowReporteClientesCiudad() throws Exception {
        BufferedReader bf;
        bf = new BufferedReader(new InputStreamReader(System.in));

        int mediaEdades = 0;
        System.out.println("*** Reporte Clientes por Ciudad ***");
        String ciudadBuscada = "NA";
        try {
            System.out.println("");
            System.out.println("CODIGOS DE CIUDAD PARA PRUEBAS");
            System.out.println("La Serena  : LS");
            System.out.println("Coquimbo   : CQ");
            System.out.println("Santiago   : ST");
            System.out.println("");
            System.out.println("Digite el codigo de texto de 2 digitos para consultar por una ciudad.");
            System.out.println("");
            System.out.println("Ingrese Ciudad: ");
            ciudadBuscada = bf.readLine().toUpperCase();
        } catch (Exception error) {
            System.out.println("");
            System.out.println("ERROR: El codigo ingresado no es valido, ingrese dato de tipo texto! ");
            System.out.println("");
        }
        System.out.println("");
        ArrayList<Cliente> temp = bodega.returnClienteCiudad(ciudadBuscada);
        //FALTA MODIFICARFALTA MODIFICARFALTA MODIFICARFALTA MODIFICARFALTA MODIFICARFALTA MODIFICARFALTA MODIFICARFALTA MODIFICAR
        System.out.println("NOMBRE           RUT    CIUDAD        SEXO         EDAD     COD CLIENTE   ANT. LABORAL        TIPO CLIENTE");
        Cliente celda = new Cliente();
        for (int i = 0; i < temp.size(); i++) {
            celda = temp.get(i);
            celda.showAtributosHorizontal();
            System.out.println("");
        }
        int i = 0;
        int sumaEdades = 0;
        while (i < temp.size()) {
            int tempEdad = celda.getEdad();
            sumaEdades = tempEdad + sumaEdades;
            mediaEdades = sumaEdades / temp.size();
            i++;
        }

        System.out.println("");
        System.out.println("Media edad: " + mediaEdades);
        System.out.println("");

    }

    //REPORTE CLIENTES POR TIPO, INDICANDO SU TOTALIDAD
    public static void windowReporteClientesTipo() throws Exception {
        BufferedReader bf;
        bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("*** Reporte Clientes por tipo y su total ***");
        System.out.println("");
        String tipoCliente = "NA";
        do {
            try {
                System.out.println("Ingrese tipo de Cliente  ( (E)mpresa - (P)articular ): ");
                tipoCliente = bf.readLine().toUpperCase();
            } catch (Exception error) {
                System.out.println("");
                System.out.println("ERROR: El codigo ingresado no es valido, ingrese dato de tipo texto! ");
                System.out.println("");
            }
        } while (!(tipoCliente.equals("E") || tipoCliente.equals("P")));
        if (tipoCliente.equals("E")) {
            tipoCliente = "Empresa";
        } else if (tipoCliente.equals("P")) {
            tipoCliente = "Particular";
        }
        System.out.println("");
        ArrayList<Cliente> temp = bodega.returnClienteTipo(tipoCliente);
        System.out.println("NOMBRE          RUT     CIUDAD          SEXO       EDAD       COD CLIENTE     ANT. LABORAL      TIPO CLIENTE");
        for (int i = 0; i < temp.size(); i++) {
            Cliente celda = temp.get(i);
            celda.showAtributosHorizontal();
            System.out.println("");

        }
        int totalTipo;
        totalTipo = temp.size();

        System.out.println("");
        System.out.println("Total tipo: " + totalTipo);
        System.out.println("");

    }

    //REPORTE CLIENTES FILTRADOS POR SEXO, INDICANDO EL TOTAL DE HOMBRE O MUJER
    public static void windowReporteClientesSexo() throws Exception {
        BufferedReader bf;
        bf = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("");
        System.out.println("*** Reporte Clientes por sexo y su total ***");
        System.out.println("");
        String sexoCliente = "NA";
        do {
            try {
                System.out.println("Ingrese sexo de Cliente a Filtrar ( (F)emenino - (M)asculino ): ");
                sexoCliente = bf.readLine().toUpperCase();
            } catch (Exception error) {
                System.out.println("");
                System.out.println("ERROR: El codigo ingresado no es valido, ingrese dato de tipo texto! ");
                System.out.println("");
            }
        } while (!(sexoCliente.equals("M") || sexoCliente.equals("F")));
        if (sexoCliente.equals("M")) {
            sexoCliente = "Masculino";
        } else if (sexoCliente.equals("F")) {
            sexoCliente = "Femenino";
        }

        System.out.println("");
        ArrayList<Cliente> temp = bodega.returnClienteSexo(sexoCliente);
        System.out.println("NOMBRE           RUT    CIUDAD        SEXO         EDAD     COD CLIENTE   ANT. LABORAL        TIPO CLIENTE");
        for (int i = 0; i < temp.size(); i++) {
            Cliente celda = temp.get(i);
            celda.showAtributosHorizontal();
            System.out.println("");

        }
        int totalTipo;
        totalTipo = temp.size();

        System.out.println("");
        System.out.println("Total de sexo " + sexoCliente + " :  " + totalTipo);
        System.out.println("");

    }

    //REPORTE CLIENTES POR ANTIGUEDAD LABORAL + A 6 MESES
    public static void windowReporteClienteAntLaboral() throws Exception {
        BufferedReader bf;
        bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("***   Reporte Clientes por Antiguedad laboral mayor a 6 meses   ***");
        System.out.println("");
        ArrayList<Cliente> temp = bodega.returnClienteAntiguedad();
        System.out.println("NOMBRE           RUT    CIUDAD        SEXO         EDAD     COD CLIENTE   ANT. LABORAL        TIPO CLIENTE");

        for (int i = 0; i < temp.size(); i++) {
            Cliente celda = temp.get(i);
            celda.showAtributosHorizontal();
            System.out.println("");
            System.out.println("");
        }
    }

    //REPORTE VEHICULOS menu
    public static void windowReporteVehiculos() throws Exception {
        BufferedReader bf;
        bf = new BufferedReader(new InputStreamReader(System.in));

        int opcion;
        do {
            System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||.");
            System.out.println("");
            System.out.println(" ***   MENÚ DE REPORTES VEHICULOS   *** ");
            System.out.println("1)Reporte por país");
            System.out.println("2)Reporte por tipo de vehiculos");
            System.out.println("3)Reporte por Año 2015 en adelante");
            System.out.println("4)Reporte por Marca");
            System.out.println("5)Salir");
            do {
                opcion = 0;
                try {
                    System.out.println("");
                    System.out.println("Ingrese opción: ");
                    opcion = Integer.parseInt(bf.readLine());
                    System.out.println("");
                    System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||.");
                } catch (Exception error) {
                    System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||.");
                    System.out.println("");
                    System.out.println("ERROR: El programa ha detectado invalida la opcion ingresada.");
                    System.out.println("");
                    System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||.");
                }
            } while (opcion < 1 || opcion > 5);
            switch (opcion) {
                case 1:
                    System.out.println("");
                    windowReporteVehiculosPais();
                    System.out.println("");
                    break;
                case 2:
                    System.out.println("");
                    windowReporteVehiculosTipo();
                    System.out.println("");
                    break;
                case 3:
                    System.out.println("");
                    windowReporteVehiculos2015();
                    System.out.println("");
                    break;
                case 4:
                    System.out.println("");
                    windowReporteVehiculosMarca();
                    System.out.println("");
                    break;
                case 5:
                    break;

            }
        } while (opcion != 5);
    }

    //REPORTE VEHICULO POR PAIS
    public static void windowReporteVehiculosPais() throws Exception {
        BufferedReader bf;
        bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("*** Reporte Vehiculos por Pais ***");
        int codPaisBuscado = 0;
        try {
            System.out.println("");
            System.out.println("CODIGOS DE PAIS PARA PRUEBAS");
            System.out.println("USA      : 5001");
            System.out.println("Francia  : 5002");
            System.out.println("Alemania : 5003");
            System.out.println("Japon    : 5004");
            System.out.println("India    : 5005");
            System.out.println("España   : 5006");
            System.out.println("");
            System.out.println("Digite el codigo numerico de 4 digitos para consultar por un pais.");
            System.out.println("");
            System.out.println("Ingrese Codigo de Pais: ");
            codPaisBuscado = Integer.parseInt(bf.readLine());
            System.out.println("");
        } catch (Exception error) {
            System.out.println("ERROR: El codigo ingresado no es valido, ingrese dato de tipo numerico! ");
            System.out.println("");
        }
        ArrayList<Auto> tempA = bodega.returnAutoPais(codPaisBuscado);
        ArrayList<Camioneta> tempC = bodega.returnCamionetaPais(codPaisBuscado);
        //FALTA MODIFICARFALTA MODIFICARFALTA MODIFICARFALTA MODIFICARFALTA MODIFICARFALTA MODIFICARFALTA MODIFICARFALTA MODIFICAR
        System.out.println("");
        System.out.println("CODIGO       AÑO        MARCA       PAIS      VALOR ARR.  TIPO VEHI.  PORTAEQUIPAJE    TIPO AUTO");

        for (int i = 0; i < tempA.size(); i++) {
            Auto celda = tempA.get(i);
            celda.showAtributosHorizontal();

        }
        System.out.println("");
        System.out.println("CODIGO       AÑO        MARCA       PAIS      VALOR ARR.    TIPO VEHICULO  CAP. CARGA   DOBLE CABINA");

        for (int i = 0; i < tempC.size(); i++) {
            Camioneta celda = tempC.get(i);
            celda.showAtributosHorizontal();
        }
        System.out.println("");
    }
    //REPORTE VEHICULO POR TIPO

    public static void windowReporteVehiculosTipo() throws Exception {
        BufferedReader bf;
        bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("*** Reporte Vehiculos por Tipo ***");
        System.out.println("");
        String tipoVehiculo = "NA";
        try {

            System.out.println("Ingrese el tipo de vehiculo a filtrar (Auto - Camioneta): ");
            tipoVehiculo = bf.readLine();
        } catch (Exception error) {
            System.out.println("");
            System.out.println("ERROR: El codigo ingresado no es valido, ingrese dato de tipo texto! ");
            System.out.println("");
        }
        System.out.println("");
        switch (tipoVehiculo) {
            case "Auto":
                //FALTA MODIFICARFALTA MODIFICARFALTA MODIFICARFALTA MODIFICARFALTA MODIFICARFALTA MODIFICARFALTA MODIFICARFALTA MODIFICAR
                System.out.println("CODIGO       AÑO        MARCA       PAIS      VALOR ARR.  TIPO VEHI.  PORTAEQUIPAJE    TIPO AUTO");
                ArrayList<Auto> temp1 = bodega.returnTipoAuto();
                for (int i = 0; i < temp1.size(); i++) {
                    Auto celda = temp1.get(i);
                    celda.showAtributosHorizontal();
                    System.out.println("");

                }
                break;
            case "Camioneta":
                //FALTA MODIFICARFALTA MODIFICARFALTA MODIFICARFALTA MODIFICARFALTA MODIFICARFALTA MODIFICARFALTA MODIFICARFALTA MODIFICAR
                System.out.println("CODIGO       AÑO        MARCA       PAIS      VALOR ARR.    TIPO VEHICULO  CAP. CARGA   DOBLE CABINA");
                ArrayList<Camioneta> temp2 = bodega.returnTipoCamioneta();
                for (int i = 0; i < temp2.size(); i++) {
                    Camioneta celda = temp2.get(i);
                    celda.showAtributosHorizontal();
                    System.out.println("");

                }
                break;
        }

    }

    //REPORTE LISTADO VEHICULOS DE 2015 EN ADELANTE
    public static void windowReporteVehiculos2015() throws Exception {
        BufferedReader bf;
        bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("*** Reporte Vehiculos mayores al año 2015 ***");
        System.out.println("");
        ArrayList<Camioneta> tempC = bodega.returnCamioneta2015();
        ArrayList<Auto> tempA = bodega.returnAuto2015();
        System.out.println("CODIGO       AÑO        MARCA       PAIS      VALOR ARR.  TIPO VEHI.  PORTAEQUIPAJE    TIPO AUTO");
        for (int i = 0; i < tempC.size(); i++) {
            Camioneta celda = tempC.get(i);
            celda.showAtributosHorizontal();
            System.out.println("");

        }
        System.out.println("CODIGO       AÑO        MARCA       PAIS      VALOR ARR.    TIPO VEHICULO  CAP. CARGA   DOBLE CABINA");
        for (int i = 0; i < tempA.size(); i++) {
            Auto celda = tempA.get(i);
            celda.showAtributosHorizontal();
            System.out.println("");

        }

    }

    //REPORTE FILTRADO DE VEHICULOS POR MARCA
    public static void windowReporteVehiculosMarca() throws Exception {
        BufferedReader bf;
        bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("*** Reporte Vehiculos por Marca ***");
        System.out.println("");
        String marcaVehiculo = "NA";
        try {
            System.out.println("");
            System.out.println("MARCAS DE VEHICULOS PARA PRUEBAS");
            System.out.println("");
            System.out.println("Ford");
            System.out.println("Chevrolet");
            System.out.println("Citroen");
            System.out.println("Mercedez");
            System.out.println("");
            System.out.println("Escriba en formato texto la marca que desea consultar.");
            System.out.println("");
            System.out.println("Ingrese la marca del vehiculo a Filtrar: ");
            marcaVehiculo = bf.readLine();
        } catch (Exception error) {
            System.out.println("");
            System.out.println("ERROR: El codigo ingresado no es valido, ingrese dato de tipo texto! ");
            System.out.println("");
        }
        System.out.println("");
        ArrayList<Auto> tempA = bodega.returnAutoMarca(marcaVehiculo);
        ArrayList<Camioneta> tempC = bodega.returnCamionetaMarca(marcaVehiculo);
        System.out.println(" ***   AUTO   *** ");
        System.out.println("CODIGO       AÑO        MARCA       PAIS      VALOR ARR.  TIPO VEHI.  PORTAEQUIPAJE    TIPO AUTO");

        for (int i = 0; i < tempA.size(); i++) {
            Auto celda = tempA.get(i);
            celda.showAtributosHorizontal();
            System.out.println("");

        }
        System.out.println(" ***   CAMIONETA   *** ");
        System.out.println("CODIGO       AÑO        MARCA       PAIS      VALOR ARR.    TIPO VEHICULO  CAP. CARGA   DOBLE CABINA");

        for (int i = 0; i < tempC.size(); i++) {
            Camioneta celda = tempC.get(i);
            celda.showAtributosHorizontal();
            System.out.println("");

        }

    }

    //REPORTE ARRIENDOS menu
    public static void windowReporteArriendos() throws Exception {
        BufferedReader bf;
        bf = new BufferedReader(new InputStreamReader(System.in));

        int opcion;
        do {
            System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||.");
            System.out.println("");
            System.out.println(" ***   MENÚ DE REPORTES ARRIENDO   *** ");
            System.out.println("");  
            System.out.println("1)Reporte por mes");
            System.out.println("2)Reporte por vendedor y total");
            System.out.println("3)Reporte por cliente y total dinero");
            System.out.println("4)Total dinero por clientes empresas");
            System.out.println("5)Salir");
            do {
                opcion = 0;
                try {
                    System.out.println("");
                    System.out.println("Ingrese opción: ");
                    opcion = Integer.parseInt(bf.readLine());
                    System.out.println("");
                    System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||.");
                } catch (Exception error) {
                    System.out.println("El programa ha detectado invalida la opcion ingresada =( .");
                }
            } while (opcion < 1 || opcion > 5);
            switch (opcion) {
                case 1:
                    windowReporteArriendosMes();
                    break;
                case 2:
                    windowReporteArriendosVendedor();
                    break;
                case 3:
                    windowReporteArriendosCliente();
                    break;
                case 4:
                    windowReporteArriendosEmpresa();
                    break;
                case 5:
                    break;

            }
        } while (opcion != 5);

    }

    //REPORTE ARRIENDOS POR MES
    private static void windowReporteArriendosMes() throws Exception {
        BufferedReader bf;
        bf = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("");
        System.out.println("*** Reporte de Arriendo por Mes ***");
        System.out.println("");
        String mesArriendo = "NA";
        try {
            System.out.println("");
            System.out.println("MESES DISPONIBLES PARA PRUEBAS");
            System.out.println("Agosto");
            System.out.println("Enero");
            System.out.println("Febrero");
            System.out.println("Marzo");
            System.out.println("Abril");
            System.out.println("Junio");
            System.out.println("");
            System.out.println("Escriba en formato texto el mes de arriendo que desea consultar.");
            System.out.println("");
            System.out.println("Ingrese el mes de Arriendo a consultar: ");
            mesArriendo = bf.readLine();
            System.out.println("");;
        } catch (Exception error) {
            System.out.println("");
            System.out.println("ERROR: El codigo ingresado no es valido, ingrese dato de tipo texto! ");
            System.out.println("");
        }
        System.out.println("");
        ArrayList<Arriendo> temp = bodega.returnArriendoMes(mesArriendo);
        System.out.println("  ID ARR.     DIA     MES     AÑO       NOM. CLIENTE   ID CLIENTE    NOM. VEND.    ID VEND.     MARCA VEHI.    ID VEHI.    DIAS ARR.    COSTO TOTAL");
        for (int i = 0; i < temp.size(); i++) {
            Arriendo celda = temp.get(i);
            celda.showAtributosHorizontal();
            System.out.println("");

        }
        System.out.println("");
    }

    //REPORTE ARRIENDOS POR VENDEDOR EN PARTICULAR, INDICANDO EL TOTAL DE ARRIENDOS DE ESTE
    private static void windowReporteArriendosVendedor() throws Exception {
        BufferedReader bf;
        bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("");
        System.out.println("*** Reporte de Arriendo por Vendedor ***");
        int codigoVendedor = 0;
        try {
            System.out.println("");
            System.out.println("CODIGOS DE VENDEDORES PARA PRUEBAS");
            System.out.println("Vendedor nro 1: 1001");
            System.out.println("Vendedor nro 2: 1002");
            System.out.println("Vendedor nro 3: 1003");
            System.out.println("Vendedor nro 4: 1004");
            System.out.println("Vendedor nro 5: 1005");
            System.out.println("Vendedor nro 6: 1006");
            System.out.println("");
            System.out.println("Digite el codigo numerico de 4 digitos para consultar por un vendedor.");
            System.out.println("");
            System.out.println("Ingrese el codigo de vendedor a cargo del Arriendo a consultar: ");
            codigoVendedor = Integer.parseInt(bf.readLine());
            System.out.println("");
        } catch (Exception error) {
            System.out.println("");
            System.out.println("ERROR: El codigo ingresado no es valido, ingrese dato de tipo numerico! ");
            System.out.println("");
        }
        System.out.println("");
        ArrayList<Arriendo> temp = bodega.returnArriendoVendedor(codigoVendedor);
        System.out.println("  ID ARR.     DIA     MES     AÑO       NOM. CLIENTE   ID CLIENTE    NOM. VEND.    ID VEND.     MARCA VEHI.    ID VEHI.    DIAS ARR.    COSTO TOTAL");
        for (int i = 0; i < temp.size(); i++) {
            Arriendo celda = temp.get(i);
            celda.showAtributosHorizontal();
            System.out.println("");

        }
        System.out.println("");
        System.out.println("Total de arriendos por Vendedor indexado: " + temp.size());
        System.out.println("");
        System.out.println("");
    }

    //REPORTE ARRIENDOS POR CLIENTE EN EL AÑO 2020, INDICADO EL DINERO PAGADO POR TAL EFECTO
    private static void windowReporteArriendosCliente() throws Exception {
        BufferedReader bf;
        bf = new BufferedReader(new InputStreamReader(System.in));
        Arriendo celda = new Arriendo();
        System.out.println("");
        System.out.println("*** Reporte de Arriendos - Clientes 2020 ***");
        System.out.println("");
        int codigoCliente = 0;
        try {
            System.out.println("");
            System.out.println("CODIGOS DE CLIENTE PARA PRUEBAS");
            System.out.println("Cliente nro 1: 2001");
            System.out.println("Cliente nro 2: 2002");
            System.out.println("Cliente nro 3: 2003");
            System.out.println("Cliente nro 4: 2004");
            System.out.println("Cliente nro 5: 2005");
            System.out.println("Cliente nro 6: 2006");
            System.out.println("");
            System.out.println("Digite el codigo numerico de 4 digitos para consultar por un cliente.");
            System.out.println("");
            System.out.println("Ingrese el codigo del Cliente a consultar: ");
            codigoCliente = Integer.parseInt(bf.readLine());
            System.out.println("");
        } catch (Exception error) {
            System.out.println("");
            System.out.println("ERROR: El codigo ingresado no es valido, ingrese dato de tipo numerico! ");
            System.out.println("");
        }
        System.out.println("");
        ArrayList<Arriendo> temp = bodega.returnArriendoCliente2020(codigoCliente);
        System.out.println("  ID ARR.     DIA     MES     AÑO       NOM. CLIENTE  COD CLIENTE    NOM. VEND.    ID VEND.     MARCA VEHI.    ID VEHI.    DIAS ARR.    COSTO TOTAL");
        for (int i = 0; i < temp.size(); i++) {
            celda = temp.get(i);
            celda.showAtributosHorizontal();
            System.out.println("");

        }
        System.out.println("");
        System.out.println("Total de dinero pagado por Arriendos en 2020: " + bodega.returnArriendo2020Total(codigoCliente));
        System.out.println("");
    }

    //REPORTE ARRIENDOS POR EMPRESA 
    private static void windowReporteArriendosEmpresa() throws Exception {
        BufferedReader bf;
        bf = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("");
        System.out.println("*** TOTAL DE DINERO OBTENIDO POR CLIENTES EMPRESA ***");
        System.out.println("");
        System.out.println("Total Dinero :  " + bodega.returnTotalClienteEmpresa());
        System.out.println("");
        System.out.println("");
    }
}
























