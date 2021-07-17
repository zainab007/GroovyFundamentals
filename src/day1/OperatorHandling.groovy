package day1

class OperatorHandling {

	static void main(args) {
		println ("Enter value of a and b: ")
		def sc= new Scanner(System.in)
		def a= sc.nextInt()
		def b = sc.nextInt()
		println ("addition of $a and $b is: " +(a+b))
		println ("addition of $a and $b is: " + a.plus(b))
		println ("subtraction of $a and $b is: " + a.minus(b))
		println ("Divison of $a and $b is: " + a.intdiv(b))
		println("Modulus of $a and $b is: "+ a.mod(b))
		println("Multiplication of $a and $b is: "+ a.multiply(b))
		
	}
}
