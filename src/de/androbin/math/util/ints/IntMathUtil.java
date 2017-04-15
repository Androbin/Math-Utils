package de.androbin.math.util.ints;

public final class IntMathUtil {
  private IntMathUtil() {
  }
  
  public static int bound( final int l, final int v, final int r ) {
    return v <= l ? l : v >= r ? r : v;
  }
  
  public static int min( final int ... i_ ) {
    int min = Integer.MAX_VALUE;
    
    for ( final int i : i_ ) {
      min = Math.min( min, i );
    }
    
    return min;
  }
  
  public static int max( final int ... i_ ) {
    int max = Integer.MIN_VALUE;
    
    for ( final int i : i_ ) {
      max = Math.max( max, i );
    }
    
    return max;
  }
  
  public static int mod( final int a, final int b ) {
    return shiftUp( a % b, b );
  }
  
  public static int modBin( final int a, final int b ) {
    return a & b - 1;
  }
  
  public static int rot( final int a, final int b, final int c ) {
    final int d = c % b;
    return modBin( a << d | ( a >> b - d ), 1 << b );
  }
  
  public static int shiftDown( final int a, final int b ) {
    return a >= b ? a - b : a;
  }
  
  public static int shiftUp( final int a, final int b ) {
    return a >= 0 ? a : a + b;
  }
  
  public static int sign( final int a ) {
    return ( a & 1 ) == 0 ? a >> 1 : -( a + 1 >> 1 );
  }
  
  public static int unsign( final int a ) {
    return a >= 0 ? a << 1 : ( -a << 1 ) - 1;
  }
}