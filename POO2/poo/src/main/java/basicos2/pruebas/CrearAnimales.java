package basicos2.pruebas;

public class CrearAnimales {

    public static void main(String[] args) {
        Animales perro = new Animales();
        perro = new Animales("canino", "Chihuahua");
        perro.setEspecie("canino");
        perro.setRaza("pastor aleman");

        // int n1, n2, n3;
        // n1=5;
        // n2=2;
        // n3=(n1--)+(n2);
        // System.out.println(n3);
        // n3=n1+n2;
        // System.out.println(n3);
        // boolean b1=true;
        // System.out.println(b1);

        // byte b = 10;
        // short s = 10;
        // int i = 10;
        // long l= 10L;
        // float f = 10.1f;
        // double d = 10.1;

        // i=(int)(i* f);
        // System.out.println(i);

        // b=b+s; // no compila pq los tipos short y byte son promovidos a enteros
        // i=i*f; // no compila pq se debe asignar una variable de tipo mayor

        // int n1=5;
        // int n2=10;
        // int mayor=0;

        // sintaxis (condicion) ? (sentencia en caso verdadero) : (sentencia en caso falso)
        // System.out.println((n1>n2?("mayor: "+n1):("mayor: "+n2)));

        // if (n1>n2) 
        //     System.out.println(n1+" es el mayor."); 
        // else if (n2>n1)
        //     System.out.println(n2+" es mayor.");
        // else 
        //     System.out.println(n1+ " es igual a "+n2);
    }
}
