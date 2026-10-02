package rules;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class RulesOf6005Test {

    @Test
    public void testMayUseCodeInAssignment() {
        // Your own code may always be used
        assertTrue(RulesOf6005.mayUseCodeInAssignment(true, false, false, false, false));
        // Another student's course work may never be used
        assertFalse(RulesOf6005.mayUseCodeInAssignment(false, true, true, true, false));
    }

    @Test
    public void testOwnCodeAllowedEvenWithoutCitation() {
        // Rule: code written by yourself needs no citation
        assertTrue(RulesOf6005.mayUseCodeInAssignment(true, true, false, false, true));
    }

    @Test
    public void testPublicCodeWithCitationAllowed() {
        // Rule: public, non-course-work code is allowed when cited
        assertTrue(RulesOf6005.mayUseCodeInAssignment(false, true, false, true, false));
    }

    @Test
    public void testPublicCodeWithoutCitationNotAllowed() {
        // Rule: external code must be attributed
        assertFalse(RulesOf6005.mayUseCodeInAssignment(false, true, false, false, false));
    }

    @Test
    public void testImplementationRequiredNotAllowed() {
        // Rule: if the assignment says "implement X", you cannot reuse external code
        assertFalse(RulesOf6005.mayUseCodeInAssignment(false, true, false, true, true));
    }

    @Test
    public void testNotAvailableToOthersNotAllowed() {
        // Rule: code that is not publicly available is not allowed
        assertFalse(RulesOf6005.mayUseCodeInAssignment(false, false, false, true, false));
    }
}