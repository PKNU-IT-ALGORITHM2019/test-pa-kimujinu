
public class JavaTest {

	public static void main(String[] args) {
		String a = "git Test";
		int i = 20;
		int x = 30;
		int y = 50;
		i = i + 1;
		i += 1;
		System.out.println("���� i�� " + i + "�Դϴ�.");
		System.out.println("���� i�� " + ++i + "�Դϴ�.");
		System.out.println("���� i�� " + i++ + "�Դϴ�.");
		
		///////////////////////////////////////��������������
		
		if(a.contains("Test")) {
			System.out.println("���ϳ�");	//�����ڸ� �����ϴ°��
		}else {
			System.out.print("���ϳ�");    //�������� �ʴ� ���
		}
		/////////////////////////////���ǹ�
		System.out.println("�ִ밪��" + max(x,y) + "�Դϴ�.");
		////////////////////////////���׿�����
		
		double d = Math.pow(3.0, 20.0);
		System.out.println("3��20������" + (int)d + "�Դϴ�"  );
		//////////////////pow�Լ� 
	}
	
	static int max(int a,int b) {
		int result = (a > b) ? a : b;
		return result;
	}

}
