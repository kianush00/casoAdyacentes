import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductoAdyacentesTest {

    //Atributos
    ProductoAdyacentes u;       //se declara objeto "u"
    Object[] arreglo;
    int[] arregloInt;
    int[] arregloDePrueba;
    int variablePrueba;

    @BeforeEach
    void setUp() {
        u = new ProductoAdyacentes();      //se inicializa objeto "u" en cada prueba

    }

    @AfterEach
    void tearDown() {
        u = null;       //después de cada prueba el objeto se borra
    }

    //Se probará que cada método prodAdyacentes retorne el valor que corresponda, dependiendo del arreglo
    //a comprobar
    @org.junit.jupiter.api.Test
    void prodAdyacentes01() {
        arreglo = new Object[] {1, -4, 2, 2, 5, -1};
        assertEquals("10",u.productoAdyacentes(arreglo));
    }

    @org.junit.jupiter.api.Test
    void prodAdyacentes02() {
        arreglo = new Object[] {1,3,"a",8};
        assertEquals("Error",u.productoAdyacentes(arreglo));
    }

    @org.junit.jupiter.api.Test
    void prodAdyacentes03() {
        arreglo = new Object[] {"a", "B", "c", "d"};
        assertEquals("Error",u.productoAdyacentes(arreglo));
    }

    @org.junit.jupiter.api.Test
    void prodAdyacentes04() {
        arreglo = new Object[] {-1,-1,1,-1,-1,1,-1};
        assertEquals("1",u.productoAdyacentes(arreglo));
    }

    @org.junit.jupiter.api.Test
    void prodAdyacentes05() {
        arreglo = new Object[] {15000,1,2};
        assertEquals("Error",u.productoAdyacentes(arreglo));
    }

    @org.junit.jupiter.api.Test
    void prodAdyacentes06() {
        arreglo = new Object[] {};
        assertEquals("Error",u.productoAdyacentes(arreglo));
    }

    @org.junit.jupiter.api.Test
    void prodAdyacentes07() {
        arreglo = new Object[] {1};
        assertEquals("Error",u.productoAdyacentes(arreglo));
    }

    @org.junit.jupiter.api.Test
    void verificadorValores01() {
        arreglo = new Object[] {15000,1,2};
        assertFalse(u.verificadorValores(arreglo));
    }

    @org.junit.jupiter.api.Test
    void verificadorLargo01() {
        arreglo = new Object[]{1, "2a", 3};
        assertTrue(u.verificadorLargo(arreglo));
    }

    @org.junit.jupiter.api.Test
    void verificadorNoNumeros01() {
        arreglo = new Object[]{1, "2a", 3};
        assertFalse(u.verificadorNoNumeros(arreglo));
    }

    @org.junit.jupiter.api.Test
    void verificadorNoNumeros02() {
        arreglo = new Object[]{1, 2, 3};
        assertTrue(u.verificadorNoNumeros(arreglo));
    }

    @org.junit.jupiter.api.Test
    void verificadorNoNumeros03() {
        arreglo = new Object[]{"a", "B", "c"};
        assertFalse(u.verificadorNoNumeros(arreglo));
    }

    @org.junit.jupiter.api.Test
    void verificadorNoNumeros04() {
        arreglo = new Object[]{1,-4,2,2,5,-1};
        assertTrue(u.verificadorNoNumeros(arreglo));
    }

    @org.junit.jupiter.api.Test
    void verificadorNoNumeros05() {
        arreglo = new Object[]{"","","",""};
        assertFalse(u.verificadorNoNumeros(arreglo));
    }

    @org.junit.jupiter.api.Test
    void toString01() {
        variablePrueba = 36;
        assertEquals("36", u.toString(variablePrueba));
    }

    @org.junit.jupiter.api.Test
    void copiarEnInt() {
        arreglo = new Object[]{1,-4,2,2,5,-1};
        arregloInt = new int[6];
        arregloDePrueba = new int[]{1,-4,2,2,5,-1};
        u.copiarEnInt(arreglo,arregloInt);
        assertArrayEquals(arregloDePrueba,arregloInt);

    }
}