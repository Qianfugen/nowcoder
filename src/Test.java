import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while(scanner.hasNextLine()){
            String s=scanner.nextLine();
            System.out.println(scanner.hasNextLine());
            System.out.println(s);
        }
    }
}
