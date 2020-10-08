package edu.Rustamas.SDA.one;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double[] listOfBmi = new double[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("18.-20.");
            Scanner sc = new Scanner(System.in);
            System.out.print("Input your weight in kilogram (from 1 kg to 250 Kg): ");
            double weight = sc.nextDouble();
            while (weight < 1 || weight > 250) {
                System.out.print("\nERROR. Please input correct weight (from 1 kg to 250 Kg): ");
                weight = sc.nextDouble();
            }
            System.out.print("\nInput your height in meters (from 0,30 m to 2,50 m): ");
            double height = sc.nextDouble();
            while (height < 0.30 || height > 2.50) {
                System.out.print("\nERROR. Please input correct height (from 0,30 m to 2,50 m): ");
                height = sc.nextDouble();
            }
            double BMI = weight / (height * height);
            listOfBmi[i] = BMI;
            System.out.print("\nThe Body Mass Index (BMI) is " + BMI + " kg/m2\n");
            if (BMI < 18.5) {
                System.out.println("You are underweight");
            } else if (BMI < 25) {
                System.out.println("You are normal");
            } else if (BMI < 30) {
                System.out.println("You are overweight");
            } else {
                System.out.println("You are obese");
            }
        }
        System.out.println("List of BMI contains values");
        for (int e = 0; e < listOfBmi.length; e++) {
            System.out.println(listOfBmi[e]);
        }

        //20.1
        double minValue = listOfBmi[0];
        for (int i = 0; i < listOfBmi.length; i++) {
            if (listOfBmi[i] > minValue) {
                minValue = listOfBmi[i];
            }
        }
        System.out.println("Min value in list: " + Arrays.stream(listOfBmi).min());

        //20.2
        double maxValue = listOfBmi[0];
        for (int i = 0; i < listOfBmi.length; i++) {
            if (listOfBmi[i] > maxValue) {
                maxValue = listOfBmi[i];
            }
        }
        System.out.println("Max value in list: " + Arrays.stream(listOfBmi).max());

        //20.3
        double sumOfArrayValues = 0;
        for (int i = 0; i < listOfBmi.length; i++) {
            sumOfArrayValues = sumOfArrayValues + listOfBmi[i];
        }
        double average = sumOfArrayValues / listOfBmi.length;
        System.out.println("Average value of the list is: " + average);
    }
}
















