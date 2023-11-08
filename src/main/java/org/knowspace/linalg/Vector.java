package org.knowspace.linalg;

public class Vector {

    protected double[] components;
    protected int dimension;

    public static final Vector X_AXIS = new Vector(1.0, 0.0, 0.0);
    public static final Vector Y_AXIS = new Vector(0.0, 1.0, 0.0);
    public static final Vector Z_AXIS = new Vector(0.0, 0.0, 1.0);

    public Vector (){}

    public Vector(double el1, double el2){
        components = new double[2];
        components[0] = el1;
        components[1] = el2;
        dimension = 2;
    }

    public Vector(double el1, double el2, double el3){
        components = new double[3];
        components[0] = el1;
        components[1] = el2;
        components[2] = el3;
        dimension = 3;
    }

    public Vector(double el1, double el2, double el3, double el4){
        components = new double[4];
        components[0] = el1;
        components[1] = el2;
        components[2] = el3;
        components[3] = el4;
        dimension = 4;
    }

    public Vector(double el1, double el2, double el3, double el4, double el5){
        components = new double[5];
        components[0] = el1;
        components[1] = el2;
        components[2] = el3;
        components[3] = el4;
        components[4] = el5;
        dimension = 5;
    }

    public Vector(double el1, double el2, double el3, double el4, double el5, double el6){
        components = new double[6];
        components[0] = el1;
        components[1] = el2;
        components[2] = el3;
        components[3] = el4;
        components[4] = el5;
        components[5] = el6;
        dimension = 6;
    }

    public double getElement(int index){
        return components[index];
    }

    public boolean dimensionsEqual(Vector vec){
        return dimension == vec.dimension;
    }

    public static Matrix getRotationMatrix(Vector axis, double angle){
        Vector unitAx = axis.getNormalizedVector();
        double ux = unitAx.getElement(0);
        double uy = unitAx.getElement(1);
        double uz = unitAx.getElement(2);
        double c = Math.cos(angle);
        double s = Math.sin(angle);
        double cdiff = 1 - c;

        double x1 = c + ux * ux * cdiff;
        double y1 = ux * uy * cdiff - uz * s;
        double z1 = ux * uz * cdiff + uy * s;
        double x2 = uy * ux * cdiff + uz * s;
        double y2 = c + uy * uy * cdiff;
        double z2 = uy * uz * cdiff - ux * s;
        double x3 = uz * ux * cdiff - uy * s;
        double y3 = uz * uy * cdiff + ux * s;
        double z3 = c + uz * uz * cdiff;

        Vector r1 = new Vector(x1, y1, z1);
        Vector r2 = new Vector(x2, y2, z2);
        Vector r3 = new Vector(x3, y3, z3);

        return new Matrix(r1, r2, r3);
    }
    public double getAngle(Vector vecToCompare){

        double firstMagnitude = getMagnitude();
        double secondMagnitude = vecToCompare.getMagnitude();

        // Check for invalid inputs
        if(!dimensionsEqual(vecToCompare)){
            throw new ArrayIndexOutOfBoundsException("Dimensions must be equal to perform vector angle calculation.");
        }
        else if(firstMagnitude == 0 || secondMagnitude == 0){
            throw new ArithmeticException("Cannot calculate angle with a zero vector.");
        }
        else if(firstMagnitude == Double.NaN || secondMagnitude == Double.NaN){
            throw new ArithmeticException("Cannot calculate angle with a NaN vector.");
        }
        else if(dimension > 3 || vecToCompare.dimension > 3){
            throw new ArrayIndexOutOfBoundsException("Dimensions must be less than or equal to 3 to perform vector angle calculation.");
        }

        // Calculate the cosine of the angle
        double cosTheta = getDotProduct(vecToCompare) / (getMagnitude() * vecToCompare.getMagnitude());
        
        // Adjust for possible numerical inaccuracy that might push the value slightly out of range for acos
        cosTheta = Math.min(1.0, Math.max(-1.0, cosTheta));

        // Calculate the angle in radians
        return Math.acos(cosTheta);
    }

    public Vector getSummationVector(Vector vecToAdd){
        
        Vector result = new Vector();

        if(!dimensionsEqual(vecToAdd)){
            throw new ArrayIndexOutOfBoundsException("Dimensions must be equal to perform vector addition.");
        }

        switch(dimension){
            case 2:
                result = addVector2D(vecToAdd);
                break;
            case 3:
                result = addVector3D(vecToAdd);
                break;
            case 4:
                result = addVector4D(vecToAdd);
                break;
            case 5:
                result = addVector5D(vecToAdd);
                break;
            case 6:
                result = addVector6D(vecToAdd);
                break;
        }

        return result;
    }

