package IDK;

import logica.GuerreroImp;
import logica.MagoImp;
import logica.Personaje;

public class DnD {

    public static void main(String[] args) {
        Personaje mago = new MagoImp("Francisco de Tlaxcala",200,150,10);
        Personaje guerrero = new GuerreroImp("Six De Alejandría", 300, 50, 12);
    }
    
}
