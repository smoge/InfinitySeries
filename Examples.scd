//The Danish composer Per Nørgård's "infinity sequence", invented in an attempt to unify in a perfect way repetition and variation: a(2n) = -a(n), a(2n+1) = a(n) + 1, a(0)=0.
// http://oeis.org/A004718
// http://robertinventor.com/ftswiki/Self_Similar_Sloth_Canon_Number_Sequences

(0..20) collect: _.infiniteNumber;
// [ 0, 1, -1, 2, 1, 0, -2, 3, -1, 2, 0, 1, 2, -1, -3, 4, 1, 0, -2, 3, 0 ]

Array.infinitySeries(100).plot

Pbind( \note, Pinf()).play;

Pbind( \note, Pinf(5, 17)).play;