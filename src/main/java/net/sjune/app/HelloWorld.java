package net.sjune.app;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println(new HelloWorld().greeting());
	}

	public String greeting() {
		return "Hello world!";
	}
}
