/*
Aim: Practical No.1
Author: Abhishek Barai
Version: 1.9
Date: 30 Jan,2024
*/
class PracticalNo1 {
    public static void main(String[] argv) {
        CompanyData SBJIT = new CompanyData("Abhishek Barai", 19, "Male", 9);
        SBJIT.display();
    }
}

class CompanyData {
    String name;
    int age;
    String gender;
    int empid;

    CompanyData() {
        System.out.println("Inside Default Constructor");
    }

    CompanyData(String name, int age, String gender, int empid) {
        System.out.println("Inside Parameterized Constructor");
        this.name = name;
        this.age = age;
        this.gender = gender; 
        this.empid = empid;
    }

    public void display() {
        System.out.println("Name -" + this.name + " Age -" + this.age + " Gender -" + this.gender + " Emp ID-" + this.empid);  
    }
}