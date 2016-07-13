package de.androbin.math.util.floats;

import static de.androbin.collection.util.FloatCollectionUtil.*;
import static de.androbin.math.util.floats.FloatFunctionConcurrentMathUtil.*;
import static de.androbin.math.util.floats.FloatFunctionMathUtil.*;
import static de.androbin.math.util.floats.FloatMathUtil.*;

public final class FloatArrayMathUtil
{
	private FloatArrayMathUtil()
	{
	}
	
	public static float abs( final float ... point )
	{
		return (float) Math.sqrt( add( point.length, i -> point[ i ] * point[ i ] ) );
	}
	
	public static float abs( final float[] point1, final float[] point2 )
	{
		return abs( subAll( point1, point2 ) );
	}
	
	public static float[] addAll( final float[] a, final float[] b )
	{
		return a == null ? b : b == null ? a : addAllParallel( Math.min( a.length, b.length ), func( a ), func( b ) );
	}
	
	public static float[] avgAll( final float[] a, final float[] b, final float c )
	{
		return a == null ? b : b == null ? a : fillParallel( new float[ Math.min( a.length, b.length ) ], i -> avg( a[ i ], b[ i ], c ) );
	}
	
	public static float[] cross3( final float[] a, final float[] b )
	{
		return new float[]
		{
				a[ 1 ] * b[ 2 ] - a[ 2 ] * b[ 1 ],
				a[ 2 ] * b[ 0 ] - a[ 0 ] * b[ 2 ],
				a[ 0 ] * b[ 1 ] - a[ 1 ] * b[ 0 ],
		};
	}
	
	public static float[] interpolateAll( final float[] v1, final float p, final float[] v2 )
	{
		return fillParallel( new float[ Math.min( v1.length, v2.length ) ], i -> interpolate( v1[ i ], p, v2[ i ] ) );
	}
	
	public static float[] negateAll( final float[] values )
	{
		return fillParallel( new float[ values.length ], i -> -values[ i ] );
	}
	
	public static float[] normalize1( final float[] values )
	{
		final float sum = add( values.length, func( values ) );
		
		for ( int i = 0; i < values.length; i++ )
		{
			values[ i ] /= sum;
		}
		
		return values;
	}
	
	public static float[] normalize2( final float[] values )
	{
		final float abs = abs( values );
		
		for ( int i = 0; i < values.length; i++ )
		{
			values[ i ] /= abs;
		}
		
		return values;
	}
	
	public static float phi( final float[] a, final float[] b )
	{
		return (float) Math.acos( scalar( a, b ) / ( abs( a ) * abs( b ) ) );
	}
	
	public static float scalar( final float[] a, final float[] b )
	{
		return add( Math.min( a.length, b.length ), i -> a[ i ] * b[ i ] );
	}
	
	public static float[] subAll( final float[] a, final float[] b )
	{
		return a == null ? negateAll( b ) : b == null ? a : subAllParallel( Math.min( a.length, b.length ), func( a ), func( b ) );
	}
}