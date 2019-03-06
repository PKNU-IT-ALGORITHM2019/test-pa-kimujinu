
public class JavaTest {

	public static void main(String[] args) {
		String a = "git Test";
		int i = 20;
		int x = 30;
		int y = 50;
		i = i + 1;
		i += 1;
		System.out.println("현재 i는 " + i + "입니다.");
		System.out.println("현재 i는 " + ++i + "입니다.");
		System.out.println("현재 i는 " + i++ + "입니다.");
		
		///////////////////////////////////////전위후위연산자
		
		if(a.contains("Test")) {
			System.out.println("잘하네");	//위문자를 포함하는경우
		}else {
			System.out.print("머하노");    //포함하지 않는 경우
		}
		/////////////////////////////조건문
		System.out.println("최대값은" + max(x,y) + "입니다.");
		////////////////////////////삼항연산자
		
		double d = Math.pow(3.0, 20.0);
		System.out.println("3의20제곱은" + (int)d + "입니다"  );
		//////////////////pow함수 
	}
	
	static int max(int a,int b) {
		int result = (a > b) ? a : b;
		return result;
	}

}
