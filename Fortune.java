import java.util.*;
public class Fortune {
    
    public static void main(String[] args) {
        Fortune fortuneTeller = new Fortune();
        fortuneTeller.printInstructions();
        String[] colors = fortuneTeller.stepOne();
        fortuneTeller.printColors(colors);
        int chosenColor = fortuneTeller.pickColor(colors);
        fortuneTeller.printNumberOptions(chosenColor);
        System.out.println("You chose the following number " + fortuneTeller.pickFirstNumber()+ ". Here's your fortune: ");
        fortunatrial arrayObject = new fortunatrial();
        System.out.print(arrayObject.giveFortune());
        System.out.println("Good luck in your future");
        }
        

        

    

    /**
     * printInstructions() will print out the name of the user and the introduction
     * of the work
     */
    public void printInstructions() {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("%nWelcome to the Virtual Paper Fortune Teller!%n What is your name: ");
        String name = scanner.nextLine();
        System.out.printf("%n Hello %s, let's get started!", name);
       
        
        
    }

    /**
     * printColors() will print out the colors separately from the array
     * 
     * @param array
     */
    public void printColors(String[] array) {
        int i = 0;
        System.out.println("The colors you chose are: ");
        while (i < array.length) {
            System.out.println(array[i]);
            i++;

        }
    }

    /**
     * stepOne() will create an array that holds the color that the user typed in
     * 
     * @return color the array that that holds the user's colors
     */
    public String[] stepOne() {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("%nPlease enter 4 colors with spaces: ");
        String userColors = scanner.nextLine();
        String[] color = userColors.split(" ");
        scanner.close();
       
        return color;

    }

    /**
     * pickColor() gives the length of the color that the user chooses
     * 
     * @param colors an array that holds all the colors that the user had chosed
     *               before
     * @return length the length of the color
     */
    public int pickColor(String[] colors) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pick one of your colors: ");
        String oneColor = scanner.nextLine();
        int length = 0;
        for (int i = 0; i < colors.length; i++) {
            if (oneColor.equals(colors[i])) {
                length = oneColor.length();

            }
        }
        scanner.close();
       
        return length;
    }

    /**
     * printnumberOptions() prints the number options given the color that the user
     * chooses
     * 
     * @param chosenColor the number that the user picks
     */
    public void printNumberOptions(int chosenColor) {

        if (chosenColor % 2 == 0) {
            System.out.printf("0, 1, 5, 4");
        } else {
            System.out.printf("2, 3, 7, 6");
        }
    }

    /**
     * pickFirstNumber() will show the user picking the number from the
     * intNumberOptions()
     * 
     * @return firstNumber the number that they choose
     */
    public int pickFirstNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("%nThese are your number options, please choose a number: ");
        int firstNumber = scanner.nextInt();
        scanner.close();
        return firstNumber;
    }

   
}
