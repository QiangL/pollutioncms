package com.pollutioncns.test.service.validate;

import com.pollutioncms.service.dto.UserDTO;
import com.pollutioncns.test.BaseTest;
import org.junit.Test;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.ValidatorFactory;
import java.util.Set;

/**
 * @author liqiag
 * @discription ValidateTest
 * @date 2018-04-20
 **/
public class ValidateTest{

    @Test
    public void test(){
        UserDTO userDTO = new UserDTO();
        ValidatorFactory f= Validation.buildDefaultValidatorFactory();
        f.getValidator().validate(userDTO).forEach((ConstraintViolation<UserDTO> set)->System.out.println(set));

    }
}
