public class Ball {
    private int weight;
    private String type;
    public Ball(int w,String t){
        weight=w;
        type=t;
    }
    public Ball(int w){
        weight=w;
    }
    public Ball(){
        weight=12;
        type="Basketball";
    }
    public void setWeight(int weight){
        this.weight=weight;
    }
    public void setType(String type){
        this.type=type;
    }
    public int getWeight(){
        return weight;
    }
    public String toString(){
        return this.type +" - is the type of the ball ";
    }
}
