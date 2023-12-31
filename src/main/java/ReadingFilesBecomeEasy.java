import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

public class ReadingFilesBecomeEasy {
    public static void main(String[] args) throws IOException {

        //Files.lines(Paths.get("D:\\functional-programming\\src\\main\\StreamCreation")).map(str -> str.split(" ")).flatMap(Arrays::stream).distinct().sorted().forEach(System.out::println);

        Files.list(Paths.get(".")).filter(Files::isDirectory).forEach(System.out::println);
    }
}
