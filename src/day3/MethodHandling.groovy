package day3

class MethodHandling {

	static void main(args) {
		// Small piece of code used multiple times we create methods
		display()
		def addResult=add()
		println("addition is: " + addResult)
		def subResult = subtract (8,4)
		println("subtraction is: " + subResult)
		println("Division is: " + divide(9,3))
		divide1(9,3)
		println("Modulus is: " + modulus(8,4))
	}
	static void display()
	{
		println("This part displayed")
	}
	static int add()
	{
		int a=8
		int b=9
		def result=a+b
		return result
	}
	static int subtract(int a, int b)
	{
		def result = a-b
		return result
	}
	static void divide(int a, int b)
	{
		def result = a/b
		
	}
	static void divide1(int a, int b)
	{
		def result = a/b
		println(result)
	}
	static int modulus(int a, int b=6)
	{
		int result = a%b
		return result
	}
}
