package ecnu.dll;

import org.apache.commons.math3.distribution.LaplaceDistribution;

public class Main {
    public static void main(String[] args) {
        System.out.println("haha");
        LaplaceDistribution lap = new LaplaceDistribution(0,2);
        System.out.println(lap.getSupportLowerBound());
        System.out.println(lap.getSupportUpperBound());
        System.out.println(lap.sample());
    }
}
