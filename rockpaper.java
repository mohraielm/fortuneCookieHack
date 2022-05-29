import java.util.Scanner;
import java.util.Random;
public class cookie{

      //calling the method
public static void main(String[] args) {
play();
}
// the computer's random choice between 1 and 3
    public static String computerChoice(){
    Random rn= new Random();
    int rnchoice= rn.nextInt(3)+1;
    String computer = null;
    switch(rnchoice){
        case 1:
            computer="rock";
            break;
        case 2:
            computer="paper";
            break;
        case 3:
            computer="scissors";
            break;
    }
        return computer;
    }
    
//checking if the user choice is valid
    public static boolean isValidChoice(String choice){
    String choice1=choice.toLowerCase();
    boolean check=true;
    check = choice1.equals("rock")||choice1.equals("paper") || choice1.equals("scissors");
    return check;
    }
    

//the user's input
    public static String userChoice(){
    System.out.println("Enter your choice of rock, paper, or scissors: ");
     Scanner scnr= new Scanner(System.in);
     String user=scnr.nextLine();
     while(!isValidChoice(user)){
    System.out.println("invalid input. choose from rock, paper, or scissors");
    user=scnr.nextLine();
     }
     return user;
     }
   
//determines who wins
    public static void determineWinner(String computer, String user){
    String user1=user.toLowerCase();
    if(computer.equals("rock")&&user1.equals("scissors")){
        System.out.println("the computer wins! Rock smashes scissors.");
    }
    else if(computer.equals("scissors")&&user1.equals("rock")){
        System.out.println("you win! Rock smashes scissors.");
    }
    else if(computer.equals("scissors")&&user1.equals("paper")){
        System.out.println("The computer wins! Scissors cut paper.");

    }
    else if(computer.equals("paper")&&user1.equals("scissors")){
        System.out.println("you win! Scissors cut paper.");
    }
    else if(computer.equals("paper")&&user1.equals("rock")){
        System.out.println("The computer wins! Paper wraps rock.");
    }
    else if(computer.equals("rock")&&user1.equals("paper")){
        System.out.println("You win! Paper wraps rock.");
    }
    if(computer.equals(user1)){
    System.out.println("It's a tie! play again.");
    tie();
    }
    }

//method to play again for a tie without the code fully repeating itself
public static void tie(){
    play();
}

//method to call the game
public static void play(){
String comp=computerChoice();
String user=userChoice();
System.out.println("You chose: " + user);
System.out.println("The computer chose: " + comp);
determineWinner(comp,user);
if(!(comp.equals(user))){
PlayA();
}
}

//method to play again
public static boolean PlayA(){
Scanner scnr=new Scanner(System.in);
boolean checkA=true;
System.out.println("want to play again? press Y for yes and N for no");
String again= scnr.nextLine();
String again1=again.toLowerCase();
if(again1.equals("y")){
    play();
    checkA=true;
}
if(again1.equals("n")){
    System.out.println("Thank you for playing!");
    checkA=false;
}
else if (!(again1.equals("n")|| again1.equals("y"))){
    System.out.println("invalid.");
    checkA= PlayA();

}
return checkA;
}


}