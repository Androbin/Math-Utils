package de.androbin.math.util.ints;

import static de.androbin.collection.util.IntegerCollectionUtil.*;
import static de.androbin.math.util.ints.IntFunctionConcurrentMathUtil.*;

public final class IntArrayMathUtil {
  private IntArrayMathUtil() {
  }
  
  public static int[] addAll( final int[] a, final int[] b ) {
    return a == null ? b : b == null ? a
        : addAllParallel( Math.min( a.length, b.length ), func( a ), func( b ) );
  }
  
  public static int[] negAll( final int[] values ) {
    return fillParallel( new int[ values.length ], i -> -values[ i ] );
  }
  
  public static int[] subAll( final int[] a, final int[] b ) {
    return a == null ? negAll( b ) : b == null ? a
        : subAllParallel( Math.min( a.length, b.length ), func( a ), func( b ) );
  }
}