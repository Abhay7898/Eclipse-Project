package patternPrograms;

public class Pattern30 {
	public static void main(String[] args) {
        int k = 1;
        for (int i = 1; i <= 4; i++) {
            for (int j = i; j <= 3; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(k++);
                System.out.print(" ");
            }
            System.out.println("");

        }
        int value = 1;
        for (int i = 1; i <= 5; i++) 
        {
            for (int j = 1; j <= i; j++) 
            {
                System.out.print(value+"     ");
                 
                value++;
            }
             
            System.out.println();
        }
    }
}
