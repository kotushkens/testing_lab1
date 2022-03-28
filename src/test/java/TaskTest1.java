import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import task1.CosImpl;

import static org.junit.jupiter.api.Assertions.*;

public class TaskTest1 {

    private final CosImpl cosine = new CosImpl();
    private int n = 4;
    private final double delta = 0.05;

    @ParameterizedTest
    @CsvSource( {
            "-3.141, 274.511",
            "-2.973, 170.438",
            "-1.604,0.7241",
            "-1.570,0.6150",
            "-1.554,0.570",
            "-0.785,0.5406",
            "-0.125,0.9922",
            "0.126,0.9921",
            "0.785,0.5406",
    } )
    protected void test5EqualSegments( double x, double y ) {
        assertEquals( cosine.apply( x, n ), y, delta );
    }

    @ParameterizedTest
    @CsvSource( {
            "-3.141,3.141",
            "-2.973,2.973",
            "-1.604,1.604",
            "-1.570,1.570",
            "-1.554,1.554",
            "-0.785,0.785",
            "-0.125,0.125"
    } )
    public void test5Parity( double x1, double x2 ) {
        assertEquals( cosine.apply( x1, n ), cosine.apply( x2, n ), delta );
    }
}
