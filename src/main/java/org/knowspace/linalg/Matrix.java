package org.knowspace.linalg;

public class Matrix {

    protected int numberOfRows;
    protected int numberOfColumns;
    protected Vector[] rows;
    protected int[] dimension;

    public Matrix(){};

    public Matrix(Vector r1, Vector r2){
        if(!r1.dimensionsEqual(r2)){
            throw new ArrayIndexOutOfBoundsException("All rows must be of equal dimension when creating a matrix.");
        }
        rows = new Vector[] {r1, r2};
        numberOfColumns = r1.dimension;
        numberOfRows = 2;
        dimension = new int[] {numberOfRows, numberOfColumns};
    }
    
    public Matrix(Vector r1, Vector r2, Vector r3){
        if(!r1.dimensionsEqual(r2) || !r2.dimensionsEqual(r3)){
            throw new ArrayIndexOutOfBoundsException("All rows must be of equal dimension when creating a matrix.");
        }
        rows = new Vector[] {r1, r2, r3};
        numberOfColumns = r1.dimension;
        numberOfRows = 3;
        dimension = new int[] {numberOfRows, numberOfColumns};
    }

    public Matrix(Vector r1, Vector r2, Vector r3, Vector r4){
        if(!r1.dimensionsEqual(r2) || !r2.dimensionsEqual(r3) || !r3.dimensionsEqual(r4)){
            throw new ArrayIndexOutOfBoundsException("All rows must be of equal dimension when creating a matrix.");
        }
        rows = new Vector[] {r1, r2, r3, r4};
        numberOfColumns = r1.dimension;
        numberOfRows = 4;
        dimension = new int[] {numberOfRows, numberOfColumns};
    }

    public Matrix(Vector r1, Vector r2, Vector r3, Vector r4, Vector r5){
        if(!r1.dimensionsEqual(r2) || !r2.dimensionsEqual(r3) || !r3.dimensionsEqual(r4) || !r4.dimensionsEqual(r5)){
            throw new ArrayIndexOutOfBoundsException("All rows must be of equal dimension when creating a matrix.");
        }
        rows = new Vector[] {r1, r2, r3, r4, r5};
        numberOfColumns = r1.dimension;
        numberOfRows = 5;
        dimension = new int[] {numberOfRows, numberOfColumns};
    }

    public Matrix(Vector r1, Vector r2, Vector r3, Vector r4, Vector r5, Vector r6){
        if(!r1.dimensionsEqual(r2) || !r2.dimensionsEqual(r3) || !r3.dimensionsEqual(r4) || !r4.dimensionsEqual(r5) || !r5.dimensionsEqual(r6)){
            throw new ArrayIndexOutOfBoundsException("All rows must be of equal dimension when creating a matrix.");
        }
        rows = new Vector[] {r1, r2, r3, r4, r5, r6};
        numberOfColumns = r1.dimension;
        numberOfRows = 6;
        dimension = new int[] {numberOfRows, numberOfColumns};
    }

    public int[] getDimension(){
        return dimension;
    }

    public boolean canMultiplyVector(Vector vec){
        return numberOfColumns == vec.dimension;
    }

    public boolean canMultiplyMatrix(Matrix mat){
        return numberOfColumns == mat.numberOfRows;
    }

    public boolean dimensionsEqual(Matrix mat){
        return mat.numberOfColumns == numberOfColumns && mat.numberOfRows == numberOfRows;
    }

    public Vector getProductVector(Vector vec){
        if(!canMultiplyVector(vec)){
            String msg = "Number of matrix columns must be equal to vector dimension when multiplying.";
            throw new ArrayIndexOutOfBoundsException(msg);
        }
        Vector result = new Vector();
        switch(numberOfRows){
            case 2:
                result = new Vector(
                    rows[0].getDotProduct(vec), 
                    rows[1].getDotProduct(vec)
                );
                break;
            case 3:
                result = new Vector(
                    rows[0].getDotProduct(vec),
                    rows[1].getDotProduct(vec),
                    rows[2].getDotProduct(vec)
                );
                break;
            case 4:
                result = new Vector(
                    rows[0].getDotProduct(vec),
                    rows[1].getDotProduct(vec),
                    rows[2].getDotProduct(vec),
                    rows[3].getDotProduct(vec)
                );
                break;
            case 5:
                result = new Vector(
                    rows[0].getDotProduct(vec),
                    rows[1].getDotProduct(vec),
                    rows[2].getDotProduct(vec),
                    rows[3].getDotProduct(vec),
                    rows[4].getDotProduct(vec)
                );
                break;
            case 6:
                result = new Vector(
                    rows[0].getDotProduct(vec),
                    rows[1].getDotProduct(vec),
                    rows[2].getDotProduct(vec),
                    rows[3].getDotProduct(vec),
                    rows[4].getDotProduct(vec),
                    rows[5].getDotProduct(vec)
                );
                break;
        }
        return result;
    }

