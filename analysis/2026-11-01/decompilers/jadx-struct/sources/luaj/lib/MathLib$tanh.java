package luaj.lib;

/* JADX INFO: loaded from: classes.dex */
final class MathLib$tanh extends MathLib$UnaryOp {
    MathLib$tanh() {
    }

    @Override // luaj.lib.MathLib$UnaryOp
    protected double X2(double d2) {
        return Math.tanh(d2);
    }
}
