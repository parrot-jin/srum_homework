package first;
public class Fibonacci {
	public static long of(int n){
		 if (n < 1) {
	            return -1;
	        }
	        if (n ==1 || n == 2) {
	            return 1;
	        }

	        long a =1l, b= 1l, c =0l;		//��������long��������
	        for (int i = 0; i < n - 2; i++) {
	            c = a + b;			//��3������ֵ����ǰ�������ĺ�
	            a = b;			//��2������ֵ��ֵ����1����
	            b = c;			//��3������ֵ��ֵ����2����
	        }
	        return c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    for(int i=1;i<=200;i++) {
    	System.out.println("Fibonacci.of("+i+")=="+of(i));
    }
	}

}
