public class ProductoAdyacentes {

    public static int  prodAdyacentes(Object[] arreglo){

        int mayorProducto = -99999;     //valor inicial
        int producto;
        int[] arregloInt = new int[arreglo.length];

        copiarEnInt(arreglo,arregloInt);
        for (int i = 1; i < arreglo.length; i++){
            producto = arregloInt[i] * arregloInt[i - 1];
            if(producto > mayorProducto){
                mayorProducto = producto;
            }
        }
        return mayorProducto;
    }
    public boolean verificadorGeneral(Object[] arreglo){
        if(verificadorLargo(arreglo)){
            if(verificadorNoNumeros(arreglo)){
                return verificadorValores(arreglo);
            }else{
                return false;
            }
        }else{
            return false;
        }
    }
    public boolean verificadorLargo(Object[] arreglo){
        return true;
    }
    public boolean verificadorNoNumeros(Object[] arreglo){
        return true;
    }
    public boolean verificadorValores(Object[] arreglo){
        return true;
    }
    public static void copiarEnInt(Object[] original, int[] copia){
        for (int i = 0; i < copia.length; i++) {
            copia[i] = (int) original[i];
        }
    }
    public static String toString(int elemento){
        return String.valueOf(elemento);
    }
    public static String toString(Object elemento){
        return String.valueOf(elemento);
    }
}
