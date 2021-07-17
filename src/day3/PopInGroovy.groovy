package day3

class PopInGroovy {

	static void main(args) {
		def listvalue=[10,20,30,'Manzoor']
		println(listvalue)
		listvalue.push(30)
		println(listvalue)
		listvalue.pop()
		println(listvalue)
		listvalue.add(30)
		println(listvalue)
		listvalue.removeLast()
		println(listvalue)
		
	}
}