    public Vector getColumnVector(int col){
        Vector result = new Vector();
        switch(numberOfRows){
            case 2:
                result = getColumn2D(col);
                break;
            case 3:
                result = getColumn3D(col);
                break;
            case 4:
                result = getColumn4D(col);
                break;
            case 5:
                result = getColumn5D(col);
                break;
            case 6:
                result = getColumn6D(col);
                break;
        }
        return result;
    }

    public Matrix getTranspose(){
        Matrix result = new Matrix();
        switch(numberOfColumns){
            case 2:
                result = new Matrix(
                    getColumnVector(0),
                    getColumnVector(1)
                );
                break;
            case 3:
                result = new Matrix(
                    getColumnVector(0),
                    getColumnVector(1),
                    getColumnVector(2)
                );
                break;
            case 4:
                result = new Matrix(
                    getColumnVector(0),
                    getColumnVector(1),
                    getColumnVector(2),
                    getColumnVector(3)
                );
                break;
            case 5:
                result = new Matrix(
                    getColumnVector(0),
                    getColumnVector(1),
                    getColumnVector(2),
                    getColumnVector(3),
                    getColumnVector(4)
                );
                break;
            case 6:
                result = new Matrix(
                    getColumnVector(0),
                    getColumnVector(1),
                    getColumnVector(2),
                    getColumnVector(3),
                    getColumnVector(4),
                    getColumnVector(5)
                );
                break;
        }
            
        return result;

    }

    public Matrix getSummationMatrix(Matrix mat){
        Matrix result = new Matrix();
        if(!dimensionsEqual(mat)){
            String msg = "Dimensions must be equal to add matrices.";
            throw new ArrayIndexOutOfBoundsException(msg);
        }
        switch(numberOfRows){
            case 2:
                result = add2D(mat);
                break;
            case 3:
                result = add3D(mat);
                break;
            case 4:
                result = add4D(mat);
                break;
            case 5:
                result = add5D(mat);
                break;
            case 6:
                result = add6D(mat);
                break;
        }
        return result;
    }

    public Matrix getDifferenceMatrix(Matrix mat){
        Matrix result = new Matrix();
        if(!dimensionsEqual(mat)){
            String msg = "Dimensions must be equal to subtract matrices.";
            throw new ArrayIndexOutOfBoundsException(msg);
        }
        switch(numberOfRows){
            case 2:
                result = subract2D(mat);
                break;
            case 3:
                result = subract3D(mat);
                break;
            case 4:
                result = subract4D(mat);
                break;
            case 5:
                result = subract5D(mat);
                break;
            case 6:
                result = subract6D(mat);
                break;
        }
        return result;
    }

    public Matrix getScaledMatrix(double scalar){
        Matrix result = new Matrix();
        switch(numberOfRows){
            case 2:
                result = scale2D(scalar);
                break;
            case 3:
                result = scale3D(scalar);
                break;
            case 4:
                result = scale4D(scalar);
                break;
            case 5:
                result = scale5D(scalar);
                break;
            case 6:
                result = scale6D(scalar);
                break;
        }
        return result;
    }

    public double getElement(int row, int col){
        return rows[row].getElement(col);
    }

    private Matrix add2D(Matrix mat){
        return new Matrix(
            rows[0].getSummationVector(mat.rows[0]),
            rows[1].getSummationVector(mat.rows[1])
        );
    }
    private Matrix add3D(Matrix mat){
        return new Matrix(
            rows[0].getSummationVector(mat.rows[0]),
            rows[1].getSummationVector(mat.rows[1]),
            rows[2].getSummationVector(mat.rows[2])
        );
    }
    private Matrix add4D(Matrix mat){
        return new Matrix(
            rows[0].getSummationVector(mat.rows[0]),
            rows[1].getSummationVector(mat.rows[1]),
            rows[2].getSummationVector(mat.rows[2]),
            rows[3].getSummationVector(mat.rows[3])
        );
    }
    private Matrix add5D(Matrix mat){
        return new Matrix(
            rows[0].getSummationVector(mat.rows[0]),
            rows[1].getSummationVector(mat.rows[1]),
            rows[2].getSummationVector(mat.rows[2]),
            rows[3].getSummationVector(mat.rows[3]),
            rows[4].getSummationVector(mat.rows[4])
        );
    }
    private Matrix add6D(Matrix mat){
        return new Matrix(
            rows[0].getSummationVector(mat.rows[0]),
            rows[1].getSummationVector(mat.rows[1]),
            rows[2].getSummationVector(mat.rows[2]),
            rows[3].getSummationVector(mat.rows[3]),
            rows[4].getSummationVector(mat.rows[4]),
            rows[5].getSummationVector(mat.rows[5])
        );
    }

