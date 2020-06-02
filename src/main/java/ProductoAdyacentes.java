public class ProductoAdyacentes {

    public String productoAdyacentes(Object[] arreglo){

        int mayorProducto = -2147483648;     //valor inicial
        int producto;
        int[] arregloInt = new int[arreglo.length];

        if (verificadorGeneral(arreglo)) {
            copiarEnInt(arreglo, arregloInt);
            for (int i = 1; i < arreglo.length; i++) {
                producto = arregloInt[i] * arregloInt[i - 1];
                if (producto > mayorProducto) {
                    mayorProducto = producto;
                }
            }
            return toString(mayorProducto);
        }else{
            return "Error";
        }

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
        return 2 <= arreglo.length && arreglo.length <= 20;
    }
    public boolean verificadorNoNumeros(Object[] arreglo){
        String aux;

        for (int i = 0; i < arreglo.length; i++) {
            aux = toString(arreglo[i]);

            if(aux.length() == 0){
                return false;
            }

            aux = aux.replaceAll("\\d", "");
            aux = aux.replaceAll(" ", "");
            aux = aux.replaceAll("-", "");

            if (aux.length() > 0) {
                return false;
            }
        }
        return true;
    }

    public boolean verificadorValores(Object[] arreglo){
        int[] arregloInt = new int[arreglo.length];
        boolean estado = true;
        copiarEnInt(arreglo, arregloInt);

        for (int i = 0; i < arreglo.length; i++) {
            if (arregloInt[i] > 1000 || -1000 > arregloInt[i]) {
                estado = false;
                break;
            }
        }
        return estado;
    }

    public void copiarEnInt(Object[] original, int[] copia){
        for (int i = 0; i < copia.length; i++) {
            copia[i] = (int) original[i];
        }
    }

    public String toString(int elemento){
        return String.valueOf(elemento);
    }

    public String toString(Object elemento) {
        return String.valueOf(elemento);
    }
}
