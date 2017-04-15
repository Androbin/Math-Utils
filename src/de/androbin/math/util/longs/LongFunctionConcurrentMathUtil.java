package de.androbin.math.util.longs;

import static de.androbin.collection.util.LongCollectionUtil.*;
import java.util.function.*;
import java.util.stream.*;

public final class LongFunctionConcurrentMathUtil {
  private LongFunctionConcurrentMathUtil() {
  }
  
  public static long addParallel( final int n, final IntToLongFunction f ) {
    return IntStream.range( 0, n ).mapToLong( f ).sum();
  }
  
  public static long[] addAllParallel( final int n, final IntToLongFunction f,
      final IntToLongFunction g ) {
    return fillParallel( new long[ n ], i -> f.applyAsLong( i ) + g.applyAsLong( i ) );
  }
  
  public static long[] subAllParallel( final int n, final IntToLongFunction f,
      final IntToLongFunction g ) {
    return fillParallel( new long[ n ], i -> f.applyAsLong( i ) - g.applyAsLong( i ) );
  }
}