package com.github.inthedrink.render.poc.resource;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class IntentionallyFailingTest {
    @Test
    public void failTheTest() {
        var expected = "foo";
        var actual = "bar";
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}
