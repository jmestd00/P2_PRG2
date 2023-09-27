package funcionCn;

import java.util.ArrayList;
import java.util.List;

public class FuncionCn implements IFuncionCn {
    /**
     * Implementación recursiva directa
     * <p>
     * Prec:
     *
     * @param n >= 0
     * @return devuelve el cálculo de la función C definida previamente
     */
    @Override
    public double CnRD(int n) {
        if (n == 0) {
            return 1.0;
        }

        double res = 0;
        for (int i = 0; i < n; i++) {
            res += CnRD(i);
        }
        return n + 2.0 / n * res;
    }

    /**
     * Implementación de Cn completamente recursiva, sin uso de ningún bucle.
     *
     * @param n >= 0
     * @return devuelve el cálculo de la función C definida previamente
     */
    @Override
    public double CnCRD(int n) {
        if (n == 0) {
            return 1.0;
        }

        double res = SumCnCRDRec(n - 1, 1);
        return n + 2.0 / n * res;
    }

    private double SumCnCRDRec(int i, double acc) {
        if (i == 0) {
            return acc;
        }
        return SumCnCRDRec(i - 1, acc + CnCRD(i));
    }

    /**
     * Implementación de Cn iterativa directa usando un array.
     *
     * @param n >= 0
     * @return devuelve el cálculo de la función Cn definida previamente
     */
    @Override
    public double CnI(int n) {
        double[] cs = new double [n+1];
        cs[0] = 1.0;

        for (int i = 1; i <= n; i++) {
            double res = 0.0;
            for (int j = 0; j < i; j++) {
                res += cs[j];
            }
            cs[i] = i + 2.0/i * res;
        }
        return cs[n];
    }

    /**
     * Solución iterativa lineal de Cn. Esta solución se basa en la propiedad:
     * suma[n] = \sum_{i=0}^{n} C(i)
     * = C(n) + \sum_{i=0}^{n-1} C(i) //sustituyendo C(n) y el sumatorio
     * = (2/n)*suma[n-1] + n + suma[n-1]
     * Esta def recurrente permite usar una variable acumuladora para calcular suma[n]
     * Ya no hay un doble for y, por tanto, se pasa de complejidad cuadrática a complejidad lineal
     *
     * @param n >= 0
     * @return devuelve el cálculo de la función Cn definida previamente
     */
    @Override
    public double CnIterativaLineal(int n) {
        if (n == 0) {
            return 1.0;
        }

        double res = 1;
        for (int i = 1; i < n; i++) {
            res += (2.0 / i) * res + i;
        }
        return n + (2.0 / n) * res;
    }

    /**
     * La misma propiedad anterior permite una definición recursiva
     * usando un método recursivo auxiliar para calcular el sumatorio.
     *
     * @param n >= 0
     * @return devuelve el cálculo de la función Cn definida previamente
     */
    @Override
    public double CnRecursivaLineal(int n) {
        if (n == 0) {
            return 1;
        }

        double res = SumCRL(n-1);
        return n + 2.0 / n * res;
    }

    private double SumCRL(int i) {
        if (i == 0) {
            return 1.0;
        }

        double res = SumCRL(i-1);
        return 2.0/i * res + i + res;
    }
}
