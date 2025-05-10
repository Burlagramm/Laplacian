package cis000_common;

/**
 * Please fill this with your info.
 * 
 * @author bingol
 */
public class StudentInfo {

	// below-0123456789-V toDo // do not change this line ~~~~~~~~~~ V
	// TODO your code should be between below and above marks.

	 // Update with your info // ~~fake~~
	 public static String course = "CIS111"; // course ID // ~~fake~~
	 public static String section = "2"; // your section // ~~fake~~
	 public static String studentName = "Samet"; // your name here // ~~fake~~
	 public static String studentLastName = "Laçin"; // your last name here // ~~fake~~
	 public static String studentNo = "20210501003-162"; // your student no // ~~fake~~

	// above-0123456789-A toDo // do not change this line ~~~~~~~~~~ A


	/**
	 * Do not change {@code studentTag}.
	 */
	public static void studentTag() {
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("~ Course:\t" + course + "." + section);
		System.out.println("~ StudentNo:\t" + studentNo);
		System.out.println("~ Student:\t" + studentLastName + "," + studentName);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	}

}
