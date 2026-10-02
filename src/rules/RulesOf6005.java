package rules;

/**
 * Rules of 6.005 collaboration policy for using code in an assignment.
 */
public class RulesOf6005 {

    /**
     * Decides whether a piece of code may be used in an assignment.
     *
     * @param writtenByYourself true if you wrote the code yourself
     * @param availableToOthers true if the code is publicly available to others
     * @param writtenAsCourseWork true if the code was written as course work
     *        (by other students, this term or any previous term)
     * @param citingYourSource true if you cite the source of the code
     * @param implementationRequired true if the assignment requires you to
     *        implement this functionality yourself
     * @return true if the code may be used in the assignment
     */
    public static boolean mayUseCodeInAssignment(boolean writtenByYourself,
            boolean availableToOthers, boolean writtenAsCourseWork,
            boolean citingYourSource, boolean implementationRequired) {
            // Rule 1: your own code may always be used
            if (writtenByYourself) {
                return true;
            }
            // Rule 2: someone else's code is allowed only if it is publicly
            // available, was NOT written as course work, is cited, and the
            // assignment does not require implementing it yourself
            return availableToOthers && !writtenAsCourseWork
                    && citingYourSource && !implementationRequired;
        }
    

    /**
     * Entry point: prints results for sample inputs.
     */
    public static void main(String[] args) {
        System.out.println("Own code: "
                + mayUseCodeInAssignment(true, false, false, false, false));
        System.out.println("Public code, cited, not course work: "
                + mayUseCodeInAssignment(false, true, false, true, false));
        System.out.println("Another student's course work: "
                + mayUseCodeInAssignment(false, true, true, true, false));
    }
}
