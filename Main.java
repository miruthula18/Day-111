import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word: ");
        StringBuffer sb = new StringBuffer(sc.nextLine());

        System.out.print("Enter start index: ");
        int start = sc.nextInt();

        System.out.print("Enter end index: ");
        int end = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter replacement text: ");
        String text = sc.nextLine();

        if (start >= 0 && start < end && end <= sb.length()) {
            sb.replace(start, end, text);
            System.out.println("Result: " + sb);
        } else {
            System.out.println("Invalid index");
        }

        sc.close();
    }
}
