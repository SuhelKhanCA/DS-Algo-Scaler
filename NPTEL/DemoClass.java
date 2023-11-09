class DemoClass{
	// defining the genneric method to print any data type
	void gennericPrint(T t){
		System.out.println(t);
		}
	public static void main(String[] args){
		DemoClass aObj; // Craeting object of DemoClass
		
		aObj.gennericPrint(101); // printing the int vale
		aObj.gennericPrint("Joy with Java"); // printing the strings using the generic method
		aObj.gennericPrint(3.1416); // printing the float value or decimal value
		}
	}