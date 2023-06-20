import java.util.*;
import java.lang.*;
import java.io.*;
class suck {

	public static void main(String[] args) throws ClassNotFoundException {
		suck s = new suck();
		System.out.println(s instanceof Object);
		//System.out.println(s instanceof String);//C.E
		System.out.println(s instanceof suck);
		System.out.println(Class.forName(args[0]).isInstance(s));
	}

}