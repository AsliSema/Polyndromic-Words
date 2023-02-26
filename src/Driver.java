import java.util.Scanner;

public class Driver {
	
	static boolean isPolyndrome(String word) {
		String reversedWord="";
		for(int i = word.length()-1; i>=0;i--) {
			reversedWord = reversedWord + word.charAt(i);
		}
		
//		System.out.println(reversedWord);
//		System.out.println(word);
		
		if(reversedWord.equals(word)) {
			return true;
		}else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter a word: ");
		String newWord = scanner.nextLine();
		
		System.out.println(isPolyndrome(newWord));
		
	}
}
