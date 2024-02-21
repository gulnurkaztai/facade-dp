package facade;

public class HomeTheaterFacade {
	
	protected Projector proj;
	protected Amplifier amp;
	protected DVDPlayer dvd;
	protected Lights lights;
	
	public HomeTheaterFacade(Projector proj, Amplifier amp, DVDPlayer dvd, Lights lights) {
		this.proj = proj;
		this.amp = amp;
		this.dvd = dvd;
		this.lights = lights;
	}
	
	public void watchMovie(String movie) {
		proj.on();
		amp.on();
		lights.off();
		dvd.on();
		dvd.play(movie);
	}
	
	public void endMovie() {
		proj.off();
		amp.off();
		lights.on();
		dvd.off();
	}
	
	
}