    private Vector getColumn2D(int col){
        return new Vector(
            rows[0].getElement(col), 
            rows[1].getElement(col)
        );
    }

    private Vector getColumn3D(int col){
        return new Vector(
            rows[0].getElement(col),
            rows[1].getElement(col),
            rows[2].getElement(col)
        );
    }

    private Vector getColumn4D(int col){
        return new Vector(
            rows[0].getElement(col),
            rows[1].getElement(col),
            rows[2].getElement(col),
            rows[3].getElement(col)
        );
    }

    private Vector getColumn5D(int col){
        return new Vector(
            rows[0].getElement(col),
            rows[1].getElement(col),
            rows[2].getElement(col),
            rows[3].getElement(col),
            rows[4].getElement(col)
        );
    }

    private Vector getColumn6D(int col){
        return new Vector(
            rows[0].getElement(col),
            rows[1].getElement(col),
            rows[2].getElement(col),
            rows[3].getElement(col),
            rows[4].getElement(col),
            rows[5].getElement(col)
        );
    }
 
    private Matrix subract2D(Matrix mat){
        return new Matrix(
            rows[0].getDifferenceVector(mat.rows[0]),
            rows[1].getDifferenceVector(mat.rows[1])
        );
    }

    private Matrix subract3D(Matrix mat){
        return new Matrix(
            rows[0].getDifferenceVector(mat.rows[0]),
            rows[1].getDifferenceVector(mat.rows[1]),
            rows[2].getDifferenceVector(mat.rows[2])
        );
    }

    private Matrix subract4D(Matrix mat){
        return new Matrix(
            rows[0].getDifferenceVector(mat.rows[0]),
            rows[1].getDifferenceVector(mat.rows[1]),
            rows[2].getDifferenceVector(mat.rows[2]),
            rows[3].getDifferenceVector(mat.rows[3])
        );
    }

    private Matrix subract5D(Matrix mat){
        return new Matrix(
            rows[0].getDifferenceVector(mat.rows[0]),
            rows[1].getDifferenceVector(mat.rows[1]),
            rows[2].getDifferenceVector(mat.rows[2]),
            rows[3].getDifferenceVector(mat.rows[3]),
            rows[4].getDifferenceVector(mat.rows[4])
        );
    }

    private Matrix subract6D(Matrix mat){
        return new Matrix(
            rows[0].getDifferenceVector(mat.rows[0]),
            rows[1].getDifferenceVector(mat.rows[1]),
            rows[2].getDifferenceVector(mat.rows[2]),
            rows[3].getDifferenceVector(mat.rows[3]),
            rows[4].getDifferenceVector(mat.rows[4]),
            rows[5].getDifferenceVector(mat.rows[5])
        );
    }

    private Matrix scale2D(double scalar){
        return new Matrix(
            rows[0].getScaledVector(scalar),
            rows[1].getScaledVector(scalar)
        );
    }

    private Matrix scale3D(double scalar){
        return new Matrix(
            rows[0].getScaledVector(scalar),
            rows[1].getScaledVector(scalar),
            rows[2].getScaledVector(scalar)
        );
    }

    private Matrix scale4D(double scalar){
        return new Matrix(
            rows[0].getScaledVector(scalar),
            rows[1].getScaledVector(scalar),
            rows[2].getScaledVector(scalar),
            rows[3].getScaledVector(scalar)
        );
    }

    private Matrix scale5D(double scalar){
        return new Matrix(
            rows[0].getScaledVector(scalar),
            rows[1].getScaledVector(scalar),
            rows[2].getScaledVector(scalar),
            rows[3].getScaledVector(scalar),
            rows[4].getScaledVector(scalar)
        );
    }

    private Matrix scale6D(double scalar){
        return new Matrix(
            rows[0].getScaledVector(scalar),
            rows[1].getScaledVector(scalar),
            rows[2].getScaledVector(scalar),
            rows[3].getScaledVector(scalar),
            rows[4].getScaledVector(scalar),
            rows[5].getScaledVector(scalar)
        );
    }

}
