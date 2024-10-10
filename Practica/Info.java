package practica.procesos._blank.Practica;

public class Info {
	/**
	 * Conjunto de caracteres que pueden formar parte de la contraseña.
	 * Si queremos contraseñas más complejas, podemos añadir caracteres especiales como %, &, etc.
	 */
	public static final char[] CHARACTERS = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".toCharArray();
	
	/**
	 * Longitud de la contraseña que queremos encontrar
	 */
	public static final int PWD_LENGTH = 5;
	
	/**
	 * El número de procesos que repartirán el trabajo para encontrar la contraseña
	 */
	public static final int NUM_PROCESSES = 4;
	
	/**
	 * Número de combinaciones que hay que explorar.
	 * Se calcula en el constructor static
	 */
	public static long numCombinaciones;
	
	/**
	 * Número de combinaciones que debe explorar cada proceso.
	 * Se calcula en el constructor static.
	 */
	public static long combinacionesXProceso;
	
	/**
	 * Necesario para lazar los procesos.
	 */
	public static final String pathCompilador = "C:\\Users\\carmen.soler\\.p2\\pool\\plugins\\"
			+ "org.eclipse.justj.openjdk.hotspot.jre.full.win32.x86_64_22.0.2.v20240802-1626\\"
			+ "jre\\bin\\javaw.exe";
	public static final String pathClass = "D:\\GG_24_25\\PSP_Procesos\\bin\\";
	
	/**
	 * Constructor static.
	 */
	static {
		numCombinaciones = (long) Math.pow(CHARACTERS.length, PWD_LENGTH);
		combinacionesXProceso = numCombinaciones/NUM_PROCESSES;
	}
}
