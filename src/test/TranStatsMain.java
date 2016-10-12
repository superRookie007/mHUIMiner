package test;

import algoSimba.TransactionStatsGenerator;

public class TranStatsMain {

	public static void main(String[] args) {
		String inputFile = "C:\\Users\\Alex\\Desktop\\760\\A2\\market\\market.dat";
		String fileName = "C:\\Users\\Alex\\Desktop\\760\\A2\\supports.csv";
		try{
			TransactionStatsGenerator transDBStats = new TransactionStatsGenerator(); 
			transDBStats.getStats(inputFile, fileName);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
