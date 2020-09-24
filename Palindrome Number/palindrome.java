class Solution {
    public boolean isPalindrome(int x) {
        if(x == 0){
            return true;
        }
        else if(x < 0 || x % 10 ==0){
            return false;
        }
        
        int reverse_integer = 0;
        while(x > reverse_integer){
            int pop = x % 10;
            x = x / 10;
            reverse_integer = (reverse_integer * 10) + pop;
        }
        if(x == reverse_integer || x == reverse_integer / 10){
            return true;
        }
        else{
            return false;
        }
    }
}