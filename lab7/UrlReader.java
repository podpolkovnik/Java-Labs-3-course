package lab7;

import java.net.*;
import java.io.*;
import java.awt.Desktop;

public class UrlReader {
    public UrlReader(String url) throws MalformedURLException {
        this.url = new URL(url);
    }

    public String getHTML() throws IOException {
        BufferedReader in = new BufferedReader (
        new InputStreamReader(url.openStream()));

        String htmlValue = "";
        String inputLine;
        while ((inputLine = in.readLine()) != null) {
            System.out.println(inputLine);
            htmlValue += inputLine;
        }
        in.close();
        
        return htmlValue;
    }

    public void browse() throws Exception {
        Desktop.getDesktop().browse(url.toURI());
    }

    private URL url;
}