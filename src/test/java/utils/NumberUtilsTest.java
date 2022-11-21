package utils;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class NumberUtilsTest {

    @Test
    void TestGetSum_WhenValidNumbers_ShouldPass() {
        // given
        List<Integer> numbers = new ArrayList<>();

        // when
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        // then
        assertThat(NumberUtils.getSum(numbers)).isEqualTo(15);
    }

    @Test
    void TestGetSum_WhenListIsEmpty_ShouldBeZero() {
        // given
        List<Integer> numbers;

        // when
        numbers = new ArrayList<>();

        // then
        assertThat(NumberUtils.getSum(numbers)).isZero();
    }

    @Test
    void TestMultiplyOddNumber_WhenValidInput_ShouldPass() {
        // given
        List<Integer> numbers = new ArrayList<>();

        // when
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        // then
        assertThat(NumberUtils.multiplyOddNumber(numbers)).isNotEmpty()
                .containsExactly(2, 6, 10);
    }

    @Test
    void TestMultiplyOddNumber_WhenListIsEmpty_ShouldBeEmpty() {
        // given
        List<Integer> numbers;

        // when
        numbers = new ArrayList<>();

        // then
        assertThat(NumberUtils.multiplyOddNumber(numbers)).isEmpty();
    }

}