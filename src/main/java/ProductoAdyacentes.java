public class ProductoAdyacentes {

    public static int prodAdyacentes(int[] arreglo){

        int mayorProducto = -99999;     //valor inicial
        int producto;

        for (int i = 1; i < arreglo.length; i++){
            producto = arreglo[i] * arreglo[i - 1];
            if(producto > mayorProducto){
                mayorProducto = producto;
            }
        }

        return mayorProducto;
    }
}
