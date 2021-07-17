package day2

class IncremenetRangeby2 {

	static void main(args) {
		println("Enter Value of a: ")
		Scanner sc= new Scanner(System.in)
		def a= sc.nextInt()
		def range = 1..a
		println ("Size of range is: " + range.size())
		for (def j in range)
		
			println(j)
			
		def rangeoperator  = range.step(-2)
		for (def j in rangeoperator)
			println(j)
		
	}
}
