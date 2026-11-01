package android.ext;

import android.content.Context;
import android.content.DialogInterface;
import android.fix.ImageButtonView;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.View;
import java.util.ArrayList;
import java.util.Locale;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public class HexConverter extends ImageButtonView implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f146a;

    class a implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ArrayList f147a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f148b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ EditText f149c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f150d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f151e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ Editable f152f;

        /* JADX INFO: renamed from: android.ext.HexConverter$a$a, reason: collision with other inner class name */
        class C0006a implements Config.p.b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Config.p f154a;

            C0006a(Config.p pVar) {
                this.f154a = pVar;
            }

            @Override // android.ext.Config.p.b
            public void a(int i) {
                this.f154a.g(null);
                String strL1 = Tools.L1("%,d", Long.valueOf(a.this.f148b ^ Config.s));
                try {
                    a aVar = a.this;
                    aVar.f149c.setSelection(aVar.f150d, aVar.f151e);
                    a aVar2 = a.this;
                    aVar2.f152f.replace(aVar2.f150d, aVar2.f151e, strL1);
                } catch (IndexOutOfBoundsException e2) {
                    e1.s("Failed replace text", e2);
                    a.this.f149c.setText(strL1);
                }
                a.this.f149c.requestFocus();
            }
        }

        a(ArrayList arrayList, long j, EditText editText, int i, int i2, Editable editable) {
            this.f147a = arrayList;
            this.f148b = j;
            this.f149c = editText;
            this.f150d = i;
            this.f151e = i2;
            this.f152f = editable;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            if (i >= 0) {
                try {
                    if (i < this.f147a.size()) {
                        String str = (String) this.f147a.get(i);
                        if (str == null) {
                            Config.p pVarB = Config.b(2131034216);
                            pVarB.g(new C0006a(pVarB));
                            pVarB.b();
                        } else {
                            try {
                                this.f149c.setSelection(this.f150d, this.f151e);
                                this.f152f.replace(this.f150d, this.f151e, str);
                            } catch (IndexOutOfBoundsException e2) {
                                e1.s("Failed replace text", e2);
                                this.f149c.setText(str);
                            }
                        }
                    }
                } catch (Throwable th) {
                    e1.g("HexConverter failed with " + i, th);
                    return;
                }
            }
            this.f149c.requestFocus();
        }
    }

    public HexConverter(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f146a = true;
        a();
    }

    private void a() {
        setOnClickListener(this);
        if (isInEditMode()) {
            return;
        }
        setImageResource(2130968588);
        Config.m(this);
    }

    private String b(String str, char c2, boolean z) {
        int length = str.length();
        int i = 0;
        if (z) {
            int i2 = 0;
            while (i < length - 2 && str.charAt(i) == c2) {
                i++;
                i2 = i & (-2);
            }
            i = i2;
        } else {
            for (int i3 = length - 1; i3 >= 2 && str.charAt(i3) == c2; i3--) {
                length = (i3 + 1) & (-2);
            }
        }
        return str.substring(i, length);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0314  */
    /* JADX WARN: Code duplicated, block: B:104:0x0318  */
    /* JADX WARN: Code duplicated, block: B:119:0x0335 A[Catch: all -> 0x019c, TryCatch #4 {all -> 0x019c, blocks: (B:64:0x018e, B:66:0x0196, B:69:0x01a0, B:70:0x01a6, B:72:0x01ae, B:74:0x021d, B:77:0x0259, B:89:0x02e3, B:82:0x0297, B:90:0x02f5, B:92:0x02fe, B:105:0x031a, B:146:0x03ed, B:110:0x0326, B:115:0x032e, B:119:0x0335, B:123:0x0345, B:126:0x034c, B:130:0x036c, B:132:0x0379, B:134:0x0384, B:137:0x038c, B:140:0x03a5, B:143:0x03bb, B:144:0x03ce, B:147:0x03f1, B:95:0x0304, B:98:0x030e, B:86:0x02af, B:79:0x0263), top: B:159:0x018e, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:121:0x033e  */
    /* JADX WARN: Code duplicated, block: B:123:0x0345 A[Catch: all -> 0x019c, TryCatch #4 {all -> 0x019c, blocks: (B:64:0x018e, B:66:0x0196, B:69:0x01a0, B:70:0x01a6, B:72:0x01ae, B:74:0x021d, B:77:0x0259, B:89:0x02e3, B:82:0x0297, B:90:0x02f5, B:92:0x02fe, B:105:0x031a, B:146:0x03ed, B:110:0x0326, B:115:0x032e, B:119:0x0335, B:123:0x0345, B:126:0x034c, B:130:0x036c, B:132:0x0379, B:134:0x0384, B:137:0x038c, B:140:0x03a5, B:143:0x03bb, B:144:0x03ce, B:147:0x03f1, B:95:0x0304, B:98:0x030e, B:86:0x02af, B:79:0x0263), top: B:159:0x018e, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:126:0x034c A[Catch: all -> 0x019c, TryCatch #4 {all -> 0x019c, blocks: (B:64:0x018e, B:66:0x0196, B:69:0x01a0, B:70:0x01a6, B:72:0x01ae, B:74:0x021d, B:77:0x0259, B:89:0x02e3, B:82:0x0297, B:90:0x02f5, B:92:0x02fe, B:105:0x031a, B:146:0x03ed, B:110:0x0326, B:115:0x032e, B:119:0x0335, B:123:0x0345, B:126:0x034c, B:130:0x036c, B:132:0x0379, B:134:0x0384, B:137:0x038c, B:140:0x03a5, B:143:0x03bb, B:144:0x03ce, B:147:0x03f1, B:95:0x0304, B:98:0x030e, B:86:0x02af, B:79:0x0263), top: B:159:0x018e, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:127:0x0363  */
    /* JADX WARN: Code duplicated, block: B:129:0x0369  */
    /* JADX WARN: Code duplicated, block: B:130:0x036c A[Catch: all -> 0x019c, TryCatch #4 {all -> 0x019c, blocks: (B:64:0x018e, B:66:0x0196, B:69:0x01a0, B:70:0x01a6, B:72:0x01ae, B:74:0x021d, B:77:0x0259, B:89:0x02e3, B:82:0x0297, B:90:0x02f5, B:92:0x02fe, B:105:0x031a, B:146:0x03ed, B:110:0x0326, B:115:0x032e, B:119:0x0335, B:123:0x0345, B:126:0x034c, B:130:0x036c, B:132:0x0379, B:134:0x0384, B:137:0x038c, B:140:0x03a5, B:143:0x03bb, B:144:0x03ce, B:147:0x03f1, B:95:0x0304, B:98:0x030e, B:86:0x02af, B:79:0x0263), top: B:159:0x018e, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:132:0x0379 A[Catch: all -> 0x019c, TryCatch #4 {all -> 0x019c, blocks: (B:64:0x018e, B:66:0x0196, B:69:0x01a0, B:70:0x01a6, B:72:0x01ae, B:74:0x021d, B:77:0x0259, B:89:0x02e3, B:82:0x0297, B:90:0x02f5, B:92:0x02fe, B:105:0x031a, B:146:0x03ed, B:110:0x0326, B:115:0x032e, B:119:0x0335, B:123:0x0345, B:126:0x034c, B:130:0x036c, B:132:0x0379, B:134:0x0384, B:137:0x038c, B:140:0x03a5, B:143:0x03bb, B:144:0x03ce, B:147:0x03f1, B:95:0x0304, B:98:0x030e, B:86:0x02af, B:79:0x0263), top: B:159:0x018e, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:133:0x0383  */
    /* JADX WARN: Code duplicated, block: B:136:0x038a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:137:0x038c A[Catch: all -> 0x019c, TryCatch #4 {all -> 0x019c, blocks: (B:64:0x018e, B:66:0x0196, B:69:0x01a0, B:70:0x01a6, B:72:0x01ae, B:74:0x021d, B:77:0x0259, B:89:0x02e3, B:82:0x0297, B:90:0x02f5, B:92:0x02fe, B:105:0x031a, B:146:0x03ed, B:110:0x0326, B:115:0x032e, B:119:0x0335, B:123:0x0345, B:126:0x034c, B:130:0x036c, B:132:0x0379, B:134:0x0384, B:137:0x038c, B:140:0x03a5, B:143:0x03bb, B:144:0x03ce, B:147:0x03f1, B:95:0x0304, B:98:0x030e, B:86:0x02af, B:79:0x0263), top: B:159:0x018e, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:138:0x03a1  */
    /* JADX WARN: Code duplicated, block: B:140:0x03a5 A[Catch: all -> 0x019c, TryCatch #4 {all -> 0x019c, blocks: (B:64:0x018e, B:66:0x0196, B:69:0x01a0, B:70:0x01a6, B:72:0x01ae, B:74:0x021d, B:77:0x0259, B:89:0x02e3, B:82:0x0297, B:90:0x02f5, B:92:0x02fe, B:105:0x031a, B:146:0x03ed, B:110:0x0326, B:115:0x032e, B:119:0x0335, B:123:0x0345, B:126:0x034c, B:130:0x036c, B:132:0x0379, B:134:0x0384, B:137:0x038c, B:140:0x03a5, B:143:0x03bb, B:144:0x03ce, B:147:0x03f1, B:95:0x0304, B:98:0x030e, B:86:0x02af, B:79:0x0263), top: B:159:0x018e, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:143:0x03bb A[Catch: all -> 0x019c, TryCatch #4 {all -> 0x019c, blocks: (B:64:0x018e, B:66:0x0196, B:69:0x01a0, B:70:0x01a6, B:72:0x01ae, B:74:0x021d, B:77:0x0259, B:89:0x02e3, B:82:0x0297, B:90:0x02f5, B:92:0x02fe, B:105:0x031a, B:146:0x03ed, B:110:0x0326, B:115:0x032e, B:119:0x0335, B:123:0x0345, B:126:0x034c, B:130:0x036c, B:132:0x0379, B:134:0x0384, B:137:0x038c, B:140:0x03a5, B:143:0x03bb, B:144:0x03ce, B:147:0x03f1, B:95:0x0304, B:98:0x030e, B:86:0x02af, B:79:0x0263), top: B:159:0x018e, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:145:0x03eb  */
    /* JADX WARN: Code duplicated, block: B:157:0x00cc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:159:0x018e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:162:0x01a0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:20:0x0043  */
    /* JADX WARN: Code duplicated, block: B:22:0x0047  */
    /* JADX WARN: Code duplicated, block: B:23:0x004c  */
    /* JADX WARN: Code duplicated, block: B:25:0x004f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:26:0x0050  */
    /* JADX WARN: Code duplicated, block: B:32:0x0068  */
    /* JADX WARN: Code duplicated, block: B:34:0x006b  */
    /* JADX WARN: Code duplicated, block: B:35:0x0072  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:46:0x00d7 A[Catch: all -> 0x0108, TryCatch #3 {all -> 0x0108, blocks: (B:44:0x00cc, B:46:0x00d7, B:48:0x00df, B:49:0x0102, B:55:0x010f, B:57:0x0117, B:58:0x013b, B:61:0x0165), top: B:157:0x00cc }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00df A[Catch: all -> 0x0108, TryCatch #3 {all -> 0x0108, blocks: (B:44:0x00cc, B:46:0x00d7, B:48:0x00df, B:49:0x0102, B:55:0x010f, B:57:0x0117, B:58:0x013b, B:61:0x0165), top: B:157:0x00cc }] */
    /* JADX WARN: Code duplicated, block: B:53:0x010b  */
    /* JADX WARN: Code duplicated, block: B:55:0x010f A[Catch: all -> 0x0108, TryCatch #3 {all -> 0x0108, blocks: (B:44:0x00cc, B:46:0x00d7, B:48:0x00df, B:49:0x0102, B:55:0x010f, B:57:0x0117, B:58:0x013b, B:61:0x0165), top: B:157:0x00cc }] */
    /* JADX WARN: Code duplicated, block: B:57:0x0117 A[Catch: all -> 0x0108, TryCatch #3 {all -> 0x0108, blocks: (B:44:0x00cc, B:46:0x00d7, B:48:0x00df, B:49:0x0102, B:55:0x010f, B:57:0x0117, B:58:0x013b, B:61:0x0165), top: B:157:0x00cc }] */
    /* JADX WARN: Code duplicated, block: B:58:0x013b A[Catch: all -> 0x0108, TryCatch #3 {all -> 0x0108, blocks: (B:44:0x00cc, B:46:0x00d7, B:48:0x00df, B:49:0x0102, B:55:0x010f, B:57:0x0117, B:58:0x013b, B:61:0x0165), top: B:157:0x00cc }] */
    /* JADX WARN: Code duplicated, block: B:61:0x0165 A[Catch: all -> 0x0108, TRY_LEAVE, TryCatch #3 {all -> 0x0108, blocks: (B:44:0x00cc, B:46:0x00d7, B:48:0x00df, B:49:0x0102, B:55:0x010f, B:57:0x0117, B:58:0x013b, B:61:0x0165), top: B:157:0x00cc }] */
    /* JADX WARN: Code duplicated, block: B:66:0x0196 A[Catch: all -> 0x019c, TryCatch #4 {all -> 0x019c, blocks: (B:64:0x018e, B:66:0x0196, B:69:0x01a0, B:70:0x01a6, B:72:0x01ae, B:74:0x021d, B:77:0x0259, B:89:0x02e3, B:82:0x0297, B:90:0x02f5, B:92:0x02fe, B:105:0x031a, B:146:0x03ed, B:110:0x0326, B:115:0x032e, B:119:0x0335, B:123:0x0345, B:126:0x034c, B:130:0x036c, B:132:0x0379, B:134:0x0384, B:137:0x038c, B:140:0x03a5, B:143:0x03bb, B:144:0x03ce, B:147:0x03f1, B:95:0x0304, B:98:0x030e, B:86:0x02af, B:79:0x0263), top: B:159:0x018e, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:74:0x021d A[Catch: all -> 0x019c, TryCatch #4 {all -> 0x019c, blocks: (B:64:0x018e, B:66:0x0196, B:69:0x01a0, B:70:0x01a6, B:72:0x01ae, B:74:0x021d, B:77:0x0259, B:89:0x02e3, B:82:0x0297, B:90:0x02f5, B:92:0x02fe, B:105:0x031a, B:146:0x03ed, B:110:0x0326, B:115:0x032e, B:119:0x0335, B:123:0x0345, B:126:0x034c, B:130:0x036c, B:132:0x0379, B:134:0x0384, B:137:0x038c, B:140:0x03a5, B:143:0x03bb, B:144:0x03ce, B:147:0x03f1, B:95:0x0304, B:98:0x030e, B:86:0x02af, B:79:0x0263), top: B:159:0x018e, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:85:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:92:0x02fe A[Catch: all -> 0x019c, TryCatch #4 {all -> 0x019c, blocks: (B:64:0x018e, B:66:0x0196, B:69:0x01a0, B:70:0x01a6, B:72:0x01ae, B:74:0x021d, B:77:0x0259, B:89:0x02e3, B:82:0x0297, B:90:0x02f5, B:92:0x02fe, B:105:0x031a, B:146:0x03ed, B:110:0x0326, B:115:0x032e, B:119:0x0335, B:123:0x0345, B:126:0x034c, B:130:0x036c, B:132:0x0379, B:134:0x0384, B:137:0x038c, B:140:0x03a5, B:143:0x03bb, B:144:0x03ce, B:147:0x03f1, B:95:0x0304, B:98:0x030e, B:86:0x02af, B:79:0x0263), top: B:159:0x018e, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:93:0x0301  */
    /* JADX WARN: Code duplicated, block: B:95:0x0304 A[Catch: all -> 0x019c, TryCatch #4 {all -> 0x019c, blocks: (B:64:0x018e, B:66:0x0196, B:69:0x01a0, B:70:0x01a6, B:72:0x01ae, B:74:0x021d, B:77:0x0259, B:89:0x02e3, B:82:0x0297, B:90:0x02f5, B:92:0x02fe, B:105:0x031a, B:146:0x03ed, B:110:0x0326, B:115:0x032e, B:119:0x0335, B:123:0x0345, B:126:0x034c, B:130:0x036c, B:132:0x0379, B:134:0x0384, B:137:0x038c, B:140:0x03a5, B:143:0x03bb, B:144:0x03ce, B:147:0x03f1, B:95:0x0304, B:98:0x030e, B:86:0x02af, B:79:0x0263), top: B:159:0x018e, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:96:0x030b  */
    /* JADX WARN: Code duplicated, block: B:98:0x030e A[Catch: all -> 0x019c, TryCatch #4 {all -> 0x019c, blocks: (B:64:0x018e, B:66:0x0196, B:69:0x01a0, B:70:0x01a6, B:72:0x01ae, B:74:0x021d, B:77:0x0259, B:89:0x02e3, B:82:0x0297, B:90:0x02f5, B:92:0x02fe, B:105:0x031a, B:146:0x03ed, B:110:0x0326, B:115:0x032e, B:119:0x0335, B:123:0x0345, B:126:0x034c, B:130:0x036c, B:132:0x0379, B:134:0x0384, B:137:0x038c, B:140:0x03a5, B:143:0x03bb, B:144:0x03ce, B:147:0x03f1, B:95:0x0304, B:98:0x030e, B:86:0x02af, B:79:0x0263), top: B:159:0x018e, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:99:0x0311  */
    /* JADX WARN: Instruction removed from duplicated block: B:137:0x038c, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:140:0x03a5, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:143:0x03bb, please report this as an issue */
    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        EditText editText;
        int selected;
        int i;
        Editable text;
        int selectionStart;
        int selectionEnd;
        boolean z;
        int length;
        int i2;
        String string;
        boolean z2;
        int i3;
        String strSubstring;
        int length2;
        long j;
        ArrayList arrayList;
        ArrayList arrayList2;
        int iH;
        int i4;
        int i5;
        n nVar;
        long j2;
        String string2;
        String strTrim;
        int iIndexOf;
        int i6;
        String str;
        byte[] bArrG;
        int i7;
        int i8;
        char[] cArr;
        int i9;
        int iIndexOf2;
        char cCharAt;
        StringBuilder sb;
        Object tag = getTag();
        if (tag instanceof EditText) {
            editText = (EditText) tag;
        } else {
            if (tag instanceof Object[]) {
                Object[] objArr = (Object[]) tag;
                if (objArr.length == 2) {
                    Object obj = objArr[0];
                    if (obj instanceof EditText) {
                        EditText editText2 = (EditText) obj;
                        Object obj2 = objArr[1];
                        if (obj2 instanceof Integer) {
                            selected = ((Integer) obj2).intValue();
                        } else if (obj2 instanceof SystemSpinnerType) {
                            selected = ((SystemSpinnerType) obj2).getSelected();
                        } else {
                            editText = editText2;
                        }
                        editText = editText2;
                    } else {
                        editText = null;
                    }
                } else {
                    editText = null;
                }
            } else {
                editText = null;
            }
            if (selected == 0) {
                i = 32;
            } else {
                i = selected;
            }
            if (editText == null) {
                return;
            }
            editText.requestFocus();
            text = editText.getText();
            selectionStart = editText.getSelectionStart();
            selectionEnd = editText.getSelectionEnd();
            if (selectionStart >= 0 || selectionEnd < 0 || selectionStart == selectionEnd) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                length = text.length();
                i2 = 0;
            } else {
                length = selectionEnd;
                i2 = selectionStart;
            }
            try {
                int i10 = i2;
                string = text.subSequence(i2, length).toString().trim();
                z2 = z;
                i3 = i10;
            } catch (StringIndexOutOfBoundsException e2) {
                e1.s("subSequence fail for " + i2 + ", " + length + "; " + text.length(), e2);
                length = text.length();
                string = text.toString();
                z2 = true;
                i3 = 0;
            }
            if (string.length() == 0) {
                Tools.J1(b2.f(2131296400));
                return;
            }
            try {
                EditText editText3 = editText;
                if (t1.C(string) != 0) {
                    cCharAt = string.charAt(1);
                    if (cCharAt == 'T') {
                        String strTrim2 = string.substring(2).trim();
                        sb = new StringBuilder();
                        sb.append(Integer.toHexString(n.p(null, 0L, strTrim2)).toUpperCase(Locale.US));
                        sb.append('h');
                    } else {
                        if (cCharAt == 'A') {
                            if (string.charAt(2) == '8') {
                                String strTrim3 = string.substring(3).trim();
                                sb = new StringBuilder();
                                sb.append(Integer.toHexString(m.k(null, null, 0L, strTrim3)).toUpperCase(Locale.US));
                                sb.append('h');
                            } else {
                                String strTrim4 = string.substring(2).trim();
                                sb = new StringBuilder();
                                sb.append(Integer.toHexString(n.n(null, 0L, strTrim4)).toUpperCase(Locale.US));
                                sb.append('h');
                            }
                        }
                        z2 = false;
                    }
                    string = sb.toString();
                    z2 = false;
                }
                if (z2) {
                    cArr = new char[]{t1.f1252b, ':', ';', '~', 'X', 'W', 'Q'};
                    strSubstring = string;
                    i9 = 0;
                    for (i8 = 7; i9 < i8; i8 = 7) {
                        try {
                            iIndexOf2 = strSubstring.indexOf(cArr[i9]);
                            if (iIndexOf2 > 0) {
                                strSubstring = strSubstring.substring(0, iIndexOf2);
                            }
                            i9++;
                        } catch (Throwable th) {
                            th = th;
                            string = strSubstring;
                            Tools.J1(b2.f(2131296793) + "\n\n" + th.getMessage());
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("HexConverter: ");
                            sb2.append(string);
                            e1.g(sb2.toString(), th);
                            return;
                        }
                    }
                    length2 = strSubstring.length();
                } else {
                    strSubstring = string;
                    length2 = length;
                }
                j = t1.x(strSubstring).f1261a;
                arrayList = new ArrayList();
                arrayList2 = new ArrayList();
                String strL1 = Tools.L1("%,d", Long.valueOf(j));
                arrayList.add(strL1);
                arrayList2.add(strL1);
                String str2 = b(c.M(0L, j, i), '0', true) + 'h';
                arrayList.add(str2);
                arrayList2.add(str2);
                String str3 = b(c.P(0L, j, i), '0', false) + 'r';
                arrayList.add(str3);
                arrayList2.add(str3);
                if (this.f146a) {
                    String strL2 = Tools.L1("%,d", Long.valueOf(Config.s ^ j));
                    arrayList.add(Tools.L1("XOR %,d = %s", Long.valueOf(Config.s), strL2));
                    arrayList2.add(strL2);
                    arrayList.add("XOR ... = ???");
                    arrayList2.add(null);
                }
                if (j != 0 && (i7 = (bArrG = t1.g(j))[8]) != -1) {
                    try {
                        String str4 = ':' + new String(bArrG, 0, i7 + 1, "UTF-8");
                        arrayList.add("UTF-8: " + str4);
                        arrayList2.add(str4);
                    } catch (Throwable th2) {
                        e1.g("HexConverter: " + strSubstring, th2);
                    }
                    if ((i7 & 1) == 0) {
                        i7++;
                    }
                    try {
                        String str5 = ';' + new String(bArrG, 0, i7 + 1, "UTF-16LE");
                        arrayList.add("UTF-16LE: " + str5);
                        arrayList2.add(str5);
                    } catch (Throwable th3) {
                        e1.g("HexConverter: " + strSubstring, th3);
                    }
                }
                iH = MainService.instance.H();
                if (iH == 1) {
                    i4 = AddressArrayAdapter.f23d;
                } else if (iH == 3) {
                    i4 = MainService.instance.N.j;
                } else if (iH == 2) {
                    i4 = SavedListAdapter.f360c;
                } else {
                    i4 = 0;
                }
                if (i4 != 0) {
                    for (i5 = 0; i5 < 3; i5++) {
                        if ((i5 == 0 || (i4 & 16) != 0) && ((i5 != 1 || (i4 & 32) != 0) && (i5 != 2 || (i4 & 64) != 0))) {
                            if (i5 == 0) {
                                nVar = null;
                                j2 = 0;
                                string2 = n.o(null, 0L, j);
                            } else {
                                nVar = null;
                                j2 = 0;
                                string2 = null;
                            }
                            if (i5 == 1) {
                                string2 = n.q(nVar, j2, j);
                            }
                            if (i5 == 2) {
                                string2 = m.g(m.d(), 0L, (int) j, new StringBuilder()).toString();
                            }
                            if (string2 == null) {
                                arrayList = arrayList;
                            } else {
                                strTrim = string2.trim();
                                iIndexOf = strTrim.indexOf(59);
                                if (iIndexOf != -1) {
                                    strTrim = strTrim.substring(0, iIndexOf).trim();
                                }
                                if (strTrim.length() > 0) {
                                    if (i5 == 0) {
                                        str = "ARM (x32)";
                                        strTrim = "~A " + strTrim;
                                        i6 = 1;
                                    } else {
                                        i6 = 1;
                                        str = null;
                                    }
                                    if (i5 == i6) {
                                        str = "Thumb";
                                        strTrim = "~T " + strTrim;
                                    }
                                    if (i5 == 2) {
                                        str = "ARM (x64)";
                                        strTrim = "~A8 " + strTrim;
                                    }
                                    arrayList = arrayList;
                                    arrayList.add(str + ": " + strTrim);
                                    arrayList2.add(strTrim);
                                } else {
                                    arrayList = arrayList;
                                }
                            }
                        }
                    }
                }
                ArrayList arrayList3 = arrayList;
                a aVar = new a(arrayList2, j, editText3, i3, length2, text);
                f.m(f.b().setCustomTitle(Tools.h0(strSubstring + " →")).setItems((CharSequence[]) arrayList3.toArray(new String[arrayList3.size()]), aVar).setNegativeButton(b2.f(2131296311), aVar).create());
            } catch (Throwable th4) {
                th = th4;
            }
        }
        selected = 0;
        if (selected == 0) {
            i = 32;
        } else {
            i = selected;
        }
        if (editText == null) {
            return;
        }
        editText.requestFocus();
        text = editText.getText();
        selectionStart = editText.getSelectionStart();
        selectionEnd = editText.getSelectionEnd();
        if (selectionStart >= 0) {
            z = true;
        } else {
            z = true;
        }
        if (z) {
            length = text.length();
            i2 = 0;
        } else {
            length = selectionEnd;
            i2 = selectionStart;
        }
        int i11 = i2;
        string = text.subSequence(i2, length).toString().trim();
        z2 = z;
        i3 = i11;
        if (string.length() == 0) {
            Tools.J1(b2.f(2131296400));
            return;
        }
        EditText editText4 = editText;
        if (t1.C(string) != 0) {
            cCharAt = string.charAt(1);
            if (cCharAt == 'T') {
                String strTrim5 = string.substring(2).trim();
                sb = new StringBuilder();
                sb.append(Integer.toHexString(n.p(null, 0L, strTrim5)).toUpperCase(Locale.US));
                sb.append('h');
            } else {
                if (cCharAt == 'A') {
                    if (string.charAt(2) == '8') {
                        String strTrim6 = string.substring(3).trim();
                        sb = new StringBuilder();
                        sb.append(Integer.toHexString(m.k(null, null, 0L, strTrim6)).toUpperCase(Locale.US));
                        sb.append('h');
                    } else {
                        String strTrim7 = string.substring(2).trim();
                        sb = new StringBuilder();
                        sb.append(Integer.toHexString(n.n(null, 0L, strTrim7)).toUpperCase(Locale.US));
                        sb.append('h');
                    }
                }
                z2 = false;
            }
            string = sb.toString();
            z2 = false;
        }
        if (z2) {
            cArr = new char[]{t1.f1252b, ':', ';', '~', 'X', 'W', 'Q'};
            strSubstring = string;
            i9 = 0;
            while (i9 < i8) {
                iIndexOf2 = strSubstring.indexOf(cArr[i9]);
                if (iIndexOf2 > 0) {
                    strSubstring = strSubstring.substring(0, iIndexOf2);
                }
                i9++;
            }
            length2 = strSubstring.length();
        } else {
            strSubstring = string;
            length2 = length;
        }
        j = t1.x(strSubstring).f1261a;
        arrayList = new ArrayList();
        arrayList2 = new ArrayList();
        String strL3 = Tools.L1("%,d", Long.valueOf(j));
        arrayList.add(strL3);
        arrayList2.add(strL3);
        String str6 = b(c.M(0L, j, i), '0', true) + 'h';
        arrayList.add(str6);
        arrayList2.add(str6);
        String str7 = b(c.P(0L, j, i), '0', false) + 'r';
        arrayList.add(str7);
        arrayList2.add(str7);
        if (this.f146a) {
            String strL4 = Tools.L1("%,d", Long.valueOf(Config.s ^ j));
            arrayList.add(Tools.L1("XOR %,d = %s", Long.valueOf(Config.s), strL4));
            arrayList2.add(strL4);
            arrayList.add("XOR ... = ???");
            arrayList2.add(null);
        }
        if (j != 0) {
            String str8 = ':' + new String(bArrG, 0, i7 + 1, "UTF-8");
            arrayList.add("UTF-8: " + str8);
            arrayList2.add(str8);
            if ((i7 & 1) == 0) {
                i7++;
            }
            String str9 = ';' + new String(bArrG, 0, i7 + 1, "UTF-16LE");
            arrayList.add("UTF-16LE: " + str9);
            arrayList2.add(str9);
        }
        iH = MainService.instance.H();
        if (iH == 1) {
            i4 = AddressArrayAdapter.f23d;
        } else if (iH == 3) {
            i4 = MainService.instance.N.j;
        } else if (iH == 2) {
            i4 = SavedListAdapter.f360c;
        } else {
            i4 = 0;
        }
        if (i4 != 0) {
            while (i5 < 3) {
                if (i5 == 0) {
                    if (i5 == 0) {
                        nVar = null;
                        j2 = 0;
                        string2 = n.o(null, 0L, j);
                    } else {
                        nVar = null;
                        j2 = 0;
                        string2 = null;
                    }
                    if (i5 == 1) {
                        string2 = n.q(nVar, j2, j);
                    }
                    if (i5 == 2) {
                        string2 = m.g(m.d(), 0L, (int) j, new StringBuilder()).toString();
                    }
                    if (string2 == null) {
                        arrayList = arrayList;
                    } else {
                        strTrim = string2.trim();
                        iIndexOf = strTrim.indexOf(59);
                        if (iIndexOf != -1) {
                            strTrim = strTrim.substring(0, iIndexOf).trim();
                        }
                        if (strTrim.length() > 0) {
                            if (i5 == 0) {
                                str = "ARM (x32)";
                                strTrim = "~A " + strTrim;
                                i6 = 1;
                            } else {
                                i6 = 1;
                                str = null;
                            }
                            if (i5 == i6) {
                                str = "Thumb";
                                strTrim = "~T " + strTrim;
                            }
                            if (i5 == 2) {
                                str = "ARM (x64)";
                                strTrim = "~A8 " + strTrim;
                            }
                            arrayList = arrayList;
                            arrayList.add(str + ": " + strTrim);
                            arrayList2.add(strTrim);
                        } else {
                            arrayList = arrayList;
                        }
                    }
                } else {
                    if (i5 == 0) {
                        nVar = null;
                        j2 = 0;
                        string2 = n.o(null, 0L, j);
                    } else {
                        nVar = null;
                        j2 = 0;
                        string2 = null;
                    }
                    if (i5 == 1) {
                        string2 = n.q(nVar, j2, j);
                    }
                    if (i5 == 2) {
                        string2 = m.g(m.d(), 0L, (int) j, new StringBuilder()).toString();
                    }
                    if (string2 == null) {
                        arrayList = arrayList;
                    } else {
                        strTrim = string2.trim();
                        iIndexOf = strTrim.indexOf(59);
                        if (iIndexOf != -1) {
                            strTrim = strTrim.substring(0, iIndexOf).trim();
                        }
                        if (strTrim.length() > 0) {
                            if (i5 == 0) {
                                str = "ARM (x32)";
                                strTrim = "~A " + strTrim;
                                i6 = 1;
                            } else {
                                i6 = 1;
                                str = null;
                            }
                            if (i5 == i6) {
                                str = "Thumb";
                                strTrim = "~T " + strTrim;
                            }
                            if (i5 == 2) {
                                str = "ARM (x64)";
                                strTrim = "~A8 " + strTrim;
                            }
                            arrayList = arrayList;
                            arrayList.add(str + ": " + strTrim);
                            arrayList2.add(strTrim);
                        } else {
                            arrayList = arrayList;
                        }
                    }
                }
            }
        }
        ArrayList arrayList4 = arrayList;
        a aVar2 = new a(arrayList2, j, editText4, i3, length2, text);
        f.m(f.b().setCustomTitle(Tools.h0(strSubstring + " →")).setItems((CharSequence[]) arrayList4.toArray(new String[arrayList4.size()]), aVar2).setNegativeButton(b2.f(2131296311), aVar2).create());
    }

    public void setUseXor(boolean z) {
        this.f146a = z;
    }
}
