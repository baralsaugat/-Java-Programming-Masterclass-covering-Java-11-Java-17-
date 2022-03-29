public class SpeedConverter {




    public static long toMilesPerHour(double kilometersPerHour){
        if(kilometersPerHour > 0){
            return Math.round(kilometersPerHour * 0.621371);


        }
        return -1;
    }

    public static void printConversion(double kilometersPerHour){
if (kilometersPerHour < 0){
    System.out.println("Invalid Value");


}
else{
    long milesPerHour = toMilesPerHour(kilometersPerHour);
    System.out.println(kilometersPerHour + "km/h= " + milesPerHour +
            "miles/h"

    );
}
    }
}
