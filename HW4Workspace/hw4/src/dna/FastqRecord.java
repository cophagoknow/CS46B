package dna;

//
// FastqRecord contains the defline, sequence, and quality string
// from a record in a fastq file.
//

public class FastqRecord implements DNARecord 
{
	private String defline;
	private String sequence;
	private String quality;
	
	//Represents a FastqRecord, must start with '@'
	public FastqRecord(String defline, String sequence, String quality) throws RecordFormatException
	{
		this.defline = defline;
		this.sequence = sequence;
		this.quality = quality;
		
		if (this.defline.charAt(0)!='@') {
			String err = "Unexpected start of defline: " + this.defline.charAt(0) +", expected '@'";
			throw new RecordFormatException(err);
		}
	}
	
	//Returns defline
	public String getDefline() {
		return defline;
	}
	
	//Returns sequence
	public String getSequence() {
		return sequence;
	}

	//Returns true if this is deep equal to a given FastqRecord, o
	public boolean equals(Object o) {
		FastqRecord that = (FastqRecord)o;
		if (this.defline.equals(that.defline) && this.sequence.equals(that.sequence) && this.quality.equals(that.quality)) {
			return true;
		}
		return false;
	}	
	
	//Returns true if the quality contains at least one '!' char
	public boolean qualityIsLow()
	{
		return quality.contains("!");
	}
	
	
	//Returns the hashcode
	public int hashCode()
	{
		return defline.hashCode() + sequence.hashCode() + quality.hashCode();
	}
}
