package com.evan;

public class TwoNumSum {

    public static void main(String[] args) {
       int[] nums = new int[]{2,7,11,15};
       int [] result= sumTwoNums(9,nums);
        assert result != null;
        for( int i: result){
           System.out.println(i);
        }
    }

    private static int[] sumTwoNums(int target, int[] nums){

        for(int i=0;i<=nums.length-1;i++){

            int num1 = nums[i];
            for (int j=i+1;j<= nums.length-1;j++){
                int num2 = nums[j];
                if((num1+num2)==target){
                    return new int[]{i,j};
                }
            }

        }

        return null;
    }

}
