

public class Strings {

	public void reveString(String a) {
		int i;
		int len;
		String rev = "";
		len = a.length();
		for (int j = len; j > 0; j--) {
			rev = rev + a.charAt(j - 1);
		}
		System.out.println("string is " + rev);

	}

	public void checkContain(String expected,String actual) {
		if(expected.trim().toLowerCase().replaceAll(" ", "").contains(actual.toLowerCase().trim().replaceAll(" ", ""))){
			System.out.println("srring is same");
		}
		else {
			System.out.println("string is not equal");
		}
				
	}

}
