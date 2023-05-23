package zajavka.pl.service;

import com.vladsch.flexmark.parser.Parser;
import com.vladsch.flexmark.util.ast.Node;
import com.vladsch.flexmark.util.ast.VisitHandler;
import com.vladsch.flexmark.util.ast.Visitor;
import org.jetbrains.annotations.NotNull;
import com.vladsch.flexmark.ast.util.;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

public class MdFileReaderImpl implements MdFileReader {
    @Override
    public String read(String filePath) {
        String markdownContent = "";

        try {
            Path path = Paths.get(filePath);
            markdownContent = new String(Files.readAllBytes(path));
        } catch (IOException e) {
            e.printStackTrace();
        }

        return markdownContent;
    }

    private static void processMarkdown(String markdownContent) {
        Parser parser = Parser.builder().extensions(Arrays.asList(TablesExtension.create())).build();
        Node document = parser.parse(markdownContent);

        // Przetwarzaj strukturę drzewa Markdown
        Visitor visitor = new Visitor(
                new VisitHandler<>(Node.class, node -> {
                    // Przetwarzaj poszczególne węzły Markdown
                    // Tutaj można wykonywać odpowiednie operacje na węzłach
                    System.out.println("Node: " + node);
                })
        );
        document.accept(visitor);
    }
    }





