package com.neuedu.test.chapter2;

public class Practice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 987;
		
		//�ȳ���ģ a/λ%10
		int qianwei = a/1000;
		int baiwei = a/100%10;
		int shiwei = a/10%10;
		int gewei = a%10;
		
		int sum = qianwei + baiwei + shiwei + gewei;
		
		System.out.append(a + "�ĸ�λ֮��=" + sum);
		
		

	}

}
