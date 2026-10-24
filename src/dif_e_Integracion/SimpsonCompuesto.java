package dif_e_Integracion;

public class SimpsonCompuesto {
    private static double calcularSimpson(double a, double b, int n) {
        double h = TrapecioCompuesto.calcularH(a, b, n);
        double sumaImpares = 0.0;
        double sumaPares = 0.0;

        for (int k = 1; k < n; k++) {
            double xk = a + k * h;

            // TODO: Complete la condición y acumulación para los términos
            // impares (coeficiente 4) y pares (coeficiente 2) según Simpson 1/3.
            if (k % 2 != 0) {
                sumaImpares += TrapecioCompuesto.funcion(xk);
            } else {
                sumaPares += TrapecioCompuesto.funcion(xk);
            }
        }

        double sumaTotal = TrapecioCompuesto.funcion(a) + 4 * sumaImpares + 2 * sumaPares + TrapecioCompuesto.funcion(b);
        return (h / 3) * sumaTotal;
    }

    public static double integracionConTolerancia(double a, double b, double tolerancia) {
        int n = 2; // Inicia con el mínimo de subintervalos permitidos para Simpson 1/3
        double integralAnterior = calcularSimpson(a, b, n);
        double errorAbsoluto = 999.0;

        while (errorAbsoluto > tolerancia) {
            n *= 2; // Mantiene n siempre par al duplicarlo (2, 4, 8, 16...)
            double integralNueva = calcularSimpson(a, b, n);
            errorAbsoluto = Math.abs(integralNueva - integralAnterior);
            if (errorAbsoluto <= tolerancia) {
                // Opcional: imprimir o guardar n final para el reporte
                System.out.println("Simpson converge con n = " + n);
            }
            integralAnterior = integralNueva;
        }
        return integralAnterior;

    }
}