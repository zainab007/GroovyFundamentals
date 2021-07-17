package day1

class Factorial {

	static void main(args) {
		println ("Enter value of a: ")
		def sc= new Scanner(System.in)
		def a= sc.nextInt()
		def result=1
		for(int i=1;i<=a;i++)
			result=result*i
			println ("Factorial is: " + result)
		
	}
}
