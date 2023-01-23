
/*
 * 1. Ask the user how many people they live with:
 * if user lives with Less than 3 people: print "Live with less than 3 people"
 * if the user lives with 3 - 6 people: print "Live with 3 - 6 people"
 * if the user lives with more than 6 people: print "Live with "more than 6
 * people"
 */
import java.util.Scanner;

class Main {

  public static void main(String[] args) {

    Scanner choiceObj = new Scanner(System.in);
    System.out.println("how many people they live with: ");

    int numberOfPeople = choiceObj.nextInt();
    String choiceOutput = "";

    if (numberOfPeople < 3) {
      System.out.println(choiceOutput = "Live with less than 3 people");
    } else if (numberOfPeople >= 3 || numberOfPeople <= 6) {
      System.out.println(choiceOutput = "Live with 3 - 6 people");
    } else {
      System.out.println(choiceOutput = "Live with more than 6 people");
    }

  }

}
