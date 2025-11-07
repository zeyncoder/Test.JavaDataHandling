package level2.trafficlight;

public enum Lights {
    RED(30),
    YELLOW(5),
    GREEN(25),;
  private  int seconds;
  Lights(int seconds) {
      this.seconds = seconds;
  }
  public int getSeconds() {
        return seconds;
    }
}
