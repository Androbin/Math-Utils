package de.androbin.math.util.longs;

import static de.androbin.math.util.longs.LongMathUtil.*;

public final class LongUnpairingUtil {
  private LongUnpairingUtil() {
  }
  
  public static long uncantor( final int i ) {
    return (long) ( ( -1 + Math.sqrt( 1 + ( i << 3 ) ) ) / 2 );
  }
  
  public static long uncantorA( final long i, final long z ) {
    return ( z * ( 3 + z ) >> 1 ) - i;
  }
  
  public static long uncantorA2( final long i, final long z ) {
    return sign( uncantorA( i, z ) );
  }
  
  public static long uncantorB( final long i, final long z ) {
    return i - ( z * ( 1 + z ) >> 1 );
  }
  
  public static long uncantorB2( final long i, final long z ) {
    return sign( uncantorB( i, z ) );
  }
}