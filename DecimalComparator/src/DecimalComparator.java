public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double firstNum, double secondNum){
        int firstInt = (int) (firstNum *1000);
        int secondInt = (int) (secondNum *1000);
        if(firstInt == secondInt){
            return true;
        }
        return false;

    }


}
