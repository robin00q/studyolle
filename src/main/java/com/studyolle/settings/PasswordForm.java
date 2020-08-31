package com.studyolle.settings;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;

@Data
@NoArgsConstructor
public class PasswordForm {

    @NotBlank
    @Length(min = 8, max = 20)
    String newPassword;

    @NotBlank
    @Length(min = 8, max = 20)
    String newPasswordConfirm;
}
