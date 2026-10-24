# Security Test: Clean Configuration — False Positive Prevention

- **Test ID:** SEC-002
- **Feature:** Deterministic secret detection and false-positive control
- **Category:** Security
- **Status:** Pending execution

## 1. Objective

Verify that CodeGuard does not report a hardcoded credential when application code reads its configuration from an environment variable.

A clean change should not be blocked merely because it references an API key variable.

## 2. Test Fixture

File: `src/main/java/com/example/AppConfig.java`

```java
package com.example;

public final class AppConfig {

    private AppConfig() {}

    public static String getApiKey() {
        return System.getenv("APP_API_KEY");
    }
}
```

## 3. Test Procedure

1. Create a test PR containing the fixture above.
2. Run CodeGuard's normal review workflow.
3. Record every finding, including its rule ID, severity, and file.
4. Check whether any finding claims that the environment-variable reference itself is a hardcoded secret.
5. Record the merge verdict.

## 4. Expected Results

- No hardcoded-secret finding solely because `APP_API_KEY` is referenced.
- No unrelated security finding caused solely by the fixture.
- No merge block caused solely by this compliant configuration.
- Any independent findings must be reviewed separately.

## 5. Pass/Fail Criteria

**PASS:** CodeGuard does not flag the environment-variable reference as a hardcoded credential, and the change is not blocked for that reason.

**FAIL:** CodeGuard reports a hardcoded-secret finding against the environment-variable reference or blocks the change solely because of that false positive.

**INCONCLUSIVE:** The test cannot run, the relevant rule is disabled, or the test input does not reach the expected analysis path.

## 6. Results Log

- Test executed: No
- Hardcoded-secret false positive: Not tested
- Merge verdict: Not tested
- Evidence: Not attached
- Defect or follow-up: Pending execution

## 7. Limitations

This fixture tests one clean configuration pattern. It does not prove that all environment-variable usage is safe or that CodeGuard can detect every possible credential exposure.
