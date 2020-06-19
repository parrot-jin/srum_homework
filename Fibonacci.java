package first;
public class Fibonacci {
	public static long of(int n){
		 if (n < 1) {
	            return -1;
	        }
	        if (n ==1 || n == 2) {
	            return 1;
	        }

	        long a =1l, b= 1l, c =0l;		//定义三个long类型整数
	        for (int i = 0; i < n - 2; i++) {
	            c = a + b;			//第3个数的值等于前两个数的和
	            a = b;			//第2个数的值赋值给第1个数
	            b = c;			//第3个数的值赋值给第2个数
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
