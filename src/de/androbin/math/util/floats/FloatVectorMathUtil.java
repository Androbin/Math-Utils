package de.androbin.math.util.floats;

import static de.androbin.math.util.floats.FloatArrayMathUtil.*;
import static de.androbin.math.util.floats.FloatFunctionMathUtil.*;

public final class FloatVectorMathUtil {
  private FloatVectorMathUtil() {
  }
  
  public static float[] cross3( final float[] a, final float[] b ) {
    return new float[] {
        a[ 1 ] * b[ 2 ] - a[ 2 ] * b[ 1 ],
        a[ 2 ] * b[ 0 ] - a[ 0 ] * b[ 2 ],
        a[ 0 ] * b[ 1 ] - a[ 1 ] * b[ 0 ],
    };
  }
  
  public static float phi( final float[] a, final float[] b ) {
    return (float) Math.acos( scalar( a, b ) / ( abs( a ) * abs( b ) ) );
  }
  
  public static float scalar( final float[] a, final float[] b ) {
    return add( Math.min( a.length, b.length ), i -> a[ i ] * b[ i ] );
  }
}