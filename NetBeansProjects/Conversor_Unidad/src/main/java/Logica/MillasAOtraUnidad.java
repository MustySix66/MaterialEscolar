package Logica;

// En esta clase se manejan todas las conversiones que vienen originalmente de mil
public class MillasAOtraUnidad extends Formulas{

    public MillasAOtraUnidad() {
    }

    public MillasAOtraUnidad(double v1, double v2, String t1, String t2) {
        super(v1, v2, t1, t2);
    }
    
    @Override
    public String formula(double valor1, String tipoR){
        // Declaramos "factor" que es la conversion directa de 1 cm a 1 de la otra unidad
        double factor = 0;
        switch (tipoR) {
            case "Kilometro" -> factor = 1.60934;
            case "Metro" -> factor = 1609.34;
            case "Centimetro" -> factor = 160934;
            case "Milimetro" -> factor = 1609340;
            case "Yarda" -> factor = 1760;
            case "Pie" -> factor = 5280;
            case "Pulgada" -> factor = 63360;
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
