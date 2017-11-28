package dna;

public class RecordFormatException extends Exception
{
	//Exception for reading Fasta and Fastq records
	public RecordFormatException(String message) {
		super(message);
	}

}
