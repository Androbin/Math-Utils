package de.androbin.math.util.longs;

import static de.androbin.math.util.longs.LongMathUtil.*;

public final class LongPairingUtil {
  private LongPairingUtil() {
  }
  
  public static long cantor( final long a, final long b ) {
    final long xy = a + b;
    return ( xy * ( xy + 1 ) >> 1 ) + b;
  }
  
  public static long cantor2( final long a, final long b ) {
    return cantor( unsign( a ), unsign( b ) );
  }
  
  public static long cantor3( final long a, final long b ) {
    return sign( cantor2( a, b ) );
  }
  
  public static long commutative( final long a, final long b ) {
    return a >= b ? ( a * ( a + 1 ) >> 1 ) + b : ( b * ( b + 1 ) >> 1 ) + a;
  }
  
  public static long commutative2( final long a, final long b ) {
    assert a != b;
    return a > b ? ( ( a - 1 ) * a >> 1 ) + b : ( ( b - 1 ) * b >> 1 ) + a;
  }
  
  public static long szudzik( final long a, final long b ) {
    return a >= b ? a * a + a + b : a + b * b;
  }
  
  public static long szudzik2( final long a, final long b ) {
    return szudzik( unsign( a ), unsign( b ) );
  }
  
  public static long szudzik3( final long a, final long b ) {
    return sign( szudzik2( a, b ) );
  }
}