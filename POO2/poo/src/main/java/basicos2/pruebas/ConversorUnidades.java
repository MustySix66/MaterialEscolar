package basicos2.pruebas;

import java.util.Scanner;

public class ConversorUnidades{

    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    
    public static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        boolean SesionMenu=true;
        while (SesionMenu) {
            limpiarConsola();
            System.out.println("Qué tipo de operación te gustaria realizar?: \n"+
            "1) Conversion de longitud. \n"+
            "2) Conversion de volumen. \n"+
            "3) Conversion de peso. \n"+
            "4) Conversion de Temperatura.\n"+
            "5) Salir. \n");
            int VariableMenuPrincipal= scan.nextInt();
            switch (VariableMenuPrincipal) {
                case 1:
                    // TODO: los try no son necesarios
                    try {
                        limpiarConsola();
                        ConversorLongitud();
                    } catch (Exception e) {
                        System.out.println("Error Longitud Caso 1. ");
                    }
                    break;
                case 2:
                // TODO: los try no son necesarios
                    try {
                        limpiarConsola();
                        ConversorVolumen();
                    } catch (Exception e) {
                        System.out.println("Error volumen Caso 2");
                    }
                    break;
                case 3:
                // TODO: los try no son necesarios
                    try {
                        limpiarConsola();
                        ConversorPeso();
                    } catch (Exception e) {
                        System.out.println("Error peso caso 3");
                    }
                    break;
                case 4:
                // TODO: los try no son necesarios
                    try {
                        limpiarConsola();
                        ConversorTemperatura();
                    } catch (Exception e) {
                        System.out.println("Error Temperatura Caso 4");
                    }
                    break;
                case 5:
                    SesionMenu=false;
                    limpiarConsola();
                    System.out.println("Hasta la proxima.");
                    break;
                default:
                    limpiarConsola();
                    System.out.println("Selecciona una opcion valida.");
                }
            }
        }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    private static float ConversorLongitud() {
        limpiarConsola();
        boolean SesionLongitud=true;
        float UnidadIngreso = 0,UnidadReturn=0;
        // TODO: los try no son necesarios
        try {
            while (SesionLongitud) {
                System.out.println("Cuál te gustaría convertir? \n"+
                "1) Metros a Pies? \n"+
                "2) Kilometros a millas? \n"+
                "3) Centimetros a pulgadas? \n"+
                "4) Salir");
                int SeleccionLongitud = scan.nextInt();
                limpiarConsola();
                switch (SeleccionLongitud) {
                    case 1:
                        System.out.print("Indica la cantidad que quieres transformar: ");
                        UnidadIngreso=scan.nextFloat();
                        UnidadReturn=(float)(UnidadIngreso*3.28084);
                        System.out.println(UnidadIngreso + " metros equivalen a "+UnidadReturn+" pies.");
                        break;
                    case 2:
                        System.out.print("Indica la cantidad que quieres transformar: ");
                        UnidadIngreso=scan.nextFloat();
                        UnidadReturn=(float)(UnidadIngreso*0.621371);
                        System.out.println(UnidadIngreso + " kilometros equivalen a "+UnidadReturn+" millas.");
                        break;
                    case 3:
                        System.out.print("Indica la cantidad que quieres transformar: ");
                        UnidadIngreso=scan.nextFloat();
                        UnidadReturn=(float)(UnidadIngreso*0.393701);
                        System.out.println(UnidadIngreso + " centimetros equivalen a "+UnidadReturn+" pulgadas.");
                        break;
                    case 4:
                        System.out.println("Saliendo al menú principal.\n"+"\n" + "\n" + "\n" +"\n");
                        SesionLongitud=false;
                        break;
                    default:
                        System.out.println("Selecciona una opcion valida.");
                }
            }
        } catch (Exception e) {
            System.out.println("Error funcion ConversorLongitud");
        }
        return UnidadReturn;
    }

    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    private static float ConversorVolumen() {
        limpiarConsola();
        boolean Sesion=true;
        float UnidadIngreso = 0,UnidadReturn=0;
        // TODO: los try no son necesarios
        try {
            while (Sesion) {
                System.out.println("Cuál te gustaría convertir? \n"+
                "1) Litro a taza? \n"+
                "2) Litro a mililitros? \n"+
                "3) Litros a Onzas? \n"+
                "4) Salir");
                int SeleccionLongitud = scan.nextInt();
                limpiarConsola();
                switch (SeleccionLongitud) {
                    case 1:
                        System.out.print("Indica la cantidad que quieres transformar: ");
                        UnidadIngreso=scan.nextFloat();
                        UnidadReturn=(short)(UnidadIngreso*4.16667);
                        System.out.println(UnidadIngreso + " litros equivalen a "+UnidadReturn+" taza.");
                        break;
                    case 2:
                        System.out.print("Indica la cantidad que quieres transformar: ");
                        UnidadIngreso=scan.nextFloat();
                        UnidadReturn=(float)(UnidadIngreso*1000);
                        System.out.println(UnidadIngreso + " litros equivalen a "+UnidadReturn+" mililitros.");
                        break;
                    case 3:
                        System.out.print("Indica la cantidad que quieres transformar: ");
                        UnidadIngreso=scan.nextFloat();
                        UnidadReturn=(long)(UnidadIngreso*33.8140497531);
                        System.out.println(UnidadIngreso + " litros equivalen a "+UnidadReturn+" onzas.");
                        break;
                    case 4:
                        System.out.println("Saliendo al menú principal.\n"+"\n" + "\n" + "\n" +"\n");
                        Sesion=false;
                        break;
                    default:
                        System.out.println("Selecciona una opcion valida.");
                }
            }
        } catch (Exception e) {
            System.out.println("Error funcion ConversorVolumen");
        }
        return UnidadReturn;
    }

    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    private static float ConversorPeso() {
        limpiarConsola();
        boolean Sesion=true;
        float UnidadIngreso = 0,UnidadReturn=0;
        // TODO: los try no son necesarios
        try {
            while (Sesion) {
                System.out.println("Cuál te gustaría convertir? \n"+
                "1) Kilogramo a Onza? \n"+
                "2) Kilogramo a Libras? \n"+
                "3) Kilogramo a gramos? \n"+
                "4) Salir");
                int SeleccionLongitud = scan.nextInt();
                limpiarConsola();
                switch (SeleccionLongitud) {
                    case 1:
                        System.out.print("Indica la cantidad que quieres transformar: ");
                        UnidadIngreso=scan.nextFloat();
                        UnidadReturn=(float)(UnidadIngreso*35.274);
                        System.out.println(UnidadIngreso + " kilogramos equivalen a "+UnidadReturn+" onzas.");
                        break;
                    case 2:
                        System.out.print("Indica la cantidad que quieres transformar: ");
                        UnidadIngreso=scan.nextFloat();
                        UnidadReturn=(long)(UnidadIngreso*2.205);
                        System.out.println(UnidadIngreso + " kilogramos equivalen a "+UnidadReturn+" libras.");
                        break;
                    case 3:
                        System.out.print("Indica la cantidad que quieres transformar: ");
                        UnidadIngreso=scan.nextFloat();
                        UnidadReturn=(short)(UnidadIngreso*1000);
                        System.out.println(UnidadIngreso + " kilogramos equivalen a "+UnidadReturn+" gramos.");
                        break;
                    case 4:
                        System.out.println("Saliendo al menú principal.\n"+"\n" + "\n" + "\n" +"\n");
                        Sesion=false;
                        break;
                    default:
                        System.out.println("Selecciona una opcion valida.");
                }
            }
        } catch (Exception e) {
            System.out.println("Error funcion ConversorVolumen");
        }
        return UnidadReturn;
    }

    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    private static float ConversorTemperatura() {
        limpiarConsola();
        boolean Sesion=true;
        float UnidadIngreso = 0,UnidadReturn=0;
        // TODO: los try no son necesarios
        try {
            while (Sesion) {
                System.out.println("Cuál te gustaría convertir? \n"+
                "1) Celcius a Fahrenheit? \n"+
                "2) Celcius a Kelvin? \n"+
                "3) Farhrenheit a Celcius? \n"+
                "4) Kelvin a Celcius? \n"+
                "5) Salir");
                int SeleccionLongitud = scan.nextInt();
                limpiarConsola();
                switch (SeleccionLongitud) {
                    case 1:
                        System.out.print("Indica la cantidad que quieres transformar: ");
                        UnidadIngreso=scan.nextFloat();
                        UnidadReturn=(float)(UnidadIngreso*9/5+32);
                        System.out.println(UnidadIngreso + " grados celsius equivalen a "+UnidadReturn+" grados fahrenheit.");
                        break;
                    case 2:
                        System.out.print("Indica la cantidad que quieres transformar: ");
                        UnidadIngreso=scan.nextFloat();
                        UnidadReturn=(byte)(UnidadIngreso+273.15);
                        System.out.println(UnidadIngreso + " grados celcius equivalen a "+UnidadReturn+" grados Kelvin.");
                        break;
                    case 3:
                        System.out.print("Indica la cantidad que quieres transformar: ");
                        UnidadIngreso=scan.nextFloat();
                        // (1 °F − 32) × 5/9 = -17.22 °C
                        UnidadReturn=(float)((UnidadIngreso-32)*5/9);
                        System.out.println(UnidadIngreso + " grados fahrenheit equivalen a "+UnidadReturn+" grados celcius.");
                        break;
                    case 4:
                        System.out.print("Indica la cantidad que quieres transformar: ");
                        UnidadIngreso=scan.nextFloat();
                        UnidadReturn=(float)(UnidadIngreso-273.25);
                        System.out.println(UnidadIngreso + " grados Kelvin equivalen a "+UnidadReturn+" grados celcius.");
                        break;
                    case 5:
                        System.out.println("Saliendo al menú principal.\n"+"\n" + "\n" + "\n" +"\n");
                        Sesion=false;
                        break;
                    default:
                        System.out.println("Selecciona una opcion valida.");
                }
            }
        } catch (Exception e) {
            System.out.println("Error funcion ConversorVolumen");
        }
        return UnidadReturn;
    }
    
    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public static void limpiarConsola() {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }  
}