public class LinearSystem {
    Double[][] A;
    Double[] B;
    int size;

    public LinearSystem() {
        A = null;
        B = null;
        size = 0;
    }

    public LinearSystem(Double[][] m2, Double[] x) {
        this.A = m2;
        this.B = x;
        this.size = x.length;
    }

    public Double[] solve() {
        Double[] x = new Double[3];
        return x;
    }

    public Double calculateCoeficientsMatrixDeterminant() {
        return calculateDeterminant(this.A, this.size);
    }

    public Double calculateDeterminant(Double[][] m, int sizeM) {
        if (sizeM == 1) {
            return m[0][0];
        } else if (sizeM == 2) {
            return m[0][0] * m[1][1] - m[0][1] * m[1][0];
        } else {
            Double sum = 0.0;
            int multiplier = -1;
            for (int i = 0; i < sizeM; i++) {
                multiplier = multiplier == -1 ? 1 : -1;
                Double[][] nM = this.copyMatrix(m, sizeM, i);
                Double det = multiplier * m[0][i] * calculateDeterminant(nM, sizeM - 1);
                sum += det;
            }
            return sum;
        }
    }

    public Double[][] copyMatrix(Double[][] m, int size, int col) {
        int sizeM = size - 1;
        Double[][] result = new Double[sizeM][sizeM];
        return result;
    }
}