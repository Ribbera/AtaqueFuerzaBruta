# Ataque de Fuerza Bruta en Java

Este proyecto realiza un ataque de fuerza bruta distribuido para encontrar una contraseña. Utiliza varios procesos paralelos para probar combinaciones de caracteres y descubrir la contraseña.

## ¿Cómo funciona?

1. **CajaFuerte.java**: 
   - Verifica si una contraseña generada es correcta.

2. **Info.java**: 
   - Define los parámetros principales: conjunto de caracteres, longitud de la contraseña, y el número de procesos.

3. **Desencriptador.java**: 
   - Genera combinaciones de caracteres dentro de un rango y las prueba para ver si coinciden con la contraseña.

4. **Controlador.java**: 
   - Divide el trabajo en varios procesos que ejecutan el `Desencriptador` en paralelo, cada uno probando un rango de combinaciones.

## Flujo General

1. El controlador divide las combinaciones posibles entre varios procesos.
2. Cada proceso genera y prueba contraseñas en su rango.
3. Si un proceso encuentra la contraseña, se imprime y todos los procesos terminan.
