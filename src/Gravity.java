public class Gravity {
    private final double m1;
    private final double m2;
    private final double r;

    Gravity(double[] value, String[] unit) {

        this.m1 = UnitConverter.convertMassToKg(value[0], unit[0]);
        this.m2 = UnitConverter.convertMassToKg(value[1], unit[1]);
        this.r = UnitConverter.convertDistanceToMeters(value[2], unit[2]);
    }
    public void Formula(){
        final double g = 6.67 * Math.pow(10, -11);
        double force = ((m1 * m2) / Math.pow(r, 2)) * g;
        System.out.println(force + " N");
    }
}
