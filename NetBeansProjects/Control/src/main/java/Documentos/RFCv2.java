package Documentos;

public class RFCv2{
    private Personas persona;

    public RFCv2(){
    }

    public RFCv2(Personas persona){
        this.persona=persona;
    }

    public Personas getPersona() {
        return persona;
    }

    public void setPersona(Personas persona) {
        this.persona = persona;
    }

    public String crearRFC(){
        String miRFC="";
        miRFC+=this.getPersona().getPaterno().substring(0,2);
        miRFC+=this.getPersona().getMaterno().charAt(0);

        return miRFC.toUpperCase();
    }
}