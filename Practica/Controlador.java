package practica.procesos._blank.Practica;

public class Controlador {

    public static void main(String[] args) {
        for (int i = 0; i < Info.NUM_PROCESSES; i++) {
            long inicio = i * Info.combinacionesXProceso;
            long fin = (i == Info.NUM_PROCESSES - 1) ? Info.numCombinaciones - 1 : (inicio + Info.combinacionesXProceso - 1);

            // Imprimir información sobre el rango asignado a cada proceso
            System.out.println("Proceso " + (i + 1) + " para el rango: " + inicio + " a " + fin);


            try {
                ProcessBuilder processBuilder = new ProcessBuilder(
                        Info.pathCompilador,
                        "-classpath", Info.pathClass, Info.className,
                        String.valueOf(inicio),
                        String.valueOf(fin)
                );
                processBuilder.redirectErrorStream(true);
                processBuilder.inheritIO();

                processBuilder.start();

            } catch (Exception e) {
                // System.err.println(e);
                System.out.println(e);
            }
        }
        System.out.println("Todos los procesos han sido iniciados.");
    }
}
