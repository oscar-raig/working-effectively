package raig.org.chapter10.helpfullanguagefeature;

import java.util.stream.Stream;

public final class HttpPostedFile {
  private HttpPostedFile() {

  }

  public String FileName;
  public int ContentLength;
  public Stream InputStream;
}
