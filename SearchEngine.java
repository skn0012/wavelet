import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;

class Handler implements URLHandler {

    ArrayList<String> list = new ArrayList<String>();

    public String handleRequest(URI url) {
        String[] parameters = url.getQuery().split("=");
        if (url.getPath().contains("/add")) {
            if (parameters[0].equals("s")) {
                list.add(parameters[1]);
            }
        }
        if (url.getPath().contains("/search")) {
            if (parameters[0].equals("s")) {
                for (int i = 0; i < list.length; i++) {
                    if (list.contains())
                }
            }
        }
        return "";
    }

    public class SearchEngine {
        public static void main(String[] args) throws IOException {
            if(args.length == 0){
                System.out.println("Missing port number! Try any number between 1024 to 49151");
                return;
            }

            int port = Integer.parseInt(args[0]);

            Server.start(port, new Handler());
        }
    }
}