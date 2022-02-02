package de.androbin.math.util.doubles;

import static de.androbin.math.util.doubles.DoubleArrayMathUtil.*;
import static de.androbin.math.util.doubles.DoubleFunctionConcurrentMathUtil.*;

public final class DoubleVectorMathUtil {
  private DoubleVectorMathUtil() {
  }
  
  public static double[] cross3( final double[] a, final double[] b ) {
    return new double[] {
        a[ 1 ] * b[ 2 ] - a[ 2 ] * b[ 1 ],
        a[ 2 ] * b[ 0 ] - a[ 0 ] * b[ 2 ],
        a[ 0 ] * b[ 1 ] - a[ 1 ] * b[ 0 ],
    };
  }
  
  public static double phi( final double[] a, final double[] b ) {
    return Math.acos( scalar( a, b ) / ( abs( a ) * abs( b ) ) );
  }
  
  public static double scalar( final double[] a, final double[] b ) {
    return addParallel( Math.min( a.length, b.length ), i -> a[ i ] * b[ i ] );
  }
}