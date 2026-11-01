package android.ext;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
abstract class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long f1069a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f1070b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final char[] f1071c = null;

    static final class a {
        static byte[] a(byte[] r3, int r4) {
                if (r4 < 0) goto L18
                r0 = 7
                if (r4 > r0) goto L18
                int r0 = r3.length
                r1 = 1
                int r0 = r0 + r1
                byte[] r0 = new byte[r0]
                byte r4 = (byte) r4
                r2 = 0
                r0[r2] = r4
                int r4 = r3.length
                java.lang.System.arraycopy(r3, r2, r0, r1, r4)
                r3 = 3
                byte[] r3 = k(r3, r0)
                return r3
            L18:
                java.io.IOException r3 = new java.io.IOException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "bad unused bit count: "
                r0.append(r1)
                r0.append(r4)
                java.lang.String r4 = r0.toString()
                r3.<init>(r4)
                throw r3
        }

        static byte[] b(int r0, byte[] r1) {
                r0 = r0 | 160(0xa0, float:2.24E-43)
                byte[] r0 = k(r0, r1)
                return r0
        }

        static byte[] c(int r0, byte[] r1) {
                r0 = r0 | 160(0xa0, float:2.24E-43)
                byte[] r0 = k(r0, r1)
                return r0
        }

        static byte[] d(java.lang.String r1) {
                java.lang.String r0 = "US-ASCII"
                byte[] r1 = r1.getBytes(r0)
                r0 = 24
                byte[] r1 = k(r0, r1)
                return r1
        }

        static byte[] e(byte[] r4) {
                int r0 = r4.length
                if (r0 == 0) goto L1b
                r0 = 0
                r1 = r4[r0]
                r1 = r1 & 128(0x80, float:1.8E-43)
                if (r1 == 0) goto Lc
                r1 = 1
                goto Ld
            Lc:
                r1 = 0
            Ld:
                int r2 = r4.length
                int r2 = r2 + r1
                byte[] r2 = new byte[r2]
                int r3 = r4.length
                java.lang.System.arraycopy(r4, r0, r2, r1, r3)
                r4 = 2
                byte[] r4 = k(r4, r2)
                return r4
            L1b:
                java.io.IOException r4 = new java.io.IOException
                java.lang.String r0 = "empty INTEGER"
                r4.<init>(r0)
                throw r4
        }

        static byte[] f() {
                r0 = 0
                byte[] r0 = new byte[r0]
                r1 = 5
                byte[] r0 = k(r1, r0)
                return r0
        }

        static byte[] g(byte[] r1) {
                r0 = 4
                byte[] r1 = k(r0, r1)
                return r1
        }

        static byte[] h(java.lang.String r11) {
                java.lang.String r0 = "\\."
                java.lang.String[] r0 = r11.split(r0)
                int r1 = r0.length
                r2 = 2
                if (r1 < r2) goto L6b
                r1 = 0
                r1 = r0[r1]
                long r3 = java.lang.Long.parseLong(r1)
                r1 = 1
                r1 = r0[r1]
                long r5 = java.lang.Long.parseLong(r1)
                r7 = 0
                int r1 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
                if (r1 < 0) goto L54
                r9 = 2
                int r1 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
                if (r1 > 0) goto L54
                int r1 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r1 < 0) goto L54
                r7 = 39
                int r1 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r1 > 0) goto L54
                java.io.ByteArrayOutputStream r11 = new java.io.ByteArrayOutputStream
                r11.<init>()
                r7 = 40
                long r3 = r3 * r7
                long r3 = r3 + r5
                n(r11, r3)
            L3b:
                int r1 = r0.length
                if (r2 >= r1) goto L4a
                r1 = r0[r2]
                long r3 = java.lang.Long.parseLong(r1)
                n(r11, r3)
                int r2 = r2 + 1
                goto L3b
            L4a:
                r0 = 6
                byte[] r11 = r11.toByteArray()
                byte[] r11 = k(r0, r11)
                return r11
            L54:
                java.io.IOException r0 = new java.io.IOException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "malformed OID arc: "
                r1.append(r2)
                r1.append(r11)
                java.lang.String r11 = r1.toString()
                r0.<init>(r11)
                throw r0
            L6b:
                java.io.IOException r0 = new java.io.IOException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "malformed OID: "
                r1.append(r2)
                r1.append(r11)
                java.lang.String r11 = r1.toString()
                r0.<init>(r11)
                throw r0
        }

        static byte[] i(byte[] r1) {
                r0 = 48
                byte[] r1 = k(r0, r1)
                return r1
        }

        static byte[] j(byte[] r1) {
                r0 = 49
                byte[] r1 = k(r0, r1)
                return r1
        }

        private static byte[] k(int r4, byte[] r5) {
                int r0 = r5.length
                r1 = 65536(0x10000, float:9.1835E-41)
                if (r0 >= r1) goto L42
                java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
                int r1 = r5.length
                int r1 = r1 + 6
                r0.<init>(r1)
                r0.write(r4)
                int r4 = r5.length
                r1 = 128(0x80, float:1.8E-43)
                if (r4 >= r1) goto L19
                r0.write(r4)
                goto L38
            L19:
                r1 = 1
                r2 = 1
            L1b:
                int r3 = r2 * 8
                int r3 = r4 >>> r3
                if (r3 == 0) goto L24
                int r2 = r2 + 1
                goto L1b
            L24:
                r3 = r2 | 128(0x80, float:1.8E-43)
                r0.write(r3)
                int r2 = r2 - r1
            L2a:
                if (r2 < 0) goto L38
                int r1 = r2 * 8
                int r1 = r4 >>> r1
                r1 = r1 & 255(0xff, float:3.57E-43)
                r0.write(r1)
                int r2 = r2 + (-1)
                goto L2a
            L38:
                r4 = 0
                int r1 = r5.length
                r0.write(r5, r4, r1)
                byte[] r4 = r0.toByteArray()
                return r4
            L42:
                java.io.IOException r4 = new java.io.IOException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "DER value too large: "
                r0.append(r1)
                int r5 = r5.length
                r0.append(r5)
                java.lang.String r5 = r0.toString()
                r4.<init>(r5)
                throw r4
        }

        static byte[] l(java.lang.String r1) {
                java.lang.String r0 = "US-ASCII"
                byte[] r1 = r1.getBytes(r0)
                r0 = 23
                byte[] r1 = k(r0, r1)
                return r1
        }

        static byte[] m(java.lang.String r1) {
                java.lang.String r0 = "UTF-8"
                byte[] r1 = r1.getBytes(r0)
                r0 = 12
                byte[] r1 = k(r0, r1)
                return r1
        }

        private static void n(java.io.ByteArrayOutputStream r7, long r8) {
                r0 = 0
                int r2 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
                if (r2 < 0) goto L2a
                r2 = 1
                r3 = 1
            L8:
                int r4 = r3 * 7
                long r4 = r8 >>> r4
                int r6 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r6 == 0) goto L13
                int r3 = r3 + 1
                goto L8
            L13:
                int r3 = r3 - r2
            L14:
                if (r3 < 0) goto L29
                int r0 = r3 * 7
                long r0 = r8 >>> r0
                r4 = 127(0x7f, double:6.27E-322)
                long r0 = r0 & r4
                int r1 = (int) r0
                if (r3 != 0) goto L21
                goto L23
            L21:
                r1 = r1 | 128(0x80, float:1.8E-43)
            L23:
                r7.write(r1)
                int r3 = r3 + (-1)
                goto L14
            L29:
                return
            L2a:
                java.io.IOException r7 = new java.io.IOException
                java.lang.String r8 = "negative OID arc"
                r7.<init>(r8)
                throw r7
        }
    }

    static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final byte[] f1072a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final java.lang.String f1073b;

        b(byte[] r1, java.lang.String r2) {
                r0 = this;
                r0.<init>()
                r0.f1072a = r1
                r0.f1073b = r2
                return
        }
    }

    static {
            r0 = 2000(0x7d0, float:2.803E-42)
            r1 = 0
            r2 = 1
            r3 = 0
            r4 = 0
            r5 = 0
            long r0 = j(r0, r1, r2, r3, r4, r5)
            android.ext.m0.f1069a = r0
            r2 = 2099(0x833, float:2.941E-42)
            r3 = 11
            r4 = 31
            r5 = 23
            r6 = 59
            r7 = 59
            long r0 = j(r2, r3, r4, r5, r6, r7)
            android.ext.m0.f1070b = r0
            java.lang.String r0 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/"
            char[] r0 = r0.toCharArray()
            android.ext.m0.f1071c = r0
            return
    }

    private static void a(java.security.cert.X509Certificate r4) {
            java.lang.String r0 = r4.getSigAlgOID()
            java.lang.String r4 = r4.getSigAlgName()
            java.lang.String r1 = "1.2.840.113549.1.1.11"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L3c
            java.lang.String r1 = "SHA256WITHRSA"
            java.lang.String r2 = d(r4)
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L1d
            goto L3c
        L1d:
            java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "unexpected signature algorithm: "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = " / "
            r2.append(r0)
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            r1.<init>(r4)
            throw r1
        L3c:
            return
    }

    private static byte[] b(byte[]... r7) {
            int r0 = r7.length
            r1 = 0
            r2 = 0
            r3 = 0
        L4:
            if (r2 >= r0) goto Ld
            r4 = r7[r2]
            int r4 = r4.length
            int r3 = r3 + r4
            int r2 = r2 + 1
            goto L4
        Ld:
            byte[] r0 = new byte[r3]
            int r2 = r7.length
            r3 = 0
            r4 = 0
        L12:
            if (r3 >= r2) goto L1f
            r5 = r7[r3]
            int r6 = r5.length
            java.lang.System.arraycopy(r5, r1, r0, r4, r6)
            int r5 = r5.length
            int r4 = r4 + r5
            int r3 = r3 + 1
            goto L12
        L1f:
            return r0
    }

    private static boolean c(byte[] r3) {
            r0 = 0
            r1 = 0
        L2:
            int r2 = r3.length
            if (r1 >= r2) goto Ld
            r2 = r3[r1]
            if (r2 == 0) goto La
            return r0
        La:
            int r1 = r1 + 1
            goto L2
        Ld:
            r3 = 1
            return r3
    }

    static java.lang.String d(java.lang.String r4) {
            if (r4 != 0) goto L5
            java.lang.String r4 = ""
            return r4
        L5:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r4.length()
            r0.<init>(r1)
            r1 = 0
        Lf:
            int r2 = r4.length()
            if (r1 >= r2) goto L29
            char r2 = r4.charAt(r1)
            boolean r3 = java.lang.Character.isLetterOrDigit(r2)
            if (r3 == 0) goto L26
            char r2 = java.lang.Character.toUpperCase(r2)
            r0.append(r2)
        L26:
            int r1 = r1 + 1
            goto Lf
        L29:
            java.lang.String r4 = r0.toString()
            return r4
    }

    private static void e(byte[] r5, java.security.interfaces.RSAPublicKey r6, byte[] r7, java.lang.String r8) {
            java.lang.String r0 = "X.509"
            java.security.cert.CertificateFactory r0 = java.security.cert.CertificateFactory.getInstance(r0)
            java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream
            r1.<init>(r5)
            java.security.cert.Certificate r0 = r0.generateCertificate(r1)     // Catch: java.lang.ClassCastException -> L116
            java.security.cert.X509Certificate r0 = (java.security.cert.X509Certificate) r0     // Catch: java.lang.ClassCastException -> L116
            int r2 = r1.available()
            if (r2 != 0) goto Lfb
            int r1 = r0.getVersion()
            r2 = 3
            if (r1 != r2) goto Le0
            javax.security.auth.x500.X500Principal r1 = r0.getIssuerX500Principal()
            javax.security.auth.x500.X500Principal r2 = r0.getSubjectX500Principal()
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto Ld8
            javax.security.auth.x500.X500Principal r1 = r0.getIssuerX500Principal()
            byte[] r1 = r1.getEncoded()
            javax.security.auth.x500.X500Principal r2 = r0.getSubjectX500Principal()
            byte[] r2 = r2.getEncoded()
            boolean r1 = java.util.Arrays.equals(r1, r2)
            if (r1 == 0) goto Ld8
            java.math.BigInteger r1 = r0.getSerialNumber()
            java.math.BigInteger r2 = new java.math.BigInteger
            r3 = 1
            r2.<init>(r3, r7)
            boolean r7 = r1.equals(r2)
            if (r7 == 0) goto Ld0
            java.security.PublicKey r7 = r0.getPublicKey()
            byte[] r7 = r7.getEncoded()
            byte[] r1 = r6.getEncoded()
            boolean r7 = java.util.Arrays.equals(r7, r1)
            if (r7 == 0) goto Lc8
            a(r0)
            java.util.Date r7 = r0.getNotBefore()
            long r1 = r7.getTime()
            long r3 = android.ext.m0.f1069a
            int r7 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r7 != 0) goto L99
            java.util.Date r7 = r0.getNotAfter()
            long r1 = r7.getTime()
            long r3 = android.ext.m0.f1070b
            int r7 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r7 != 0) goto L99
            java.lang.String r5 = f(r5)
            boolean r5 = r8.equals(r5)
            if (r5 == 0) goto L91
            r0.verify(r6)
            return
        L91:
            java.security.GeneralSecurityException r5 = new java.security.GeneralSecurityException
            java.lang.String r6 = "certificate digest mismatch"
            r5.<init>(r6)
            throw r5
        L99:
            java.security.GeneralSecurityException r5 = new java.security.GeneralSecurityException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "validity mismatch: "
            r6.append(r7)
            java.util.Date r7 = r0.getNotBefore()
            long r7 = r7.getTime()
            r6.append(r7)
            java.lang.String r7 = " / "
            r6.append(r7)
            java.util.Date r7 = r0.getNotAfter()
            long r7 = r7.getTime()
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        Lc8:
            java.security.GeneralSecurityException r5 = new java.security.GeneralSecurityException
            java.lang.String r6 = "public key mismatch"
            r5.<init>(r6)
            throw r5
        Ld0:
            java.security.GeneralSecurityException r5 = new java.security.GeneralSecurityException
            java.lang.String r6 = "serial mismatch"
            r5.<init>(r6)
            throw r5
        Ld8:
            java.security.GeneralSecurityException r5 = new java.security.GeneralSecurityException
            java.lang.String r6 = "issuer and subject differ"
            r5.<init>(r6)
            throw r5
        Le0:
            java.security.GeneralSecurityException r5 = new java.security.GeneralSecurityException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "certificate is not v3: "
            r6.append(r7)
            int r7 = r0.getVersion()
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        Lfb:
            java.security.GeneralSecurityException r5 = new java.security.GeneralSecurityException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "certificate has trailing bytes: "
            r6.append(r7)
            int r7 = r1.available()
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        L116:
            r5 = move-exception
            java.security.GeneralSecurityException r6 = new java.security.GeneralSecurityException
            java.lang.String r7 = "generated certificate is not X.509"
            r6.<init>(r7, r5)
            throw r6
    }

    private static java.lang.String f(byte[] r1) {
            java.lang.String r0 = "SHA-256"
            java.security.MessageDigest r0 = java.security.MessageDigest.getInstance(r0)
            byte[] r1 = r0.digest(r1)
            java.lang.String r1 = i(r1)
            return r1
    }

    static android.ext.m0.b g(byte[] r20) {
            r0 = r20
            if (r0 == 0) goto L244
            java.security.SecureRandom r1 = new java.security.SecureRandom
            r1.<init>()
            java.lang.String r2 = "RSA"
            java.security.KeyPairGenerator r2 = java.security.KeyPairGenerator.getInstance(r2)
            java.security.spec.RSAKeyGenParameterSpec r3 = new java.security.spec.RSAKeyGenParameterSpec
            java.math.BigInteger r4 = java.security.spec.RSAKeyGenParameterSpec.F4
            r5 = 2048(0x800, float:2.87E-42)
            r3.<init>(r5, r4)
            r2.initialize(r3, r1)
            java.security.KeyPair r2 = r2.generateKeyPair()
            java.security.PublicKey r3 = r2.getPublic()
            boolean r3 = r3 instanceof java.security.interfaces.RSAPublicKey
            if (r3 == 0) goto L23c
            java.security.PublicKey r3 = r2.getPublic()
            java.security.interfaces.RSAPublicKey r3 = (java.security.interfaces.RSAPublicKey) r3
            java.math.BigInteger r4 = r3.getModulus()
            int r4 = r4.bitLength()
            if (r4 != r5) goto L211
            java.math.BigInteger r4 = r3.getPublicExponent()
            int r4 = r4.intValue()
            r5 = 65537(0x10001, float:9.1837E-41)
            if (r4 != r5) goto L211
            r4 = 16
            byte[] r5 = new byte[r4]
        L48:
            r1.nextBytes(r5)
            boolean r6 = c(r5)
            if (r6 != 0) goto L48
            byte[] r4 = new byte[r4]
            r1.nextBytes(r4)
            java.lang.String r1 = i(r4)
            r4 = 2
            byte[][] r6 = new byte[r4][]
            java.lang.String r7 = "1.2.840.113549.1.1.11"
            byte[] r7 = android.ext.m0.a.h(r7)
            r8 = 0
            r6[r8] = r7
            byte[] r7 = android.ext.m0.a.f()
            r9 = 1
            r6[r9] = r7
            byte[] r6 = b(r6)
            byte[] r6 = android.ext.m0.a.i(r6)
            byte[][] r7 = new byte[r4][]
            java.lang.String r10 = "2.16.840.1.101.3.4.2.1"
            byte[] r10 = android.ext.m0.a.h(r10)
            r7[r8] = r10
            byte[] r10 = android.ext.m0.a.f()
            r7[r9] = r10
            byte[] r7 = b(r7)
            byte[] r7 = android.ext.m0.a.i(r7)
            byte[][] r10 = new byte[r4][]
            java.lang.String r11 = "1.2.840.113549.1.1.1"
            byte[] r11 = android.ext.m0.a.h(r11)
            r10[r8] = r11
            byte[] r11 = android.ext.m0.a.f()
            r10[r9] = r11
            byte[] r10 = b(r10)
            byte[] r10 = android.ext.m0.a.i(r10)
            byte[] r11 = android.ext.m0.a.e(r5)
            byte[][] r12 = new byte[r4][]
            java.lang.String r13 = "2.5.4.3"
            byte[] r13 = android.ext.m0.a.h(r13)
            r12[r8] = r13
            byte[] r1 = android.ext.m0.a.m(r1)
            r12[r9] = r1
            byte[] r1 = b(r12)
            byte[] r1 = android.ext.m0.a.i(r1)
            byte[] r1 = android.ext.m0.a.j(r1)
            byte[] r1 = android.ext.m0.a.i(r1)
            r12 = 7
            byte[][] r12 = new byte[r12][]
            byte[] r13 = new byte[r9]
            r13[r8] = r4
            byte[] r13 = android.ext.m0.a.e(r13)
            byte[] r13 = android.ext.m0.a.b(r8, r13)
            r12[r8] = r13
            r12[r9] = r11
            r12[r4] = r6
            r13 = 3
            r12[r13] = r1
            byte[][] r14 = new byte[r4][]
            java.lang.String r15 = "000101000000Z"
            byte[] r15 = android.ext.m0.a.l(r15)
            r14[r8] = r15
            java.lang.String r15 = "20991231235959Z"
            byte[] r15 = android.ext.m0.a.d(r15)
            r14[r9] = r15
            byte[] r14 = b(r14)
            byte[] r14 = android.ext.m0.a.i(r14)
            r15 = 4
            r12[r15] = r14
            r14 = 5
            r12[r14] = r1
            r16 = 6
            byte[] r17 = r3.getEncoded()
            r12[r16] = r17
            byte[] r12 = b(r12)
            byte[] r12 = android.ext.m0.a.i(r12)
            java.lang.String r16 = "SHA256withRSA"
            java.security.Signature r15 = java.security.Signature.getInstance(r16)
            java.security.PrivateKey r14 = r2.getPrivate()
            r15.initSign(r14)
            r15.update(r12)
            byte[] r14 = r15.sign()
            byte[][] r15 = new byte[r13][]
            r15[r8] = r12
            r15[r9] = r6
            byte[] r6 = android.ext.m0.a.a(r14, r8)
            r15[r4] = r6
            byte[] r6 = b(r15)
            byte[] r6 = android.ext.m0.a.i(r6)
            java.security.Signature r12 = java.security.Signature.getInstance(r16)
            java.security.PrivateKey r2 = r2.getPrivate()
            r12.initSign(r2)
            r12.update(r0)
            byte[] r0 = r12.sign()
            int r2 = r6.length
            long r14 = (long) r2
            r18 = 65536(0x10000, double:3.2379E-319)
            int r2 = (r14 > r18 ? 1 : (r14 == r18 ? 0 : -1))
            if (r2 >= 0) goto L1fa
            r2 = 5
            byte[][] r12 = new byte[r2][]
            byte[] r2 = new byte[r9]
            r2[r8] = r9
            byte[] r2 = android.ext.m0.a.e(r2)
            r12[r8] = r2
            byte[][] r2 = new byte[r4][]
            r2[r8] = r1
            r2[r9] = r11
            byte[] r1 = b(r2)
            byte[] r1 = android.ext.m0.a.i(r1)
            r12[r9] = r1
            r12[r4] = r7
            r12[r13] = r10
            byte[] r0 = android.ext.m0.a.g(r0)
            r1 = 4
            r12[r1] = r0
            byte[] r0 = b(r12)
            byte[] r0 = android.ext.m0.a.i(r0)
            r1 = 5
            byte[][] r1 = new byte[r1][]
            byte[] r2 = new byte[r9]
            r2[r8] = r9
            byte[] r2 = android.ext.m0.a.e(r2)
            r1[r8] = r2
            byte[] r2 = android.ext.m0.a.j(r7)
            r1[r9] = r2
            java.lang.String r2 = "1.2.840.113549.1.7.1"
            byte[] r2 = android.ext.m0.a.h(r2)
            byte[] r2 = android.ext.m0.a.i(r2)
            r1[r4] = r2
            byte[] r2 = android.ext.m0.a.c(r8, r6)
            r1[r13] = r2
            byte[] r0 = android.ext.m0.a.j(r0)
            r2 = 4
            r1[r2] = r0
            byte[] r0 = b(r1)
            byte[] r0 = android.ext.m0.a.i(r0)
            byte[][] r1 = new byte[r4][]
            java.lang.String r2 = "1.2.840.113549.1.7.2"
            byte[] r2 = android.ext.m0.a.h(r2)
            r1[r8] = r2
            byte[] r0 = android.ext.m0.a.b(r8, r0)
            r1[r9] = r0
            byte[] r0 = b(r1)
            byte[] r0 = android.ext.m0.a.i(r0)
            int r1 = r0.length
            r2 = 65536(0x10000, float:9.1835E-41)
            if (r1 >= r2) goto L1e2
            java.lang.String r1 = f(r6)
            e(r6, r3, r5, r1)
            android.ext.m0$b r2 = new android.ext.m0$b
            r2.<init>(r0, r1)
            return r2
        L1e2:
            java.io.IOException r1 = new java.io.IOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "CERT.RSA too large: "
            r2.append(r3)
            int r0 = r0.length
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L1fa:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "certificate too large: "
            r1.append(r2)
            r1.append(r14)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L211:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "unexpected RSA profile: "
            r1.append(r2)
            java.math.BigInteger r2 = r3.getModulus()
            int r2 = r2.bitLength()
            r1.append(r2)
            java.lang.String r2 = " bits, exponent "
            r1.append(r2)
            java.math.BigInteger r2 = r3.getPublicExponent()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L23c:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "RSA key generator returned a non-RSA public key"
            r0.<init>(r1)
            throw r0
        L244:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "missing CERT.SF bytes"
            r0.<init>(r1)
            throw r0
    }

    static java.lang.String h(byte[] r6) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r6.length
            r2 = 2
            int r1 = r1 + r2
            int r1 = r1 / 3
            int r1 = r1 * 4
            r0.<init>(r1)
            r1 = 0
        Ld:
            int r3 = r1 + 2
            int r4 = r6.length
            if (r3 >= r4) goto L4d
            r4 = r6[r1]
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r4 = r4 << 16
            int r5 = r1 + 1
            r5 = r6[r5]
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r5 = r5 << 8
            r4 = r4 | r5
            r3 = r6[r3]
            r3 = r3 & 255(0xff, float:3.57E-43)
            r3 = r3 | r4
            char[] r4 = android.ext.m0.f1071c
            int r5 = r3 >>> 18
            r5 = r5 & 63
            char r5 = r4[r5]
            r0.append(r5)
            int r5 = r3 >>> 12
            r5 = r5 & 63
            char r5 = r4[r5]
            r0.append(r5)
            int r5 = r3 >>> 6
            r5 = r5 & 63
            char r5 = r4[r5]
            r0.append(r5)
            r3 = r3 & 63
            char r3 = r4[r3]
            r0.append(r3)
            int r1 = r1 + 3
            goto Ld
        L4d:
            int r3 = r6.length
            int r3 = r3 - r1
            r4 = 1
            if (r3 != r4) goto L72
            r6 = r6[r1]
            r6 = r6 & 255(0xff, float:3.57E-43)
            int r6 = r6 << 16
            char[] r1 = android.ext.m0.f1071c
            int r2 = r6 >>> 18
            r2 = r2 & 63
            char r2 = r1[r2]
            r0.append(r2)
            int r6 = r6 >>> 12
            r6 = r6 & 63
            char r6 = r1[r6]
            r0.append(r6)
            java.lang.String r6 = "=="
            r0.append(r6)
            goto La4
        L72:
            if (r3 != r2) goto La4
            r2 = r6[r1]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << 16
            int r1 = r1 + r4
            r6 = r6[r1]
            r6 = r6 & 255(0xff, float:3.57E-43)
            int r6 = r6 << 8
            r6 = r6 | r2
            char[] r1 = android.ext.m0.f1071c
            int r2 = r6 >>> 18
            r2 = r2 & 63
            char r2 = r1[r2]
            r0.append(r2)
            int r2 = r6 >>> 12
            r2 = r2 & 63
            char r2 = r1[r2]
            r0.append(r2)
            int r6 = r6 >>> 6
            r6 = r6 & 63
            char r6 = r1[r6]
            r0.append(r6)
            r6 = 61
            r0.append(r6)
        La4:
            java.lang.String r6 = r0.toString()
            return r6
    }

    static java.lang.String i(byte[] r6) {
            java.lang.String r0 = "0123456789abcdef"
            char[] r0 = r0.toCharArray()
            int r1 = r6.length
            int r1 = r1 * 2
            char[] r1 = new char[r1]
            r2 = 0
        Lc:
            int r3 = r6.length
            if (r2 >= r3) goto L26
            r3 = r6[r2]
            r4 = r3 & 255(0xff, float:3.57E-43)
            int r5 = r2 * 2
            int r4 = r4 >>> 4
            char r4 = r0[r4]
            r1[r5] = r4
            int r5 = r5 + 1
            r3 = r3 & 15
            char r3 = r0[r3]
            r1[r5] = r3
            int r2 = r2 + 1
            goto Lc
        L26:
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1)
            return r6
    }

    private static long j(int r8, int r9, int r10, int r11, int r12, int r13) {
            java.util.GregorianCalendar r7 = new java.util.GregorianCalendar
            java.lang.String r0 = "UTC"
            java.util.TimeZone r0 = java.util.TimeZone.getTimeZone(r0)
            r7.<init>(r0)
            r7.clear()
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r0.set(r1, r2, r3, r4, r5, r6)
            long r8 = r7.getTimeInMillis()
            return r8
    }
}
