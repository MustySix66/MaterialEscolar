package AlgoBonito;

// Clase CuentaInfantil que hereda de Cuenta e implementa la interfaz Movimientos
public class CuentaInfantil extends Cuenta implements Movimientos{
    // Bonificación por cada depósito que se realiza
    public static double bonificacionCaramelo =.10;
    // Variable para almacenar las respuestas de los métodos
    public static String respuesta;
    // Saldo de caramelos que tiene la cuenta
    private int saldoCaramelos = 0;
    // Total de caramelos que se han depositado en la cuenta
    private int totalCaramelos = 0;

    // Constructor de la clase
    public CuentaInfantil(double saldo) {
        super(saldo);
    }
    
    // Método para consultar el saldo de la cuenta
    @Override
    public String consultarSaldo(){
        respuesta = (" <---- SALDO ---->\n");
        respuesta += (" Su saldo actual es: " + saldo + " pesos\n");
        respuesta += (" Su saldo actual de caramelos es: " + saldoCaramelos + " caramelos\n");
        return respuesta;
    }
    
    // Método para realizar un depósito en la cuenta
    @Override
    public String deposito(double monto){
        saldo += monto;
        respuesta = (" <---- DEPOSITO ---->\n");
        respuesta += (" Se depositaron: " +monto+ " pesos\n");
        // Se calcula la bonificación en caramelos por el depósito
        totalCaramelos = (int) monto/10;
        respuesta += (" Se otorgó una bonificacion por: " + totalCaramelos + " caramelos\n");
        respuesta += (" su saldo actual es: " + saldo + " pesos");
        saldoCaramelos += totalCaramelos;
        respuesta += (" Su saldo actual de caramelos es: " + saldoCaramelos + " caramelos\n");
        return respuesta;
    }
    
    // Método para realizar un retiro de la cuenta
    @Override
    public  String retiro(double monto){
        if(saldo >= monto){
            respuesta= "<-----------RETIRO----------> \n";
            saldo-=monto;
            respuesta += " se retiraron "+monto+" pesos\n";
            respuesta+= " su saldo actual es de: "+saldo+" pesos\n";
        }else{
            respuesta= "<-----------RETIRO----------> \n";
            respuesta=" fondos insuficientes: no se realizó ninguna operación \n";
        }
        return respuesta;
    }
    
    // Método para realizar un retiro de caramelos de la cuenta
    public String retiroDulces(double monto){
        if (saldoCaramelos>0) {
            respuesta= "<-----------RETIRO----------> \n";
            saldoCaramelos-=monto;
            respuesta += " se retiraron "+monto+" caramelos.\n";
            respuesta += " su saldo actual es de: "+saldoCaramelos+" caramelos.\n";
        }else{
            respuesta = " No furula";
        }
        
        return respuesta;
    }
}
