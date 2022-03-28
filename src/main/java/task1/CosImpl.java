package task1;

import task1.mathInterfaces.CosDecomposition;

public class CosImpl implements CosDecomposition {

    private int n;
    private Double x;

    public CosImpl(int n) {
        this.n = n;
    }

    public CosImpl(){}

    private int fact(int n, int res) {
        if (n == 0) return res;
        else return fact(n-1, res * n);
    }

    public Double apply(Double x, int n) {
        Double result = Double.valueOf(0);
        for (int k = 0; k <= n; k++) {
            result += Math.pow(-1, k) * Math.pow(x, 2 * k) / fact(k, 1);
        }
        return result;
    }

    public int getN() {
        return this.n;
    }

    public void setN(int n){
        this.n = n;
        return;
    }
    public Double getX() {
        return x;
    }

    public void setX(Double x) {
        this.x = x;
    }
}
