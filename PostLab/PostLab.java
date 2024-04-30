import java.util.Arrays;

public class PostLab 
{
    public static void main(String[] args) 
    {
        String fullName = "Abhishek Barai";
        System.out.println("Full Name:- " + fullName);
        printName(fullName);
    }

    public static void printName(String fullName) 
    {
        fullName = fullName.trim();
        String[] nameParts = fullName.split(" ");

        Arrays.stream(nameParts)
                .reduce((first, second) -> second)
                .ifPresent(lastName -> Arrays.stream(nameParts)
                        .findFirst()
                        .ifPresent(firstName -> System.out.println("Formatted name: " + lastName + "," + firstName)));
    }
}
