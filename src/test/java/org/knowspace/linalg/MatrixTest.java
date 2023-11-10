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
        Matrix result = firstMat2x2.plus(secondMat2x2);
        assertEquals(6, result.element(0, 0), 0);
        assertEquals(8, result.element(0, 1), 0);
        assertEquals(10, result.element(1, 0), 0);
        assertEquals(12, result.element(1, 1), 0);
    }

    @Test
    public void testAddition2x3() {
        Matrix result = firstMat2x3.plus(secondMat2x3);
        assertEquals(8, result.element(0, 0), 0);
        assertEquals(10, result.element(0, 1), 0);
        assertEquals(12, result.element(0, 2), 0);
        assertEquals(14, result.element(1, 0), 0);
        assertEquals(16, result.element(1, 1), 0);
        assertEquals(18, result.element(1, 2), 0);
    }

    @Test
    public void testAddition2x4() {
        Matrix result = firstMat2x4.plus(secondMat2x4);
        assertEquals(10, result.element(0, 0), 0);
        assertEquals(12, result.element(0, 1), 0);
        assertEquals(14, result.element(0, 2), 0);
        assertEquals(16, result.element(0, 3), 0);
        assertEquals(18, result.element(1, 0), 0);
        assertEquals(20, result.element(1, 1), 0);
        assertEquals(22, result.element(1, 2), 0);
        assertEquals(24, result.element(1, 3), 0);
    }

    @Test
    public void testAddition2x5() {
        Matrix result = firstMat2x5.plus(secondMat2x5);
        assertEquals(12, result.element(0, 0), 0);
        assertEquals(14, result.element(0, 1), 0);
        assertEquals(16, result.element(0, 2), 0);
        assertEquals(18, result.element(0, 3), 0);
        assertEquals(20, result.element(0, 4), 0);
        assertEquals(22, result.element(1, 0), 0);
        assertEquals(24, result.element(1, 1), 0);
        assertEquals(26, result.element(1, 2), 0);
        assertEquals(28, result.element(1, 3), 0);
        assertEquals(30, result.element(1, 4), 0);
    }

    @Test
    public void testAddition2x6() {
        Matrix result = firstMat2x6.plus(secondMat2x6);
        assertEquals(14, result.element(0, 0), 0);
        assertEquals(16, result.element(0, 1), 0);
        assertEquals(18, result.element(0, 2), 0);
        assertEquals(20, result.element(0, 3), 0);
        assertEquals(22, result.element(0, 4), 0);
        assertEquals(24, result.element(0, 5), 0);
        assertEquals(26, result.element(1, 0), 0);
        assertEquals(28, result.element(1, 1), 0);
        assertEquals(30, result.element(1, 2), 0);
        assertEquals(32, result.element(1, 3), 0);
        assertEquals(34, result.element(1, 4), 0);
        assertEquals(36, result.element(1, 5), 0);
    }

    @Test
    public void testAddition3x2() {
        Matrix result = firstMat3x2.plus(secondMat3x2);
        assertEquals(8, result.element(0, 0), 0);
        assertEquals(10, result.element(0, 1), 0);
        assertEquals(12, result.element(1, 0), 0);
        assertEquals(14, result.element(1, 1), 0);
        assertEquals(16, result.element(2, 0), 0);
        assertEquals(18, result.element(2, 1), 0);
    }

    @Test
    public void testAddition3x3() {
        Matrix result = firstMat3x3.plus(secondMat3x3);
        assertEquals(11, result.element(0, 0), 0);
        assertEquals(13, result.element(0, 1), 0);
        assertEquals(15, result.element(0, 2), 0);
        assertEquals(17, result.element(1, 0), 0);
        assertEquals(19, result.element(1, 1), 0);
        assertEquals(21, result.element(1, 2), 0);
        assertEquals(23, result.element(2, 0), 0);
        assertEquals(25, result.element(2, 1), 0);
        assertEquals(27, result.element(2, 2), 0);
    }

    @Test
    public void testAddition3x4() {
        Matrix result = firstMat3x4.plus(secondMat3x4);
        assertEquals(14, result.element(0, 0), 0);
        assertEquals(16, result.element(0, 1), 0);
        assertEquals(18, result.element(0, 2), 0);
        assertEquals(20, result.element(0, 3), 0);
        assertEquals(22, result.element(1, 0), 0);
        assertEquals(24, result.element(1, 1), 0);
        assertEquals(26, result.element(1, 2), 0);
        assertEquals(28, result.element(1, 3), 0);
        assertEquals(30, result.element(2, 0), 0);
        assertEquals(32, result.element(2, 1), 0);
        assertEquals(34, result.element(2, 2), 0);
        assertEquals(36, result.element(2, 3), 0);
    }

    @Test
    public void testAddition3x5() {
        Matrix result = firstMat3x5.plus(secondMat3x5);
        assertEquals(17, result.element(0, 0), 0);
        assertEquals(19, result.element(0, 1), 0);
        assertEquals(21, result.element(0, 2), 0);
        assertEquals(23, result.element(0, 3), 0);
        assertEquals(25, result.element(0, 4), 0);
        assertEquals(27, result.element(1, 0), 0);
        assertEquals(29, result.element(1, 1), 0);
        assertEquals(31, result.element(1, 2), 0);
        assertEquals(33, result.element(1, 3), 0);
        assertEquals(35, result.element(1, 4), 0);
        assertEquals(37, result.element(2, 0), 0);
        assertEquals(39, result.element(2, 1), 0);
        assertEquals(41, result.element(2, 2), 0);
        assertEquals(43, result.element(2, 3), 0);
        assertEquals(45, result.element(2, 4), 0);
    }

    @Test
    public void testAddition3x6() {
        Matrix result = firstMat3x6.plus(secondMat3x6);
        assertEquals(20, result.element(0, 0), 0);
        assertEquals(22, result.element(0, 1), 0);
        assertEquals(24, result.element(0, 2), 0);
        assertEquals(26, result.element(0, 3), 0);
        assertEquals(28, result.element(0, 4), 0);
        assertEquals(30, result.element(0, 5), 0);
        assertEquals(32, result.element(1, 0), 0);
        assertEquals(34, result.element(1, 1), 0);
        assertEquals(36, result.element(1, 2), 0);
        assertEquals(38, result.element(1, 3), 0);
        assertEquals(40, result.element(1, 4), 0);
        assertEquals(42, result.element(1, 5), 0);
        assertEquals(44, result.element(2, 0), 0);
        assertEquals(46, result.element(2, 1), 0);
        assertEquals(48, result.element(2, 2), 0);
        assertEquals(50, result.element(2, 3), 0);
        assertEquals(52, result.element(2, 4), 0);
        assertEquals(54, result.element(2, 5), 0);
    }

    @Test
    public void testAddition4x2() {
        Matrix result = firstMat4x2.plus(secondMat4x2);
        assertEquals(10, result.element(0, 0), 0);
        assertEquals(12, result.element(0, 1), 0);
        assertEquals(14, result.element(1, 0), 0);
        assertEquals(16, result.element(1, 1), 0);
        assertEquals(18, result.element(2, 0), 0);
        assertEquals(20, result.element(2, 1), 0);
        assertEquals(22, result.element(3, 0), 0);
        assertEquals(24, result.element(3, 1), 0);
    }

    @Test
    public void testAddition4x3() {
        Matrix result = firstMat4x3.plus(secondMat4x3);
        assertEquals(14, result.element(0, 0), 0);
        assertEquals(16, result.element(0, 1), 0);
        assertEquals(18, result.element(0, 2), 0);
        assertEquals(20, result.element(1, 0), 0);
        assertEquals(22, result.element(1, 1), 0);
        assertEquals(24, result.element(1, 2), 0);
        assertEquals(26, result.element(2, 0), 0);
        assertEquals(28, result.element(2, 1), 0);
        assertEquals(30, result.element(2, 2), 0);
        assertEquals(32, result.element(3, 0), 0);
        assertEquals(34, result.element(3, 1), 0);
        assertEquals(36, result.element(3, 2), 0);
    }

    @Test
    public void testAddition4x4() {
        Matrix result = firstMat4x4.plus(secondMat4x4);
        assertEquals(18, result.element(0, 0), 0);
        assertEquals(20, result.element(0, 1), 0);
        assertEquals(22, result.element(0, 2), 0);
        assertEquals(24, result.element(0, 3), 0);
        assertEquals(26, result.element(1, 0), 0);
        assertEquals(28, result.element(1, 1), 0);
        assertEquals(30, result.element(1, 2), 0);
        assertEquals(32, result.element(1, 3), 0);
        assertEquals(34, result.element(2, 0), 0);
        assertEquals(36, result.element(2, 1), 0);
        assertEquals(38, result.element(2, 2), 0);
        assertEquals(40, result.element(2, 3), 0);
        assertEquals(42, result.element(3, 0), 0);
        assertEquals(44, result.element(3, 1), 0);
        assertEquals(46, result.element(3, 2), 0);
        assertEquals(48, result.element(3, 3), 0);
    }

    @Test
    public void testAddition4x5() {
        Matrix result = firstMat4x5.plus(secondMat4x5);
        assertEquals(22, result.element(0, 0), 0);
        assertEquals(24, result.element(0, 1), 0);
        assertEquals(26, result.element(0, 2), 0);
        assertEquals(28, result.element(0, 3), 0);
        assertEquals(30, result.element(0, 4), 0);
        assertEquals(32, result.element(1, 0), 0);
        assertEquals(34, result.element(1, 1), 0);
        assertEquals(36, result.element(1, 2), 0);
        assertEquals(38, result.element(1, 3), 0);
        assertEquals(40, result.element(1, 4), 0);
        assertEquals(42, result.element(2, 0), 0);
        assertEquals(44, result.element(2, 1), 0);
        assertEquals(46, result.element(2, 2), 0);
        assertEquals(48, result.element(2, 3), 0);
        assertEquals(50, result.element(2, 4), 0);
        assertEquals(52, result.element(3, 0), 0);
        assertEquals(54, result.element(3, 1), 0);
        assertEquals(56, result.element(3, 2), 0);
        assertEquals(58, result.element(3, 3), 0);
        assertEquals(60, result.element(3, 4), 0);
    }

    @Test
    public void testAddition4x6() {
        Matrix result = firstMat4x6.plus(secondMat4x6);
        assertEquals(26, result.element(0, 0), 0);
        assertEquals(28, result.element(0, 1), 0);
        assertEquals(30, result.element(0, 2), 0);
        assertEquals(32, result.element(0, 3), 0);
        assertEquals(34, result.element(0, 4), 0);
        assertEquals(36, result.element(0, 5), 0);
        assertEquals(38, result.element(1, 0), 0);
        assertEquals(40, result.element(1, 1), 0);
        assertEquals(42, result.element(1, 2), 0);
        assertEquals(44, result.element(1, 3), 0);
        assertEquals(46, result.element(1, 4), 0);
        assertEquals(48, result.element(1, 5), 0);
        assertEquals(50, result.element(2, 0), 0);
        assertEquals(52, result.element(2, 1), 0);
        assertEquals(54, result.element(2, 2), 0);
        assertEquals(56, result.element(2, 3), 0);
        assertEquals(58, result.element(2, 4), 0);
        assertEquals(60, result.element(2, 5), 0);
        assertEquals(62, result.element(3, 0), 0);
        assertEquals(64, result.element(3, 1), 0);
        assertEquals(66, result.element(3, 2), 0);
        assertEquals(68, result.element(3, 3), 0);
        assertEquals(70, result.element(3, 4), 0);
        assertEquals(72, result.element(3, 5), 0);
    }

    @Test
    public void testAddition5x2() {
        Matrix result = firstMat5x2.plus(secondMat5x2);
        assertEquals(12, result.element(0, 0), 0);
        assertEquals(14, result.element(0, 1), 0);
        assertEquals(16, result.element(1, 0), 0);
        assertEquals(18, result.element(1, 1), 0);
        assertEquals(20, result.element(2, 0), 0);
        assertEquals(22, result.element(2, 1), 0);
        assertEquals(24, result.element(3, 0), 0);
        assertEquals(26, result.element(3, 1), 0);
        assertEquals(28, result.element(4, 0), 0);
        assertEquals(30, result.element(4, 1), 0);
    }

    @Test
    public void testAddition5x3() {
        Matrix result = firstMat5x3.plus(secondMat5x3);
        assertEquals(17, result.element(0, 0), 0);
        assertEquals(19, result.element(0, 1), 0);
        assertEquals(21, result.element(0, 2), 0);
        assertEquals(23, result.element(1, 0), 0);
        assertEquals(25, result.element(1, 1), 0);
        assertEquals(27, result.element(1, 2), 0);
        assertEquals(29, result.element(2, 0), 0);
        assertEquals(31, result.element(2, 1), 0);
        assertEquals(33, result.element(2, 2), 0);
        assertEquals(35, result.element(3, 0), 0);
        assertEquals(37, result.element(3, 1), 0);
        assertEquals(39, result.element(3, 2), 0);
        assertEquals(41, result.element(4, 0), 0);
        assertEquals(43, result.element(4, 1), 0);
        assertEquals(45, result.element(4, 2), 0);
    }

    @Test
    public void testAddition5x4() {
        Matrix result = firstMat5x4.plus(secondMat5x4);
        assertEquals(22, result.element(0, 0), 0);
        assertEquals(24, result.element(0, 1), 0);
        assertEquals(26, result.element(0, 2), 0);
        assertEquals(28, result.element(0, 3), 0);
        assertEquals(30, result.element(1, 0), 0);
        assertEquals(32, result.element(1, 1), 0);
        assertEquals(34, result.element(1, 2), 0);
        assertEquals(36, result.element(1, 3), 0);
        assertEquals(38, result.element(2, 0), 0);
        assertEquals(40, result.element(2, 1), 0);
        assertEquals(42, result.element(2, 2), 0);
        assertEquals(44, result.element(2, 3), 0);
        assertEquals(46, result.element(3, 0), 0);
        assertEquals(48, result.element(3, 1), 0);
        assertEquals(50, result.element(3, 2), 0);
        assertEquals(52, result.element(3, 3), 0);
        assertEquals(54, result.element(4, 0), 0);
        assertEquals(56, result.element(4, 1), 0);
        assertEquals(58, result.element(4, 2), 0);
        assertEquals(60, result.element(4, 3), 0);
    }

    @Test
    public void testAddition5x5() {
        Matrix result = firstMat5x5.plus(secondMat5x5);
        assertEquals(27, result.element(0, 0), 0);
        assertEquals(29, result.element(0, 1), 0);
        assertEquals(31, result.element(0, 2), 0);
        assertEquals(33, result.element(0, 3), 0);
        assertEquals(35, result.element(0, 4), 0);
        assertEquals(37, result.element(1, 0), 0);
        assertEquals(39, result.element(1, 1), 0);
        assertEquals(41, result.element(1, 2), 0);
        assertEquals(43, result.element(1, 3), 0);
        assertEquals(45, result.element(1, 4), 0);
        assertEquals(47, result.element(2, 0), 0);
        assertEquals(49, result.element(2, 1), 0);
        assertEquals(51, result.element(2, 2), 0);
        assertEquals(53, result.element(2, 3), 0);
        assertEquals(55, result.element(2, 4), 0);
        assertEquals(57, result.element(3, 0), 0);
        assertEquals(59, result.element(3, 1), 0);
        assertEquals(61, result.element(3, 2), 0);
        assertEquals(63, result.element(3, 3), 0);
        assertEquals(65, result.element(3, 4), 0);
        assertEquals(67, result.element(4, 0), 0);
        assertEquals(69, result.element(4, 1), 0);
        assertEquals(71, result.element(4, 2), 0);
        assertEquals(73, result.element(4, 3), 0);
        assertEquals(75, result.element(4, 4), 0);
    }

    @Test
    public void testAddition5x6() {
        Matrix result = firstMat5x6.plus(secondMat5x6);
        assertEquals(32, result.element(0, 0), 0);
        assertEquals(34, result.element(0, 1), 0);
        assertEquals(36, result.element(0, 2), 0);
        assertEquals(38, result.element(0, 3), 0);
        assertEquals(40, result.element(0, 4), 0);
        assertEquals(42, result.element(0, 5), 0);
        assertEquals(44, result.element(1, 0), 0);
        assertEquals(46, result.element(1, 1), 0);
        assertEquals(48, result.element(1, 2), 0);
        assertEquals(50, result.element(1, 3), 0);
        assertEquals(52, result.element(1, 4), 0);
        assertEquals(54, result.element(1, 5), 0);
        assertEquals(56, result.element(2, 0), 0);
        assertEquals(58, result.element(2, 1), 0);
        assertEquals(60, result.element(2, 2), 0);
        assertEquals(62, result.element(2, 3), 0);
        assertEquals(64, result.element(2, 4), 0);
        assertEquals(66, result.element(2, 5), 0);
        assertEquals(68, result.element(3, 0), 0);
        assertEquals(70, result.element(3, 1), 0);
        assertEquals(72, result.element(3, 2), 0);
        assertEquals(74, result.element(3, 3), 0);
        assertEquals(76, result.element(3, 4), 0);
        assertEquals(78, result.element(3, 5), 0);
        assertEquals(80, result.element(4, 0), 0);
        assertEquals(82, result.element(4, 1), 0);
        assertEquals(84, result.element(4, 2), 0);
        assertEquals(86, result.element(4, 3), 0);
        assertEquals(88, result.element(4, 4), 0);
        assertEquals(90, result.element(4, 5), 0);
    }

    @Test
    public void testAddition6x2() {
        Matrix result = firstMat6x2.plus(secondMat6x2);
        assertEquals(14, result.element(0, 0), 0);
        assertEquals(16, result.element(0, 1), 0);
        assertEquals(18, result.element(1, 0), 0);
        assertEquals(20, result.element(1, 1), 0);
        assertEquals(22, result.element(2, 0), 0);
        assertEquals(24, result.element(2, 1), 0);
        assertEquals(26, result.element(3, 0), 0);
        assertEquals(28, result.element(3, 1), 0);
        assertEquals(30, result.element(4, 0), 0);
        assertEquals(32, result.element(4, 1), 0);
        assertEquals(34, result.element(5, 0), 0);
        assertEquals(36, result.element(5, 1), 0);
    }

    @Test
    public void testAddition6x3() {
        Matrix result = firstMat6x3.plus(secondMat6x3);
        assertEquals(20, result.element(0, 0), 0);
        assertEquals(22, result.element(0, 1), 0);
        assertEquals(24, result.element(0, 2), 0);
        assertEquals(26, result.element(1, 0), 0);
        assertEquals(28, result.element(1, 1), 0);
        assertEquals(30, result.element(1, 2), 0);
        assertEquals(32, result.element(2, 0), 0);
        assertEquals(34, result.element(2, 1), 0);
        assertEquals(36, result.element(2, 2), 0);
        assertEquals(38, result.element(3, 0), 0);
        assertEquals(40, result.element(3, 1), 0);
        assertEquals(42, result.element(3, 2), 0);
        assertEquals(44, result.element(4, 0), 0);
        assertEquals(46, result.element(4, 1), 0);
        assertEquals(48, result.element(4, 2), 0);
        assertEquals(50, result.element(5, 0), 0);
        assertEquals(52, result.element(5, 1), 0);
        assertEquals(54, result.element(5, 2), 0);
    }

    @Test
    public void testAddition6x4() {
        Matrix result = firstMat6x4.plus(secondMat6x4);
        assertEquals(26, result.element(0, 0), 0);
        assertEquals(28, result.element(0, 1), 0);
        assertEquals(30, result.element(0, 2), 0);
        assertEquals(32, result.element(0, 3), 0);
        assertEquals(34, result.element(1, 0), 0);
        assertEquals(36, result.element(1, 1), 0);
        assertEquals(38, result.element(1, 2), 0);
        assertEquals(40, result.element(1, 3), 0);
        assertEquals(42, result.element(2, 0), 0);
        assertEquals(44, result.element(2, 1), 0);
        assertEquals(46, result.element(2, 2), 0);
        assertEquals(48, result.element(2, 3), 0);
        assertEquals(50, result.element(3, 0), 0);
        assertEquals(52, result.element(3, 1), 0);
        assertEquals(54, result.element(3, 2), 0);
        assertEquals(56, result.element(3, 3), 0);
        assertEquals(58, result.element(4, 0), 0);
        assertEquals(60, result.element(4, 1), 0);
        assertEquals(62, result.element(4, 2), 0);
        assertEquals(64, result.element(4, 3), 0);
        assertEquals(66, result.element(5, 0), 0);
        assertEquals(68, result.element(5, 1), 0);
        assertEquals(70, result.element(5, 2), 0);
        assertEquals(72, result.element(5, 3), 0);
    }

    @Test
    public void testAddition6x5() {
        Matrix result = firstMat6x5.plus(secondMat6x5);
        assertEquals(32, result.element(0, 0), 0);
        assertEquals(34, result.element(0, 1), 0);
        assertEquals(36, result.element(0, 2), 0);
        assertEquals(38, result.element(0, 3), 0);
        assertEquals(40, result.element(0, 4), 0);
        assertEquals(42, result.element(1, 0), 0);
        assertEquals(44, result.element(1, 1), 0);
        assertEquals(46, result.element(1, 2), 0);
        assertEquals(48, result.element(1, 3), 0);
        assertEquals(50, result.element(1, 4), 0);
        assertEquals(52, result.element(2, 0), 0);
        assertEquals(54, result.element(2, 1), 0);
        assertEquals(56, result.element(2, 2), 0);
        assertEquals(58, result.element(2, 3), 0);
        assertEquals(60, result.element(2, 4), 0);
        assertEquals(62, result.element(3, 0), 0);
        assertEquals(64, result.element(3, 1), 0);
        assertEquals(66, result.element(3, 2), 0);
        assertEquals(68, result.element(3, 3), 0);
        assertEquals(70, result.element(3, 4), 0);
        assertEquals(72, result.element(4, 0), 0);
        assertEquals(74, result.element(4, 1), 0);
        assertEquals(76, result.element(4, 2), 0);
        assertEquals(78, result.element(4, 3), 0);
        assertEquals(80, result.element(4, 4), 0);
        assertEquals(82, result.element(5, 0), 0);
        assertEquals(84, result.element(5, 1), 0);
        assertEquals(86, result.element(5, 2), 0);
        assertEquals(88, result.element(5, 3), 0);
        assertEquals(90, result.element(5, 4), 0);
    }

    @Test
    public void testAddition6x6() {
        Matrix result = firstMat6x6.plus(secondMat6x6);
        assertEquals(38, result.element(0, 0), 0);
        assertEquals(40, result.element(0, 1), 0);
        assertEquals(42, result.element(0, 2), 0);
        assertEquals(44, result.element(0, 3), 0);
        assertEquals(46, result.element(0, 4), 0);
        assertEquals(48, result.element(0, 5), 0);
        assertEquals(50, result.element(1, 0), 0);
        assertEquals(52, result.element(1, 1), 0);
        assertEquals(54, result.element(1, 2), 0);
        assertEquals(56, result.element(1, 3), 0);
        assertEquals(58, result.element(1, 4), 0);
        assertEquals(60, result.element(1, 5), 0);
        assertEquals(62, result.element(2, 0), 0);
        assertEquals(64, result.element(2, 1), 0);
        assertEquals(66, result.element(2, 2), 0);
        assertEquals(68, result.element(2, 3), 0);
        assertEquals(70, result.element(2, 4), 0);
        assertEquals(72, result.element(2, 5), 0);
        assertEquals(74, result.element(3, 0), 0);
        assertEquals(76, result.element(3, 1), 0);
        assertEquals(78, result.element(3, 2), 0);
        assertEquals(80, result.element(3, 3), 0);
        assertEquals(82, result.element(3, 4), 0);
        assertEquals(84, result.element(3, 5), 0);
        assertEquals(86, result.element(4, 0), 0);
        assertEquals(88, result.element(4, 1), 0);
        assertEquals(90, result.element(4, 2), 0);
        assertEquals(92, result.element(4, 3), 0);
        assertEquals(94, result.element(4, 4), 0);
        assertEquals(96, result.element(4, 5), 0);
        assertEquals(98, result.element(5, 0), 0);
        assertEquals(100, result.element(5, 1), 0);
        assertEquals(102, result.element(5, 2), 0);
        assertEquals(104, result.element(5, 3), 0);
        assertEquals(106, result.element(5, 4), 0);
        assertEquals(108, result.element(5, 5), 0);
    }

    @Test
    public void testVectorProduct2x2() {
        Vector result = firstMat2x2.multiply(firstVec2D);
        assertEquals(5, result.element(0), 0);
        assertEquals(11, result.element(1), 0);
    }

    @Test
    public void testVectorProduct2x3() {
        Vector result = firstMat2x3.multiply(firstVec3D);
        assertEquals(14, result.element(0), 0);
        assertEquals(32, result.element(1), 0);
    }

    @Test
    public void testVectorProduct2x4() {
        Vector result = firstMat2x4.multiply(firstVec4D);
        assertEquals(30, result.element(0), 0);
        assertEquals(70, result.element(1), 0);
    }

    @Test
    public void testVectorProduct2x5() {
        Vector result = firstMat2x5.multiply(firstVec5D);
        assertEquals(55, result.element(0), 0);
        assertEquals(130, result.element(1), 0);
    }

    @Test
    public void testVectorProduct2x6() {
        Vector result = firstMat2x6.multiply(firstVec6D);
        assertEquals(91, result.element(0), 0);
        assertEquals(217, result.element(1), 0);
    }

    @Test
    public void testVectorProduct3x2() {
        Vector result = firstMat3x2.multiply(firstVec2D);
        assertEquals(5, result.element(0), 0);
        assertEquals(11, result.element(1), 0);
        assertEquals(17, result.element(2), 0);
    }

    @Test
    public void testVectorProduct3x3() {
        Vector result = firstMat3x3.multiply(firstVec3D);
        assertEquals(14, result.element(0), 0);
        assertEquals(32, result.element(1), 0);
        assertEquals(50, result.element(2), 0);
    }

    @Test
    public void testVectorProduct3x4() {
        Vector result = firstMat3x4.multiply(firstVec4D);
        assertEquals(30, result.element(0), 0);
        assertEquals(70, result.element(1), 0);
        assertEquals(110, result.element(2), 0);
    }

    @Test
    public void testVectorProduct3x5() {
        Vector result = firstMat3x5.multiply(firstVec5D);
        assertEquals(55, result.element(0), 0);
        assertEquals(130, result.element(1), 0);
        assertEquals(205, result.element(2), 0);
    }

    @Test
    public void testVectorProduct3x6() {
        Vector result = firstMat3x6.multiply(firstVec6D);
        assertEquals(91, result.element(0), 0);
        assertEquals(217, result.element(1), 0);
        assertEquals(343, result.element(2), 0);
    }

    @Test
    public void testVectorProduct4x2() {
        Vector result = firstMat4x2.multiply(firstVec2D);
        assertEquals(5, result.element(0), 0);
        assertEquals(11, result.element(1), 0);
        assertEquals(17, result.element(2), 0);
        assertEquals(23, result.element(3), 0);
    }

    @Test
    public void testVectorProduct4x3() {
        Vector result = firstMat4x3.multiply(firstVec3D);
        assertEquals(14, result.element(0), 0);
        assertEquals(32, result.element(1), 0);
        assertEquals(50, result.element(2), 0);
        assertEquals(68, result.element(3), 0);
    }

    @Test
    public void testVectorProduct4x4() {
        Vector result = firstMat4x4.multiply(firstVec4D);
        assertEquals(30, result.element(0), 0);
        assertEquals(70, result.element(1), 0);
        assertEquals(110, result.element(2), 0);
        assertEquals(150, result.element(3), 0);
    }

    @Test
    public void testVectorProduct4x5() {
        Vector result = firstMat4x5.multiply(firstVec5D);
        assertEquals(55, result.element(0), 0);
        assertEquals(130, result.element(1), 0);
        assertEquals(205, result.element(2), 0);
        assertEquals(280, result.element(3), 0);
    }

    @Test
    public void testVectorProduct4x6() {
        Vector result = firstMat4x6.multiply(firstVec6D);
        assertEquals(91, result.element(0), 0);
        assertEquals(217, result.element(1), 0);
        assertEquals(343, result.element(2), 0);
        assertEquals(469, result.element(3), 0);
    }

    @Test
    public void testVectorProduct5x2() {
        Vector result = firstMat5x2.multiply(firstVec2D);
        assertEquals(5, result.element(0), 0);
        assertEquals(11, result.element(1), 0);
        assertEquals(17, result.element(2), 0);
        assertEquals(23, result.element(3), 0);
        assertEquals(29, result.element(4), 0);
    }

    @Test
    public void testVectorProduct5x3() {
        Vector result = firstMat5x3.multiply(firstVec3D);
        assertEquals(14, result.element(0), 0);
        assertEquals(32, result.element(1), 0);
        assertEquals(50, result.element(2), 0);
        assertEquals(68, result.element(3), 0);
        assertEquals(86, result.element(4), 0);
    }

    @Test
    public void testVectorProduct5x4() {
        Vector result = firstMat5x4.multiply(firstVec4D);
        assertEquals(30, result.element(0), 0);
        assertEquals(70, result.element(1), 0);
        assertEquals(110, result.element(2), 0);
        assertEquals(150, result.element(3), 0);
        assertEquals(190, result.element(4), 0);
    }

    @Test
    public void testVectorProduct5x5() {
        Vector result = firstMat5x5.multiply(firstVec5D);
        assertEquals(55, result.element(0), 0);
        assertEquals(130, result.element(1), 0);
        assertEquals(205, result.element(2), 0);
        assertEquals(280, result.element(3), 0);
        assertEquals(355, result.element(4), 0);
    }

    @Test
    public void testVectorProduct5x6() {
        Vector result = firstMat5x6.multiply(firstVec6D);
        assertEquals(91, result.element(0), 0);
        assertEquals(217, result.element(1), 0);
        assertEquals(343, result.element(2), 0);
        assertEquals(469, result.element(3), 0);
        assertEquals(595, result.element(4), 0);
    }

    @Test
    public void testVectorProduct6x2() {
        Vector result = firstMat6x2.multiply(firstVec2D);
        assertEquals(5, result.element(0), 0);
        assertEquals(11, result.element(1), 0);
        assertEquals(17, result.element(2), 0);
        assertEquals(23, result.element(3), 0);
        assertEquals(29, result.element(4), 0);
        assertEquals(35, result.element(5), 0);
    }

    @Test
    public void testVectorProduct6x3() {
        Vector result = firstMat6x3.multiply(firstVec3D);
        assertEquals(14, result.element(0), 0);
        assertEquals(32, result.element(1), 0);
        assertEquals(50, result.element(2), 0);
        assertEquals(68, result.element(3), 0);
        assertEquals(86, result.element(4), 0);
        assertEquals(104, result.element(5), 0);
    }

    @Test
    public void testVectorProduct6x4() {
        Vector result = firstMat6x4.multiply(firstVec4D);
        assertEquals(30, result.element(0), 0);
        assertEquals(70, result.element(1), 0);
        assertEquals(110, result.element(2), 0);
        assertEquals(150, result.element(3), 0);
        assertEquals(190, result.element(4), 0);
        assertEquals(230, result.element(5), 0);
    }

    @Test
    public void testVectorProduct6x5() {
        Vector result = firstMat6x5.multiply(firstVec5D);
        assertEquals(55, result.element(0), 0);
        assertEquals(130, result.element(1), 0);
        assertEquals(205, result.element(2), 0);
        assertEquals(280, result.element(3), 0);
        assertEquals(355, result.element(4), 0);
        assertEquals(430, result.element(5), 0);
    }

    @Test
    public void testVectorProduct6x6() {
        Vector result = firstMat6x6.multiply(firstVec6D);
        assertEquals(91, result.element(0), 0);
        assertEquals(217, result.element(1), 0);
        assertEquals(343, result.element(2), 0);
        assertEquals(469, result.element(3), 0);
        assertEquals(595, result.element(4), 0);
        assertEquals(721, result.element(5), 0);
    }
    
    @Test
    public void testTranspose2x2(){
        Matrix result = firstMat2x2.transpose();
        assertEquals(1, result.element(0, 0), 0);
        assertEquals(3, result.element(0, 1), 0);
        assertEquals(2, result.element(1, 0), 0);
        assertEquals(4, result.element(1, 1), 0);
    }

    @Test
    public void testTranspose2x3(){
        Matrix result = firstMat2x3.transpose();
        assertEquals(1, result.element(0, 0), 0);
        assertEquals(4, result.element(0, 1), 0);
        assertEquals(2, result.element(1, 0), 0);
        assertEquals(5, result.element(1, 1), 0);
        assertEquals(3, result.element(2, 0), 0);
        assertEquals(6, result.element(2, 1), 0);
    }

    @Test
    public void testTranspose2x4(){
        Matrix result = firstMat2x4.transpose();
        assertEquals(1, result.element(0, 0), 0);
        assertEquals(5, result.element(0, 1), 0);
        assertEquals(2, result.element(1, 0), 0);
        assertEquals(6, result.element(1, 1), 0);
        assertEquals(3, result.element(2, 0), 0);
        assertEquals(7, result.element(2, 1), 0);
        assertEquals(4, result.element(3, 0), 0);
        assertEquals(8, result.element(3, 1), 0);
    }

    @Test
    public void testTranspose2x5(){
        Matrix result = firstMat2x5.transpose();
        assertEquals(1, result.element(0, 0), 0);
        assertEquals(6, result.element(0, 1), 0);
        assertEquals(2, result.element(1, 0), 0);
        assertEquals(7, result.element(1, 1), 0);
        assertEquals(3, result.element(2, 0), 0);
        assertEquals(8, result.element(2, 1), 0);
        assertEquals(4, result.element(3, 0), 0);
        assertEquals(9, result.element(3, 1), 0);
        assertEquals(5, result.element(4, 0), 0);
        assertEquals(10, result.element(4, 1), 0);
    }

    @Test
    public void testTranspose2x6(){
        Matrix result = firstMat2x6.transpose();
        assertEquals(1, result.element(0, 0), 0);
        assertEquals(7, result.element(0, 1), 0);
        assertEquals(2, result.element(1, 0), 0);
        assertEquals(8, result.element(1, 1), 0);
        assertEquals(3, result.element(2, 0), 0);
        assertEquals(9, result.element(2, 1), 0);
        assertEquals(4, result.element(3, 0), 0);
        assertEquals(10, result.element(3, 1), 0);
        assertEquals(5, result.element(4, 0), 0);
        assertEquals(11, result.element(4, 1), 0);
        assertEquals(6, result.element(5, 0), 0);
        assertEquals(12, result.element(5, 1), 0);
    }

    @Test
    public void testTranspose3x2(){
        Matrix result = firstMat3x2.transpose();
        assertEquals(1, result.element(0, 0), 0);
        assertEquals(3, result.element(0, 1), 0);
        assertEquals(5, result.element(0, 2), 0);
        assertEquals(2, result.element(1, 0), 0);
        assertEquals(4, result.element(1, 1), 0);
        assertEquals(6, result.element(1, 2), 0);
    }

    @Test
    public void testTranspose3x3(){
        Matrix result = firstMat3x3.transpose();
        assertEquals(1, result.element(0, 0), 0);
        assertEquals(4, result.element(0, 1), 0);
        assertEquals(7, result.element(0, 2), 0);
        assertEquals(2, result.element(1, 0), 0);
        assertEquals(5, result.element(1, 1), 0);
        assertEquals(8, result.element(1, 2), 0);
        assertEquals(3, result.element(2, 0), 0);
        assertEquals(6, result.element(2, 1), 0);
        assertEquals(9, result.element(2, 2), 0);
    }

    @Test
    public void testTranspose3x4(){
        Matrix result = firstMat3x4.transpose();
        assertEquals(1, result.element(0, 0), 0);
        assertEquals(5, result.element(0, 1), 0);
        assertEquals(9, result.element(0, 2), 0);
        assertEquals(2, result.element(1, 0), 0);
        assertEquals(6, result.element(1, 1), 0);
        assertEquals(10, result.element(1, 2), 0);
        assertEquals(3, result.element(2, 0), 0);
        assertEquals(7, result.element(2, 1), 0);
        assertEquals(11, result.element(2, 2), 0);
        assertEquals(4, result.element(3, 0), 0);
        assertEquals(8, result.element(3, 1), 0);
        assertEquals(12, result.element(3, 2), 0);
    }

    @Test
    public void testTranspose3x5(){
        Matrix result = firstMat3x5.transpose();
        assertEquals(1, result.element(0, 0), 0);
        assertEquals(6, result.element(0, 1), 0);
        assertEquals(11, result.element(0, 2), 0);
        assertEquals(2, result.element(1, 0), 0);
        assertEquals(7, result.element(1, 1), 0);
        assertEquals(12, result.element(1, 2), 0);
        assertEquals(3, result.element(2, 0), 0);
        assertEquals(8, result.element(2, 1), 0);
        assertEquals(13, result.element(2, 2), 0);
        assertEquals(4, result.element(3, 0), 0);
        assertEquals(9, result.element(3, 1), 0);
        assertEquals(14, result.element(3, 2), 0);
        assertEquals(5, result.element(4, 0), 0);
        assertEquals(10, result.element(4, 1), 0);
        assertEquals(15, result.element(4, 2), 0);
    }

    @Test
    public void testTranspose3x6(){
        Matrix result = firstMat3x6.transpose();
        assertEquals(1, result.element(0, 0), 0);
        assertEquals(7, result.element(0, 1), 0);
        assertEquals(13, result.element(0, 2), 0);
        assertEquals(2, result.element(1, 0), 0);
        assertEquals(8, result.element(1, 1), 0);
        assertEquals(14, result.element(1, 2), 0);
        assertEquals(3, result.element(2, 0), 0);
        assertEquals(9, result.element(2, 1), 0);
        assertEquals(15, result.element(2, 2), 0);
        assertEquals(4, result.element(3, 0), 0);
        assertEquals(10, result.element(3, 1), 0);
        assertEquals(16, result.element(3, 2), 0);
        assertEquals(5, result.element(4, 0), 0);
        assertEquals(11, result.element(4, 1), 0);
        assertEquals(17, result.element(4, 2), 0);
        assertEquals(6, result.element(5, 0), 0);
        assertEquals(12, result.element(5, 1), 0);
        assertEquals(18, result.element(5, 2), 0);
    }

    @Test
    public void testTranspose4x2(){
        Matrix result = firstMat4x2.transpose();
        assertEquals(1, result.element(0, 0), 0);
        assertEquals(3, result.element(0, 1), 0);
        assertEquals(5, result.element(0, 2), 0);
        assertEquals(7, result.element(0, 3), 0);
        assertEquals(2, result.element(1, 0), 0);
        assertEquals(4, result.element(1, 1), 0);
        assertEquals(6, result.element(1, 2), 0);
        assertEquals(8, result.element(1, 3), 0);
    }

    @Test
    public void testTranspose4x3(){
        Matrix result = firstMat4x3.transpose();
        assertEquals(1, result.element(0, 0), 0);
        assertEquals(4, result.element(0, 1), 0);
        assertEquals(7, result.element(0, 2), 0);
        assertEquals(10, result.element(0, 3), 0);
        assertEquals(2, result.element(1, 0), 0);
        assertEquals(5, result.element(1, 1), 0);
        assertEquals(8, result.element(1, 2), 0);
        assertEquals(11, result.element(1, 3), 0);
        assertEquals(3, result.element(2, 0), 0);
        assertEquals(6, result.element(2, 1), 0);
        assertEquals(9, result.element(2, 2), 0);
        assertEquals(12, result.element(2, 3), 0);
    }

    @Test
    public void testTranspose4x4(){
        Matrix result = firstMat4x4.transpose();
        assertEquals(1, result.element(0, 0), 0);
        assertEquals(5, result.element(0, 1), 0);
        assertEquals(9, result.element(0, 2), 0);
        assertEquals(13, result.element(0, 3), 0);
        assertEquals(2, result.element(1, 0), 0);
        assertEquals(6, result.element(1, 1), 0);
        assertEquals(10, result.element(1, 2), 0);
        assertEquals(14, result.element(1, 3), 0);
        assertEquals(3, result.element(2, 0), 0);
        assertEquals(7, result.element(2, 1), 0);
        assertEquals(11, result.element(2, 2), 0);
        assertEquals(15, result.element(2, 3), 0);
        assertEquals(4, result.element(3, 0), 0);
        assertEquals(8, result.element(3, 1), 0);
        assertEquals(12, result.element(3, 2), 0);
        assertEquals(16, result.element(3, 3), 0);
    }

    @Test
    public void testTranspose4x5(){
        Matrix result = firstMat4x5.transpose();
        assertEquals(1, result.element(0, 0), 0);
        assertEquals(6, result.element(0, 1), 0);
        assertEquals(11, result.element(0, 2), 0);
        assertEquals(16, result.element(0, 3), 0);
        assertEquals(2, result.element(1, 0), 0);
        assertEquals(7, result.element(1, 1), 0);
        assertEquals(12, result.element(1, 2), 0);
        assertEquals(17, result.element(1, 3), 0);
        assertEquals(3, result.element(2, 0), 0);
        assertEquals(8, result.element(2, 1), 0);
        assertEquals(13, result.element(2, 2), 0);
        assertEquals(18, result.element(2, 3), 0);
        assertEquals(4, result.element(3, 0), 0);
        assertEquals(9, result.element(3, 1), 0);
        assertEquals(14, result.element(3, 2), 0);
        assertEquals(19, result.element(3, 3), 0);
        assertEquals(5, result.element(4, 0), 0);
        assertEquals(10, result.element(4, 1), 0);
        assertEquals(15, result.element(4, 2), 0);
        assertEquals(20, result.element(4, 3), 0);
    }

    @Test
    public void testTranspose4x6(){
        Matrix result = firstMat4x6.transpose();
        assertEquals(1, result.element(0, 0), 0);
        assertEquals(7, result.element(0, 1), 0);
        assertEquals(13, result.element(0, 2), 0);
        assertEquals(19, result.element(0, 3), 0);
        assertEquals(2, result.element(1, 0), 0);
        assertEquals(8, result.element(1, 1), 0);
        assertEquals(14, result.element(1, 2), 0);
        assertEquals(20, result.element(1, 3), 0);
        assertEquals(3, result.element(2, 0), 0);
        assertEquals(9, result.element(2, 1), 0);
        assertEquals(15, result.element(2, 2), 0);
        assertEquals(21, result.element(2, 3), 0);
        assertEquals(4, result.element(3, 0), 0);
        assertEquals(10, result.element(3, 1), 0);
        assertEquals(16, result.element(3, 2), 0);
        assertEquals(22, result.element(3, 3), 0);
        assertEquals(5, result.element(4, 0), 0);
        assertEquals(11, result.element(4, 1), 0);
        assertEquals(17, result.element(4, 2), 0);
        assertEquals(23, result.element(4, 3), 0);
        assertEquals(6, result.element(5, 0), 0);
        assertEquals(12, result.element(5, 1), 0);
        assertEquals(18, result.element(5, 2), 0);
        assertEquals(24, result.element(5, 3), 0);
    }

    @Test
    public void testTranspose5x2(){
        Matrix result = firstMat5x2.transpose();
        assertEquals(1, result.element(0, 0), 0);
        assertEquals(3, result.element(0, 1), 0);
        assertEquals(5, result.element(0, 2), 0);
        assertEquals(7, result.element(0, 3), 0);
        assertEquals(9, result.element(0, 4), 0);
        assertEquals(2, result.element(1, 0), 0);
        assertEquals(4, result.element(1, 1), 0);
        assertEquals(6, result.element(1, 2), 0);
        assertEquals(8, result.element(1, 3), 0);
        assertEquals(10, result.element(1, 4), 0);
    }

    @Test
    public void testTranspose5x3(){
        Matrix result = firstMat5x3.transpose();
        assertEquals(1, result.element(0, 0), 0);
        assertEquals(4, result.element(0, 1), 0);
        assertEquals(7, result.element(0, 2), 0);
        assertEquals(10, result.element(0, 3), 0);
        assertEquals(13, result.element(0, 4), 0);
        assertEquals(2, result.element(1, 0), 0);
        assertEquals(5, result.element(1, 1), 0);
        assertEquals(8, result.element(1, 2), 0);
        assertEquals(11, result.element(1, 3), 0);
        assertEquals(14, result.element(1, 4), 0);
        assertEquals(3, result.element(2, 0), 0);
        assertEquals(6, result.element(2, 1), 0);
        assertEquals(9, result.element(2, 2), 0);
        assertEquals(12, result.element(2, 3), 0);
        assertEquals(15, result.element(2, 4), 0);
    }

    @Test
    public void testTranspose5x4(){
        Matrix result = firstMat5x4.transpose();
        assertEquals(1, result.element(0, 0), 0);
        assertEquals(5, result.element(0, 1), 0);
        assertEquals(9, result.element(0, 2), 0);
        assertEquals(13, result.element(0, 3), 0);
        assertEquals(17, result.element(0, 4), 0);
        assertEquals(2, result.element(1, 0), 0);
        assertEquals(6, result.element(1, 1), 0);
        assertEquals(10, result.element(1, 2), 0);
        assertEquals(14, result.element(1, 3), 0);
        assertEquals(18, result.element(1, 4), 0);
        assertEquals(3, result.element(2, 0), 0);
        assertEquals(7, result.element(2, 1), 0);
        assertEquals(11, result.element(2, 2), 0);
        assertEquals(15, result.element(2, 3), 0);
        assertEquals(19, result.element(2, 4), 0);
        assertEquals(4, result.element(3, 0), 0);
        assertEquals(8, result.element(3, 1), 0);
        assertEquals(12, result.element(3, 2), 0);
        assertEquals(16, result.element(3, 3), 0);
        assertEquals(20, result.element(3, 4), 0);
    }

    @Test
    public void testTranspose5x5(){
        Matrix result = firstMat5x5.transpose();
        assertEquals(1, result.element(0, 0), 0);
        assertEquals(6, result.element(0, 1), 0);
        assertEquals(11, result.element(0, 2), 0);
        assertEquals(16, result.element(0, 3), 0);
        assertEquals(21, result.element(0, 4), 0);
        assertEquals(2, result.element(1, 0), 0);
        assertEquals(7, result.element(1, 1), 0);
        assertEquals(12, result.element(1, 2), 0);
        assertEquals(17, result.element(1, 3), 0);
        assertEquals(22, result.element(1, 4), 0);
        assertEquals(3, result.element(2, 0), 0);
        assertEquals(8, result.element(2, 1), 0);
        assertEquals(13, result.element(2, 2), 0);
        assertEquals(18, result.element(2, 3), 0);
        assertEquals(23, result.element(2, 4), 0);
        assertEquals(4, result.element(3, 0), 0);
        assertEquals(9, result.element(3, 1), 0);
        assertEquals(14, result.element(3, 2), 0);
        assertEquals(19, result.element(3, 3), 0);
        assertEquals(24, result.element(3, 4), 0);
        assertEquals(5, result.element(4, 0), 0);
        assertEquals(10, result.element(4, 1), 0);
        assertEquals(15, result.element(4, 2), 0);
        assertEquals(20, result.element(4, 3), 0);
        assertEquals(25, result.element(4, 4), 0);
    }

    @Test
    public void testTranspose5x6(){
        Matrix result = firstMat5x6.transpose();
        assertEquals(1, result.element(0, 0), 0);
        assertEquals(7, result.element(0, 1), 0);
        assertEquals(13, result.element(0, 2), 0);
        assertEquals(19, result.element(0, 3), 0);
        assertEquals(25, result.element(0, 4), 0);
        assertEquals(2, result.element(1, 0), 0);
        assertEquals(8, result.element(1, 1), 0);
        assertEquals(14, result.element(1, 2), 0);
        assertEquals(20, result.element(1, 3), 0);
        assertEquals(26, result.element(1, 4), 0);
        assertEquals(3, result.element(2, 0), 0);
        assertEquals(9, result.element(2, 1), 0);
        assertEquals(15, result.element(2, 2), 0);
        assertEquals(21, result.element(2, 3), 0);
        assertEquals(27, result.element(2, 4), 0);
        assertEquals(4, result.element(3, 0), 0);
        assertEquals(10, result.element(3, 1), 0);
        assertEquals(16, result.element(3, 2), 0);
        assertEquals(22, result.element(3, 3), 0);
        assertEquals(28, result.element(3, 4), 0);
        assertEquals(5, result.element(4, 0), 0);
        assertEquals(11, result.element(4, 1), 0);
        assertEquals(17, result.element(4, 2), 0);
        assertEquals(23, result.element(4, 3), 0);
        assertEquals(29, result.element(4, 4), 0);
        assertEquals(6, result.element(5, 0), 0);
        assertEquals(12, result.element(5, 1), 0);
        assertEquals(18, result.element(5, 2), 0);
        assertEquals(24, result.element(5, 3), 0);
        assertEquals(30, result.element(5, 4), 0);
    }

    @Test
    public void testTranspose6x2(){
        Matrix result = firstMat6x2.transpose();
        assertEquals(1, result.element(0, 0), 0);
        assertEquals(3, result.element(0, 1), 0);
        assertEquals(5, result.element(0, 2), 0);
        assertEquals(7, result.element(0, 3), 0);
        assertEquals(9, result.element(0, 4), 0);
        assertEquals(11, result.element(0, 5), 0);
        assertEquals(2, result.element(1, 0), 0);
        assertEquals(4, result.element(1, 1), 0);
        assertEquals(6, result.element(1, 2), 0);
        assertEquals(8, result.element(1, 3), 0);
        assertEquals(10, result.element(1, 4), 0);
        assertEquals(12, result.element(1, 5), 0);
    }

    @Test
    public void testTranspose6x3(){
        Matrix result = firstMat6x3.transpose();
        assertEquals(1, result.element(0, 0), 0);
        assertEquals(4, result.element(0, 1), 0);
        assertEquals(7, result.element(0, 2), 0);
        assertEquals(10, result.element(0, 3), 0);
        assertEquals(13, result.element(0, 4), 0);
        assertEquals(16, result.element(0, 5), 0);
        assertEquals(2, result.element(1, 0), 0);
        assertEquals(5, result.element(1, 1), 0);
        assertEquals(8, result.element(1, 2), 0);
        assertEquals(11, result.element(1, 3), 0);
        assertEquals(14, result.element(1, 4), 0);
        assertEquals(17, result.element(1, 5), 0);
        assertEquals(3, result.element(2, 0), 0);
        assertEquals(6, result.element(2, 1), 0);
        assertEquals(9, result.element(2, 2), 0);
        assertEquals(12, result.element(2, 3), 0);
        assertEquals(15, result.element(2, 4), 0);
        assertEquals(18, result.element(2, 5), 0);
    }

    @Test
    public void testTranspose6x4(){
        Matrix result = firstMat6x4.transpose();
        assertEquals(1, result.element(0, 0), 0);
        assertEquals(5, result.element(0, 1), 0);
        assertEquals(9, result.element(0, 2), 0);
        assertEquals(13, result.element(0, 3), 0);
        assertEquals(17, result.element(0, 4), 0);
        assertEquals(21, result.element(0, 5), 0);
        assertEquals(2, result.element(1, 0), 0);
        assertEquals(6, result.element(1, 1), 0);
        assertEquals(10, result.element(1, 2), 0);
        assertEquals(14, result.element(1, 3), 0);
        assertEquals(18, result.element(1, 4), 0);
        assertEquals(22, result.element(1, 5), 0);
        assertEquals(3, result.element(2, 0), 0);
        assertEquals(7, result.element(2, 1), 0);
        assertEquals(11, result.element(2, 2), 0);
        assertEquals(15, result.element(2, 3), 0);
        assertEquals(19, result.element(2, 4), 0);
        assertEquals(23, result.element(2, 5), 0);
        assertEquals(4, result.element(3, 0), 0);
        assertEquals(8, result.element(3, 1), 0);
        assertEquals(12, result.element(3, 2), 0);
        assertEquals(16, result.element(3, 3), 0);
        assertEquals(20, result.element(3, 4), 0);
        assertEquals(24, result.element(3, 5), 0);
    }

    @Test
    public void testTranspose6x5(){
        Matrix result = firstMat6x5.transpose();
        assertEquals(1, result.element(0, 0), 0);
        assertEquals(6, result.element(0, 1), 0);
        assertEquals(11, result.element(0, 2), 0);
        assertEquals(16, result.element(0, 3), 0);
        assertEquals(21, result.element(0, 4), 0);
        assertEquals(26, result.element(0, 5), 0);
        assertEquals(2, result.element(1, 0), 0);
        assertEquals(7, result.element(1, 1), 0);
        assertEquals(12, result.element(1, 2), 0);
        assertEquals(17, result.element(1, 3), 0);
        assertEquals(22, result.element(1, 4), 0);
        assertEquals(27, result.element(1, 5), 0);
        assertEquals(3, result.element(2, 0), 0);
        assertEquals(8, result.element(2, 1), 0);
        assertEquals(13, result.element(2, 2), 0);
        assertEquals(18, result.element(2, 3), 0);
        assertEquals(23, result.element(2, 4), 0);
        assertEquals(28, result.element(2, 5), 0);
        assertEquals(4, result.element(3, 0), 0);
        assertEquals(9, result.element(3, 1), 0);
        assertEquals(14, result.element(3, 2), 0);
        assertEquals(19, result.element(3, 3), 0);
        assertEquals(24, result.element(3, 4), 0);
        assertEquals(29, result.element(3, 5), 0);
        assertEquals(5, result.element(4, 0), 0);
        assertEquals(10, result.element(4, 1), 0);
        assertEquals(15, result.element(4, 2), 0);
        assertEquals(20, result.element(4, 3), 0);
        assertEquals(25, result.element(4, 4), 0);
        assertEquals(30, result.element(4, 5), 0);
    }

    @Test
    public void testTranspose6x6(){
        Matrix result = firstMat6x6.transpose();
        assertEquals(1, result.element(0, 0), 0);
        assertEquals(7, result.element(0, 1), 0);
        assertEquals(13, result.element(0, 2), 0);
        assertEquals(19, result.element(0, 3), 0);
        assertEquals(25, result.element(0, 4), 0);
        assertEquals(31, result.element(0, 5), 0);
        assertEquals(2, result.element(1, 0), 0);
        assertEquals(8, result.element(1, 1), 0);
        assertEquals(14, result.element(1, 2), 0);
        assertEquals(20, result.element(1, 3), 0);
        assertEquals(26, result.element(1, 4), 0);
        assertEquals(32, result.element(1, 5), 0);
        assertEquals(3, result.element(2, 0), 0);
        assertEquals(9, result.element(2, 1), 0);
        assertEquals(15, result.element(2, 2), 0);
        assertEquals(21, result.element(2, 3), 0);
        assertEquals(27, result.element(2, 4), 0);
        assertEquals(33, result.element(2, 5), 0);
        assertEquals(4, result.element(3, 0), 0);
        assertEquals(10, result.element(3, 1), 0);
        assertEquals(16, result.element(3, 2), 0);
        assertEquals(22, result.element(3, 3), 0);
        assertEquals(28, result.element(3, 4), 0);
        assertEquals(34, result.element(3, 5), 0);
        assertEquals(5, result.element(4, 0), 0);
        assertEquals(11, result.element(4, 1), 0);
        assertEquals(17, result.element(4, 2), 0);
        assertEquals(23, result.element(4, 3), 0);
        assertEquals(29, result.element(4, 4), 0);
        assertEquals(35, result.element(4, 5), 0);
        assertEquals(6, result.element(5, 0), 0);
        assertEquals(12, result.element(5, 1), 0);
        assertEquals(18, result.element(5, 2), 0);
        assertEquals(24, result.element(5, 3), 0);
        assertEquals(30, result.element(5, 4), 0);
        assertEquals(36, result.element(5, 5), 0);
    }

    @Test
    public void testSubtraction2x2(){
        Matrix result = firstMat2x2.minus(secondMat2x2);
        assertEquals(-4, result.element(0, 0), 0);
        assertEquals(-4, result.element(0, 1), 0);
        assertEquals(-4, result.element(1, 0), 0);
        assertEquals(-4, result.element(1, 1), 0);
    }

    @Test
    public void testSubtraction2x3(){
        Matrix result = firstMat2x3.minus(secondMat2x3);
        assertEquals(-6, result.element(0, 0), 0);
        assertEquals(-6, result.element(0, 1), 0);
        assertEquals(-6, result.element(0, 2), 0);
        assertEquals(-6, result.element(1, 0), 0);
        assertEquals(-6, result.element(1, 1), 0);
        assertEquals(-6, result.element(1, 2), 0);
    }

    @Test
    public void testSubtraction2x4(){
        Matrix result = firstMat2x4.minus(secondMat2x4);
        assertEquals(-8, result.element(0, 0), 0);
        assertEquals(-8, result.element(0, 1), 0);
        assertEquals(-8, result.element(0, 2), 0);
        assertEquals(-8, result.element(0, 3), 0);
        assertEquals(-8, result.element(1, 0), 0);
        assertEquals(-8, result.element(1, 1), 0);
        assertEquals(-8, result.element(1, 2), 0);
        assertEquals(-8, result.element(1, 3), 0);
    }

    @Test
    public void testSubtraction2x5(){
        Matrix result = firstMat2x5.minus(secondMat2x5);
        assertEquals(-10, result.element(0, 0), 0);
        assertEquals(-10, result.element(0, 1), 0);
        assertEquals(-10, result.element(0, 2), 0);
        assertEquals(-10, result.element(0, 3), 0);
        assertEquals(-10, result.element(0, 4), 0);
        assertEquals(-10, result.element(1, 0), 0);
        assertEquals(-10, result.element(1, 1), 0);
        assertEquals(-10, result.element(1, 2), 0);
        assertEquals(-10, result.element(1, 3), 0);
        assertEquals(-10, result.element(1, 4), 0);
    }

    @Test
    public void testSubtraction2x6(){
        Matrix result = firstMat2x6.minus(secondMat2x6);
        assertEquals(-12, result.element(0, 0), 0);
        assertEquals(-12, result.element(0, 1), 0);
        assertEquals(-12, result.element(0, 2), 0);
        assertEquals(-12, result.element(0, 3), 0);
        assertEquals(-12, result.element(0, 4), 0);
        assertEquals(-12, result.element(0, 5), 0);
        assertEquals(-12, result.element(1, 0), 0);
        assertEquals(-12, result.element(1, 1), 0);
        assertEquals(-12, result.element(1, 2), 0);
        assertEquals(-12, result.element(1, 3), 0);
        assertEquals(-12, result.element(1, 4), 0);
        assertEquals(-12, result.element(1, 5), 0);
    }

    @Test
    public void testSubtraction3x2(){
        Matrix result = firstMat3x2.minus(secondMat3x2);
        assertEquals(-6, result.element(0, 0), 0);
        assertEquals(-6, result.element(0, 1), 0);
        assertEquals(-6, result.element(1, 0), 0);
        assertEquals(-6, result.element(1, 1), 0);
        assertEquals(-6, result.element(2, 0), 0);
        assertEquals(-6, result.element(2, 1), 0);
    }

    @Test
    public void testSubtraction3x3(){
        Matrix result = firstMat3x3.minus(secondMat3x3);
        assertEquals(-9, result.element(0, 0), 0);
        assertEquals(-9, result.element(0, 1), 0);
        assertEquals(-9, result.element(0, 2), 0);
        assertEquals(-9, result.element(1, 0), 0);
        assertEquals(-9, result.element(1, 1), 0);
        assertEquals(-9, result.element(1, 2), 0);
        assertEquals(-9, result.element(2, 0), 0);
        assertEquals(-9, result.element(2, 1), 0);
        assertEquals(-9, result.element(2, 2), 0);
    }

    @Test
    public void testSubtraction3x4(){
        Matrix result = firstMat3x4.minus(secondMat3x4);
        assertEquals(-12, result.element(0, 0), 0);
        assertEquals(-12, result.element(0, 1), 0);
        assertEquals(-12, result.element(0, 2), 0);
        assertEquals(-12, result.element(0, 3), 0);
        assertEquals(-12, result.element(1, 0), 0);
        assertEquals(-12, result.element(1, 1), 0);
        assertEquals(-12, result.element(1, 2), 0);
        assertEquals(-12, result.element(1, 3), 0);
        assertEquals(-12, result.element(2, 0), 0);
        assertEquals(-12, result.element(2, 1), 0);
        assertEquals(-12, result.element(2, 2), 0);
        assertEquals(-12, result.element(2, 3), 0);
    }

    @Test
    public void testSubtraction3x5(){
        Matrix result = firstMat3x5.minus(secondMat3x5);
        assertEquals(-15, result.element(0, 0), 0);
        assertEquals(-15, result.element(0, 1), 0);
        assertEquals(-15, result.element(0, 2), 0);
        assertEquals(-15, result.element(0, 3), 0);
        assertEquals(-15, result.element(0, 4), 0);
        assertEquals(-15, result.element(1, 0), 0);
        assertEquals(-15, result.element(1, 1), 0);
        assertEquals(-15, result.element(1, 2), 0);
        assertEquals(-15, result.element(1, 3), 0);
        assertEquals(-15, result.element(1, 4), 0);
        assertEquals(-15, result.element(2, 0), 0);
        assertEquals(-15, result.element(2, 1), 0);
        assertEquals(-15, result.element(2, 2), 0);
        assertEquals(-15, result.element(2, 3), 0);
        assertEquals(-15, result.element(2, 4), 0);
    }

    @Test
    public void testSubtraction3x6(){
        Matrix result = firstMat3x6.minus(secondMat3x6);
        assertEquals(-18, result.element(0, 0), 0);
        assertEquals(-18, result.element(0, 1), 0);
        assertEquals(-18, result.element(0, 2), 0);
        assertEquals(-18, result.element(0, 3), 0);
        assertEquals(-18, result.element(0, 4), 0);
        assertEquals(-18, result.element(0, 5), 0);
        assertEquals(-18, result.element(1, 0), 0);
        assertEquals(-18, result.element(1, 1), 0);
        assertEquals(-18, result.element(1, 2), 0);
        assertEquals(-18, result.element(1, 3), 0);
        assertEquals(-18, result.element(1, 4), 0);
        assertEquals(-18, result.element(1, 5), 0);
        assertEquals(-18, result.element(2, 0), 0);
        assertEquals(-18, result.element(2, 1), 0);
        assertEquals(-18, result.element(2, 2), 0);
        assertEquals(-18, result.element(2, 3), 0);
        assertEquals(-18, result.element(2, 4), 0);
        assertEquals(-18, result.element(2, 5), 0);
    }

    @Test
    public void testSubtraction4x2(){
        Matrix result = firstMat4x2.minus(secondMat4x2);
        assertEquals(-8, result.element(0, 0), 0);
        assertEquals(-8, result.element(0, 1), 0);
        assertEquals(-8, result.element(1, 0), 0);
        assertEquals(-8, result.element(1, 1), 0);
        assertEquals(-8, result.element(2, 0), 0);
        assertEquals(-8, result.element(2, 1), 0);
        assertEquals(-8, result.element(3, 0), 0);
        assertEquals(-8, result.element(3, 1), 0);
    }

    @Test
    public void testSubtraction4x3(){
        Matrix result = firstMat4x3.minus(secondMat4x3);
        assertEquals(-12, result.element(0, 0), 0);
        assertEquals(-12, result.element(0, 1), 0);
        assertEquals(-12, result.element(0, 2), 0);
        assertEquals(-12, result.element(1, 0), 0);
        assertEquals(-12, result.element(1, 1), 0);
        assertEquals(-12, result.element(1, 2), 0);
        assertEquals(-12, result.element(2, 0), 0);
        assertEquals(-12, result.element(2, 1), 0);
        assertEquals(-12, result.element(2, 2), 0);
        assertEquals(-12, result.element(3, 0), 0);
        assertEquals(-12, result.element(3, 1), 0);
        assertEquals(-12, result.element(3, 2), 0);
    }

    @Test
    public void testSubtraction4x4(){
        Matrix result = firstMat4x4.minus(secondMat4x4);
        assertEquals(-16, result.element(0, 0), 0);
        assertEquals(-16, result.element(0, 1), 0);
        assertEquals(-16, result.element(0, 2), 0);
        assertEquals(-16, result.element(0, 3), 0);
        assertEquals(-16, result.element(1, 0), 0);
        assertEquals(-16, result.element(1, 1), 0);
        assertEquals(-16, result.element(1, 2), 0);
        assertEquals(-16, result.element(1, 3), 0);
        assertEquals(-16, result.element(2, 0), 0);
        assertEquals(-16, result.element(2, 1), 0);
        assertEquals(-16, result.element(2, 2), 0);
        assertEquals(-16, result.element(2, 3), 0);
        assertEquals(-16, result.element(3, 0), 0);
        assertEquals(-16, result.element(3, 1), 0);
        assertEquals(-16, result.element(3, 2), 0);
        assertEquals(-16, result.element(3, 3), 0);
    }

    @Test
    public void testSubtraction4x5(){
        Matrix result = firstMat4x5.minus(secondMat4x5);
        assertEquals(-20, result.element(0, 0), 0);
        assertEquals(-20, result.element(0, 1), 0);
        assertEquals(-20, result.element(0, 2), 0);
        assertEquals(-20, result.element(0, 3), 0);
        assertEquals(-20, result.element(0, 4), 0);
        assertEquals(-20, result.element(1, 0), 0);
        assertEquals(-20, result.element(1, 1), 0);
        assertEquals(-20, result.element(1, 2), 0);
        assertEquals(-20, result.element(1, 3), 0);
        assertEquals(-20, result.element(1, 4), 0);
        assertEquals(-20, result.element(2, 0), 0);
        assertEquals(-20, result.element(2, 1), 0);
        assertEquals(-20, result.element(2, 2), 0);
        assertEquals(-20, result.element(2, 3), 0);
        assertEquals(-20, result.element(2, 4), 0);
        assertEquals(-20, result.element(3, 0), 0);
        assertEquals(-20, result.element(3, 1), 0);
        assertEquals(-20, result.element(3, 2), 0);
        assertEquals(-20, result.element(3, 3), 0);
        assertEquals(-20, result.element(3, 4), 0);
    }

    @Test
    public void testSubtraction4x6(){
        Matrix result = firstMat4x6.minus(secondMat4x6);
        assertEquals(-24, result.element(0, 0), 0);
        assertEquals(-24, result.element(0, 1), 0);
        assertEquals(-24, result.element(0, 2), 0);
        assertEquals(-24, result.element(0, 3), 0);
        assertEquals(-24, result.element(0, 4), 0);
        assertEquals(-24, result.element(0, 5), 0);
        assertEquals(-24, result.element(1, 0), 0);
        assertEquals(-24, result.element(1, 1), 0);
        assertEquals(-24, result.element(1, 2), 0);
        assertEquals(-24, result.element(1, 3), 0);
        assertEquals(-24, result.element(1, 4), 0);
        assertEquals(-24, result.element(1, 5), 0);
        assertEquals(-24, result.element(2, 0), 0);
        assertEquals(-24, result.element(2, 1), 0);
        assertEquals(-24, result.element(2, 2), 0);
        assertEquals(-24, result.element(2, 3), 0);
        assertEquals(-24, result.element(2, 4), 0);
        assertEquals(-24, result.element(2, 5), 0);
        assertEquals(-24, result.element(3, 0), 0);
        assertEquals(-24, result.element(3, 1), 0);
        assertEquals(-24, result.element(3, 2), 0);
        assertEquals(-24, result.element(3, 3), 0);
        assertEquals(-24, result.element(3, 4), 0);
        assertEquals(-24, result.element(3, 5), 0);
    }

    @Test
    public void testSubtraction5x2(){
        Matrix result = firstMat5x2.minus(secondMat5x2);
        assertEquals(-10, result.element(0, 0), 0);
        assertEquals(-10, result.element(0, 1), 0);
        assertEquals(-10, result.element(1, 0), 0);
        assertEquals(-10, result.element(1, 1), 0);
        assertEquals(-10, result.element(2, 0), 0);
        assertEquals(-10, result.element(2, 1), 0);
        assertEquals(-10, result.element(3, 0), 0);
        assertEquals(-10, result.element(3, 1), 0);
        assertEquals(-10, result.element(4, 0), 0);
        assertEquals(-10, result.element(4, 1), 0);
    }

    @Test
    public void testSubtraction5x3(){
        Matrix result = firstMat5x3.minus(secondMat5x3);
        assertEquals(-15, result.element(0, 0), 0);
        assertEquals(-15, result.element(0, 1), 0);
        assertEquals(-15, result.element(0, 2), 0);
        assertEquals(-15, result.element(1, 0), 0);
        assertEquals(-15, result.element(1, 1), 0);
        assertEquals(-15, result.element(1, 2), 0);
        assertEquals(-15, result.element(2, 0), 0);
        assertEquals(-15, result.element(2, 1), 0);
        assertEquals(-15, result.element(2, 2), 0);
        assertEquals(-15, result.element(3, 0), 0);
        assertEquals(-15, result.element(3, 1), 0);
        assertEquals(-15, result.element(3, 2), 0);
        assertEquals(-15, result.element(4, 0), 0);
        assertEquals(-15, result.element(4, 1), 0);
        assertEquals(-15, result.element(4, 2), 0);
    }

    @Test
    public void testSubtraction5x4(){
        Matrix result = firstMat5x4.minus(secondMat5x4);
        assertEquals(-20, result.element(0, 0), 0);
        assertEquals(-20, result.element(0, 1), 0);
        assertEquals(-20, result.element(0, 2), 0);
        assertEquals(-20, result.element(0, 3), 0);
        assertEquals(-20, result.element(1, 0), 0);
        assertEquals(-20, result.element(1, 1), 0);
        assertEquals(-20, result.element(1, 2), 0);
        assertEquals(-20, result.element(1, 3), 0);
        assertEquals(-20, result.element(2, 0), 0);
        assertEquals(-20, result.element(2, 1), 0);
        assertEquals(-20, result.element(2, 2), 0);
        assertEquals(-20, result.element(2, 3), 0);
        assertEquals(-20, result.element(3, 0), 0);
        assertEquals(-20, result.element(3, 1), 0);
        assertEquals(-20, result.element(3, 2), 0);
        assertEquals(-20, result.element(3, 3), 0);
        assertEquals(-20, result.element(4, 0), 0);
        assertEquals(-20, result.element(4, 1), 0);
        assertEquals(-20, result.element(4, 2), 0);
        assertEquals(-20, result.element(4, 3), 0);
    }

    @Test
    public void testSubtraction5x5(){
        Matrix result = firstMat5x5.minus(secondMat5x5);
        assertEquals(-25, result.element(0, 0), 0);
        assertEquals(-25, result.element(0, 1), 0);
        assertEquals(-25, result.element(0, 2), 0);
        assertEquals(-25, result.element(0, 3), 0);
        assertEquals(-25, result.element(0, 4), 0);
        assertEquals(-25, result.element(1, 0), 0);
        assertEquals(-25, result.element(1, 1), 0);
        assertEquals(-25, result.element(1, 2), 0);
        assertEquals(-25, result.element(1, 3), 0);
        assertEquals(-25, result.element(1, 4), 0);
        assertEquals(-25, result.element(2, 0), 0);
        assertEquals(-25, result.element(2, 1), 0);
        assertEquals(-25, result.element(2, 2), 0);
        assertEquals(-25, result.element(2, 3), 0);
        assertEquals(-25, result.element(2, 4), 0);
        assertEquals(-25, result.element(3, 0), 0);
        assertEquals(-25, result.element(3, 1), 0);
        assertEquals(-25, result.element(3, 2), 0);
        assertEquals(-25, result.element(3, 3), 0);
        assertEquals(-25, result.element(3, 4), 0);
        assertEquals(-25, result.element(4, 0), 0);
        assertEquals(-25, result.element(4, 1), 0);
        assertEquals(-25, result.element(4, 2), 0);
        assertEquals(-25, result.element(4, 3), 0);
        assertEquals(-25, result.element(4, 4), 0);
    }

    @Test
    public void testSubtraction5x6(){
        Matrix result = firstMat5x6.minus(secondMat5x6);
        assertEquals(-30, result.element(0, 0), 0);
        assertEquals(-30, result.element(0, 1), 0);
        assertEquals(-30, result.element(0, 2), 0);
        assertEquals(-30, result.element(0, 3), 0);
        assertEquals(-30, result.element(0, 4), 0);
        assertEquals(-30, result.element(0, 5), 0);
        assertEquals(-30, result.element(1, 0), 0);
        assertEquals(-30, result.element(1, 1), 0);
        assertEquals(-30, result.element(1, 2), 0);
        assertEquals(-30, result.element(1, 3), 0);
        assertEquals(-30, result.element(1, 4), 0);
        assertEquals(-30, result.element(1, 5), 0);
        assertEquals(-30, result.element(2, 0), 0);
        assertEquals(-30, result.element(2, 1), 0);
        assertEquals(-30, result.element(2, 2), 0);
        assertEquals(-30, result.element(2, 3), 0);
        assertEquals(-30, result.element(2, 4), 0);
        assertEquals(-30, result.element(2, 5), 0);
        assertEquals(-30, result.element(3, 0), 0);
        assertEquals(-30, result.element(3, 1), 0);
        assertEquals(-30, result.element(3, 2), 0);
        assertEquals(-30, result.element(3, 3), 0);
        assertEquals(-30, result.element(3, 4), 0);
        assertEquals(-30, result.element(3, 5), 0);
        assertEquals(-30, result.element(4, 0), 0);
        assertEquals(-30, result.element(4, 1), 0);
        assertEquals(-30, result.element(4, 2), 0);
        assertEquals(-30, result.element(4, 3), 0);
        assertEquals(-30, result.element(4, 4), 0);
        assertEquals(-30, result.element(4, 5), 0);
    }

    @Test
    public void testSubtraction6x2(){
        Matrix result = firstMat6x2.minus(secondMat6x2);
        assertEquals(-12, result.element(0, 0), 0);
        assertEquals(-12, result.element(0, 1), 0);
        assertEquals(-12, result.element(1, 0), 0);
        assertEquals(-12, result.element(1, 1), 0);
        assertEquals(-12, result.element(2, 0), 0);
        assertEquals(-12, result.element(2, 1), 0);
        assertEquals(-12, result.element(3, 0), 0);
        assertEquals(-12, result.element(3, 1), 0);
        assertEquals(-12, result.element(4, 0), 0);
        assertEquals(-12, result.element(4, 1), 0);
        assertEquals(-12, result.element(5, 0), 0);
        assertEquals(-12, result.element(5, 1), 0);
    }

    @Test
    public void testSubtraction6x3(){
        Matrix result = firstMat6x3.minus(secondMat6x3);
        assertEquals(-18, result.element(0, 0), 0);
        assertEquals(-18, result.element(0, 1), 0);
        assertEquals(-18, result.element(0, 2), 0);
        assertEquals(-18, result.element(1, 0), 0);
        assertEquals(-18, result.element(1, 1), 0);
        assertEquals(-18, result.element(1, 2), 0);
        assertEquals(-18, result.element(2, 0), 0);
        assertEquals(-18, result.element(2, 1), 0);
        assertEquals(-18, result.element(2, 2), 0);
        assertEquals(-18, result.element(3, 0), 0);
        assertEquals(-18, result.element(3, 1), 0);
        assertEquals(-18, result.element(3, 2), 0);
        assertEquals(-18, result.element(4, 0), 0);
        assertEquals(-18, result.element(4, 1), 0);
        assertEquals(-18, result.element(4, 2), 0);
        assertEquals(-18, result.element(5, 0), 0);
        assertEquals(-18, result.element(5, 1), 0);
        assertEquals(-18, result.element(5, 2), 0);
    }

    @Test
    public void testSubtraction6x4(){
        Matrix result = firstMat6x4.minus(secondMat6x4);
        assertEquals(-24, result.element(0, 0), 0);
        assertEquals(-24, result.element(0, 1), 0);
        assertEquals(-24, result.element(0, 2), 0);
        assertEquals(-24, result.element(0, 3), 0);
        assertEquals(-24, result.element(1, 0), 0);
        assertEquals(-24, result.element(1, 1), 0);
        assertEquals(-24, result.element(1, 2), 0);
        assertEquals(-24, result.element(1, 3), 0);
        assertEquals(-24, result.element(2, 0), 0);
        assertEquals(-24, result.element(2, 1), 0);
        assertEquals(-24, result.element(2, 2), 0);
        assertEquals(-24, result.element(2, 3), 0);
        assertEquals(-24, result.element(3, 0), 0);
        assertEquals(-24, result.element(3, 1), 0);
        assertEquals(-24, result.element(3, 2), 0);
        assertEquals(-24, result.element(3, 3), 0);
        assertEquals(-24, result.element(4, 0), 0);
        assertEquals(-24, result.element(4, 1), 0);
        assertEquals(-24, result.element(4, 2), 0);
        assertEquals(-24, result.element(4, 3), 0);
        assertEquals(-24, result.element(5, 0), 0);
        assertEquals(-24, result.element(5, 1), 0);
        assertEquals(-24, result.element(5, 2), 0);
        assertEquals(-24, result.element(5, 3), 0);
    }

    @Test
    public void testSubtraction6x5(){
        Matrix result = firstMat6x5.minus(secondMat6x5);
        assertEquals(-30, result.element(0, 0), 0);
        assertEquals(-30, result.element(0, 1), 0);
        assertEquals(-30, result.element(0, 2), 0);
        assertEquals(-30, result.element(0, 3), 0);
        assertEquals(-30, result.element(0, 4), 0);
        assertEquals(-30, result.element(1, 0), 0);
        assertEquals(-30, result.element(1, 1), 0);
        assertEquals(-30, result.element(1, 2), 0);
        assertEquals(-30, result.element(1, 3), 0);
        assertEquals(-30, result.element(1, 4), 0);
        assertEquals(-30, result.element(2, 0), 0);
        assertEquals(-30, result.element(2, 1), 0);
        assertEquals(-30, result.element(2, 2), 0);
        assertEquals(-30, result.element(2, 3), 0);
        assertEquals(-30, result.element(2, 4), 0);
        assertEquals(-30, result.element(3, 0), 0);
        assertEquals(-30, result.element(3, 1), 0);
        assertEquals(-30, result.element(3, 2), 0);
        assertEquals(-30, result.element(3, 3), 0);
        assertEquals(-30, result.element(3, 4), 0);
        assertEquals(-30, result.element(4, 0), 0);
        assertEquals(-30, result.element(4, 1), 0);
        assertEquals(-30, result.element(4, 2), 0);
        assertEquals(-30, result.element(4, 3), 0);
        assertEquals(-30, result.element(4, 4), 0);
        assertEquals(-30, result.element(5, 0), 0);
        assertEquals(-30, result.element(5, 1), 0);
        assertEquals(-30, result.element(5, 2), 0);
        assertEquals(-30, result.element(5, 3), 0);
        assertEquals(-30, result.element(5, 4), 0);
    }

    @Test
    public void testSubtraction6x6(){
        Matrix result = firstMat6x6.minus(secondMat6x6);
        assertEquals(-36, result.element(0, 0), 0);
        assertEquals(-36, result.element(0, 1), 0);
        assertEquals(-36, result.element(0, 2), 0);
        assertEquals(-36, result.element(0, 3), 0);
        assertEquals(-36, result.element(0, 4), 0);
        assertEquals(-36, result.element(0, 5), 0);
        assertEquals(-36, result.element(1, 0), 0);
        assertEquals(-36, result.element(1, 1), 0);
        assertEquals(-36, result.element(1, 2), 0);
        assertEquals(-36, result.element(1, 3), 0);
        assertEquals(-36, result.element(1, 4), 0);
        assertEquals(-36, result.element(1, 5), 0);
        assertEquals(-36, result.element(2, 0), 0);
        assertEquals(-36, result.element(2, 1), 0);
        assertEquals(-36, result.element(2, 2), 0);
        assertEquals(-36, result.element(2, 3), 0);
        assertEquals(-36, result.element(2, 4), 0);
        assertEquals(-36, result.element(2, 5), 0);
        assertEquals(-36, result.element(3, 0), 0);
        assertEquals(-36, result.element(3, 1), 0);
        assertEquals(-36, result.element(3, 2), 0);
        assertEquals(-36, result.element(3, 3), 0);
        assertEquals(-36, result.element(3, 4), 0);
        assertEquals(-36, result.element(3, 5), 0);
        assertEquals(-36, result.element(4, 0), 0);
        assertEquals(-36, result.element(4, 1), 0);
        assertEquals(-36, result.element(4, 2), 0);
        assertEquals(-36, result.element(4, 3), 0);
        assertEquals(-36, result.element(4, 4), 0);
        assertEquals(-36, result.element(4, 5), 0);
        assertEquals(-36, result.element(5, 0), 0);
        assertEquals(-36, result.element(5, 1), 0);
        assertEquals(-36, result.element(5, 2), 0);
        assertEquals(-36, result.element(5, 3), 0);
        assertEquals(-36, result.element(5, 4), 0);
        assertEquals(-36, result.element(5, 5), 0);
    }

    @Test
    public void testScale2x2(){
        Matrix result = firstMat2x2.scale(2);
        assertEquals(2, result.element(0, 0), 0);
        assertEquals(4, result.element(0, 1), 0);
        assertEquals(6, result.element(1, 0), 0);
        assertEquals(8, result.element(1, 1), 0);
    }

    @Test
    public void testScale2x3(){
        Matrix result = firstMat2x3.scale(2);
        assertEquals(2, result.element(0, 0), 0);
        assertEquals(4, result.element(0, 1), 0);
        assertEquals(6, result.element(0, 2), 0);
        assertEquals(8, result.element(1, 0), 0);
        assertEquals(10, result.element(1, 1), 0);
        assertEquals(12, result.element(1, 2), 0);
    }

    @Test
    public void testScale2x4(){
        Matrix result = firstMat2x4.scale(2);
        assertEquals(2, result.element(0, 0), 0);
        assertEquals(4, result.element(0, 1), 0);
        assertEquals(6, result.element(0, 2), 0);
        assertEquals(8, result.element(0, 3), 0);
        assertEquals(10, result.element(1, 0), 0);
        assertEquals(12, result.element(1, 1), 0);
        assertEquals(14, result.element(1, 2), 0);
        assertEquals(16, result.element(1, 3), 0);
    }

    @Test
    public void testScale2x5(){
        Matrix result = firstMat2x5.scale(2);
        assertEquals(2, result.element(0, 0), 0);
        assertEquals(4, result.element(0, 1), 0);
        assertEquals(6, result.element(0, 2), 0);
        assertEquals(8, result.element(0, 3), 0);
        assertEquals(10, result.element(0, 4), 0);
        assertEquals(12, result.element(1, 0), 0);
        assertEquals(14, result.element(1, 1), 0);
        assertEquals(16, result.element(1, 2), 0);
        assertEquals(18, result.element(1, 3), 0);
        assertEquals(20, result.element(1, 4), 0);
    }

    @Test
    public void testScale2x6(){
        Matrix result = firstMat2x6.scale(2);
        assertEquals(2, result.element(0, 0), 0);
        assertEquals(4, result.element(0, 1), 0);
        assertEquals(6, result.element(0, 2), 0);
        assertEquals(8, result.element(0, 3), 0);
        assertEquals(10, result.element(0, 4), 0);
        assertEquals(12, result.element(0, 5), 0);
        assertEquals(14, result.element(1, 0), 0);
        assertEquals(16, result.element(1, 1), 0);
        assertEquals(18, result.element(1, 2), 0);
        assertEquals(20, result.element(1, 3), 0);
        assertEquals(22, result.element(1, 4), 0);
        assertEquals(24, result.element(1, 5), 0);
    }

    @Test
    public void testScale3x2(){
        Matrix result = firstMat3x2.scale(2);
        assertEquals(2, result.element(0, 0), 0);
        assertEquals(4, result.element(0, 1), 0);
        assertEquals(6, result.element(1, 0), 0);
        assertEquals(8, result.element(1, 1), 0);
        assertEquals(10, result.element(2, 0), 0);
        assertEquals(12, result.element(2, 1), 0);
    }

    @Test
    public void testScale3x3(){
        Matrix result = firstMat3x3.scale(2);
        assertEquals(2, result.element(0, 0), 0);
        assertEquals(4, result.element(0, 1), 0);
        assertEquals(6, result.element(0, 2), 0);
        assertEquals(8, result.element(1, 0), 0);
        assertEquals(10, result.element(1, 1), 0);
        assertEquals(12, result.element(1, 2), 0);
        assertEquals(14, result.element(2, 0), 0);
        assertEquals(16, result.element(2, 1), 0);
        assertEquals(18, result.element(2, 2), 0);
    }

    @Test
    public void testScale3x4(){
        Matrix result = firstMat3x4.scale(2);
        assertEquals(2, result.element(0, 0), 0);
        assertEquals(4, result.element(0, 1), 0);
        assertEquals(6, result.element(0, 2), 0);
        assertEquals(8, result.element(0, 3), 0);
        assertEquals(10, result.element(1, 0), 0);
        assertEquals(12, result.element(1, 1), 0);
        assertEquals(14, result.element(1, 2), 0);
        assertEquals(16, result.element(1, 3), 0);
        assertEquals(18, result.element(2, 0), 0);
        assertEquals(20, result.element(2, 1), 0);
        assertEquals(22, result.element(2, 2), 0);
        assertEquals(24, result.element(2, 3), 0);
    }

    @Test
    public void testScale3x5(){
        Matrix result = firstMat3x5.scale(2);
        assertEquals(2, result.element(0, 0), 0);
        assertEquals(4, result.element(0, 1), 0);
        assertEquals(6, result.element(0, 2), 0);
        assertEquals(8, result.element(0, 3), 0);
        assertEquals(10, result.element(0, 4), 0);
        assertEquals(12, result.element(1, 0), 0);
        assertEquals(14, result.element(1, 1), 0);
        assertEquals(16, result.element(1, 2), 0);
        assertEquals(18, result.element(1, 3), 0);
        assertEquals(20, result.element(1, 4), 0);
        assertEquals(22, result.element(2, 0), 0);
        assertEquals(24, result.element(2, 1), 0);
        assertEquals(26, result.element(2, 2), 0);
        assertEquals(28, result.element(2, 3), 0);
        assertEquals(30, result.element(2, 4), 0);
    }

    @Test
    public void testScale3x6(){
        Matrix result = firstMat3x6.scale(2);
        assertEquals(2, result.element(0, 0), 0);
        assertEquals(4, result.element(0, 1), 0);
        assertEquals(6, result.element(0, 2), 0);
        assertEquals(8, result.element(0, 3), 0);
        assertEquals(10, result.element(0, 4), 0);
        assertEquals(12, result.element(0, 5), 0);
        assertEquals(14, result.element(1, 0), 0);
        assertEquals(16, result.element(1, 1), 0);
        assertEquals(18, result.element(1, 2), 0);
        assertEquals(20, result.element(1, 3), 0);
        assertEquals(22, result.element(1, 4), 0);
        assertEquals(24, result.element(1, 5), 0);
        assertEquals(26, result.element(2, 0), 0);
        assertEquals(28, result.element(2, 1), 0);
        assertEquals(30, result.element(2, 2), 0);
        assertEquals(32, result.element(2, 3), 0);
        assertEquals(34, result.element(2, 4), 0);
        assertEquals(36, result.element(2, 5), 0);
    }

    @Test
    public void testScale4x2(){
        Matrix result = firstMat4x2.scale(2);
        assertEquals(2, result.element(0, 0), 0);
        assertEquals(4, result.element(0, 1), 0);
        assertEquals(6, result.element(1, 0), 0);
        assertEquals(8, result.element(1, 1), 0);
        assertEquals(10, result.element(2, 0), 0);
        assertEquals(12, result.element(2, 1), 0);
        assertEquals(14, result.element(3, 0), 0);
        assertEquals(16, result.element(3, 1), 0);
    }

    @Test
    public void testScale4x3(){
        Matrix result = firstMat4x3.scale(2);
        assertEquals(2, result.element(0, 0), 0);
        assertEquals(4, result.element(0, 1), 0);
        assertEquals(6, result.element(0, 2), 0);
        assertEquals(8, result.element(1, 0), 0);
        assertEquals(10, result.element(1, 1), 0);
        assertEquals(12, result.element(1, 2), 0);
        assertEquals(14, result.element(2, 0), 0);
        assertEquals(16, result.element(2, 1), 0);
        assertEquals(18, result.element(2, 2), 0);
        assertEquals(20, result.element(3, 0), 0);
        assertEquals(22, result.element(3, 1), 0);
        assertEquals(24, result.element(3, 2), 0);
    }

    @Test
    public void testScale4x4(){
        Matrix result = firstMat4x4.scale(2);
        assertEquals(2, result.element(0, 0), 0);
        assertEquals(4, result.element(0, 1), 0);
        assertEquals(6, result.element(0, 2), 0);
        assertEquals(8, result.element(0, 3), 0);
        assertEquals(10, result.element(1, 0), 0);
        assertEquals(12, result.element(1, 1), 0);
        assertEquals(14, result.element(1, 2), 0);
        assertEquals(16, result.element(1, 3), 0);
        assertEquals(18, result.element(2, 0), 0);
        assertEquals(20, result.element(2, 1), 0);
        assertEquals(22, result.element(2, 2), 0);
        assertEquals(24, result.element(2, 3), 0);
        assertEquals(26, result.element(3, 0), 0);
        assertEquals(28, result.element(3, 1), 0);
        assertEquals(30, result.element(3, 2), 0);
        assertEquals(32, result.element(3, 3), 0);
    }

    @Test
    public void testScale4x5(){
        Matrix result = firstMat4x5.scale(2);
        assertEquals(2, result.element(0, 0), 0);
        assertEquals(4, result.element(0, 1), 0);
        assertEquals(6, result.element(0, 2), 0);
        assertEquals(8, result.element(0, 3), 0);
        assertEquals(10, result.element(0, 4), 0);
        assertEquals(12, result.element(1, 0), 0);
        assertEquals(14, result.element(1, 1), 0);
        assertEquals(16, result.element(1, 2), 0);
        assertEquals(18, result.element(1, 3), 0);
        assertEquals(20, result.element(1, 4), 0);
        assertEquals(22, result.element(2, 0), 0);
        assertEquals(24, result.element(2, 1), 0);
        assertEquals(26, result.element(2, 2), 0);
        assertEquals(28, result.element(2, 3), 0);
        assertEquals(30, result.element(2, 4), 0);
        assertEquals(32, result.element(3, 0), 0);
        assertEquals(34, result.element(3, 1), 0);
        assertEquals(36, result.element(3, 2), 0);
        assertEquals(38, result.element(3, 3), 0);
        assertEquals(40, result.element(3, 4), 0);
    }

    @Test
    public void testScale4x6(){
        Matrix result = firstMat4x6.scale(2);
        assertEquals(2, result.element(0, 0), 0);
        assertEquals(4, result.element(0, 1), 0);
        assertEquals(6, result.element(0, 2), 0);
        assertEquals(8, result.element(0, 3), 0);
        assertEquals(10, result.element(0, 4), 0);
        assertEquals(12, result.element(0, 5), 0);
        assertEquals(14, result.element(1, 0), 0);
        assertEquals(16, result.element(1, 1), 0);
        assertEquals(18, result.element(1, 2), 0);
        assertEquals(20, result.element(1, 3), 0);
        assertEquals(22, result.element(1, 4), 0);
        assertEquals(24, result.element(1, 5), 0);
        assertEquals(26, result.element(2, 0), 0);
        assertEquals(28, result.element(2, 1), 0);
        assertEquals(30, result.element(2, 2), 0);
        assertEquals(32, result.element(2, 3), 0);
        assertEquals(34, result.element(2, 4), 0);
        assertEquals(36, result.element(2, 5), 0);
        assertEquals(38, result.element(3, 0), 0);
        assertEquals(40, result.element(3, 1), 0);
        assertEquals(42, result.element(3, 2), 0);
        assertEquals(44, result.element(3, 3), 0);
        assertEquals(46, result.element(3, 4), 0);
        assertEquals(48, result.element(3, 5), 0);
    }

    @Test
    public void testScale5x2(){
        Matrix result = firstMat5x2.scale(2);
        assertEquals(2, result.element(0, 0), 0);
        assertEquals(4, result.element(0, 1), 0);
        assertEquals(6, result.element(1, 0), 0);
        assertEquals(8, result.element(1, 1), 0);
        assertEquals(10, result.element(2, 0), 0);
        assertEquals(12, result.element(2, 1), 0);
        assertEquals(14, result.element(3, 0), 0);
        assertEquals(16, result.element(3, 1), 0);
        assertEquals(18, result.element(4, 0), 0);
        assertEquals(20, result.element(4, 1), 0);
    }

    @Test
    public void testScale5x3(){
        Matrix result = firstMat5x3.scale(2);
        assertEquals(2, result.element(0, 0), 0);
        assertEquals(4, result.element(0, 1), 0);
        assertEquals(6, result.element(0, 2), 0);
        assertEquals(8, result.element(1, 0), 0);
        assertEquals(10, result.element(1, 1), 0);
        assertEquals(12, result.element(1, 2), 0);
        assertEquals(14, result.element(2, 0), 0);
        assertEquals(16, result.element(2, 1), 0);
        assertEquals(18, result.element(2, 2), 0);
        assertEquals(20, result.element(3, 0), 0);
        assertEquals(22, result.element(3, 1), 0);
        assertEquals(24, result.element(3, 2), 0);
        assertEquals(26, result.element(4, 0), 0);
        assertEquals(28, result.element(4, 1), 0);
        assertEquals(30, result.element(4, 2), 0);
    }

    @Test
    public void testScale5x4(){
        Matrix result = firstMat5x4.scale(2);
        assertEquals(2, result.element(0, 0), 0);
        assertEquals(4, result.element(0, 1), 0);
        assertEquals(6, result.element(0, 2), 0);
        assertEquals(8, result.element(0, 3), 0);
        assertEquals(10, result.element(1, 0), 0);
        assertEquals(12, result.element(1, 1), 0);
        assertEquals(14, result.element(1, 2), 0);
        assertEquals(16, result.element(1, 3), 0);
        assertEquals(18, result.element(2, 0), 0);
        assertEquals(20, result.element(2, 1), 0);
        assertEquals(22, result.element(2, 2), 0);
        assertEquals(24, result.element(2, 3), 0);
        assertEquals(26, result.element(3, 0), 0);
        assertEquals(28, result.element(3, 1), 0);
        assertEquals(30, result.element(3, 2), 0);
        assertEquals(32, result.element(3, 3), 0);
        assertEquals(34, result.element(4, 0), 0);
        assertEquals(36, result.element(4, 1), 0);
        assertEquals(38, result.element(4, 2), 0);
        assertEquals(40, result.element(4, 3), 0);
    }

    @Test
    public void testScale5x5(){
        Matrix result = firstMat5x5.scale(2);
        assertEquals(2, result.element(0, 0), 0);
        assertEquals(4, result.element(0, 1), 0);
        assertEquals(6, result.element(0, 2), 0);
        assertEquals(8, result.element(0, 3), 0);
        assertEquals(10, result.element(0, 4), 0);
        assertEquals(12, result.element(1, 0), 0);
        assertEquals(14, result.element(1, 1), 0);
        assertEquals(16, result.element(1, 2), 0);
        assertEquals(18, result.element(1, 3), 0);
        assertEquals(20, result.element(1, 4), 0);
        assertEquals(22, result.element(2, 0), 0);
        assertEquals(24, result.element(2, 1), 0);
        assertEquals(26, result.element(2, 2), 0);
        assertEquals(28, result.element(2, 3), 0);
        assertEquals(30, result.element(2, 4), 0);
        assertEquals(32, result.element(3, 0), 0);
        assertEquals(34, result.element(3, 1), 0);
        assertEquals(36, result.element(3, 2), 0);
        assertEquals(38, result.element(3, 3), 0);
        assertEquals(40, result.element(3, 4), 0);
        assertEquals(42, result.element(4, 0), 0);
        assertEquals(44, result.element(4, 1), 0);
        assertEquals(46, result.element(4, 2), 0);
        assertEquals(48, result.element(4, 3), 0);
        assertEquals(50, result.element(4, 4), 0);
    }

    @Test
    public void testScale5x6(){
        Matrix result = firstMat5x6.scale(2);
        assertEquals(2, result.element(0, 0), 0);
        assertEquals(4, result.element(0, 1), 0);
        assertEquals(6, result.element(0, 2), 0);
        assertEquals(8, result.element(0, 3), 0);
        assertEquals(10, result.element(0, 4), 0);
        assertEquals(12, result.element(0, 5), 0);
        assertEquals(14, result.element(1, 0), 0);
        assertEquals(16, result.element(1, 1), 0);
        assertEquals(18, result.element(1, 2), 0);
        assertEquals(20, result.element(1, 3), 0);
        assertEquals(22, result.element(1, 4), 0);
        assertEquals(24, result.element(1, 5), 0);
        assertEquals(26, result.element(2, 0), 0);
        assertEquals(28, result.element(2, 1), 0);
        assertEquals(30, result.element(2, 2), 0);
        assertEquals(32, result.element(2, 3), 0);
        assertEquals(34, result.element(2, 4), 0);
        assertEquals(36, result.element(2, 5), 0);
        assertEquals(38, result.element(3, 0), 0);
        assertEquals(40, result.element(3, 1), 0);
        assertEquals(42, result.element(3, 2), 0);
        assertEquals(44, result.element(3, 3), 0);
        assertEquals(46, result.element(3, 4), 0);
        assertEquals(48, result.element(3, 5), 0);
        assertEquals(50, result.element(4, 0), 0);
        assertEquals(52, result.element(4, 1), 0);
        assertEquals(54, result.element(4, 2), 0);
        assertEquals(56, result.element(4, 3), 0);
        assertEquals(58, result.element(4, 4), 0);
        assertEquals(60, result.element(4, 5), 0);
    }

    @Test
    public void testScale6x2(){
        Matrix result = firstMat6x2.scale(2);
        assertEquals(2, result.element(0, 0), 0);
        assertEquals(4, result.element(0, 1), 0);
        assertEquals(6, result.element(1, 0), 0);
        assertEquals(8, result.element(1, 1), 0);
        assertEquals(10, result.element(2, 0), 0);
        assertEquals(12, result.element(2, 1), 0);
        assertEquals(14, result.element(3, 0), 0);
        assertEquals(16, result.element(3, 1), 0);
        assertEquals(18, result.element(4, 0), 0);
        assertEquals(20, result.element(4, 1), 0);
        assertEquals(22, result.element(5, 0), 0);
        assertEquals(24, result.element(5, 1), 0);
    }

    @Test
    public void testScale6x3(){
        Matrix result = firstMat6x3.scale(2);
        assertEquals(2, result.element(0, 0), 0);
        assertEquals(4, result.element(0, 1), 0);
        assertEquals(6, result.element(0, 2), 0);
        assertEquals(8, result.element(1, 0), 0);
        assertEquals(10, result.element(1, 1), 0);
        assertEquals(12, result.element(1, 2), 0);
        assertEquals(14, result.element(2, 0), 0);
        assertEquals(16, result.element(2, 1), 0);
        assertEquals(18, result.element(2, 2), 0);
        assertEquals(20, result.element(3, 0), 0);
        assertEquals(22, result.element(3, 1), 0);
        assertEquals(24, result.element(3, 2), 0);
        assertEquals(26, result.element(4, 0), 0);
        assertEquals(28, result.element(4, 1), 0);
        assertEquals(30, result.element(4, 2), 0);
        assertEquals(32, result.element(5, 0), 0);
        assertEquals(34, result.element(5, 1), 0);
        assertEquals(36, result.element(5, 2), 0);
    }

    @Test
    public void testScale6x4(){
        Matrix result = firstMat6x4.scale(2);
        assertEquals(2, result.element(0, 0), 0);
        assertEquals(4, result.element(0, 1), 0);
        assertEquals(6, result.element(0, 2), 0);
        assertEquals(8, result.element(0, 3), 0);
        assertEquals(10, result.element(1, 0), 0);
        assertEquals(12, result.element(1, 1), 0);
        assertEquals(14, result.element(1, 2), 0);
        assertEquals(16, result.element(1, 3), 0);
        assertEquals(18, result.element(2, 0), 0);
        assertEquals(20, result.element(2, 1), 0);
        assertEquals(22, result.element(2, 2), 0);
        assertEquals(24, result.element(2, 3), 0);
        assertEquals(26, result.element(3, 0), 0);
        assertEquals(28, result.element(3, 1), 0);
        assertEquals(30, result.element(3, 2), 0);
        assertEquals(32, result.element(3, 3), 0);
        assertEquals(34, result.element(4, 0), 0);
        assertEquals(36, result.element(4, 1), 0);
        assertEquals(38, result.element(4, 2), 0);
        assertEquals(40, result.element(4, 3), 0);
        assertEquals(42, result.element(5, 0), 0);
        assertEquals(44, result.element(5, 1), 0);
        assertEquals(46, result.element(5, 2), 0);
        assertEquals(48, result.element(5, 3), 0);
    }

    @Test
    public void testScale6x5(){
        Matrix result = firstMat6x5.scale(2);
        assertEquals(2, result.element(0, 0), 0);
        assertEquals(4, result.element(0, 1), 0);
        assertEquals(6, result.element(0, 2), 0);
        assertEquals(8, result.element(0, 3), 0);
        assertEquals(10, result.element(0, 4), 0);
        assertEquals(12, result.element(1, 0), 0);
        assertEquals(14, result.element(1, 1), 0);
        assertEquals(16, result.element(1, 2), 0);
        assertEquals(18, result.element(1, 3), 0);
        assertEquals(20, result.element(1, 4), 0);
        assertEquals(22, result.element(2, 0), 0);
        assertEquals(24, result.element(2, 1), 0);
        assertEquals(26, result.element(2, 2), 0);
        assertEquals(28, result.element(2, 3), 0);
        assertEquals(30, result.element(2, 4), 0);
        assertEquals(32, result.element(3, 0), 0);
        assertEquals(34, result.element(3, 1), 0);
        assertEquals(36, result.element(3, 2), 0);
        assertEquals(38, result.element(3, 3), 0);
        assertEquals(40, result.element(3, 4), 0);
        assertEquals(42, result.element(4, 0), 0);
        assertEquals(44, result.element(4, 1), 0);
        assertEquals(46, result.element(4, 2), 0);
        assertEquals(48, result.element(4, 3), 0);
        assertEquals(50, result.element(4, 4), 0);
        assertEquals(52, result.element(5, 0), 0);
        assertEquals(54, result.element(5, 1), 0);
        assertEquals(56, result.element(5, 2), 0);
        assertEquals(58, result.element(5, 3), 0);
        assertEquals(60, result.element(5, 4), 0);
    }

    @Test
    public void testScale6x6(){
        Matrix result = firstMat6x6.scale(2);
        assertEquals(2, result.element(0, 0), 0);
        assertEquals(4, result.element(0, 1), 0);
        assertEquals(6, result.element(0, 2), 0);
        assertEquals(8, result.element(0, 3), 0);
        assertEquals(10, result.element(0, 4), 0);
        assertEquals(12, result.element(0, 5), 0);
        assertEquals(14, result.element(1, 0), 0);
        assertEquals(16, result.element(1, 1), 0);
        assertEquals(18, result.element(1, 2), 0);
        assertEquals(20, result.element(1, 3), 0);
        assertEquals(22, result.element(1, 4), 0);
        assertEquals(24, result.element(1, 5), 0);
        assertEquals(26, result.element(2, 0), 0);
        assertEquals(28, result.element(2, 1), 0);
        assertEquals(30, result.element(2, 2), 0);
        assertEquals(32, result.element(2, 3), 0);
        assertEquals(34, result.element(2, 4), 0);
        assertEquals(36, result.element(2, 5), 0);
        assertEquals(38, result.element(3, 0), 0);
        assertEquals(40, result.element(3, 1), 0);
        assertEquals(42, result.element(3, 2), 0);
        assertEquals(44, result.element(3, 3), 0);
        assertEquals(46, result.element(3, 4), 0);
        assertEquals(48, result.element(3, 5), 0);
        assertEquals(50, result.element(4, 0), 0);
        assertEquals(52, result.element(4, 1), 0);
        assertEquals(54, result.element(4, 2), 0);
        assertEquals(56, result.element(4, 3), 0);
        assertEquals(58, result.element(4, 4), 0);
        assertEquals(60, result.element(4, 5), 0);
        assertEquals(62, result.element(5, 0), 0);
        assertEquals(64, result.element(5, 1), 0);
        assertEquals(66, result.element(5, 2), 0);
        assertEquals(68, result.element(5, 3), 0);
        assertEquals(70, result.element(5, 4), 0);
        assertEquals(72, result.element(5, 5), 0);
    }

}
