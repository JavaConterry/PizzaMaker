public class Product {

    private int timeToReduce;
    private String status;

    public Product(){
        timeToReduce = 10;
        setStatus();
    }

    private void setStatus(){
        status = timeToReduce>5 ? "Norm":"NotNorm";
    }

}
