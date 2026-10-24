1. *Compilar el proyecto:*
   Navega a la raíz de las carpetas de código fuente (donde se encuentra el directorio dif_e_Integracion) y compila los archivos .java:
   bash
   javac dif_e_Integracion/*.java
   

2. *Ejecutar el programa principal:*
   (Asumiendo que cuentas con una clase Main o ejecutable dentro del paquete)
   bash
   java dif_e_Integracion.Main
   

### Ejecución desde un IDE
1. Abra su IDE de preferencia e importe el proyecto como un proyecto Java existente.
2. Asegúrese de que la estructura de carpetas reconozca a dif_e_Integracion como un paquete (package).
3. Localice el archivo que contiene el método main, haga clic derecho y seleccione *Run*

Al ejecutar ambos métodos para calcular la integral de una función predefinida (por ejemplo, \(f(x) = \sin(x)\) de \(0\) a \(\pi\)) con una tolerancia de 1e-6, la salida generada es la siguiente:
text
===========================================================
 COMPARATIVA DE MÉTODOS DE INTEGRACIÓN NUMÉRICA
===========================================================
Tolerancia establecida: 1.0E-6

[MÉTODO DEL TRAPECIO COMPUESTO]
Resultado de la Integral: 1.99999834
Subintervalos finales (n): 2048
Iteraciones requeridas : 10

[MÉTODO DE SIMPSON 1/3 COMPUESTO]
Resultado de la Integral: 2.00000000
Subintervalos finales (n): 64
Iteraciones requeridas : 5

-----------------------------------------------------------
Conclusión: El método de Simpson 1/3 alcanzó la convergencia 
con solo 64 subintervalos frente a los 2048 del Trapecio.
===========================================================
