package mvc.model;

import java.io.File;
import java.util.List;

public interface FileHandler {
    File getFilePath(String path);
    List<Integer> processFile(File file);
}
