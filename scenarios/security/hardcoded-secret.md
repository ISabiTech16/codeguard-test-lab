# Security Test: Hardcoded Credential

- **Test ID:** SEC-001
- **Feature:** Deterministic secret detection
- **Category:** Security
- **Status:** Pending execution
- **Purpose:** Verify that CodeGuard detects a planted credential without incorrectly flagging a clean configuration.

## 1. Vulnerable Example

Create a temporary Java file named `AppConfig.java`:

```java
public final class AppConfig {
    // Synthetic test value. Never use a real credential.
    public static final String API_KEY =
        "AKIAIOSFODNN7EXAMPLE";
}
```

This is a deliberately planted AWS-style access-key example. It uses a publicly documented example pattern and is not intended to authenticate against any service.

## 2. Clean Example

Create a second temporary Java file named `AppConfig.java` in a separate test scenario:

```java
public final class AppConfig {
    public static String getApiKey() {
        return System.getenv("APP_API_KEY");
    }
}
```

The clean example reads the value from an environment variable instead of embedding a credential in source code.

## 3. Expected Results

| Check | Expected behavior |
|---|---|
| Vulnerable example | Detect a hardcoded credential if the configured rule supports this pattern. |
| Clean example | Do not report a hardcoded credential solely because an environment variable is referenced. |
| Severity | Match the configured secret-detection rule's severity. |
| Merge policy | Follow the rule's configured blocking policy. |
| Evidence | Identify the affected file and relevant code location. |

## 4. Execution Procedure

1. Run the vulnerable example through CodeGuard's actual diff-review workflow.
2. Record whether the deterministic secret rule fires.
3. Run the clean example through the same workflow.
4. Record any findings in both cases.
5. Compare the actual findings with the expected behavior.
6. Save the test output or a screenshot as evidence.

## 5. Pass/Fail Criteria

**PASS** when the vulnerable example triggers the intended secret-detection rule and the clean example does not trigger that same rule.

**FAIL** when the vulnerable example is missed, the clean example produces a false positive for that rule, or the finding does not meet the configured rule's expected behavior.

If the rule does not support this credential pattern, record the result as an unsupported detection case rather than claiming that the entire secret-detection feature is broken.

## 6. Results Log

- Vulnerable example detected: Not tested
- Clean example remains quiet: Not tested
- Rule ID returned: Not tested
- Severity returned: Not tested
- Merge verdict: Not tested
- Evidence: Not attached
- Defect or follow-up: Pending execution

## 7. Limitations

This is one synthetic test, not a representative security benchmark. Passing it does not establish comprehensive secret-detection coverage or real-world accuracy.
