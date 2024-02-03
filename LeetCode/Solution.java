import java.util.ArrayList;
import java.util.HashMap ;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
class Solution 
{
    public static boolean isAnagram(String s, String t) {
        Map<Character, Integer> count = new HashMap<>();
        
        // Count the frequency of characters in string s
        for (char x : s.toCharArray()) {
            count.put(x, count.getOrDefault(x, 0) + 1);
        }
        
        // Decrement the frequency of characters in string t
        for (char x : t.toCharArray()) {
            count.put(x, count.getOrDefault(x, 0) - 1);
        }
        
        // Check if any character has non-zero frequency
        for (int val : count.values()) {
            if (val != 0) {
                return false;
            }
        }
        
        return true;
    }
    public static List<Set<String>> groupAnagrams(String[] strs) 
    {
        List<Set<String>> ans= new ArrayList<>();

        for(int i=0; i<=strs.length-1; i++)
        {
            List<String> element_ans= new ArrayList<>();
            element_ans.add(strs[i]);
            for(int j=0; j<=strs.length-1; j++)
            {
                if(i==j)
                    continue;

                if(isAnagram(strs[i], strs[j]))
                    element_ans.add(strs[j]);
            }
            HashSet<String> element_ans_set= new HashSet<>(element_ans);
            if(!ans.contains(element_ans_set))
                ans.add(element_ans_set);
        }

        return ans;
    }

    public static void main(String[] args) 
    {
        String[] strs= {"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(strs));
        
    }
}