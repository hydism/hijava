package hijava.practice2;

public class Arr {

	public static void main(String[] args) {
//		ex1();
//		System.out.println();
//		ex2();
//		System.out.println();
//		System.out.println();
//		ex3();
		ex4();
	}


	private static void ex1() {
		int[] nums = new int[100];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = i + 1;
		}
		printArray(nums);
	}

	private static void ex2() {
		String[] strs = new String[100];
		for (int i = 0; i < strs.length; i++) {
			strs[i] = "str" + (i + 1);
		}
		printArray(strs);
	}

	public static void ex3() {
		Man[] manAry = new Man[9];
		for (int i = 0; i < manAry.length; i++) {
			Man m = new Man("김" + (i + 1) + "수"); //객체 선언하고 
			manAry[i] = m; //정보넣음
		}
		printArray(manAry);
	}

	private static void ex4() {
		Man[] manAry1 = new Man[9];
		for (int i = 0; i < manAry1.length; i++) {
			Man m = new Man("김" + (i + 1) + "수"); //객체 선언하고 
			manAry1[i] = m; //정보넣음
		}
		Man[] manAry2 = new Man[9];
		for(int i = 0; i < manAry2.length; i++) {
//			manAry2[i] = manAry1[i]; 								  //shallow copy
			manAry2[i] = new Man(manAry1[i].getName()); 		      //deep copy1
			
			//System.arraycopy(from, startIDX1, to, startIDX2, count); 함수사용
			//from:이배열의 startIDX1번째 정보부터 복사해서, to:이배열의 startIDX2번째 정보부터 count만큼 복사함.
//			System.arraycopy(manAry1, 0, manAry2, 0, manAry1.length); 
		}
//		printArray(manAry2);
		manAry1[0].setName("김123123수");
		System.out.println(manAry1[0] + " : " + manAry2[0]);
	}
	
	//--------------printArray--------------------------------
	private static void printArray(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			if (i % 10 == 0) {
				System.out.println();
			}
			System.out.print(nums[i] + " ");
		}
	}

	private static void printArray(String[] strs) {
		for (int i = 0; i < strs.length; i++) {
			if (i % 10 == 0) {
				System.out.println();
			}
			System.out.print(strs[i] + " ");
		}
	}

	private static void printArray(Man[] manAry) {
		for (Man man : manAry) {
			System.out.println(man);
		}
	}
}