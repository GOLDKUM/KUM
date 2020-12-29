package com.lec.ex13final;

public class TestMain {
	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.running();
		animal.running();
		animal.stop();
		
		Dog dog = new Dog();
		dog.running();
		dog.method();
		Animal dog2 = new Dog();
		dog2.running(); dog.stop();
//		dog2.method(); 
//		Animal 에는 method가 없기 떄문에 가능하지 않음 
		Rabbit rabbit = new Rabbit();
		rabbit.running();
		rabbit.stop();
		//Object dog3 = new Dog();
		//dog.stop(); Object 이건 가능할 수 없음
	}

}
