package logica;

public class Estados extends Clave{

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }
    
    
    public String abreviaturaEstado(String Estado){
        switch(Estado){
            case "Aguascalientes" -> {
                return "as";
            }
            case "Baja california" -> {
                return "bc";
            }
            case "Baja california sur" -> {
                return "bcs";
            }
            case "Campeche" -> {
                return "cmp";
            }
            case "coahuila de zaragoza" -> {
                return "cdz";
            }
            case "colima" -> {
                return "cm";            
            }
            case "chiapas" -> {
                return "chs";
            }
            case "chihuahua" -> {
                return "cha";
            }
            case "distrito federal" -> {
                return "df";
            }
            case "durango" -> {
                return "dr";
            }
            case "guanajuato" -> {
                return "gnj";
            }
            case "guerrero" -> {
                return "grr";
            }
            case "hidalgo" -> {
                return "hdl";
            }
            case "jalisco" -> {
                return "14";
            }
            case "mexico" -> {
                return "mx";
            }
            case "michoacan" -> {
                return "mch";
            }
            case "morelos" -> {
                return "mls";
            }
            case "nayarit" -> {
                return "nyt";
            }
            case "nuevo leon" -> {
                return "nvl";
            }
            case "oaxaca" -> {
                return "oax";
            }
            case "puebla" -> {
                return "pba";
            }
            case "queretaro" -> {
                return "qrt";
            }
            case "quintana roo" -> {
                return "qro";
            }
            case "san luis potosi" -> {
                return "slp";
            }
            case "sinaloa" -> {
                return "snl";
            }
            case "sonora" -> {
                return "sna";
            }
            case "tabasco" -> {
                return "tba";
            }
            case "tamaulipas" -> {
                return "tmp";
            }
            case "tlaxcala" -> {
                return "tlx";
            }
            case "veracruz" -> {
                return "vrz";
            }
            case "yucatan" -> {
                return "yta";
            }
            case "zacatecas" -> {
                return "zct";
            }
            default -> {
                return "XX";
            }
                
        }
    }
    
    public String numeroEntidad(String Entidad){
        switch(Entidad){
            case "Aguascalientes" -> {
                return "001";
            }
            case "Baja california" -> {
                return "002";
            }
            case "Baja california sur" -> {
                return "003";
            }
            case "Campeche" -> {
                return "004";
            }
            case "coahuila de zaragoza" -> {
                return "005";
            }
            case "colima" -> {
                return "006";            
            }
            case "chiapas" -> {
                return "007";
            }
            case "chihuahua" -> {
                return "008";
            }
            case "distrito federal" -> {
                return "009";
            }
            case "durango" -> {
                return "010";
            }
            case "guanajuato" -> {
                return "011";
            }
            case "guerrero" -> {
                return "012";
            }
            case "hidalgo" -> {
                return "013";
            }
            case "jalisco" -> {
                return "014";
            }
            case "mexico" -> {
                return "015";
            }
            case "michoacan" -> {
                return "016";
            }
            case "morelos" -> {
                return "017";
            }
            case "nayarit" -> {
                return "018";
            }
            case "nuevo leon" -> {
                return "019";
            }
            case "oaxaca" -> {
                return "020";
            }
            case "puebla" -> {
                return "021";
            }
            case "queretaro" -> {
                return "022";
            }
            case "quintana roo" -> {
                return "023";
            }
            case "san luis potosi" -> {
                return "024";
            }
            case "sinaloa" -> {
                return "025";
            }
            case "sonora" -> {
                return "026";
            }
            case "tabasco" -> {
                return "027";
            }
            case "tamaulipas" -> {
                return "028";
            }
            case "tlaxcala" -> {
                return "029";
            }
            case "veracruz" -> {
                return "030";
            }
            case "yucatan" -> {
                return "031";
            }
            case "zacatecas" -> {
                return "032";
            }
            default -> {
                return "033";
            }
                
        }
    }
    
    public String aleatorioHomoclave(int numAleatorio){
        switch(numAleatorio){
            case 65 -> {
                return "A";
            }
            case 66 -> {
                return "B";
            }
            case 67 -> {
                return "C";
            }
            case 68 -> {
                return "D";
            }
            case 69 -> {
                return "E";
            }
            case 70 -> {
                return "F";
            }
            case 71 -> {
                return "G";
            }
            case 72 -> {
                return "H";
            }
            case 73 -> {
                return "I";
            }
            case 74 -> {
                return "J";
            }
            case 75 -> {
                return "K";
            }
            case 76 -> {
                return "L";
            }
            case 77 -> {
                return "M";
            }
            case 78 -> {
                return "N";
            }
            case 79 -> {
                return "O";
            }
            case 80 -> {
                return "P";
            }
            case 81 -> {
                return "Q";
            }
            case 82 -> {
                return "R";
            }
            case 83 -> {
                return "S";
            }
            case 84 -> {
                return "T";
            }
            case 85 -> {
                return "U";
            }
            case 86 -> {
                return "V";
            }
            case 87 -> {
                return "W";
            }
            case 88 -> {
                return "X";
            }
            case 89 -> {
                return "Y";
            }
            case 90 -> {
                return "Z";
            }
            case 91 -> {
                return "1";
            }
            case 92 -> {
                return "2";
            }
            case 93 -> {
                return "3";
            }
            case 94 -> {
                return "4";
            }
            case 95 -> {
                return "5";
            }
            case 96 -> {
                return "6";
            }
            case 97 -> {
                return "7";
            }
            case 98 -> {
                return "8";
            }
            case 99 -> {
                return "9";
            }
            case 100 -> {
                return "0";
            }
            default ->{
                return "xxx";
            }
        }
    }
}
