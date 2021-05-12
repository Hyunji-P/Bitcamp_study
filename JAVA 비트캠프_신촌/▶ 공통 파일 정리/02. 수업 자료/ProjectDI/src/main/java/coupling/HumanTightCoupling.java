package coupling;

public class HumanTightCoupling { // 강한 결합 예시
    private Baseball baseball;
    
    public HumanTightCoupling() {
        this.baseball = new Baseball();
    }

    public void play() {
        baseball.play();
    }
    
    public void stop() {
        baseball.stop();
    }
}