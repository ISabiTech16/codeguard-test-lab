
# Scenario: Genuine issue after a dismissal

## Setup
A dismissal exists for one specific finding.

## Change
A new, materially different security issue appears in the same area.

## Expected behavior
- The dismissal must not hide the new genuine issue.
- The new finding should retain its appropriate severity.
- The final result should reflect the configured merge policy.

## Verification
Confirm that dismissal matching is specific enough to distinguish
the original finding from the new issue.
