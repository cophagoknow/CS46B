package dna;

import java.io.*;


// Writes a fasta record to a print writer.
public class FastaWriter 
{
	private PrintWriter thePrintWriter;
	
	public FastaWriter(PrintWriter pr) {
		this.thePrintWriter = pr;
	}
	
	// Writes the rec as 2 separate lines: first the defline, then the sequence.
	public void writeRecord(FastaRecord rec) throws IOException
	{
		thePrintWriter.println(rec.getDefline());
		thePrintWriter.println(rec.getSequence());
	}
}
