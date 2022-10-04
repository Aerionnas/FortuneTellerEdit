import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Random;
public class fortunatrial{

  int fortSize = 524;
  String[] fortunes = new String[fortSize];

  public void readCsv(){
    try{
      File fortune = new File("fortunes.csv");
      Scanner scanner = new Scanner(fortune);
      scanner.nextLine();
      int index = 0;
      while(scanner.hasNextLine()){
        fortunes[index] = scanner.nextLine();

        index++;
       
      }
      scanner.close();
      
      
    }
    catch(FileNotFoundException e){
      System.out.println("error");
    }
  }
  
  // public static final String[] fortunes = {
  //   "You are going to win 1 million dollar",
  //   "Success is coming your way",
  //   "After your next nap, you will wake up laughing",
  //   "A best friend will surprise you",
  //   "You will meet your soulmate in an expected place",
  //   "This year will be full of surprises",
  //   "Your day is going to be filled with joy",
  //   "Soon you will be sitting on top of the world",
  //   "Life is what you make it, so let's make it rock",
  //   "Nobody's perfect so do not try to be. Be the best you that you can be",
  //   "Don't save for tomorrow what you can do today",
  //   "Always remain a student",
  //   "You head is too big for your body",
  //   "Take Chances",
  //   "Belive in yourself",
  //   "Stop running away from your problems",
  //   "Failure leads to success",
  //   "Conquer your dreams",
  //   "Reach for the stars",
  //   "Leave things better than you found them",
  //   "Run",
  //   "Some is looking down on you",
  //   "Do something else with your lide",
  //   "I cannot help you, I am just a fortune",
  //   "Perhaps you should lay off on the snacks",
  //   "You have something on your face"
  // };

  public String giveFortune(){

    Random ran = new Random();
    // used to get the next random integer in the array
    int randNum = ran.nextInt(fortunes.length);
    return fortunes[randNum];

  }
  
}
