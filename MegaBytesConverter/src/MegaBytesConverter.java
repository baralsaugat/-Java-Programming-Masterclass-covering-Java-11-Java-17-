public class MegaBytesConverter {

    public static void printMegaBytesAndKiloBytes(  int kiloBytes){
        if(kiloBytes < 0){
            System.out.println("Invalid Value");
        }

else {
            System.out.println(kiloBytes + " KB" + " = " + Math.round(kiloBytes / 1024) + " and " + kiloBytes % 1024 + " KB");
        }

    }

}