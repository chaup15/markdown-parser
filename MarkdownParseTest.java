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

    @Test
    public void test5() throws IOException{
        Path fileName = Path.of("lab-report-test1.md");
        String content = Files.readString(fileName);
        ArrayList<String> test = MarkdownParse.getLinks(content);


        assertEquals(List.of("`google.com", "google.com", "ucsd.edu"), test);
    }

    @Test
    public void test6() throws IOException{
        Path fileName = Path.of("lab-report-test2.md");
        String content = Files.readString(fileName);
        ArrayList<String> test = MarkdownParse.getLinks(content);


        assertEquals(List.of("a.com(())", "example.com"), test);
    }

    @Test
    public void test7() throws IOException{
        Path fileName = Path.of("lab-report-test3.md");
        String content = Files.readString(fileName);
        ArrayList<String> test = MarkdownParse.getLinks(content);


        assertEquals(List.of("https://sites.google.com/eng.ucsd.edu/cse-15l-spring-2022/schedule"), test);
    }
    
}
