package pekan3_2511532003;

public class stackArray_2511532003 {
	static final int MAX = 1000;
	int top_2003;
	int a[] = new int [MAX];
	boolean isEmpty ()
	{
		return (top_2003 < 0 );
	}
	stackArray_2511532003()
	{
		top_2003 = -1;
	}
	boolean push (int x)
	{
		if (top_2003 >= (MAX - 1)) {
			System.out.println("stack overflow");
			return false;
		}
		else {
			a[++top_2003] = x;
			System.out.println (x + " dimasukan dalam stack");
			return true;
		}
	}
	int pop() {
		if(top_2003 < 0) {
			System.out.println("stack underflow");
			return 0;
		}
		else {
			int x = a [top_2003--];
			return x;
		}
	}
	int peek ()
	{
		if (top_2003 < 0) {
			System.out.println("stack underflow");
			return 0;
		}
		else {
			int x = a[top_2003];
			return x;
			
		}
	}
	void print () {
		for (int i = top_2003; i>-1;i--) {
		System.out.print(" " + a [i]);
		
		}
	}
}