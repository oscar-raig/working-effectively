package raig.org.chapter10.helpfullanguagefeature;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;


public class Helpful {


  private static final int MIN_LEN = 10;

  public List getKSRStreams(HttpFileCollection files) {

      ArrayList<Stream> list = new ArrayList<>();
      for( HttpPostedFile file : files.values()) {
        if (file.FileName.endsWith(".ksr") ||
          (file.FileName.endsWith(".txt")
          && file.ContentLength > MIN_LEN)) {
          list.add(file.InputStream);
        }
      }
    return list;
    }
}
