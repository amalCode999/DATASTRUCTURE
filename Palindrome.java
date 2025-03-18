public class Palindrome {
    public static void main(String[] args) {
      System.out.println("Hello World");
      boolean a = checkIfPalindrome("MALAM");
      System.out.println(a);
      System.out.println(fibonaci(3));
      int[] angka = {1,2,4,6,8,9,14,15};
      boolean b = checkForTarget(angka, 13);
      System.out.println(b);

    }

    public static int fibonaci(int n) {
        int p1 = 1;
        int p2 = 0;
        for(int  i = 0 ;i<n;i++){
            p2 = p1;
            p1 = p2 + p1;
        }
        return p2;
    }

    public static boolean checkIfPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
    
        while (left < right) {
            System.out.println(s.charAt(left) + " and " + s.charAt(right));
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
    
            left++;
            right--;
        }
        System.out.println(left);
        System.out.println(right);
    
        return true;
    }

    public static boolean checkForTarget(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
    
        while (left < right) {
            // curr is the current sum
            int curr = nums[left] + nums[right];
            if (curr == target) {
                System.out.println(nums[left] + " & " + nums[right] + " = " + curr);
                return true;
            }
    
            if (curr > target) {
                right--;
            } else {
                left++;
            }
        }
    
        return false;
    }
  
}