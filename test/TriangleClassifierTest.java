import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleClassifierTest {

    @Test
    void classifier1() {
        String result = TriangleClassifier.classifier(2,2,2);
        assertEquals("Tam Giác Đều",result);
    }

    @Test
    void classifier2() {
        String result = TriangleClassifier.classifier(2,2,3);
        assertEquals("Tam Giác Cân",result);
    }

    @Test
    void classifier3() {
        String result = TriangleClassifier.classifier(3,4,5);
        assertEquals("Tam Giác Thường",result);
    }

    @Test
    void classifier4() {
        String result = TriangleClassifier.classifier(8,2,3);
        assertEquals("Không Phải Tam Giác",result);
    }

    @Test
    void classifier5() {
        String result = TriangleClassifier.classifier(-1,2,1);
        assertEquals("Không Phải Tam Giác",result);
    }

    @Test
    void classifier6() {
        String result = TriangleClassifier.classifier(0,1,1);
        assertEquals("Không Phải Tam Giác",result);
    }
}