package AlgoBonito;

// Clase CuentaAhorro que hereda de Cuenta e implementa la interfaz Movimientos
public class CuentaAhorro extends Cuenta implements Movimientos{
    // Bonificación por cada depósito que se realiza
    public static double bonificacion =.30;
    // Variable para almacenar las respuestas de los métodos
    public static String respuesta;

    // Constructor de la clase
    public CuentaAhorro(double saldo) {
        super(saldo);
    }
    
    // Método para consultar el saldo de la cuenta
    @Override
    public String consultarSaldo(){
        respuesta = (" <---- Saldo ---->\n");
        respuesta += (" Su saldo actual es: " + saldo + " pesos\n");
        return respuesta;
    }
    
    // Método para realizar un depósito en la cuenta
    @Override
    public String deposito(double monto){
        saldo += monto;
        respuesta = (" <---- DEPOSITO ---->\n");
        respuesta += (" Se depositaron: " +monto+ " pesos\n");
        // Se calcula la bonificación por el depósito
        double totalBonif = monto * bonificacion;
        respuesta += (" Se otorgó una bonificacion por: " + totalBonif + " pesos\n");
        // Se suma la bonificación al saldo
        saldo += totalBonif;
        respuesta += ("su saldo actual es: " + saldo + " pesos");
        return respuesta;
    }
    
    // Método para realizar un retiro de la cuenta
    @Override
    public  String retiro(double monto){
        if(saldo >= monto){
            respuesta= "<-----------Retiro----------> \n";
            // Se resta el monto al saldo
            saldo-=monto;
            respuesta += " se retiraron "+monto+" pesos\n";
            respuesta+= " su saldo actual es de: "+saldo+" pesos\n";
        }else{
            respuesta= "<-----------Retiro----------> \n";
            respuesta=" fondos insuficientes: no se realizó ninguna operación \n";
        }
        return respuesta;
    }
}
