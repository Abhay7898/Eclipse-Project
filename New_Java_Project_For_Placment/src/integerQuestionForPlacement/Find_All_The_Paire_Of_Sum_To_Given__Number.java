package integerQuestionForPlacement;

public class Find_All_The_Paire_Of_Sum_To_Given__Number {
	//sum=10
	public static void main(String[] args) {
		int[] given = {4, 6, 5, -10, 8, 5, 20};
		for(int i=0;i<given.length;i++) {
			for (int j = 1; j < given.length; j++) {
				if(given[i]+given[j]==10) {
				System.out.println(given[i]+"+"+ given[j] + "= 10");
				}
			}
		}
	}
}
