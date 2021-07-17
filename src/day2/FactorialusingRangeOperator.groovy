package day2

class FactorialusingRangeOperator {

	static void main(args) {
		println ("Enter value of a: ")
		def sc= new Scanner(System.in)
		long a= sc.nextInt()
		long result=1
		for(long i in a..1)
			result=result*i
			println ("Factorial is: " + result)
		
	}
}
