import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductoAdyacentesTest {

    private ProductoAdyacentes a;

    @BeforeEach
    void setUp() {
        a = new ProductoAdyacentes();
    }

    @AfterEach
    void tearDown() {
        a = null;
    }

    @org.junit.jupiter.api.Test
    void productoAdyacentes() {
        int[] arregloPrueba = {1,-4,2,2,5,-1};
        assertEquals(10,a.productoAdyacentes(arregloPrueba));
    }



}