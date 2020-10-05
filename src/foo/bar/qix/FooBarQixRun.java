package foo.bar.qix;

public class FooBarQixRun {
	
	private static final String FOO = "Foo";
	private static final String BAR = "Bar";
	private static final String QIX = "Qix";

	public static void main(String[] args) {
		int nb = 1;
		while(nb <= 100) {
			System.out.println(nb + " " + printNumber(nb) );
			nb++;
		}

	}
	
	private static String printNumber(int nb) {
		return divisible(nb).isBlank() && contain(nb).isBlank() 
				? String.valueOf(nb) : divisible(nb) + contain(nb);
	}
	
	private static String divisible(int nb) {
		String str = "";
		if(nb % 3 == 0) {
			str = FOO;
		}
		if(nb % 5 == 0) {
			str = str + BAR;
		}
		return str;
	}
	
	private static String contain(int nb) {
		String strNb = String.valueOf(nb);
		char[] chs = strNb.toCharArray();
		String str = "";
		for(char ch : chs) {
			if(ch == '3') {
				str = str  + FOO;
			}
			if(ch == '5') {
				str = str + BAR;
			}
			if(ch == '7') {
				str = str + QIX;
			}
		}
		return str;
	}

}
