package rei;


public class TestRunner {
	public static void main(String args[]) {
		DataSet ds = new DataSet();
		
		// Case-1: Valid String all small
		System.out.println("====== ** Small case ** ======");
		System.out.println(ds.getDataSet("working"));
		System.out.println("");
	
		// Case-2: Valid String all Capital
		System.out.println("====== ** Capital case ** ======");
		System.out.println(ds.getDataSet("WORKING"));
		System.out.println("");

		// Case-3: Valid String First letter Capital
		System.out.println("====== ** First Letter Capital case ** ======");
		System.out.println(ds.getDataSet("Working"));
		System.out.println("");
		
		// Case-4: Valid String for duplicate words
		System.out.println("====== ** Duplicate words case ** ======");
		System.out.println(ds.getDataSet("workingw"));
		System.out.println("");
		
		// Case-5: Valid String no match found
		System.out.println("====== ** No match found ** ======");
		System.out.println(ds.getDataSet("abcd"));
		System.out.println("");
		
        // Case-6: Valid String with 11 characters
		System.out.println("====== ** Character count above limit ** ======");
		System.out.println(ds.getDataSet("aboveground"));
		System.out.println("");
		
		// Case-7: Alpha numberic string
		System.out.println("====== ** Alpha Numeric case ** ======");
		System.out.println(ds.getDataSet("run123"));
		System.out.println("");
	
		// Case-8: String with special characters
		System.out.println("====== ** Special character case ** ======");
		System.out.println(ds.getDataSet("run@#$"));
		System.out.println("");
		
		// Case-9: String with null value
		System.out.println("====== ** Null value case ** ======");
		System.out.println(ds.getDataSet(null));
		System.out.println("");
		
		// Case-10: Empty String
		System.out.println("====== ** Empty string case ** ======");
		System.out.println(ds.getDataSet(" "));
		System.out.println("");
		

	}
}

