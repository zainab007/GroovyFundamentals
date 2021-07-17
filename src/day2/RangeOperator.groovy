package day2

class RangeOperator {

	static void main(args) {
		println("Enter Value of a: ")
		Scanner sc= new Scanner(System.in)
		def a= sc.nextInt()
		def range = 1..a
		println ("Size of range is: " + range.size())
		for (def j in range)
		{
			println(j)
			
		}
		println("Starting value of range is: " + range.getFrom())
		println("ending value of range is: " + range.getTo())
		println("Value sorted at 3rd index is: " + range.get(2))
		println("Value 4 is present inside a range: " + range.contains(4))
	}
}
