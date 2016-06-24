package piaordu;

import java.util.Scanner;

/**
 * 要注意考虑各种情况！
 * @author piaordu
 *
 */
public class P8StringToInteger {
	public int myAtoi(String str) {
		int result = 0;
		//1.null or empty
		if(str == null || str.length() == 0) {
			return 0;
		}
		
		//2.handle the whitespaces
		str = str.trim();
		
		//3.+ - sign
		boolean sign = true;
		int i = 0;
		if(str.charAt(i) == '+') {
			i++;
		} else if(str.charAt(i) == '-') {
			sign = false;
			i++;
		}
		
		//4.deal with numbers
		long temp = 0;
		int strLength = str.length();
		for(; i < strLength; i++) {
			//5.handle number 0~9
			int digit = str.charAt(i) - '0';
			if(digit < 0 || digit > 9) {
				break;
			}
			
			temp = 10 * temp + digit;
			
			//6.handle out of border(min & max)
			if(sign) {
				if(temp > Integer.MAX_VALUE) {
					return Integer.MAX_VALUE;
				}
			} else {
				if(- temp < Integer.MIN_VALUE) {
					return Integer.MIN_VALUE;
				}
			}
		}
		
		if(sign) {
			result = (int)temp;
		} else {
			result = -(int)temp;
		}
		
		return result;
    }
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		P8StringToInteger test = new P8StringToInteger();
		System.out.println(test.myAtoi(s));
	}
}
