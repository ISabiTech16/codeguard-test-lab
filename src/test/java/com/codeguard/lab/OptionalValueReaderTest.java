import static org.junit.jupiter.api.Assertions.assertEquals;
@Test
void emptyOptionalShouldReturnFallback() {
    OptionalValueReader reader = new OptionalValueReader();

    assertEquals(
        "fallback",
        reader.readValue(Optional.empty())
    );
}
