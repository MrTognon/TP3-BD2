package TP3.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

/**
 * Validateur pour la contrainte NumSerieValide.
 */
public class NumSerieValidator implements ConstraintValidator<NumSerieValide, String> {

    // Méthodes de l'interface ConstraintValidator
    @Override
    public void initialize(NumSerieValide constraintAnnotation) { // Récupération des paramètres de la contrainte
        // Initialisation si nécessaire
    }

    @Override
    public boolean isValid(String numSerie, ConstraintValidatorContext context) { // Validation de la contrainte
        if (numSerie == null) { // Si le numéro de série est null, la contrainte est respectée
            return false; // On ne peut pas vérifier la validité du numéro de série
        }
        return numSerie.matches("SN-[a-z]{3}[0-9]{6}"); // Vérification de la validité du numéro de série
    }
}
