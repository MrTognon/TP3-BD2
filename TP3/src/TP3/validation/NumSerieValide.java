package TP3.validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = NumSerieValidator.class)
@Target({ ElementType.FIELD, ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)
public @interface NumSerieValide {
    String message() default "Numéro de série invalide";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
