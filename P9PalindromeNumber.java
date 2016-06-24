package piaordu;

public class P9PalindromeNumber {
	public boolean isPalindrome(int x) {
        //����Ӧ�ò�Ϊ������
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
        	
        	//ȥ���λ
        	x %= signal;
        	
        	//ȥ��λ
        	x /= 10;
        	
        	//��Ϊȥ������λ������signalҪ��ȥ100
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
