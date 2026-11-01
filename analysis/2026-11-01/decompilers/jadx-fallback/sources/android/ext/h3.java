package android.ext;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public abstract class h3 {
    public static void a(java.io.File r29) {
            java.lang.String r1 = "ZipAlign close fail"
            java.io.RandomAccessFile r4 = new java.io.RandomAccessFile     // Catch: java.lang.Throwable -> L35a java.io.IOException -> L3b3
            java.lang.String r0 = "rw"
            r5 = r29
            r4.<init>(r5, r0)     // Catch: java.lang.Throwable -> L35a java.io.IOException -> L3b3
            long r6 = r4.length()     // Catch: java.lang.Throwable -> L1a java.io.IOException -> L1dc
            r8 = 0
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r0 != 0) goto L24
            long r6 = r29.length()     // Catch: java.lang.Throwable -> L1a java.io.IOException -> L1f
            goto L24
        L1a:
            r0 = move-exception
            r2 = r0
            r3 = r4
            goto L3ce
        L1f:
            r0 = move-exception
        L20:
            r3 = r4
            r2 = 0
            goto L3b7
        L24:
            r10 = 22
            r0 = 32
            int r12 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r12 >= 0) goto L54
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1a java.io.IOException -> L1f
            r3.<init>()     // Catch: java.lang.Throwable -> L1a java.io.IOException -> L1f
            java.lang.String r8 = "ZipAlign small size: "
            r3.append(r8)     // Catch: java.lang.Throwable -> L1a java.io.IOException -> L1f
            r3.append(r6)     // Catch: java.lang.Throwable -> L1a java.io.IOException -> L1f
            r3.append(r0)     // Catch: java.lang.Throwable -> L1a java.io.IOException -> L1f
            java.lang.String r0 = r29.getAbsolutePath()     // Catch: java.lang.Throwable -> L1a java.io.IOException -> L1f
            r3.append(r0)     // Catch: java.lang.Throwable -> L1a java.io.IOException -> L1f
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Throwable -> L1a java.io.IOException -> L1f
            android.ext.e1.p(r0)     // Catch: java.lang.Throwable -> L1a java.io.IOException -> L1f
            r4.close()     // Catch: java.lang.Throwable -> L4e
            goto L53
        L4e:
            r0 = move-exception
            r2 = r0
            android.ext.e1.l(r1, r2)
        L53:
            return
        L54:
            long r10 = r6 - r10
            r12 = 12
            long r12 = r6 - r12
            r4.seek(r12)     // Catch: java.lang.Throwable -> L1a java.io.IOException -> L1dc
            short r5 = e(r4)     // Catch: java.lang.Throwable -> L1a java.io.IOException -> L1dc
            int r12 = d(r4)     // Catch: java.lang.Throwable -> L1a java.io.IOException -> L1dc
            int r13 = d(r4)     // Catch: java.lang.Throwable -> L1a java.io.IOException -> L1dc
            long r13 = (long) r13
            java.lang.String r15 = ", "
            if (r5 <= 0) goto L74
            if (r12 <= 0) goto L74
            int r16 = (r13 > r8 ? 1 : (r13 == r8 ? 0 : -1))
            if (r16 > 0) goto L7c
        L74:
            r23 = r5
            r2 = r12
            r8 = r13
            r0 = r15
            r5 = 0
            goto L387
        L7c:
            long r8 = (long) r12
            long r8 = r8 + r13
            java.lang.String r3 = " + "
            java.lang.String r2 = " = "
            java.lang.String r0 = " != "
            int r17 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r17 == 0) goto Lb8
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1a java.io.IOException -> L1f
            r5.<init>()     // Catch: java.lang.Throwable -> L1a java.io.IOException -> L1f
            java.lang.String r6 = "Bad EOCD offset: "
            r5.append(r6)     // Catch: java.lang.Throwable -> L1a java.io.IOException -> L1f
            r5.append(r10)     // Catch: java.lang.Throwable -> L1a java.io.IOException -> L1f
            r5.append(r0)     // Catch: java.lang.Throwable -> L1a java.io.IOException -> L1f
            r5.append(r8)     // Catch: java.lang.Throwable -> L1a java.io.IOException -> L1f
            r5.append(r2)     // Catch: java.lang.Throwable -> L1a java.io.IOException -> L1f
            r5.append(r13)     // Catch: java.lang.Throwable -> L1a java.io.IOException -> L1f
            r5.append(r3)     // Catch: java.lang.Throwable -> L1a java.io.IOException -> L1f
            r5.append(r12)     // Catch: java.lang.Throwable -> L1a java.io.IOException -> L1f
            java.lang.String r0 = r5.toString()     // Catch: java.lang.Throwable -> L1a java.io.IOException -> L1f
            android.ext.e1.p(r0)     // Catch: java.lang.Throwable -> L1a java.io.IOException -> L1f
            r4.close()     // Catch: java.lang.Throwable -> Lb2
            goto Lb7
        Lb2:
            r0 = move-exception
            r2 = r0
            android.ext.e1.l(r1, r2)
        Lb7:
            return
        Lb8:
            java.io.ByteArrayOutputStream r11 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L362
            int r10 = r12 + 22
            r11.<init>(r10)     // Catch: java.lang.Throwable -> L362
            r21 = r0
            r17 = r6
            r6 = r13
            r19 = r6
            r10 = 0
        Lc7:
            java.lang.String r0 = " > "
            if (r10 >= r5) goto L20e
            r22 = r15
            java.lang.String r15 = "; "
            int r23 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r23 < 0) goto L12a
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L123 java.io.IOException -> L126
            r11.<init>()     // Catch: java.lang.Throwable -> L123 java.io.IOException -> L126
            r23 = r1
            java.lang.String r1 = "Out from CD: "
            r11.append(r1)     // Catch: java.lang.Throwable -> L115 java.io.IOException -> L11d
            r11.append(r10)     // Catch: java.lang.Throwable -> L115 java.io.IOException -> L11d
            java.lang.String r1 = " from "
            r11.append(r1)     // Catch: java.lang.Throwable -> L115 java.io.IOException -> L11d
            r11.append(r5)     // Catch: java.lang.Throwable -> L115 java.io.IOException -> L11d
            r11.append(r15)     // Catch: java.lang.Throwable -> L115 java.io.IOException -> L11d
            r11.append(r6)     // Catch: java.lang.Throwable -> L115 java.io.IOException -> L11d
            r11.append(r0)     // Catch: java.lang.Throwable -> L115 java.io.IOException -> L11d
            r11.append(r8)     // Catch: java.lang.Throwable -> L115 java.io.IOException -> L11d
            r11.append(r2)     // Catch: java.lang.Throwable -> L115 java.io.IOException -> L11d
            r11.append(r13)     // Catch: java.lang.Throwable -> L115 java.io.IOException -> L11d
            r11.append(r3)     // Catch: java.lang.Throwable -> L115 java.io.IOException -> L11d
            r11.append(r12)     // Catch: java.lang.Throwable -> L115 java.io.IOException -> L11d
            java.lang.String r0 = r11.toString()     // Catch: java.lang.Throwable -> L115 java.io.IOException -> L11d
            android.ext.e1.p(r0)     // Catch: java.lang.Throwable -> L115 java.io.IOException -> L11d
            r4.close()     // Catch: java.lang.Throwable -> L10d
            goto L114
        L10d:
            r0 = move-exception
            r1 = r0
            r2 = r23
            android.ext.e1.l(r2, r1)
        L114:
            return
        L115:
            r0 = move-exception
            r2 = r23
            r1 = r2
        L119:
            r3 = r4
        L11a:
            r2 = r0
            goto L3ce
        L11d:
            r0 = move-exception
            r2 = r23
            r1 = r2
            goto L20
        L123:
            r0 = move-exception
            r2 = r1
            goto L119
        L126:
            r0 = move-exception
            r2 = r1
            goto L20
        L12a:
            r23 = 28
            r25 = r12
            r26 = r13
            long r12 = r6 + r23
            r4.seek(r12)     // Catch: java.lang.Throwable -> L1a java.io.IOException -> L1dc
            short r0 = e(r4)     // Catch: java.lang.Throwable -> L1a java.io.IOException -> L1dc
            short r12 = e(r4)     // Catch: java.lang.Throwable -> L1a java.io.IOException -> L1dc
            if (r0 < 0) goto L141
            if (r12 >= 0) goto L144
        L141:
            r5 = 0
            goto L1e0
        L144:
            int r0 = r0 + 46
            byte[] r13 = new byte[r0]     // Catch: java.lang.Throwable -> L1a java.io.IOException -> L1dc
            r4.seek(r6)     // Catch: java.lang.Throwable -> L1a java.io.IOException -> L1dc
            r24 = r3
            r23 = r5
            r5 = 0
            r14 = 0
        L151:
            r3 = 10
            if (r14 >= r3) goto L157
            if (r5 < r0) goto L15a
        L157:
            r28 = r2
            goto L193
        L15a:
            int r3 = r0 - r5
            int r3 = r4.read(r13, r5, r3)     // Catch: java.lang.Throwable -> L1a java.io.IOException -> L1f
            if (r3 >= 0) goto L18d
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1a java.io.IOException -> L1f
            r14.<init>()     // Catch: java.lang.Throwable -> L1a java.io.IOException -> L1f
            r28 = r2
            java.lang.String r2 = "Failed read buf 1: "
            r14.append(r2)     // Catch: java.lang.Throwable -> L1a java.io.IOException -> L1f
            r14.append(r10)     // Catch: java.lang.Throwable -> L1a java.io.IOException -> L1f
            r14.append(r15)     // Catch: java.lang.Throwable -> L1a java.io.IOException -> L1f
            r14.append(r3)     // Catch: java.lang.Throwable -> L1a java.io.IOException -> L1f
            r2 = 32
            r14.append(r2)     // Catch: java.lang.Throwable -> L1a java.io.IOException -> L1f
            r14.append(r5)     // Catch: java.lang.Throwable -> L1a java.io.IOException -> L1f
            r14.append(r2)     // Catch: java.lang.Throwable -> L1a java.io.IOException -> L1f
            r14.append(r0)     // Catch: java.lang.Throwable -> L1a java.io.IOException -> L1f
            java.lang.String r2 = r14.toString()     // Catch: java.lang.Throwable -> L1a java.io.IOException -> L1f
            android.ext.e1.p(r2)     // Catch: java.lang.Throwable -> L1a java.io.IOException -> L1f
            goto L193
        L18d:
            r28 = r2
            int r5 = r5 + r3
            int r14 = r14 + 1
            goto L151
        L193:
            if (r5 >= r0) goto L1b8
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1a java.io.IOException -> L1f
            r2.<init>()     // Catch: java.lang.Throwable -> L1a java.io.IOException -> L1f
            java.lang.String r3 = "Failed read buf 2: "
            r2.append(r3)     // Catch: java.lang.Throwable -> L1a java.io.IOException -> L1f
            r2.append(r10)     // Catch: java.lang.Throwable -> L1a java.io.IOException -> L1f
            r2.append(r15)     // Catch: java.lang.Throwable -> L1a java.io.IOException -> L1f
            r2.append(r5)     // Catch: java.lang.Throwable -> L1a java.io.IOException -> L1f
            r3 = 32
            r2.append(r3)     // Catch: java.lang.Throwable -> L1a java.io.IOException -> L1f
            r2.append(r0)     // Catch: java.lang.Throwable -> L1a java.io.IOException -> L1f
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L1a java.io.IOException -> L1f
            android.ext.e1.p(r2)     // Catch: java.lang.Throwable -> L1a java.io.IOException -> L1f
            goto L1ba
        L1b8:
            r3 = 32
        L1ba:
            r2 = 30
            r5 = 0
            r13[r2] = r5     // Catch: java.lang.Throwable -> L1a java.io.IOException -> L1f
            r2 = 31
            r13[r2] = r5     // Catch: java.lang.Throwable -> L1a java.io.IOException -> L1f
            r11.write(r13)     // Catch: java.lang.Throwable -> L1a java.io.IOException -> L1f
            int r12 = r12 + r0
            long r12 = (long) r12     // Catch: java.lang.Throwable -> L1a java.io.IOException -> L1f
            long r6 = r6 + r12
            long r12 = (long) r0     // Catch: java.lang.Throwable -> L1a java.io.IOException -> L1f
            long r19 = r19 + r12
            int r10 = r10 + 1
            r15 = r22
            r5 = r23
            r3 = r24
            r12 = r25
            r13 = r26
            r2 = r28
            goto Lc7
        L1dc:
            r0 = move-exception
            r5 = 0
            goto L20
        L1e0:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1a java.io.IOException -> L1f
            r2.<init>()     // Catch: java.lang.Throwable -> L1a java.io.IOException -> L1f
            java.lang.String r3 = "bad len for "
            r2.append(r3)     // Catch: java.lang.Throwable -> L1a java.io.IOException -> L1f
            r2.append(r10)     // Catch: java.lang.Throwable -> L1a java.io.IOException -> L1f
            java.lang.String r3 = ": "
            r2.append(r3)     // Catch: java.lang.Throwable -> L1a java.io.IOException -> L1f
            r2.append(r0)     // Catch: java.lang.Throwable -> L1a java.io.IOException -> L1f
            r0 = r22
            r2.append(r0)     // Catch: java.lang.Throwable -> L1a java.io.IOException -> L1f
            r2.append(r12)     // Catch: java.lang.Throwable -> L1a java.io.IOException -> L1f
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> L1a java.io.IOException -> L1f
            android.ext.e1.p(r0)     // Catch: java.lang.Throwable -> L1a java.io.IOException -> L1f
            r4.close()     // Catch: java.lang.Throwable -> L208
            goto L20d
        L208:
            r0 = move-exception
            r2 = r0
            android.ext.e1.l(r1, r2)
        L20d:
            return
        L20e:
            r28 = r2
            r24 = r3
            r25 = r12
            r26 = r13
            r5 = 0
            int r2 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r2 == 0) goto L255
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1a java.io.IOException -> L1f
            r0.<init>()     // Catch: java.lang.Throwable -> L1a java.io.IOException -> L1f
            java.lang.String r2 = "Not all CD reads: "
            r0.append(r2)     // Catch: java.lang.Throwable -> L1a java.io.IOException -> L1f
            r0.append(r6)     // Catch: java.lang.Throwable -> L1a java.io.IOException -> L1f
            r2 = r21
            r0.append(r2)     // Catch: java.lang.Throwable -> L1a java.io.IOException -> L1f
            r0.append(r8)     // Catch: java.lang.Throwable -> L1a java.io.IOException -> L1f
            r2 = r28
            r0.append(r2)     // Catch: java.lang.Throwable -> L1a java.io.IOException -> L1f
            r8 = r26
            r0.append(r8)     // Catch: java.lang.Throwable -> L1a java.io.IOException -> L1f
            r2 = r24
            r0.append(r2)     // Catch: java.lang.Throwable -> L1a java.io.IOException -> L1f
            r2 = r25
            r0.append(r2)     // Catch: java.lang.Throwable -> L1a java.io.IOException -> L1f
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L1a java.io.IOException -> L1f
            android.ext.e1.p(r0)     // Catch: java.lang.Throwable -> L1a java.io.IOException -> L1f
            r4.close()     // Catch: java.lang.Throwable -> L24f
            goto L254
        L24f:
            r0 = move-exception
            r2 = r0
            android.ext.e1.l(r1, r2)
        L254:
            return
        L255:
            r2 = r21
            r8 = r26
            int r3 = (r6 > r19 ? 1 : (r6 == r19 ? 0 : -1))
            if (r3 == 0) goto L329
            r3 = 22
            byte[] r10 = new byte[r3]     // Catch: java.lang.Throwable -> L1a java.io.IOException -> L1f
            r4.seek(r6)     // Catch: java.lang.Throwable -> L1a java.io.IOException -> L1f
            r4.read(r10)     // Catch: java.lang.Throwable -> L1a java.io.IOException -> L1f
            long r12 = r19 - r8
            int r3 = (int) r12     // Catch: java.lang.Throwable -> L1a java.io.IOException -> L1f
            r12 = r3 & 255(0xff, float:3.57E-43)
            byte r12 = (byte) r12     // Catch: java.lang.Throwable -> L1a java.io.IOException -> L1f
            r13 = 12
            r10[r13] = r12     // Catch: java.lang.Throwable -> L1a java.io.IOException -> L1f
            int r12 = r3 >>> 8
            r12 = r12 & 255(0xff, float:3.57E-43)
            byte r12 = (byte) r12     // Catch: java.lang.Throwable -> L1a java.io.IOException -> L1f
            r13 = 13
            r10[r13] = r12     // Catch: java.lang.Throwable -> L1a java.io.IOException -> L1f
            int r12 = r3 >>> 16
            r12 = r12 & 255(0xff, float:3.57E-43)
            byte r12 = (byte) r12     // Catch: java.lang.Throwable -> L1a java.io.IOException -> L1f
            r13 = 14
            r10[r13] = r12     // Catch: java.lang.Throwable -> L1a java.io.IOException -> L1f
            int r3 = r3 >>> 24
            r3 = r3 & 255(0xff, float:3.57E-43)
            byte r3 = (byte) r3     // Catch: java.lang.Throwable -> L1a java.io.IOException -> L1f
            r12 = 15
            r10[r12] = r3     // Catch: java.lang.Throwable -> L1a java.io.IOException -> L1f
            r11.write(r10)     // Catch: java.lang.Throwable -> L1a java.io.IOException -> L1f
            r3 = 22
            long r12 = (long) r3     // Catch: java.lang.Throwable -> L1a java.io.IOException -> L1f
            long r6 = r6 + r12
            long r12 = r19 + r12
            int r3 = (r6 > r17 ? 1 : (r6 == r17 ? 0 : -1))
            if (r3 == 0) goto L2bf
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1a java.io.IOException -> L1f
            r0.<init>()     // Catch: java.lang.Throwable -> L1a java.io.IOException -> L1f
            java.lang.String r3 = "Fail check end: "
            r0.append(r3)     // Catch: java.lang.Throwable -> L1a java.io.IOException -> L1f
            r0.append(r6)     // Catch: java.lang.Throwable -> L1a java.io.IOException -> L1f
            r0.append(r2)     // Catch: java.lang.Throwable -> L1a java.io.IOException -> L1f
            r6 = r17
            r0.append(r6)     // Catch: java.lang.Throwable -> L1a java.io.IOException -> L1f
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L1a java.io.IOException -> L1f
            android.ext.e1.p(r0)     // Catch: java.lang.Throwable -> L1a java.io.IOException -> L1f
            r4.close()     // Catch: java.lang.Throwable -> L2b9
            goto L2be
        L2b9:
            r0 = move-exception
            r2 = r0
            android.ext.e1.l(r1, r2)
        L2be:
            return
        L2bf:
            int r3 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
            if (r3 <= 0) goto L2e7
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1a java.io.IOException -> L1f
            r2.<init>()     // Catch: java.lang.Throwable -> L1a java.io.IOException -> L1f
            java.lang.String r3 = "Fail check new length: "
            r2.append(r3)     // Catch: java.lang.Throwable -> L1a java.io.IOException -> L1f
            r2.append(r12)     // Catch: java.lang.Throwable -> L1a java.io.IOException -> L1f
            r2.append(r0)     // Catch: java.lang.Throwable -> L1a java.io.IOException -> L1f
            r2.append(r6)     // Catch: java.lang.Throwable -> L1a java.io.IOException -> L1f
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> L1a java.io.IOException -> L1f
            android.ext.e1.p(r0)     // Catch: java.lang.Throwable -> L1a java.io.IOException -> L1f
            r4.close()     // Catch: java.lang.Throwable -> L2e1
            goto L2e6
        L2e1:
            r0 = move-exception
            r2 = r0
            android.ext.e1.l(r1, r2)
        L2e6:
            return
        L2e7:
            byte[] r0 = r11.toByteArray()     // Catch: java.lang.Throwable -> L1a java.io.IOException -> L1f
            int r3 = r0.length     // Catch: java.lang.Throwable -> L1a java.io.IOException -> L1f
            long r10 = (long) r3     // Catch: java.lang.Throwable -> L1a java.io.IOException -> L1f
            long r10 = r10 + r8
            int r3 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r3 == 0) goto L31a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1a java.io.IOException -> L1f
            r3.<init>()     // Catch: java.lang.Throwable -> L1a java.io.IOException -> L1f
            java.lang.String r6 = "Fail check buffer length: "
            r3.append(r6)     // Catch: java.lang.Throwable -> L1a java.io.IOException -> L1f
            r3.append(r12)     // Catch: java.lang.Throwable -> L1a java.io.IOException -> L1f
            r3.append(r2)     // Catch: java.lang.Throwable -> L1a java.io.IOException -> L1f
            r3.append(r8)     // Catch: java.lang.Throwable -> L1a java.io.IOException -> L1f
            int r0 = r0.length     // Catch: java.lang.Throwable -> L1a java.io.IOException -> L1f
            r3.append(r0)     // Catch: java.lang.Throwable -> L1a java.io.IOException -> L1f
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Throwable -> L1a java.io.IOException -> L1f
            android.ext.e1.p(r0)     // Catch: java.lang.Throwable -> L1a java.io.IOException -> L1f
            r4.close()     // Catch: java.lang.Throwable -> L314
            goto L319
        L314:
            r0 = move-exception
            r2 = r0
            android.ext.e1.l(r1, r2)
        L319:
            return
        L31a:
            r4.seek(r8)     // Catch: java.lang.Throwable -> L1a java.io.IOException -> L1f
            r2 = 1
            r4.write(r0)     // Catch: java.lang.Throwable -> L1a java.io.IOException -> L325
            r4.setLength(r12)     // Catch: java.lang.Throwable -> L1a java.io.IOException -> L325
            goto L32c
        L325:
            r0 = move-exception
            r3 = r4
            goto L3b7
        L329:
            r12 = r19
            r2 = 0
        L32c:
            r4.close()     // Catch: java.lang.Throwable -> L1a java.io.IOException -> L325
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L35a java.io.IOException -> L35f
            r0.<init>()     // Catch: java.lang.Throwable -> L35a java.io.IOException -> L35f
            java.lang.String r3 = "ZipAlign fix: "
            r0.append(r3)     // Catch: java.lang.Throwable -> L35a java.io.IOException -> L35f
            r0.append(r6)     // Catch: java.lang.Throwable -> L35a java.io.IOException -> L35f
            java.lang.String r3 = " => "
            r0.append(r3)     // Catch: java.lang.Throwable -> L35a java.io.IOException -> L35f
            r0.append(r12)     // Catch: java.lang.Throwable -> L35a java.io.IOException -> L35f
            java.lang.String r3 = " ("
            r0.append(r3)     // Catch: java.lang.Throwable -> L35a java.io.IOException -> L35f
            long r6 = r6 - r12
            r0.append(r6)     // Catch: java.lang.Throwable -> L35a java.io.IOException -> L35f
            r3 = 41
            r0.append(r3)     // Catch: java.lang.Throwable -> L35a java.io.IOException -> L35f
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L35a java.io.IOException -> L35f
            android.ext.e1.d(r0)     // Catch: java.lang.Throwable -> L35a java.io.IOException -> L35f
            return
        L35a:
            r0 = move-exception
            r2 = r0
            r3 = 0
            goto L3ce
        L35f:
            r0 = move-exception
        L360:
            r3 = 0
            goto L3b7
        L362:
            r0 = move-exception
            r2 = r12
            r5 = 0
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1a java.io.IOException -> L1f
            r3.<init>()     // Catch: java.lang.Throwable -> L1a java.io.IOException -> L1f
            java.lang.String r6 = "ZipAlign failed alloc: "
            r3.append(r6)     // Catch: java.lang.Throwable -> L1a java.io.IOException -> L1f
            r6 = 22
            int r12 = r2 + 22
            r3.append(r12)     // Catch: java.lang.Throwable -> L1a java.io.IOException -> L1f
            java.lang.String r2 = r3.toString()     // Catch: java.lang.Throwable -> L1a java.io.IOException -> L1f
            android.ext.e1.s(r2, r0)     // Catch: java.lang.Throwable -> L1a java.io.IOException -> L1f
            r4.close()     // Catch: java.lang.Throwable -> L381
            goto L386
        L381:
            r0 = move-exception
            r2 = r0
            android.ext.e1.l(r1, r2)
        L386:
            return
        L387:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1a java.io.IOException -> L1f
            r3.<init>()     // Catch: java.lang.Throwable -> L1a java.io.IOException -> L1f
            java.lang.String r6 = "bad values in EOCD: "
            r3.append(r6)     // Catch: java.lang.Throwable -> L1a java.io.IOException -> L1f
            r6 = r23
            r3.append(r6)     // Catch: java.lang.Throwable -> L1a java.io.IOException -> L1f
            r3.append(r0)     // Catch: java.lang.Throwable -> L1a java.io.IOException -> L1f
            r3.append(r2)     // Catch: java.lang.Throwable -> L1a java.io.IOException -> L1f
            r3.append(r0)     // Catch: java.lang.Throwable -> L1a java.io.IOException -> L1f
            r3.append(r8)     // Catch: java.lang.Throwable -> L1a java.io.IOException -> L1f
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Throwable -> L1a java.io.IOException -> L1f
            android.ext.e1.p(r0)     // Catch: java.lang.Throwable -> L1a java.io.IOException -> L1f
            r4.close()     // Catch: java.lang.Throwable -> L3ad
            goto L3b2
        L3ad:
            r0 = move-exception
            r2 = r0
            android.ext.e1.l(r1, r2)
        L3b2:
            return
        L3b3:
            r0 = move-exception
            r5 = 0
            r2 = 0
            goto L360
        L3b7:
            java.lang.String r4 = "ZipAlign fail"
            android.ext.e1.l(r4, r0)     // Catch: java.lang.Throwable -> L3cb
            if (r2 != 0) goto L3ca
            if (r3 == 0) goto L3c9
            r3.close()     // Catch: java.lang.Throwable -> L3c4
            goto L3c9
        L3c4:
            r0 = move-exception
            r2 = r0
            android.ext.e1.l(r1, r2)
        L3c9:
            return
        L3ca:
            throw r0     // Catch: java.lang.Throwable -> L3cb
        L3cb:
            r0 = move-exception
            goto L11a
        L3ce:
            if (r3 == 0) goto L3d9
            r3.close()     // Catch: java.lang.Throwable -> L3d4
            goto L3d9
        L3d4:
            r0 = move-exception
            r3 = r0
            android.ext.e1.l(r1, r3)
        L3d9:
            throw r2
    }

    static boolean b(java.lang.String r2) {
            r0 = 0
            if (r2 == 0) goto L1e
            java.lang.String r1 = "lib/"
            boolean r1 = r2.startsWith(r1)
            if (r1 == 0) goto L1e
            java.lang.String r1 = ".so"
            boolean r1 = r2.endsWith(r1)
            if (r1 != 0) goto L14
            goto L1e
        L14:
            r1 = 47
            int r2 = r2.lastIndexOf(r1)
            r1 = 4
            if (r2 <= r1) goto L1e
            r0 = 1
        L1e:
            return r0
    }

    private static boolean c(long r3) {
            r0 = 4095(0xfff, double:2.023E-320)
            long r3 = r3 & r0
            r0 = 0
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 != 0) goto Lb
            r3 = 1
            goto Lc
        Lb:
            r3 = 0
        Lc:
            return r3
    }

    public static int d(java.io.RandomAccessFile r4) {
            int r0 = r4.read()
            int r1 = r4.read()
            int r2 = r4.read()
            int r4 = r4.read()
            r3 = r0 | r1
            r3 = r3 | r2
            r3 = r3 | r4
            if (r3 < 0) goto L20
            int r4 = r4 << 24
            int r2 = r2 << 16
            int r4 = r4 + r2
            int r1 = r1 << 8
            int r4 = r4 + r1
            int r4 = r4 + r0
            return r4
        L20:
            java.io.EOFException r4 = new java.io.EOFException
            r4.<init>()
            throw r4
    }

    private static short e(java.io.RandomAccessFile r2) {
            int r0 = r2.read()
            int r2 = r2.read()
            r1 = r0 | r2
            if (r1 < 0) goto L11
            int r2 = r2 << 8
            int r2 = r2 + r0
            short r2 = (short) r2
            return r2
        L11:
            java.io.EOFException r2 = new java.io.EOFException
            r2.<init>()
            throw r2
    }

    public static void f(java.io.File r18) {
            java.lang.String r1 = "ZipAlign close fail"
            java.lang.String r0 = " is not page-aligned"
            r2 = 0
            java.io.RandomAccessFile r3 = new java.io.RandomAccessFile     // Catch: java.lang.Throwable -> L18a
            java.lang.String r4 = "r"
            r5 = r18
            r3.<init>(r5, r4)     // Catch: java.lang.Throwable -> L18a
            long r4 = r3.length()     // Catch: java.lang.Throwable -> Lf3
            r6 = 22
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 < 0) goto L173
            r6 = 12
            long r4 = r4 - r6
            r3.seek(r4)     // Catch: java.lang.Throwable -> Lf3
            short r2 = e(r3)     // Catch: java.lang.Throwable -> Lf3
            r4 = 65535(0xffff, float:9.1834E-41)
            r2 = r2 & r4
            int r5 = d(r3)     // Catch: java.lang.Throwable -> Lf3
            int r6 = d(r3)     // Catch: java.lang.Throwable -> Lf3
            long r6 = (long) r6     // Catch: java.lang.Throwable -> Lf3
            if (r2 <= 0) goto L16b
            if (r5 <= 0) goto L16b
            r8 = 0
            int r5 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r5 <= 0) goto L16b
            r3.seek(r6)     // Catch: java.lang.Throwable -> Lf3
            r5 = 0
            r6 = 0
        L3e:
            java.lang.String r7 = "ZipAlign native-lib check: "
            if (r5 >= r2) goto L146
            int r8 = d(r3)     // Catch: java.lang.Throwable -> Lf3
            r9 = 33639248(0x2014b50, float:9.499037E-38)
            if (r8 != r9) goto L13e
            r8 = 6
            r3.skipBytes(r8)     // Catch: java.lang.Throwable -> Lf3
            short r8 = e(r3)     // Catch: java.lang.Throwable -> Lf3
            r9 = 16
            r3.skipBytes(r9)     // Catch: java.lang.Throwable -> Lf3
            short r9 = e(r3)     // Catch: java.lang.Throwable -> Lf3
            r9 = r9 & r4
            short r10 = e(r3)     // Catch: java.lang.Throwable -> Lf3
            r10 = r10 & r4
            short r11 = e(r3)     // Catch: java.lang.Throwable -> Lf3
            r11 = r11 & r4
            r12 = 8
            r3.skipBytes(r12)     // Catch: java.lang.Throwable -> Lf3
            int r12 = d(r3)     // Catch: java.lang.Throwable -> Lf3
            long r12 = (long) r12     // Catch: java.lang.Throwable -> Lf3
            r14 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r12 = r12 & r14
            byte[] r9 = new byte[r9]     // Catch: java.lang.Throwable -> Lf3
            r3.readFully(r9)     // Catch: java.lang.Throwable -> Lf3
            java.lang.String r14 = new java.lang.String     // Catch: java.lang.Throwable -> Lf3
            java.lang.String r15 = "UTF-8"
            r14.<init>(r9, r15)     // Catch: java.lang.Throwable -> Lf3
            long r15 = r3.getFilePointer()     // Catch: java.lang.Throwable -> Lf3
            long r9 = (long) r10     // Catch: java.lang.Throwable -> Lf3
            long r15 = r15 + r9
            long r9 = (long) r11     // Catch: java.lang.Throwable -> Lf3
            long r9 = r9 + r15
            boolean r11 = b(r14)     // Catch: java.lang.Throwable -> Lf3
            if (r11 == 0) goto L131
            r15 = 26
            r11 = r5
            long r4 = r12 + r15
            r3.seek(r4)     // Catch: java.lang.Throwable -> Lf3
            short r4 = e(r3)     // Catch: java.lang.Throwable -> Lf3
            r5 = 65535(0xffff, float:9.1834E-41)
            r4 = r4 & r5
            short r15 = e(r3)     // Catch: java.lang.Throwable -> Lf3
            r15 = r15 & r5
            r16 = 30
            long r12 = r12 + r16
            r18 = r6
            long r5 = (long) r4
            long r12 = r12 + r5
            long r4 = (long) r15
            long r12 = r12 + r4
            java.lang.String r4 = "ZipAlign native-lib check failed: "
            if (r8 != 0) goto Lf8
            boolean r5 = c(r12)     // Catch: java.lang.Throwable -> Lf3
            if (r5 == 0) goto Lbe
            int r6 = r18 + 1
            goto L134
        Lbe:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lf3
            r2.<init>()     // Catch: java.lang.Throwable -> Lf3
            r2.append(r7)     // Catch: java.lang.Throwable -> Lf3
            r2.append(r14)     // Catch: java.lang.Throwable -> Lf3
            java.lang.String r5 = " data offset "
            r2.append(r5)     // Catch: java.lang.Throwable -> Lf3
            r2.append(r12)     // Catch: java.lang.Throwable -> Lf3
            r2.append(r0)     // Catch: java.lang.Throwable -> Lf3
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> Lf3
            android.ext.e1.i(r2)     // Catch: java.lang.Throwable -> Lf3
            java.io.IOException r2 = new java.io.IOException     // Catch: java.lang.Throwable -> Lf3
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lf3
            r5.<init>()     // Catch: java.lang.Throwable -> Lf3
            r5.append(r4)     // Catch: java.lang.Throwable -> Lf3
            r5.append(r14)     // Catch: java.lang.Throwable -> Lf3
            r5.append(r0)     // Catch: java.lang.Throwable -> Lf3
            java.lang.String r0 = r5.toString()     // Catch: java.lang.Throwable -> Lf3
            r2.<init>(r0)     // Catch: java.lang.Throwable -> Lf3
            throw r2     // Catch: java.lang.Throwable -> Lf3
        Lf3:
            r0 = move-exception
            r2 = r3
        Lf5:
            r3 = r0
            goto L18d
        Lf8:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lf3
            r0.<init>()     // Catch: java.lang.Throwable -> Lf3
            r0.append(r7)     // Catch: java.lang.Throwable -> Lf3
            r0.append(r14)     // Catch: java.lang.Throwable -> Lf3
            java.lang.String r2 = " is compressed (method "
            r0.append(r2)     // Catch: java.lang.Throwable -> Lf3
            r0.append(r8)     // Catch: java.lang.Throwable -> Lf3
            java.lang.String r2 = ")"
            r0.append(r2)     // Catch: java.lang.Throwable -> Lf3
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> Lf3
            android.ext.e1.i(r0)     // Catch: java.lang.Throwable -> Lf3
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> Lf3
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lf3
            r2.<init>()     // Catch: java.lang.Throwable -> Lf3
            r2.append(r4)     // Catch: java.lang.Throwable -> Lf3
            r2.append(r14)     // Catch: java.lang.Throwable -> Lf3
            java.lang.String r4 = " is compressed"
            r2.append(r4)     // Catch: java.lang.Throwable -> Lf3
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> Lf3
            r0.<init>(r2)     // Catch: java.lang.Throwable -> Lf3
            throw r0     // Catch: java.lang.Throwable -> Lf3
        L131:
            r11 = r5
            r18 = r6
        L134:
            r3.seek(r9)     // Catch: java.lang.Throwable -> Lf3
            int r5 = r11 + 1
            r4 = 65535(0xffff, float:9.1834E-41)
            goto L3e
        L13e:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> Lf3
            java.lang.String r2 = "ZipAlign native-lib check: bad central-directory signature"
            r0.<init>(r2)     // Catch: java.lang.Throwable -> Lf3
            throw r0     // Catch: java.lang.Throwable -> Lf3
        L146:
            r18 = r6
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lf3
            r0.<init>()     // Catch: java.lang.Throwable -> Lf3
            r0.append(r7)     // Catch: java.lang.Throwable -> Lf3
            r5 = r18
            r0.append(r5)     // Catch: java.lang.Throwable -> Lf3
            java.lang.String r2 = " lib entries ok"
            r0.append(r2)     // Catch: java.lang.Throwable -> Lf3
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> Lf3
            android.ext.e1.d(r0)     // Catch: java.lang.Throwable -> Lf3
            r3.close()     // Catch: java.lang.Throwable -> L165
            goto L16a
        L165:
            r0 = move-exception
            r2 = r0
            android.ext.e1.l(r1, r2)
        L16a:
            return
        L16b:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> Lf3
            java.lang.String r2 = "ZipAlign native-lib check: unreadable central directory"
            r0.<init>(r2)     // Catch: java.lang.Throwable -> Lf3
            throw r0     // Catch: java.lang.Throwable -> Lf3
        L173:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> Lf3
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lf3
            r2.<init>()     // Catch: java.lang.Throwable -> Lf3
            java.lang.String r6 = "ZipAlign native-lib check: too small for a zip: "
            r2.append(r6)     // Catch: java.lang.Throwable -> Lf3
            r2.append(r4)     // Catch: java.lang.Throwable -> Lf3
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> Lf3
            r0.<init>(r2)     // Catch: java.lang.Throwable -> Lf3
            throw r0     // Catch: java.lang.Throwable -> Lf3
        L18a:
            r0 = move-exception
            goto Lf5
        L18d:
            if (r2 == 0) goto L198
            r2.close()     // Catch: java.lang.Throwable -> L193
            goto L198
        L193:
            r0 = move-exception
            r2 = r0
            android.ext.e1.l(r1, r2)
        L198:
            throw r3
    }
}
