package Logica;

public class MillasAOtraUnidad extends Formulas{

    public MillasAOtraUnidad() {
    }

    public MillasAOtraUnidad(double v1, double v2, String t1, String t2) {
        super(v1, v2, t1, t2);
    }
    
    @Override
    public String formula(double valor1, String tipoR){
        double factor = 0;
        switch (tipoR) {
            case "Kilometro":
                factor = 1.60934;
                break;
            case "Metro":
                factor = 1609.34;
                break;
            case "Centimetro":
                factor = 160934;
                break;
            case "Milimetro":
                factor = 1609340;
                break;
            case "Yarda":
                factor = 1760;
                break;
            case "Pie":
                factor = 5280;
                break;
            case "Pulgada":
                factor = 63360;
                break;
            default:
                return "-1";
        }
        double resultado = factor * valor1;
        tipoR = String.valueOf(resultado);
        return tipoR;
    }
}
