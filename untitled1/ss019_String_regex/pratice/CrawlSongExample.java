package ss019_String_regex.pratice;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CrawlSongExample {
    public static void main(String[] args) {
        try{
            URL url=new URL("https://www.nhaccuatui.com/bai-hat/nhac-tre-moi.html");
            Scanner scanner=new Scanner( new InputStreamReader(url.openStream()));
scanner.useDelimiter("\\z");
String content=scanner.next();
scanner.close();
content=content.replaceAll("\\n+","");
            Pattern p=Pattern.compile("name_song\\\">(.*?)</a>");
            Matcher matcher= p.matcher(content);
            while (matcher.find()){
                System.out.println(matcher.group(1));
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
