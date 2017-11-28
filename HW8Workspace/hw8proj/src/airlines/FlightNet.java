package airlines;

import java.util.HashSet;

public class FlightNet extends HashSet<Airport> {
	
	//
	// Checks if an airport name is available. That is, that it is not taken
	// by another airport in the FlightNet
	//
	public boolean nameIsAvailable(String name) {
		for (Airport airport: this) {
			if (airport.getName().equals(name))
				return false;
		}
		return true;
	}
	
	//
	// Connects two airports to each other
	//
	public void connect(Airport a1, Airport a2) {
		a1.connectTo(a2);
		a2.connectTo(a1);
	}
	
	//
	// Disconnects two airports from each other
	//
	public void disconnect(Airport a1, Airport a2) {
		a1.disconnectFrom(a2);
		a2.disconnectFrom(a1);
	}
	
	//
	// Disconnects an airport from all other airports in the FlightNet and removes said airport
	// from the FlightNet
	//
	public void removeAndDisconnect(Airport removeMe) {
		for (Airport airport: this) {
			removeMe.disconnectFrom(airport);
		}
		remove(removeMe);
	}
	
	//
	// Returns the first airport found that is within the maximumDistance of a given point x,y
	//
	public Airport getAirportNearXY(int x, int y, int maximumDistance) {
		for (Airport airport: this) {
			if (Math.hypot(Math.abs(airport.getX()-x), Math.abs(airport.getY()-y)) < maximumDistance)
				return airport;
		}
		return null;
	}
	
	public static FlightNet makeTestInstance() {
	  Airport sfo = new Airport("SFO",  31, 207);
	  Airport lax = new Airport("LAX",  81, 291);
	  Airport jfk = new Airport("JFK", 724, 169);
	  Airport mia = new Airport("MIA", 667, 455);
	  Airport sea = new Airport("SEA",  92,  31);

	  FlightNet net = new FlightNet();
	  
	  net.connect(sfo, sea);
	  net.connect(sfo, jfk);
	  net.connect(sfo, lax);
	  net.connect(jfk, mia);
	  net.connect(jfk, sea);
	  return net;
	}
}
