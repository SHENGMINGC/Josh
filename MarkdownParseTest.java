import static org.junit.Assert.*;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import org.junit.*;


public class MarkdownParseTest {
    @Test
    public void addition() {
        assertEquals(2, 1+1); // checks that 2 == 1+1
    }


    @Test
    public void testgetLinks() {
        try {
            assertEquals(List.of("https://something.com", "some-thing.html"), MarkdownParse.getLinks(Files.readString(Path.of("test-file.md"))));
        } catch (Exception e) {
            throw new IllegalArgumentException();
        }
    }
}
