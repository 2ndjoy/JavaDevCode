public class ConsTructor {
    int model;
    ConsTructor(int model){
        this.model=model;

        System.out.println(model);
    }

    public static void main(String[] args) {
        ConsTructor cons=new ConsTructor(2000);

    }
}
