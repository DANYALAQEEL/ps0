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
}
