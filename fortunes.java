import java.util.Arrays;
import java.util.List;
import java.util.Random;
public class Fortunes {
  public static void main(String args[]) {
  List<String> fortunes = Arrays.asList ("A beautiful, smart, and loving person will be coming into your life.", "A dubious friend may be an enemy in camouflage.", "A faithful friend is a strong defense.", "A feather in the hand is better than a bird in the air.", "A fresh start will put you on your way.", "A friend asks only for your time not your money.", "A friend is a present you give yourself.", "A golden egg of opportunity falls into your lap this month.", "A good time to finish up old tasks.", "A hunch is creativity trying to tell you something.", "A lifetime friend shall soon be made.", "A lifetime of happiness lies ahead of you.", "A light heart carries you through all the hard times.");
  Random rand = new Random();
  String random = fortunes.get(rand.nextInt(fortunes.size())); // randomly select one fortune from the given list 
  System.out.println(random); // print statement to check if it randomly chooses a fortune from the given list
  }
}