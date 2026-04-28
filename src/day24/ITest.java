package day24;

public interface ITest {
	//both the variables are same by default it is publis static finl
public static final int num1=20;
int num2=30;
//by default abstract and public

void hello();
public abstract void bye();
//jdk 8

default void print() {
	System.out.println("Hello");
}

static void getData() {
	System.out.println("Data");
}

public static void main(String args[]) {
	System.out.println("main");
}
}
