import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by thook on 10/7/15.
 */
public class HamletParser {

    private String hamletData;

    public HamletParser(){
        this.hamletData = loadFile();
    }

    private String loadFile(){
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("hamlet.txt").getFile());
        StringBuilder result = new StringBuilder("");

        try(Scanner scanner = new Scanner(file)){
            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                result.append(line).append("\n");
            }

            scanner.close();
        }catch(IOException e){
            e.printStackTrace();
        }

        return result.toString();
    }

    public String getHamletData(){
        return hamletData;
    }

    public void changeHamletToLeon() {
    }

    public int numOfHamletOcc() {
        return 0;
    }

    public int numOfLeanOcc() {
        return 0;
    }

    public void changeHoratioToTariq() {
    }

    public int numOfTariqOcc() {
    }

    public int numOfHoratioOcc() {
    }


}
