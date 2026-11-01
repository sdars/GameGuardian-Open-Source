package luaj.lib;

/* JADX INFO: loaded from: classes.dex */
final class MathLib$asin extends MathLib$UnaryOp {
    MathLib$asin() {
    }

    @Override // luaj.lib.MathLib$UnaryOp
    protected double X2(double d2) {
        return Math.asin(d2);
    }
}
