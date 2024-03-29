public class Solution 
{
    public void division(int x, int y)
    {
        try{
            if(y==0){
                throw new ArithmeticException("Invalid input, give a positive intiger number");
            }
            int result = x/y;
            System.out.println("x = "+x+", y = "+y); 
            System.out.println("Answer of "+ x+" / "+y+" = "+result);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Exception occure: "+e.getMessage());
        }
    }
    public void validate(int age) 
    { 
        System.out.println("The age of person is "+age); 
        if(age<18) 
        {  
            throw new ArithmeticException("Person is not eligible to vote");    
        }  
        else {  
            System.out.println("Person is eligible to vote!!");  
        }  
    }
    public static void main(String[] argv)
    {
        Solution obj = new Solution();
        
        System.out.println("1]");
        obj.division(12, 2);
        System.out.println();
        
        System.out.println("2]");
        obj.division(12, 0);
        System.out.println();
        
        System.out.print("3] ");
        obj.validate(19);
        System.out.println();

        System.out.print("4] ");
        obj.validate(15);
        System.out.println();
    }

}
