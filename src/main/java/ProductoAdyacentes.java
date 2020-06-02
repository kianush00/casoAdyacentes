public class ProductoAdyacentes {

    public String productoAdyacentes(Object[] arreglo) {
        //Variables locales
        int mayorProducto = -2147483648;     //valor inicial
        int producto;
        int[] arregloInt = new int[arreglo.length];     //se declara arreglo tipo int que guardará los valores
                                                         //del arreglo de tipo Object
        try {
            if (verificadorGeneral(arreglo)) {
                copiarEnInt(arreglo, arregloInt);
                for (int i = 1; i < arreglo.length; i++) {          //bucle que encuentra el mayor producto entre
                    producto = arregloInt[i] * arregloInt[i - 1];   //los valores del arreglo y después del bucle
                    if (producto > mayorProducto) {                 //se retorna el mayor producto
                        mayorProducto = producto;
                    }
                }
                return toString(mayorProducto);
            } else {
                return "El largo del arreglo es incorrecto o uno de los elementos posee un valor fuera del rango";
            }
        } catch (Exception e) {      //si el arreglo contiene elementos que no sean de tipo int, se captura ese error
            return "Se introdujo un elemento no válido";
        }

    }
    //Método que comprueba que los valores estén dentro del rango correspondiente, tanto del tamaño del arreglo
    //como el tamaño de los valores, retorna true si se cumplen las condiciones
    public boolean verificadorGeneral(Object[] arreglo) {

        if (verificadorLargo(arreglo)) {
            return verificadorValores(arreglo);
        } else {
            return false;
        }
    }

    public boolean verificadorLargo(Object[] arreglo) {
        //Si el arreglo tiene un tamaño entre 2 y 20, el método retorna true, en caso contrario retorna false
        return 2 <= arreglo.length && arreglo.length <= 20;
    }

    //Método que sirve para verificar si los elementos del arreglo son números, esto se prueba en la clase Test,
    //no se usa en el método productoAdyacentes
    public boolean verificadorNoNumeros(Object[] arreglo) {
        String aux;      //variable local

        for (int i = 0; i < arreglo.length; i++) {
            aux = toString(arreglo[i]);

            if (aux.length() == 0) {
                return false;
            }

            aux = aux.replaceAll("\\d", "");    //reemplaza los números por un espacio vacío
            aux = aux.replaceAll(" ", "");      //reemplaza los espacios por un espacio vacío
            aux = aux.replaceAll("-", "");      //remplaza los guiones por un espacio vacío

            if (aux.length() > 0) {       //si el caracter aux contiene un caracter no numérico, entonces el arreglo
                return false;             //no es de tipo numérico
            }
        }
        return true;
    }

    public boolean verificadorValores(Object[] arreglo) {
        int[] arregloInt = new int[arreglo.length];    //se declara arreglo int del mismo tamaño del parámetro
        boolean estado = true;     //se declara e inicializa el estado
        copiarEnInt(arreglo, arregloInt);    //se guardan los valores de arreglo en arregloInt

        //si los números están dentro del rango -1000 - 1000, el método retorna true, en caso contrario retorna false
        for (int i = 0; i < arreglo.length; i++) {
            if (arregloInt[i] > 1000 || -1000 > arregloInt[i]) {
                estado = false;
                break;
            }
        }
        return estado;
    }

    public void copiarEnInt(Object[] original, int[] copia) {
        //Los valores del arreglo original se guardan en el arreglo copia de tipo int
        for (int i = 0; i < copia.length; i++) {
            copia[i] = (int) original[i];
        }
    }

    public String toString(int elemento) {
        //El elemento de tipo int se convierte a String
        return String.valueOf(elemento);
    }

    public String toString(Object elemento) {
        //El elemento de tipo object se convierte a String
        return String.valueOf(elemento);
    }
}
