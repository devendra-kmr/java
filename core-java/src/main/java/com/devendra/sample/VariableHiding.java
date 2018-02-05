package com.devendra.sample;



class ParentVariableHiding{
	String str="Dev";
}

public class VariableHiding extends ParentVariableHiding {
	String str="Kumar";
	
	public static void main(String[] args) {
		
		ParentVariableHiding v=new VariableHiding();
		System.out.println(v.str);
	}

}

/*OUTPUT:
  Dev

*/