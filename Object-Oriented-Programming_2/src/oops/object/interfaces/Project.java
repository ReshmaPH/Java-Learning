package oops.object.interfaces;

public class Project {

	// Example to interfaces.. for instance you are  working with other teams and you need their code to proceed with your code,but theirs is not yet ready, in that case use dummy implementations first and use the real one later on.
	//Swithing is simple with interfaces. and it establishes contract
	public static void main(String[] args) {
		//ComplexAlgorithm algorithm=new DummyAlgorithm();  // use this until the original code is ready
		ComplexAlgorithm algorithm=new RealAlgorithm(); 
		System.out.println(algorithm.complexAlorithm(3, 7));
		

	}

}
