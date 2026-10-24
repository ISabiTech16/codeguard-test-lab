
# Scenario: Previously dismissed finding

## Setup
A reviewer dismisses a known finding because the team has confirmed
that the specific case is acceptable.

## Change
The same finding appears again in a later review.

## Expected behavior
- Apply the configured dismissal-matching policy.
- Avoid repeating the same dismissed noise when the dismissal still applies.
- Do not suppress unrelated findings.

## Verification
Check the actual finding identity, dismissal scope, and final output.
