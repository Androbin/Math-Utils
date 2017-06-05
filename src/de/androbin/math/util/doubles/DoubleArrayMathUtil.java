package de.androbin.math.util.doubles;

import static de.androbin.collection.util.DoubleCollectionUtil.*;
import static de.androbin.math.util.doubles.DoubleFunctionConcurrentMathUtil.*;
import static de.androbin.math.util.doubles.DoubleMathUtil.*;

public final class DoubleArrayMathUtil {
  private DoubleArrayMathUtil() {
  }
  
  public static double abs( final double ... point ) {
    return Math.sqrt( addParallel( point.length, i -> point[ i ] * point[ i ] ) );
  }
  
  public static double abs( final double[] point1, final double[] point2 ) {
    return abs( subAll( point1, point2 ) );
  }
  
  public static double[] addAll( final double[] a, final double[] b ) {
    return a == null ? b : b == null ? a
        : addAllParallel( Math.min( a.length, b.length ), func( a ), func( b ) );
  }
  
  public static double[] avgAll( final double[] a, final double[] b, final double c ) {
    return a == null ? b : b == null ? a
        : fillParallel( new double[ Math.min( a.length, b.length ) ],
            i -> avg( a[ i ], b[ i ], c ) );
  }
  
  public static double[] interAll( final double[] v1, final double p, final double[] v2 ) {
    return fillParallel( new double[ Math.min( v1.length, v2.length ) ],
        i -> inter( v1[ i ], p, v2[ i ] ) );
  }
  
  public static double[] negAll( final double[] values ) {
    return fillParallel( new double[ values.length ], i -> -values[ i ] );
  }
  
  public static double[] norm1( final double[] values ) {
    final double sum = addParallel( values.length, func( values ) );
    
    for ( int i = 0; i < values.length; i++ ) {
      values[ i ] /= sum;
    }
    
    return values;
  }
  
  public static double[] norm2( final double[] values ) {
    final double abs = abs( values );
    
    for ( int i = 0; i < values.length; i++ ) {
      values[ i ] /= abs;
    }
    
    return values;
  }
  
  public static double[] subAll( final double[] a, final double[] b ) {
    return a == null ? negAll( b ) : b == null ? a
        : subAllParallel( Math.min( a.length, b.length ), func( a ), func( b ) );
  }
}