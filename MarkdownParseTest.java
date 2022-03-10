import static org.junit.Assert.*;
import org.junit.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class MarkdownParseTest {
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

    @Test
    public void testFile1() throws IOException {
        String contents= Files.readString(Path.of("./test-file.md"));
        List<String> expect = List.of("https://something.com", "some-page.html");
        assertEquals(MarkdownParse.getLinks(contents), expect);
    }
    /*
        Path fileName = Path.of("test-file.md");
        String contents = Files.readString(fileName);
        List links = List.of("https://something.com", "some-page.html");
        assertEquals("Check", links, MarkdownParse.getLinks(contents));

        Path fileName2 = Path.of("test2-file.md");
        String contents2 = Files.readString(fileName2);
        List links2 = List.of();
        assertEquals("Check", links2, MarkdownParse.getLinks(contents2));

        Path fileName3 = Path.of("test3-file.md");
        String contents3 = Files.readString(fileName3);
        List links3 = List.of("www.edwin.com");
        assertEquals("Check", links3, MarkdownParse.getLinks(contents3));

        Path fileName4 = Path.of("test4-file.md");
        String contents4 = Files.readString(fileName4);
        List links4 = List.of("https://CSE15L.com");
        assertEquals("Check", links4, MarkdownParse.getLinks(contents4));
    */


    @Test
    public void testFile2() throws IOException {
        String contents= Files.readString(Path.of("./test-file2.md"));
        List<String> expect = List.of("https://something.com","some-page.html");
        assertEquals(MarkdownParse.getLinks(contents), expect);
    }

    @Test
    public void testFile3() throws IOException {
        String contents= Files.readString(Path.of("./test-file3.md"));
        List<String> expect = List.of();
        assertEquals(MarkdownParse.getLinks(contents), expect);
    }

    @Test
    public void testFile4() throws IOException {
        String contents= Files.readString(Path.of("./test-file4.md"));
        List<String> expect = List.of();
        assertEquals(MarkdownParse.getLinks(contents), expect);
    }

    @Test
    public void testFile5() throws IOException {
        String contents= Files.readString(Path.of("./test-file5.md"));
        List<String> expect = List.of();
        assertEquals(MarkdownParse.getLinks(contents), expect);
    }

    @Test
    public void testFile6() throws IOException {
        String contents= Files.readString(Path.of("./test-file6.md"));
        List<String> expect = List.of("page.com");
        assertEquals(MarkdownParse.getLinks(contents), expect);
    }

    @Test
    public void testFile7() throws IOException {
        String contents= Files.readString(Path.of("./test-file7.md"));
        List<String> expect = List.of();
        assertEquals(MarkdownParse.getLinks(contents), expect);
    }

    @Test
    public void testFile8() throws IOException {
        String contents= Files.readString(Path.of("./test-file8.md"));
        List<String> expect = List.of();
        assertEquals(MarkdownParse.getLinks(contents), expect);
    }

    @Test
    public void testSnip1() throws IOException {
        String contents= Files.readString(Path.of("./snip1.md"));
        List<String> expect = List.of("'google.com", "google.com", "ucsd.edu");
        assertEquals(MarkdownParse.getLinks(contents), expect);
    }

    @Test
    public void testSnip2() throws IOException {
        String contents= Files.readString(Path.of("./snip2.md"));
        List<String> expect = List.of("a.com", "a.com(())", "example.com");
        assertEquals(MarkdownParse.getLinks(contents), expect);
    }
 
    @Test
    public void testSnip3() throws IOException {
        String contents= Files.readString(Path.of("./snip3.md"));
        List<String> expect = List.of("https://www.twitter.com","https://ucsd-cse15l-w22.github.io/","https://cse.ucsd.edu/");
        assertEquals(MarkdownParse.getLinks(contents), expect);
    }


    
    
}
