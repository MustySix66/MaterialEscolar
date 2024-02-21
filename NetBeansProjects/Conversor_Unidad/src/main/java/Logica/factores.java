package Logica;

public class factores {
    public static double convertirUnidades(String unidadEntrada, String unidadSalida, double valor) {
        double factor = 0;
        // Concatenar las unidades de entrada y salida para formar una clave
        String clave = unidadEntrada + unidadSalida;
        // Usar un switch para asignar el factor según la clave
        switch (clave) {
            // Casos para convertir de kilómetro a otras unidades
            case "KilometroMetro":
                factor = 1000;
                break;
                // mariscos
            case "KilometroCentimetro":
                factor = 100000;
                break;
            case "KilometroMilimetro":
                factor = 1000000;
                break;
            case "KilometroMilla":
                factor = 0.621371;
                break;
            case "KilometroYarda":
                factor = 1093.61;
                break;
            case "KilometroPie":
                factor = 3280.84;
                break;
            case "KilometroPulgada":
                factor = 39370.1;
                break;
            // Casos para convertir de metro a otras unidades
            case "MetroKilometro":
                factor = 0.001;
                break;
            case "MetroCentimetro":
                factor = 100;
                break;
            case "MetroMilimetro":
                factor = 1000;
                break;
            case "MetroMilla":
                factor = 0.000621371;
                break;
            case "MetroYarda":
                factor = 1.09361;
                break;
            case "MetroPie":
                factor = 3.28084;
                break;
            case "MetroPulgada":
                factor = 39.3701;
                break;
            // Casos para convertir de centímetro a otras unidades
            case "CentimetroKilometro":
                factor = 0.00001;
                break;
            case "CentimetroMetro":
                factor = 0.01;
                break;
            case "CentimetroMilimetro":
                factor = 10;
                break;
            case "CentimetroMilla":
                factor = 0.00000621371;
                break;
            case "CentimetroYarda":
                factor = 0.0109361;
                break;
            case "CentimetroPie":
                factor = 0.0328084;
                break;
            case "CentimetroPulgada":
                factor = 0.393701;
                break;
            // Casos para convertir de milímetro a otras unidades
            case "MilimetroMetro":
                factor = 0.001;
                break;
            case "MilimetroCentimetro":
                factor = 0.1;
                break;
            case "MilimetroMilla":
                factor = 0.000000621371;
                break;
            case "MilimetroYarda":
                factor = 0.00109361;
                break;
            case "MilimetroPie":
                factor = 0.00328084;
                break;
            case "MilimetroPulgada":
                factor = 0.0393701;
                break;
            // Casos para convertir de milla a otras unidades
            case "MillaKilometro":
                factor = 1.60934;
                break;
            case "MillaMetro":
                factor = 1609.34;
                break;
            case "MillaCentimetro":
                factor = 160934;
                break;
            case "MillaMilimetro":
                factor = 1609340;
                break;
            case "MillaYarda":
                factor = 1760;
                break;
            case "MillaPie":
                factor = 5280;
                break;
            case "MillaPulgada":
                factor = 63360;
                break;
            // Casos para convertir de yarda a otras unidades
            case "YardaKilometro":
                factor = 0.0009144;
                break;
            case "YardaMetro":
                factor = 0.9144;
                break;
            case "YardaCentimetro":
                factor = 91.44;
                break;
            case "YardaMilimetro":
                factor = 914.4;
                break;
            case "YardaMilla":
                factor = 0.000568182;
                break;
            case "YardaPie":
                factor = 3;
                break;
            case "YardaPulgada":
                factor = 36;
                break;
            // Casos para convertir de pie a otras unidades
            case "PieKilometro":
                factor = 0.0003048;
                break;
            case "PieMetro":
                factor = 0.3048;
                break;
            case "PieCentimetro":
                factor = 30.48;
                break;
            case "PieMilimetro":
                factor = 304.8;
                break;
            case "PieMilla":
                factor = 0.000189394;
                break;
            case "PieYarda":
                factor = 0.333333;
                break;
            case "PiePulgada":
                factor = 12;
                break;
            // Casos para convertir de pulgada a otras unidades
            case "PulgadaKilometro":
                factor = 0.0000254;
                break;
            case "PulgadaMetro":
                factor = 0.0254;
                break;
            case "PulgadaCentimetro":
                factor = 2.54;
                break;
            case "PulgadaMilimetro":
                factor = 25.4;
                break;
            case "PulgadaMilla":
                factor = 0.0000157828;
                break;
            case "PulgadaYarda":
                factor = 0.0277778;
                break;
            case "PulgadaPie":
                factor = 0.0833333;
                break;
            // Caso por defecto si la clave no coincide con ninguna de las anteriores
            default:
                // Mostrar un mensaje de error y salir del método
                System.out.println("Unidades no válidas o no soportadas.");
                return -1;
        }
        // Calcular y devolver el resultado de la conversión
        double resultado = valor * factor;
        return resultado;
    }
    
}
