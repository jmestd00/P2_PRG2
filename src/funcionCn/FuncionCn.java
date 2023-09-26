package funcionCn;

public class FuncionCn implements IFuncionCn{
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
        //TODO recursiva directa
        return 0;
    }

    /**
     * Implementación de Cn completamente recursiva, sin uso de ningún bucle.
     *
     * @param n >= 0
     * @return devuelve el cálculo de la función C definida previamente
     */
    @Override
    public double CnCRD(int n) {
        //TODO recursiva sin bucles
        return 0;
    }

    /**
     * Implementación de Cn iterativa directa usando un array.
     *
     * @param n >= 0
     * @return devuelve el cálculo de la función Cn definida previamente
     */
    @Override
    public double CnI(int n) {
        //TODO iterativa directa
        return 0;
    }

    /**
     * Solución iterativa lineal de Cn. Esta solución se basa en la propiedad:
     * suma[n] = \sum_{i=0}^{n} C(i)
     * = C(n) +  \sum_{i=0}^{n-1} C(i) //sustituyendo C(n) y el sumatorio
     * = (2/n)*suma[n-1] + n + suma[n-1]
     * Esta def recurrente permite usar una variable acumuladora para calcular suma[n]
     * Ya no hay un doble for y por tanto se pasa de complejidad  cuadrática a complejidad lineal
     *
     * @param n >= 0
     * @return devuelve el cálculo de la función Cn definida previamente
     */
    @Override
    public double CnIterativaLineal(int n) {
        //TODO iterativa lineal
        return 0;
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
        //TODO recursiva lineal
        return 0;
    }
}
