package integerProgram;

public class Swping {
	public static void main(String[] args) {
		int i=20;
		int j=-30;
		j=j+i;
		i=j-i;
		j=j-i;
		System.out.println(i);
		System.out.println(j);
	}
}