    public Vector getDifferenceVector(Vector vecToSubtract){

        Vector result = new Vector();

        if(!dimensionsEqual(vecToSubtract)){
            throw new ArrayIndexOutOfBoundsException("Dimensions must be equal to perform vector subtraction.");
        }

        switch(dimension){
            case 2:
                result = subtractVector2D(vecToSubtract);
                break;
            case 3:
                result = subtractVector3D(vecToSubtract);
                break;
            case 4:
                result = subtractVector4D(vecToSubtract);
                break;
            case 5:
                result = subtractVector5D(vecToSubtract);
                break;
            case 6:
                result = subtractVector6D(vecToSubtract);
                break;
        }

        return result;
    }

    public double getDotProduct(Vector vecToDot){

        double result = Double.NaN;

        if(!dimensionsEqual(vecToDot)){
            throw new ArrayIndexOutOfBoundsException("Dimensions must be equal to perform vector dot product.");
        }

        switch(dimension){
            case 2:
                result = getDotVector2D(vecToDot);
                break;
            case 3:
                result = getDotVector3D(vecToDot);
                break;
            case 4:
                result = getDotVector4D(vecToDot);
                break;
            case 5:
                result = getDotVector5D(vecToDot);
                break;
            case 6:
                result = getDotVector6D(vecToDot);
                break;
        }

        return result;
    }

    public double getMagnitude(){
        
        double result = Double.NaN;
        
        switch(dimension){
            case 2:
                result = getMagnitude2D();
                break;
            case 3:
                result = getMagnitude3D();
                break;
            case 4:
                result = getMagnitude4D();
                break;
            case 5:
                result = getMagnitude5D();
                break;
            case 6:
                result = getMagnitude6D();
                break;
            
        }

        return result;
    }

