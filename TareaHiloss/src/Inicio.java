public class Inicio{
    public static void main(String[] args) throws Exception{

        // Primer Salon
        Thread salon1 = new Thread(new Salon(45, 20, 1));
        salon1.start();

        System.out.println("\n");

        // Segundo Salon
        Thread salon2 = new Thread(new Salon(30, 40, 2));
        salon2.start();

    }
    
}
