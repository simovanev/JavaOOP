package InterfacesAndAbstraction._03_BirthdayCelebrations;

public class Robot implements Identifiable {
    private  String model;
    private String id;

    public Robot(String model, String id) {
        this.model = model;
        this.id = id;
    }

    @Override
    public String getId() {
        return null;
    }

    public String getModel() {
        return model;
    }
}
