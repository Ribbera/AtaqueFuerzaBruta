package practica.procesos._blank.Practica;

public class CajaFuerte {
	/**
	 * Contraseña que tratamos de adivinar
	 */
	private static final String TARGET = "0Tgio3edFF";
	
	/**
	 * Comprueba si las contraseñas son iguales.
	 * @param pretendPwd Contraseña que queremos comprobar
	 * @return True si coincide con TARGET, False en caso contrario.
	 */
	public static boolean VerifyPwd(String pretendPwd)
	{
		return pretendPwd.equals(TARGET);
	}
}
