package coupling;

public class HumanTightCoupling02 {
    private Football football;
    
    public HumanTightCoupling02() {
        this.football = new Football();
    }

    public void play() {
    	football.play();
    }
    
    public void stop() {
    	football.stop();
    }
}