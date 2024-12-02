import java.io.FileInputStream;
import java.io.IOException;

public class Loader {

  public StringBuffer loadLevel() {

    StringBuffer container = new StringBuffer();
    FileInputStream inputStream = null;

    int unicode;
    char symbol;

    try {

      inputStream = new FileInputStream("src/levels/level5.txt");

      while (true) {
        unicode = inputStream.read();
        symbol = (char) unicode;

        if (unicode == -1) {
          break;
        }

        container.append(symbol);
      }
    } catch (IOException ioe) {
      System.out.println("IOE : " + ioe);
    } finally {

      try {
        if (inputStream != null) {
          inputStream.close();
        }
      } catch (IOException ioe) {
        System.out.println("IOE : " + ioe);
      }

      return container;

    }

  }

}
