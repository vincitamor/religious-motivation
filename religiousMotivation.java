import java.util.Scanner;
import java.util.ArrayList;


public class religiousMotivation {
    public static void main(String[] args) {

        // Initializing scanner to take in user input
        Scanner input = new Scanner(System.in);

        // Declaring variable to handle user input choice
        int userInput;

        // Initializing ArrayList
        ArrayList<String> quotes = new ArrayList<>();

        // Adding Strings to ArrayList
        quotes.add("Love yourself, always.");

        quotes.add("God is good, all the time.");

        quotes.add("You ARE loved by Him!");

        quotes.add("Now faith is the assurance of things hoped for, " +
                "the conviction of things not seen. ~ Hebrews 11:1");

        quotes.add("And Jesus answered them, “Have faith in God. Truly, I say to you," +
                " whoever says to this mountain, ‘Be taken up and thrown into the sea, " +
                "and does not doubt in his heart, but believes that what he says will come to pass, " +
                "it will be done for him. Therefore I tell you, whatever you ask in prayer, " +
                "believe that you have received it, and it will be yours. ~ Mark 11:22-24");

        quotes.add("For nothing will be impossible with God. ~ Luke 1:37");

        quotes.add("Trust in the Lord with all your heart, and do not lean on your own understanding." +
                " In all your ways acknowledge him, " +
                "and he will make straight your paths. ~ Proverbs 3:5-6");

        quotes.add("And without faith it is impossible to please him, for whoever would draw near " +
                "to God must believe that he exists and " +
                "that he rewards those who seek him. ~ Hebrews 11:6");

        // Declaring variable to take in user char input
        char exitChar;

        System.out.print("Welcome to the motivational game! Press 'Y' if you'd like to continue:\t");

        // Taking account for user input at index 0
        exitChar = input.next().charAt(0);

        while (exitChar != 'N') {
            for (int j = 0; j <= 2; ) {

                if (exitChar != 'Y') {
                    System.out.println("Have a great day!");
                    return;
                }
                System.out.println();
                System.out.print("Pick a number from 0-2, or press 3 for more!:\t");
                userInput = input.nextInt();
                System.out.println();

                if (userInput == 0) {
                    System.out.println(quotes.get(0));
                    System.out.println();
                } else if (userInput == 1) {
                    System.out.println(quotes.get(1));
                    System.out.println();
                } else if (userInput == 2) {
                    System.out.println(quotes.get(2));
                    System.out.println();
                } else {
                    break;
                }
            }

            // Line for spacing
            System.out.println();


            // for loop to continue ArrayList outputs based on user input
            for (int i = 0; i < quotes.size(); ) {
                System.out.println("Need more motivation? Enter a number, between 3 to 7, " +
                        "or press 0 to exit the application.");
                System.out.println();
                userInput = input.nextInt();

                // If-else statement to check conditions of user input
                if (userInput >= 3) {
                    System.out.println(quotes.get(userInput));
                    System.out.println();
                    input.nextLine();

                }
                else if (userInput < 3 && userInput > 0) {
                    System.out.println("Enter a valid number");
                    System.out.println();

                }
                else {
                    System.out.println("It was nice helping you, I am here whenever you need me, have a great day!");
                    System.out.println();
                    return;
                }
            }
        }
    }
}