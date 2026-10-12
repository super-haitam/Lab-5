package problem2;
import java.util.Scanner;

public class Main {
    public static void main(String[] argv) {
        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("\nHow many questions are in the quiz ?");

            int nbQuest = scan.nextInt();

            System.out.println("Type the correct answers.");
            int[] answers = new int[nbQuest];
            for (int i = 0; i < nbQuest; ++i) {
                answers[i] = scan.nextInt();
            }

            System.out.println("Enter the answers for the quiz to be graded.");

            int correct = 0;
            for (int i = 0; i < nbQuest; ++i) {
                if (scan.nextInt() == answers[i]) correct++;
            }

            System.out.printf("There were %d/%d correct answers, with a percent of %f%%\n\n", correct, nbQuest, (double) correct / nbQuest * 100);

            System.out.println("Grade another quiz? (y/n).");
        } while (scan.next().equalsIgnoreCase("y"));
    }
}
