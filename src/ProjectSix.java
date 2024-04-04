public class ProjectSix {
    public static void main(String[] args) {
        TrafficClass []lights=TrafficClass.values();
        for (TrafficClass light: lights){
            System.out.println("Light: "+light.name()+" Action: "+light.getAction());
        }
    }
}
