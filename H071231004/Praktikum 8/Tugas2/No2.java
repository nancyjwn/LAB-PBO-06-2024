
import java.io.IOException;
import java.util.Arrays;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class No2 {
    public static void main(String[] args) throws InterruptedException, UnsupportedAudioFileException, IOException, LineUnavailableException {
        TypeRacer typeRacer = new TypeRacer();
        boolean running = true;

        typeRacer.setNewWordsToType();
        System.out.println("|| text to Type ||");
        System.out.println("\"" + typeRacer.getWordsToType() + "\"");
        
        Typer[] typers = new Typer[3];
        
        typers[0] = new Typer("Monyongg", 80, typeRacer);
        typers[1] = new Typer("Alayyy", 72, typeRacer);
        typers[2] = new Typer("Jamettt", 70, typeRacer);

        typeRacer.getRaceContestant().addAll(Arrays.asList(typers));

        typeRacer.startRace();
        while (running) {
            if (TypeRacer.raceStanding.size() == TypeRacer.raceContestant.size()) {
                break;
            }
        }
    }
}