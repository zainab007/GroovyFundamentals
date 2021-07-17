package day3

class WriteValuestoText {

	static void main(args) {
		// TODO Auto-generated method stub
		String filepath ="C:\\Users\\ZainabShakkarwala\\Documents\\Python Assignments\\sampleData1.txt"
		File myfile = new File (filepath)
		myfile<<"\n This is my first line"
		myfile<<"\n this is my second line"
		def fileSize = myfile.length()
		println("my file size is $fileSize in KB")
	}
}
