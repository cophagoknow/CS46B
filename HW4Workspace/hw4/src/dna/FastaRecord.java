package dna;


public class FastaRecord implements DNARecord 
{	
	private String defline;
	private String sequence;
	
	//Represents a Fasta record, starts with '>'
	public FastaRecord(String defline, String sequence) throws RecordFormatException {
		this.defline = defline;
		this.sequence = sequence;
		
		if (defline.charAt(0)!='>') {
			String err = "Unexpected start of defline: " + defline.charAt(0) +", expected '>'";
			throw new RecordFormatException(err);
		}
	}
	
	//Represents a Fasta record, starts with '>' created from a Fastq record
	public FastaRecord(FastqRecord fastqRec) {
		this.defline = ">" + fastqRec.getDefline().substring(1);
		this.sequence = fastqRec.getSequence();
	}

	//Returns defline
	public String getDefline() {
		return defline;
	}

	//Returns sequence
	public String getSequence() {
		return sequence;
	}

	//Checks if this FastaRecord is deep equal to another, o
	public boolean equals(Object o) {
		FastaRecord that = (FastaRecord)o;
		if (this.defline == that.defline && this.sequence == that.sequence) {
			return true;
		}
		return false;
	}

	//Returns the hashcode of the FastaRecord
	public int hashCode() {
		return defline.hashCode() + sequence.hashCode();
	}
}
