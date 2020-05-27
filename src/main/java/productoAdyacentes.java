public class productoAdyacentes {

    public int productoAdayacentes(int[] arreglo){
        int m_producto = 0;
        for (int i = 0; i <= arreglo.length - 2; i++) {
            if (i == 0) {
                m_producto = arreglo[i] * arreglo[i + 1];
            } else {
                if (m_producto <= arreglo[i] * arreglo[i + 1]) {
                    m_producto = arreglo[i] * arreglo[i + 1];
                }
            }
        }
        return m_producto;
    }
}
