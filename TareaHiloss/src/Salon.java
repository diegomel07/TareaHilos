public class Salon implements Runnable{

    private int duracionClase;
    private int cantEstudiantes;
    private int cantProfesores;


    public Salon(int duracionClase, int cantEstudiantes, int cantProfesores) {
        this.duracionClase = duracionClase;
        this.cantEstudiantes = cantEstudiantes;
        this.cantProfesores = cantProfesores;
    }

    public void stop(){
        duracionClase = -1;
    }

    @Override
    public void run(){
        int tiempoActual = 0;
        long idSalon = Thread.currentThread().getId();

        System.out.println("\tEmpieza la Clase No. " + idSalon);

        while (tiempoActual < this.duracionClase){
            try {

                if (tiempoActual % 15 == 0){
                    System.out.println("Tiempo transcurrido de la clase "+ idSalon +": " + tiempoActual + "\tCantidad de Estudiantes actual de la clase "+ idSalon +": " + cantEstudiantes +"\tCantidad de Profesores actual de la clase "+ idSalon +": " + cantProfesores);
                }

                tiempoActual++;
                Thread.sleep(1000);
                
            } catch (Exception e) {
                System.out.println("Termina la Clase No. " + Thread.currentThread().getId());
                e.printStackTrace();
            }

        }


    }

    

}
