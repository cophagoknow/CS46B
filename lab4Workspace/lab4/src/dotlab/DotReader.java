package dotlab;

import java.io.*;


public class DotReader 
{
	private BufferedReader			br;
	
	public DotReader(BufferedReader br)
	{
		this.br = br;
	}
	
	public Dot readDot() throws IOException, DotException {
		String line = br.readLine();
		if (line == null) {
			return null;
		}
		String[] lineContent = line.split(",");
		if (lineContent.length != 4) {
			throw new DotException("Invalid number of arguments.");
		} else {
			return new Dot(lineContent[0], Integer.parseInt(lineContent[1]),Integer.parseInt(lineContent[2]), Integer.parseInt(lineContent[3]));
		}
	}

}
