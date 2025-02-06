package stringQuestionForPlacement;

public class PremutationAandCombinations {
	public static void main(String[] args) {
		String word = "ABC";
        System.out.println("Permutations of " + word + ":");
        findPermutations("", word);
    }

    private static void findPermutations(String prefix, String remaining) {
        if (remaining.length() == 0) {
            System.out.println(prefix);
        }
        
        for (int i = 0; i < remaining.length(); i++) {
            String newPrefix = "";
            for (int j = 0; j < prefix.length(); j++) {
                newPrefix += prefix.charAt(j);
            }
            newPrefix += remaining.charAt(i);
            
            String newRemaining = "";
            for (int j = 0; j < remaining.length(); j++) {
                if (j != i) {
                    newRemaining += remaining.charAt(j);
                }
            }
            
            findPermutations(newPrefix, newRemaining);
        }
	}
}
