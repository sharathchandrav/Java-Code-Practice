	package PracticeSet2;
	
	/*Create an AudioPlayer class that uses an abstract MediaFile class for playing audio files. 
	 * Implement concrete classes like MP3File and WAVFile inheriting from MediaFile, each implementing its own play method.*/
	
	abstract class MediaFile {
		abstract void playAudioFile();
	}
	
	
	
	class MP3File extends MediaFile {
	
		@Override
		void playAudioFile() {
			System.out.println("Playing MP3 File");
	
		}
	
	}
	
	class WAVFile extends MediaFile {
	
		@Override
		void playAudioFile() {
			System.out.println("Playing WAV File");
	
		}
	
	}
	
	class AudioPlayer {
		
		private MediaFile mediaFile;
		public AudioPlayer(MediaFile mediaFile) {
			this.mediaFile = mediaFile;
		}
		
		public void play() {
			mediaFile.playAudioFile();
		}
	
	}
	
	public class MusicPlayerApplication {
	
		public static void main(String[] args) {
			MediaFile m1 = new MP3File();
			MediaFile m2 = new MP3File();
			MediaFile m3 = new WAVFile();
			
			AudioPlayer a1 = new AudioPlayer(m3);
			AudioPlayer a2 = new AudioPlayer(m2);
			AudioPlayer a3 = new AudioPlayer(m1);
			a1.play();
			a2.play();
			a3.play();
			
		}
	
	}
