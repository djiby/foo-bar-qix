package foo.bar.qix;

public class FooBarQixRun {
	
	private static final String FOO = "Foo";
	private static final String BAR = "Bar";
	private static final String QIX = "Qix";
	private static final char FOO_3 = '3';
	private static final char BAR_5 = '5';
	private static final char QIX_7 = '7';

	public static void main(String[] args) {
		int nb = 1;
		while(nb <= 100) {
			System.out.println(nb + " " + valueNumber(nb) );
			nb++;
		}

	}
	
	private static String valueNumber(int nb) {
		String str = divisibleNumber(nb) + containNumber(nb);
		return str.isBlank() ? String.valueOf(nb) : str;
	}
	
	private static String divisibleNumber(int nb) {
		String str = "";
		if(nb % 3 == 0) {
			str = FOO;
		}
		if(nb % 5 == 0) {
			str = str + BAR;
		}
		return str;
	}
	
	private static String containNumber(int nb) {
		String strNb = String.valueOf(nb);
		char[] chs = strNb.toCharArray();
		String str = "";
		for(char ch : chs) {
			if(ch == FOO_3) {
				str = str  + FOO;
			}
			if(ch == BAR_5) {
				str = str + BAR;
			}
			if(ch == QIX_7) {
				str = str + QIX;
			}
		}
		return str;
	}

}
