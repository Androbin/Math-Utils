package de.androbin.math.util.doubles;

public final class DoubleMathUtil {
  private DoubleMathUtil() {
  }
  
  public static double avg( final double a, final double b, final double c ) {
    return b + ( a - b ) / Math.exp( Math.abs( a - b ) * c );
  }
  
  public static double bound( final double l, final double v, final double r ) {
    return v <= l ? l : v >= r ? r : v;
  }
  
  public static long floor( final double d ) {
    return d >= 0.0 ? (long) d : (long) d - 1;
  }
  
  public static double inter( final double l, final double p, final double r ) {
    return l + p * ( r - l );
  }
  
  public static double max( final double a, final double b ) {
    return a >= b ? a : b;
  }
  
  public static double min( final double a, final double b ) {
    return a <= b ? a : b;
  }
  
  public static double mod( final double a, final double b ) {
    return shiftUp( a % b, b );
  }
  
  public static double shiftDown( final double a, final double b ) {
    return a >= b ? a - b : a;
  }
  
  public static double shiftUp( final double a, final double b ) {
    return a >= 0.0 ? a : a + b;
  }
}