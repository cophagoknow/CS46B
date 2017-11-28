package movies;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class HashFilmArchive extends HashSet<Movie> implements FilmArchive {

	@Override
	public ArrayList<Movie> getSorted() {
		TreeSet<Movie> treeset = new TreeSet(this);
		return new ArrayList<Movie>(treeset);
	}
	
	public static void main(String[] args) {
		HashFilmArchive archive = new HashFilmArchive();
		for (Movie m: Movie.getTestMovies()) {
			archive.add(m);
		}
		for(Movie m: Movie.getTestMovies()) {
			System.out.println(m);
		}
		System.out.println("*******");
		for (Movie m: archive.getSorted()) {
			System.out.println(m);
		}
	}
}
