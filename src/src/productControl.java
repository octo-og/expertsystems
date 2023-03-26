public class productControl {
    private String name;
    private float size;
    private float weight;
    private float price;
    private String color;
    private String id;
// constructor brought problems in the db, had to get rid of it advise to use getters and setters
/*    public productControl(String name, float size, float weight, float price, String color) {
        this.name = name;
        this.size = size;
        this.weight = weight;
        this.price = price;
        this.color = color;
    }*/

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String same) {
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
        String Idd =this.name.concat("");
        return "";
    }
    public String[] displayNames(){
        databaseControl databaseControl = new databaseControl();
        int length = databaseControl.nameCount();
        String[] listNames = new String[length];
        for (int i =0;i<length;i++){
            listNames[i]=databaseControl.name().get(i);
        }
        return listNames;
    }
    public String[] displayproductid(){
        databaseControl databaseControl = new databaseControl();
        int length = databaseControl.nameCount();
        String[] listid = new String[length];
        for (int i =0;i<length;i++){
            listid[i]=databaseControl.productID().get(i);
        }
        return listid;
    }

}
