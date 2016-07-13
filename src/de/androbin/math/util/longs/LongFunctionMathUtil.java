package de.androbin.math.util.longs;

import static de.androbin.collection.util.LongCollectionUtil.*;
import java.util.function.*;

public final class LongFunctionMathUtil
{
	private LongFunctionMathUtil()
	{
	}
	
	public static long add( final int n, final IntToLongFunction f )
	{
		long p = 0;
		
		for ( int i = 0; i < n; i++ )
		{
			p += f.applyAsLong( i );
		}
		
		return p;
	}
	
	public static long[] add( final int n, final IntToLongFunction f, final IntToLongFunction g )
	{
		return fill( new long[ n ], i -> f.applyAsLong( i ) + g.applyAsLong( i ) );
	}
	
	public static long avg( final int n, final IntToLongFunction f )
	{
		return add( n, f ) / n;
	}
	
	public static long multiply( final int n, final IntToLongFunction f )
	{
		long p = 1;
		
		for ( int i = 0; i < n; i++ )
		{
			p *= f.applyAsLong( i );
		}
		
		return p;
	}
	
	public static long[] sub( final int n, final IntToLongFunction f, final IntToLongFunction g )
	{
		return fill( new long[ n ], i -> f.applyAsLong( i ) - g.applyAsLong( i ) );
	}
}