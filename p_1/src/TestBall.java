public class TestBall {
    public static void main(String[] args){
        Ball b1=new Ball(12,"Basketball");
        Ball b2=new Ball(0,"Football");
        b2.setWeight(13);
        System.out.println(b2.getWeight());
        System.out.println(b2.toString());


    }
}
