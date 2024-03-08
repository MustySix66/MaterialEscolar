package AlgoBonito;

// Clase CuentaNomina que hereda de Cuenta e implementa la interfaz Movimientos
public class CuentaNomina extends Cuenta implements Movimientos{
    // Cargo por consulta de saldo
    public static double CargoConsulta=50;
    // Cargo por retiro de saldo
    public static double CargoRetiro=30;
    // Variable para almacenar las respuestas de los métodos
    public static String respuesta;

    // Constructor de la clase
    public CuentaNomina(double saldo) {
        super(saldo);
    }
    
    // Método para consultar el saldo de la cuenta
    @Override
    public String consultarSaldo(){
        respuesta = ("<---- Saldo ---->\n");
        respuesta += (" Su saldo actual es: " + saldo);
        respuesta += (" El cargo por consulta de saldo es: "+ CargoConsulta + " pesos \n");
        return respuesta;
    }
    
    // Método para realizar un depósito en la cuenta
    @Override
    public String deposito(double monto){
        saldo += monto;
        respuesta = (" <---- DEPOSITO ---->\n");
        respuesta += (" Se depositaron: " +monto+ " pesos\n");
        respuesta += ("su saldo actual es: " + saldo + " pesos");
        return respuesta;
    }
    
    // Método para realizar un retiro de la cuenta
    @Override
    public  String retiro(double monto){
        if(saldo >= monto+CargoRetiro){
            respuesta= "<-----------Retiro----------> \n";
            // Se resta el monto al saldo
            saldo-=monto;
            respuesta += " se retiraron "+monto+" pesos\n";
            // Se aplica el cargo por retiro
            saldo+=CargoRetiro;
            respuesta+="se aplicó un cargo por retiro de "+CargoRetiro+" pesos\n";
            respuesta+= " su saldo actual es de: "+saldo+" pesos\n";
        }else{
            respuesta= "<-----------Retiro----------> \n";
            respuesta=" fondos insuficientes: no se realizó ninguna operación \n";
        }
        return respuesta;
    }
}
