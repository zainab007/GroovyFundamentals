package day1

class PrimeNumber {

	static void main(args) {
		
		println ("Enter value of a: ")
		def sc= new Scanner(System.in)
		def a= sc.nextInt()
		def result=0
		for (int i=1; i<=a; i++)
			{
				if (a.mod(i)==0)
		
				result++;
			}
	if (result==2)
		println ("$a is Prime number")
	else
		println("$a is not prime number")
}
}
