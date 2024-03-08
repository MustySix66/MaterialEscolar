package Logica;

// En esta clase se manejan todas las conversiones que vienen originalmente de cm
public class CentimetrosAOtraUnidad extends Formulas {

    public CentimetrosAOtraUnidad() {
    }

    public CentimetrosAOtraUnidad(double v1, double v2, String t1, String t2) {
        super(v1, v2, t1, t2);
    }

    @Override
    public String formula(double valor1, String tipoR){
        // Declaramos "factor" que es la conversion directa de 1 cm a 1 de la otra unidad
        double factor = 0;
        switch (tipoR) {
            case "Kilometro" -> factor = 0.00001;
            case "Metro" -> factor = 0.01;
            case "Milimetro" -> factor = 10;
            case "Milla" -> factor = 0.00000621371;
            case "Yarda" -> factor = 0.0109361;
            case "Pie" -> factor = 0.0328084;
            case "Pulgada" -> factor = 0.393701;
            default -> {
                return "-1";
            }
        }
        // multiplicamos el valor que queremos por el factor de comunicación
        double resultado = factor * valor1;
        // y casteamos a string
        tipoR = String.valueOf(resultado);
        return tipoR;
    }
}
