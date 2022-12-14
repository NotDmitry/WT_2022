package by.tc.task01.service.validation;

import by.tc.task01.entity.criteria.Criteria;

import java.util.Map;

/**
 * Validator class for single criteria
 */
public class Validator {

	/**
	 * Validates the criteria by its search criteria
	 * E.g. search type of NAME criteria cannot be anything
	 * but EQUALS
	 * @param criteria criteria to validate
	 * @return true if criteria is valid, false otherwise
	 */
	public static boolean criteriaValidator(Criteria criteria) {
		if (criteria == null || criteria.getSearchCriteria() == null)
			return false;

		for (Map.Entry<String, Object> entry : criteria.getSearchCriteria().entrySet()) {
			ValueValidator validator = ValueValidatorFactory.getInstance().getValidator(entry.getKey());
			boolean isValid = true;
			isValid = validator.validate(entry.getValue());
			if (!isValid)
				return false;
		}
		return true;
	}

}