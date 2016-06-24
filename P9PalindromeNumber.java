package piaordu;

public class P9PalindromeNumber {
	public boolean isPalindrome(int x) {
        //负数应该不为回文数
        if (x < 0) {
        	return false;
        }
        
        int len = getLength(x);
        
        int signal = (int)Math.pow(10, len - 1);
        
        while (x != 0) {
        	int head = x / signal;
        	int tail = x % 10;
        	
        	if (head != tail) {
        		return false;
        	}
        	
        	//去最高位
        	x %= signal;
        	
        	//去个位
        	x /= 10;
        	
        	//因为去掉了两位，所以signal要除去100
        	signal /= 100;
        }
        return true;
    }
	
	public static int getLength(int x) {
		int len = 0;
        while(x != 0) {
        	x /= 10;
        	len++;
        }
        
        return len;
	}
	
	public static void main(String[] args) {
		int number = 123;
		P9PalindromeNumber test = new P9PalindromeNumber();
		System.out.println(test.isPalindrome(number));
	}
}
