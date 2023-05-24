package zajavka.pl.service;

import java.nio.file.Path;
import java.util.List;

public interface MdFileReader {
    List<String> read(String filePath);
}
