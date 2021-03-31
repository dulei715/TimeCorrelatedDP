package ecnu.dll.cao.tpl.basic;

public class Correlation {
    int dimension = 0;
    public double[][] transitionMatrix = null;

    public Correlation(int dimension, double[][] transitionMatrix) {
        this.dimension = dimension;
        this.transitionMatrix = transitionMatrix;
    }

    public void setTransitionMatrix(double[][] transitionMatrix) {
        this.transitionMatrix = transitionMatrix;
        this.dimension = transitionMatrix.length;
    }

    public int getDimension() {
        return dimension;
    }

    public double[][] getTransitionMatrix() {
        return transitionMatrix;
    }
}
