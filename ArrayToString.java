
public class ArrayToString {
	public static void main(String[] args) {
		 String[] stringArray = { "My", "name", "is", "Gaurav", "!" };
		 String string1 = convertArrayToStringUsingJoin(stringArray);
	        System.out.println("An array converted to string using String.join(): " + string1);
	}
	 public static String convertArrayToStringUsingJoin(String[] stringArray) {
	        String str = String.join(" ", stringArray);
	        return str;
	    }
}
