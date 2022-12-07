package Matrix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatrixTest {
    Matrix matrix = new Matrix();

    @Test
    void quadraticMatrixTest() {
        int[][] array = {{54, 72}, {27, 81}};
        assertTrue(matrix.quadraticMatrix(array));
    }

    @Test
    void quadraticMatrixInferiorTest() {
        int[][] array = {{54}, {27, 81}};
        assertFalse(matrix.quadraticMatrix(array));
    }

    @Test
    void quadraticMatrixWithOneTest() {
        int[][] array = {{27, 81}};
        assertFalse(matrix.quadraticMatrix(array));
    }

    @Test
    void quadraticMatrixWithNullTest() {
        int[][] array = {{}};
        assertFalse(matrix.quadraticMatrix(array));
    }
}