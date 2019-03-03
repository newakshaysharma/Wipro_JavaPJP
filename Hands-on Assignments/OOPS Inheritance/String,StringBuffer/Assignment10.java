public class Assignment10 {

	public static void main(String[] args) {
		String str = "Wipro";
		int n = 3;
		
		StringBuffer sb = new StringBuffer();
		String temp=str.substring(str.length() - n,str.length());
		for (int i = 0; i < n; i++) {
			sb.append(temp);
		}

		System.out.println(sb);
	}

}