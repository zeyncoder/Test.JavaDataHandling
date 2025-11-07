package level2.trafficlight;

public class TrafficLight {
    public static void main(String[] args) {
for(Lights light : Lights.values()){
    System.out.println( light + " " + light.getSeconds() + " seconds ");

}
    }
}
