package _tp01;

public class PrintArgs {
	public static void main(String[] args) {
		/* Exercice 2.1
		System.out.println(args[0]);
		*/
		
		/* Exercice 2.2
		for(int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
		*/
		
		// Exercice 2.3
		for(var element : args) {
			System.out.println(element);
		}
	}
}
