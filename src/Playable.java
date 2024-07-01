public interface Playable {
    void play();
    void pause();
    void stop();
}
interface Recordable{
    void record();
    void stopRecording();
}
class AudioPlayer implements Playable{
    @Override
  public void play(){
        System.out.println("Playing audio");
    }
    @Override
   public void pause(){
        System.out.println("Pausing audio");
    }
    @Override
   public void stop(){
        System.out.println("Stopping audio");
    }
}
class VideoPlayer implements Playable{
    @Override
   public void play(){
        System.out.println("Playing video");
    }
    @Override
   public void pause(){
        System.out.println("Pausing video");
    }
    @Override
   public void stop(){
        System.out.println("Stopping video");
    }
}
class VoiceRecorder implements Playable,Recordable{
    @Override
  public void play(){
        System.out.println("Playing recorded audio");
    }
    @Override
    public void pause(){
        System.out.println("Pausing recorded audio");
    }
    @Override
   public void stop(){
        System.out.println("Stopping recorded audio");
    }
    @Override
   public void record(){
        System.out.println("Recording audio");
    }
    @Override
   public void stopRecording(){
        System.out.println("Stopping recording");
    }
}
class MediaPlayerSystem {
    public static void main(String[] args) {
        Playable[] p = new Playable[3];
        p[0]=new AudioPlayer();
        p[1]=new VideoPlayer();
        p[2]=new VoiceRecorder();
        for (Playable playable: p){
            playable.play();
            playable.pause();
            playable.stop();
            VoiceRecorder v=new VoiceRecorder();
            v.record();
            v.stopRecording();
        }
    }
}
