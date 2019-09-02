package org.miklas.ggalaxy.core.common

import org.miklas.ggalaxy.core.AbstractTest
import spock.lang.Unroll

class VectorTest extends AbstractTest {

    @Unroll
    def "Test length"(int x1, int y1, int w1, int h1, int x2, int y2, int w2, int h2, int length) {
        given:
        Point p1 = [x1, y1, w1, h1]
        Point p2 = [x2, y2, w2, h2]
        Vector vector = [p1, p2]
        expect:
        vector.length == length

        where:
        x1 | y1 | w1 | h1 | x2   | y2   | w2 | h2 | length
        1  | 1  | 10 | 10 | 1    | 1    | 10 | 10 | 0
        0  | 0  | 10 | 10 | 0    | 0    | 10 | 10 | 0
        0  | 0  | 0  | 0  | 0    | 0    | 0  | 0  | 0
        1  | 1  | 10 | 10 | 2    | 2    | 10 | 10 | 1
        1  | 1  | 10 | 10 | 22   | 22   | 10 | 10 | 29
        1  | 1  | 10 | 10 | 22   | 22   | 1  | 1  | 29
        1  | 1  | 0  | 0  | 22   | 22   | 0  | 0  | 29
        0  | 0  | 0  | 0  | 22   | 22   | 0  | 0  | 31
        0  | 0  | 0  | 0  | 10   | 10   | 0  | 0  | 14
        0  | 0  | 0  | 0  | 1000 | 1000 | 0  | 0  | 1414
    }
}
