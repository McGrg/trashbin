package com.company;

/**
 * Created by oracle on 02.12.2016.
 */
public class Vector {
    private int x;
    private int y;
    private int z;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public int lenght;

    public Vector(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Vector(Vector vec){
        this(vec.x, vec.y, vec.z);
    }

    public Vector(){
        this(0, 0, 0);
    }

    public void  print(){
        System.out.println("x: " + x+ "; y: " +  y+"; z: " +  z);
    }

    Vector multiply (Vector vec1, Vector vec2){
        this.x = vec1.x*vec2.x;
        this.y = vec1.y*vec2.y;
        this.z = vec1.z*vec2.z;
        return this;
    }
}
