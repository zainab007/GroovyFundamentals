package day2

class ListHandling {

	static void main(args) {
		List list =[10,20,30,40]
		println("Size of list is: " + list.size())
		for (int i in list)
			println(i)
		
			list.add(50)
		println("new list is: ")
		for (int j in list)
			println(j)
		
			list.add(2, 60)
		println("new list is: ")
		for (int j in list)
			println(j)
		
			list.pop()
		println("new list after pop is: ")
		for (int j in list)
			println(j)
		
			list.remove(4)
		println("new list after remove is: ")
		for (int j in list)
			println(j)
		
		def reverselist= list.reverse()
		println("new list after reversing is: ")
		for (int j in reverselist)
			println(j)
	}
}
