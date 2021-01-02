package com.lex.ex;

// 다차원 배열!
public class Ex04 {
	public static void main(String[] args) {
		int[][] test = {{10,20,30},
				        {40,50,60}};
		test[0][2] = 300;
		System.out.println(test[0][2]);
		for(int i =0 ; i<test.length; i++) 
			for(int j=0 ; j<3 ; j++) {    
				System.out.printf("test[%d][%d]=%d\n",
						  i,  j,   test[i][j]);
				
				
			}
			
		}//main
		
	}//class

//행2 
//열 3
//test. length 방의 개수이지만 {{10,20,30},{40,50,60}};
//test의 큰틀로 보면 방의 갯수는 2개이지만   방하나에 분활로 보면 방의 i(임의의 값)3개 j(임의의값)3개가 있음 
