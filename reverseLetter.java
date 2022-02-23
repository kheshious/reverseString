package rev;

import java.util.Scanner;


public class reverseLetter {

  public static void main(String[] args) 
  {
    Scanner scan = new Scanner(System.in);
    System.out.println("please enter any word : ");
    String str =scan.next();
    reverseString(str);
  }
  public static void reverseString(String word)
  {
    
    char[] ch = word.toCharArray();
    
    for(int i =word.length() ;i>=0; i--)
    {
      //System.out.println(ch[i]);
    }
  }

}
