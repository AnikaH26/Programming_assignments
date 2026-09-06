public class MoreFunctions {
    static double RangleinMiles(double fuel, double effiency){
        double range_mi=fuel*effiency;
        return range_mi;
    }
    static double RangeinKM(double range_mi){
        double range_KM = (range_mi*2)-(0.8*range_mi);
        return range_KM;
    }

public static void main(String[] args) {
    double fuel=13.2;
    double effiency=31;
    double range_KM = RangeinKM(RangleinMiles(fuel, effiency));
    System.out.println(range_KM);
}
}
