package luaj.lib;

/* JADX INFO: loaded from: classes.dex */
final class MathLib$exp extends MathLib$UnaryOp {
    MathLib$exp() {
    }

    @Override // luaj.lib.MathLib$UnaryOp
    protected double X2(double d2) {
        return Math.exp(d2);
    }
}
