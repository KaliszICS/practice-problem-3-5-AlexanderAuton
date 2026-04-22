/**

        * File: Lesson 3.5 - montyHall.Mp4

        * Author: Alex

        * Date Created: March 30, 2026

        * Date Last Modified: April 21, 2026

        */
public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static void q1() {
		//Write question 1 code here
	}

	public static void q2() {
		//Write question 2 code here
	}

	public static void q3() {
		//Write question 3 code here
	}

	public static void q4() {
		//Write question 4 code here
	}

	public static void q5() {
		//Write question 5 code here
	}
public static String getFirstName(String fn){
	fn = fn.trim();
	int index = fn.indexOf(" ");
	String fname = fn.substring(0, index);
	return fname;
	}

public static String getLastName(String ln){
	ln = ln.trim();
	int index = ln.lastIndexOf(" ");
	String lname = ln.substring(index + 1);
	return lname;
	}

public static boolean isValidName(String bool){
	String fn;
	String ln;
	bool = bool.trim();
int index = bool.indexOf(" ");
int index2 = bool.lastIndexOf(" ");
if (index == -1) {
	return false;
}
if (index == index2){
	fn = bool.substring(0, index);
	ln = bool.substring(1+index);
	if (fn.length()>=2 && ln.length()>=2){
	return true;
	} else {
		return false;
	}
}
else {
	return false;
 }
}
}
