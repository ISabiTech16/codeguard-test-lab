
# CodeGuard Comprehensive QA Campaign

## Run information
- Branch: qa/comprehensive-codeguard-test
- PR:
- Reviewed commit SHA:
- CodeGuard version:
- Review settings:
- Validation enabled:
- Validation network setting:
- Date:

## Previously observed defects
- [ ] Validation ERROR incorrectly resulted in merge PASS.
- [ ] Behavior Impact summary showed zero references while listing six.
- [ ] Markdown fence lines generated high-severity security findings.
- [ ] AI suggested-fix behavior may weaken the original test.
- [ ] Stale-review protection requires confirmation.

## Static analysis and evidence
- [ ] SQL concatenation detected on added lines.
- [ ] Weak hash detected.
- [ ] Empty catch detected.
- [ ] Dynamic command execution detected.
- [ ] Clean parameterized SQL is not flagged for concatenation.
- [ ] Clean control methods are not incorrectly flagged.
- [ ] Every finding has a valid verification label.
- [ ] AI confidence does not exceed the documented verification cap.
- [ ] Finding locations and quoted snippets match the reviewed commit.

## Test quality
- [ ] Missing assertions detected.
- [ ] Trivial assertions detected.
- [ ] Self-comparison detected.
- [ ] Swallowed exception detected.
- [ ] Disabled test detected.
- [ ] Valid assertions remain unflagged.
- [ ] Changed-method/test mapping is reviewed for false positives.

## Team rules and policy
- [ ] Deterministic rule passes its compliant/violating self-test.
- [ ] Forbidden marker is detected on an added line.
- [ ] Rule identifies the rule that triggered it.
- [ ] AI-guidance-only rules are not represented as enforced.
- [ ] Finding ranking follows configured policy.
- [ ] Duplicate findings are collapsed with all locations retained.
- [ ] Only findings meeting all configured blocking thresholds block.
- [ ] Unverified AI claims cannot block a merge.
- [ ] Payment/authentication findings require human review.

## Validation and fixes
- [ ] PASSED requires exit code zero and at least one confirmed test.
- [ ] FAILED is distinct from ERROR and NO_TESTS_EXECUTED.
- [ ] Dependency/network failure is not reported as a pass.
- [ ] Suggested patch application status is separate from build/test status.
- [ ] A patch that merely applies is not labelled validated.
- [ ] Original test intent is preserved by suggested fixes.
- [ ] Regression-fixed and regression-broken tests are identified when supported.

## Lifecycle and learning
- [ ] Same commit/settings reuse is explained in the UI.
- [ ] Force fresh review bypasses reuse.
- [ ] Changed PR head supersedes the old review.
- [ ] Stale review does not post as current.
- [ ] Dismissal scopes work at file, directory, and repository level.
- [ ] Dismissal expiry and revoke/restore behavior work.
- [ ] High/Critical dismissal matching requires identical quoted code.
- [ ] Review history preserves commit identity.
- [ ] Feedback is scoped to the correct repository.

## Integrations and optional features
- [ ] GitHub webhook signature and PR event handling.
- [ ] Provider-specific behavior for each configured AI provider.
- [ ] Cost controls and docs-only skip behavior.
- [ ] Push-event debounce behavior.
- [ ] Large-PR file limit is disclosed.
- [ ] Mutation testing with opt-in enabled.
- [ ] Ticket validation with opt-in enabled.
- [ ] Docker validation in the actual isolated container.
- [ ] No credentials or sensitive host resources enter untrusted builds.

## Final result
- Passed:
- Failed:
- Inconclusive:
- Defects to fix:
- Regression tests required:
