import java.util.Formatter;
import java.io.*;
public class ResultProcessor {
    
    public static int[] jolieResults;
    public static int[] winResults;
    public static int[] results;
    public static String outputFilename;

    public static void main( String[] args ) {
	if( args.length < 2 ) System.exit( 0 );
	else {
	    jolieResults = In.readInts( args[0] );
	    winResults = In.readInts( args[1] );
	    results = new int[jolieResults.length];
	    if( args.length > 2 ) outputFilename = args[2];

	    String res = compare( jolieResults, winResults, results );
	    if( outputFilename != null && outputFilename.length() > 0 ) {
		writeFile( outputFilename, res );
	    } else {
		System.out.println( res );
	    }
	}
    }

    public static String compare( int[] jolie, int[] win, int[] result ) {
	double N = (double)jolie.length;
	double jolieSum = 0;
	double winSum = 0;
	double combinedSum = 0;
	String fileContent = "";
	
	for( int i = 0; i < N; i++ ) {
	    jolieSum += jolie[i];
	    winSum += win[i];
	    combinedSum += jolie[i] - win[i];
	    result[i] = jolie[i] - win[i];
	}

	Formatter formatter = new Formatter();
	fileContent = formatter.format( "%10s %10s %10s", "Jolie", "Windows", "Combined" ).toString();
	fileContent += "\n";

	for( int j = 0; j < N; j++ ) {
	    formatter = new Formatter();
	    fileContent += formatter.format( "%10s %10s %10s", jolie[j], win[j], result[j] );
	    fileContent += "\n";
	}

	fileContent += "\n\n\n";
	fileContent += "Jolie avg: " + jolieSum / N + "\n";
	fileContent += "Windows avg: " + winSum / N + "\n";
	fileContent += "Combined avg: " + combinedSum / N;

	return fileContent;
    }

    public static void writeFile(String filename, String content){
	BufferedWriter writer = null;
        try {
            File outputFile = new File(filename);
	    
	    if( outputFile.exists() ) {
		outputFile.delete();
	    }
	    outputFile.createNewFile();

            writer = new BufferedWriter(new FileWriter(outputFile));
            writer.write(content);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                // Close the writer regardless of what happens...
                writer.close();
            } catch (Exception e) {
            }
        }
    }

    public static double getAverage( int[] arr ) {
	int N = arr.length;
	int sum = 0;
	for( int i = 0; i < N; i++ ) {
	    sum += arr[i];
	}
	return sum / N;
    }
}
