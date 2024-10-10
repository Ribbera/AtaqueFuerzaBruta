package practica.procesos._blank.Practica;

public class Desencriptador {

	public static String generarCombinacion(long num, char[] caracteres, int longitud) {
		StringBuilder pass = new StringBuilder();
		int base = caracteres.length;

		for (int i = 0; i < longitud; i++) {
			int posicion = (int) (num % base);
			pass.insert(0, caracteres[posicion]);
			num /= base;
		}

		return pass.toString();
	}

	public static void ataqueFuerzaBruta(long inicio, long fin) {
		for (long i = inicio; i <= fin; i++) {
			String generatedPwd = generarCombinacion(i, Info.CHARACTERS, Info.PWD_LENGTH);
			// Imprimir la combinación que se está probando
			if (CajaFuerte.VerifyPwd(generatedPwd)) {
				System.out.println("pass encontrada: " + generatedPwd);
				System.exit(0); // Termina el programa si se encuentra la pass
			}
		}
		System.out.println("Proceso: " + ProcessHandle.current().pid() + " completo su tarea sin encontrar nada.");
	}

	public static void main(String[] args) {
		if (args.length < 2) {
			System.err.println("Se requieren dos argumentos: inicio y fin.");
			System.exit(1);
		}

		long inicio = Long.parseLong(args[0]);
		long fin = Long.parseLong(args[1]);
		System.out.println("Ejecutando ataque de fuerza bruta desde " + inicio + " hasta " + fin);
		ataqueFuerzaBruta(inicio, fin);
	}
}
