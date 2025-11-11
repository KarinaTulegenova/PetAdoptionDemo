package org.core.petadoption.controller.dto;

public class AdoptionRequest {
    private String petId;
    private String adopterName;
    private String adopterEmail;
    private String message;

    public AdoptionRequest() {}

    public String getPetId() { return petId; }
    public void setPetId(String petId) { this.petId = petId; }

    public String getAdopterName() { return adopterName; }
    public void setAdopterName(String adopterName) { this.adopterName = adopterName; }

    public String getAdopterEmail() { return adopterEmail; }
    public void setAdopterEmail(String adopterEmail) { this.adopterEmail = adopterEmail; }

    public String getMessage() { return message; }
    public void setMessage(String message) { this.message = message; }
}
