package org.knowspace.linalg;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class MatrixTest {
    private final Matrix firstMat2x2 = new Matrix(
        new Vector(1, 2), 
        new Vector(3, 4)
    );
    private final Matrix secondMat2x2 = new Matrix(
        new Vector(5, 6), 
        new Vector(7, 8)
    );
    private final Matrix firstMat2x3 = new Matrix(
        new Vector(1, 2, 3), 
        new Vector(4, 5, 6)
    );
    private final Matrix secondMat2x3 = new Matrix(
        new Vector(7, 8, 9), 
        new Vector(10, 11, 12)
    );
    private final Matrix firstMat2x4 = new Matrix(
        new Vector(1, 2, 3, 4), 
        new Vector(5, 6, 7, 8)
    );
    private final Matrix secondMat2x4 = new Matrix(
        new Vector(9, 10, 11, 12), 
        new Vector(13, 14, 15, 16)
    );
    private final Matrix firstMat2x5 = new Matrix(
        new Vector(1, 2, 3, 4, 5), 
        new Vector(6, 7, 8, 9, 10)
    );
    private final Matrix secondMat2x5 = new Matrix(
        new Vector(11, 12, 13, 14, 15), 
        new Vector(16, 17, 18, 19, 20)
    );
    private final Matrix firstMat2x6 = new Matrix(
        new Vector(1, 2, 3, 4, 5, 6), 
        new Vector(7, 8, 9, 10, 11, 12)
    );
    private final Matrix secondMat2x6 = new Matrix(
        new Vector(13, 14, 15, 16, 17, 18), 
        new Vector(19, 20, 21, 22, 23, 24)
    );
    private final Matrix firstMat3x2 = new Matrix(
        new Vector(1, 2), 
        new Vector(3, 4),
        new Vector(5, 6)
    );
    private final Matrix secondMat3x2 = new Matrix(
        new Vector(7, 8), 
        new Vector(9, 10),
        new Vector(11, 12)
    );
    private final Matrix firstMat3x3 = new Matrix(
        new Vector(1, 2, 3), 
        new Vector(4, 5, 6),
        new Vector(7, 8, 9)
    );
    private final Matrix secondMat3x3 = new Matrix(
        new Vector(10, 11, 12), 
        new Vector(13, 14, 15),
        new Vector(16, 17, 18)
    );
    private final Matrix firstMat3x4 = new Matrix(
        new Vector(1, 2, 3, 4), 
        new Vector(5, 6, 7, 8),
        new Vector(9, 10, 11, 12)
    );
    private final Matrix secondMat3x4 = new Matrix(
        new Vector(13, 14, 15, 16), 
        new Vector(17, 18, 19, 20),
        new Vector(21, 22, 23, 24)
    );
    private final Matrix firstMat3x5 = new Matrix(
        new Vector(1, 2, 3, 4, 5), 
        new Vector(6, 7, 8, 9, 10),
        new Vector(11, 12, 13, 14, 15)
    );
    private final Matrix secondMat3x5 = new Matrix(
        new Vector(16, 17, 18, 19, 20), 
        new Vector(21, 22, 23, 24, 25),
        new Vector(26, 27, 28, 29, 30)
    );
    private final Matrix firstMat3x6 = new Matrix(
        new Vector(1, 2, 3, 4, 5, 6), 
        new Vector(7, 8, 9, 10, 11, 12),
        new Vector(13, 14, 15, 16, 17, 18)
    );
    private final Matrix secondMat3x6 = new Matrix(
        new Vector(19, 20, 21, 22, 23, 24), 
        new Vector(25, 26, 27, 28, 29, 30),
        new Vector(31, 32, 33, 34, 35, 36)
    );
    private final Matrix firstMat4x2 = new Matrix(
        new Vector(1, 2), 
        new Vector(3, 4),
        new Vector(5, 6),
        new Vector(7, 8)
    );
    private final Matrix secondMat4x2 = new Matrix(
        new Vector(9, 10), 
        new Vector(11, 12),
        new Vector(13, 14),
        new Vector(15, 16)
    );
    private final Matrix firstMat4x3 = new Matrix(
        new Vector(1, 2, 3), 
        new Vector(4, 5, 6),
        new Vector(7, 8, 9),
        new Vector(10, 11, 12)
    );
    private final Matrix secondMat4x3 = new Matrix(
        new Vector(13, 14, 15), 
        new Vector(16, 17, 18),
        new Vector(19, 20, 21),
        new Vector(22, 23, 24)
    );
    private final Matrix firstMat4x4 = new Matrix(
        new Vector(1, 2, 3, 4), 
        new Vector(5, 6, 7, 8),
        new Vector(9, 10, 11, 12),
        new Vector(13, 14, 15, 16)
    );
    private final Matrix secondMat4x4 = new Matrix(
        new Vector(17, 18, 19, 20), 
        new Vector(21, 22, 23, 24),
        new Vector(25, 26, 27, 28),
        new Vector(29, 30, 31, 32)
    );
    private final Matrix firstMat4x5 = new Matrix(
        new Vector(1, 2, 3, 4, 5), 
        new Vector(6, 7, 8, 9, 10),
        new Vector(11, 12, 13, 14, 15),
        new Vector(16, 17, 18, 19, 20)
    );
    private final Matrix secondMat4x5 = new Matrix(
        new Vector(21, 22, 23, 24, 25), 
        new Vector(26, 27, 28, 29, 30),
        new Vector(31, 32, 33, 34, 35),
        new Vector(36, 37, 38, 39, 40)
    );
    private final Matrix firstMat4x6 = new Matrix(
        new Vector(1, 2, 3, 4, 5, 6), 
        new Vector(7, 8, 9, 10, 11, 12),
        new Vector(13, 14, 15, 16, 17, 18),
        new Vector(19, 20, 21, 22, 23, 24)
    );
    private final Matrix secondMat4x6 = new Matrix(
        new Vector(25, 26, 27, 28, 29, 30), 
        new Vector(31, 32, 33, 34, 35, 36),
        new Vector(37, 38, 39, 40, 41, 42),
        new Vector(43, 44, 45, 46, 47, 48)
    );
    private final Matrix firstMat5x2 = new Matrix(
        new Vector(1, 2), 
        new Vector(3, 4),
        new Vector(5, 6),
        new Vector(7, 8),
        new Vector(9, 10)
    );
    private final Matrix secondMat5x2 = new Matrix(
        new Vector(11, 12), 
        new Vector(13, 14),
        new Vector(15, 16),
        new Vector(17, 18),
        new Vector(19, 20)
    );
    private final Matrix firstMat5x3 = new Matrix(
        new Vector(1, 2, 3), 
        new Vector(4, 5, 6),
        new Vector(7, 8, 9),
        new Vector(10, 11, 12),
        new Vector(13, 14, 15)
    );
    private final Matrix secondMat5x3 = new Matrix(
        new Vector(16, 17, 18), 
        new Vector(19, 20, 21),
        new Vector(22, 23, 24),
        new Vector(25, 26, 27),
        new Vector(28, 29, 30)
    );
    private final Matrix firstMat5x4 = new Matrix(
        new Vector(1, 2, 3, 4), 
        new Vector(5, 6, 7, 8),
        new Vector(9, 10, 11, 12),
        new Vector(13, 14, 15, 16),
        new Vector(17, 18, 19, 20)
    );
    private final Matrix secondMat5x4 = new Matrix(
        new Vector(21, 22, 23, 24), 
        new Vector(25, 26, 27, 28),
        new Vector(29, 30, 31, 32),
        new Vector(33, 34, 35, 36),
        new Vector(37, 38, 39, 40)
    );
    private final Matrix firstMat5x5 = new Matrix(
        new Vector(1, 2, 3, 4, 5), 
        new Vector(6, 7, 8, 9, 10),
        new Vector(11, 12, 13, 14, 15),
        new Vector(16, 17, 18, 19, 20),
        new Vector(21, 22, 23, 24, 25)
    );
    private final Matrix secondMat5x5 = new Matrix(
        new Vector(26, 27, 28, 29, 30), 
        new Vector(31, 32, 33, 34, 35),
        new Vector(36, 37, 38, 39, 40),
        new Vector(41, 42, 43, 44, 45),
        new Vector(46, 47, 48, 49, 50)
    );
    private final Matrix firstMat5x6 = new Matrix(
        new Vector(1, 2, 3, 4, 5, 6), 
        new Vector(7, 8, 9, 10, 11, 12),
        new Vector(13, 14, 15, 16, 17, 18),
        new Vector(19, 20, 21, 22, 23, 24),
        new Vector(25, 26, 27, 28, 29, 30)
    );
    private final Matrix secondMat5x6 = new Matrix(
        new Vector(31, 32, 33, 34, 35, 36), 
        new Vector(37, 38, 39, 40, 41, 42),
        new Vector(43, 44, 45, 46, 47, 48),
        new Vector(49, 50, 51, 52, 53, 54),
        new Vector(55, 56, 57, 58, 59, 60)
    );
    private final Matrix firstMat6x2 = new Matrix(
        new Vector(1, 2), 
        new Vector(3, 4),
        new Vector(5, 6),
        new Vector(7, 8),
        new Vector(9, 10),
        new Vector(11, 12)
    );
    private final Matrix secondMat6x2 = new Matrix(
        new Vector(13, 14), 
        new Vector(15, 16),
        new Vector(17, 18),
        new Vector(19, 20),
        new Vector(21, 22),
        new Vector(23, 24)
    );

    private final Matrix firstMat6x3 = new Matrix(
        new Vector(1, 2, 3), 
        new Vector(4, 5, 6),
        new Vector(7, 8, 9),
        new Vector(10, 11, 12),
        new Vector(13, 14, 15),
        new Vector(16, 17, 18)
    );
    private final Matrix secondMat6x3 = new Matrix(
        new Vector(19, 20, 21), 
        new Vector(22, 23, 24),
        new Vector(25, 26, 27),
        new Vector(28, 29, 30),
        new Vector(31, 32, 33),
        new Vector(34, 35, 36)
    );
    private final Matrix firstMat6x4 = new Matrix(
        new Vector(1, 2, 3, 4), 
        new Vector(5, 6, 7, 8),
        new Vector(9, 10, 11, 12),
        new Vector(13, 14, 15, 16),
        new Vector(17, 18, 19, 20),
        new Vector(21, 22, 23, 24)
    );
    private final Matrix secondMat6x4 = new Matrix(
        new Vector(25, 26, 27, 28), 
        new Vector(29, 30, 31, 32),
        new Vector(33, 34, 35, 36),
        new Vector(37, 38, 39, 40),
        new Vector(41, 42, 43, 44),
        new Vector(45, 46, 47, 48)
    );
    private final Matrix firstMat6x5 = new Matrix(
        new Vector(1, 2, 3, 4, 5), 
        new Vector(6, 7, 8, 9, 10),
        new Vector(11, 12, 13, 14, 15),
        new Vector(16, 17, 18, 19, 20),
        new Vector(21, 22, 23, 24, 25),
        new Vector(26, 27, 28, 29, 30)
    );
    private final Matrix secondMat6x5 = new Matrix(
        new Vector(31, 32, 33, 34, 35), 
        new Vector(36, 37, 38, 39, 40),
        new Vector(41, 42, 43, 44, 45),
        new Vector(46, 47, 48, 49, 50),
        new Vector(51, 52, 53, 54, 55),
        new Vector(56, 57, 58, 59, 60)
    );
    private final Matrix firstMat6x6 = new Matrix(
        new Vector(1, 2, 3, 4, 5, 6), 
        new Vector(7, 8, 9, 10, 11, 12),
        new Vector(13, 14, 15, 16, 17, 18),
        new Vector(19, 20, 21, 22, 23, 24),
        new Vector(25, 26, 27, 28, 29, 30),
        new Vector(31, 32, 33, 34, 35, 36)
    );
    private final Matrix secondMat6x6 = new Matrix(
        new Vector(37, 38, 39, 40, 41, 42), 
        new Vector(43, 44, 45, 46, 47, 48),
        new Vector(49, 50, 51, 52, 53, 54),
        new Vector(55, 56, 57, 58, 59, 60),
        new Vector(61, 62, 63, 64, 65, 66),
        new Vector(67, 68, 69, 70, 71, 72)
    );
    private final Vector firstVec2D = new Vector(1, 2);
    private final Vector firstVec3D = new Vector(1, 2, 3);
    private final Vector firstVec4D = new Vector(1, 2, 3, 4);
    private final Vector firstVec5D = new Vector(1, 2, 3, 4, 5);
    private final Vector firstVec6D = new Vector(1, 2, 3, 4, 5, 6);

    @Test
    public void testAddition2x2() {
        Matrix result = firstMat2x2.getSummationMatrix(secondMat2x2);
        assertEquals(6, result.getElement(0, 0), 0);
        assertEquals(8, result.getElement(0, 1), 0);
        assertEquals(10, result.getElement(1, 0), 0);
        assertEquals(12, result.getElement(1, 1), 0);
    }

    @Test
    public void testAddition2x3() {
        Matrix result = firstMat2x3.getSummationMatrix(secondMat2x3);
        assertEquals(8, result.getElement(0, 0), 0);
        assertEquals(10, result.getElement(0, 1), 0);
        assertEquals(12, result.getElement(0, 2), 0);
        assertEquals(14, result.getElement(1, 0), 0);
        assertEquals(16, result.getElement(1, 1), 0);
        assertEquals(18, result.getElement(1, 2), 0);
    }

    @Test
    public void testAddition2x4() {
        Matrix result = firstMat2x4.getSummationMatrix(secondMat2x4);
        assertEquals(10, result.getElement(0, 0), 0);
        assertEquals(12, result.getElement(0, 1), 0);
        assertEquals(14, result.getElement(0, 2), 0);
        assertEquals(16, result.getElement(0, 3), 0);
        assertEquals(18, result.getElement(1, 0), 0);
        assertEquals(20, result.getElement(1, 1), 0);
        assertEquals(22, result.getElement(1, 2), 0);
        assertEquals(24, result.getElement(1, 3), 0);
    }

    @Test
    public void testAddition2x5() {
        Matrix result = firstMat2x5.getSummationMatrix(secondMat2x5);
        assertEquals(12, result.getElement(0, 0), 0);
        assertEquals(14, result.getElement(0, 1), 0);
        assertEquals(16, result.getElement(0, 2), 0);
        assertEquals(18, result.getElement(0, 3), 0);
        assertEquals(20, result.getElement(0, 4), 0);
        assertEquals(22, result.getElement(1, 0), 0);
        assertEquals(24, result.getElement(1, 1), 0);
        assertEquals(26, result.getElement(1, 2), 0);
        assertEquals(28, result.getElement(1, 3), 0);
        assertEquals(30, result.getElement(1, 4), 0);
    }

    @Test
    public void testAddition2x6() {
        Matrix result = firstMat2x6.getSummationMatrix(secondMat2x6);
        assertEquals(14, result.getElement(0, 0), 0);
        assertEquals(16, result.getElement(0, 1), 0);
        assertEquals(18, result.getElement(0, 2), 0);
        assertEquals(20, result.getElement(0, 3), 0);
        assertEquals(22, result.getElement(0, 4), 0);
        assertEquals(24, result.getElement(0, 5), 0);
        assertEquals(26, result.getElement(1, 0), 0);
        assertEquals(28, result.getElement(1, 1), 0);
        assertEquals(30, result.getElement(1, 2), 0);
        assertEquals(32, result.getElement(1, 3), 0);
        assertEquals(34, result.getElement(1, 4), 0);
        assertEquals(36, result.getElement(1, 5), 0);
    }

    @Test
    public void testAddition3x2() {
        Matrix result = firstMat3x2.getSummationMatrix(secondMat3x2);
        assertEquals(8, result.getElement(0, 0), 0);
        assertEquals(10, result.getElement(0, 1), 0);
        assertEquals(12, result.getElement(1, 0), 0);
        assertEquals(14, result.getElement(1, 1), 0);
        assertEquals(16, result.getElement(2, 0), 0);
        assertEquals(18, result.getElement(2, 1), 0);
    }

    @Test
    public void testAddition3x3() {
        Matrix result = firstMat3x3.getSummationMatrix(secondMat3x3);
        assertEquals(11, result.getElement(0, 0), 0);
        assertEquals(13, result.getElement(0, 1), 0);
        assertEquals(15, result.getElement(0, 2), 0);
        assertEquals(17, result.getElement(1, 0), 0);
        assertEquals(19, result.getElement(1, 1), 0);
        assertEquals(21, result.getElement(1, 2), 0);
        assertEquals(23, result.getElement(2, 0), 0);
        assertEquals(25, result.getElement(2, 1), 0);
        assertEquals(27, result.getElement(2, 2), 0);
    }

    @Test
    public void testAddition3x4() {
        Matrix result = firstMat3x4.getSummationMatrix(secondMat3x4);
        assertEquals(14, result.getElement(0, 0), 0);
        assertEquals(16, result.getElement(0, 1), 0);
        assertEquals(18, result.getElement(0, 2), 0);
        assertEquals(20, result.getElement(0, 3), 0);
        assertEquals(22, result.getElement(1, 0), 0);
        assertEquals(24, result.getElement(1, 1), 0);
        assertEquals(26, result.getElement(1, 2), 0);
        assertEquals(28, result.getElement(1, 3), 0);
        assertEquals(30, result.getElement(2, 0), 0);
        assertEquals(32, result.getElement(2, 1), 0);
        assertEquals(34, result.getElement(2, 2), 0);
        assertEquals(36, result.getElement(2, 3), 0);
    }

    @Test
    public void testAddition3x5() {
        Matrix result = firstMat3x5.getSummationMatrix(secondMat3x5);
        assertEquals(17, result.getElement(0, 0), 0);
        assertEquals(19, result.getElement(0, 1), 0);
        assertEquals(21, result.getElement(0, 2), 0);
        assertEquals(23, result.getElement(0, 3), 0);
        assertEquals(25, result.getElement(0, 4), 0);
        assertEquals(27, result.getElement(1, 0), 0);
        assertEquals(29, result.getElement(1, 1), 0);
        assertEquals(31, result.getElement(1, 2), 0);
        assertEquals(33, result.getElement(1, 3), 0);
        assertEquals(35, result.getElement(1, 4), 0);
        assertEquals(37, result.getElement(2, 0), 0);
        assertEquals(39, result.getElement(2, 1), 0);
        assertEquals(41, result.getElement(2, 2), 0);
        assertEquals(43, result.getElement(2, 3), 0);
        assertEquals(45, result.getElement(2, 4), 0);
    }

    @Test
    public void testAddition3x6() {
        Matrix result = firstMat3x6.getSummationMatrix(secondMat3x6);
        assertEquals(20, result.getElement(0, 0), 0);
        assertEquals(22, result.getElement(0, 1), 0);
        assertEquals(24, result.getElement(0, 2), 0);
        assertEquals(26, result.getElement(0, 3), 0);
        assertEquals(28, result.getElement(0, 4), 0);
        assertEquals(30, result.getElement(0, 5), 0);
        assertEquals(32, result.getElement(1, 0), 0);
        assertEquals(34, result.getElement(1, 1), 0);
        assertEquals(36, result.getElement(1, 2), 0);
        assertEquals(38, result.getElement(1, 3), 0);
        assertEquals(40, result.getElement(1, 4), 0);
        assertEquals(42, result.getElement(1, 5), 0);
        assertEquals(44, result.getElement(2, 0), 0);
        assertEquals(46, result.getElement(2, 1), 0);
        assertEquals(48, result.getElement(2, 2), 0);
        assertEquals(50, result.getElement(2, 3), 0);
        assertEquals(52, result.getElement(2, 4), 0);
        assertEquals(54, result.getElement(2, 5), 0);
    }

    @Test
    public void testAddition4x2() {
        Matrix result = firstMat4x2.getSummationMatrix(secondMat4x2);
        assertEquals(10, result.getElement(0, 0), 0);
        assertEquals(12, result.getElement(0, 1), 0);
        assertEquals(14, result.getElement(1, 0), 0);
        assertEquals(16, result.getElement(1, 1), 0);
        assertEquals(18, result.getElement(2, 0), 0);
        assertEquals(20, result.getElement(2, 1), 0);
        assertEquals(22, result.getElement(3, 0), 0);
        assertEquals(24, result.getElement(3, 1), 0);
    }

    @Test
    public void testAddition4x3() {
        Matrix result = firstMat4x3.getSummationMatrix(secondMat4x3);
        assertEquals(14, result.getElement(0, 0), 0);
        assertEquals(16, result.getElement(0, 1), 0);
        assertEquals(18, result.getElement(0, 2), 0);
        assertEquals(20, result.getElement(1, 0), 0);
        assertEquals(22, result.getElement(1, 1), 0);
        assertEquals(24, result.getElement(1, 2), 0);
        assertEquals(26, result.getElement(2, 0), 0);
        assertEquals(28, result.getElement(2, 1), 0);
        assertEquals(30, result.getElement(2, 2), 0);
        assertEquals(32, result.getElement(3, 0), 0);
        assertEquals(34, result.getElement(3, 1), 0);
        assertEquals(36, result.getElement(3, 2), 0);
    }

    @Test
    public void testAddition4x4() {
        Matrix result = firstMat4x4.getSummationMatrix(secondMat4x4);
        assertEquals(18, result.getElement(0, 0), 0);
        assertEquals(20, result.getElement(0, 1), 0);
        assertEquals(22, result.getElement(0, 2), 0);
        assertEquals(24, result.getElement(0, 3), 0);
        assertEquals(26, result.getElement(1, 0), 0);
        assertEquals(28, result.getElement(1, 1), 0);
        assertEquals(30, result.getElement(1, 2), 0);
        assertEquals(32, result.getElement(1, 3), 0);
        assertEquals(34, result.getElement(2, 0), 0);
        assertEquals(36, result.getElement(2, 1), 0);
        assertEquals(38, result.getElement(2, 2), 0);
        assertEquals(40, result.getElement(2, 3), 0);
        assertEquals(42, result.getElement(3, 0), 0);
        assertEquals(44, result.getElement(3, 1), 0);
        assertEquals(46, result.getElement(3, 2), 0);
        assertEquals(48, result.getElement(3, 3), 0);
    }

    @Test
    public void testAddition4x5() {
        Matrix result = firstMat4x5.getSummationMatrix(secondMat4x5);
        assertEquals(22, result.getElement(0, 0), 0);
        assertEquals(24, result.getElement(0, 1), 0);
        assertEquals(26, result.getElement(0, 2), 0);
        assertEquals(28, result.getElement(0, 3), 0);
        assertEquals(30, result.getElement(0, 4), 0);
        assertEquals(32, result.getElement(1, 0), 0);
        assertEquals(34, result.getElement(1, 1), 0);
        assertEquals(36, result.getElement(1, 2), 0);
        assertEquals(38, result.getElement(1, 3), 0);
        assertEquals(40, result.getElement(1, 4), 0);
        assertEquals(42, result.getElement(2, 0), 0);
        assertEquals(44, result.getElement(2, 1), 0);
        assertEquals(46, result.getElement(2, 2), 0);
        assertEquals(48, result.getElement(2, 3), 0);
        assertEquals(50, result.getElement(2, 4), 0);
        assertEquals(52, result.getElement(3, 0), 0);
        assertEquals(54, result.getElement(3, 1), 0);
        assertEquals(56, result.getElement(3, 2), 0);
        assertEquals(58, result.getElement(3, 3), 0);
        assertEquals(60, result.getElement(3, 4), 0);
    }

    @Test
    public void testAddition4x6() {
        Matrix result = firstMat4x6.getSummationMatrix(secondMat4x6);
        assertEquals(26, result.getElement(0, 0), 0);
        assertEquals(28, result.getElement(0, 1), 0);
        assertEquals(30, result.getElement(0, 2), 0);
        assertEquals(32, result.getElement(0, 3), 0);
        assertEquals(34, result.getElement(0, 4), 0);
        assertEquals(36, result.getElement(0, 5), 0);
        assertEquals(38, result.getElement(1, 0), 0);
        assertEquals(40, result.getElement(1, 1), 0);
        assertEquals(42, result.getElement(1, 2), 0);
        assertEquals(44, result.getElement(1, 3), 0);
        assertEquals(46, result.getElement(1, 4), 0);
        assertEquals(48, result.getElement(1, 5), 0);
        assertEquals(50, result.getElement(2, 0), 0);
        assertEquals(52, result.getElement(2, 1), 0);
        assertEquals(54, result.getElement(2, 2), 0);
        assertEquals(56, result.getElement(2, 3), 0);
        assertEquals(58, result.getElement(2, 4), 0);
        assertEquals(60, result.getElement(2, 5), 0);
        assertEquals(62, result.getElement(3, 0), 0);
        assertEquals(64, result.getElement(3, 1), 0);
        assertEquals(66, result.getElement(3, 2), 0);
        assertEquals(68, result.getElement(3, 3), 0);
        assertEquals(70, result.getElement(3, 4), 0);
        assertEquals(72, result.getElement(3, 5), 0);
    }

    @Test
    public void testAddition5x2() {
        Matrix result = firstMat5x2.getSummationMatrix(secondMat5x2);
        assertEquals(12, result.getElement(0, 0), 0);
        assertEquals(14, result.getElement(0, 1), 0);
        assertEquals(16, result.getElement(1, 0), 0);
        assertEquals(18, result.getElement(1, 1), 0);
        assertEquals(20, result.getElement(2, 0), 0);
        assertEquals(22, result.getElement(2, 1), 0);
        assertEquals(24, result.getElement(3, 0), 0);
        assertEquals(26, result.getElement(3, 1), 0);
        assertEquals(28, result.getElement(4, 0), 0);
        assertEquals(30, result.getElement(4, 1), 0);
    }

    @Test
    public void testAddition5x3() {
        Matrix result = firstMat5x3.getSummationMatrix(secondMat5x3);
        assertEquals(17, result.getElement(0, 0), 0);
        assertEquals(19, result.getElement(0, 1), 0);
        assertEquals(21, result.getElement(0, 2), 0);
        assertEquals(23, result.getElement(1, 0), 0);
        assertEquals(25, result.getElement(1, 1), 0);
        assertEquals(27, result.getElement(1, 2), 0);
        assertEquals(29, result.getElement(2, 0), 0);
        assertEquals(31, result.getElement(2, 1), 0);
        assertEquals(33, result.getElement(2, 2), 0);
        assertEquals(35, result.getElement(3, 0), 0);
        assertEquals(37, result.getElement(3, 1), 0);
        assertEquals(39, result.getElement(3, 2), 0);
        assertEquals(41, result.getElement(4, 0), 0);
        assertEquals(43, result.getElement(4, 1), 0);
        assertEquals(45, result.getElement(4, 2), 0);
    }

    @Test
    public void testAddition5x4() {
        Matrix result = firstMat5x4.getSummationMatrix(secondMat5x4);
        assertEquals(22, result.getElement(0, 0), 0);
        assertEquals(24, result.getElement(0, 1), 0);
        assertEquals(26, result.getElement(0, 2), 0);
        assertEquals(28, result.getElement(0, 3), 0);
        assertEquals(30, result.getElement(1, 0), 0);
        assertEquals(32, result.getElement(1, 1), 0);
        assertEquals(34, result.getElement(1, 2), 0);
        assertEquals(36, result.getElement(1, 3), 0);
        assertEquals(38, result.getElement(2, 0), 0);
        assertEquals(40, result.getElement(2, 1), 0);
        assertEquals(42, result.getElement(2, 2), 0);
        assertEquals(44, result.getElement(2, 3), 0);
        assertEquals(46, result.getElement(3, 0), 0);
        assertEquals(48, result.getElement(3, 1), 0);
        assertEquals(50, result.getElement(3, 2), 0);
        assertEquals(52, result.getElement(3, 3), 0);
        assertEquals(54, result.getElement(4, 0), 0);
        assertEquals(56, result.getElement(4, 1), 0);
        assertEquals(58, result.getElement(4, 2), 0);
        assertEquals(60, result.getElement(4, 3), 0);
    }

    @Test
    public void testAddition5x5() {
        Matrix result = firstMat5x5.getSummationMatrix(secondMat5x5);
        assertEquals(27, result.getElement(0, 0), 0);
        assertEquals(29, result.getElement(0, 1), 0);
        assertEquals(31, result.getElement(0, 2), 0);
        assertEquals(33, result.getElement(0, 3), 0);
        assertEquals(35, result.getElement(0, 4), 0);
        assertEquals(37, result.getElement(1, 0), 0);
        assertEquals(39, result.getElement(1, 1), 0);
        assertEquals(41, result.getElement(1, 2), 0);
        assertEquals(43, result.getElement(1, 3), 0);
        assertEquals(45, result.getElement(1, 4), 0);
        assertEquals(47, result.getElement(2, 0), 0);
        assertEquals(49, result.getElement(2, 1), 0);
        assertEquals(51, result.getElement(2, 2), 0);
        assertEquals(53, result.getElement(2, 3), 0);
        assertEquals(55, result.getElement(2, 4), 0);
        assertEquals(57, result.getElement(3, 0), 0);
        assertEquals(59, result.getElement(3, 1), 0);
        assertEquals(61, result.getElement(3, 2), 0);
        assertEquals(63, result.getElement(3, 3), 0);
        assertEquals(65, result.getElement(3, 4), 0);
        assertEquals(67, result.getElement(4, 0), 0);
        assertEquals(69, result.getElement(4, 1), 0);
        assertEquals(71, result.getElement(4, 2), 0);
        assertEquals(73, result.getElement(4, 3), 0);
        assertEquals(75, result.getElement(4, 4), 0);
    }

    @Test
    public void testAddition5x6() {
        Matrix result = firstMat5x6.getSummationMatrix(secondMat5x6);
        assertEquals(32, result.getElement(0, 0), 0);
        assertEquals(34, result.getElement(0, 1), 0);
        assertEquals(36, result.getElement(0, 2), 0);
        assertEquals(38, result.getElement(0, 3), 0);
        assertEquals(40, result.getElement(0, 4), 0);
        assertEquals(42, result.getElement(0, 5), 0);
        assertEquals(44, result.getElement(1, 0), 0);
        assertEquals(46, result.getElement(1, 1), 0);
        assertEquals(48, result.getElement(1, 2), 0);
        assertEquals(50, result.getElement(1, 3), 0);
        assertEquals(52, result.getElement(1, 4), 0);
        assertEquals(54, result.getElement(1, 5), 0);
        assertEquals(56, result.getElement(2, 0), 0);
        assertEquals(58, result.getElement(2, 1), 0);
        assertEquals(60, result.getElement(2, 2), 0);
        assertEquals(62, result.getElement(2, 3), 0);
        assertEquals(64, result.getElement(2, 4), 0);
        assertEquals(66, result.getElement(2, 5), 0);
        assertEquals(68, result.getElement(3, 0), 0);
        assertEquals(70, result.getElement(3, 1), 0);
        assertEquals(72, result.getElement(3, 2), 0);
        assertEquals(74, result.getElement(3, 3), 0);
        assertEquals(76, result.getElement(3, 4), 0);
        assertEquals(78, result.getElement(3, 5), 0);
        assertEquals(80, result.getElement(4, 0), 0);
        assertEquals(82, result.getElement(4, 1), 0);
        assertEquals(84, result.getElement(4, 2), 0);
        assertEquals(86, result.getElement(4, 3), 0);
        assertEquals(88, result.getElement(4, 4), 0);
        assertEquals(90, result.getElement(4, 5), 0);
    }

    @Test
    public void testAddition6x2() {
        Matrix result = firstMat6x2.getSummationMatrix(secondMat6x2);
        assertEquals(14, result.getElement(0, 0), 0);
        assertEquals(16, result.getElement(0, 1), 0);
        assertEquals(18, result.getElement(1, 0), 0);
        assertEquals(20, result.getElement(1, 1), 0);
        assertEquals(22, result.getElement(2, 0), 0);
        assertEquals(24, result.getElement(2, 1), 0);
        assertEquals(26, result.getElement(3, 0), 0);
        assertEquals(28, result.getElement(3, 1), 0);
        assertEquals(30, result.getElement(4, 0), 0);
        assertEquals(32, result.getElement(4, 1), 0);
        assertEquals(34, result.getElement(5, 0), 0);
        assertEquals(36, result.getElement(5, 1), 0);
    }

    @Test
    public void testAddition6x3() {
        Matrix result = firstMat6x3.getSummationMatrix(secondMat6x3);
        assertEquals(20, result.getElement(0, 0), 0);
        assertEquals(22, result.getElement(0, 1), 0);
        assertEquals(24, result.getElement(0, 2), 0);
        assertEquals(26, result.getElement(1, 0), 0);
        assertEquals(28, result.getElement(1, 1), 0);
        assertEquals(30, result.getElement(1, 2), 0);
        assertEquals(32, result.getElement(2, 0), 0);
        assertEquals(34, result.getElement(2, 1), 0);
        assertEquals(36, result.getElement(2, 2), 0);
        assertEquals(38, result.getElement(3, 0), 0);
        assertEquals(40, result.getElement(3, 1), 0);
        assertEquals(42, result.getElement(3, 2), 0);
        assertEquals(44, result.getElement(4, 0), 0);
        assertEquals(46, result.getElement(4, 1), 0);
        assertEquals(48, result.getElement(4, 2), 0);
        assertEquals(50, result.getElement(5, 0), 0);
        assertEquals(52, result.getElement(5, 1), 0);
        assertEquals(54, result.getElement(5, 2), 0);
    }

    @Test
    public void testAddition6x4() {
        Matrix result = firstMat6x4.getSummationMatrix(secondMat6x4);
        assertEquals(26, result.getElement(0, 0), 0);
        assertEquals(28, result.getElement(0, 1), 0);
        assertEquals(30, result.getElement(0, 2), 0);
        assertEquals(32, result.getElement(0, 3), 0);
        assertEquals(34, result.getElement(1, 0), 0);
        assertEquals(36, result.getElement(1, 1), 0);
        assertEquals(38, result.getElement(1, 2), 0);
        assertEquals(40, result.getElement(1, 3), 0);
        assertEquals(42, result.getElement(2, 0), 0);
        assertEquals(44, result.getElement(2, 1), 0);
        assertEquals(46, result.getElement(2, 2), 0);
        assertEquals(48, result.getElement(2, 3), 0);
        assertEquals(50, result.getElement(3, 0), 0);
        assertEquals(52, result.getElement(3, 1), 0);
        assertEquals(54, result.getElement(3, 2), 0);
        assertEquals(56, result.getElement(3, 3), 0);
        assertEquals(58, result.getElement(4, 0), 0);
        assertEquals(60, result.getElement(4, 1), 0);
        assertEquals(62, result.getElement(4, 2), 0);
        assertEquals(64, result.getElement(4, 3), 0);
        assertEquals(66, result.getElement(5, 0), 0);
        assertEquals(68, result.getElement(5, 1), 0);
        assertEquals(70, result.getElement(5, 2), 0);
        assertEquals(72, result.getElement(5, 3), 0);
    }

    @Test
    public void testAddition6x5() {
        Matrix result = firstMat6x5.getSummationMatrix(secondMat6x5);
        assertEquals(32, result.getElement(0, 0), 0);
        assertEquals(34, result.getElement(0, 1), 0);
        assertEquals(36, result.getElement(0, 2), 0);
        assertEquals(38, result.getElement(0, 3), 0);
        assertEquals(40, result.getElement(0, 4), 0);
        assertEquals(42, result.getElement(1, 0), 0);
        assertEquals(44, result.getElement(1, 1), 0);
        assertEquals(46, result.getElement(1, 2), 0);
        assertEquals(48, result.getElement(1, 3), 0);
        assertEquals(50, result.getElement(1, 4), 0);
        assertEquals(52, result.getElement(2, 0), 0);
        assertEquals(54, result.getElement(2, 1), 0);
        assertEquals(56, result.getElement(2, 2), 0);
        assertEquals(58, result.getElement(2, 3), 0);
        assertEquals(60, result.getElement(2, 4), 0);
        assertEquals(62, result.getElement(3, 0), 0);
        assertEquals(64, result.getElement(3, 1), 0);
        assertEquals(66, result.getElement(3, 2), 0);
        assertEquals(68, result.getElement(3, 3), 0);
        assertEquals(70, result.getElement(3, 4), 0);
        assertEquals(72, result.getElement(4, 0), 0);
        assertEquals(74, result.getElement(4, 1), 0);
        assertEquals(76, result.getElement(4, 2), 0);
        assertEquals(78, result.getElement(4, 3), 0);
        assertEquals(80, result.getElement(4, 4), 0);
        assertEquals(82, result.getElement(5, 0), 0);
        assertEquals(84, result.getElement(5, 1), 0);
        assertEquals(86, result.getElement(5, 2), 0);
        assertEquals(88, result.getElement(5, 3), 0);
        assertEquals(90, result.getElement(5, 4), 0);
    }

    @Test
    public void testAddition6x6() {
        Matrix result = firstMat6x6.getSummationMatrix(secondMat6x6);
        assertEquals(38, result.getElement(0, 0), 0);
        assertEquals(40, result.getElement(0, 1), 0);
        assertEquals(42, result.getElement(0, 2), 0);
        assertEquals(44, result.getElement(0, 3), 0);
        assertEquals(46, result.getElement(0, 4), 0);
        assertEquals(48, result.getElement(0, 5), 0);
        assertEquals(50, result.getElement(1, 0), 0);
        assertEquals(52, result.getElement(1, 1), 0);
        assertEquals(54, result.getElement(1, 2), 0);
        assertEquals(56, result.getElement(1, 3), 0);
        assertEquals(58, result.getElement(1, 4), 0);
        assertEquals(60, result.getElement(1, 5), 0);
        assertEquals(62, result.getElement(2, 0), 0);
        assertEquals(64, result.getElement(2, 1), 0);
        assertEquals(66, result.getElement(2, 2), 0);
        assertEquals(68, result.getElement(2, 3), 0);
        assertEquals(70, result.getElement(2, 4), 0);
        assertEquals(72, result.getElement(2, 5), 0);
        assertEquals(74, result.getElement(3, 0), 0);
        assertEquals(76, result.getElement(3, 1), 0);
        assertEquals(78, result.getElement(3, 2), 0);
        assertEquals(80, result.getElement(3, 3), 0);
        assertEquals(82, result.getElement(3, 4), 0);
        assertEquals(84, result.getElement(3, 5), 0);
        assertEquals(86, result.getElement(4, 0), 0);
        assertEquals(88, result.getElement(4, 1), 0);
        assertEquals(90, result.getElement(4, 2), 0);
        assertEquals(92, result.getElement(4, 3), 0);
        assertEquals(94, result.getElement(4, 4), 0);
        assertEquals(96, result.getElement(4, 5), 0);
        assertEquals(98, result.getElement(5, 0), 0);
        assertEquals(100, result.getElement(5, 1), 0);
        assertEquals(102, result.getElement(5, 2), 0);
        assertEquals(104, result.getElement(5, 3), 0);
        assertEquals(106, result.getElement(5, 4), 0);
        assertEquals(108, result.getElement(5, 5), 0);
    }

    @Test
    public void testVectorProduct2x2() {
        Vector result = firstMat2x2.getProductVector(firstVec2D);
        assertEquals(5, result.getElement(0), 0);
        assertEquals(11, result.getElement(1), 0);
    }

    @Test
    public void testVectorProduct2x3() {
        Vector result = firstMat2x3.getProductVector(firstVec3D);
        assertEquals(14, result.getElement(0), 0);
        assertEquals(32, result.getElement(1), 0);
    }

    @Test
    public void testVectorProduct2x4() {
        Vector result = firstMat2x4.getProductVector(firstVec4D);
        assertEquals(30, result.getElement(0), 0);
        assertEquals(70, result.getElement(1), 0);
    }

    @Test
    public void testVectorProduct2x5() {
        Vector result = firstMat2x5.getProductVector(firstVec5D);
        assertEquals(55, result.getElement(0), 0);
        assertEquals(130, result.getElement(1), 0);
    }

    @Test
    public void testVectorProduct2x6() {
        Vector result = firstMat2x6.getProductVector(firstVec6D);
        assertEquals(91, result.getElement(0), 0);
        assertEquals(217, result.getElement(1), 0);
    }

    @Test
    public void testVectorProduct3x2() {
        Vector result = firstMat3x2.getProductVector(firstVec2D);
        assertEquals(5, result.getElement(0), 0);
        assertEquals(11, result.getElement(1), 0);
        assertEquals(17, result.getElement(2), 0);
    }

    @Test
    public void testVectorProduct3x3() {
        Vector result = firstMat3x3.getProductVector(firstVec3D);
        assertEquals(14, result.getElement(0), 0);
        assertEquals(32, result.getElement(1), 0);
        assertEquals(50, result.getElement(2), 0);
    }

    @Test
    public void testVectorProduct3x4() {
        Vector result = firstMat3x4.getProductVector(firstVec4D);
        assertEquals(30, result.getElement(0), 0);
        assertEquals(70, result.getElement(1), 0);
        assertEquals(110, result.getElement(2), 0);
    }

    @Test
    public void testVectorProduct3x5() {
        Vector result = firstMat3x5.getProductVector(firstVec5D);
        assertEquals(55, result.getElement(0), 0);
        assertEquals(130, result.getElement(1), 0);
        assertEquals(205, result.getElement(2), 0);
    }

    @Test
    public void testVectorProduct3x6() {
        Vector result = firstMat3x6.getProductVector(firstVec6D);
        assertEquals(91, result.getElement(0), 0);
        assertEquals(217, result.getElement(1), 0);
        assertEquals(343, result.getElement(2), 0);
    }

    @Test
    public void testVectorProduct4x2() {
        Vector result = firstMat4x2.getProductVector(firstVec2D);
        assertEquals(5, result.getElement(0), 0);
        assertEquals(11, result.getElement(1), 0);
        assertEquals(17, result.getElement(2), 0);
        assertEquals(23, result.getElement(3), 0);
    }

    @Test
    public void testVectorProduct4x3() {
        Vector result = firstMat4x3.getProductVector(firstVec3D);
        assertEquals(14, result.getElement(0), 0);
        assertEquals(32, result.getElement(1), 0);
        assertEquals(50, result.getElement(2), 0);
        assertEquals(68, result.getElement(3), 0);
    }

    @Test
    public void testVectorProduct4x4() {
        Vector result = firstMat4x4.getProductVector(firstVec4D);
        assertEquals(30, result.getElement(0), 0);
        assertEquals(70, result.getElement(1), 0);
        assertEquals(110, result.getElement(2), 0);
        assertEquals(150, result.getElement(3), 0);
    }

    @Test
    public void testVectorProduct4x5() {
        Vector result = firstMat4x5.getProductVector(firstVec5D);
        assertEquals(55, result.getElement(0), 0);
        assertEquals(130, result.getElement(1), 0);
        assertEquals(205, result.getElement(2), 0);
        assertEquals(280, result.getElement(3), 0);
    }

    @Test
    public void testVectorProduct4x6() {
        Vector result = firstMat4x6.getProductVector(firstVec6D);
        assertEquals(91, result.getElement(0), 0);
        assertEquals(217, result.getElement(1), 0);
        assertEquals(343, result.getElement(2), 0);
        assertEquals(469, result.getElement(3), 0);
    }

    @Test
    public void testVectorProduct5x2() {
        Vector result = firstMat5x2.getProductVector(firstVec2D);
        assertEquals(5, result.getElement(0), 0);
        assertEquals(11, result.getElement(1), 0);
        assertEquals(17, result.getElement(2), 0);
        assertEquals(23, result.getElement(3), 0);
        assertEquals(29, result.getElement(4), 0);
    }

    @Test
    public void testVectorProduct5x3() {
        Vector result = firstMat5x3.getProductVector(firstVec3D);
        assertEquals(14, result.getElement(0), 0);
        assertEquals(32, result.getElement(1), 0);
        assertEquals(50, result.getElement(2), 0);
        assertEquals(68, result.getElement(3), 0);
        assertEquals(86, result.getElement(4), 0);
    }

    @Test
    public void testVectorProduct5x4() {
        Vector result = firstMat5x4.getProductVector(firstVec4D);
        assertEquals(30, result.getElement(0), 0);
        assertEquals(70, result.getElement(1), 0);
        assertEquals(110, result.getElement(2), 0);
        assertEquals(150, result.getElement(3), 0);
        assertEquals(190, result.getElement(4), 0);
    }

    @Test
    public void testVectorProduct5x5() {
        Vector result = firstMat5x5.getProductVector(firstVec5D);
        assertEquals(55, result.getElement(0), 0);
        assertEquals(130, result.getElement(1), 0);
        assertEquals(205, result.getElement(2), 0);
        assertEquals(280, result.getElement(3), 0);
        assertEquals(355, result.getElement(4), 0);
    }

    @Test
    public void testVectorProduct5x6() {
        Vector result = firstMat5x6.getProductVector(firstVec6D);
        assertEquals(91, result.getElement(0), 0);
        assertEquals(217, result.getElement(1), 0);
        assertEquals(343, result.getElement(2), 0);
        assertEquals(469, result.getElement(3), 0);
        assertEquals(595, result.getElement(4), 0);
    }

    @Test
    public void testVectorProduct6x2() {
        Vector result = firstMat6x2.getProductVector(firstVec2D);
        assertEquals(5, result.getElement(0), 0);
        assertEquals(11, result.getElement(1), 0);
        assertEquals(17, result.getElement(2), 0);
        assertEquals(23, result.getElement(3), 0);
        assertEquals(29, result.getElement(4), 0);
        assertEquals(35, result.getElement(5), 0);
    }

    @Test
    public void testVectorProduct6x3() {
        Vector result = firstMat6x3.getProductVector(firstVec3D);
        assertEquals(14, result.getElement(0), 0);
        assertEquals(32, result.getElement(1), 0);
        assertEquals(50, result.getElement(2), 0);
        assertEquals(68, result.getElement(3), 0);
        assertEquals(86, result.getElement(4), 0);
        assertEquals(104, result.getElement(5), 0);
    }

    @Test
    public void testVectorProduct6x4() {
        Vector result = firstMat6x4.getProductVector(firstVec4D);
        assertEquals(30, result.getElement(0), 0);
        assertEquals(70, result.getElement(1), 0);
        assertEquals(110, result.getElement(2), 0);
        assertEquals(150, result.getElement(3), 0);
        assertEquals(190, result.getElement(4), 0);
        assertEquals(230, result.getElement(5), 0);
    }

    @Test
    public void testVectorProduct6x5() {
        Vector result = firstMat6x5.getProductVector(firstVec5D);
        assertEquals(55, result.getElement(0), 0);
        assertEquals(130, result.getElement(1), 0);
        assertEquals(205, result.getElement(2), 0);
        assertEquals(280, result.getElement(3), 0);
        assertEquals(355, result.getElement(4), 0);
        assertEquals(430, result.getElement(5), 0);
    }

    @Test
    public void testVectorProduct6x6() {
        Vector result = firstMat6x6.getProductVector(firstVec6D);
        assertEquals(91, result.getElement(0), 0);
        assertEquals(217, result.getElement(1), 0);
        assertEquals(343, result.getElement(2), 0);
        assertEquals(469, result.getElement(3), 0);
        assertEquals(595, result.getElement(4), 0);
        assertEquals(721, result.getElement(5), 0);
    }
    
    @Test
    public void testTranspose2x2(){
        Matrix result = firstMat2x2.getTranspose();
        assertEquals(1, result.getElement(0, 0), 0);
        assertEquals(3, result.getElement(0, 1), 0);
        assertEquals(2, result.getElement(1, 0), 0);
        assertEquals(4, result.getElement(1, 1), 0);
    }

    @Test
    public void testTranspose2x3(){
        Matrix result = firstMat2x3.getTranspose();
        assertEquals(1, result.getElement(0, 0), 0);
        assertEquals(4, result.getElement(0, 1), 0);
        assertEquals(2, result.getElement(1, 0), 0);
        assertEquals(5, result.getElement(1, 1), 0);
        assertEquals(3, result.getElement(2, 0), 0);
        assertEquals(6, result.getElement(2, 1), 0);
    }

    @Test
    public void testTranspose2x4(){
        Matrix result = firstMat2x4.getTranspose();
        assertEquals(1, result.getElement(0, 0), 0);
        assertEquals(5, result.getElement(0, 1), 0);
        assertEquals(2, result.getElement(1, 0), 0);
        assertEquals(6, result.getElement(1, 1), 0);
        assertEquals(3, result.getElement(2, 0), 0);
        assertEquals(7, result.getElement(2, 1), 0);
        assertEquals(4, result.getElement(3, 0), 0);
        assertEquals(8, result.getElement(3, 1), 0);
    }

    @Test
    public void testTranspose2x5(){
        Matrix result = firstMat2x5.getTranspose();
        assertEquals(1, result.getElement(0, 0), 0);
        assertEquals(6, result.getElement(0, 1), 0);
        assertEquals(2, result.getElement(1, 0), 0);
        assertEquals(7, result.getElement(1, 1), 0);
        assertEquals(3, result.getElement(2, 0), 0);
        assertEquals(8, result.getElement(2, 1), 0);
        assertEquals(4, result.getElement(3, 0), 0);
        assertEquals(9, result.getElement(3, 1), 0);
        assertEquals(5, result.getElement(4, 0), 0);
        assertEquals(10, result.getElement(4, 1), 0);
    }

    @Test
    public void testTranspose2x6(){
        Matrix result = firstMat2x6.getTranspose();
        assertEquals(1, result.getElement(0, 0), 0);
        assertEquals(7, result.getElement(0, 1), 0);
        assertEquals(2, result.getElement(1, 0), 0);
        assertEquals(8, result.getElement(1, 1), 0);
        assertEquals(3, result.getElement(2, 0), 0);
        assertEquals(9, result.getElement(2, 1), 0);
        assertEquals(4, result.getElement(3, 0), 0);
        assertEquals(10, result.getElement(3, 1), 0);
        assertEquals(5, result.getElement(4, 0), 0);
        assertEquals(11, result.getElement(4, 1), 0);
        assertEquals(6, result.getElement(5, 0), 0);
        assertEquals(12, result.getElement(5, 1), 0);
    }

    @Test
    public void testTranspose3x2(){
        Matrix result = firstMat3x2.getTranspose();
        assertEquals(1, result.getElement(0, 0), 0);
        assertEquals(3, result.getElement(0, 1), 0);
        assertEquals(5, result.getElement(0, 2), 0);
        assertEquals(2, result.getElement(1, 0), 0);
        assertEquals(4, result.getElement(1, 1), 0);
        assertEquals(6, result.getElement(1, 2), 0);
    }

    @Test
    public void testTranspose3x3(){
        Matrix result = firstMat3x3.getTranspose();
        assertEquals(1, result.getElement(0, 0), 0);
        assertEquals(4, result.getElement(0, 1), 0);
        assertEquals(7, result.getElement(0, 2), 0);
        assertEquals(2, result.getElement(1, 0), 0);
        assertEquals(5, result.getElement(1, 1), 0);
        assertEquals(8, result.getElement(1, 2), 0);
        assertEquals(3, result.getElement(2, 0), 0);
        assertEquals(6, result.getElement(2, 1), 0);
        assertEquals(9, result.getElement(2, 2), 0);
    }

    @Test
    public void testTranspose3x4(){
        Matrix result = firstMat3x4.getTranspose();
        assertEquals(1, result.getElement(0, 0), 0);
        assertEquals(5, result.getElement(0, 1), 0);
        assertEquals(9, result.getElement(0, 2), 0);
        assertEquals(2, result.getElement(1, 0), 0);
        assertEquals(6, result.getElement(1, 1), 0);
        assertEquals(10, result.getElement(1, 2), 0);
        assertEquals(3, result.getElement(2, 0), 0);
        assertEquals(7, result.getElement(2, 1), 0);
        assertEquals(11, result.getElement(2, 2), 0);
        assertEquals(4, result.getElement(3, 0), 0);
        assertEquals(8, result.getElement(3, 1), 0);
        assertEquals(12, result.getElement(3, 2), 0);
    }

    @Test
    public void testTranspose3x5(){
        Matrix result = firstMat3x5.getTranspose();
        assertEquals(1, result.getElement(0, 0), 0);
        assertEquals(6, result.getElement(0, 1), 0);
        assertEquals(11, result.getElement(0, 2), 0);
        assertEquals(2, result.getElement(1, 0), 0);
        assertEquals(7, result.getElement(1, 1), 0);
        assertEquals(12, result.getElement(1, 2), 0);
        assertEquals(3, result.getElement(2, 0), 0);
        assertEquals(8, result.getElement(2, 1), 0);
        assertEquals(13, result.getElement(2, 2), 0);
        assertEquals(4, result.getElement(3, 0), 0);
        assertEquals(9, result.getElement(3, 1), 0);
        assertEquals(14, result.getElement(3, 2), 0);
        assertEquals(5, result.getElement(4, 0), 0);
        assertEquals(10, result.getElement(4, 1), 0);
        assertEquals(15, result.getElement(4, 2), 0);
    }

    @Test
    public void testTranspose3x6(){
        Matrix result = firstMat3x6.getTranspose();
        assertEquals(1, result.getElement(0, 0), 0);
        assertEquals(7, result.getElement(0, 1), 0);
        assertEquals(13, result.getElement(0, 2), 0);
        assertEquals(2, result.getElement(1, 0), 0);
        assertEquals(8, result.getElement(1, 1), 0);
        assertEquals(14, result.getElement(1, 2), 0);
        assertEquals(3, result.getElement(2, 0), 0);
        assertEquals(9, result.getElement(2, 1), 0);
        assertEquals(15, result.getElement(2, 2), 0);
        assertEquals(4, result.getElement(3, 0), 0);
        assertEquals(10, result.getElement(3, 1), 0);
        assertEquals(16, result.getElement(3, 2), 0);
        assertEquals(5, result.getElement(4, 0), 0);
        assertEquals(11, result.getElement(4, 1), 0);
        assertEquals(17, result.getElement(4, 2), 0);
        assertEquals(6, result.getElement(5, 0), 0);
        assertEquals(12, result.getElement(5, 1), 0);
        assertEquals(18, result.getElement(5, 2), 0);
    }

    @Test
    public void testTranspose4x2(){
        Matrix result = firstMat4x2.getTranspose();
        assertEquals(1, result.getElement(0, 0), 0);
        assertEquals(3, result.getElement(0, 1), 0);
        assertEquals(5, result.getElement(0, 2), 0);
        assertEquals(7, result.getElement(0, 3), 0);
        assertEquals(2, result.getElement(1, 0), 0);
        assertEquals(4, result.getElement(1, 1), 0);
        assertEquals(6, result.getElement(1, 2), 0);
        assertEquals(8, result.getElement(1, 3), 0);
    }

    @Test
    public void testTranspose4x3(){
        Matrix result = firstMat4x3.getTranspose();
        assertEquals(1, result.getElement(0, 0), 0);
        assertEquals(4, result.getElement(0, 1), 0);
        assertEquals(7, result.getElement(0, 2), 0);
        assertEquals(10, result.getElement(0, 3), 0);
        assertEquals(2, result.getElement(1, 0), 0);
        assertEquals(5, result.getElement(1, 1), 0);
        assertEquals(8, result.getElement(1, 2), 0);
        assertEquals(11, result.getElement(1, 3), 0);
        assertEquals(3, result.getElement(2, 0), 0);
        assertEquals(6, result.getElement(2, 1), 0);
        assertEquals(9, result.getElement(2, 2), 0);
        assertEquals(12, result.getElement(2, 3), 0);
    }

    @Test
    public void testTranspose4x4(){
        Matrix result = firstMat4x4.getTranspose();
        assertEquals(1, result.getElement(0, 0), 0);
        assertEquals(5, result.getElement(0, 1), 0);
        assertEquals(9, result.getElement(0, 2), 0);
        assertEquals(13, result.getElement(0, 3), 0);
        assertEquals(2, result.getElement(1, 0), 0);
        assertEquals(6, result.getElement(1, 1), 0);
        assertEquals(10, result.getElement(1, 2), 0);
        assertEquals(14, result.getElement(1, 3), 0);
        assertEquals(3, result.getElement(2, 0), 0);
        assertEquals(7, result.getElement(2, 1), 0);
        assertEquals(11, result.getElement(2, 2), 0);
        assertEquals(15, result.getElement(2, 3), 0);
        assertEquals(4, result.getElement(3, 0), 0);
        assertEquals(8, result.getElement(3, 1), 0);
        assertEquals(12, result.getElement(3, 2), 0);
        assertEquals(16, result.getElement(3, 3), 0);
    }

    @Test
    public void testTranspose4x5(){
        Matrix result = firstMat4x5.getTranspose();
        assertEquals(1, result.getElement(0, 0), 0);
        assertEquals(6, result.getElement(0, 1), 0);
        assertEquals(11, result.getElement(0, 2), 0);
        assertEquals(16, result.getElement(0, 3), 0);
        assertEquals(2, result.getElement(1, 0), 0);
        assertEquals(7, result.getElement(1, 1), 0);
        assertEquals(12, result.getElement(1, 2), 0);
        assertEquals(17, result.getElement(1, 3), 0);
        assertEquals(3, result.getElement(2, 0), 0);
        assertEquals(8, result.getElement(2, 1), 0);
        assertEquals(13, result.getElement(2, 2), 0);
        assertEquals(18, result.getElement(2, 3), 0);
        assertEquals(4, result.getElement(3, 0), 0);
        assertEquals(9, result.getElement(3, 1), 0);
        assertEquals(14, result.getElement(3, 2), 0);
        assertEquals(19, result.getElement(3, 3), 0);
        assertEquals(5, result.getElement(4, 0), 0);
        assertEquals(10, result.getElement(4, 1), 0);
        assertEquals(15, result.getElement(4, 2), 0);
        assertEquals(20, result.getElement(4, 3), 0);
    }

    @Test
    public void testTranspose4x6(){
        Matrix result = firstMat4x6.getTranspose();
        assertEquals(1, result.getElement(0, 0), 0);
        assertEquals(7, result.getElement(0, 1), 0);
        assertEquals(13, result.getElement(0, 2), 0);
        assertEquals(19, result.getElement(0, 3), 0);
        assertEquals(2, result.getElement(1, 0), 0);
        assertEquals(8, result.getElement(1, 1), 0);
        assertEquals(14, result.getElement(1, 2), 0);
        assertEquals(20, result.getElement(1, 3), 0);
        assertEquals(3, result.getElement(2, 0), 0);
        assertEquals(9, result.getElement(2, 1), 0);
        assertEquals(15, result.getElement(2, 2), 0);
        assertEquals(21, result.getElement(2, 3), 0);
        assertEquals(4, result.getElement(3, 0), 0);
        assertEquals(10, result.getElement(3, 1), 0);
        assertEquals(16, result.getElement(3, 2), 0);
        assertEquals(22, result.getElement(3, 3), 0);
        assertEquals(5, result.getElement(4, 0), 0);
        assertEquals(11, result.getElement(4, 1), 0);
        assertEquals(17, result.getElement(4, 2), 0);
        assertEquals(23, result.getElement(4, 3), 0);
        assertEquals(6, result.getElement(5, 0), 0);
        assertEquals(12, result.getElement(5, 1), 0);
        assertEquals(18, result.getElement(5, 2), 0);
        assertEquals(24, result.getElement(5, 3), 0);
    }

    @Test
    public void testTranspose5x2(){
        Matrix result = firstMat5x2.getTranspose();
        assertEquals(1, result.getElement(0, 0), 0);
        assertEquals(3, result.getElement(0, 1), 0);
        assertEquals(5, result.getElement(0, 2), 0);
        assertEquals(7, result.getElement(0, 3), 0);
        assertEquals(9, result.getElement(0, 4), 0);
        assertEquals(2, result.getElement(1, 0), 0);
        assertEquals(4, result.getElement(1, 1), 0);
        assertEquals(6, result.getElement(1, 2), 0);
        assertEquals(8, result.getElement(1, 3), 0);
        assertEquals(10, result.getElement(1, 4), 0);
    }

    @Test
    public void testTranspose5x3(){
        Matrix result = firstMat5x3.getTranspose();
        assertEquals(1, result.getElement(0, 0), 0);
        assertEquals(4, result.getElement(0, 1), 0);
        assertEquals(7, result.getElement(0, 2), 0);
        assertEquals(10, result.getElement(0, 3), 0);
        assertEquals(13, result.getElement(0, 4), 0);
        assertEquals(2, result.getElement(1, 0), 0);
        assertEquals(5, result.getElement(1, 1), 0);
        assertEquals(8, result.getElement(1, 2), 0);
        assertEquals(11, result.getElement(1, 3), 0);
        assertEquals(14, result.getElement(1, 4), 0);
        assertEquals(3, result.getElement(2, 0), 0);
        assertEquals(6, result.getElement(2, 1), 0);
        assertEquals(9, result.getElement(2, 2), 0);
        assertEquals(12, result.getElement(2, 3), 0);
        assertEquals(15, result.getElement(2, 4), 0);
    }

    @Test
    public void testTranspose5x4(){
        Matrix result = firstMat5x4.getTranspose();
        assertEquals(1, result.getElement(0, 0), 0);
        assertEquals(5, result.getElement(0, 1), 0);
        assertEquals(9, result.getElement(0, 2), 0);
        assertEquals(13, result.getElement(0, 3), 0);
        assertEquals(17, result.getElement(0, 4), 0);
        assertEquals(2, result.getElement(1, 0), 0);
        assertEquals(6, result.getElement(1, 1), 0);
        assertEquals(10, result.getElement(1, 2), 0);
        assertEquals(14, result.getElement(1, 3), 0);
        assertEquals(18, result.getElement(1, 4), 0);
        assertEquals(3, result.getElement(2, 0), 0);
        assertEquals(7, result.getElement(2, 1), 0);
        assertEquals(11, result.getElement(2, 2), 0);
        assertEquals(15, result.getElement(2, 3), 0);
        assertEquals(19, result.getElement(2, 4), 0);
        assertEquals(4, result.getElement(3, 0), 0);
        assertEquals(8, result.getElement(3, 1), 0);
        assertEquals(12, result.getElement(3, 2), 0);
        assertEquals(16, result.getElement(3, 3), 0);
        assertEquals(20, result.getElement(3, 4), 0);
    }

    @Test
    public void testTranspose5x5(){
        Matrix result = firstMat5x5.getTranspose();
        assertEquals(1, result.getElement(0, 0), 0);
        assertEquals(6, result.getElement(0, 1), 0);
        assertEquals(11, result.getElement(0, 2), 0);
        assertEquals(16, result.getElement(0, 3), 0);
        assertEquals(21, result.getElement(0, 4), 0);
        assertEquals(2, result.getElement(1, 0), 0);
        assertEquals(7, result.getElement(1, 1), 0);
        assertEquals(12, result.getElement(1, 2), 0);
        assertEquals(17, result.getElement(1, 3), 0);
        assertEquals(22, result.getElement(1, 4), 0);
        assertEquals(3, result.getElement(2, 0), 0);
        assertEquals(8, result.getElement(2, 1), 0);
        assertEquals(13, result.getElement(2, 2), 0);
        assertEquals(18, result.getElement(2, 3), 0);
        assertEquals(23, result.getElement(2, 4), 0);
        assertEquals(4, result.getElement(3, 0), 0);
        assertEquals(9, result.getElement(3, 1), 0);
        assertEquals(14, result.getElement(3, 2), 0);
        assertEquals(19, result.getElement(3, 3), 0);
        assertEquals(24, result.getElement(3, 4), 0);
        assertEquals(5, result.getElement(4, 0), 0);
        assertEquals(10, result.getElement(4, 1), 0);
        assertEquals(15, result.getElement(4, 2), 0);
        assertEquals(20, result.getElement(4, 3), 0);
        assertEquals(25, result.getElement(4, 4), 0);
    }

    @Test
    public void testTranspose5x6(){
        Matrix result = firstMat5x6.getTranspose();
        assertEquals(1, result.getElement(0, 0), 0);
        assertEquals(7, result.getElement(0, 1), 0);
        assertEquals(13, result.getElement(0, 2), 0);
        assertEquals(19, result.getElement(0, 3), 0);
        assertEquals(25, result.getElement(0, 4), 0);
        assertEquals(2, result.getElement(1, 0), 0);
        assertEquals(8, result.getElement(1, 1), 0);
        assertEquals(14, result.getElement(1, 2), 0);
        assertEquals(20, result.getElement(1, 3), 0);
        assertEquals(26, result.getElement(1, 4), 0);
        assertEquals(3, result.getElement(2, 0), 0);
        assertEquals(9, result.getElement(2, 1), 0);
        assertEquals(15, result.getElement(2, 2), 0);
        assertEquals(21, result.getElement(2, 3), 0);
        assertEquals(27, result.getElement(2, 4), 0);
        assertEquals(4, result.getElement(3, 0), 0);
        assertEquals(10, result.getElement(3, 1), 0);
        assertEquals(16, result.getElement(3, 2), 0);
        assertEquals(22, result.getElement(3, 3), 0);
        assertEquals(28, result.getElement(3, 4), 0);
        assertEquals(5, result.getElement(4, 0), 0);
        assertEquals(11, result.getElement(4, 1), 0);
        assertEquals(17, result.getElement(4, 2), 0);
        assertEquals(23, result.getElement(4, 3), 0);
        assertEquals(29, result.getElement(4, 4), 0);
        assertEquals(6, result.getElement(5, 0), 0);
        assertEquals(12, result.getElement(5, 1), 0);
        assertEquals(18, result.getElement(5, 2), 0);
        assertEquals(24, result.getElement(5, 3), 0);
        assertEquals(30, result.getElement(5, 4), 0);
    }

    @Test
    public void testTranspose6x2(){
        Matrix result = firstMat6x2.getTranspose();
        assertEquals(1, result.getElement(0, 0), 0);
        assertEquals(3, result.getElement(0, 1), 0);
        assertEquals(5, result.getElement(0, 2), 0);
        assertEquals(7, result.getElement(0, 3), 0);
        assertEquals(9, result.getElement(0, 4), 0);
        assertEquals(11, result.getElement(0, 5), 0);
        assertEquals(2, result.getElement(1, 0), 0);
        assertEquals(4, result.getElement(1, 1), 0);
        assertEquals(6, result.getElement(1, 2), 0);
        assertEquals(8, result.getElement(1, 3), 0);
        assertEquals(10, result.getElement(1, 4), 0);
        assertEquals(12, result.getElement(1, 5), 0);
    }

    @Test
    public void testTranspose6x3(){
        Matrix result = firstMat6x3.getTranspose();
        assertEquals(1, result.getElement(0, 0), 0);
        assertEquals(4, result.getElement(0, 1), 0);
        assertEquals(7, result.getElement(0, 2), 0);
        assertEquals(10, result.getElement(0, 3), 0);
        assertEquals(13, result.getElement(0, 4), 0);
        assertEquals(16, result.getElement(0, 5), 0);
        assertEquals(2, result.getElement(1, 0), 0);
        assertEquals(5, result.getElement(1, 1), 0);
        assertEquals(8, result.getElement(1, 2), 0);
        assertEquals(11, result.getElement(1, 3), 0);
        assertEquals(14, result.getElement(1, 4), 0);
        assertEquals(17, result.getElement(1, 5), 0);
        assertEquals(3, result.getElement(2, 0), 0);
        assertEquals(6, result.getElement(2, 1), 0);
        assertEquals(9, result.getElement(2, 2), 0);
        assertEquals(12, result.getElement(2, 3), 0);
        assertEquals(15, result.getElement(2, 4), 0);
        assertEquals(18, result.getElement(2, 5), 0);
    }

    @Test
    public void testTranspose6x4(){
        Matrix result = firstMat6x4.getTranspose();
        assertEquals(1, result.getElement(0, 0), 0);
        assertEquals(5, result.getElement(0, 1), 0);
        assertEquals(9, result.getElement(0, 2), 0);
        assertEquals(13, result.getElement(0, 3), 0);
        assertEquals(17, result.getElement(0, 4), 0);
        assertEquals(21, result.getElement(0, 5), 0);
        assertEquals(2, result.getElement(1, 0), 0);
        assertEquals(6, result.getElement(1, 1), 0);
        assertEquals(10, result.getElement(1, 2), 0);
        assertEquals(14, result.getElement(1, 3), 0);
        assertEquals(18, result.getElement(1, 4), 0);
        assertEquals(22, result.getElement(1, 5), 0);
        assertEquals(3, result.getElement(2, 0), 0);
        assertEquals(7, result.getElement(2, 1), 0);
        assertEquals(11, result.getElement(2, 2), 0);
        assertEquals(15, result.getElement(2, 3), 0);
        assertEquals(19, result.getElement(2, 4), 0);
        assertEquals(23, result.getElement(2, 5), 0);
        assertEquals(4, result.getElement(3, 0), 0);
        assertEquals(8, result.getElement(3, 1), 0);
        assertEquals(12, result.getElement(3, 2), 0);
        assertEquals(16, result.getElement(3, 3), 0);
        assertEquals(20, result.getElement(3, 4), 0);
        assertEquals(24, result.getElement(3, 5), 0);
    }

    @Test
    public void testTranspose6x5(){
        Matrix result = firstMat6x5.getTranspose();
        assertEquals(1, result.getElement(0, 0), 0);
        assertEquals(6, result.getElement(0, 1), 0);
        assertEquals(11, result.getElement(0, 2), 0);
        assertEquals(16, result.getElement(0, 3), 0);
        assertEquals(21, result.getElement(0, 4), 0);
        assertEquals(26, result.getElement(0, 5), 0);
        assertEquals(2, result.getElement(1, 0), 0);
        assertEquals(7, result.getElement(1, 1), 0);
        assertEquals(12, result.getElement(1, 2), 0);
        assertEquals(17, result.getElement(1, 3), 0);
        assertEquals(22, result.getElement(1, 4), 0);
        assertEquals(27, result.getElement(1, 5), 0);
        assertEquals(3, result.getElement(2, 0), 0);
        assertEquals(8, result.getElement(2, 1), 0);
        assertEquals(13, result.getElement(2, 2), 0);
        assertEquals(18, result.getElement(2, 3), 0);
        assertEquals(23, result.getElement(2, 4), 0);
        assertEquals(28, result.getElement(2, 5), 0);
        assertEquals(4, result.getElement(3, 0), 0);
        assertEquals(9, result.getElement(3, 1), 0);
        assertEquals(14, result.getElement(3, 2), 0);
        assertEquals(19, result.getElement(3, 3), 0);
        assertEquals(24, result.getElement(3, 4), 0);
        assertEquals(29, result.getElement(3, 5), 0);
        assertEquals(5, result.getElement(4, 0), 0);
        assertEquals(10, result.getElement(4, 1), 0);
        assertEquals(15, result.getElement(4, 2), 0);
        assertEquals(20, result.getElement(4, 3), 0);
        assertEquals(25, result.getElement(4, 4), 0);
        assertEquals(30, result.getElement(4, 5), 0);
    }

    @Test
    public void testTranspose6x6(){
        Matrix result = firstMat6x6.getTranspose();
        assertEquals(1, result.getElement(0, 0), 0);
        assertEquals(7, result.getElement(0, 1), 0);
        assertEquals(13, result.getElement(0, 2), 0);
        assertEquals(19, result.getElement(0, 3), 0);
        assertEquals(25, result.getElement(0, 4), 0);
        assertEquals(31, result.getElement(0, 5), 0);
        assertEquals(2, result.getElement(1, 0), 0);
        assertEquals(8, result.getElement(1, 1), 0);
        assertEquals(14, result.getElement(1, 2), 0);
        assertEquals(20, result.getElement(1, 3), 0);
        assertEquals(26, result.getElement(1, 4), 0);
        assertEquals(32, result.getElement(1, 5), 0);
        assertEquals(3, result.getElement(2, 0), 0);
        assertEquals(9, result.getElement(2, 1), 0);
        assertEquals(15, result.getElement(2, 2), 0);
        assertEquals(21, result.getElement(2, 3), 0);
        assertEquals(27, result.getElement(2, 4), 0);
        assertEquals(33, result.getElement(2, 5), 0);
        assertEquals(4, result.getElement(3, 0), 0);
        assertEquals(10, result.getElement(3, 1), 0);
        assertEquals(16, result.getElement(3, 2), 0);
        assertEquals(22, result.getElement(3, 3), 0);
        assertEquals(28, result.getElement(3, 4), 0);
        assertEquals(34, result.getElement(3, 5), 0);
        assertEquals(5, result.getElement(4, 0), 0);
        assertEquals(11, result.getElement(4, 1), 0);
        assertEquals(17, result.getElement(4, 2), 0);
        assertEquals(23, result.getElement(4, 3), 0);
        assertEquals(29, result.getElement(4, 4), 0);
        assertEquals(35, result.getElement(4, 5), 0);
        assertEquals(6, result.getElement(5, 0), 0);
        assertEquals(12, result.getElement(5, 1), 0);
        assertEquals(18, result.getElement(5, 2), 0);
        assertEquals(24, result.getElement(5, 3), 0);
        assertEquals(30, result.getElement(5, 4), 0);
        assertEquals(36, result.getElement(5, 5), 0);
    }

    @Test
    public void testSubtraction2x2(){
        Matrix result = firstMat2x2.getDifferenceMatrix(secondMat2x2);
        assertEquals(-4, result.getElement(0, 0), 0);
        assertEquals(-4, result.getElement(0, 1), 0);
        assertEquals(-4, result.getElement(1, 0), 0);
        assertEquals(-4, result.getElement(1, 1), 0);
    }

    @Test
    public void testSubtraction2x3(){
        Matrix result = firstMat2x3.getDifferenceMatrix(secondMat2x3);
        assertEquals(-6, result.getElement(0, 0), 0);
        assertEquals(-6, result.getElement(0, 1), 0);
        assertEquals(-6, result.getElement(0, 2), 0);
        assertEquals(-6, result.getElement(1, 0), 0);
        assertEquals(-6, result.getElement(1, 1), 0);
        assertEquals(-6, result.getElement(1, 2), 0);
    }

    @Test
    public void testSubtraction2x4(){
        Matrix result = firstMat2x4.getDifferenceMatrix(secondMat2x4);
        assertEquals(-8, result.getElement(0, 0), 0);
        assertEquals(-8, result.getElement(0, 1), 0);
        assertEquals(-8, result.getElement(0, 2), 0);
        assertEquals(-8, result.getElement(0, 3), 0);
        assertEquals(-8, result.getElement(1, 0), 0);
        assertEquals(-8, result.getElement(1, 1), 0);
        assertEquals(-8, result.getElement(1, 2), 0);
        assertEquals(-8, result.getElement(1, 3), 0);
    }

    @Test
    public void testSubtraction2x5(){
        Matrix result = firstMat2x5.getDifferenceMatrix(secondMat2x5);
        assertEquals(-10, result.getElement(0, 0), 0);
        assertEquals(-10, result.getElement(0, 1), 0);
        assertEquals(-10, result.getElement(0, 2), 0);
        assertEquals(-10, result.getElement(0, 3), 0);
        assertEquals(-10, result.getElement(0, 4), 0);
        assertEquals(-10, result.getElement(1, 0), 0);
        assertEquals(-10, result.getElement(1, 1), 0);
        assertEquals(-10, result.getElement(1, 2), 0);
        assertEquals(-10, result.getElement(1, 3), 0);
        assertEquals(-10, result.getElement(1, 4), 0);
    }

    @Test
    public void testSubtraction2x6(){
        Matrix result = firstMat2x6.getDifferenceMatrix(secondMat2x6);
        assertEquals(-12, result.getElement(0, 0), 0);
        assertEquals(-12, result.getElement(0, 1), 0);
        assertEquals(-12, result.getElement(0, 2), 0);
        assertEquals(-12, result.getElement(0, 3), 0);
        assertEquals(-12, result.getElement(0, 4), 0);
        assertEquals(-12, result.getElement(0, 5), 0);
        assertEquals(-12, result.getElement(1, 0), 0);
        assertEquals(-12, result.getElement(1, 1), 0);
        assertEquals(-12, result.getElement(1, 2), 0);
        assertEquals(-12, result.getElement(1, 3), 0);
        assertEquals(-12, result.getElement(1, 4), 0);
        assertEquals(-12, result.getElement(1, 5), 0);
    }

    @Test
    public void testSubtraction3x2(){
        Matrix result = firstMat3x2.getDifferenceMatrix(secondMat3x2);
        assertEquals(-6, result.getElement(0, 0), 0);
        assertEquals(-6, result.getElement(0, 1), 0);
        assertEquals(-6, result.getElement(1, 0), 0);
        assertEquals(-6, result.getElement(1, 1), 0);
        assertEquals(-6, result.getElement(2, 0), 0);
        assertEquals(-6, result.getElement(2, 1), 0);
    }

    @Test
    public void testSubtraction3x3(){
        Matrix result = firstMat3x3.getDifferenceMatrix(secondMat3x3);
        assertEquals(-9, result.getElement(0, 0), 0);
        assertEquals(-9, result.getElement(0, 1), 0);
        assertEquals(-9, result.getElement(0, 2), 0);
        assertEquals(-9, result.getElement(1, 0), 0);
        assertEquals(-9, result.getElement(1, 1), 0);
        assertEquals(-9, result.getElement(1, 2), 0);
        assertEquals(-9, result.getElement(2, 0), 0);
        assertEquals(-9, result.getElement(2, 1), 0);
        assertEquals(-9, result.getElement(2, 2), 0);
    }

    @Test
    public void testSubtraction3x4(){
        Matrix result = firstMat3x4.getDifferenceMatrix(secondMat3x4);
        assertEquals(-12, result.getElement(0, 0), 0);
        assertEquals(-12, result.getElement(0, 1), 0);
        assertEquals(-12, result.getElement(0, 2), 0);
        assertEquals(-12, result.getElement(0, 3), 0);
        assertEquals(-12, result.getElement(1, 0), 0);
        assertEquals(-12, result.getElement(1, 1), 0);
        assertEquals(-12, result.getElement(1, 2), 0);
        assertEquals(-12, result.getElement(1, 3), 0);
        assertEquals(-12, result.getElement(2, 0), 0);
        assertEquals(-12, result.getElement(2, 1), 0);
        assertEquals(-12, result.getElement(2, 2), 0);
        assertEquals(-12, result.getElement(2, 3), 0);
    }

    @Test
    public void testSubtraction3x5(){
        Matrix result = firstMat3x5.getDifferenceMatrix(secondMat3x5);
        assertEquals(-15, result.getElement(0, 0), 0);
        assertEquals(-15, result.getElement(0, 1), 0);
        assertEquals(-15, result.getElement(0, 2), 0);
        assertEquals(-15, result.getElement(0, 3), 0);
        assertEquals(-15, result.getElement(0, 4), 0);
        assertEquals(-15, result.getElement(1, 0), 0);
        assertEquals(-15, result.getElement(1, 1), 0);
        assertEquals(-15, result.getElement(1, 2), 0);
        assertEquals(-15, result.getElement(1, 3), 0);
        assertEquals(-15, result.getElement(1, 4), 0);
        assertEquals(-15, result.getElement(2, 0), 0);
        assertEquals(-15, result.getElement(2, 1), 0);
        assertEquals(-15, result.getElement(2, 2), 0);
        assertEquals(-15, result.getElement(2, 3), 0);
        assertEquals(-15, result.getElement(2, 4), 0);
    }

    @Test
    public void testSubtraction3x6(){
        Matrix result = firstMat3x6.getDifferenceMatrix(secondMat3x6);
        assertEquals(-18, result.getElement(0, 0), 0);
        assertEquals(-18, result.getElement(0, 1), 0);
        assertEquals(-18, result.getElement(0, 2), 0);
        assertEquals(-18, result.getElement(0, 3), 0);
        assertEquals(-18, result.getElement(0, 4), 0);
        assertEquals(-18, result.getElement(0, 5), 0);
        assertEquals(-18, result.getElement(1, 0), 0);
        assertEquals(-18, result.getElement(1, 1), 0);
        assertEquals(-18, result.getElement(1, 2), 0);
        assertEquals(-18, result.getElement(1, 3), 0);
        assertEquals(-18, result.getElement(1, 4), 0);
        assertEquals(-18, result.getElement(1, 5), 0);
        assertEquals(-18, result.getElement(2, 0), 0);
        assertEquals(-18, result.getElement(2, 1), 0);
        assertEquals(-18, result.getElement(2, 2), 0);
        assertEquals(-18, result.getElement(2, 3), 0);
        assertEquals(-18, result.getElement(2, 4), 0);
        assertEquals(-18, result.getElement(2, 5), 0);
    }

    @Test
    public void testSubtraction4x2(){
        Matrix result = firstMat4x2.getDifferenceMatrix(secondMat4x2);
        assertEquals(-8, result.getElement(0, 0), 0);
        assertEquals(-8, result.getElement(0, 1), 0);
        assertEquals(-8, result.getElement(1, 0), 0);
        assertEquals(-8, result.getElement(1, 1), 0);
        assertEquals(-8, result.getElement(2, 0), 0);
        assertEquals(-8, result.getElement(2, 1), 0);
        assertEquals(-8, result.getElement(3, 0), 0);
        assertEquals(-8, result.getElement(3, 1), 0);
    }

    @Test
    public void testSubtraction4x3(){
        Matrix result = firstMat4x3.getDifferenceMatrix(secondMat4x3);
        assertEquals(-12, result.getElement(0, 0), 0);
        assertEquals(-12, result.getElement(0, 1), 0);
        assertEquals(-12, result.getElement(0, 2), 0);
        assertEquals(-12, result.getElement(1, 0), 0);
        assertEquals(-12, result.getElement(1, 1), 0);
        assertEquals(-12, result.getElement(1, 2), 0);
        assertEquals(-12, result.getElement(2, 0), 0);
        assertEquals(-12, result.getElement(2, 1), 0);
        assertEquals(-12, result.getElement(2, 2), 0);
        assertEquals(-12, result.getElement(3, 0), 0);
        assertEquals(-12, result.getElement(3, 1), 0);
        assertEquals(-12, result.getElement(3, 2), 0);
    }

    @Test
    public void testSubtraction4x4(){
        Matrix result = firstMat4x4.getDifferenceMatrix(secondMat4x4);
        assertEquals(-16, result.getElement(0, 0), 0);
        assertEquals(-16, result.getElement(0, 1), 0);
        assertEquals(-16, result.getElement(0, 2), 0);
        assertEquals(-16, result.getElement(0, 3), 0);
        assertEquals(-16, result.getElement(1, 0), 0);
        assertEquals(-16, result.getElement(1, 1), 0);
        assertEquals(-16, result.getElement(1, 2), 0);
        assertEquals(-16, result.getElement(1, 3), 0);
        assertEquals(-16, result.getElement(2, 0), 0);
        assertEquals(-16, result.getElement(2, 1), 0);
        assertEquals(-16, result.getElement(2, 2), 0);
        assertEquals(-16, result.getElement(2, 3), 0);
        assertEquals(-16, result.getElement(3, 0), 0);
        assertEquals(-16, result.getElement(3, 1), 0);
        assertEquals(-16, result.getElement(3, 2), 0);
        assertEquals(-16, result.getElement(3, 3), 0);
    }

    @Test
    public void testSubtraction4x5(){
        Matrix result = firstMat4x5.getDifferenceMatrix(secondMat4x5);
        assertEquals(-20, result.getElement(0, 0), 0);
        assertEquals(-20, result.getElement(0, 1), 0);
        assertEquals(-20, result.getElement(0, 2), 0);
        assertEquals(-20, result.getElement(0, 3), 0);
        assertEquals(-20, result.getElement(0, 4), 0);
        assertEquals(-20, result.getElement(1, 0), 0);
        assertEquals(-20, result.getElement(1, 1), 0);
        assertEquals(-20, result.getElement(1, 2), 0);
        assertEquals(-20, result.getElement(1, 3), 0);
        assertEquals(-20, result.getElement(1, 4), 0);
        assertEquals(-20, result.getElement(2, 0), 0);
        assertEquals(-20, result.getElement(2, 1), 0);
        assertEquals(-20, result.getElement(2, 2), 0);
        assertEquals(-20, result.getElement(2, 3), 0);
        assertEquals(-20, result.getElement(2, 4), 0);
        assertEquals(-20, result.getElement(3, 0), 0);
        assertEquals(-20, result.getElement(3, 1), 0);
        assertEquals(-20, result.getElement(3, 2), 0);
        assertEquals(-20, result.getElement(3, 3), 0);
        assertEquals(-20, result.getElement(3, 4), 0);
    }

    @Test
    public void testSubtraction4x6(){
        Matrix result = firstMat4x6.getDifferenceMatrix(secondMat4x6);
        assertEquals(-24, result.getElement(0, 0), 0);
        assertEquals(-24, result.getElement(0, 1), 0);
        assertEquals(-24, result.getElement(0, 2), 0);
        assertEquals(-24, result.getElement(0, 3), 0);
        assertEquals(-24, result.getElement(0, 4), 0);
        assertEquals(-24, result.getElement(0, 5), 0);
        assertEquals(-24, result.getElement(1, 0), 0);
        assertEquals(-24, result.getElement(1, 1), 0);
        assertEquals(-24, result.getElement(1, 2), 0);
        assertEquals(-24, result.getElement(1, 3), 0);
        assertEquals(-24, result.getElement(1, 4), 0);
        assertEquals(-24, result.getElement(1, 5), 0);
        assertEquals(-24, result.getElement(2, 0), 0);
        assertEquals(-24, result.getElement(2, 1), 0);
        assertEquals(-24, result.getElement(2, 2), 0);
        assertEquals(-24, result.getElement(2, 3), 0);
        assertEquals(-24, result.getElement(2, 4), 0);
        assertEquals(-24, result.getElement(2, 5), 0);
        assertEquals(-24, result.getElement(3, 0), 0);
        assertEquals(-24, result.getElement(3, 1), 0);
        assertEquals(-24, result.getElement(3, 2), 0);
        assertEquals(-24, result.getElement(3, 3), 0);
        assertEquals(-24, result.getElement(3, 4), 0);
        assertEquals(-24, result.getElement(3, 5), 0);
    }

    @Test
    public void testSubtraction5x2(){
        Matrix result = firstMat5x2.getDifferenceMatrix(secondMat5x2);
        assertEquals(-10, result.getElement(0, 0), 0);
        assertEquals(-10, result.getElement(0, 1), 0);
        assertEquals(-10, result.getElement(1, 0), 0);
        assertEquals(-10, result.getElement(1, 1), 0);
        assertEquals(-10, result.getElement(2, 0), 0);
        assertEquals(-10, result.getElement(2, 1), 0);
        assertEquals(-10, result.getElement(3, 0), 0);
        assertEquals(-10, result.getElement(3, 1), 0);
        assertEquals(-10, result.getElement(4, 0), 0);
        assertEquals(-10, result.getElement(4, 1), 0);
    }

    @Test
    public void testSubtraction5x3(){
        Matrix result = firstMat5x3.getDifferenceMatrix(secondMat5x3);
        assertEquals(-15, result.getElement(0, 0), 0);
        assertEquals(-15, result.getElement(0, 1), 0);
        assertEquals(-15, result.getElement(0, 2), 0);
        assertEquals(-15, result.getElement(1, 0), 0);
        assertEquals(-15, result.getElement(1, 1), 0);
        assertEquals(-15, result.getElement(1, 2), 0);
        assertEquals(-15, result.getElement(2, 0), 0);
        assertEquals(-15, result.getElement(2, 1), 0);
        assertEquals(-15, result.getElement(2, 2), 0);
        assertEquals(-15, result.getElement(3, 0), 0);
        assertEquals(-15, result.getElement(3, 1), 0);
        assertEquals(-15, result.getElement(3, 2), 0);
        assertEquals(-15, result.getElement(4, 0), 0);
        assertEquals(-15, result.getElement(4, 1), 0);
        assertEquals(-15, result.getElement(4, 2), 0);
    }

    @Test
    public void testSubtraction5x4(){
        Matrix result = firstMat5x4.getDifferenceMatrix(secondMat5x4);
        assertEquals(-20, result.getElement(0, 0), 0);
        assertEquals(-20, result.getElement(0, 1), 0);
        assertEquals(-20, result.getElement(0, 2), 0);
        assertEquals(-20, result.getElement(0, 3), 0);
        assertEquals(-20, result.getElement(1, 0), 0);
        assertEquals(-20, result.getElement(1, 1), 0);
        assertEquals(-20, result.getElement(1, 2), 0);
        assertEquals(-20, result.getElement(1, 3), 0);
        assertEquals(-20, result.getElement(2, 0), 0);
        assertEquals(-20, result.getElement(2, 1), 0);
        assertEquals(-20, result.getElement(2, 2), 0);
        assertEquals(-20, result.getElement(2, 3), 0);
        assertEquals(-20, result.getElement(3, 0), 0);
        assertEquals(-20, result.getElement(3, 1), 0);
        assertEquals(-20, result.getElement(3, 2), 0);
        assertEquals(-20, result.getElement(3, 3), 0);
        assertEquals(-20, result.getElement(4, 0), 0);
        assertEquals(-20, result.getElement(4, 1), 0);
        assertEquals(-20, result.getElement(4, 2), 0);
        assertEquals(-20, result.getElement(4, 3), 0);
    }

    @Test
    public void testSubtraction5x5(){
        Matrix result = firstMat5x5.getDifferenceMatrix(secondMat5x5);
        assertEquals(-25, result.getElement(0, 0), 0);
        assertEquals(-25, result.getElement(0, 1), 0);
        assertEquals(-25, result.getElement(0, 2), 0);
        assertEquals(-25, result.getElement(0, 3), 0);
        assertEquals(-25, result.getElement(0, 4), 0);
        assertEquals(-25, result.getElement(1, 0), 0);
        assertEquals(-25, result.getElement(1, 1), 0);
        assertEquals(-25, result.getElement(1, 2), 0);
        assertEquals(-25, result.getElement(1, 3), 0);
        assertEquals(-25, result.getElement(1, 4), 0);
        assertEquals(-25, result.getElement(2, 0), 0);
        assertEquals(-25, result.getElement(2, 1), 0);
        assertEquals(-25, result.getElement(2, 2), 0);
        assertEquals(-25, result.getElement(2, 3), 0);
        assertEquals(-25, result.getElement(2, 4), 0);
        assertEquals(-25, result.getElement(3, 0), 0);
        assertEquals(-25, result.getElement(3, 1), 0);
        assertEquals(-25, result.getElement(3, 2), 0);
        assertEquals(-25, result.getElement(3, 3), 0);
        assertEquals(-25, result.getElement(3, 4), 0);
        assertEquals(-25, result.getElement(4, 0), 0);
        assertEquals(-25, result.getElement(4, 1), 0);
        assertEquals(-25, result.getElement(4, 2), 0);
        assertEquals(-25, result.getElement(4, 3), 0);
        assertEquals(-25, result.getElement(4, 4), 0);
    }

    @Test
    public void testSubtraction5x6(){
        Matrix result = firstMat5x6.getDifferenceMatrix(secondMat5x6);
        assertEquals(-30, result.getElement(0, 0), 0);
        assertEquals(-30, result.getElement(0, 1), 0);
        assertEquals(-30, result.getElement(0, 2), 0);
        assertEquals(-30, result.getElement(0, 3), 0);
        assertEquals(-30, result.getElement(0, 4), 0);
        assertEquals(-30, result.getElement(0, 5), 0);
        assertEquals(-30, result.getElement(1, 0), 0);
        assertEquals(-30, result.getElement(1, 1), 0);
        assertEquals(-30, result.getElement(1, 2), 0);
        assertEquals(-30, result.getElement(1, 3), 0);
        assertEquals(-30, result.getElement(1, 4), 0);
        assertEquals(-30, result.getElement(1, 5), 0);
        assertEquals(-30, result.getElement(2, 0), 0);
        assertEquals(-30, result.getElement(2, 1), 0);
        assertEquals(-30, result.getElement(2, 2), 0);
        assertEquals(-30, result.getElement(2, 3), 0);
        assertEquals(-30, result.getElement(2, 4), 0);
        assertEquals(-30, result.getElement(2, 5), 0);
        assertEquals(-30, result.getElement(3, 0), 0);
        assertEquals(-30, result.getElement(3, 1), 0);
        assertEquals(-30, result.getElement(3, 2), 0);
        assertEquals(-30, result.getElement(3, 3), 0);
        assertEquals(-30, result.getElement(3, 4), 0);
        assertEquals(-30, result.getElement(3, 5), 0);
        assertEquals(-30, result.getElement(4, 0), 0);
        assertEquals(-30, result.getElement(4, 1), 0);
        assertEquals(-30, result.getElement(4, 2), 0);
        assertEquals(-30, result.getElement(4, 3), 0);
        assertEquals(-30, result.getElement(4, 4), 0);
        assertEquals(-30, result.getElement(4, 5), 0);
    }

    @Test
    public void testSubtraction6x2(){
        Matrix result = firstMat6x2.getDifferenceMatrix(secondMat6x2);
        assertEquals(-12, result.getElement(0, 0), 0);
        assertEquals(-12, result.getElement(0, 1), 0);
        assertEquals(-12, result.getElement(1, 0), 0);
        assertEquals(-12, result.getElement(1, 1), 0);
        assertEquals(-12, result.getElement(2, 0), 0);
        assertEquals(-12, result.getElement(2, 1), 0);
        assertEquals(-12, result.getElement(3, 0), 0);
        assertEquals(-12, result.getElement(3, 1), 0);
        assertEquals(-12, result.getElement(4, 0), 0);
        assertEquals(-12, result.getElement(4, 1), 0);
        assertEquals(-12, result.getElement(5, 0), 0);
        assertEquals(-12, result.getElement(5, 1), 0);
    }

    @Test
    public void testSubtraction6x3(){
        Matrix result = firstMat6x3.getDifferenceMatrix(secondMat6x3);
        assertEquals(-18, result.getElement(0, 0), 0);
        assertEquals(-18, result.getElement(0, 1), 0);
        assertEquals(-18, result.getElement(0, 2), 0);
        assertEquals(-18, result.getElement(1, 0), 0);
        assertEquals(-18, result.getElement(1, 1), 0);
        assertEquals(-18, result.getElement(1, 2), 0);
        assertEquals(-18, result.getElement(2, 0), 0);
        assertEquals(-18, result.getElement(2, 1), 0);
        assertEquals(-18, result.getElement(2, 2), 0);
        assertEquals(-18, result.getElement(3, 0), 0);
        assertEquals(-18, result.getElement(3, 1), 0);
        assertEquals(-18, result.getElement(3, 2), 0);
        assertEquals(-18, result.getElement(4, 0), 0);
        assertEquals(-18, result.getElement(4, 1), 0);
        assertEquals(-18, result.getElement(4, 2), 0);
        assertEquals(-18, result.getElement(5, 0), 0);
        assertEquals(-18, result.getElement(5, 1), 0);
        assertEquals(-18, result.getElement(5, 2), 0);
    }

    @Test
    public void testSubtraction6x4(){
        Matrix result = firstMat6x4.getDifferenceMatrix(secondMat6x4);
        assertEquals(-24, result.getElement(0, 0), 0);
        assertEquals(-24, result.getElement(0, 1), 0);
        assertEquals(-24, result.getElement(0, 2), 0);
        assertEquals(-24, result.getElement(0, 3), 0);
        assertEquals(-24, result.getElement(1, 0), 0);
        assertEquals(-24, result.getElement(1, 1), 0);
        assertEquals(-24, result.getElement(1, 2), 0);
        assertEquals(-24, result.getElement(1, 3), 0);
        assertEquals(-24, result.getElement(2, 0), 0);
        assertEquals(-24, result.getElement(2, 1), 0);
        assertEquals(-24, result.getElement(2, 2), 0);
        assertEquals(-24, result.getElement(2, 3), 0);
        assertEquals(-24, result.getElement(3, 0), 0);
        assertEquals(-24, result.getElement(3, 1), 0);
        assertEquals(-24, result.getElement(3, 2), 0);
        assertEquals(-24, result.getElement(3, 3), 0);
        assertEquals(-24, result.getElement(4, 0), 0);
        assertEquals(-24, result.getElement(4, 1), 0);
        assertEquals(-24, result.getElement(4, 2), 0);
        assertEquals(-24, result.getElement(4, 3), 0);
        assertEquals(-24, result.getElement(5, 0), 0);
        assertEquals(-24, result.getElement(5, 1), 0);
        assertEquals(-24, result.getElement(5, 2), 0);
        assertEquals(-24, result.getElement(5, 3), 0);
    }

    @Test
    public void testSubtraction6x5(){
        Matrix result = firstMat6x5.getDifferenceMatrix(secondMat6x5);
        assertEquals(-30, result.getElement(0, 0), 0);
        assertEquals(-30, result.getElement(0, 1), 0);
        assertEquals(-30, result.getElement(0, 2), 0);
        assertEquals(-30, result.getElement(0, 3), 0);
        assertEquals(-30, result.getElement(0, 4), 0);
        assertEquals(-30, result.getElement(1, 0), 0);
        assertEquals(-30, result.getElement(1, 1), 0);
        assertEquals(-30, result.getElement(1, 2), 0);
        assertEquals(-30, result.getElement(1, 3), 0);
        assertEquals(-30, result.getElement(1, 4), 0);
        assertEquals(-30, result.getElement(2, 0), 0);
        assertEquals(-30, result.getElement(2, 1), 0);
        assertEquals(-30, result.getElement(2, 2), 0);
        assertEquals(-30, result.getElement(2, 3), 0);
        assertEquals(-30, result.getElement(2, 4), 0);
        assertEquals(-30, result.getElement(3, 0), 0);
        assertEquals(-30, result.getElement(3, 1), 0);
        assertEquals(-30, result.getElement(3, 2), 0);
        assertEquals(-30, result.getElement(3, 3), 0);
        assertEquals(-30, result.getElement(3, 4), 0);
        assertEquals(-30, result.getElement(4, 0), 0);
        assertEquals(-30, result.getElement(4, 1), 0);
        assertEquals(-30, result.getElement(4, 2), 0);
        assertEquals(-30, result.getElement(4, 3), 0);
        assertEquals(-30, result.getElement(4, 4), 0);
        assertEquals(-30, result.getElement(5, 0), 0);
        assertEquals(-30, result.getElement(5, 1), 0);
        assertEquals(-30, result.getElement(5, 2), 0);
        assertEquals(-30, result.getElement(5, 3), 0);
        assertEquals(-30, result.getElement(5, 4), 0);
    }

    @Test
    public void testSubtraction6x6(){
        Matrix result = firstMat6x6.getDifferenceMatrix(secondMat6x6);
        assertEquals(-36, result.getElement(0, 0), 0);
        assertEquals(-36, result.getElement(0, 1), 0);
        assertEquals(-36, result.getElement(0, 2), 0);
        assertEquals(-36, result.getElement(0, 3), 0);
        assertEquals(-36, result.getElement(0, 4), 0);
        assertEquals(-36, result.getElement(0, 5), 0);
        assertEquals(-36, result.getElement(1, 0), 0);
        assertEquals(-36, result.getElement(1, 1), 0);
        assertEquals(-36, result.getElement(1, 2), 0);
        assertEquals(-36, result.getElement(1, 3), 0);
        assertEquals(-36, result.getElement(1, 4), 0);
        assertEquals(-36, result.getElement(1, 5), 0);
        assertEquals(-36, result.getElement(2, 0), 0);
        assertEquals(-36, result.getElement(2, 1), 0);
        assertEquals(-36, result.getElement(2, 2), 0);
        assertEquals(-36, result.getElement(2, 3), 0);
        assertEquals(-36, result.getElement(2, 4), 0);
        assertEquals(-36, result.getElement(2, 5), 0);
        assertEquals(-36, result.getElement(3, 0), 0);
        assertEquals(-36, result.getElement(3, 1), 0);
        assertEquals(-36, result.getElement(3, 2), 0);
        assertEquals(-36, result.getElement(3, 3), 0);
        assertEquals(-36, result.getElement(3, 4), 0);
        assertEquals(-36, result.getElement(3, 5), 0);
        assertEquals(-36, result.getElement(4, 0), 0);
        assertEquals(-36, result.getElement(4, 1), 0);
        assertEquals(-36, result.getElement(4, 2), 0);
        assertEquals(-36, result.getElement(4, 3), 0);
        assertEquals(-36, result.getElement(4, 4), 0);
        assertEquals(-36, result.getElement(4, 5), 0);
        assertEquals(-36, result.getElement(5, 0), 0);
        assertEquals(-36, result.getElement(5, 1), 0);
        assertEquals(-36, result.getElement(5, 2), 0);
        assertEquals(-36, result.getElement(5, 3), 0);
        assertEquals(-36, result.getElement(5, 4), 0);
        assertEquals(-36, result.getElement(5, 5), 0);
    }

    @Test
    public void testScale2x2(){
        Matrix result = firstMat2x2.getScaledMatrix(2);
        assertEquals(2, result.getElement(0, 0), 0);
        assertEquals(4, result.getElement(0, 1), 0);
        assertEquals(6, result.getElement(1, 0), 0);
        assertEquals(8, result.getElement(1, 1), 0);
    }

    @Test
    public void testScale2x3(){
        Matrix result = firstMat2x3.getScaledMatrix(2);
        assertEquals(2, result.getElement(0, 0), 0);
        assertEquals(4, result.getElement(0, 1), 0);
        assertEquals(6, result.getElement(0, 2), 0);
        assertEquals(8, result.getElement(1, 0), 0);
        assertEquals(10, result.getElement(1, 1), 0);
        assertEquals(12, result.getElement(1, 2), 0);
    }

    @Test
    public void testScale2x4(){
        Matrix result = firstMat2x4.getScaledMatrix(2);
        assertEquals(2, result.getElement(0, 0), 0);
        assertEquals(4, result.getElement(0, 1), 0);
        assertEquals(6, result.getElement(0, 2), 0);
        assertEquals(8, result.getElement(0, 3), 0);
        assertEquals(10, result.getElement(1, 0), 0);
        assertEquals(12, result.getElement(1, 1), 0);
        assertEquals(14, result.getElement(1, 2), 0);
        assertEquals(16, result.getElement(1, 3), 0);
    }

    @Test
    public void testScale2x5(){
        Matrix result = firstMat2x5.getScaledMatrix(2);
        assertEquals(2, result.getElement(0, 0), 0);
        assertEquals(4, result.getElement(0, 1), 0);
        assertEquals(6, result.getElement(0, 2), 0);
        assertEquals(8, result.getElement(0, 3), 0);
        assertEquals(10, result.getElement(0, 4), 0);
        assertEquals(12, result.getElement(1, 0), 0);
        assertEquals(14, result.getElement(1, 1), 0);
        assertEquals(16, result.getElement(1, 2), 0);
        assertEquals(18, result.getElement(1, 3), 0);
        assertEquals(20, result.getElement(1, 4), 0);
    }

    @Test
    public void testScale2x6(){
        Matrix result = firstMat2x6.getScaledMatrix(2);
        assertEquals(2, result.getElement(0, 0), 0);
        assertEquals(4, result.getElement(0, 1), 0);
        assertEquals(6, result.getElement(0, 2), 0);
        assertEquals(8, result.getElement(0, 3), 0);
        assertEquals(10, result.getElement(0, 4), 0);
        assertEquals(12, result.getElement(0, 5), 0);
        assertEquals(14, result.getElement(1, 0), 0);
        assertEquals(16, result.getElement(1, 1), 0);
        assertEquals(18, result.getElement(1, 2), 0);
        assertEquals(20, result.getElement(1, 3), 0);
        assertEquals(22, result.getElement(1, 4), 0);
        assertEquals(24, result.getElement(1, 5), 0);
    }

    @Test
    public void testScale3x2(){
        Matrix result = firstMat3x2.getScaledMatrix(2);
        assertEquals(2, result.getElement(0, 0), 0);
        assertEquals(4, result.getElement(0, 1), 0);
        assertEquals(6, result.getElement(1, 0), 0);
        assertEquals(8, result.getElement(1, 1), 0);
        assertEquals(10, result.getElement(2, 0), 0);
        assertEquals(12, result.getElement(2, 1), 0);
    }

    @Test
    public void testScale3x3(){
        Matrix result = firstMat3x3.getScaledMatrix(2);
        assertEquals(2, result.getElement(0, 0), 0);
        assertEquals(4, result.getElement(0, 1), 0);
        assertEquals(6, result.getElement(0, 2), 0);
        assertEquals(8, result.getElement(1, 0), 0);
        assertEquals(10, result.getElement(1, 1), 0);
        assertEquals(12, result.getElement(1, 2), 0);
        assertEquals(14, result.getElement(2, 0), 0);
        assertEquals(16, result.getElement(2, 1), 0);
        assertEquals(18, result.getElement(2, 2), 0);
    }

    @Test
    public void testScale3x4(){
        Matrix result = firstMat3x4.getScaledMatrix(2);
        assertEquals(2, result.getElement(0, 0), 0);
        assertEquals(4, result.getElement(0, 1), 0);
        assertEquals(6, result.getElement(0, 2), 0);
        assertEquals(8, result.getElement(0, 3), 0);
        assertEquals(10, result.getElement(1, 0), 0);
        assertEquals(12, result.getElement(1, 1), 0);
        assertEquals(14, result.getElement(1, 2), 0);
        assertEquals(16, result.getElement(1, 3), 0);
        assertEquals(18, result.getElement(2, 0), 0);
        assertEquals(20, result.getElement(2, 1), 0);
        assertEquals(22, result.getElement(2, 2), 0);
        assertEquals(24, result.getElement(2, 3), 0);
    }

    @Test
    public void testScale3x5(){
        Matrix result = firstMat3x5.getScaledMatrix(2);
        assertEquals(2, result.getElement(0, 0), 0);
        assertEquals(4, result.getElement(0, 1), 0);
        assertEquals(6, result.getElement(0, 2), 0);
        assertEquals(8, result.getElement(0, 3), 0);
        assertEquals(10, result.getElement(0, 4), 0);
        assertEquals(12, result.getElement(1, 0), 0);
        assertEquals(14, result.getElement(1, 1), 0);
        assertEquals(16, result.getElement(1, 2), 0);
        assertEquals(18, result.getElement(1, 3), 0);
        assertEquals(20, result.getElement(1, 4), 0);
        assertEquals(22, result.getElement(2, 0), 0);
        assertEquals(24, result.getElement(2, 1), 0);
        assertEquals(26, result.getElement(2, 2), 0);
        assertEquals(28, result.getElement(2, 3), 0);
        assertEquals(30, result.getElement(2, 4), 0);
    }

    @Test
    public void testScale3x6(){
        Matrix result = firstMat3x6.getScaledMatrix(2);
        assertEquals(2, result.getElement(0, 0), 0);
        assertEquals(4, result.getElement(0, 1), 0);
        assertEquals(6, result.getElement(0, 2), 0);
        assertEquals(8, result.getElement(0, 3), 0);
        assertEquals(10, result.getElement(0, 4), 0);
        assertEquals(12, result.getElement(0, 5), 0);
        assertEquals(14, result.getElement(1, 0), 0);
        assertEquals(16, result.getElement(1, 1), 0);
        assertEquals(18, result.getElement(1, 2), 0);
        assertEquals(20, result.getElement(1, 3), 0);
        assertEquals(22, result.getElement(1, 4), 0);
        assertEquals(24, result.getElement(1, 5), 0);
        assertEquals(26, result.getElement(2, 0), 0);
        assertEquals(28, result.getElement(2, 1), 0);
        assertEquals(30, result.getElement(2, 2), 0);
        assertEquals(32, result.getElement(2, 3), 0);
        assertEquals(34, result.getElement(2, 4), 0);
        assertEquals(36, result.getElement(2, 5), 0);
    }

    @Test
    public void testScale4x2(){
        Matrix result = firstMat4x2.getScaledMatrix(2);
        assertEquals(2, result.getElement(0, 0), 0);
        assertEquals(4, result.getElement(0, 1), 0);
        assertEquals(6, result.getElement(1, 0), 0);
        assertEquals(8, result.getElement(1, 1), 0);
        assertEquals(10, result.getElement(2, 0), 0);
        assertEquals(12, result.getElement(2, 1), 0);
        assertEquals(14, result.getElement(3, 0), 0);
        assertEquals(16, result.getElement(3, 1), 0);
    }

    @Test
    public void testScale4x3(){
        Matrix result = firstMat4x3.getScaledMatrix(2);
        assertEquals(2, result.getElement(0, 0), 0);
        assertEquals(4, result.getElement(0, 1), 0);
        assertEquals(6, result.getElement(0, 2), 0);
        assertEquals(8, result.getElement(1, 0), 0);
        assertEquals(10, result.getElement(1, 1), 0);
        assertEquals(12, result.getElement(1, 2), 0);
        assertEquals(14, result.getElement(2, 0), 0);
        assertEquals(16, result.getElement(2, 1), 0);
        assertEquals(18, result.getElement(2, 2), 0);
        assertEquals(20, result.getElement(3, 0), 0);
        assertEquals(22, result.getElement(3, 1), 0);
        assertEquals(24, result.getElement(3, 2), 0);
    }

    @Test
    public void testScale4x4(){
        Matrix result = firstMat4x4.getScaledMatrix(2);
        assertEquals(2, result.getElement(0, 0), 0);
        assertEquals(4, result.getElement(0, 1), 0);
        assertEquals(6, result.getElement(0, 2), 0);
        assertEquals(8, result.getElement(0, 3), 0);
        assertEquals(10, result.getElement(1, 0), 0);
        assertEquals(12, result.getElement(1, 1), 0);
        assertEquals(14, result.getElement(1, 2), 0);
        assertEquals(16, result.getElement(1, 3), 0);
        assertEquals(18, result.getElement(2, 0), 0);
        assertEquals(20, result.getElement(2, 1), 0);
        assertEquals(22, result.getElement(2, 2), 0);
        assertEquals(24, result.getElement(2, 3), 0);
        assertEquals(26, result.getElement(3, 0), 0);
        assertEquals(28, result.getElement(3, 1), 0);
        assertEquals(30, result.getElement(3, 2), 0);
        assertEquals(32, result.getElement(3, 3), 0);
    }

    @Test
    public void testScale4x5(){
        Matrix result = firstMat4x5.getScaledMatrix(2);
        assertEquals(2, result.getElement(0, 0), 0);
        assertEquals(4, result.getElement(0, 1), 0);
        assertEquals(6, result.getElement(0, 2), 0);
        assertEquals(8, result.getElement(0, 3), 0);
        assertEquals(10, result.getElement(0, 4), 0);
        assertEquals(12, result.getElement(1, 0), 0);
        assertEquals(14, result.getElement(1, 1), 0);
        assertEquals(16, result.getElement(1, 2), 0);
        assertEquals(18, result.getElement(1, 3), 0);
        assertEquals(20, result.getElement(1, 4), 0);
        assertEquals(22, result.getElement(2, 0), 0);
        assertEquals(24, result.getElement(2, 1), 0);
        assertEquals(26, result.getElement(2, 2), 0);
        assertEquals(28, result.getElement(2, 3), 0);
        assertEquals(30, result.getElement(2, 4), 0);
        assertEquals(32, result.getElement(3, 0), 0);
        assertEquals(34, result.getElement(3, 1), 0);
        assertEquals(36, result.getElement(3, 2), 0);
        assertEquals(38, result.getElement(3, 3), 0);
        assertEquals(40, result.getElement(3, 4), 0);
    }

    @Test
    public void testScale4x6(){
        Matrix result = firstMat4x6.getScaledMatrix(2);
        assertEquals(2, result.getElement(0, 0), 0);
        assertEquals(4, result.getElement(0, 1), 0);
        assertEquals(6, result.getElement(0, 2), 0);
        assertEquals(8, result.getElement(0, 3), 0);
        assertEquals(10, result.getElement(0, 4), 0);
        assertEquals(12, result.getElement(0, 5), 0);
        assertEquals(14, result.getElement(1, 0), 0);
        assertEquals(16, result.getElement(1, 1), 0);
        assertEquals(18, result.getElement(1, 2), 0);
        assertEquals(20, result.getElement(1, 3), 0);
        assertEquals(22, result.getElement(1, 4), 0);
        assertEquals(24, result.getElement(1, 5), 0);
        assertEquals(26, result.getElement(2, 0), 0);
        assertEquals(28, result.getElement(2, 1), 0);
        assertEquals(30, result.getElement(2, 2), 0);
        assertEquals(32, result.getElement(2, 3), 0);
        assertEquals(34, result.getElement(2, 4), 0);
        assertEquals(36, result.getElement(2, 5), 0);
        assertEquals(38, result.getElement(3, 0), 0);
        assertEquals(40, result.getElement(3, 1), 0);
        assertEquals(42, result.getElement(3, 2), 0);
        assertEquals(44, result.getElement(3, 3), 0);
        assertEquals(46, result.getElement(3, 4), 0);
        assertEquals(48, result.getElement(3, 5), 0);
    }

    @Test
    public void testScale5x2(){
        Matrix result = firstMat5x2.getScaledMatrix(2);
        assertEquals(2, result.getElement(0, 0), 0);
        assertEquals(4, result.getElement(0, 1), 0);
        assertEquals(6, result.getElement(1, 0), 0);
        assertEquals(8, result.getElement(1, 1), 0);
        assertEquals(10, result.getElement(2, 0), 0);
        assertEquals(12, result.getElement(2, 1), 0);
        assertEquals(14, result.getElement(3, 0), 0);
        assertEquals(16, result.getElement(3, 1), 0);
        assertEquals(18, result.getElement(4, 0), 0);
        assertEquals(20, result.getElement(4, 1), 0);
    }

    @Test
    public void testScale5x3(){
        Matrix result = firstMat5x3.getScaledMatrix(2);
        assertEquals(2, result.getElement(0, 0), 0);
        assertEquals(4, result.getElement(0, 1), 0);
        assertEquals(6, result.getElement(0, 2), 0);
        assertEquals(8, result.getElement(1, 0), 0);
        assertEquals(10, result.getElement(1, 1), 0);
        assertEquals(12, result.getElement(1, 2), 0);
        assertEquals(14, result.getElement(2, 0), 0);
        assertEquals(16, result.getElement(2, 1), 0);
        assertEquals(18, result.getElement(2, 2), 0);
        assertEquals(20, result.getElement(3, 0), 0);
        assertEquals(22, result.getElement(3, 1), 0);
        assertEquals(24, result.getElement(3, 2), 0);
        assertEquals(26, result.getElement(4, 0), 0);
        assertEquals(28, result.getElement(4, 1), 0);
        assertEquals(30, result.getElement(4, 2), 0);
    }

    @Test
    public void testScale5x4(){
        Matrix result = firstMat5x4.getScaledMatrix(2);
        assertEquals(2, result.getElement(0, 0), 0);
        assertEquals(4, result.getElement(0, 1), 0);
        assertEquals(6, result.getElement(0, 2), 0);
        assertEquals(8, result.getElement(0, 3), 0);
        assertEquals(10, result.getElement(1, 0), 0);
        assertEquals(12, result.getElement(1, 1), 0);
        assertEquals(14, result.getElement(1, 2), 0);
        assertEquals(16, result.getElement(1, 3), 0);
        assertEquals(18, result.getElement(2, 0), 0);
        assertEquals(20, result.getElement(2, 1), 0);
        assertEquals(22, result.getElement(2, 2), 0);
        assertEquals(24, result.getElement(2, 3), 0);
        assertEquals(26, result.getElement(3, 0), 0);
        assertEquals(28, result.getElement(3, 1), 0);
        assertEquals(30, result.getElement(3, 2), 0);
        assertEquals(32, result.getElement(3, 3), 0);
        assertEquals(34, result.getElement(4, 0), 0);
        assertEquals(36, result.getElement(4, 1), 0);
        assertEquals(38, result.getElement(4, 2), 0);
        assertEquals(40, result.getElement(4, 3), 0);
    }

    @Test
    public void testScale5x5(){
        Matrix result = firstMat5x5.getScaledMatrix(2);
        assertEquals(2, result.getElement(0, 0), 0);
        assertEquals(4, result.getElement(0, 1), 0);
        assertEquals(6, result.getElement(0, 2), 0);
        assertEquals(8, result.getElement(0, 3), 0);
        assertEquals(10, result.getElement(0, 4), 0);
        assertEquals(12, result.getElement(1, 0), 0);
        assertEquals(14, result.getElement(1, 1), 0);
        assertEquals(16, result.getElement(1, 2), 0);
        assertEquals(18, result.getElement(1, 3), 0);
        assertEquals(20, result.getElement(1, 4), 0);
        assertEquals(22, result.getElement(2, 0), 0);
        assertEquals(24, result.getElement(2, 1), 0);
        assertEquals(26, result.getElement(2, 2), 0);
        assertEquals(28, result.getElement(2, 3), 0);
        assertEquals(30, result.getElement(2, 4), 0);
        assertEquals(32, result.getElement(3, 0), 0);
        assertEquals(34, result.getElement(3, 1), 0);
        assertEquals(36, result.getElement(3, 2), 0);
        assertEquals(38, result.getElement(3, 3), 0);
        assertEquals(40, result.getElement(3, 4), 0);
        assertEquals(42, result.getElement(4, 0), 0);
        assertEquals(44, result.getElement(4, 1), 0);
        assertEquals(46, result.getElement(4, 2), 0);
        assertEquals(48, result.getElement(4, 3), 0);
        assertEquals(50, result.getElement(4, 4), 0);
    }

    @Test
    public void testScale5x6(){
        Matrix result = firstMat5x6.getScaledMatrix(2);
        assertEquals(2, result.getElement(0, 0), 0);
        assertEquals(4, result.getElement(0, 1), 0);
        assertEquals(6, result.getElement(0, 2), 0);
        assertEquals(8, result.getElement(0, 3), 0);
        assertEquals(10, result.getElement(0, 4), 0);
        assertEquals(12, result.getElement(0, 5), 0);
        assertEquals(14, result.getElement(1, 0), 0);
        assertEquals(16, result.getElement(1, 1), 0);
        assertEquals(18, result.getElement(1, 2), 0);
        assertEquals(20, result.getElement(1, 3), 0);
        assertEquals(22, result.getElement(1, 4), 0);
        assertEquals(24, result.getElement(1, 5), 0);
        assertEquals(26, result.getElement(2, 0), 0);
        assertEquals(28, result.getElement(2, 1), 0);
        assertEquals(30, result.getElement(2, 2), 0);
        assertEquals(32, result.getElement(2, 3), 0);
        assertEquals(34, result.getElement(2, 4), 0);
        assertEquals(36, result.getElement(2, 5), 0);
        assertEquals(38, result.getElement(3, 0), 0);
        assertEquals(40, result.getElement(3, 1), 0);
        assertEquals(42, result.getElement(3, 2), 0);
        assertEquals(44, result.getElement(3, 3), 0);
        assertEquals(46, result.getElement(3, 4), 0);
        assertEquals(48, result.getElement(3, 5), 0);
        assertEquals(50, result.getElement(4, 0), 0);
        assertEquals(52, result.getElement(4, 1), 0);
        assertEquals(54, result.getElement(4, 2), 0);
        assertEquals(56, result.getElement(4, 3), 0);
        assertEquals(58, result.getElement(4, 4), 0);
        assertEquals(60, result.getElement(4, 5), 0);
    }

    @Test
    public void testScale6x2(){
        Matrix result = firstMat6x2.getScaledMatrix(2);
        assertEquals(2, result.getElement(0, 0), 0);
        assertEquals(4, result.getElement(0, 1), 0);
        assertEquals(6, result.getElement(1, 0), 0);
        assertEquals(8, result.getElement(1, 1), 0);
        assertEquals(10, result.getElement(2, 0), 0);
        assertEquals(12, result.getElement(2, 1), 0);
        assertEquals(14, result.getElement(3, 0), 0);
        assertEquals(16, result.getElement(3, 1), 0);
        assertEquals(18, result.getElement(4, 0), 0);
        assertEquals(20, result.getElement(4, 1), 0);
        assertEquals(22, result.getElement(5, 0), 0);
        assertEquals(24, result.getElement(5, 1), 0);
    }

    @Test
    public void testScale6x3(){
        Matrix result = firstMat6x3.getScaledMatrix(2);
        assertEquals(2, result.getElement(0, 0), 0);
        assertEquals(4, result.getElement(0, 1), 0);
        assertEquals(6, result.getElement(0, 2), 0);
        assertEquals(8, result.getElement(1, 0), 0);
        assertEquals(10, result.getElement(1, 1), 0);
        assertEquals(12, result.getElement(1, 2), 0);
        assertEquals(14, result.getElement(2, 0), 0);
        assertEquals(16, result.getElement(2, 1), 0);
        assertEquals(18, result.getElement(2, 2), 0);
        assertEquals(20, result.getElement(3, 0), 0);
        assertEquals(22, result.getElement(3, 1), 0);
        assertEquals(24, result.getElement(3, 2), 0);
        assertEquals(26, result.getElement(4, 0), 0);
        assertEquals(28, result.getElement(4, 1), 0);
        assertEquals(30, result.getElement(4, 2), 0);
        assertEquals(32, result.getElement(5, 0), 0);
        assertEquals(34, result.getElement(5, 1), 0);
        assertEquals(36, result.getElement(5, 2), 0);
    }

    @Test
    public void testScale6x4(){
        Matrix result = firstMat6x4.getScaledMatrix(2);
        assertEquals(2, result.getElement(0, 0), 0);
        assertEquals(4, result.getElement(0, 1), 0);
        assertEquals(6, result.getElement(0, 2), 0);
        assertEquals(8, result.getElement(0, 3), 0);
        assertEquals(10, result.getElement(1, 0), 0);
        assertEquals(12, result.getElement(1, 1), 0);
        assertEquals(14, result.getElement(1, 2), 0);
        assertEquals(16, result.getElement(1, 3), 0);
        assertEquals(18, result.getElement(2, 0), 0);
        assertEquals(20, result.getElement(2, 1), 0);
        assertEquals(22, result.getElement(2, 2), 0);
        assertEquals(24, result.getElement(2, 3), 0);
        assertEquals(26, result.getElement(3, 0), 0);
        assertEquals(28, result.getElement(3, 1), 0);
        assertEquals(30, result.getElement(3, 2), 0);
        assertEquals(32, result.getElement(3, 3), 0);
        assertEquals(34, result.getElement(4, 0), 0);
        assertEquals(36, result.getElement(4, 1), 0);
        assertEquals(38, result.getElement(4, 2), 0);
        assertEquals(40, result.getElement(4, 3), 0);
        assertEquals(42, result.getElement(5, 0), 0);
        assertEquals(44, result.getElement(5, 1), 0);
        assertEquals(46, result.getElement(5, 2), 0);
        assertEquals(48, result.getElement(5, 3), 0);
    }

    @Test
    public void testScale6x5(){
        Matrix result = firstMat6x5.getScaledMatrix(2);
        assertEquals(2, result.getElement(0, 0), 0);
        assertEquals(4, result.getElement(0, 1), 0);
        assertEquals(6, result.getElement(0, 2), 0);
        assertEquals(8, result.getElement(0, 3), 0);
        assertEquals(10, result.getElement(0, 4), 0);
        assertEquals(12, result.getElement(1, 0), 0);
        assertEquals(14, result.getElement(1, 1), 0);
        assertEquals(16, result.getElement(1, 2), 0);
        assertEquals(18, result.getElement(1, 3), 0);
        assertEquals(20, result.getElement(1, 4), 0);
        assertEquals(22, result.getElement(2, 0), 0);
        assertEquals(24, result.getElement(2, 1), 0);
        assertEquals(26, result.getElement(2, 2), 0);
        assertEquals(28, result.getElement(2, 3), 0);
        assertEquals(30, result.getElement(2, 4), 0);
        assertEquals(32, result.getElement(3, 0), 0);
        assertEquals(34, result.getElement(3, 1), 0);
        assertEquals(36, result.getElement(3, 2), 0);
        assertEquals(38, result.getElement(3, 3), 0);
        assertEquals(40, result.getElement(3, 4), 0);
        assertEquals(42, result.getElement(4, 0), 0);
        assertEquals(44, result.getElement(4, 1), 0);
        assertEquals(46, result.getElement(4, 2), 0);
        assertEquals(48, result.getElement(4, 3), 0);
        assertEquals(50, result.getElement(4, 4), 0);
        assertEquals(52, result.getElement(5, 0), 0);
        assertEquals(54, result.getElement(5, 1), 0);
        assertEquals(56, result.getElement(5, 2), 0);
        assertEquals(58, result.getElement(5, 3), 0);
        assertEquals(60, result.getElement(5, 4), 0);
    }

    @Test
    public void testScale6x6(){
        Matrix result = firstMat6x6.getScaledMatrix(2);
        assertEquals(2, result.getElement(0, 0), 0);
        assertEquals(4, result.getElement(0, 1), 0);
        assertEquals(6, result.getElement(0, 2), 0);
        assertEquals(8, result.getElement(0, 3), 0);
        assertEquals(10, result.getElement(0, 4), 0);
        assertEquals(12, result.getElement(0, 5), 0);
        assertEquals(14, result.getElement(1, 0), 0);
        assertEquals(16, result.getElement(1, 1), 0);
        assertEquals(18, result.getElement(1, 2), 0);
        assertEquals(20, result.getElement(1, 3), 0);
        assertEquals(22, result.getElement(1, 4), 0);
        assertEquals(24, result.getElement(1, 5), 0);
        assertEquals(26, result.getElement(2, 0), 0);
        assertEquals(28, result.getElement(2, 1), 0);
        assertEquals(30, result.getElement(2, 2), 0);
        assertEquals(32, result.getElement(2, 3), 0);
        assertEquals(34, result.getElement(2, 4), 0);
        assertEquals(36, result.getElement(2, 5), 0);
        assertEquals(38, result.getElement(3, 0), 0);
        assertEquals(40, result.getElement(3, 1), 0);
        assertEquals(42, result.getElement(3, 2), 0);
        assertEquals(44, result.getElement(3, 3), 0);
        assertEquals(46, result.getElement(3, 4), 0);
        assertEquals(48, result.getElement(3, 5), 0);
        assertEquals(50, result.getElement(4, 0), 0);
        assertEquals(52, result.getElement(4, 1), 0);
        assertEquals(54, result.getElement(4, 2), 0);
        assertEquals(56, result.getElement(4, 3), 0);
        assertEquals(58, result.getElement(4, 4), 0);
        assertEquals(60, result.getElement(4, 5), 0);
        assertEquals(62, result.getElement(5, 0), 0);
        assertEquals(64, result.getElement(5, 1), 0);
        assertEquals(66, result.getElement(5, 2), 0);
        assertEquals(68, result.getElement(5, 3), 0);
        assertEquals(70, result.getElement(5, 4), 0);
        assertEquals(72, result.getElement(5, 5), 0);
    }

}
