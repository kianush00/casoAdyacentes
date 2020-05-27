public class productoAdyacentes {

    int[] arreglo = {1, -4, 2, 2, 5, -1};

    public int prodAdyacentes(int[] arreglo){
        int mayorProducto = -99999;     //valor inicial
        int producto;

        for (int i = 1; i < arreglo.length; i++){
            producto = arreglo[i] * arreglo[i - 1];
            if(producto > mayorProducto){
                mayorProducto = producto;
            }
        }//asd

        return mayorProducto;
    }
}
