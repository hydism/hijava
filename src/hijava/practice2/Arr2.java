package hijava.practice2;

public class Arr2 {
	final static int upperStart = 65;	//(char)65 = 'A'
	final static int lowerStart = 97;	//(char)97 = 'a'
	
	public static void main(String[] args) {
		ex6();
	}

	private static void ex6() {
		char[][] arr = new char[2][26];
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 26; j++) {
				if(i == 0)
					arr[i][j] = (char)(j + upperStart);
				if(i == 1)
					arr[i][j] = (char)(j + lowerStart);
			}
		}
		
		for(int i = 0; i < 2; i++) {
			if(i == 1) {
				System.out.println();
			}
			for(int j = 0; j < 26; j++) {
				System.out.print(arr[i][j] + " ");
			}
		}
	}
}
