package lesson2.task4;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

public class Main {

    static File file = new File("src\\res\\yahoo.xml");
    static String request = "http://query.yahooapis.com/v1/public/yql?format=xml&q=select%20*%20from%20" +
            "yahoo.finance.xchange%20where%20pair%20in%20(\"USDEUR\",%20\"USDUAH\")&env=store://datatables.org/alltableswithkeys";


    public static void main(String[] args) throws Exception {

        performRequest(request);
        JAXBContext jaxbContext = JAXBContext.newInstance(Query.class);
        Unmarshaller um = jaxbContext.createUnmarshaller();
        Query query = (Query) um.unmarshal(file);
        System.out.println(query);

    }

    private static void performRequest(String urlStr) throws IOException {

        URL url = new URL(urlStr);
        StringBuilder sb = new StringBuilder();
        HttpURLConnection http = (HttpURLConnection) url.openConnection();
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(http.getInputStream()));
            char[] buf = new char[1000000];

            int r = 0;
            do {
                if ((r = br.read(buf)) > 0)
                    sb.append(new String(buf, 0, r));
            } while (r > 0);
        } finally {
            http.disconnect();
        }

        FileWriter fw = new FileWriter(file);
        fw.write(sb.toString());
        fw.flush();
        fw.close();
        System.out.println("Save file OK");

    }

}