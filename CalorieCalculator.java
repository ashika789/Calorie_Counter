 
import java.util.*;
import java.lang.*;
import java.io.*;
 
/* Name of the class has to be "Main" only if the class is public. */
class CalorieCalculator{
 
public static final int AGE = 20;
public static final int FEMALE_HEIGHT = 64;
public static final int MALE_HEIGHT = 70;
public static final int LOW_WEIGHT = 100;
public static final int HIGH_WEIGHT = 250;
public static final int WEIGHT_INCREMENT = 10;
public static final double LIGHT_ACTIVITY_FACTOR = 1.375;
public static final double HEAVY_ACTIVITY_FACTOR = 1.725;
     public static void main(String []args){
        System.out.println("Daily Calorie Requirement for Women"); 
        System.out.println("Height: 64 in   Age: 20 years");
        System.out.println();
        System.out.println("Weight(lb)       Light Activity         Heavy Activity");
        System.out.println("------------      -------------        --------------");
        double calories = 0;
        for(int i = LOW_WEIGHT; i <= HIGH_WEIGHT; i = i + WEIGHT_INCREMENT)
        {
            System.out.print(i);
            System.out.printf("%4.0f",calculateFemaleCalories(AGE, FEMALE_HEIGHT, i, LIGHT_ACTIVITY_FACTOR));
            System.out.printf("%4.0f",calculateFemaleCalories(AGE, FEMALE_HEIGHT, i, HEAVY_ACTIVITY_FACTOR));
            System.out.println();
        }
//        System.out.println("Daily Calorie Requirement for Men");
//        System.out.println("Height: 70 in   Age: 20 years");
//        System.out.println();
//        System.out.println("Weight(lb)      Light Activity      Heavy Activity");
//        System.out.println("----------      -------------       --------------");
//        for(int i = LOW_WEIGHT; i <= HIGH_WEIGHT; i = i + WEIGHT_INCREMENT)
//        {
//            System.out.println(i + calculateMaleCalories(AGE, MALE_HEIGHT, i, LIGHT_ACTIVITY_FACTOR) + calculateMaleCalories(AGE, MALE_HEIGHT, i, HEAVY_ACTIVITY_FACTOR));
//        }
 
     }
 
  /*
   * Calculates daily calorie requirement for women
   * 
   * @param age age
   * @param height height in inches
   * @param weight weight in pounds
   * @param activityFactor activity level factor from Harris Benedict Formula
   * @return daily calorie requirement for women
   */   
  public static double calculateFemaleCalories(int age, int height, double weight, double activityFactor) {
    double bmr = 655 + ( 4.35 * weight) + ( 4.7 * height) - ( 4.7 * age);
    double calories = bmr * activityFactor;
    return calories;
  }
 
  /*
   * Calculates daily calorie requirement for men
   * 
   * @param age age
   * @param height height in inches
   * @param weight weight in pounds
   * @param activityFactor activity level factor from Harris Benedict Formula
   * @return daily calorie requirement for men
   */   
//  public static double calculateMaleCalories (int age, int height, double weight, double activityFactor) {
//    double bmr = 66 + ( 6.23 * weight) + ( 12.7 * height) - ( 6.8 * age);
//    double calories = bmr * activityFactor;
//    return calories;
//  }
}