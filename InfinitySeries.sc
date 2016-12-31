+Number {
	infiniteNumber {
		^this.asBinaryDigits.filterLeftZeros.infinityDigits
	}
}

+Collection {
	filterLeftZeros {
		var output=[];
		var firstOne=false;
		this.do({|i|
			if(i==1, {output=output++1; firstOne=true});
			if(i==0 && firstOne, {output=output++0});
		});
		^output
	}

	infinityDigits {
		var output=0;
		this.do({|i|
			case
			{i==0} {output = output * (-1)}
			{i==1} {output = output + 1 };
		});
		^output
	}
}

+SequenceableCollection {
	*infinitySeries { arg size, start=0, step=1;
		var obj = this.new(size);
		size.do {|i|
			obj.add((start + (step * i)).infiniteNumber);
		};
		^obj
	}
}

