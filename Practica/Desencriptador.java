package practica.procesos._blank.Practica;

public class Desencriptador {

	/**
	 * Genera la contraseña que corresponde a ese número de combinación. 
	 * @param numPwd Número/posición de la combinación que se genera
	 * @return Texto de la combinación generada
	 */
	public static String generaPwd(long numPwd)
	{
		//Este return está puesto para que compile. 
		//Tendrás que cambiarlo
		return null;
	}
	
	/**
	 * Genera todas las contraseñas entre los rangos indicados
	 * Las contraseñas que se van generando deben compararse con las de la caja fuerte.
	 * Cuando se encuentra, se da un aviso por pantalla y se para el proceso
	 * @param inicio Inicio del rango
	 * @param fin Fin del rango
	 */
	public static void ataqueFuerzaBruta(long inicio, long fin)
	{
		//Este es el mensaje que darás si el proceso no encuentra nada. 
		//Si encuentras la contraseña, lo indicarás también enseñándola por pantalla.
		System.out.println("Proceso: "+ProcessHandle.current().pid()+" completó su tarea sin encontrar nada.");
	}
	
	/**
	 * Esta clase se usará para generar contraseñas dentro del rango indicado.
	 * El inicio y fin de esta contraseña se determina a través de args.
	 * @param args [0], recibe el rango de inicio de la contraseña. [1], el rango de fin.
	 */
	public static void main(String[] args) {
		
	}

}
