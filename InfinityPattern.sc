Pinf : Pattern {
	var <>start=0, <>step=1, <>length=inf;

	*new { arg start = 0, step = 1, length=inf;
		^super.newCopyArgs(start, step, length)
	}

	storeArgs { ^[start,step,length] }

	embedInStream { arg inval;
		var outval, counter = 0;
		var cur = start.value(inval);
		var len = length.value(inval);
		var stepStr = step.asStream, stepVal;
		while { counter < len } {
			stepVal = stepStr.next(inval);
			if(stepVal.isNil) { ^inval };
			outval = cur;
			cur = cur + stepVal;
			counter = counter + 1;
			inval = outval.infiniteNumber.yield;
		};
		^inval;
	}
}
