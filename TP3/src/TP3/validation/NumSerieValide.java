package TP3.validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import java.lang.annotation.*;

// Annotation de validation
@Documented
@Constraint(validatedBy = NumSerieValidator.class)
@Target({ ElementType.FIELD, ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)
public @interface NumSerieValide { // Nom de la contrainte
    String message() default "Numéro de série invalide"; // Message de violation
    Class<?>[] groups() default {}; // Groupes de validation
    Class<? extends Payload>[] payload() default {}; // Payloads de validation
}
