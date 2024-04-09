package Logica;

public abstract class Platillo {
    protected String nombre;
    protected int IngreUno;
    protected int IngreDos;
    protected int IngreTres;
    protected int IngreCuatro;

    public Platillo(){
    
    }

    public Platillo(String nombre, int IngreUn, int IngreDo, int IngreTre, int IngreCuatr) {
        this.nombre = nombre;
        this.IngreUno = IngreUn;
        this.IngreDos = IngreDo;
        this.IngreTres = IngreTre;
        this.IngreCuatro = IngreCuatr;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIngrediente1() {
        return IngreUno;
    }

    public void setIngrediente1(int ingrediente1) {
        this.IngreUno = ingrediente1;
    }

    public int getIngrediente2() {
        return IngreDos;
    }

    public void setIngrediente2(int ingrediente2) {
        this.IngreDos = ingrediente2;
    }

    public int getIngrediente3() {
        return IngreTres;
    }

    public void setIngrediente3(int ingrediente3) {
        this.IngreTres = ingrediente3;
    }

    public int getIngrediente4() {
        return IngreCuatro;
    }

    public void setIngrediente4(int ingrediente4) {
        this.IngreCuatro = ingrediente4;
    }
    
    public abstract String mostrarInformacion();
    public abstract String ingredientes();
}
