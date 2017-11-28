package movies;

public class Movie implements Comparable<Movie> {
	private String title;
	private int year;
	
	public Movie(String title, int year) {
		this.title = title;
		this.year = year;
	}
	
	public String getTitle() {
		return title;
	}
	
	public int getYear() {
		return year;
	}
	
	public String toString() {
		return "Movie " + this.title +" (" + this.year + ")";
	}
	
	public static Movie[] getTestMovies() {
		Movie[] list = new Movie[10];
		list[0] = new Movie("True Grit", 1969);
		list[1] = new Movie("True Grit", 2010);
		list[2] = new Movie("The Martian", 2015);
		list[3] = new Movie("Bridge of Spies", 2015);
		list[4] = new Movie("Star Wars", 1971);
		list[5] = new Movie("Star Wars", 1971);
		list[6] = new Movie("Star Trek", 2011);
		list[7] = new Movie("Wow", 2017);
		list[8] = new Movie("Asdf", 2016);
		list[9] = new Movie("FDSA", 2015);
		return list;
	}
	
	public int hashCode() {
		return title.hashCode() + year;
	}
	
	public boolean equals(Object o) {
		Movie m = (Movie)o;
		if (this.compareTo(m) == 0) {
			return true;
		}
		return false;
	}

	@Override
	public int compareTo(Movie m) {
		if (this.getTitle().compareTo(m.getTitle()) < 0) {
			return -1;
		}
		else if (this.getTitle().compareTo(m.getTitle()) == 0) {
			if (this.getYear() < m.getYear()) {
				return -1;
			} else if (this.getYear() == m.getYear()) {
				return 0;
			}
		}
		return 1;
	}
}
