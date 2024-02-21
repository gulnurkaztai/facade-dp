package facade;

public class Main {

	public static void main(String[] args) {
        Projector projector = new Projector();
        Amplifier amp = new Amplifier();
        DVDPlayer dvd = new DVDPlayer();
        Lights lights = new Lights();
        
		HomeTheaterFacade homeTheater = new HomeTheaterFacade(projector, amp, dvd, lights);
		homeTheater.watchMovie("Star Wars");
		homeTheater.endMovie();
	}

}
