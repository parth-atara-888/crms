package com.effiya.crms.dto;
import javax.validation.constraints.NotBlank;
public class AccountRequestDTO {
    @NotBlank(message = "User type is mandatory")
    private String userType;
    @NotBlank(message = "User Id is mandatory")
    private String userId;

    public @NotBlank(message = "User type is mandatory") String getUserType() {
        return userType;
    }

    public void setUserType(@NotBlank(message = "User type is mandatory") String userType) {
        this.userType = userType;
    }

    public @NotBlank(message = "User Id is mandatory") String getUserId() {
        return userId;
    }

    public void setUserId(@NotBlank(message = "User Id is mandatory") String userId) {
        this.userId = userId;
    }
}
