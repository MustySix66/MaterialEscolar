package Logica;

// En esta clase se manejan todas las conversiones que vienen originalmente de mm
public class MilimetrosAOtraUnidad extends Formulas {

    public MilimetrosAOtraUnidad() {
    }

    public MilimetrosAOtraUnidad(double v1, double v2, String t1, String t2) {
        super(v1, v2, t1, t2);
    }

    @Override
    public String formula(double valor1, String tipoR){
        // Declaramos "factor" que es la conversion directa de 1 cm a 1 de la otra unidad
        double factor = 0;
        switch (tipoR) {
            case "Kilometro" -> factor = 0.000001;
            case "Metro" -> factor = 0.001;
            case "Centimetro" -> factor = 0.1;
            case "Milla" -> factor = 0.000000621371;
            case "Yarda" -> factor = 0.00109361;
            case "Pie" -> factor = 0.00328084;
            case "Pulgada" -> factor = 0.0393701;
            default -> {
                return "-1";
            }
        }
        // multiplicamos el valor que queremos por el factor de comunicación
        double resultado = factor * valor1;
        tipoR = String.valueOf(resultado);
        return tipoR;
    }
}
