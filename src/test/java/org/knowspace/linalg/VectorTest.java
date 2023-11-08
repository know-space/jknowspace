package org.knowspace.linalg;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class VectorTest {
    
    private final Vector firstVec2D = new Vector(1, 2);
    private final Vector secondVec2D = new Vector(3, 4);
    private final Vector firstVec3D = new Vector(1, 2, 3);
    private final Vector secondVec3D = new Vector(4, 5, 6);
    private final Vector firstVec4D = new Vector(1, 2, 3, 4);
    private final Vector secondVec4D = new Vector(5, 6, 7, 8);
    private final Vector firstVec5D = new Vector(1, 2, 3, 4, 5);
    private final Vector secondVec5D = new Vector(6, 7, 8, 9, 10);
    private final Vector firstVec6D = new Vector(1, 2, 3, 4, 5, 6);
    private final Vector secondVec6D = new Vector(7, 8, 9, 10, 11, 12);

    @Test
    public void testAddition2D() {
        Vector result = firstVec2D.getSummationVector(secondVec2D);
        assertEquals(4, result.getElement(0), 0);
        assertEquals(6, result.getElement(1), 0);
    }

    @Test
    public void testAddition3D() {
        Vector result = firstVec3D.getSummationVector(secondVec3D);
        assertEquals(5, result.getElement(0), 0);
        assertEquals(7, result.getElement(1), 0);
        assertEquals(9, result.getElement(2), 0);
    }

    @Test
    public void testAddition4D() {
        Vector result = firstVec4D.getSummationVector(secondVec4D);
        assertEquals(6, result.getElement(0), 0);
        assertEquals(8, result.getElement(1), 0);
        assertEquals(10, result.getElement(2), 0);
        assertEquals(12, result.getElement(3), 0);
    }

    @Test
    public void testAddition5D() {
        Vector result = firstVec5D.getSummationVector(secondVec5D);
        assertEquals(7, result.getElement(0), 0);
        assertEquals(9, result.getElement(1), 0);
        assertEquals(11, result.getElement(2), 0);
        assertEquals(13, result.getElement(3), 0);
        assertEquals(15, result.getElement(4), 0);
    }

    @Test
    public void testAddition6D() {
        Vector result = firstVec6D.getSummationVector(secondVec6D);
        assertEquals(8, result.getElement(0), 0);
        assertEquals(10, result.getElement(1), 0);
        assertEquals(12, result.getElement(2), 0);
        assertEquals(14, result.getElement(3), 0);
        assertEquals(16, result.getElement(4), 0);
        assertEquals(18, result.getElement(5), 0);
    }

    @Test
    public void testSubtraction2D() {
        Vector result = firstVec2D.getDifferenceVector(secondVec2D);
        assertEquals(-2, result.getElement(0), 0);
        assertEquals(-2, result.getElement(1), 0);
    }

    @Test
    public void testSubtraction3D() {
        Vector result = firstVec3D.getDifferenceVector(secondVec3D);
        assertEquals(-3, result.getElement(0), 0);
        assertEquals(-3, result.getElement(1), 0);
        assertEquals(-3, result.getElement(2), 0);
    }

    @Test
    public void testSubtraction4D() {
        Vector result = firstVec4D.getDifferenceVector(secondVec4D);
        assertEquals(-4, result.getElement(0), 0);
        assertEquals(-4, result.getElement(1), 0);
        assertEquals(-4, result.getElement(2), 0);
        assertEquals(-4, result.getElement(3), 0);
    }

    @Test
    public void testSubtraction5D() {
        Vector result = firstVec5D.getDifferenceVector(secondVec5D);
        assertEquals(-5, result.getElement(0), 0);
        assertEquals(-5, result.getElement(1), 0);
        assertEquals(-5, result.getElement(2), 0);
        assertEquals(-5, result.getElement(3), 0);
        assertEquals(-5, result.getElement(4), 0);
    }

    @Test
    public void testSubtraction6D() {
        Vector result = firstVec6D.getDifferenceVector(secondVec6D);
        assertEquals(-6, result.getElement(0), 0);
        assertEquals(-6, result.getElement(1), 0);
        assertEquals(-6, result.getElement(2), 0);
        assertEquals(-6, result.getElement(3), 0);
        assertEquals(-6, result.getElement(4), 0);
        assertEquals(-6, result.getElement(5), 0);
    }

    @Test
    public void testDotProduct2D() {
        double result = firstVec2D.getDotProduct(secondVec2D);
        assertEquals(11, result, 0);
    }

    @Test
    public void testDotProduct3D() {
        double result = firstVec3D.getDotProduct(secondVec3D);
        assertEquals(32, result, 0);
    }

    @Test
    public void testDotProduct4D() {
        double result = firstVec4D.getDotProduct(secondVec4D);
        assertEquals(70, result, 0);
    }

    @Test
    public void testDotProduct5D() {
        double result = firstVec5D.getDotProduct(secondVec5D);
        assertEquals(130, result, 0);
    }

    @Test
    public void testDotProduct6D() {
        double result = firstVec6D.getDotProduct(secondVec6D);
        assertEquals(217, result, 0);
    }

    @Test
    public void testMagnitude2D() {
        double result = firstVec2D.getMagnitude();
        assertEquals(Math.sqrt(5), result, 0);
    }

    @Test
    public void testMagnitude3D() {
        double result = firstVec3D.getMagnitude();
        assertEquals(Math.sqrt(14), result, 0);
    }

    @Test
    public void testMagnitude4D() {
        double result = firstVec4D.getMagnitude();
        assertEquals(Math.sqrt(30), result, 0);
    }

    @Test
    public void testMagnitude5D() {
        double result = firstVec5D.getMagnitude();
        assertEquals(Math.sqrt(55), result, 0);
    }

    @Test
    public void testMagnitude6D() {
        double result = firstVec6D.getMagnitude();
        assertEquals(Math.sqrt(91), result, 0);
    }

    @Test
    public void testCrossProduct3D() {
        Vector result = firstVec3D.getCrossProduct(secondVec3D);
        assertEquals(-3, result.getElement(0), 0);
        assertEquals(6, result.getElement(1), 0);
        assertEquals(-3, result.getElement(2), 0);
    }

    @Test
    public void testScalarMultiplication2D() {
        Vector result = firstVec2D.getScaledVector(2);
        assertEquals(2, result.getElement(0), 0);
        assertEquals(4, result.getElement(1), 0);
    }

    @Test
    public void testScalarMultiplication3D() {
        Vector result = firstVec3D.getScaledVector(2);
        assertEquals(2, result.getElement(0), 0);
        assertEquals(4, result.getElement(1), 0);
        assertEquals(6, result.getElement(2), 0);
    }

    @Test
    public void testScalarMultiplication4D() {
        Vector result = firstVec4D.getScaledVector(2);
        assertEquals(2, result.getElement(0), 0);
        assertEquals(4, result.getElement(1), 0);
        assertEquals(6, result.getElement(2), 0);
        assertEquals(8, result.getElement(3), 0);
    }

    @Test
    public void testScalarMultiplication5D() {
        Vector result = firstVec5D.getScaledVector(2);
        assertEquals(2, result.getElement(0), 0);
        assertEquals(4, result.getElement(1), 0);
        assertEquals(6, result.getElement(2), 0);
        assertEquals(8, result.getElement(3), 0);
        assertEquals(10, result.getElement(4), 0);
    }

    @Test
    public void testScalarMultiplication6D() {
        Vector result = firstVec6D.getScaledVector(2);
        assertEquals(2, result.getElement(0), 0);
        assertEquals(4, result.getElement(1), 0);
        assertEquals(6, result.getElement(2), 0);
        assertEquals(8, result.getElement(3), 0);
        assertEquals(10, result.getElement(4), 0);
        assertEquals(12, result.getElement(5), 0);
    }

    @Test
    public void testNormalize2D() {
        Vector result = firstVec2D.getNormalizedVector();
        assertEquals(0.4472135954999579, result.getElement(0), 0);
        assertEquals(0.8944271909999159, result.getElement(1), 0);
    }

    @Test
    public void testNormalize3D() {
        Vector result = firstVec3D.getNormalizedVector();
        assertEquals(0.2672612419124244, result.getElement(0), 0);
        assertEquals(0.5345224838248488, result.getElement(1), 0);
        assertEquals(0.8017837257372732, result.getElement(2), 0);
    }

    @Test
    public void testNormalize4D() {
        Vector result = firstVec4D.getNormalizedVector();
        assertEquals(0.18257418583505536, result.getElement(0), 0);
        assertEquals(0.3651483716701107, result.getElement(1), 0);
        assertEquals(0.5477225575051661, result.getElement(2), 0);
        assertEquals(0.7302967433402214, result.getElement(3), 0);
    }

    @Test
    public void testNormalize5D() {
        Vector result = firstVec5D.getNormalizedVector();
        assertEquals(0.13483997249264842, result.getElement(0), 0);
        assertEquals(0.26967994498529684, result.getElement(1), 0);
        assertEquals(0.40451991747794525, result.getElement(2), 0);
        assertEquals(0.5393598899705937, result.getElement(3), 0);
        assertEquals(0.6741998624632421, result.getElement(4), 0);
    }

    @Test
    public void testNormalize6D() {
        Vector result = firstVec6D.getNormalizedVector();
        assertEquals(0.10482848367219183, result.getElement(0), 0);
        assertEquals(0.20965696734438366, result.getElement(1), 0);
        assertEquals(0.3144854510165755, result.getElement(2), 0);
        assertEquals(0.4193139346887673, result.getElement(3), 0);
        assertEquals(0.5241424183609591, result.getElement(4), 0);
        assertEquals(0.628970902033151, result.getElement(5), 0);
    }

    @Test
    public void testAngle2D() {
        double result = firstVec2D.getAngle(secondVec2D);
        assertEquals(0.17985349979247847, result, 0);
    }

    @Test
    public void testAngle3D() {
        double result = firstVec3D.getAngle(secondVec3D);
        assertEquals(0.2257261285527342, result, 0);
    }
}
