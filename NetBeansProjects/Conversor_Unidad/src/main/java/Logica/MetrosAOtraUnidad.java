package Logica;

public class MetrosAOtraUnidad extends Formulas{

    public MetrosAOtraUnidad() {
    }

    public MetrosAOtraUnidad(double v1, double v2, String t1, String t2) {
        super(v1, v2, t1, t2);
    }
    
    @Override
    public String formula(double valor1, String tipoR){
        double factor = 0;
        switch (tipoR) {
            case "Kilometro":
                factor = 0.001;
                break;
            case "Centimetro":
                factor = 100;
                break;
            case "Milimetro":
                factor = 1000;
                break;
            case "Milla":
                factor = 0.000621371;
                break;
            case "Yarda":
                factor = 1.09361;
                break;
            case "Pie":
                factor = 3.28084;
                break;
            case "Pulgada":
                factor = 39.3701;
                break;
            default:
                return "-1";
        }
        double resultado = factor * valor1;
        tipoR = String.valueOf(resultado);
        return tipoR;
    }
}
