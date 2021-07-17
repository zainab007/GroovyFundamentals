package day2

class StringHandling {

	static void main(args) {
		println("Enter your name: ")
		Scanner sc= new Scanner(System.in)
		def a= sc.next()
		println("entered name is $a")
		println("Length of string is: " + a.length())
		println("Reverse of string is: " + a.reverse())
		println("last index value of string is: " + a[-1])
		println("last second index value of string is: " + a[-2])
		println("string in a range is: " + a[0..5])
	}
}
