public enum TrafficClass {
    RED("stop"),
    YELLOW("Wait"),
    GREEN("go");

    private String action;
    private TrafficClass(String action) {
        this.action=action;
    }

    public String getAction(){
        return action;
    }

}
