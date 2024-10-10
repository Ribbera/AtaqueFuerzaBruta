package practica.procesos._blank.Practica;

public class Info {
	public static final char[] CHARACTERS = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".toCharArray();
	public static final int PWD_LENGTH = 4;
	public static final int NUM_PROCESSES = 4;
	public static long numCombinaciones;
	public static long combinacionesXProceso;

	// Cambia a "java" para ejecutar la clase
	public static final String pathCompilador = "java";
	// Ruta al directorio que contiene el paquete, no incluye la clase
	public static final String pathClass = "C:\\Users\\marcr\\IdeaProjects\\AtaqueFuerzaBruta\\out\\production\\AtaqueFuerzaBruta";
	public static final String className = "practica.procesos._blank.Practica.Desencriptador";

	static {
		numCombinaciones = (long)Math.pow((double)CHARACTERS.length, PWD_LENGTH);
		combinacionesXProceso = numCombinaciones / NUM_PROCESSES;
	}
}
