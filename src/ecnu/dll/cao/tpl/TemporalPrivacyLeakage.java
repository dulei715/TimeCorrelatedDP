package ecnu.dll.cao.tpl;

import ecnu.dll.cao.tpl.basic.Correlation;

public abstract class TemporalPrivacyLeakage {

    public abstract double getBPLOrFPL(Correlation correlation, double formerLeakage, double epsilon);

    public abstract double getTimePrivacyLeakage(Correlation backCorrelation, Correlation forwardCorrelation, double alpha);

    public static void main(String[] args) {

    }
}
