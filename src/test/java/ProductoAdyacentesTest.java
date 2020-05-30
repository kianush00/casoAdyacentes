import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductoAdyacentesTest {
    ProductoAdyacentes u;
    int[] arreglo;
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
        arreglo = new int[] {1, -4, 2, 2, 5, -1};
        assertEquals(10,u.productoAdyacentes(arreglo));
    }

    @org.junit.jupiter.api.Test
    void prodAdyacentes02() {
    }

    @org.junit.jupiter.api.Test
    void prodAdyacentes03() {
    }

    @org.junit.jupiter.api.Test
    void prodAdyacentes04() {
        arreglo = new int[] {-1,-1,1,-1,-1,1,-1};
        assertEquals(1,u.productoAdyacentes(arreglo));
    }

    @org.junit.jupiter.api.Test
    void prodAdyacentes05() {
        arreglo = new int[] {15000,1,2};
        assertEquals("Error",u.productoAdyacentes(arreglo));
    }

    @org.junit.jupiter.api.Test
    void prodAdyacentes06() {
    }

}