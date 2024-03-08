package Logica;

// En esta clase se manejan todas las conversiones que vienen originalmente de ft
public class PiesAOtraUnidad extends Formulas{

    public PiesAOtraUnidad() {
    }

    public PiesAOtraUnidad(double v1, double v2, String t1, String t2) {
        super(v1, v2, t1, t2);
    }
    
    @Override
    public String formula(double valor1, String tipoR){
        // Declaramos "factor" que es la conversion directa de 1 cm a 1 de la otra unidad
        double factor = 0;
        switch (tipoR) {
            case "Kilometro" -> factor = 0.0003048;
            case "Metro" -> factor = 0.3048;
            case "Centimetro" -> factor = 30.48;
            case "Milimetro" -> factor = 304.8;
            case "Milla" -> factor = 0.000189394;
            case "Yarda" -> factor = 0.333333;
            case "Pulgada" -> factor = 12;
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
