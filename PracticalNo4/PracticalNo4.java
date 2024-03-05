public class PracticalNo4 
{
    
      public static void printName(String fullName) 
    {
        
        fullName = fullName.trim();
        
        String[] parts = fullName.split("\\s+");
        
        if (parts.length != 2) 
        {
            System.out.println("Invalid name format");
            return;
        }
        
        String firstName = parts[0];
        String lastName = parts[1];
        
        String formattedName = lastName + "," + firstName;
        System.out.println("Formatted Name: " + formattedName);
    }
    
    public static void main(String[] args) 
    {
        printName("   Bill    Joy   ");
        printName("   Abhishek    Barai   ");

    }
}
