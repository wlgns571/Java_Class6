package java_day20.extends_interface;

public class Child extends Parent {

	public Child(String name, int age) {
		// super()는 부모 클래스의 생성자
		super(name, age);
	}
	
	// 부모가 가진 메소드를 그냥 사용할 수 있지만,
	// 재정의(Override)해서 사용 할 수 있다.
	// 입맛에 맞게 커스텀(수정, 추가)
	@Override
	public void sayHello() {
		System.out.println("응애, 나 애기 생성자");
	}

	@Override
	public String toString() {
		// super는 부모클래스를 의미하며 .을 찍으면
		// public인 필드 변수나 메소드를 사용 할 수 있다.
		return super.toString();
	}
}
