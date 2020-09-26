import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;

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
			}else {
				System.out.println("File Not Found");
			}
		}catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
