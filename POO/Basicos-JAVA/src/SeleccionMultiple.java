public class SeleccionMultiple {
    public static void main(String[] args) {
        String op = "Lunes";
        switch (op) {
            case "Lunes":
                System.out.println("Hoy es Lunes de nuevo");
                break;
            case "Martes":
                System.out.println("Hoy es Martes");
                break;
            case "Miercoles":
                System.out.println("Hoy es mitad de semana");
            default:
                System.out.println("Hoy no es ninguno de los días seleccionados");
                break;
        }
    }
}
