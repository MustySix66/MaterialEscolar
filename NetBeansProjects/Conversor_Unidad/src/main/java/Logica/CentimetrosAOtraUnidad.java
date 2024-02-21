package Logica;

public class CentimetrosAOtraUnidad extends Formulas {

    public CentimetrosAOtraUnidad() {
    }

    public CentimetrosAOtraUnidad(double v1, double v2, String t1, String t2) {
        super(v1, v2, t1, t2);
    }

    @Override
    public String formula(double valor1, String tipoR){
        double factor = 0;
        switch (tipoR) {
            case "Kilometro":
                factor = 0.00001;
                break;
            case "Metro":
                factor = 0.01;
                break;
            case "Milimetro":
                factor = 10;
                break;
            case "Milla":
                factor = 0.00000621371;
                break;
            case "Yarda":
                factor = 0.0109361;
                break;
            case "Pie":
                factor = 0.0328084;
                break;
            case "Pulgada":
                factor = 0.393701;
                break;
            default:
                return "-1";
        }
        double resultado = factor * valor1;
        tipoR = String.valueOf(resultado);
        return tipoR;
    }
}
