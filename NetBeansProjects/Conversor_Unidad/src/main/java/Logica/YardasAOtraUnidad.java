package Logica;

public class YardasAOtraUnidad extends Formulas{

    public YardasAOtraUnidad() {
    }

    public YardasAOtraUnidad(double v1, double v2, String t1, String t2) {
        super(v1, v2, t1, t2);
    }
    
    @Override
    public String formula(double valor1, String tipoR){
        double factor = 0;
        switch (tipoR) {
            case "Kilometro":
                factor = 0.0009144;
                break;
            case "Metro":
                factor = 0.9144;
                break;
            case "Centimetro":
                factor = 91.44;
                break;
            case "Milimetro":
                factor = 914.4;
                break;
            case "Milla":
                factor = 0.000568182;
                break;
            case "Pie":
                factor = 3;
                break;
            case "Pulgada":
                factor = 36;
                break;
            default:
                return "-1";
        }
        double resultado = factor * valor1;
        tipoR = String.valueOf(resultado);
        return tipoR;
    }
}
