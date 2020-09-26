package p1;

class A{
	void m1() {
		System.out.println("class A");
	}
}
class  B extends A{
	@Override
	void m1() {
		System.out.println("class B");
	}
}

public class Demo {

	public static void main(String[] args) {
		A a = new B();
		a.m1();

	}

}
