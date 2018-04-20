package com.pollutioncms.service.utils;

import org.hibernate.validator.HibernateValidator;
import org.hibernate.validator.HibernateValidatorConfiguration;

import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

/**
 * @author liqiag
 * @discription ValidateFactory
 * @date 2018-04-20
 **/
public class ValidateFactory {

    public static Validator getValidator(){
        return factory.getValidator();
    }

    private static ValidatorFactory factory;

    static{
        HibernateValidatorConfiguration configuration = Validation.byProvider( HibernateValidator.class ).configure();
        factory = configuration.addProperty( "hibernate.validator.fail_fast", "true" ).buildValidatorFactory();
    }
}
