public class Shifter implements CharSequence {

  public String shifts;
  int a;

  public Shifter(String shifts, int a) {
    this.shifts = shifts;
    this.a = a;

  }

  @Override
  public int length() {
    return shifts.length();
  }

  @Override
  public char charAt(int index) {
    return shifts.charAt(index+2);
  }

  @Override
  public CharSequence subSequence(int start, int end) {
    return null;
  }
}
