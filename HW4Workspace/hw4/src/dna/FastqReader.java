package dna;

import java.io.*;


public class FastqReader 
{
	private BufferedReader br;
	
	//Creates a FastqReader with instance of a BufferedReader
	public FastqReader(BufferedReader br) {
		this.br = br;
	}
	// Returns next record in the file, or null if EOF (end-of-file).
	public FastqRecord readRecord() throws IOException, RecordFormatException
	{
		// Read the defline from the BufferedReader. Return null if you read null, 
		// indicating end of file.
		String defline = br.readLine();
		String sequenceline = br.readLine();
		br.readLine();
		String qualityline = br.readLine();
		if (defline == null) {
			return null;
		} else {
			return new FastqRecord(defline, sequenceline, qualityline);
		}
	}
}
