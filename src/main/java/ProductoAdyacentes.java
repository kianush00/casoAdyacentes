public class ProductoAdyacentes {

    public int productoAdayacentes(int[] arreglo){
        // (Lorenzo Devia)
        // El método va a devolver un número entero (el producto mayor),
        // para realizar las operaciones necesarias se necesita
        // un arreglo de enteros como argumento
        int m_producto = 0;

        for (int i = 0; i <= arreglo.length - 2; i++) {
            if (i == 0) {
                // (Lorenzo Devia)
                // Si es el primer par de elementos a comparar,
                // entonces el primer producto obtenido se le
                // considerará el mayor y  a partir de este
                // se irá comparando con los demas
                m_producto = arreglo[i] * arreglo[i + 1];

            } else {
                if (m_producto <= arreglo[i] * arreglo[i + 1]) {
                    // (Lorenzo Devia)
                    // Se compara el actual mayor producto con los
                    // demás y cada vez que se encuentra un nuevo
                    // mayor producto se le reemplaza por el
                    // respectivo
                    m_producto = arreglo[i] * arreglo[i + 1];
                }
            }
        }
        return m_producto;
    }
}
