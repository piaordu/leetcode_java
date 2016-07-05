package piaordu;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class P3LongestSubstringWithoutRepeatingCharacters {
	public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        Set<Character> set = new HashSet<>();
        int ans = 0, i = 0, j = 0;
        while (i < n && j < n) {
            // try to extend the range [i, j]
            if (!set.contains(s.charAt(j))){
                set.add(s.charAt(j));
                j++;
                ans = Math.max(ans, j - i);
            }
            else {
                set.remove(s.charAt(i));
                i++;
            }
        }
        return ans;
    }
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		P3LongestSubstringWithoutRepeatingCharacters test = new P3LongestSubstringWithoutRepeatingCharacters();
		while(sc.hasNext()) {
			String s = sc.nextLine();
			int len = test.lengthOfLongestSubstring(s);
			System.out.println(len);
		}
	}
}
