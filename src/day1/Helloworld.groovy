package day1

class Helloworld {

	static void main(args) {
		int a=5
		def b=6
		println ("Sum is: " + (a+b))
		def name="Zainab"
		println ("My name is $name")
		println("""Hello world
welcome to training
Jai Hind""")
		println("enter value for c: ")
		def sc= new Scanner(System.in)
		def c= sc.nextInt();
		println ("addition of $a and $c is: "+(a+c))
	}
}
