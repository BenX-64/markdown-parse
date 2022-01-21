// File reading code from https://howtodoinjava.com/java/io/java-read-file-to-string-examples/
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;

/*
    Test 2 failed because of improper bracket syntax.

    Test 3 includes images
*/

public class MarkdownParse {
    public static ArrayList<String> getLinks(String markdown) {
        ArrayList<String> toReturn = new ArrayList<>();
        
        String[] imgExt = {".png",".jpeg",".gif", ".csv", ".jpg", ".svg", ".pdf"};
        // find the next [, then find the ], then find the (, then take up to
        // the next )
        int currentIndex = 0;
        int nextOpenBracket = markdown.indexOf("[", currentIndex);
        int nextCloseBracket = markdown.indexOf("]", nextOpenBracket);
        int openParen = markdown.indexOf("(", nextCloseBracket);
        int closeParen = markdown.indexOf(")", openParen);
        while(currentIndex < markdown.length()) {
            if (nextCloseBracket > openParen){
                break;
            }
            nextOpenBracket = markdown.indexOf("[", currentIndex);
            nextCloseBracket = markdown.indexOf("]", nextOpenBracket);
            openParen = markdown.indexOf("(", nextCloseBracket);
            closeParen = markdown.indexOf(")", openParen);
            String appendString = markdown.substring(openParen + 1, closeParen);
            toReturn.add(appendString);
            currentIndex = closeParen + 1;
        }
        return toReturn;
    }

    public boolean containsImgExt(String appendString){
        return true;
    }
    public static void main(String[] args) throws IOException {
		Path fileName = Path.of(args[0]);
	    String contents = Files.readString(fileName);
        ArrayList<String> links = getLinks(contents);
        System.out.println(links);
    }
}