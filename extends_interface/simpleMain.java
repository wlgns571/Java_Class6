package java_day20.extends_interface;

public class simpleMain {
	public static void main(String[] args) {
		Parent daddy = new Parent("민우", 32);
		
		System.out.println(daddy.getName());
		System.out.println(daddy.getAge());
		daddy.sayHello();
		System.out.println(daddy.toString());
		
		Child child = new Child("유진", 20);
		
		System.out.println(child.getAge());
		System.out.println(child.getName());
		child.sayHello();
		System.out.println(child.toString());
		
	}
}
