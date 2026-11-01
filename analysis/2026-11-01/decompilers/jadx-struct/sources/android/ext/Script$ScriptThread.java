package android.ext;

import catch_.me_.if_.you_.can_.R$string;
import java.io.File;
import lasm.LasmBase;
import luaj.Globals;

/* JADX INFO: loaded from: classes.dex */
class Script$ScriptThread extends Thread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Script f392a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Script$ScriptThread(Script script) {
        super("Script thread");
        this.f392a = script;
        n0.g(this);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:34:0x00e2 A[Catch: all -> 0x0073, OutOfMemoryError -> 0x00fb, TryCatch #2 {all -> 0x0073, blocks: (B:3:0x0004, B:32:0x00d3, B:34:0x00e2, B:36:0x00e8, B:39:0x00fe, B:42:0x0104, B:44:0x010c, B:48:0x0119, B:50:0x0121, B:54:0x012e, B:55:0x0146, B:57:0x014e, B:59:0x015a, B:61:0x0160, B:65:0x0185, B:67:0x018d, B:70:0x019c, B:76:0x01e2, B:78:0x01ea, B:81:0x021f, B:83:0x022c, B:85:0x023d, B:80:0x01f2, B:74:0x01be, B:63:0x0171, B:13:0x0023, B:15:0x002b, B:17:0x0031, B:20:0x0076, B:22:0x007a, B:23:0x0082, B:27:0x00c3, B:26:0x00b2, B:5:0x0015), top: B:96:0x0004, inners: #8, #7 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x0102  */
    /* JADX WARN: Code duplicated, block: B:42:0x0104 A[Catch: all -> 0x0073, OutOfMemoryError -> 0x00fb, TryCatch #2 {all -> 0x0073, blocks: (B:3:0x0004, B:32:0x00d3, B:34:0x00e2, B:36:0x00e8, B:39:0x00fe, B:42:0x0104, B:44:0x010c, B:48:0x0119, B:50:0x0121, B:54:0x012e, B:55:0x0146, B:57:0x014e, B:59:0x015a, B:61:0x0160, B:65:0x0185, B:67:0x018d, B:70:0x019c, B:76:0x01e2, B:78:0x01ea, B:81:0x021f, B:83:0x022c, B:85:0x023d, B:80:0x01f2, B:74:0x01be, B:63:0x0171, B:13:0x0023, B:15:0x002b, B:17:0x0031, B:20:0x0076, B:22:0x007a, B:23:0x0082, B:27:0x00c3, B:26:0x00b2, B:5:0x0015), top: B:96:0x0004, inners: #8, #7 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x0118  */
    /* JADX WARN: Code duplicated, block: B:50:0x0121 A[Catch: all -> 0x0073, OutOfMemoryError -> 0x00fb, TryCatch #2 {all -> 0x0073, blocks: (B:3:0x0004, B:32:0x00d3, B:34:0x00e2, B:36:0x00e8, B:39:0x00fe, B:42:0x0104, B:44:0x010c, B:48:0x0119, B:50:0x0121, B:54:0x012e, B:55:0x0146, B:57:0x014e, B:59:0x015a, B:61:0x0160, B:65:0x0185, B:67:0x018d, B:70:0x019c, B:76:0x01e2, B:78:0x01ea, B:81:0x021f, B:83:0x022c, B:85:0x023d, B:80:0x01f2, B:74:0x01be, B:63:0x0171, B:13:0x0023, B:15:0x002b, B:17:0x0031, B:20:0x0076, B:22:0x007a, B:23:0x0082, B:27:0x00c3, B:26:0x00b2, B:5:0x0015), top: B:96:0x0004, inners: #8, #7 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x012e A[Catch: all -> 0x0073, OutOfMemoryError -> 0x00fb, TryCatch #2 {all -> 0x0073, blocks: (B:3:0x0004, B:32:0x00d3, B:34:0x00e2, B:36:0x00e8, B:39:0x00fe, B:42:0x0104, B:44:0x010c, B:48:0x0119, B:50:0x0121, B:54:0x012e, B:55:0x0146, B:57:0x014e, B:59:0x015a, B:61:0x0160, B:65:0x0185, B:67:0x018d, B:70:0x019c, B:76:0x01e2, B:78:0x01ea, B:81:0x021f, B:83:0x022c, B:85:0x023d, B:80:0x01f2, B:74:0x01be, B:63:0x0171, B:13:0x0023, B:15:0x002b, B:17:0x0031, B:20:0x0076, B:22:0x007a, B:23:0x0082, B:27:0x00c3, B:26:0x00b2, B:5:0x0015), top: B:96:0x0004, inners: #8, #7 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x014e A[Catch: all -> 0x0073, OutOfMemoryError -> 0x00fb, TryCatch #2 {all -> 0x0073, blocks: (B:3:0x0004, B:32:0x00d3, B:34:0x00e2, B:36:0x00e8, B:39:0x00fe, B:42:0x0104, B:44:0x010c, B:48:0x0119, B:50:0x0121, B:54:0x012e, B:55:0x0146, B:57:0x014e, B:59:0x015a, B:61:0x0160, B:65:0x0185, B:67:0x018d, B:70:0x019c, B:76:0x01e2, B:78:0x01ea, B:81:0x021f, B:83:0x022c, B:85:0x023d, B:80:0x01f2, B:74:0x01be, B:63:0x0171, B:13:0x0023, B:15:0x002b, B:17:0x0031, B:20:0x0076, B:22:0x007a, B:23:0x0082, B:27:0x00c3, B:26:0x00b2, B:5:0x0015), top: B:96:0x0004, inners: #8, #7 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x0184 A[PHI: r7
      0x0184: PHI (r7v12 java.lang.String) = (r7v11 java.lang.String), (r7v18 java.lang.String), (r7v18 java.lang.String), (r7v18 java.lang.String) binds: [B:63:0x0171, B:56:0x014c, B:58:0x0158, B:60:0x015e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:67:0x018d A[Catch: all -> 0x0073, OutOfMemoryError -> 0x019a, TryCatch #2 {all -> 0x0073, blocks: (B:3:0x0004, B:32:0x00d3, B:34:0x00e2, B:36:0x00e8, B:39:0x00fe, B:42:0x0104, B:44:0x010c, B:48:0x0119, B:50:0x0121, B:54:0x012e, B:55:0x0146, B:57:0x014e, B:59:0x015a, B:61:0x0160, B:65:0x0185, B:67:0x018d, B:70:0x019c, B:76:0x01e2, B:78:0x01ea, B:81:0x021f, B:83:0x022c, B:85:0x023d, B:80:0x01f2, B:74:0x01be, B:63:0x0171, B:13:0x0023, B:15:0x002b, B:17:0x0031, B:20:0x0076, B:22:0x007a, B:23:0x0082, B:27:0x00c3, B:26:0x00b2, B:5:0x0015), top: B:96:0x0004, inners: #8, #7 }] */
    /* JADX WARN: Code duplicated, block: B:75:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:78:0x01ea A[Catch: all -> 0x0073, TryCatch #2 {all -> 0x0073, blocks: (B:3:0x0004, B:32:0x00d3, B:34:0x00e2, B:36:0x00e8, B:39:0x00fe, B:42:0x0104, B:44:0x010c, B:48:0x0119, B:50:0x0121, B:54:0x012e, B:55:0x0146, B:57:0x014e, B:59:0x015a, B:61:0x0160, B:65:0x0185, B:67:0x018d, B:70:0x019c, B:76:0x01e2, B:78:0x01ea, B:81:0x021f, B:83:0x022c, B:85:0x023d, B:80:0x01f2, B:74:0x01be, B:63:0x0171, B:13:0x0023, B:15:0x002b, B:17:0x0031, B:20:0x0076, B:22:0x007a, B:23:0x0082, B:27:0x00c3, B:26:0x00b2, B:5:0x0015), top: B:96:0x0004, inners: #8, #7 }] */
    /* JADX WARN: Code duplicated, block: B:80:0x01f2 A[Catch: all -> 0x0073, TryCatch #2 {all -> 0x0073, blocks: (B:3:0x0004, B:32:0x00d3, B:34:0x00e2, B:36:0x00e8, B:39:0x00fe, B:42:0x0104, B:44:0x010c, B:48:0x0119, B:50:0x0121, B:54:0x012e, B:55:0x0146, B:57:0x014e, B:59:0x015a, B:61:0x0160, B:65:0x0185, B:67:0x018d, B:70:0x019c, B:76:0x01e2, B:78:0x01ea, B:81:0x021f, B:83:0x022c, B:85:0x023d, B:80:0x01f2, B:74:0x01be, B:63:0x0171, B:13:0x0023, B:15:0x002b, B:17:0x0031, B:20:0x0076, B:22:0x007a, B:23:0x0082, B:27:0x00c3, B:26:0x00b2, B:5:0x0015), top: B:96:0x0004, inners: #8, #7 }] */
    /* JADX WARN: Code duplicated, block: B:83:0x022c A[Catch: all -> 0x0073, TryCatch #2 {all -> 0x0073, blocks: (B:3:0x0004, B:32:0x00d3, B:34:0x00e2, B:36:0x00e8, B:39:0x00fe, B:42:0x0104, B:44:0x010c, B:48:0x0119, B:50:0x0121, B:54:0x012e, B:55:0x0146, B:57:0x014e, B:59:0x015a, B:61:0x0160, B:65:0x0185, B:67:0x018d, B:70:0x019c, B:76:0x01e2, B:78:0x01ea, B:81:0x021f, B:83:0x022c, B:85:0x023d, B:80:0x01f2, B:74:0x01be, B:63:0x0171, B:13:0x0023, B:15:0x002b, B:17:0x0031, B:20:0x0076, B:22:0x007a, B:23:0x0082, B:27:0x00c3, B:26:0x00b2, B:5:0x0015), top: B:96:0x0004, inners: #8, #7 }] */
    /* JADX WARN: Code duplicated, block: B:84:0x023b  */
    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        String str;
        int i;
        Script script;
        Globals globals;
        String strF;
        Script$ScriptThread$1 script$ScriptThread$1;
        int i2;
        String strN;
        String message;
        Object obj;
        String strC;
        int i3;
        Object obj2;
        MainService mainService = MainService.instance;
        try {
            mainService.n0(this.f392a);
            f1.f951a.booleanValue();
            this.f392a.N3();
            try {
                this.f392a.M3();
            } catch (Script$OsExit e2) {
                e1.i("Script interrupted by self: " + e2.getMessage());
                Script script2 = this.f392a;
                StringBuilder sb = new StringBuilder();
                sb.append(b2.f(R$string.script_exit));
                if (e2.j == 0) {
                    str = ".";
                } else {
                    str = ": " + e2.j;
                }
                sb.append(str);
                script2.Z2(sb.toString());
            } catch (luaj.d e3) {
                e = e3;
                Throwable cause = e.getCause();
                if ((cause instanceof InterruptedException) && this.f392a.f0 != 0) {
                    e1.l("Script thread interrupted: " + this.f392a.f0, cause);
                    this.f392a.Z2(b2.f(R$string.script_interrupted) + " [" + this.f392a.f0 + "]");
                } else if (e instanceof luaj.d$a) {
                    n0.h(Thread.currentThread(), e, false);
                }
                if (e != null) {
                    try {
                        e1.l("Script error", e);
                        strN = e1.n(e);
                        message = e.getMessage();
                        if (message != null) {
                            strN = message + '\n' + strN;
                        }
                        if (e instanceof luaj.d) {
                            if (message == null) {
                                i3 = 0;
                            } else {
                                i3 = 0;
                            }
                            Script script3 = this.f392a;
                            obj2 = script3.U;
                            if (obj2 instanceof File) {
                                i3 = R$string.script_saved_list;
                            }
                            if (i3 != 0) {
                                this.f392a.Z2(Tools.L1(b2.f(R$string.script_possible), b2.f(i3)));
                            }
                        }
                        obj = this.f392a.U;
                        if (obj instanceof File) {
                            i2 = 0;
                        } else {
                            i2 = 0;
                        }
                    } catch (OutOfMemoryError e4) {
                        try {
                            strN = e4.toString() + '\n';
                        } catch (OutOfMemoryError e5) {
                            e = e5;
                            i2 = 0;
                            this.f392a.Z2(Tools.N1(R$string.script_oom) + ": " + e.toString());
                            i = i2;
                            script = this.f392a;
                            globals = script.T;
                            if (globals.Y == 0) {
                                script.Z2(Tools.L1(b2.f(R$string.script_wrote), Tools.U(Tools.f0(), this.f392a.T.a0), Integer.valueOf(this.f392a.T.Y)));
                            } else {
                                script.Z2(Tools.L1(b2.f(R$string.script_wrote), Tools.U(Tools.f0(), this.f392a.T.a0), Integer.valueOf(this.f392a.T.Y)));
                            }
                            this.f392a.L3();
                            if (this.f392a.U instanceof File) {
                                strF = b2.f(R$string.restart);
                                script$ScriptThread$1 = new Script$ScriptThread$1(this);
                            } else {
                                strF = null;
                                script$ScriptThread$1 = null;
                            }
                            mainService.d1(new Script$ScriptThread$2(this, Tools.N1(R$string.script_ended) + ":\n" + this.f392a.W.toString().trim(), i, strF, script$ScriptThread$1));
                            this.f392a.k3();
                            mainService.m0(this.f392a);
                        }
                    }
                    try {
                        if (f1.f951a.booleanValue()) {
                            this.f392a.Z2(b2.f(R$string.try_latest));
                        }
                        this.f392a.Z2(Tools.N1(R$string.script_error) + ": " + strN);
                    } catch (OutOfMemoryError e6) {
                        e = e6;
                        this.f392a.Z2(Tools.N1(R$string.script_oom) + ": " + e.toString());
                    }
                    i = i2;
                } else {
                    i = 0;
                }
                script = this.f392a;
                globals = script.T;
                if (globals.Y == 0) {
                    script.Z2(Tools.L1(b2.f(R$string.script_wrote), Tools.U(Tools.f0(), this.f392a.T.a0), Integer.valueOf(this.f392a.T.Y)));
                } else {
                    script.Z2(Tools.L1(b2.f(R$string.script_wrote), Tools.U(Tools.f0(), this.f392a.T.a0), Integer.valueOf(this.f392a.T.Y)));
                }
                this.f392a.L3();
                if (this.f392a.U instanceof File) {
                    strF = b2.f(R$string.restart);
                    script$ScriptThread$1 = new Script$ScriptThread$1(this);
                } else {
                    strF = null;
                    script$ScriptThread$1 = null;
                }
                mainService.d1(new Script$ScriptThread$2(this, Tools.N1(R$string.script_ended) + ":\n" + this.f392a.W.toString().trim(), i, strF, script$ScriptThread$1));
                this.f392a.k3();
                mainService.m0(this.f392a);
            } catch (Throwable th) {
                e = th;
                if (e != null) {
                    e1.l("Script error", e);
                    strN = e1.n(e);
                    message = e.getMessage();
                    if (message != null) {
                        strN = message + '\n' + strN;
                    }
                    if (e instanceof luaj.d) {
                        if (message == null) {
                            i3 = 0;
                        } else {
                            i3 = 0;
                        }
                        Script script4 = this.f392a;
                        obj2 = script4.U;
                        if (obj2 instanceof File) {
                            i3 = R$string.script_saved_list;
                        }
                        if (i3 != 0) {
                            this.f392a.Z2(Tools.L1(b2.f(R$string.script_possible), b2.f(i3)));
                        }
                    }
                    obj = this.f392a.U;
                    if (obj instanceof File) {
                        i2 = 0;
                    } else {
                        i2 = 0;
                    }
                    if (f1.f951a.booleanValue()) {
                        this.f392a.Z2(b2.f(R$string.try_latest));
                    }
                    this.f392a.Z2(Tools.N1(R$string.script_error) + ": " + strN);
                    i = i2;
                } else {
                    i = 0;
                }
                script = this.f392a;
                globals = script.T;
                if (globals.Y == 0) {
                    script.Z2(Tools.L1(b2.f(R$string.script_wrote), Tools.U(Tools.f0(), this.f392a.T.a0), Integer.valueOf(this.f392a.T.Y)));
                } else {
                    script.Z2(Tools.L1(b2.f(R$string.script_wrote), Tools.U(Tools.f0(), this.f392a.T.a0), Integer.valueOf(this.f392a.T.Y)));
                }
                this.f392a.L3();
                if (this.f392a.U instanceof File) {
                    strF = b2.f(R$string.restart);
                    script$ScriptThread$1 = new Script$ScriptThread$1(this);
                } else {
                    strF = null;
                    script$ScriptThread$1 = null;
                }
                mainService.d1(new Script$ScriptThread$2(this, Tools.N1(R$string.script_ended) + ":\n" + this.f392a.W.toString().trim(), i, strF, script$ScriptThread$1));
                this.f392a.k3();
                mainService.m0(this.f392a);
            }
            e = null;
            if (e != null) {
                e1.l("Script error", e);
                strN = e1.n(e);
                message = e.getMessage();
                if (message != null && !strN.contains(message)) {
                    strN = message + '\n' + strN;
                }
                if (e instanceof luaj.d) {
                    if (message == null && (message.contains("<!DOCTYPE") || message.contains("<html"))) {
                        i3 = R$string.script_web;
                    } else {
                        i3 = 0;
                    }
                    Script script5 = this.f392a;
                    obj2 = script5.U;
                    if ((obj2 instanceof File) && script5.z3((File) obj2)) {
                        i3 = R$string.script_saved_list;
                    }
                    if (i3 != 0) {
                        this.f392a.Z2(Tools.L1(b2.f(R$string.script_possible), b2.f(i3)));
                    }
                }
                obj = this.f392a.U;
                if ((obj instanceof File) || (strC = LasmBase.c(e, ((File) obj).getAbsolutePath(), true)) == null || strC.length() <= 0) {
                    i2 = 0;
                } else {
                    strN = strC + strN;
                    i2 = 4;
                }
                if (f1.f951a.booleanValue()) {
                    this.f392a.Z2(b2.f(R$string.try_latest));
                }
                this.f392a.Z2(Tools.N1(R$string.script_error) + ": " + strN);
                i = i2;
            } else {
                i = 0;
            }
            script = this.f392a;
            globals = script.T;
            if (globals.Y == 0 || globals.a0 != 0) {
                script.Z2(Tools.L1(b2.f(R$string.script_wrote), Tools.U(Tools.f0(), this.f392a.T.a0), Integer.valueOf(this.f392a.T.Y)));
            }
            this.f392a.L3();
            if (this.f392a.U instanceof File) {
                strF = b2.f(R$string.restart);
                script$ScriptThread$1 = new Script$ScriptThread$1(this);
            } else {
                strF = null;
                script$ScriptThread$1 = null;
            }
            mainService.d1(new Script$ScriptThread$2(this, Tools.N1(R$string.script_ended) + ":\n" + this.f392a.W.toString().trim(), i, strF, script$ScriptThread$1));
        } catch (Throwable th2) {
            try {
                e1.l("Script run exception", th2);
            } catch (Throwable th3) {
                this.f392a.k3();
                throw th3;
            }
        }
        this.f392a.k3();
        mainService.m0(this.f392a);
    }
}
