package cast;

public class Primitives {
	public static void dumpMaxValues() {
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Short.MAX_VALUE);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Long.MAX_VALUE);
		System.out.println(Float.MAX_VALUE);
		System.out.println(Double.MAX_VALUE);
	}
	
	public static void main(String[] args) {
		Primitives.dumpMaxValues();
		
		// long to int.
				long l= Long.MAX_VALUE;
				int i= (int)l;
				System.out.println("long to int: "+ l+ ", "+ i);
		
		// long to int.
				long ll= Long.MAX_VALUE - 5;
				int ii= (int)ll;
				System.out.println("long to int: "+ ll+ ", "+ ii);
		
		//int to long
				int iii = Integer.MAX_VALUE;
				long lll = (long)iii;
				System.out.println("int to long: " +iii +", " + lll);
		
		// byte to double.
				byte b= 100;
				double d= (double)b;
				System.out.println("byte to double: "+ b+ ", "+ d);
				
		// double to byte.
				double dd= 45.67;
				byte bb = (byte)dd;
				System.out.println("double to byte: "+ dd+ ", "+ bb);
		
		// double to byte.
				double ddd= 456.789;
				byte bbb = (byte)ddd;
				System.out.println("double to byte: "+ ddd+ ", "+ bbb);
				
		// float to long.
				float f= 12345.6789f;
				long llll = (long)f;
				System.out.println("float to long: "+ f+ ", "+ llll);
				
		// float to long.
				float ff= Float.MAX_VALUE;
				long lllll = (long)ff;
				System.out.println("float to long: "+ ff+ ", "+ lllll);
				
		// long to float.
				long llllll= Long.MAX_VALUE;
				float fff = (float)llllll;
				System.out.println("long to float: "+ llllll+ ", "+ fff);
				
	}
}
