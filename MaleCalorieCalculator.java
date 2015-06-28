import java.util.*;
import java.lang.*;
import java.io.*; 

public class MaleCalorieCalculator {
	public static final int WEIGHT_INCREMENT = 5;
	public static final double VERY_LIGHT_ACTIVITY_FACTOR = 1.2;
	public static final double LIGHT_ACTIVITY_FACTOR = 1.375;
	public static final double MODERATE_ACTIVITY_FACTOR = 1.55;
	public static final double HEAVY_ACTIVITY_FACTOR = 1.725;
	public static final double VERY_HEAVY_ACTIVITY_FACTOR = 1.9;

	/*
	 * Calculates daily calorie requirement for women for very light activity
	 * 
	 * @param age age
	 * 
	 * @param height height in inches
	 * 
	 * @param weight weight in pounds
	 * 
	 * @param activityFactor activity level factor from Harris Benedict Formula
	 * 
	 * @return daily calorie requirement for women
	 */

	public static double calculateMaleCalories(int age, int height,
			double weight, double activityFactor) {
		double bmr = 66 + (6.23 * weight) + (12.7 * height) - (6.8* age);
		double calories = bmr * activityFactor;
		return calories;
	}

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.print("Enter your Height in inches: ");
		int Height = console.nextInt();
		System.out.print("Enter your age in years: ");
		int Age = console.nextInt();
		System.out.print("Enter your weight in pounds: ");
		int Weight = console.nextInt();

		System.out.println("Daily Calorie Requirement for Men");
		System.out.println("At the Height of: " + Height + "in.   ");
		System.out.print("At the Age of: " + Age + "years");
		System.out.println();
		System.out.println();
		System.out.printf("%10s", "Weight (lbs)");
		System.out.printf("%25s", "Very Light Activity");
		System.out.printf("%26s", "Light Activity");
		System.out.printf("%27s", "Moderate Activity");
		System.out.printf("%28s", "Heavy Activity");
		System.out.printf("%29s", "Very Heavy Activity");

		System.out.println();
		System.out.printf("%10s", "-----------");
		System.out.printf("%25s", "-----------");
		System.out.printf("%26s", "-----------");
		System.out.printf("%27s", "-----------");
		System.out.printf("%28s", "-----------");
		System.out.printf("%29s", "-----------");
		System.out.println();

		
		int low_weight = Weight - 10;
		int high_weight = Weight + 10;

		for (int i = low_weight; i <= high_weight; i = i + WEIGHT_INCREMENT) {
			//System.out.printf("%10s", calculateFemaleCalories(Age, Height, i, VERY_LIGHT_ACTIVITY_FACTOR));
			System.out.printf("%10s", i);
			System.out.printf("%25s", calculateMaleCalories(Age, Height, i, VERY_LIGHT_ACTIVITY_FACTOR));
			System.out.printf("%26s", calculateMaleCalories(Age, Height, i, LIGHT_ACTIVITY_FACTOR));
			System.out.printf("%27s", calculateMaleCalories(Age, Height, i, MODERATE_ACTIVITY_FACTOR));
			System.out.printf("%28s", calculateMaleCalories(Age, Height, i, HEAVY_ACTIVITY_FACTOR));
			System.out.printf("%29s", calculateMaleCalories(Age, Height, i, VERY_HEAVY_ACTIVITY_FACTOR));
			System.out.println();
			
		}
		
		

	}
}
