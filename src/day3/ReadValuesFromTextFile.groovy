package day3

class ReadValuesFromTextFile {

	static void main(args) {
		// TODO Auto-generated method stub
		String filepath ="C:\\Users\\ZainabShakkarwala\\Documents\\Python Assignments\\Github steps.txt"
		File myfile = new File (filepath)
		println(myfile.text)
		def list = myfile.collect{it}
		println(list)
		println(list.getClass())
		println(list.size())
		def array = myfile as String[]
		println(array)
		println(array.getClass())
		println(array.size())
	}
}
