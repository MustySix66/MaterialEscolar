package basicos2.docs;

public class Elector {
    private Personas persona; // Variable de instancia que almacena un objeto de la clase Personas

    public Elector(){ // Constructor por defecto

    }

    public Elector(Personas persona){ // Constructor que toma un objeto de la clase Personas como argumento
        this.persona = persona; // Asigna el objeto de la clase Personas a la variable de instancia persona
    }

    public Personas getPersona() { // Método getter para la variable de instancia persona
        return this.persona;
    }

    public void setPersona(Personas persona) { // Método setter para la variable de instancia persona
        this.persona = persona;
    }

    public String primerasConsonantes(String clave){ // Método que devuelve las dos primeras consonantes de una cadena
        String consonantes="";
        int contadorConsonantes=0;
        for (int i = 0; i < clave.length(); i++) {
            if (clave.charAt(i)!=65&clave.charAt(i)!=69&clave.charAt(i)!=73&clave.charAt(i)!=79&clave.charAt(i)!=85){
                consonantes+=clave.charAt(i);
                contadorConsonantes++;
                if (contadorConsonantes>=2) {
                    break;                    
                }
            }
        }
        return consonantes;
    }

    public String estadoNac(){
        
        switch(this.persona.getEstadoNacimiento()){
            case "Aguascalientes": {return "01";}
            case "Baja California": {return "02";}
            case "Baja California Sur": {return "03";}
            case "Campeche": {return "04";}
            case "Chiapas": {return "05";}
            case "Chihuahua": {return "06";}
            case "Ciudad de México": {return "07";}
            case "Coahuila": {return "08";}
            case "Colima": {return "09";}
            case "Durango": {return "10";}
            case "Guanajuato": {return "11";}
            case "Guerrero" : {return "12";}
            case "Hidalgo" : {return "13";}
            case "Jalisco" : {return "14";}
            case "México" : {return "15";}
            case "Michoacán" : {return "16";}
            case "Morelos" : {return "17";}
            case "Nayarit" : {return "18";}
            case "Nuevo León" : {return "19";}
            case "Oaxaca" : {return "20";}
            case "Puebla" : {return "21";}
            case "Querétaro" : {return "22";}
            case "Quintana Roo" : {return "23";}
            case "San Luis Potosí" : {return "24";}
            case "Sinaloa" : {return "25";}
            case "Sonora" : {return "26";}
            case "Tabasco" : {return "27";}
            case "Tamaulipas" : {return "28";}
            case "Tlaxcala" : {return "29";}
            case "Veracruz" : {return "30";}
            case "Yucatán" : {return "31";}
            case "Zacatecas" : {return "32";}
        }
        return null;      
    }
    
    public String sexo(){
        
        switch(this.persona.getSexo()){
            case "Masculino" : {return "H";}
            case "Femenino" : {return "M";}
            
        }
        return null;
    }

    public String miClaveElector(){ // Método que genera una clave única para el elector
        String claveElector="";
        String AMD="";
        claveElector+=primerasConsonantes(this.persona.getPaterno().toUpperCase());
        claveElector+=primerasConsonantes(this.persona.getMaterno().toUpperCase());
        claveElector+=primerasConsonantes(this.persona.getNombre().toUpperCase());
        AMD+=this.persona.getFechaNacimiento().getYear();
        claveElector+=AMD.substring(2,4);
        AMD="";
        AMD+=this.persona.getFechaNacimiento().getMonthValue();
        claveElector+=(AMD.length()==1)?AMD :"0"+AMD;
        AMD="";
        AMD+=this.persona.getFechaNacimiento().getDayOfMonth();
        claveElector+=(AMD.length()==1)?AMD : "0"+AMD;
        return claveElector;
    }
}
