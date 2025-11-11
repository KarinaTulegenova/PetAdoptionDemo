package org.core.petadoption.controller.dto;

public class AdoptionResponse {
    private boolean success;
    private String message;
    private PetInfoDto pet;

    public AdoptionResponse() {
    }

    public AdoptionResponse(boolean success, String message) {
        this.success = success;
        this.message = message;
    }

    public AdoptionResponse(boolean success, String message, PetInfoDto pet) {
        this.success = success;
        this.message = message;
        this.pet = pet;
    }
    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public PetInfoDto getPet() {
        return pet;
    }

    public void setPet(PetInfoDto pet) {
        this.pet = pet;
    }
}