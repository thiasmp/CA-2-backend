package dtos;

public class OurDTO {
    private String activity;
    private String type;
    private String fact;
    private String message;
    private String name;
    private String gender;
    private String probability;

    public OurDTO() {
    }

    public OurDTO(BoredDTO boredDTO, CatDTO catDTO, DogDTO dogDTO, GenderizeDTO genderizeDTO) {
        this.activity = boredDTO.getActivity();
        this.type = boredDTO.getType();
        this.fact = catDTO.getFact();
        this.message = dogDTO.getMessage();
        this.name = genderizeDTO.getName();
        this.gender = genderizeDTO.getGender();
        this.probability = genderizeDTO.getProbability();
    }

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFact() {
        return fact;
    }

    public void setFact(String fact) {
        this.fact = fact;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getProbability() {
        return probability;
    }

    public void setProbability(String probability) {
        this.probability = probability;
    }
}
