package dtos;

public class AgeDTO {
    private String name;
    private String age;
    private String probability;

    public AgeDTO() {

    }

    public AgeDTO(String name, String age, String probability) {
        this.name = name;
        this.age = age;
        this.probability = probability;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getProbability() {
        return probability;
    }

    public void setProbability(String probability) {
        this.probability = probability;
    }
}
