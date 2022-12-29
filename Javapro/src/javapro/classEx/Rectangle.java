package javapro.classEx;
//사각형 클래스
public class Rectangle {
	//필드
	private int width, height; //private = 캡슐화(접근 제한) 값을 변경 할 수 없게함.
	//생성자
	public Rectangle(int width, int height) throws Exception {
		if(width <= 0 || height <= 0) {
			throw new Exception("넓이와 높이는 플러스 값이어야 합니다.");
		}
		this.width = width;
		this.height = height;
	}
	//사각형 면적 메서드
	int getArea() {
		return width * height;
	}
	//getter
	int getWidth() {
		return width;
	}
	int getHeight() {
		return height;
	}

}
