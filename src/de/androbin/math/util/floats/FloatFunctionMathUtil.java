package de.androbin.math.util.floats;

import static de.androbin.collection.util.FloatCollectionUtil.*;
import de.androbin.function.*;

public final class FloatFunctionMathUtil {
  private FloatFunctionMathUtil() {
  }
  
  public static float add( final int n, final IntToFloatFunction f ) {
    float p = 0;
    
    for ( int i = 0; i < n; i++ ) {
      p += f.applyAsFloat( i );
    }
    
    return p;
  }
  
  public static float[] add( final int n, final IntToFloatFunction f, final IntToFloatFunction g ) {
    return fill( new float[ n ], i -> f.applyAsFloat( i ) + g.applyAsFloat( i ) );
  }
  
  public static float avg( final int n, final IntToFloatFunction f ) {
    return add( n, f ) / n;
  }
  
  public static float mul( final int n, final IntToFloatFunction f ) {
    float p = 1;
    
    for ( int i = 0; i < n; i++ ) {
      p *= f.applyAsFloat( i );
    }
    
    return p;
  }
  
  public static float[] sub( final int n, final IntToFloatFunction f, final IntToFloatFunction g ) {
    return fill( new float[ n ], i -> f.applyAsFloat( i ) - g.applyAsFloat( i ) );
  }
}