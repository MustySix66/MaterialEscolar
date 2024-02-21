package Logica;

public class PulgadasAOtraUnidad extends Formulas{

    public PulgadasAOtraUnidad() {
    }

    public PulgadasAOtraUnidad(double v1, double v2, String t1, String t2) {
        super(v1, v2, t1, t2);
    }
    
    @Override
    public String formula(double valor1, String tipoR){
        double factor = 0;
        switch (tipoR) {
            case "Kilometro":
                factor = 0.0000254;
                break;
            case "Metro":
                factor = 0.0254;
                break;
            case "Centimetro":
                factor = 2.54;
                break;
            case "Milimetro":
                factor = 25.4;
                break;
            case "Milla":
                factor = 0.0000157828;
                break;
            case "Yarda":
                factor = 0.0277778;
                break;
            case "Pie":
                factor = 0.0833333;
                break;
            default:
                return "-1";
        }
        double resultado = factor * valor1;
        tipoR = String.valueOf(resultado);
        return tipoR;
    }
}
