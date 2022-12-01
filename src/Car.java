import java.time.LocalDate;

public class Car {
   private int id;
   private String name;
   private String model;
   private LocalDate dt_Fabrication;
   private double value;


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

   public String getModel() {
      return this.model;
   }

   public void setModel(String model) {
      this.model = model;
   }

   public LocalDate getDt_Fabrication() {
      return this.dt_Fabrication;
   }

   public void setDt_Fabrication(LocalDate dt_Fabrication) {
      this.dt_Fabrication = dt_Fabrication;
   }

   public double getValue() {
      return this.value;
   }

   public void setValue(double value) {
      this.value = value;
   }




}
