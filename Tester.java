
public class Tester {
	public static void main(String[] args) {
		FilterArray<String> a = new FilterArray<String>();
		String[] s = {"Hazard","Lukaku","DeBruyne","Ramos","VanDijk","Sketlenberg","Leo","Cristiano","Schweinsteiger","Chamberlain","Aubameyang"};
		String[] ans = FilterArray.filter(s, a);
		for(int i = 0; i<ans.length; i++) {
		System.out.println(ans[i]);
		}
		FilterArray<Integer> ints = new FilterArray<Integer>();
		int[] num = {1,2,3,4,5,-6,-56,0,-43,54,100,-32,-44,-5};
		int[] solution = FilterArray.filter(num, ints);
		for(int j = 0; j<solution.length; j++) {
			System.out.println(solution[j]);
		}
	}
}
