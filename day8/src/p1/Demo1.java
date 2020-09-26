package p1;
class C{
	@Deprecated
	void m1(){
		System.out.println("class C - m1()");
	}
	void m2(){
		System.out.println("class C - m2()");
	}
}
class D extends C{
	
	void m2() {
		System.out.println("class D - m2()");
	}
}
public class Demo1 {

	public static void main(String[] args) {
		C c =new C();
		C d = new D();
		d.m2();
		c.m1();
	//	c.m2();
	}

}
