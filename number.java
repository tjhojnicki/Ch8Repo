

/**
 * Write a description of class number here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class number
{
    static String testy="";
    public static void main(String[] args)
    {
     //numberPrint(5); 
     //numberPrint1(5); 
     String test= "balls";
     String balls= "I like tasty balls, Cheese Balls";
     //System.out.println(balls.substring(balls.length()-1,balls.length()));
     stringFlip(test);
     
     System.out.println(testy);
    }
  public static void numberPrint(int n)
  {
     if(n==0){
     System.out.println(0);
      return ;}
     else{
      System.out.println(n);
      numberPrint(n-1);
      return;
    }
     
      
    


}
  public static void numberPrint1(int n)
  {
    
     if(n==0){
     System.out.println(0);
     }
     else{
      
      numberPrint1(n-1);
      System.out.println(n);
      
    }
}
public static String stringFlip(String stir)
{
    if(stir==null){
    
    return;
   }
   else 
   {
    testy+=stir.substring(stir.length()-1,stir.length());
    
    String newTesty=stir.substring(0,stir.length()-1);
    stringFlip(newTesty);
    
   return;
   }
    
}

}