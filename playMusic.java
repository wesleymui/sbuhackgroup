import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class playMusic {
	void MusicPlayer(String musicLocation) {
		try {
			File musicPath = new File(musicLocation);
			 
			if (musicPath.exists()) {
				AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);
				Clip music = AudioSystem.getClip();
				music.open(audioInput);
				music.start();
				music.loop(music.LOOP_CONTINUOUSLY);
				
				JOptionPane.showMessageDialog(null, "If you don't like the music... click the 'ok' button to mute!");
			}else {
				System.out.println("File Not Found");
			}
		}catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
