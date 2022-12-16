package javapro.variable;

public class VariableEx03 {

	public static void main(String[] args) {
		int x = 50;
		int y = 30;
		int temp ;
		temp = x;
		x=y;
		y=temp;
		System.out.println("x의 값 : " + x);
		System.out.println("y의 값 : " + y);

	}

}
