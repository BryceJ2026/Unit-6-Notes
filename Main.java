public class Main {

   public static void main(String []args) {
      
      // ARRAY(list) is a DATA STRUCTURE(collection)
      //stores multiple values in one named variable

      //DECLARE arrays using square brackets
      // one array can hold items of ONE DATA TYPE
      int[] luckyNumbers; // just creates a named REFERENCE, no values set
      double[] mileTimes;
      boolean[]trueOrFalse;
      //Arrays can also store OBJECTS (reference types)
      String[] spiritAnimal;

      //TWO OPTIONS to CREATE the array in memory
      // 1. Use the keyword NEW to set up an empty array
      //Need to tell Java HOW MANY SPACES to allocate
      luckyNumbers = new int[6]; // already declared earlier
      int[] moreLuckyNumbers = new int[8]; //DECLARE + CREATE in one line
      double[] movieRatings = new double[10];
      String[] faveAnimals = new String[8];
      System.out.println(moreLuckyNumbers);// Just prints location in memory

      // 2. Use an INITIALIZER LIST to set array value
      int[] lusckiestNumber = { 13, 13, 10, 9, 5, 20, 37, 7};
      double[] currentCash = {1.0, 3.25, 15.0, 21.0};
      String[] bestClass = {"Maia", "Alex", "Zoie", "Paige", "Natalie", "Bryce", "Finny", "Jackson"};
      System.out.println(lusckiestNumber[0]); // first item is at index 0
      System.out.println(bestClass[5]); //prints Bryce
      


   }
}
