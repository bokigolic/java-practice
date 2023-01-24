
/*
 * 1. Ask the user how many people they live with:
 * if user lives with Less than 3 people: print "Live with less than 3 people"
 * if the user lives with 3 - 6 people: print "Live with 3 - 6 people"
 * if the user lives with more than 6 people: print "Live with "more than 6
 * people"
 * */

import java.util.Scanner;

/* 
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
*/

/*Create a class named GradeReport:
            2.1 Ask the user to enter the his/her score
            2.2 Print the grade of the student (A, B, C, D, F)
            2.3 If user enter invalid score (negative or more than 100) print invalid score
 */

class GradeReport {

  public static void main(String[] args) {
    Scanner userInut = new Scanner(System.in);
    System.out.println("enter your score: ");
    int score = userInut.nextInt();

    if (score < 0 || score > 100) {
      System.out.println("invalid score ");
    } else if (score > 0 && score < 20) {
      System.out.println("grade F ");
    } else if (score > 20 && score < 40) {
      System.out.println("grade D ");
    } else if (score > 40 && score < 60) {
      System.out.println("grade C ");
    } else if (score > 60 && score < 80) {
      System.out.println("grade B ");
    } else if (score > 80 && score < 100) {
      System.out.println("grade A ");
    }
  }
}