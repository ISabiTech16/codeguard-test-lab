# CodeGuard AI — Test Lab

An independent, reproducible testing lab for evaluating CodeGuard AI, an AI-assisted code review tool.

This repository contains synthetic code samples, deliberately introduced defects, clean changes, regression scenarios, and testing documentation. The goal is to evaluate how CodeGuard handles real-world code review challenges without publishing private application source code.

## What We're Testing

- **Security detection:** Hardcoded secrets, SQL injection patterns, and other security-sensitive changes.
- **Test quality:** Missing tests, weak assertions, and tests that fail to verify important behavior.
- **Impact analysis:** Changes that may affect callers, dependent components, and existing functionality.
- **Team rules:** Whether configured coding standards and custom rules are enforced correctly.
- **Dismissal safety:** Whether dismissing a false positive accidentally hides a real finding.
- **Merge policy:** Whether unverified AI claims can block a merge and whether sensitive findings require human review.
- **Docker integration:** Whether isolated execution and supported test workflows behave as expected.
- **Regression testing:** Whether changes to detection rules, ranking, or suppression introduce new defects.

## Repository Structure

```text
scenarios/
  security/
  test-quality/
  impact-analysis/
  team-rules/
  dismissals/
  merge-policy/

docker/
  fixtures/

github-prs/
  vulnerable-change/
  clean-change/

results/
```

Directories will be populated as individual experiments are developed.

## Testing Principles

1. Define the expected behavior before running a test.
2. Use synthetic code and fake credentials only.
3. Test both vulnerable changes and compliant changes.
4. Record false positives, false negatives, and unexpected behavior.
5. Keep test fixtures reproducible.
6. Retest after every fix.
7. Publish results honestly, including limitations and failures.

## Existing Benchmark

CodeGuard AI includes a labelled benchmark with three sets:

- `dev`: cases used during development.
- `heldout`: cases reserved for checking changes outside the development set.
- `gaps`: known detection gaps that remain undetected until deliberately fixed.

The current benchmark contains 43 development cases, 12 held-out cases, and 6 known-gap cases. These are planted cases, not an independent sample of real pull requests, so their scores should not be presented as real-world accuracy.

The benchmark regression test is:

```bash
mvn -Dtest=BenchmarkRegressionTest test
```

This command is documentation for running tests in the CodeGuard project; it is not executed by this repository's README.

## Results and Evidence

Each experiment should document:

- Test ID and feature
- Test setup and inputs
- Expected result
- Actual result
- Pass or fail
- Evidence and reproducibility notes
- Defects discovered and follow-up fixes

## Security

Never commit real API keys, access tokens, passwords, private customer data, or production secrets.

All intentionally vulnerable examples must use synthetic data and remain isolated from production systems.

## Building in Public

This repository supports transparent development updates across GitHub, Indie Hackers, DEV Community, Contra, Instagram, and X.

Public posts will be based on actual test runs and verified evidence. A successful planted test does not, by itself, establish real-world detection accuracy.

## Disclaimer

This is a testing and documentation repository. It does not contain the complete CodeGuard AI application or establish that any particular feature is production-ready.

CodeGuard AI is evaluated through controlled experiments, regression tests, and progressively more realistic integration scenarios.
