import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        while (true){
            System.out.println("Do you want to say it?");
            String input = sc.nextLine();
            if(input.equals("y")){
                System.out.println("Hello world!");
            } else {
                break;
            }
        }

    }
}