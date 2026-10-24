
package fixtures.regression;

public class RepeatedFindingExample {
    public String normalizeLabel(String label) {
        if (label == null) {
            return "";
        }

        return label.trim().toLowerCase();
    }
}
