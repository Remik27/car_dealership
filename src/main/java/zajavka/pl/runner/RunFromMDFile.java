package zajavka.pl.runner;

import zajavka.pl.service.MdFileReader;
import zajavka.pl.service.MdFileReaderImpl;

import java.util.List;

public class RunFromMDFile {
    public static void main(String[] args) {
        MdFileReader mdFileReader = new MdFileReaderImpl();
        String path = "src\\main\\resources\\6450c66bbfd3e10024ca2066-car-dealership-traffic-simulation.md";
        List<String> strings = mdFileReader.read(path);


    }
}
