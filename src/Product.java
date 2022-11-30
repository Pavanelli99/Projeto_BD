import java.time.LocalDate;

public class Product {
    private int id;
    private String name;
    private String brand;
    private LocalDate dt_validity;
    private float value;


    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public LocalDate getDt_validity() {
        return this.dt_validity;
    }

    public void setDt_validity(LocalDate dt_validity) {
        this.dt_validity = dt_validity;
    }

    public float getValue() {
        return this.value;
    }

    public void setValue(float value) {
        this.value = value;
    }





}
