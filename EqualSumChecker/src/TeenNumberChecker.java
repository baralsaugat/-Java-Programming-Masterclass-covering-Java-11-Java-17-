public class TeenNumberChecker {


    public static boolean hasTeen(int first, int second, int third){
        if(first <=19 && first >=13 || second<=19 && second>= 13 || third<=19 && third>=13){
            return true;
        }
        return false;


    }

    public static boolean isTeen(int fourth) {
        if(fourth<=19 && fourth>=13){
            return true;
        }
        return false;
    }
}
