package raig.org.chapter10.helpfullanguagefeature;


import java.util.Collection;
import java.util.Map;
import java.util.Set;

public final class HttpFileCollection implements Map<String,HttpPostedFile> {

  @Override
  public int size() {
    return 0;
  }

  @Override
  public boolean isEmpty() {
    return false;
  }

  @Override
  public boolean containsKey(Object key) {
    return false;
  }

  @Override
  public boolean containsValue(Object value) {
    return false;
  }

  @Override
  public HttpPostedFile get(Object key) {
    return null;
  }

  @Override
  public HttpPostedFile put(String key, HttpPostedFile value) {
    return null;
  }

  @Override
  public HttpPostedFile remove(Object key) {
    return null;
  }

  @Override
  public void putAll(Map<? extends String, ? extends HttpPostedFile> map) {

  }

  @Override
  public void clear() {

  }

  @Override
  public Set<String> keySet() {
    return null;
  }

  @Override
  public Collection<HttpPostedFile> values() {
    return null;
  }

  @Override
  public Set<Entry<String, HttpPostedFile>> entrySet() {
    return null;
  }
}
