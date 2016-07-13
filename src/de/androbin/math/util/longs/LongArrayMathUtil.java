package de.androbin.math.util.longs;

import static de.androbin.collection.util.LongCollectionUtil.*;
import static de.androbin.math.util.longs.LongFunctionConcurrentMathUtil.*;

public final class LongArrayMathUtil
{
	private LongArrayMathUtil()
	{
	}
	
	public static long[] addAll( final long[] a, final long[] b )
	{
		return a == null ? b : b == null ? a : addAllParallel( Math.min( a.length, b.length ), func( a ), func( b ) );
	}
	
	public static long[] negateAll( final long[] values )
	{
		return fillParallel( new long[ values.length ], i -> -values[ i ] );
	}
	
	public static long[] subAll( final long[] a, final long[] b )
	{
		return a == null ? negateAll( b ) : b == null ? a : subAllParallel( Math.min( a.length, b.length ), func( a ), func( b ) );
	}
}