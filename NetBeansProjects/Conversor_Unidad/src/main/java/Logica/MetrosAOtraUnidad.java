package Logica;

// En esta clase se manejan todas las conversiones que vienen originalmente de m
public class MetrosAOtraUnidad extends Formulas{

    public MetrosAOtraUnidad() {
    }

    public MetrosAOtraUnidad(double v1, double v2, String t1, String t2) {
        super(v1, v2, t1, t2);
    }
    
    @Override
    public String formula(double valor1, String tipoR){
        // Declaramos "factor" que es la conversion directa de 1 cm a 1 de la otra unidad
        double factor = 0;
        switch (tipoR) {
            case "Kilometro" -> factor = 0.001;
            case "Centimetro" -> factor = 100;
            case "Milimetro" -> factor = 1000;
            case "Milla" -> factor = 0.000621371;
            case "Yarda" -> factor = 1.09361;
            case "Pie" -> factor = 3.28084;
            case "Pulgada" -> factor = 39.3701;
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
