package de.androbin.math.util.doubles;

import static de.androbin.collection.util.DoubleCollectionUtil.*;
import java.util.function.*;
import java.util.stream.*;

public final class DoubleFunctionConcurrentMathUtil {
  private DoubleFunctionConcurrentMathUtil() {
  }
  
  public static double addParallel( final int n, final IntToDoubleFunction f ) {
    return IntStream.range( 0, n ).mapToDouble( f ).sum();
  }
  
  public static double[] addAllParallel( final int n, final IntToDoubleFunction f,
      final IntToDoubleFunction g ) {
    return fillParallel( new double[ n ], i -> f.applyAsDouble( i ) + g.applyAsDouble( i ) );
  }
  
  public static double[] subAllParallel( final int n, final IntToDoubleFunction f,
      final IntToDoubleFunction g ) {
    return fillParallel( new double[ n ], i -> f.applyAsDouble( i ) - g.applyAsDouble( i ) );
  }
}