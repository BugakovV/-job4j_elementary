package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class VectorTest {

    @Test
    void whenVectors12And34ThenResult46() {
        int x1 = 1, y1 = 2, x2 = 3, y2 = 4;
        String expected ="(4, 6)";
        String output = Vector.addVectors(x1,y1,x2,y2);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenVectorsMinus59And34ThenResultMinus25() {
        int x1 = -5, y1 = -9, x2 = 3, y2 = 4;
        String expected ="(-2, -5)";
        String output = Vector.addVectors(x1,y1,x2,y2);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenVectorsMinus59AndMinus36ThenResultMinus815() {
        int x1 = -5, y1 = -9, x2 = -3, y2 = -6;
        String expected ="(-8, -15)";
        String output = Vector.addVectors(x1,y1,x2,y2);
        assertThat(output).isEqualTo(expected);
    }

}