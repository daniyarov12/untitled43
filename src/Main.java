import java.util.Scanner;
public class Main  {
    public static void main(String[] args) {
        StringRevertel stringRevertel = (str) -> {
        StringBuilder sb = new StringBuilder(str);
         return sb.reverse().toString();
         };
        Scanner scanner=new Scanner(System.in);
        System.out.print("Changeable word: ");
        String str=scanner.next();
        System.out.println("Revert word : "+stringRevertel.revert(str));
    }
}