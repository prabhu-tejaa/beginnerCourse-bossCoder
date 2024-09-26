package basicsOfProgramming;

import java.util.*;
public class areaOfCircle {
    public static void main(String[] args){
        int radius = 2;
        int squaredRadius = radius * radius;
        double pi = 22.0 / 7;
        double area = pi * squaredRadius;
        System.out.println("Area of circle is: " + area);

        // taking input from the users

        Scanner inputFromUser = new Scanner(System.in);
        System.out.print("Enter the value to get  the area of the circle: ");
        int inputRadius = inputFromUser.nextInt();
        int squaredInputRadius = inputRadius * inputRadius;
        double totalAreaGivenByTheUser = pi * squaredInputRadius;
        System.out.print("The area of the circle given by the user is: " + totalAreaGivenByTheUser);
    }
}
