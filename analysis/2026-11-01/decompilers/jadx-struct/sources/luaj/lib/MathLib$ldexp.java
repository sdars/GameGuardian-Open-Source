package luaj.lib;

/* JADX INFO: loaded from: classes.dex */
final class MathLib$ldexp extends MathLib$BinaryOp {
    MathLib$ldexp() {
    }

    @Override // luaj.lib.MathLib$BinaryOp
    protected double X2(double d2, double d3) {
        return d2 * Double.longBitsToDouble((((long) d3) + 1023) << 52);
    }
}
