public class productControl {
    private String name;
    private float size;
    private float weight;
    private float price;
    private String color;

    public productControl(String name, float size, float weight, float price, String color) {
        this.name = name;
        this.size = size;
        this.weight = weight;
        this.price = price;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setSame(String same) {
        this.name = same;
    }

    public float getSize() {
        return size;
    }

    public void setSize(float size) {
        this.size = size;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    private String createProductId(){
        String Id =this.name.concat("");
        return "";
    }
}
