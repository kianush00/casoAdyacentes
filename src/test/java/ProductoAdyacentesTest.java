import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductoAdyacentesTest {
    ProductoAdyacentes u;
    Object[] arreglo;
    int[] arreglo2;
    @BeforeEach
    void setUp() {
        u = new ProductoAdyacentes();

    }

    @AfterEach
    void tearDown() {
        u = null;
    }

    @org.junit.jupiter.api.Test
    void prodAdyacentes01() {
        arreglo2 = new int[] {1, -4, 2, 2, 5, -1};
        assertEquals(10,u.prodAdyacentes(arreglo2));
    }

    @org.junit.jupiter.api.Test
    void prodAdyacentes02() {
        arreglo = new Object[] {1,3,"a",8};
        assertEquals("Error",u.prodAdyacentes(arreglo));
    }

    @org.junit.jupiter.api.Test
    void prodAdyacentes03() {
        arreglo = new Object[] {"a", "B", "c", "d"};
        assertEquals("Error",u.prodAdyacentes(arreglo));
    }

    @org.junit.jupiter.api.Test
    void prodAdyacentes04() {
        arreglo2 = new int[] {-1,-1,1,-1,-1,1,-1};
        assertEquals(1,u.prodAdyacentes(arreglo2));
    }

    @org.junit.jupiter.api.Test
    void prodAdyacentes05() {
        arreglo2 = new int[] {15000,1,2};
        assertEquals("Error",u.prodAdyacentes(arreglo2));
    }

    @org.junit.jupiter.api.Test
    void prodAdyacentes06() {
        arreglo2 = new int[] {};
        assertEquals("Error",u.prodAdyacentes(arreglo2));
    }

    @org.junit.jupiter.api.Test
    void prodAdyacentes07() {
        arreglo2 = new int[] {1};
        assertEquals("Error",u.prodAdyacentes(arreglo2));
    }
}