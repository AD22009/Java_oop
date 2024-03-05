// Parent class
class Emerging_Technologie 
{
    void forum() 
    {
        System.out.println("Forum: General Emerging Technologies Forum");
    }
}

// Child class 1
class AIML extends Emerging_Technologie 
{
    @Override
    void forum() 
    {
        System.out.println("Forum President: Abhishek Barai");
        System.out.println("Forum Vice President: Sarthak Bawankule");
        System.out.println("Forum Secretary: Kunal Bhelwa");
        System.out.println("Forum Treasurer: Devang Chopkar");
        System.out.println("Event Head: Nupur Kuhite");
    }
}

// Child class 2
class AIDS extends Emerging_Technologie 
{
    @Override
    void forum() {
        System.out.println("Forum President: Abhishek Barai");
        System.out.println("Forum Vice President: Mayank Hirekhan");
        System.out.println("Forum Secretary: Harsh Meshram");
        System.out.println("Forum Treasurer: Himanshu Talekar");
        System.out.println("Event Head: Kartik kukde");
    }
}

// Child class 3
class CoreTeam extends Emerging_Technologie 
{
    @Override
    void forum() {
        System.out.println("Forum President:Himanshi Kawle");
        System.out.println("Forum Vice President: Himanshu Srivastva");
        System.out.println("Forum Secretary: Mahevish Khan");
        System.out.println("Forum Treasurer: Shreyash Iyer");
        System.out.println("Event Head: Kartik Chopkar");
    }
}

public class PracticalNo5 
{
    public static void main(String[] args) 
    {
        AIML aimlForum = new AIML();
        AIDS aidsForum = new AIDS();
        CoreTeam CoreTeamForum = new CoreTeam();

        System.out.println("AIML Forum Details:");
        aimlForum.forum();
        System.out.println();

        System.out.println("AIDS Forum Details:");
        aidsForum.forum();
        System.out.println();

        System.out.println("CoreTeam Forum Details:");
        CoreTeamForum.forum();
    }
}