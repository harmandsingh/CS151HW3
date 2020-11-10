
public class FilterArray<T> implements Filter<T>{

	@Override
	public boolean accept(T x) {
		if(x instanceof String) {
			if(((String) x).length()>=9) {
				return true;
			}
		}
		else if(x instanceof Integer) {
			if(((Integer)x)>=0) {
				return true;
			}
		}
		return false;
	}
	public static String[] filter(String[] a, Filter<String> f) {
		int length = 0;
		for(int i = 0; i<a.length; i++) {
			if(f.accept(a[i]))
				length++;
		}
		String[] longStrings = new String[length];
		int count = 0;
		for(int i = 0; i<a.length; i++) {
			if(f.accept(a[i])) {
				longStrings[count] = a[i];
				count++;
			}
		}
		return longStrings;
	}
	public static int[] filter(int[] a, Filter<Integer> f) {
		int length = 0;
		for(int i = 0; i<a.length; i++) {
			if(f.accept(a[i]))
				length++;
		}
		int[] positiveNumbers = new int[length];
		int count = 0;
		for(int i = 0; i<a.length; i++) {
			if(f.accept(a[i])) {
				positiveNumbers[count] = a[i];
				count++;
			}
		}
		return positiveNumbers;
	}
}
