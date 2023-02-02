import java.util.Scanner;
  
class Main {
  public static void main(String[] args) {
    Scanner num = new Scanner(System.in);
    System.out.println("\nEnter a whole number: ");
    int myNumber = num.nextInt();
    
    int stepOne = myNumber*myNumber;
    System.out.println(myNumber + " x " + myNumber + " = " + stepOne);
    
    int stepTwo = stepOne + myNumber;
    System.out.println(stepOne + " + " + myNumber + " = " + stepTwo);
    
    int stepThree = stepTwo / myNumber;
    System.out.println(stepTwo + " / " + myNumber + " = " + stepThree);
    
    int stepFour = stepThree + 17;
    System.out.println(stepThree + " + 17 = " + stepFour);
    
    int stepFive = stepFour - myNumber;
    System.out.println(stepFour + " - " + myNumber + " = " + stepFive);
    
    int stepSix = stepFive / 3;
    System.out.println(stepFive + " / 3 = " + stepSix + "\nThe Magic Number is " + stepSix + ".");
  }
}