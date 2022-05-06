import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.*;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class MarkdownParseTest {
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);

    }

    @Test
    public void test1() throws IOException{
        Path fileName = Path.of("test-file.md");
        String content = Files.readString(fileName);
        ArrayList<String> test = MarkdownParse.getLinks(content);


        assertEquals(List.of("https://something.com", "some-thing.html"), test);
    }

    @Test
    public void test2() throws IOException{
        Path fileName = Path.of("test.md");
        String content = Files.readString(fileName);
        ArrayList<String> test = MarkdownParse.getLinks(content);


        assertEquals(List.of("https://link.com"), test);
    }

    @Test
    public void test3() throws IOException{
        Path fileName = Path.of("test2.md");
        String content = Files.readString(fileName);
        ArrayList<String> test = MarkdownParse.getLinks(content);


        assertEquals(List.of(), test);
    }

    @Test
    public void test4() throws IOException{
        Path fileName = Path.of("test3.md");
        String content = Files.readString(fileName);
        ArrayList<String> test = MarkdownParse.getLinks(content);


        assertEquals(List.of("page.com"), test);
    }

    // @Test
    // public void test5() throws IOException{
    //     Path fileName = Path.of("test-file8.md");
    //     String content = Files.readString(fileName);
    //     ArrayList<String> test = MarkdownParse.getLinks(content);


    //     assertEquals(List.of(), test);
    // }
}
