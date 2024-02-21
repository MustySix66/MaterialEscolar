package logica;

import java.util.Random;

public class Clave {

    protected Persona persona;

    public Clave() {
    }

    public Clave(Persona persona) {
        this.persona = persona;
    }
    
    //genera cadena de texto con la fecha de nacimiento seis caracteres
    public String generarFecha() {
    
        String fecha = "";
        String stringAnio = "", stringMes = "", stringDia = "";
        stringAnio += (this.persona.getFechaNacimiento().getYear());
        fecha += stringAnio.substring(2, 4);
        stringMes += (this.persona.getFechaNacimiento().getMonthValue());
        fecha += stringMes.length() == 1 ? ("0" + stringMes.substring(0, 1)) : stringMes.substring(0, 2);
        stringDia += (this.persona.getFechaNacimiento().getDayOfMonth());
        fecha += stringDia.length() == 1 ? ("0" + stringDia.substring(0, 1)) : stringDia.substring(0, 2);

        return fecha;
    }
    
    //genera cadena de texto con las iniciales
    public String iniciales(){
        String iniciales = "";
        char orasilavocal = ' ';
        iniciales += this.persona.getPaterno().charAt(0);
        String lavocal = this.persona.getPaterno();
        for (int i = 0; i < lavocal.length(); i++) {
            if(lavocal.charAt(i)== 'a' || lavocal.charAt(i)== 'e' || lavocal.charAt(i)== 'i' || lavocal.charAt(i)== 'o' || lavocal.charAt(i)== 'u'){
                orasilavocal = lavocal.charAt(i);
                break;
            }
        }
        
        iniciales += orasilavocal;
        
        iniciales += this.persona.getMaterno().charAt(0);
        iniciales += this.persona.getNombre().charAt(0);
        return iniciales;
    }
    
    public String consonantesElector(){
        String orasilaconsonante = "";
        String paterno12 = this.persona.getPaterno().toLowerCase();
        String materno12 = this.persona.getMaterno().toLowerCase();
        String nombres12 = this.persona.getNombre().toLowerCase();
        for (int i = 0; i < paterno12.length(); i++) {
            if(orasilaconsonante.length()<2){
                if(paterno12.charAt(i)!= 'a' && paterno12.charAt(i)!= 'e' && paterno12.charAt(i)!= 'i' && paterno12.charAt(i)!= 'o' && paterno12.charAt(i)!= 'u'){
                orasilaconsonante += paterno12.charAt(i);
                }
            }else{
                break;
            }
        }
        
        for (int i = 0; i < materno12.length(); i++) {
            if(orasilaconsonante.length()<4){
                if(materno12.charAt(i)!= 'a' && materno12.charAt(i)!= 'e' && materno12.charAt(i)!= 'i' && materno12.charAt(i)!= 'o' && materno12.charAt(i)!= 'u'){
                orasilaconsonante += materno12.charAt(i);
                }
            }else{
                break;
            }
        }
        
        for (int i = 0; i < materno12.length(); i++) {
            if(orasilaconsonante.length()<6){
                if(nombres12.charAt(i)!= 'a' && nombres12.charAt(i)!= 'e' && nombres12.charAt(i)!= 'i' && nombres12.charAt(i)!= 'o' && nombres12.charAt(i)!= 'u'){
                    orasilaconsonante += nombres12.charAt(i);
                }
            }else{
                break;
            }
        }
        
        System.out.println(orasilaconsonante);
        return orasilaconsonante;
    }
    
    public String generarClave() {
        String claveEnProceso = "";
        claveEnProceso += iniciales();
        claveEnProceso+=generarFecha();   
        return claveEnProceso.toUpperCase();
    }
    
    public String generarClaveRFC() {
        String claveEnProceso = "";
        claveEnProceso += iniciales();
        claveEnProceso += generarFecha();   
        Random letrasAleatorias = new Random();
        Estados aleatorioHomoclave = new Estados();
        claveEnProceso += aleatorioHomoclave.aleatorioHomoclave(letrasAleatorias.nextInt(65,100));
        claveEnProceso += aleatorioHomoclave.aleatorioHomoclave(letrasAleatorias.nextInt(65,100));
        claveEnProceso += aleatorioHomoclave.aleatorioHomoclave(letrasAleatorias.nextInt(65,100));
        
        return claveEnProceso.toUpperCase();
    }
    
    public String generarClaveElector() {
        String claveEnProceso = "";
        claveEnProceso += consonantesElector();
        claveEnProceso += generarFecha();
        Estados entidad = new Estados();
        claveEnProceso += entidad.numeroEntidad(this.persona.getLugarNacimiento().toLowerCase());
        claveEnProceso += persona.getGenero().charAt(0);
        Random homoclave = new Random();
        claveEnProceso += homoclave.nextInt(100, 1000);
        
        return claveEnProceso.toUpperCase();
    }
}
