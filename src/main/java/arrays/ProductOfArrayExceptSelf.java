package arrays;

public class ProductOfArrayExceptSelf {

    public static int[] productOfArrayExceptSelf(int[] nums) {
        int[] answer = new int[nums.length];

        // prefix
        int pre = 1;
        for (int i=0; i<nums.length; i++) {
            answer[i] = pre;
            pre = pre * nums[i];
        }

        // postfix
        int post = 1;
        for (int i=nums.length - 1; i>=0; i--) {
            answer[i] = answer[i] * post;
            post = post * nums[i];
        }

        return answer;


    }

}
