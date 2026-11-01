package luaj.lib;

/* JADX INFO: loaded from: classes.dex */
final class MathLib$tan extends MathLib$UnaryOp {
    MathLib$tan() {
    }

    @Override // luaj.lib.MathLib$UnaryOp
    protected double X2(double d2) {
        return Math.tan(d2);
    }
}
