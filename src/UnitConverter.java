public class UnitConverter  {
    public static double convertMassToKg(double value,String unit){
        return switch (unit) {
            case "kg" -> value;
            case "g" -> value / 1000;
            case "mg" -> value / 1000000;
            case "μg" -> value / 1000000000;
            case "lb" -> value * 0.45359237;
            default -> throw new IllegalArgumentException(
                    "unknow unit: " + unit);
        };
    }
    public static double convertDistanceToMeters(double value, String unit) {
        return switch (unit) {
            case "m" -> value;
            case "cm" -> value * 0.01;
            case "mm" -> value * 0.001;
            case "μm" -> value * 1e-6;
            case "ft" -> value * 0.3048;
            default -> throw new IllegalArgumentException(
                    "Unknown distance unit: " + unit);
        };
    }
}
