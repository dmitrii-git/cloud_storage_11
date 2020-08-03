package NIO;

import java.io.IOException;
import java.nio.file.*;

public class NIO {
    public static void main(String[] args) {
        Path path = Paths.get("./common/src/main/resources/NIOdir");
        try {
            if (!Files.exists(path)) {
                Files.createDirectory(path);
            }

            System.out.println(path.getParent());
            path = Paths.get(path.toString(), "file.txt");
            if (!Files.exists(path)) {
                Files.createFile(path);
            }

            Files.write(path, "123456789".getBytes(), StandardOpenOption.APPEND);
            Files.lines(path).forEach(System.out :: println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
