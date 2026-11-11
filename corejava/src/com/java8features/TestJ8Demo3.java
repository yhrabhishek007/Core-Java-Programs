package com.java8features;

interface In3 {
	void hello(String name);
}

public class TestJ8Demo3 {

	public static void main(String[] args) {

		In3 i = (str) -> {
			System.out.println("Hello Mr/Mrs : " + str);
		};
		i.hello("Abhi");
	}

}
