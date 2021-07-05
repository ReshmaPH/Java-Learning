package oops.object.interfaces;

public interface ComplexAlgorithm {
	//int a;  // interfaces can not have variables
	int t=0; // it can have constants
	default public void print() {  // default implementation is allowed after java 8.
		
	}
	
	public int complexAlorithm(int a,int b);

}
