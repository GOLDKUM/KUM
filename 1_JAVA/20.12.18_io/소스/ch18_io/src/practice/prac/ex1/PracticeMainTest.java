//2020/12/18/Kyoung-yong,Kum
package practice.prac.ex1;

public class PracticeMainTest {
	public static void main(String[] args) {
		Product product = new Product();
		
		//문법으로 출력 
		product.kum();
		product.kyoung();
		product.yong();
		printCh();	
		System.out.println("");
		System.out.println("=====================");
		printCh("-");
		System.out.println("=====================");
		printCh("행복",30);
		System.out.println("set 한번해보자~~");
		product.setName("금경용");
		product.setPrice("3000만원");
		product.setPs("2개다");
		System.out.println(product.getName());
		System.out.println(product.getPrice());
		System.out.println(product.getPs());
		
	}
	private static void printCh() {
		for(int cnt=1 ;cnt <=20 ; cnt++) {
			System.out.print("!");
		}
		
	}
	private static void printCh(String ch) {
		for(int cnt =1;cnt<=20;cnt++) {
			System.out.print(ch);
		}
	}
	private static void printCh(String w, int count) {
		for(int idx=1 ; idx<=count ; idx++) {
			System.out.print(w);
		}
	}
	
}
