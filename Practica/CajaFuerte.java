package practica.procesos._blank.Practica;

public class CajaFuerte {
	private static final String PASSWORD = "pass"; // Cambia esto por la contraseña que estás buscando

	public static boolean VerifyPwd(String pretendPwd) {

		return pretendPwd.equals(PASSWORD);
	}
}
