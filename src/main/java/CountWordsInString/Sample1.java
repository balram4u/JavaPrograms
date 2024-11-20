package CountWordsInString;

public class Sample1 {
    public static void main(String args[]) {
        // initializing a string
        String msg = "How are You!!";
        System.out.println("The given String is: " + msg);
        // initial count of the words
        int total = 1;
        // loop variable
        int i = 0;
        // while loop to count the number of words
        System.out.println(msg.length());
        while (i < msg.length()) {
            // checking if the current character is space or not
            if ((msg.charAt(i) == ' ') && (msg.charAt(i + 1) != ' '))  {
                total++;  // incrementing the word count
            }
            i++; // incrementing loop variable
        }
        // printing the result
        System.out.println("Number of words in the given string: " +  total);
    }
}
