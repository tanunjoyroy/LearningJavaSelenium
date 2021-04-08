package InterviewPrograms;

public class removejunk {

	public static void main(String[] args) {
		
		String a = "***%^*^Book knowledge science$#@%#&$%*";
		String b = "***%^*^social studies education$#@%#&$%*";
		String c = "bdkhhashh#%^&^*&(^**&^*";
		String str = "#$@#@!$12werfvt4@$tt^^$%^$%&yu89 !@#!@$@#%@53453647 dasfsdf";
		//using replaceall N regular expression
		//[a-zA-Z0-9]-- it will replace all characters belonging to the mentioned range
		//[^a-zA-Z0-9]-- it will replace any character besides the mentioned range; ^ not operator
		
		System.out.println(a.replaceAll("[^a-zA-Z0-9]", ""));
		System.out.println(b.replaceAll("[^a-zA-Z0-9 ]", ""));
		System.out.println(c.replaceAll("[a-z]", ""));
		System.out.println(str.replaceAll("[^a-zA-Z0-9 ]", "")); //included space as well in regex
	}

}
