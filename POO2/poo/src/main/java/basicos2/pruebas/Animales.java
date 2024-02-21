package basicos2.pruebas;

public class Animales {
    private String especie, raza;

    public Animales(){
        //Crea un objeto de la clase animales vacio
    }

    public Animales(String especie, String raza){
        //Metodo constructor que crea una instancia de la clase animales con parametros iniciales.
        this.raza=raza;
        this.especie=especie;
    }

    public Animales(String especie){
        this.especie=especie;
    }

    public String getEspecie() {
        return this.especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getRaza() {
        return this.raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    } 
}