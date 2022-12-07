package Matrix;

public class Matrix {
    public boolean quadraticMatrix(int[][] array) {
        if (array.length == array[0].length) {
            return true;
        } else {
            return false;
        }
    }
}
