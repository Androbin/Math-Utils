package de.androbin.math.util.floats;

import static de.androbin.collection.util.FloatCollectionUtil.*;
import de.androbin.function.*;

public final class FloatFunctionConcurrentMathUtil
{
	private FloatFunctionConcurrentMathUtil()
	{
	}
	
	public static float[] addAllParallel( final int n, final IntToFloatFunction f, final IntToFloatFunction g )
	{
		return fillParallel( new float[ n ], i -> f.applyAsFloat( i ) + g.applyAsFloat( i ) );
	}
	
	public static float[] subAllParallel( final int n, final IntToFloatFunction f, final IntToFloatFunction g )
	{
		return fillParallel( new float[ n ], i -> f.applyAsFloat( i ) - g.applyAsFloat( i ) );
	}
}