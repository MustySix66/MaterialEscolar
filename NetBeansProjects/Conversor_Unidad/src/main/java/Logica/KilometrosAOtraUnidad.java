package Logica;

public class KilometrosAOtraUnidad extends Formulas {

    public KilometrosAOtraUnidad() {
    }

    public KilometrosAOtraUnidad(double v1, double v2, String t1, String t2) {
        super(v1, v2, t1, t2);
    }

    @Override
    public String formula(double valor1, String tipoR){
        double factor = 0;
        switch (tipoR) {
            case "Metro":
                factor = 1000;
                break;
            case "Centimetro":
                factor = 100000;
                break;
            case "Milimetro":
                factor = 1000000;
                break;
            case "Milla":
                factor = 0.621371;
                break;
            case "Yarda":
                factor = 1093.61;
                break;
            case "Pie":
                factor = 3280.84;
                break;
            case "Pulgada":
                factor = 39370.1;
                break;
            default:
                return "-1";
        }
        double resultado = factor * valor1;
        tipoR = String.valueOf(resultado);
        return tipoR;
    }
}
