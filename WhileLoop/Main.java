
import java.util.Scanner;

class Main {
  public static void main(String[] args) {

//--------------------------------------------------------
    // Ignore. This is just used to get a mystery number for x.
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number in the console above 6.");
    int x = sc.nextInt();
    sc.close();
//--------------------------------------------------------

    // Use a while loop to print the values of x to 6 decreasing in size by 1 each time. 

// Your code here:
  while(x >= 6)
    {
      System.out.println(x);
      x = x -1;
    }
  
  
  }
}