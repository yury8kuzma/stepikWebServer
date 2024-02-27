package service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;

public class UtilClass {
    public static final String INDEX_PAGE = "index.html";
    public static final String LOGIN_PAGE = "loginPage.html";
    public static final String Enter_PAGE = "enterPage.html";

    public static String getPath(String htmlPath) throws IOException {
        Path path = Path.of(htmlPath);
        /*Path abs = path.toAbsolutePath();*/
        String sPath = path.toString();
        StringBuilder sb = new StringBuilder();

        BufferedReader br = new BufferedReader(new FileReader(sPath));
        while (br.ready()) {
            sb.append(br.readLine());
        }
        return sb.toString();
    }
}
