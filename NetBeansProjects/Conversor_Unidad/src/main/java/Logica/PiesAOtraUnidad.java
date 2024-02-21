package Logica;

public class PiesAOtraUnidad extends Formulas{

    public PiesAOtraUnidad() {
    }

    public PiesAOtraUnidad(double v1, double v2, String t1, String t2) {
        super(v1, v2, t1, t2);
    }
    
    @Override
    public String formula(double valor1, String tipoR){
        double factor = 0;
        switch (tipoR) {
            case "Kilometro":
                factor = 0.0003048;
                break;
            case "Metro":
                factor = 0.3048;
                break;
            case "Centimetro":
                factor = 30.48;
                break;
            case "Milimetro":
                factor = 304.8;
                break;
            case "Milla":
                factor = 0.000189394;
                break;
            case "Yarda":
                factor = 0.333333;
                break;
            case "Pulgada":
                factor = 12;
                break;
            default:
                return "-1";
        }
        double resultado = factor * valor1;
        tipoR = String.valueOf(resultado);
        return tipoR;
    }
}
