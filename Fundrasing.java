

/**
 * Write a description of class Fundrasing here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fundrasing
{
    int value=0;
    public Fundrasing()
    {
        
    }
    public int collect(int goal)
    {
    
        
    if(goal==1)
     return 1;
     else
     {
      //value+=collect(goal/10)*10+1;
      System.out.println("hi");
      return collect(goal/10)+collect(goal/10)+collect(goal/10)+collect(goal/10)+collect(goal/10)+collect(goal/10)+collect(goal/10)+collect(goal/10)+
            collect(goal/10)+collect(goal/10)+1;
        }
    
       
   }
   public static void main(String[] args)
   {
       Fundrasing fund= new Fundrasing();
       System.out.println(fund.collect(1000));
    }
}
