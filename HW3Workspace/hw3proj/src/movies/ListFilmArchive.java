package movies;

import java.util.ArrayList;
import java.util.TreeSet;

public class ListFilmArchive extends ArrayList<Movie> implements FilmArchive {

	@Override
	public ArrayList<Movie> getSorted() {
		TreeSet<Movie> treeset = new TreeSet<Movie>(this);
		return new ArrayList<Movie>(treeset);
	}

	@Override
	public boolean add(Movie movie) {
		for (Movie m: this) {
			if (m.equals(movie)) {
				return false;
			}
		}
		return super.add(movie);
	}

	public static void main(String[] args) {
		ListFilmArchive archive = new ListFilmArchive();
		for (Movie m: Movie.getTestMovies()) {
			archive.add(m);
		}
		for(Movie m: archive) {
			System.out.println(m);
		}
		System.out.println("*******");
		for (Movie m: archive.getSorted()) {
			System.out.println(m);
		}
	}
}
