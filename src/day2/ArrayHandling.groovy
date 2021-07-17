package day2

class ArrayHandling {

	static void main(args) {
		def a=[10,20,30,40, "Zainab"]
		println ("Size of an array is: " + a.size())
		for (def i=0; i<a.size(); i++)
			println (a[i])
		
		println("Array using enhanced loop: ")
		for (i in a)
			println(i)
		println("Value 40 is present in array? " + a.contains(40))
		
	}
}
