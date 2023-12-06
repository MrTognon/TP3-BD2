package TP3.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class NumSerieValidator implements ConstraintValidator<NumSerieValide, String> {

    @Override
    public void initialize(NumSerieValide constraintAnnotation) {
        // Initialisation si nécessaire
    }

    @Override
    public boolean isValid(String numSerie, ConstraintValidatorContext context) {
        if (numSerie == null) {
            return false;
        }
        return numSerie.matches("SN-[a-z]{3}[0-9]{6}");
    }
}
