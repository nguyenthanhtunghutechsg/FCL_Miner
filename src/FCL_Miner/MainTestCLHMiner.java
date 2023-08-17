package FCL_Miner;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URL;


/**
 * Example of how to use the CLH-Miner algorithm from the source code
 */
public class MainTestCLHMiner {


	public static void main(String[] args) throws IOException {

		// input file path (taxonomy)
		String TaxonomyPath = "liquorTaxonomy.txt";
		// input file path (transactions)
		String inputPath = "liquor_5.txt";
		// Output path
		String outputPath = "output.txt";
		
		// minimum utility
		double minimumUtility = 10;
		
		// run the algorithm
		AlgoCLHMiner cl = new AlgoCLHMiner();
		cl.runAlgorithm(minimumUtility, inputPath, outputPath, TaxonomyPath, false);
		cl.printStats();
	}
}
