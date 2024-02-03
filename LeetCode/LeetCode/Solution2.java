package LeetCode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Solution2
{
    static void work(int sum, ArrayList<Integer> nums, List<Integer> ele, List<List<Integer>> ans
            , int target, HashSet<HashSet<Integer>> memo1, HashSet<List<Integer>> memo2)
    {
        if(memo2.contains(nums))
            return;

        if(ele.size()>4)
        {
            //System.out.println("more than 4 elements in element");
            return;
        }
        if(sum==target && ele.size()==4)
        {
            HashSet<Integer> unique_set=new HashSet<>(ele);
            if(!memo1.contains(unique_set))
            {
                ans.add(ele);
                memo1.add(unique_set);
                memo2.add(nums);
            }
            return;
        }

        for (int i=0;i<=nums.size()-1;i++)
        {
            if(sum==Integer.MIN_VALUE)
                sum=0;
            ArrayList<Integer> temp_nums=new ArrayList<>(nums);
            ArrayList<Integer> temp_ele=new ArrayList<>(ele);
            temp_nums.remove(i);
            temp_ele.add(nums.get(i));

            //System.out.println(i+"  "+temp_nums+"  "+temp_ele);
            work(sum+nums.get(i),temp_nums,temp_ele,ans,target,memo1,memo2);
        }
        memo2.add(nums);
    }
    public static List<List<Integer>> fourSum(int[] nums, int target)
    {
        ArrayList<Integer> nums_list=new ArrayList<>();
        for(int ele:nums)
            nums_list.add(ele);

        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> ele=new ArrayList<>();
        HashSet<HashSet<Integer>> memo1=new HashSet<>();
        HashSet<List<Integer>> memo2=new HashSet<>();
        work(Integer.MIN_VALUE,nums_list,ele,ans,target,memo1,memo2);

        return ans;
    }

    public static void main(String[] args)
    {
        int[] nums={-493,-482,-482,-456,-427,-405,-392,-385,-351,-269,-259,-251,-235,-235,-202,-201,-194,-189,-187,-186,-180,-177,-175,-156,-150,-147,-140,-122,-112,-112,-105,-98,-49,-38,-35,-34,-18,20,52,53,57,76,124,126,128,132,142,147,157,180,207,227,274,296,311,334,336,337,339,349,354,363,372,378,383,413,431,471,474,481,492};

        System.out.println(fourSum(nums,6189));
    }
}
