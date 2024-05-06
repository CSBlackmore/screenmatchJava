import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("This is Java Immersion with Alura");

        int releaseDate = 1999;
        boolean includedInBasicPlan = true;
        String movieName = "Matrix";
        String plot = """
                Neo discovers that his reality is a simulated world created by sentient machines.
                Joined by rebels, he battles to free humanity from enslavement and uncover the truth about the Matrix.
                The film explores themes of reality, identity, and the nature of control in a dystopian future.
                """;
        double usersMeanRate = 0;

        System.out.println("Film: " + movieName);
        System.out.println("Released in: " + releaseDate);
        System.out.println("Synopsis: " + plot);
        System.out.println(includedInBasicPlan);

        if (releaseDate >= 2023) {
            System.out.println("Popular Film Now");
        }
        else {
            System.out.println("Nice Retro Film");
        }
        for (int i = 0; i < 3; i++) {
            Scanner userInput = new Scanner(System.in);
            System.out.println("Enter your rating for the film: ");
            double meanRate = userInput.nextDouble();
            usersMeanRate = usersMeanRate + meanRate;
        }
        System.out.println("Users Rate for the Film: " + (usersMeanRate)/3);
    }
}