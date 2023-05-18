import java.util.*; //import utility classes
import java.io.*; //import file writing class   
import java.time.*; // import the LocalDate class

public class Main {
  public static void main(String[] args) {
    // Initialize 2D array 5 Rows by 20 columns (questions)
    /* Row 0 = Survey Questions
    Row 1 = answers for Apple party
    Row 2= answers for Banana party
    Row 3= answers for Lettuce party
    Row 4= answers for Cauliflower party
    */
    String[][] program = {
      { "What is your favorite color?" + "\n" + "Red, Yellow, Green or White", "Do you like fruits, meat, fish or vegetables?" , "What is your favorite season?" + "\n" + "Winter, Spring, Summer or Fall", "Who do you think the next president should be?" + "\n" + "Steve Jobs, Dole Peterson, Romaine Iceberg or Albino Broccoli", "How much should we be taxed?" + "\n" + "High, Medium, Low or None", "Should we ban guns?" + "\n" + "Yes, Maybe, No but more regulation or No", "What region in the United States do you reside?" + "\n" + "North, South, East or West", "What is your ideal government?" + "\n" + "Democracy, Socialist, Capitalist or Communist", "Which socioeconomic class do you think you fall under?"  + "\n" + "Rich, Upper Middle, Middle or Lower",
            "What political party do you affliate with?" + "\n" + "Apple, Banana, Lettuce or Cauliflower" },
      { "Red", "Fruits", "Winter", "Steve Jobs", "High", "Maybe", "North", "Democracy", "Rich", "Apple" },
      { "Yellow", "Meat", "Spring", "Dole Peterson", "Medium", "Yes", "South", "Socialist", "Middle", "Banana" },
      { "Green", "Vegetables", "Summer", "Romaine Iceberg", "Low", "No", "East", "Capitalist", "Upper Middle", "Lettuce" },
      { "White", "Fish", "Fall", "Albino Broccoli", "None", "No but more regulation", "West", "Communist", "Lower", "Cauliflower" }
    }; 
   //set counter for each party
    int apple = 0;
    int banana = 0;
    int lettuce = 0;
    int cauliflower = 0;
    //create array object for each party row
    String[] partyapple = program[1];
    String[] partybanana = program[2];
    String[] partylettuce = program[3];
    String[] partycauliflower = program[4];
    //store survey responses in LinkedList
    //initialize LinkedList
    LinkedList<String> responses = new LinkedList<>();
    
    Scanner scanner = new Scanner(System.in);
    //Iterate through row 0 of program to ask questions
    //Ask for userinput to each question and store in linkedlist
    for (int i = 0; i < 10; i++) {
      System.out.println(program[0][i] + ".");
      String currentInput = scanner.nextLine();
      responses.add(currentInput);
      //use for loop to find answer in any of the party rows
        for (String answer:partyapple){
          if(answer.equalsIgnoreCase(currentInput)){
            apple++;
          if (apple==3){
            System.out.println("\n" + "Prediction: You are affliated with the apple party." + "\n"); 
          }
          }
        }
        for (String answer:partybanana){
          if(answer.equalsIgnoreCase(currentInput)){
            banana++;
            if (banana==3){
              System.out.println("\n" + "Prediction: You are affliated with the banana party." + "\n");
            }
          }
        }  
        for (String answer:partylettuce){
          if(answer.equalsIgnoreCase(currentInput)){
            lettuce++;
            if (lettuce==3){
              System.out.println("\n" + "Prediction: You are affliated with the lettuce party." + "\n");
            }
          }
        }
        for (String answer:partycauliflower){
          if(answer.equalsIgnoreCase(currentInput)){
            cauliflower++;
            if (cauliflower==3){
              System.out.println("\n" + "Prediction: You are affliated with the cauliflower party." + "\n");
            }
          }
        }
    }
    //create variable for date stamp
    LocalDate timestamp= LocalDate.now();
    //use the 10th user input response from linkedlist 
    //this will dictate which txt file to save the data to
    String Userparty= responses.get(9);
    String Appleparty = "apple";
    String Bananaparty = "banana";
    String Lettuceparty = "lettuce";
    String Cauliflowerparty = "cauliflower";
    //use try and catch to write to txt files for apple
    if (Userparty.equalsIgnoreCase(Appleparty)){
      try {
        FileWriter myWriter = new FileWriter("applelog.txt", true);
        BufferedWriter bufferedWriter = new BufferedWriter(myWriter);
        bufferedWriter.newLine();
        bufferedWriter.write(timestamp + "\n");
        bufferedWriter.write(responses.get(0) + "\n");
        bufferedWriter.write(responses.get(1) + "\n");
        bufferedWriter.write(responses.get(2) + "\n");
        bufferedWriter.write(responses.get(3) + "\n");
        bufferedWriter.write(responses.get(4) + "\n");
        bufferedWriter.write(responses.get(5) + "\n");
        bufferedWriter.write(responses.get(6) + "\n");
        bufferedWriter.write(responses.get(7) + "\n");
        bufferedWriter.write(responses.get(8) + "\n");
        bufferedWriter.close();
        System.out.println("Successfully wrote to the file.");
      } catch (IOException e) {
        System.out.println("An error occurred.");
        e.printStackTrace();
        }
    }
    //use try and catch to write to txt files for banana
    if (Userparty.equalsIgnoreCase(Bananaparty)){
      try {
        FileWriter myWriter = new FileWriter("bananalog.txt", true);
        BufferedWriter bufferedWriter = new BufferedWriter(myWriter);
        bufferedWriter.newLine();
        bufferedWriter.write(timestamp + "\n");
        bufferedWriter.write(responses.get(0) + "\n");
        bufferedWriter.write(responses.get(1) + "\n");
        bufferedWriter.write(responses.get(2) + "\n");
        bufferedWriter.write(responses.get(3) + "\n");
        bufferedWriter.write(responses.get(4) + "\n");
        bufferedWriter.write(responses.get(5) + "\n");
        bufferedWriter.write(responses.get(6) + "\n");
        bufferedWriter.write(responses.get(7) + "\n");
        bufferedWriter.write(responses.get(8) + "\n");
        bufferedWriter.close();
        System.out.println("Successfully wrote to the file.");
      } catch (IOException e) {
        System.out.println("An error occurred.");
        e.printStackTrace();
        }
    }
    //use try and catch to write to txt files for lettuce
    if (Userparty.equalsIgnoreCase(Lettuceparty)){
      try {
        FileWriter myWriter = new FileWriter("lettucelog.txt", true);
        BufferedWriter bufferedWriter = new BufferedWriter(myWriter);
        bufferedWriter.newLine();
        bufferedWriter.write(timestamp + "\n");
        bufferedWriter.write(responses.get(0) + "\n");
        bufferedWriter.write(responses.get(1) + "\n");
        bufferedWriter.write(responses.get(2) + "\n");
        bufferedWriter.write(responses.get(3) + "\n");
        bufferedWriter.write(responses.get(4) + "\n");
        bufferedWriter.write(responses.get(5) + "\n");
        bufferedWriter.write(responses.get(6) + "\n");
        bufferedWriter.write(responses.get(7) + "\n");
        bufferedWriter.write(responses.get(8) + "\n");
        bufferedWriter.close();
        System.out.println("Successfully wrote to the file.");
      } catch (IOException e) {
        System.out.println("An error occurred.");
        e.printStackTrace();
        }
    }
    //use try and catch to write to txt files for cauliflower
    if (Userparty.equalsIgnoreCase(Cauliflowerparty)){
      try {
        FileWriter myWriter = new FileWriter("cauliflowerlog.txt", true);
        BufferedWriter bufferedWriter = new BufferedWriter(myWriter);
        bufferedWriter.newLine();
        bufferedWriter.write(timestamp + "\n");
        bufferedWriter.write(responses.get(0) + "\n");
        bufferedWriter.write(responses.get(1) + "\n");
        bufferedWriter.write(responses.get(2) + "\n");
        bufferedWriter.write(responses.get(3) + "\n");
        bufferedWriter.write(responses.get(4) + "\n");
        bufferedWriter.write(responses.get(5) + "\n");
        bufferedWriter.write(responses.get(6) + "\n");
        bufferedWriter.write(responses.get(7) + "\n");
        bufferedWriter.write(responses.get(8) + "\n");
        bufferedWriter.close();
        System.out.println("Successfully wrote to the file.");
      } catch (IOException e) {
        System.out.println("An error occurred.");
        e.printStackTrace();
        }
    }
  }
}