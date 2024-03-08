package Logica;

// En esta clase se manejan todas las conversiones que vienen originalmente de in
public class PulgadasAOtraUnidad extends Formulas{

    public PulgadasAOtraUnidad() {
    }

    public PulgadasAOtraUnidad(double v1, double v2, String t1, String t2) {
        super(v1, v2, t1, t2);
    }
    
    @Override
    public String formula(double valor1, String tipoR){
        // Declaramos "factor" que es la conversion directa de 1 cm a 1 de la otra unidad
        double factor = 0;
        switch (tipoR) {
            case "Kilometro" -> factor = 0.0000254;
            case "Metro" -> factor = 0.0254;
            case "Centimetro" -> factor = 2.54;
            case "Milimetro" -> factor = 25.4;
            case "Milla" -> factor = 0.0000157828;
            case "Yarda" -> factor = 0.0277778;
            case "Pie" -> factor = 0.0833333;
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
