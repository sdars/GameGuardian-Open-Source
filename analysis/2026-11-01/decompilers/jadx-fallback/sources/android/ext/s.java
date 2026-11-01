package android.ext;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
abstract class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final java.nio.charset.Charset f1236a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final java.nio.charset.Charset f1237b = null;

    static {
            java.lang.String r0 = "UTF-16LE"
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r0)
            android.ext.s.f1236a = r0
            java.lang.String r0 = "UTF-8"
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r0)
            android.ext.s.f1237b = r0
            return
    }

    private static java.lang.String a(byte[] r3, int r4, int r5, boolean r6) {
            r5 = 2
            if (r6 == 0) goto L2f
            int r6 = r4 + 1
            r0 = r3[r4]
            r0 = r0 & 128(0x80, float:1.8E-43)
            if (r0 == 0) goto Lf
            int r4 = r4 + r5
            r6 = r3[r6]
            r6 = r4
        Lf:
            int r4 = r6 + 1
            r0 = r3[r6]
            r1 = r0 & 255(0xff, float:3.57E-43)
            r2 = r0 & 128(0x80, float:1.8E-43)
            if (r2 == 0) goto L25
            r0 = r0 & 127(0x7f, float:1.78E-43)
            int r0 = r0 << 8
            int r6 = r6 + r5
            r4 = r3[r4]
            r4 = r4 & 255(0xff, float:3.57E-43)
            r1 = r0 | r4
            r4 = r6
        L25:
            java.lang.String r5 = new java.lang.String
            java.nio.charset.Charset r6 = i()
            r5.<init>(r3, r4, r1, r6)
            return r5
        L2f:
            r6 = r3[r4]
            r6 = r6 & 255(0xff, float:3.57E-43)
            int r0 = r4 + 1
            r0 = r3[r0]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r0 << 8
            r6 = r6 | r0
            r0 = 32768(0x8000, float:4.5918E-41)
            r0 = r0 & r6
            if (r0 == 0) goto L58
            r6 = r6 & 32767(0x7fff, float:4.5916E-41)
            int r6 = r6 << 16
            int r0 = r4 + 2
            r0 = r3[r0]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r1 = r4 + 3
            r1 = r3[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 8
            r0 = r0 | r1
            r6 = r6 | r0
            r0 = 4
            goto L59
        L58:
            r0 = 2
        L59:
            java.lang.String r1 = new java.lang.String
            int r4 = r4 + r0
            int r6 = r6 * 2
            java.nio.charset.Charset r5 = h()
            r1.<init>(r3, r4, r6, r5)
            return r1
    }

    private static byte[] b(java.lang.String r6, boolean r7) {
            java.lang.String r0 = "replacement string too long"
            r1 = 1
            r2 = 2
            r3 = 0
            if (r7 == 0) goto L34
            java.nio.charset.Charset r7 = i()
            byte[] r7 = r6.getBytes(r7)
            int r6 = r6.length()
            r4 = 128(0x80, float:1.8E-43)
            if (r6 >= r4) goto L2e
            int r5 = r7.length
            if (r5 >= r4) goto L2e
            int r0 = r7.length
            int r4 = r0 + 3
            byte[] r4 = new byte[r4]
            byte r6 = (byte) r6
            r4[r3] = r6
            int r6 = r7.length
            byte r6 = (byte) r6
            r4[r1] = r6
            int r6 = r7.length
            java.lang.System.arraycopy(r7, r3, r4, r2, r6)
            int r0 = r0 + r2
            r4[r0] = r3
            return r4
        L2e:
            java.io.IOException r6 = new java.io.IOException
            r6.<init>(r0)
            throw r6
        L34:
            int r7 = r6.length()
            r4 = 32767(0x7fff, float:4.5916E-41)
            if (r7 > r4) goto L5a
            java.nio.charset.Charset r7 = h()
            byte[] r7 = r6.getBytes(r7)
            int r6 = r6.length()
            int r0 = r7.length
            int r0 = r0 + 4
            byte[] r0 = new byte[r0]
            byte r4 = (byte) r6
            r0[r3] = r4
            int r6 = r6 >> 8
            byte r6 = (byte) r6
            r0[r1] = r6
            int r6 = r7.length
            java.lang.System.arraycopy(r7, r3, r0, r2, r6)
            return r0
        L5a:
            java.io.IOException r6 = new java.io.IOException
            r6.<init>(r0)
            throw r6
    }

    private static int c(byte[] r4, byte[] r5, int r6) {
            r0 = 0
            int r6 = java.lang.Math.max(r0, r6)
        L5:
            int r1 = r4.length
            int r2 = r5.length
            int r1 = r1 - r2
            if (r6 > r1) goto L1d
            r1 = 0
        Lb:
            int r2 = r5.length
            if (r1 >= r2) goto L1c
            int r2 = r6 + r1
            r2 = r4[r2]
            r3 = r5[r1]
            if (r2 == r3) goto L19
            int r6 = r6 + 1
            goto L5
        L19:
            int r1 = r1 + 1
            goto Lb
        L1c:
            return r6
        L1d:
            r4 = -1
            return r4
    }

    static byte[] d(byte[] r3, byte[] r4, byte[] r5, java.lang.String r6) {
            if (r3 == 0) goto L6c
            if (r4 == 0) goto L6c
            if (r5 == 0) goto L6c
            int r0 = r4.length
            if (r0 == 0) goto L55
            int r0 = r4.length
            int r1 = r5.length
            if (r0 != r1) goto L55
            r0 = 0
            int r1 = c(r3, r4, r0)
            if (r1 < 0) goto L3e
            int r2 = r1 + 1
            int r4 = c(r3, r4, r2)
            if (r4 >= 0) goto L27
            java.lang.Object r3 = r3.clone()
            byte[] r3 = (byte[]) r3
            int r4 = r5.length
            java.lang.System.arraycopy(r5, r0, r3, r1, r4)
            return r3
        L27:
            java.io.IOException r3 = new java.io.IOException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r6)
            java.lang.String r5 = ": expected byte pattern appears more than once"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        L3e:
            java.io.IOException r3 = new java.io.IOException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r6)
            java.lang.String r5 = ": expected byte pattern not found"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        L55:
            java.io.IOException r3 = new java.io.IOException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r6)
            java.lang.String r5 = ": replacement length must equal the pattern length"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        L6c:
            java.io.IOException r3 = new java.io.IOException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r6)
            java.lang.String r5 = ": null input"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
    }

    static byte[] e(byte[] r27, java.lang.String r28, java.lang.String r29, java.lang.String r30) {
            r0 = r27
            r1 = r28
            r2 = r29
            r3 = r30
            if (r0 == 0) goto L56c
            if (r1 == 0) goto L555
            if (r2 == 0) goto L555
            boolean r4 = r28.isEmpty()
            if (r4 != 0) goto L53e
            int r4 = r0.length
            r5 = 36
            if (r4 < r5) goto L527
            int r4 = r0.length
            r5 = 1048576(0x100000, float:1.469368E-39)
            if (r4 > r5) goto L510
            java.nio.ByteBuffer r4 = java.nio.ByteBuffer.wrap(r27)
            java.nio.ByteOrder r5 = java.nio.ByteOrder.LITTLE_ENDIAN
            java.nio.ByteBuffer r4 = r4.order(r5)
            r5 = 0
            short r6 = r4.getShort(r5)
            r7 = 65535(0xffff, float:9.1834E-41)
            r6 = r6 & r7
            r8 = 2
            short r8 = r4.getShort(r8)
            r8 = r8 & r7
            r9 = 4
            int r10 = r4.getInt(r9)
            r11 = 3
            if (r6 != r11) goto L4f9
            r6 = 8
            if (r8 != r6) goto L4e2
            if (r10 < r6) goto L4cb
            int r8 = r0.length
            if (r10 != r8) goto L4cb
            int r8 = r10 % 4
            if (r8 != 0) goto L4cb
            short r8 = r4.getShort(r6)
            r8 = r8 & r7
            r11 = 10
            short r11 = r4.getShort(r11)
            r11 = r11 & r7
            r12 = 12
            int r13 = r4.getInt(r12)
            r14 = 1
            if (r8 != r14) goto L4b4
            r8 = 28
            if (r11 < r8) goto L49d
            if (r13 < r11) goto L486
            int r15 = r13 % 4
            if (r15 != 0) goto L486
            long r6 = (long) r13
            r16 = 8
            long r18 = r6 + r16
            int r15 = r0.length
            r21 = r10
            long r9 = (long) r15
            int r15 = (r18 > r9 ? 1 : (r18 == r9 ? 0 : -1))
            if (r15 > 0) goto L486
            r9 = 16
            int r9 = r4.getInt(r9)
            r10 = 20
            int r10 = r4.getInt(r10)
            r15 = 24
            int r12 = r4.getInt(r15)
            int r8 = r4.getInt(r8)
            r15 = 32
            int r5 = r4.getInt(r15)
            r15 = r12 & 256(0x100, float:3.59E-43)
            if (r15 == 0) goto L9a
            r15 = 1
            goto L9b
        L9a:
            r15 = 0
        L9b:
            if (r9 < r14) goto L46f
            r14 = 65536(0x10000, float:9.1835E-41)
            if (r9 > r14) goto L46f
            if (r10 < 0) goto L458
            r14 = 4096(0x1000, float:5.74E-42)
            if (r10 > r14) goto L458
            int r14 = r8 % 4
            if (r14 != 0) goto L441
            if (r8 < r11) goto L441
            long r1 = (long) r8
            long r23 = r1 + r16
            int r14 = (r23 > r18 ? 1 : (r23 == r18 ? 0 : -1))
            if (r14 > 0) goto L441
            if (r10 <= 0) goto Ldd
            int r14 = r5 % 4
            if (r14 != 0) goto Lc6
            if (r5 <= r8) goto Lc6
            r23 = r15
            long r14 = (long) r5
            long r14 = r14 + r16
            int r24 = (r14 > r18 ? 1 : (r14 == r18 ? 0 : -1))
            if (r24 > 0) goto Lc6
            goto Ldf
        Lc6:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            java.lang.String r2 = ": stylesStart is not a 4-aligned offset after the strings"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        Ldd:
            r23 = r15
        Ldf:
            long r14 = (long) r11
            r18 = r12
            int r12 = r9 + r10
            r19 = r13
            long r12 = (long) r12
            r24 = 4
            long r12 = r12 * r24
            long r14 = r14 + r12
            int r12 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
            if (r12 > 0) goto L42a
            int[] r12 = new int[r9]
            r13 = 0
        Lf3:
            if (r13 >= r9) goto L150
            int r14 = r11 + 8
            int r15 = r13 * 4
            int r14 = r14 + r15
            int r14 = r4.getInt(r14)
            r12[r13] = r14
            if (r14 < 0) goto L131
            r24 = r8
            r15 = r9
            long r8 = (long) r14
            long r8 = r8 + r1
            int r25 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r25 >= 0) goto L131
            if (r13 <= 0) goto L12b
            int r8 = r13 + (-1)
            r8 = r12[r8]
            if (r14 < r8) goto L114
            goto L12b
        L114:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            java.lang.String r2 = ": string offsets are not non-decreasing"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L12b:
            int r13 = r13 + 1
            r9 = r15
            r8 = r24
            goto Lf3
        L131:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            java.lang.String r2 = ": string offset "
            r1.append(r2)
            r1.append(r13)
            java.lang.String r2 = " is outside the string data"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L150:
            r24 = r8
            r15 = r9
            r1 = 0
            r2 = r12[r1]
            if (r2 != 0) goto L413
            if (r10 <= 0) goto L1c0
            int r13 = r19 - r5
            r1 = 0
        L15d:
            if (r1 >= r10) goto L1c0
            int r2 = r11 + 8
            int r9 = r15 + r1
            int r6 = r9 * 4
            int r6 = r6 + r2
            int r6 = r4.getInt(r6)
            if (r6 < 0) goto L1a1
            long r7 = (long) r6
            long r7 = r7 + r16
            r25 = r15
            long r14 = (long) r13
            int r26 = (r7 > r14 ? 1 : (r7 == r14 ? 0 : -1))
            if (r26 > 0) goto L1a1
            if (r1 <= 0) goto L19c
            int r9 = r9 + (-1)
            r7 = 4
            int r9 = r9 * 4
            int r2 = r2 + r9
            int r2 = r4.getInt(r2)
            if (r6 < r2) goto L185
            goto L19c
        L185:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            java.lang.String r2 = ": style offsets are not non-decreasing"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L19c:
            int r1 = r1 + 1
            r15 = r25
            goto L15d
        L1a1:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r3)
            java.lang.String r3 = ": style offset "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = " is outside the style data"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        L1c0:
            r25 = r15
            int r13 = r19 + 8
            r1 = r13
        L1c5:
            int r2 = r0.length
            if (r1 >= r2) goto L227
            int r2 = r1 + 8
            int r6 = r0.length
            if (r2 > r6) goto L20d
            int r2 = r1 + 2
            short r2 = r4.getShort(r2)
            r6 = 65535(0xffff, float:9.1834E-41)
            r2 = r2 & r6
            int r7 = r1 + 4
            int r7 = r4.getInt(r7)
            r8 = 8
            if (r2 < r8) goto L1ee
            if (r7 < r2) goto L1ee
            long r8 = (long) r1
            long r14 = (long) r7
            long r8 = r8 + r14
            int r2 = r0.length
            long r14 = (long) r2
            int r2 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r2 > 0) goto L1ee
            int r1 = r1 + r7
            goto L1c5
        L1ee:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r3)
            java.lang.String r3 = ": trailing chunk at "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = " is invalid"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        L20d:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r3)
            java.lang.String r3 = ": trailing chunk header truncated at "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        L227:
            int r8 = r24 + 8
            if (r10 <= 0) goto L22e
            int r1 = r5 + 8
            goto L22f
        L22e:
            r1 = r13
        L22f:
            int r1 = r1 - r8
            r2 = r25
            int[] r4 = new int[r2]
            r6 = 0
        L235:
            if (r6 >= r2) goto L2e2
            r7 = r12[r6]
            int r9 = r6 + 1
            if (r9 >= r2) goto L240
            r14 = r12[r9]
            goto L241
        L240:
            r14 = r1
        L241:
            java.lang.String r15 = ": string "
            if (r14 <= r7) goto L2c5
            r16 = r1
            if (r23 == 0) goto L254
            int r1 = r8 + r7
            r17 = r13
            int r13 = r14 - r7
            int r1 = g(r0, r1, r13)
            goto L25e
        L254:
            r17 = r13
            int r1 = r8 + r7
            int r13 = r14 - r7
            int r1 = f(r0, r1, r13)
        L25e:
            r4[r6] = r1
            if (r1 <= 0) goto L2a8
            int r14 = r14 - r7
            if (r9 >= r2) goto L285
            if (r1 != r14) goto L268
            goto L28b
        L268:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            r1.append(r15)
            r1.append(r6)
            java.lang.String r2 = " does not tile up to the next offset"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L285:
            if (r1 > r14) goto L291
            int r14 = r14 - r1
            r1 = 4
            if (r14 >= r1) goto L291
        L28b:
            r6 = r9
            r1 = r16
            r13 = r17
            goto L235
        L291:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            java.lang.String r2 = ": trailing padding after the last string is invalid"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L2a8:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            r1.append(r15)
            r1.append(r6)
            java.lang.String r2 = " is malformed or truncated"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L2c5:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            r1.append(r15)
            r1.append(r6)
            java.lang.String r2 = " has an empty region"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L2e2:
            r17 = r13
            r1 = 0
            r6 = 0
        L2e6:
            if (r1 >= r2) goto L302
            r7 = r12[r1]
            int r7 = r7 + r8
            r9 = r4[r1]
            r14 = r23
            java.lang.String r7 = a(r0, r7, r9, r14)
            r9 = r28
            boolean r7 = r9.equals(r7)
            if (r7 == 0) goto L2fd
            int r6 = r6 + 1
        L2fd:
            int r1 = r1 + 1
            r23 = r14
            goto L2e6
        L302:
            r9 = r28
            r14 = r23
            if (r6 == 0) goto L3fc
            r1 = 1
            if (r6 > r1) goto L3e5
            r1 = r29
            byte[] r1 = b(r1, r14)
            r3 = 0
        L312:
            if (r3 >= r2) goto L327
            r6 = r12[r3]
            int r6 = r6 + r8
            r7 = r4[r3]
            java.lang.String r6 = a(r0, r6, r7, r14)
            boolean r6 = r9.equals(r6)
            if (r6 == 0) goto L324
            goto L328
        L324:
            int r3 = r3 + 1
            goto L312
        L327:
            r3 = -1
        L328:
            int r6 = r1.length
            r7 = r4[r3]
            int r6 = r6 - r7
            int r9 = r2 + (-1)
            r7 = r12[r9]
            r9 = r4[r9]
            int r7 = r7 + r9
            int r7 = r24 + r7
            int r7 = r7 + r6
            int r9 = r7 % 4
            r13 = 4
            int r9 = 4 - r9
            int r9 = r9 % r13
            if (r10 <= 0) goto L343
            int r7 = r7 + r9
            int r13 = r19 - r5
            int r13 = r13 + r7
            goto L346
        L343:
            int r13 = r7 + r9
            r7 = 0
        L346:
            int r14 = r13 - r19
            int r15 = r0.length
            int r15 = r15 + r14
            byte[] r15 = new byte[r15]
            r29 = r1
            r1 = 0
            java.lang.System.arraycopy(r0, r1, r15, r1, r8)
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.wrap(r15)
            r28 = r14
            java.nio.ByteOrder r14 = java.nio.ByteOrder.LITTLE_ENDIAN
            java.nio.ByteBuffer r1 = r1.order(r14)
            r30 = r13
            r13 = 0
            r14 = 0
        L362:
            if (r14 >= r2) goto L3a9
            if (r14 != r3) goto L36d
            r25 = r2
            r22 = r4
            r2 = r29
            goto L37f
        L36d:
            r16 = r12[r14]
            r25 = r2
            int r2 = r8 + r16
            int r16 = r8 + r16
            r20 = r4[r14]
            r22 = r4
            int r4 = r16 + r20
            byte[] r2 = java.util.Arrays.copyOfRange(r0, r2, r4)
        L37f:
            if (r14 <= r3) goto L386
            r4 = r12[r14]
            int r4 = r4 + r6
            r12[r14] = r4
        L386:
            r4 = 8
            int r16 = r11 + 8
            int r4 = r14 * 4
            int r4 = r16 + r4
            r1.putInt(r4, r13)
            int r4 = r8 + r13
            r16 = r3
            int r3 = r2.length
            r20 = r6
            r6 = 0
            java.lang.System.arraycopy(r2, r6, r15, r4, r3)
            int r2 = r2.length
            int r13 = r13 + r2
            int r14 = r14 + 1
            r3 = r16
            r6 = r20
            r4 = r22
            r2 = r25
            goto L362
        L3a9:
            r6 = 0
            r2 = 0
        L3ab:
            if (r2 >= r9) goto L3b5
            int r3 = r8 + r13
            int r3 = r3 + r2
            r15[r3] = r6
            int r2 = r2 + 1
            goto L3ab
        L3b5:
            int r13 = r13 + r9
            if (r10 <= 0) goto L3c5
            int r2 = r5 + 8
            int r8 = r8 + r13
            int r13 = r19 - r5
            java.lang.System.arraycopy(r0, r2, r15, r8, r13)
            r2 = 32
            r1.putInt(r2, r7)
        L3c5:
            r13 = r30
            r2 = 12
            r1.putInt(r2, r13)
            r2 = r18 & (-2)
            r3 = 24
            r1.putInt(r3, r2)
            int r10 = r21 + r28
            r2 = 4
            r1.putInt(r2, r10)
            r1 = 8
            int r13 = r13 + r1
            int r1 = r0.length
            int r1 = r1 - r17
            r2 = r17
            java.lang.System.arraycopy(r0, r2, r15, r13, r1)
            return r15
        L3e5:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            java.lang.String r2 = ": expected string appears more than once in the string pool"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L3fc:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            java.lang.String r2 = ": expected string not found in the string pool"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L413:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            java.lang.String r2 = ": first string offset is not zero"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L42a:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            java.lang.String r2 = ": string offsets overlap the string data"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L441:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            java.lang.String r2 = ": stringsStart is not a 4-aligned offset inside the pool"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L458:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            java.lang.String r2 = ": style count is out of bounds"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L46f:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            java.lang.String r2 = ": string count is out of bounds"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L486:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            java.lang.String r2 = ": string pool size is not a valid chunk"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L49d:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            java.lang.String r2 = ": string pool header size is too small"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L4b4:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            java.lang.String r2 = ": chunk after the root header is not a string pool"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L4cb:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            java.lang.String r2 = ": root chunk size does not match the document"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L4e2:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            java.lang.String r2 = ": root chunk header size is not 8"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L4f9:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            java.lang.String r2 = ": root chunk type is not RES_XML_TYPE"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L510:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            java.lang.String r2 = ": binary XML unreasonably large"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L527:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            java.lang.String r2 = ": binary XML too small for a root + string pool header"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L53e:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            java.lang.String r2 = ": expected string is empty"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L555:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            java.lang.String r2 = ": expected/replacement strings are null"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L56c:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            java.lang.String r2 = ": binary XML is null"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    private static int f(byte[] r6, int r7, int r8) {
            r0 = 0
            r1 = 4
            if (r8 >= r1) goto L5
            return r0
        L5:
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.wrap(r6)
            java.nio.ByteOrder r3 = java.nio.ByteOrder.LITTLE_ENDIAN
            java.nio.ByteBuffer r2 = r2.order(r3)
            char r3 = r2.getChar(r7)
            r4 = 32768(0x8000, float:4.5918E-41)
            r4 = r4 & r3
            r5 = 2
            if (r4 == 0) goto L2a
            r4 = 6
            if (r8 >= r4) goto L1e
            return r0
        L1e:
            r3 = r3 & 32767(0x7fff, float:4.5916E-41)
            int r3 = r3 << 16
            int r4 = r7 + 2
            char r2 = r2.getChar(r4)
            r3 = r3 | r2
            goto L2b
        L2a:
            r1 = 2
        L2b:
            r2 = 32767(0x7fff, float:4.5916E-41)
            if (r3 <= r2) goto L30
            return r0
        L30:
            int r3 = r3 * 2
            int r1 = r1 + r3
            int r1 = r1 + r5
            if (r1 > r8) goto L45
            int r7 = r7 + r1
            int r8 = r7 + (-2)
            r8 = r6[r8]
            if (r8 != 0) goto L45
            int r7 = r7 + (-1)
            r6 = r6[r7]
            if (r6 == 0) goto L44
            goto L45
        L44:
            return r1
        L45:
            return r0
    }

    private static int g(byte[] r8, int r9, int r10) {
            int r0 = r9 + r10
            int r1 = r0 - r9
            r2 = 3
            r3 = 0
            if (r1 >= r2) goto L9
            return r3
        L9:
            int r1 = r9 + 1
            r2 = r8[r9]
            r4 = r2 & 255(0xff, float:3.57E-43)
            r5 = r2 & 128(0x80, float:1.8E-43)
            if (r5 == 0) goto L24
            if (r1 < r0) goto L16
            return r3
        L16:
            r2 = r2 & 127(0x7f, float:1.78E-43)
            int r2 = r2 << 8
            int r4 = r9 + 2
            r1 = r8[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            r1 = r1 | r2
            r7 = r4
            r4 = r1
            r1 = r7
        L24:
            r2 = 32767(0x7fff, float:4.5916E-41)
            if (r4 <= r2) goto L29
            return r3
        L29:
            int r2 = r1 + 1
            r4 = r8[r1]
            r5 = r4 & 255(0xff, float:3.57E-43)
            r6 = r4 & 128(0x80, float:1.8E-43)
            if (r6 == 0) goto L43
            if (r2 < r0) goto L36
            return r3
        L36:
            r0 = r4 & 127(0x7f, float:1.78E-43)
            int r0 = r0 << 8
            int r1 = r1 + 2
            r2 = r8[r2]
            r2 = r2 & 255(0xff, float:3.57E-43)
            r5 = r0 | r2
            r2 = r1
        L43:
            int r2 = r2 - r9
            int r2 = r2 + r5
            int r2 = r2 + 1
            if (r2 <= r10) goto L4a
            return r3
        L4a:
            int r9 = r9 + r2
            int r9 = r9 + (-1)
            r8 = r8[r9]
            if (r8 == 0) goto L52
            return r3
        L52:
            return r2
    }

    private static java.nio.charset.Charset h() {
            java.nio.charset.Charset r0 = android.ext.s.f1236a
            return r0
    }

    private static java.nio.charset.Charset i() {
            java.nio.charset.Charset r0 = android.ext.s.f1237b
            return r0
    }
}
