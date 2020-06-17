package kadai5;
import java.util.Scanner;

public class IntToEng {
	
	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        System.out.println(translateEng(input));
        
    }

    // 数値を英訳する変換するメソッド
    static String translateEng(int n) {
    	if(n==0) return "zero";
    	if(n==1) return "one";
    	if(n==2) return "two";
    	if(n==3) return "three";
    	if(n==4) return "four";
    	if(n==5) return "five";
    	if(n==6) return "six";
    	if(n==7) return "seven";
    	if(n==8) return "eight";
    	if(n==9) return "nine";
    	if(n==10) return "ten";
    	if(n==11) return "eleven";
    	if(n==12) return "twelve";
    	if(n>=13&&n<20) return teen(n);
    	if(n>=20)return twenty(n);
    	else return "";
    }

	private static String twenty(int n) {
		if(n==20) return "tewnty-one";
    	if(n==21) return "tewnty-one";
    	if(n==22) return "tewnty-two";
    	if(n==23) return "tewnty-three";
    	if(n==24) return "tewnty-four";
    	if(n==25) return "tewnty-five";
    	if(n==26) return "tewnty-six";
    	if(n==27) return "tewnty-seven";
    	if(n==28) return "tewnty-eight";
    	if(n==29) return "tewnty-nine";
    	
    	else return "";
	}

	private static String teen(int n) {
		if(n==13) return "thirteen";
    	if(n==14) return "fourteen";
    	if(n==15) return "fifteen";
    	if(n==16) return "sixteen";
    	if(n==17) return "seventeen";
    	if(n==18) return "eighteen";
    	if(n==19) return "nineteen";
    	else return "";
	}


}
