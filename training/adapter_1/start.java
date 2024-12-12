package training.adapter_1;

public class start {
    public static void main(String[] args) {
        // AudioPlayer 사용
        Player audioPlayer = new AudioPlayer();
        audioPlayer.play();

        // VideoPlayer를 AudioPlayer와 호환되게 사용
        VideoPlayer videoPlayer = new VideoPlayer();
        Player videoAdapter = new Adapter(videoPlayer);
        videoAdapter.play();
    }
}
