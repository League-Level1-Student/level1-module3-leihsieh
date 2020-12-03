package _05_netflix;

public class Netflix {
	public static void main(String[] args) {
		
		NetflixQueue nq = new NetflixQueue();
		
		Movie i = new Movie("Infinity War", 5);
		nq.addMovie(i);
		
		Movie p = new Movie("Pirates of the Carribean", 4);
		nq.addMovie(p);
		
		Movie s = new Movie("Into the Spider-verse", 4);
		nq.addMovie(s);
		
		Movie r = new Movie("Rise of Skywalker", 2);
		nq.addMovie(r);
		
		Movie t = new Movie("Twilight", 1);
		nq.addMovie(t);
		
		nq.sortMoviesByRating();
		nq.printMovies();
		System.out.println(nq.getBestMovie());
	}
}
