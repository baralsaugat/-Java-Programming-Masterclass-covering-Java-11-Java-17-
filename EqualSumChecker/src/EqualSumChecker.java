public class EqualSumChecker {

    public static boolean hasEqualSum(int firstNum, int secondNum, int thirdNum){
        int total = firstNum + secondNum;
        if( total == thirdNum) {
            return true;
        }
        return false;
    }
}
