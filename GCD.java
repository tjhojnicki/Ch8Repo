

/**
 * Write a description of class GCD here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GCD
{
    int i;
    public GCD()
    {
        
        
    }
    public int divide(int num1,int num2)
    {if(num2<=num1&& (num1%num2)==0)
        {
            i=num2;
        }
        else if(num1<num2)
        {
            divide(num2,num1);
        }
        else
        {
            divide(num2,num1%num2);
        }
        return i;
    }
    public static void main (String[] args)
    {
        GCD dog= new GCD();
        System.out.println(dog.divide(33,9));
    }
    

}
