public class Gnirts implements CharSequence {

  public String backwadrs;

  public Gnirts(String backwadrs) {
    this.backwadrs = backwadrs;
  }

  public int length() {
    return backwadrs.length();
  }


  public char charAt(int index) {
    return backwadrs.charAt(backwadrs.length() - 1 - index);
  }


  public CharSequence subSequence(int start, int end) {
    return null;
  }
}
