package IDK;

import IGU.Grafica;

public class DnD {
    
    public static void main(String[] args) {
        //crea unan ventana
        Grafica formClaves = new Grafica();
        //hace visible la ventana
        formClaves.setVisible(true);
        //genera la ventana centrada
        formClaves.setLocationRelativeTo(null);
    }
    
    /*
    public static void main(String[] args) {
        Personaje mago = new MagoImp("Francisco de Tlaxcala",200,150,10);
        Personaje guerrero = new GuerreroImp("El temible Six De Aguascalientes", 300, 50, 12);
        Personaje elfo = new ElfoImp("Fatima de Chaneque", 250,100, 8);
        
        mago.mostrarInformacion();
        guerrero.mostrarInformacion();
        elfo.mostrarInformacion();
        
        System.out.println("\n*********************************************************************************************************************************\n");
        
         while(mago.estaVivo() && guerrero.estaVivo()){
        
            mago.atacar(guerrero);
            if (!guerrero.estaVivo()) {
                System.out.println("** el mago " + mago.getNombre() + " ha vencido!!");
                break;
            }
            
            guerrero.atacar(mago);
            if (!mago.estaVivo()) {
                System.out.println("** el guerrero "+ guerrero.getNombre() + " ha vencido!!");
                break;
            }
        }
         
        System.out.println("\n************************************************************************************\n");
        
        mago.mostrarInformacion();
        guerrero.mostrarInformacion();
        elfo.mostrarInformacion();
        
        System.out.println("\n************************************************************************************\n");
        
        while(elfo.estaVivo() && guerrero.estaVivo()){
        
            elfo.atacar(guerrero);
            if (!guerrero.estaVivo()) {
                System.out.println("** el elfo " + elfo.getNombre() + " ha vencido!!");
                break;
            }
            
            guerrero.atacar(elfo);
            if (!elfo.estaVivo()) {
                System.out.println("** el guerrero "+ guerrero.getNombre() + " ha vencido!!");
                break;
            }
        }
        
        System.out.println("\n************************************************************************************\n");
        
        mago.mostrarInformacion();
        guerrero.mostrarInformacion();
        elfo.mostrarInformacion();
        
        System.out.println("\n************************************************************************************\n");
        
        while(elfo.estaVivo() && mago.estaVivo()){
        
            elfo.atacar(mago);
            if (!mago.estaVivo()) {
                System.out.println("** el elfo " + elfo.getNombre() + " ha vencido!!");
                break;
            }
            
            mago.atacar(elfo);
            if (!elfo.estaVivo()) {
                System.out.println("** el mago "+ mago.getNombre() + " ha vencido!!");
                break;
            }
        }
        
        System.out.println("\n************************************************************************************\n");
        
        mago.mostrarInformacion();
        guerrero.mostrarInformacion();
        elfo.mostrarInformacion();
    }
    */
}
