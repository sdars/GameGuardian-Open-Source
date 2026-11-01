package luaj.lib;

/* JADX INFO: loaded from: classes.dex */
final class MathLib$deg extends MathLib$UnaryOp {
    MathLib$deg() {
    }

    @Override // luaj.lib.MathLib$UnaryOp
    protected double X2(double d2) {
        return Math.toDegrees(d2);
    }
}
