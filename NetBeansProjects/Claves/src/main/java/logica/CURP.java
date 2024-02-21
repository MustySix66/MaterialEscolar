package logica;

import java.util.Random;

public class CURP extends Clave{

    public CURP() {
    }

    public CURP(Persona persona) {
        super(persona);
    }
    
    
    public char segundaConsonante(String text){
        String texto = text.toUpperCase();
        char consonante =' ';
        for (int i=0;i<texto.length();i++){
            if(texto.charAt(i)!= 'A' && texto.charAt(i)!= 'E' && texto.charAt(i)!= 'I' && texto.charAt(i)!= 'O' && texto.charAt(i)!= 'U'){
                consonante = texto.charAt(i);
                return consonante;
            }
        }        
        return 'X';
    }
    
    @Override
    public String generarClave(){
        
        String claveEnProceso = "";
        claveEnProceso += iniciales();
        claveEnProceso += generarFecha();
        claveEnProceso += this.persona.getGenero().charAt(0);
        Estados abrEdo = new Estados();
        claveEnProceso += abrEdo.abreviaturaEstado(this.persona.getLugarNacimiento());
        
        ///////////////////////////////////////////////////////////////
        claveEnProceso += segundaConsonante(this.persona.getPaterno());
        claveEnProceso += segundaConsonante(this.persona.getMaterno());
        claveEnProceso += segundaConsonante(this.persona.getNombre());
        ///////////////////////////////////////////////////////////////
        
        Random baruc = new Random();
        claveEnProceso += (this.persona.getFechaNacimiento().getYear()>=2000)?('A'):(baruc.nextInt(10));
        claveEnProceso += baruc.nextInt(10);
        
        
        return claveEnProceso.toUpperCase();
    }
}
