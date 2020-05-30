import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductoAdyacentesTest {
    ProductoAdyacentes u;
    Object[] arreglo;
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
        arreglo = new Object[] {1, -4, 2, 2, 5, -1};
        assertEquals(10,u.prodAdyacentes(arreglo));
    }

    @org.junit.jupiter.api.Test
    void prodAdyacentes02() {
        arreglo = new Object[] {1,3,"a",8};
        assertEquals(10,u.prodAdyacentes(arreglo));
    }

    @org.junit.jupiter.api.Test
    void prodAdyacentes03() {
        arreglo = new Object[] {"a", "B", "c", "d"};
        assertEquals(10,u.prodAdyacentes(arreglo));
    }

    @org.junit.jupiter.api.Test
    void prodAdyacentes04() {
        arreglo = new Object[] {-1,-1,1,-1,-1,1,-1};
        assertEquals(1,u.prodAdyacentes(arreglo));
    }

    @org.junit.jupiter.api.Test
    void prodAdyacentes05() {
        arreglo = new Object[] {15000,1,2};
        assertEquals("Error",u.prodAdyacentes(arreglo));
    }

    @org.junit.jupiter.api.Test
    void prodAdyacentes06() {
        arreglo = new Object[] {};
        assertEquals(10,u.prodAdyacentes(arreglo));
    }

}