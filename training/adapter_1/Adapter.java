package training.adapter_1;

public class Adapter implements Player{
    
    private VideoPlayer videoPlayer;

    public Adapter(VideoPlayer videoPlayer) {
        this.videoPlayer = videoPlayer;
    }

    @Override
    public void play() {
        videoPlayer.play();
    }
}
