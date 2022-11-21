package utils;

import exceptions.EmptyListException;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

class WordUtilsTest {

    @Test
    void TestGetShortestWord_WhenValidInput_ShouldPass() throws EmptyListException {
        // given
        List<String> words = new ArrayList<>();

        // when
        words.add("first");
        words.add("second");
        words.add("test");
        words.add("third");
        words.add("fourth");

        // then
        assertThat(WordUtils.getShortestWord(words)).isEqualTo("test");
    }

    @Test
    void TestGetShortestWord_WhenListIsEmpty_ShouldThrowException() {
        // given
        List<String> words;

        // when
        words = new ArrayList<>();

        // then
        Throwable thrown = catchThrowable(() -> WordUtils.getShortestWord(words));
        assertThat(thrown).isInstanceOf(EmptyListException.class);
    }

    @Test
    void TestGetCountOfWordsOccurrences_WhenValidInput_ShouldPass() {
        // given
        String sentence = "Always code as if the guy who ends up maintaining your" +
                " code will be a violent psychopath who knows where you live";

        // when
        Map<String, Integer> countOfOccurrences = WordUtils.getCountOfWordsOccurrences(sentence);

        // then
        assertThat(countOfOccurrences).isNotEmpty()
                .containsEntry("always", 1)
                .containsEntry("code", 2)
                .doesNotContainValue(0)
                .doesNotContainValue(3);
    }

    @Test
    void TestGetCountOfWordsOccurrences_WhenEmptySentence_ShouldBeEmpty() {
        // given
        String sentence = "";

        // when
        Map<String, Integer> countOfOccurrences = WordUtils.getCountOfWordsOccurrences(sentence);

        // then
        assertThat(countOfOccurrences).isEmpty();
    }
}