package zajavka.pl.service;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;


public class MdFileReaderImpl implements MdFileReader {
    @Override
    public List<String> read(String filePath) {


        try {
            FileReader reader = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(reader);
            return bufferedReader.lines()
                    .filter(line -> !line.contains("[//]"))
                    .filter(line-> line.length() >0)
                    .toList();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }


}






