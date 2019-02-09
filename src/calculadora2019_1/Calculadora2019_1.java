package calculadora2019_1;

/**
 *
 * @author Sandra Cañas
 */
/**
 * Esta clase simula el comportamiento de la calculadora con las funcionalidades
 * basicas
 */
public class Calculadora2019_1 {

    private int ans;

    public Calculadora2019_1() {
        ans = 0;
    }

    /**
     *
     * @param a recibe primer sumando
     * @param b recibe segundo sumando
     * @return devuelve el total
     */
    public int suma(int a, int b) {
        ans = a + b;
        return ans;
    }

    /**
     *
     * @param a minuendo
     * @param b sustraendo
     * @return devuelve la diferencia
     */
    public int resta(int a, int b) {
        ans = a - b;
        return ans;
    }

    /**
     *
     * @param v primer factor
     * @param b segundo factor
     * @return producto
     */
    public int multiplicar(int v, int b) {
        ans = v * b;
        return ans;
    }

    /**
     *
     * @param a dividendo
     * @param b divisor
     * @return cociente
     */
    public float dividir(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("no se puede dividir por cero");
        }
        ans = a / b;
        return ans;
    }

    /**
     *
     * @param b base
     * @param e exponente
     * @return potencia
     */
    public int potencia(int b, int e) {
        ans = 1;
        for (int i = 0; i < e; i++) {

            ans = ans * b;
        }
        return ans;
    }

    /**
     *
     * @param v numero que se va a adicionar al acumulado
     * @return
     */
    public int adicionar(int v) {
        ans = ans + v;
        return ans;
    }

    /**
     *
     * @param v numero que se va a sustraer al acumulado
     * @return
     */
    public int sustraer(int v) {
        ans = ans - v;
        return ans;
    }

//
//    public int devolver_ans() {
//        return ans;
//    }
    public void clear() {
        ans = 0;
    }
}
