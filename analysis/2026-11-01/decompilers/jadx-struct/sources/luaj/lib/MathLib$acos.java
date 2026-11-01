package luaj.lib;

/* JADX INFO: loaded from: classes.dex */
final class MathLib$acos extends MathLib$UnaryOp {
    MathLib$acos() {
    }

    @Override // luaj.lib.MathLib$UnaryOp
    protected double X2(double d2) {
        return Math.acos(d2);
    }
}
