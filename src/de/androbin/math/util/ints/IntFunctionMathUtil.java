package de.androbin.math.util.ints;

import static de.androbin.collection.util.IntegerCollectionUtil.*;
import java.util.function.*;

public final class IntFunctionMathUtil {
  private IntFunctionMathUtil() {
  }
  
  public static int add( final int n, final IntUnaryOperator f ) {
    int p = 0;
    
    for ( int i = 0; i < n; i++ ) {
      p += f.applyAsInt( i );
    }
    
    return p;
  }
  
  public static int[] add( final int n, final IntUnaryOperator f, final IntUnaryOperator g ) {
    return fill( new int[ n ], i -> f.applyAsInt( i ) + g.applyAsInt( i ) );
  }
  
  public static int avg( final int n, final IntUnaryOperator f ) {
    return add( n, f ) / n;
  }
  
  public static int mul( final int n, final IntUnaryOperator f ) {
    int p = 1;
    
    for ( int i = 0; i < n; i++ ) {
      p *= f.applyAsInt( i );
    }
    
    return p;
  }
  
  public static int[] sub( final int n, final IntUnaryOperator f, final IntUnaryOperator g ) {
    return fill( new int[ n ], i -> f.applyAsInt( i ) - g.applyAsInt( i ) );
  }
}