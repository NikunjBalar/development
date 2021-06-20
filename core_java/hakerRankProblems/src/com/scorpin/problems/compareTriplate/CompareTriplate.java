package com.scorpin.problems.compareTriplate;

import java.util.ArrayList;
import java.util.List;


/**
 * @author Nikunj Balar
 *
 * 			input 			output
 * 		a		b	=	a		b
 *		1	<	2		0		1
 *		2	=	2		0		0
 *		3	>	1		1		0
 *						___________
 *						1		1
 *
 *		input 			output
 * 		a		b	=	a		b
 *		3	>	2		1		0
 *		2	=	2		0		0
 *		3	>	1		1		0
 *						___________
 *						2		0
 *
 *		input 			output
 * 		a		b	=	a		b
 *		1	<	3		0		1
 *		2	=	2		0		0
 *		1	<	3		0		1
 *						___________
 *						0		2
 */
public class CompareTriplate {

	public static void main(String[] args) {
		List<Integer> a = new ArrayList<Integer>();
		a.add(1);
		a.add(2);
		a.add(3);
		List<Integer> b = new ArrayList<Integer>();
		b.add(3);
		b.add(2);
		b.add(1);

		List<Integer> ar=compareTriplets(a, b);

		System.out.println(ar);
	}

	static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {

		 int alice =0;
		 int bob=0;
		 List<Integer> c = new ArrayList<>();
		 
	        for (int i =0 ; i <a.size(); i++){
	            Integer inta = a.get(i);
	            Integer intb = b.get(i);
	            if(inta > intb){
	                alice+=1;
	            }
	            else if (inta < intb) {
	            	bob+=1;
	            }
	        }
	        c.add(alice);
	        c.add(bob);
			return c;
	    }
}
