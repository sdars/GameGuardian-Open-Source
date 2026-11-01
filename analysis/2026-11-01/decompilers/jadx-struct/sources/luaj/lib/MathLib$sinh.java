package luaj.lib;

/* JADX INFO: loaded from: classes.dex */
final class MathLib$sinh extends MathLib$UnaryOp {
    MathLib$sinh() {
    }

    @Override // luaj.lib.MathLib$UnaryOp
    protected double X2(double d2) {
        return Math.sinh(d2);
    }
}
