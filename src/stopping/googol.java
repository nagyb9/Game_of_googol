package stopping;

import java.util.Iterator;

public class googol {
	
	public static double[] generate_random_array() {
		double numbers[] = new double[10];
		for (int i=0;i<numbers.length; i++) {
			numbers[i] = Math.random()* 10000000;
			//System.out.println(Math.round(numbers[i]));
		}
		return numbers;
	}
	
	public static double my_value_in_array(double[] numbers, double max) {
		double current = 0;
		for(int i = 0; i < 3; i++) {
			if (numbers[i] > max) {
				max = numbers[i];
			}
		}
		
		for (int i = 3; i < numbers.length; i++) {
			current = numbers[i];
			if(current > max) {
				break;
			}
		}
		return current;
	}
	
	public static double check_true_max(double[] numbers, double true_max) {
		
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > true_max) {
				true_max = numbers[i];
			}
		}
		return true_max;
	}

	public static void main(String[] args) {
		
		//Game of googol. We have a list of random numbers. We want to turn them over 1 by 1 and stop at the biggest possible number.
		//Optimal stopping theory
		double number_of_wins = 0;
		for (int i = 0; i < 1000000; i++) {
			double[] numbers = generate_random_array();
			double my_max = my_value_in_array(numbers, 0);
			double true_max = check_true_max(numbers, 0);
			
			if(my_max == true_max) {
				number_of_wins++;
			}
			//System.out.println("The true max was: " + true_max);
			//System.out.println("I chose: " + my_max);
		}
		double winrate = number_of_wins/1000000;
		System.out.print("My winrate is: " + winrate);
		
		
		
		

		
		
		
		
	}
	
	

}
