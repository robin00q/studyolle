package com.studyolle.modules.account.validator;

import com.studyolle.modules.account.AccountRepository;
import com.studyolle.modules.account.form.NicknameForm;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component
@NoArgsConstructor
public class NicknameValidator implements Validator {

    @Autowired
    AccountRepository accountRepository;

    @Override
    public boolean supports(Class<?> clazz) {
        return NicknameForm.class.isAssignableFrom(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        NicknameForm nicknameForm = (NicknameForm) target;
        if(accountRepository.existsByNickname(nicknameForm.getNickname())) {
            errors.rejectValue("nickname", "wrong.value", "입력하신 닉네임을 사용할 수 없습니다.");
        }
    }
}
