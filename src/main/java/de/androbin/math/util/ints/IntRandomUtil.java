package de.androbin.math.util.ints;

import java.util.*;
import java.util.concurrent.*;

public final class IntRandomUtil {
  private IntRandomUtil() {
  }
  
  public static int[] random( final Random random, final int m, final int n, final int ... e ) {
    if ( random == null ) {
      return random( ThreadLocalRandom.current(), m, n, e );
    }
    
    Arrays.sort( e );
    
    final int[] r = new int[ n ];
    
    for ( int i = 0; i < n; i++ ) {
      r[ i ] = random.nextInt( m - e.length - i );
      
      for ( int j = 0; j < i; j++ ) {
        if ( r[ i ] >= r[ j ] ) {
          r[ i ]++;
        }
      }
    }
    
    for ( int i = 0; i < n; i++ ) {
      for ( int j = 0; j < e.length && r[ i ] >= e[ j ]; j++ ) {
        r[ i ]++;
      }
    }
    
    return r;
  }
}