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

    public int[] dimension(){
        return dimension;
    }

    public boolean canMultiply(Vector vec){
        return numberOfColumns == vec.dimension;
    }

    public boolean canMultiply(Matrix mat){
        return numberOfColumns == mat.numberOfRows;
    }

    public boolean dimensionsEqual(Matrix mat){
        return mat.numberOfColumns == numberOfColumns && mat.numberOfRows == numberOfRows;
    }

    public Vector multiply(Vector vec){
        if(!canMultiply(vec)){
            String msg = "Number of matrix columns must be equal to vector dimension when multiplying.";
            throw new ArrayIndexOutOfBoundsException(msg);
        }
        Vector result = new Vector();
        switch(numberOfRows){
            case 2:
                result = new Vector(
                    rows[0].dot(vec), 
                    rows[1].dot(vec)
                );
                break;
            case 3:
                result = new Vector(
                    rows[0].dot(vec),
                    rows[1].dot(vec),
                    rows[2].dot(vec)
                );
                break;
            case 4:
                result = new Vector(
                    rows[0].dot(vec),
                    rows[1].dot(vec),
                    rows[2].dot(vec),
                    rows[3].dot(vec)
                );
                break;
            case 5:
                result = new Vector(
                    rows[0].dot(vec),
                    rows[1].dot(vec),
                    rows[2].dot(vec),
                    rows[3].dot(vec),
                    rows[4].dot(vec)
                );
                break;
            case 6:
                result = new Vector(
                    rows[0].dot(vec),
                    rows[1].dot(vec),
                    rows[2].dot(vec),
                    rows[3].dot(vec),
                    rows[4].dot(vec),
                    rows[5].dot(vec)
                );
                break;
        }
        return result;
    }

    public Vector column(int col){
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

    public Matrix transpose(){
        Matrix result = new Matrix();
        switch(numberOfColumns){
            case 2:
                result = new Matrix(
                    column(0),
                    column(1)
                );
                break;
            case 3:
                result = new Matrix(
                    column(0),
                    column(1),
                    column(2)
                );
                break;
            case 4:
                result = new Matrix(
                    column(0),
                    column(1),
                    column(2),
                    column(3)
                );
                break;
            case 5:
                result = new Matrix(
                    column(0),
                    column(1),
                    column(2),
                    column(3),
                    column(4)
                );
                break;
            case 6:
                result = new Matrix(
                    column(0),
                    column(1),
                    column(2),
                    column(3),
                    column(4),
                    column(5)
                );
                break;
        }
            
        return result;

    }

    public Matrix plus(Matrix mat){
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

    public Matrix minus(Matrix mat){
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

    public Matrix scale(double scalar){
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

    public double element(int row, int col){
        return rows[row].element(col);
    }

    private Matrix add2D(Matrix mat){
        return new Matrix(
            rows[0].plus(mat.rows[0]),
            rows[1].plus(mat.rows[1])
        );
    }
    private Matrix add3D(Matrix mat){
        return new Matrix(
            rows[0].plus(mat.rows[0]),
            rows[1].plus(mat.rows[1]),
            rows[2].plus(mat.rows[2])
        );
    }
    private Matrix add4D(Matrix mat){
        return new Matrix(
            rows[0].plus(mat.rows[0]),
            rows[1].plus(mat.rows[1]),
            rows[2].plus(mat.rows[2]),
            rows[3].plus(mat.rows[3])
        );
    }
    private Matrix add5D(Matrix mat){
        return new Matrix(
            rows[0].plus(mat.rows[0]),
            rows[1].plus(mat.rows[1]),
            rows[2].plus(mat.rows[2]),
            rows[3].plus(mat.rows[3]),
            rows[4].plus(mat.rows[4])
        );
    }
    private Matrix add6D(Matrix mat){
        return new Matrix(
            rows[0].plus(mat.rows[0]),
            rows[1].plus(mat.rows[1]),
            rows[2].plus(mat.rows[2]),
            rows[3].plus(mat.rows[3]),
            rows[4].plus(mat.rows[4]),
            rows[5].plus(mat.rows[5])
        );
    }

    private Vector getColumn2D(int col){
        return new Vector(
            rows[0].element(col), 
            rows[1].element(col)
        );
    }

    private Vector getColumn3D(int col){
        return new Vector(
            rows[0].element(col),
            rows[1].element(col),
            rows[2].element(col)
        );
    }

    private Vector getColumn4D(int col){
        return new Vector(
            rows[0].element(col),
            rows[1].element(col),
            rows[2].element(col),
            rows[3].element(col)
        );
    }

    private Vector getColumn5D(int col){
        return new Vector(
            rows[0].element(col),
            rows[1].element(col),
            rows[2].element(col),
            rows[3].element(col),
            rows[4].element(col)
        );
    }

    private Vector getColumn6D(int col){
        return new Vector(
            rows[0].element(col),
            rows[1].element(col),
            rows[2].element(col),
            rows[3].element(col),
            rows[4].element(col),
            rows[5].element(col)
        );
    }
 
    private Matrix subract2D(Matrix mat){
        return new Matrix(
            rows[0].minus(mat.rows[0]),
            rows[1].minus(mat.rows[1])
        );
    }

    private Matrix subract3D(Matrix mat){
        return new Matrix(
            rows[0].minus(mat.rows[0]),
            rows[1].minus(mat.rows[1]),
            rows[2].minus(mat.rows[2])
        );
    }

    private Matrix subract4D(Matrix mat){
        return new Matrix(
            rows[0].minus(mat.rows[0]),
            rows[1].minus(mat.rows[1]),
            rows[2].minus(mat.rows[2]),
            rows[3].minus(mat.rows[3])
        );
    }

    private Matrix subract5D(Matrix mat){
        return new Matrix(
            rows[0].minus(mat.rows[0]),
            rows[1].minus(mat.rows[1]),
            rows[2].minus(mat.rows[2]),
            rows[3].minus(mat.rows[3]),
            rows[4].minus(mat.rows[4])
        );
    }

    private Matrix subract6D(Matrix mat){
        return new Matrix(
            rows[0].minus(mat.rows[0]),
            rows[1].minus(mat.rows[1]),
            rows[2].minus(mat.rows[2]),
            rows[3].minus(mat.rows[3]),
            rows[4].minus(mat.rows[4]),
            rows[5].minus(mat.rows[5])
        );
    }

    private Matrix scale2D(double scalar){
        return new Matrix(
            rows[0].scale(scalar),
            rows[1].scale(scalar)
        );
    }

    private Matrix scale3D(double scalar){
        return new Matrix(
            rows[0].scale(scalar),
            rows[1].scale(scalar),
            rows[2].scale(scalar)
        );
    }

    private Matrix scale4D(double scalar){
        return new Matrix(
            rows[0].scale(scalar),
            rows[1].scale(scalar),
            rows[2].scale(scalar),
            rows[3].scale(scalar)
        );
    }

    private Matrix scale5D(double scalar){
        return new Matrix(
            rows[0].scale(scalar),
            rows[1].scale(scalar),
            rows[2].scale(scalar),
            rows[3].scale(scalar),
            rows[4].scale(scalar)
        );
    }

    private Matrix scale6D(double scalar){
        return new Matrix(
            rows[0].scale(scalar),
            rows[1].scale(scalar),
            rows[2].scale(scalar),
            rows[3].scale(scalar),
            rows[4].scale(scalar),
            rows[5].scale(scalar)
        );
    }

}
