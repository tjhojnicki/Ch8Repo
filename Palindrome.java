

/**
 * Write a description of class Palidrome here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Palindrome
{
    String word;
   public Palindrome(String a)
   {
       word=a;
       
       
    }
    
   public boolean isPal()
   {String balls= stringFlip(word);
    if(word.compareTo(balls)==0)
        return true;
    else
     return false;
    }
  

    
  public static String stringFlip(String test)
  {
    if(test == null || (test.length() <= 1))
    {    
        return test; 
    }
    else 
        return stringFlip (test.substring(1))+ test.charAt(0);
  }
  
  
   
 
}

