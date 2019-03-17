package com.lambda.optional;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.Optional;
import java.util.OptionalInt;

public class OptionalTest {

    @Test
    public void testBasic() {
        Optional<Integer> optionalInteger = Optional.of(4);
        Assertions.assertThat(optionalInteger.isPresent()).isTrue();
    }

    @Test
    public void testOptionalInt() {
        OptionalInt optionalInt = OptionalInt.of(4);
        Assertions.assertThat(optionalInt.isPresent()).isTrue();
    }

    @Test
    public void testEmptyOptionalString() {

        Optional<String> optional = Optional.empty();
        Assertions.assertThat(optional.isPresent()).isFalse();
        System.out.println(optional);
    }

    @Test
    public void returnWhenEmptyOptional() {

        Optional opt = Optional.empty();
        Assertions.assertThat(opt.orElse("nothing")).isEqualTo("nothing");
        Assertions.assertThat(opt.orElse(null)).isNull();
    }
}
