/*Aim:PracticalNo3
author:Abhishek Barai
version:3.0
date:13/02/2024
*/

class VolumeCalculator 
    {
    
    public Double calculateVolume(Double side) 
    {
        return side * side * side;
    }

   
    public Double calculateVolume(Double radius, Double height) 
    {
        return Math.PI * radius * radius * height;
    }

  
    public Double calculateVolume(Double length, Double width, Double height) 
    {
        return length * width * height;
    }
}

public class PracticalNo3
{
        public static void main(String[] args) 
     {
        VolumeCalculator calculator = new VolumeCalculator();

        
        double cubeVolume = calculator.calculateVolume(9.0);
        System.out.println("Volume of cube: " + cubeVolume);

        
        Double cylinderVolume = calculator.calculateVolume(4.0, 9.0);
        System.out.println("Volume of cylinder: " + cylinderVolume);

        
        Double boxVolume = calculator.calculateVolume(5.0, 6.0, 2.0);
        System.out.println("Volume of box: " + boxVolume);
     }
} 
