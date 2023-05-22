
package crazysnake;

import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.media.AudioClip;


public class Musics {
    private AudioClip backgroundMusic;
    private boolean soundOn;

    public void start() {
        backgroundMusic = new AudioClip(getClass().getResource("LobbySound.wav").toString());
        soundOn = false;
    }

    public void handleKeyPress(KeyEvent event) {
        if (event.getCode() == KeyCode.O) {
            if (soundOn) {
                stop();
            } else {
                play();
            }
        }
    }

    public void stop() {
        backgroundMusic.stop();
        soundOn = false;
    }

    public void play() {
        backgroundMusic.setCycleCount(AudioClip.INDEFINITE);
        backgroundMusic.play();
        soundOn = true;
    }
}
