package thepackage;

import java.io.File;

public class Lister {

	private File file;
	private boolean showHidden;
	
	public Lister(File file, boolean showHidden) {
		this.file = file;
		this.showHidden = showHidden;
	}
	
	public void list() {
		listRecurse(file, "");
	}
	
	public void listRecurse(File file, String indent) {
		if (file.isDirectory() && showHidden) {
			System.out.println(indent + file.getName() + ":");
			for (File f: file.listFiles()) {
				listRecurse(f, indent + "   ");
			}
		} else {
			if (file.isDirectory() && !(file.getName().substring(0,1).equals("."))) {
				System.out.println(indent + file.getName() + ":");
				for (File f: file.listFiles()) {
					listRecurse(f, indent + "   ");
				}
			}
		}
		if (!file.isDirectory() && showHidden == true) {
			System.out.println(indent + file.getName());
		} else if (!file.isDirectory()){
			if (!(file.getName().substring(0,1).equals("."))) {
				System.out.println(indent + file.getName());
			}
		}
			
	}
	
	public static void main(String[] args) {
		File file = new File(System.getProperty("user.dir"));
		Lister lister = new Lister(file.getParentFile(), false);
		lister.list();
	}
}
