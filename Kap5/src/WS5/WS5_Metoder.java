/**
 * 
 */
package WS5;

/**
 * @author 19soag01
 *
 */
public class WS5_Metoder {

	/**
	 * @param args
	 */
	static int nummer = 7;
	
	public static void hej () {
		System.out.println("hej");
	}
	
	public static void pa () {
		System.out.println("på");
	}
	
	public static void dig() {
		System.out.println("dig");
	}
	
	public static int max(int a, int b) {
		if(a > b) {
			return a;
		}
		else {
			return b;
		}
	}

	public static String concatString(String a, String b) {
		String c = a + " " + b;
		return c;
	}
	
	public static void noChange() {
		nummer++;
		
	}
	
	public static int max(int a, int b, int c) {
		
		int x = max(a,b);
		int y = max(b,c);
		int z = max(x,y);
		
		return z;
		
		
	}
	
	public static int secureReading(String str) {
		int number = Integer.parseInt(str);
		return number;
		
	}
	
	
	public static void eat() {
		System.out.println("eating");
	}
	
	public static void think() {
		System.out.println("thinking");
	}
	
	public static void nothing(int a, int b) {
		
	}
	
	public static String låtBli() {
		return null;
	}
	
	public static void main(String[] args) {
	//	String temp = concatString("bra","va?");
	//	System.out.println(temp);
		
	//	System.out.println(concatString("bra","va?"));
		
		//int nummer = 7;
		//int nyttNummer = noChange(nummer);
		
	//	System.out.println("vårt inmatade numer var: " + nummer);
		
	//	System.out.println("nummert vi fick tillbaka var: " + nyttNummer);
		
	/*	System.out.println("Vårt nummer börjar på " + nummer);
		noChange();
		noChange();
		noChange();
		noChange();
		noChange();
		noChange();
		noChange();
		
		
		System.out.println("numert är nu " + nummer);*/
		
		/*int svar = secureReading("1234");
		
		System.out.println(svar);*/
		
		/*String exempel = låtBli();
		System.out.println(exempel);*/
	}
	
	

}