    public Vector getScaledVector(double scalar){

        Vector result = new Vector();

        switch(dimension){
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

    public Vector getNormalizedVector(){

        Vector result = new Vector();

        switch(dimension){
            case 2:
                result = scale2D(1/getMagnitude2D());
                break;
            case 3:
                result = scale3D(1/getMagnitude3D());
                break;
            case 4:
                result = scale4D(1/getMagnitude4D());
                break;
            case 5:
                result = scale5D(1/getMagnitude5D());
                break;
            case 6:
                result = scale6D(1/getMagnitude6D());
                break;
        }

        return result;
    }

    private Vector addVector2D(Vector vec2D){
        return new Vector(
            components[0]+vec2D.components[0], 
            components[1]+vec2D.components[1]
        );
    }

    private Vector addVector3D(Vector vec3D){
        return new Vector(
            components[0]+vec3D.components[0], 
            components[1]+vec3D.components[1], 
            components[2]+vec3D.components[2]
        );
    }

    private Vector addVector4D(Vector vec4D){
        return new Vector(
            components[0]+vec4D.components[0], 
            components[1]+vec4D.components[1], 
            components[2]+vec4D.components[2], 
            components[3]+vec4D.components[3]
        );
    }

    private Vector addVector5D(Vector vec5D){
        return new Vector(
            components[0]+vec5D.components[0], 
            components[1]+vec5D.components[1], 
            components[2]+vec5D.components[2], 
            components[3]+vec5D.components[3], 
            components[4]+vec5D.components[4]
        );
    }

    private Vector addVector6D(Vector vec6D){
        return new Vector(
            components[0]+vec6D.components[0], 
            components[1]+vec6D.components[1], 
            components[2]+vec6D.components[2], 
            components[3]+vec6D.components[3], 
            components[4]+vec6D.components[4], 
            components[5]+vec6D.components[5]
        );
    }

    private Vector subtractVector2D(Vector vec2D){
        return new Vector(
            components[0]-vec2D.components[0], 
            components[1]-vec2D.components[1]
        );
    }

    private Vector subtractVector3D(Vector vec3D){
        return new Vector(
            components[0]-vec3D.components[0], 
            components[1]-vec3D.components[1], 
            components[2]-vec3D.components[2]
        );
    }

    private Vector subtractVector4D(Vector vec4D){
        return new Vector(
            components[0]-vec4D.components[0], 
            components[1]-vec4D.components[1], 
            components[2]-vec4D.components[2], 
            components[3]-vec4D.components[3]
        );
    }

    private Vector subtractVector5D(Vector vec5D){
        return new Vector(
            components[0]-vec5D.components[0], 
            components[1]-vec5D.components[1], 
            components[2]-vec5D.components[2], 
            components[3]-vec5D.components[3], 
            components[4]-vec5D.components[4]
        );
    }

    private Vector subtractVector6D(Vector vec6D){
        return new Vector(
            components[0]-vec6D.components[0], 
            components[1]-vec6D.components[1], 
            components[2]-vec6D.components[2], 
            components[3]-vec6D.components[3], 
            components[4]-vec6D.components[4], 
            components[5]-vec6D.components[5]
        );
    }

    private double getDotVector2D(Vector vec2D){
        return components[0]*vec2D.components[0] 
        + components[1]*vec2D.components[1];
    }

    private double getDotVector3D(Vector vec3D){
        return components[0]*vec3D.components[0] 
        + components[1]*vec3D.components[1] 
        + components[2]*vec3D.components[2];
    }

    private double getDotVector4D(Vector vec4D){
        return components[0]*vec4D.components[0] 
        + components[1]*vec4D.components[1] 
        + components[2]*vec4D.components[2] 
        + components[3]*vec4D.components[3];
    }

    private double getDotVector5D(Vector vec5D){
        return components[0]*vec5D.components[0] 
        + components[1]*vec5D.components[1] 
        + components[2]*vec5D.components[2] 
        + components[3]*vec5D.components[3] 
        + components[4]*vec5D.components[4];
    }   

    private double getDotVector6D(Vector vec6D){
        return components[0]*vec6D.components[0] 
        + components[1]*vec6D.components[1] 
        + components[2]*vec6D.components[2] 
        + components[3]*vec6D.components[3] 
        + components[4]*vec6D.components[4] 
        + components[5]*vec6D.components[5];
    }

    private double getMagnitude2D(){
        return Math.sqrt(
            components[0]*components[0]
            + components[1]*components[1]
        );
    }

    private double getMagnitude3D(){
        return Math.sqrt(
            components[0]*components[0]
            + components[1]*components[1]
            + components[2]*components[2]
        );
    }

    private double getMagnitude4D(){
        return Math.sqrt(
            components[0]*components[0]
            + components[1]*components[1]
            + components[2]*components[2]
            + components[3]*components[3]
        );
    }

    private double getMagnitude5D(){
        return Math.sqrt(
            components[0]*components[0]
            + components[1]*components[1]
            + components[2]*components[2]
            + components[3]*components[3]
            + components[4]*components[4]
        );
    }

    private double getMagnitude6D(){
        return Math.sqrt(
            components[0]*components[0]
            + components[1]*components[1]
            + components[2]*components[2]
            + components[3]*components[3]
            + components[4]*components[4]
            + components[5]*components[5]
        );
    }

    public Vector getCrossProduct(Vector vecToCross){

        if(vecToCross.dimension != 3 || dimension != 3){
            throw new ArrayIndexOutOfBoundsException("Dimensions must equal 3 to perform vector cross product.");
        }

        return new Vector(
            components[1]*vecToCross.components[2] - components[2]*vecToCross.components[1],
            components[2]*vecToCross.components[0] - components[0]*vecToCross.components[2],
            components[0]*vecToCross.components[1] - components[1]*vecToCross.components[0]
        );
    }

    private Vector scale2D(double scalar){
        return new Vector(
            components[0]*scalar,
            components[1]*scalar
        );
    }

    private Vector scale3D(double scalar){
        return new Vector(
            components[0]*scalar,
            components[1]*scalar,
            components[2]*scalar
        );
    }

    private Vector scale4D(double scalar){
        return new Vector(
            components[0]*scalar,
            components[1]*scalar,
            components[2]*scalar,
            components[3]*scalar
        );
    }

    private Vector scale5D(double scalar){
        return new Vector(
            components[0]*scalar,
            components[1]*scalar,
            components[2]*scalar,
            components[3]*scalar,
            components[4]*scalar
        );
    }

    private Vector scale6D(double scalar){
        return new Vector(
            components[0]*scalar,
            components[1]*scalar,
            components[2]*scalar,
            components[3]*scalar,
            components[4]*scalar,
            components[5]*scalar
        );
    }

}
