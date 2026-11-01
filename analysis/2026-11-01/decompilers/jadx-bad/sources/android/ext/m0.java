package android.ext;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.security.Signature;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAKeyGenParameterSpec;
import java.util.Arrays;
import java.util.GregorianCalendar;
import java.util.TimeZone;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
abstract class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long f1069a = j(2000, 0, 1, 0, 0, 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f1070b = j(2099, 11, 31, 23, 59, 59);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final char[] f1071c = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".toCharArray();

    static final class a {
        static byte[] a(byte[] bArr, int i) throws IOException {
            if (i < 0 || i > 7) {
                throw new IOException("bad unused bit count: " + i);
            }
            byte[] bArr2 = new byte[bArr.length + 1];
            bArr2[0] = (byte) i;
            System.arraycopy(bArr, 0, bArr2, 1, bArr.length);
            return k(3, bArr2);
        }

        static byte[] b(int i, byte[] bArr) {
            return k(i | 160, bArr);
        }

        static byte[] c(int i, byte[] bArr) {
            return k(i | 160, bArr);
        }

        static byte[] d(String str) {
            return k(24, str.getBytes("US-ASCII"));
        }

        static byte[] e(byte[] bArr) throws IOException {
            if (bArr.length == 0) {
                throw new IOException("empty INTEGER");
            }
            int i = (bArr[0] & 128) != 0 ? 1 : 0;
            byte[] bArr2 = new byte[bArr.length + i];
            System.arraycopy(bArr, 0, bArr2, i, bArr.length);
            return k(2, bArr2);
        }

        static byte[] f() {
            return k(5, new byte[0]);
        }

        static byte[] g(byte[] bArr) {
            return k(4, bArr);
        }

        static byte[] h(String str) throws IOException {
            String[] strArrSplit = str.split("\\.");
            if (strArrSplit.length < 2) {
                throw new IOException("malformed OID: " + str);
            }
            long j = Long.parseLong(strArrSplit[0]);
            long j2 = Long.parseLong(strArrSplit[1]);
            if (j < 0 || j > 2 || j2 < 0 || j2 > 39) {
                throw new IOException("malformed OID arc: " + str);
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            n(byteArrayOutputStream, (j * 40) + j2);
            for (int i = 2; i < strArrSplit.length; i++) {
                n(byteArrayOutputStream, Long.parseLong(strArrSplit[i]));
            }
            return k(6, byteArrayOutputStream.toByteArray());
        }

        static byte[] i(byte[] bArr) {
            return k(48, bArr);
        }

        static byte[] j(byte[] bArr) {
            return k(49, bArr);
        }

        private static byte[] k(int i, byte[] bArr) throws IOException {
            if (bArr.length >= 65536) {
                throw new IOException("DER value too large: " + bArr.length);
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(bArr.length + 6);
            byteArrayOutputStream.write(i);
            int length = bArr.length;
            if (length < 128) {
                byteArrayOutputStream.write(length);
            } else {
                int i2 = 1;
                while ((length >>> (i2 * 8)) != 0) {
                    i2++;
                }
                byteArrayOutputStream.write(i2 | 128);
                for (int i3 = i2 - 1; i3 >= 0; i3--) {
                    byteArrayOutputStream.write((length >>> (i3 * 8)) & 255);
                }
            }
            byteArrayOutputStream.write(bArr, 0, bArr.length);
            return byteArrayOutputStream.toByteArray();
        }

        static byte[] l(String str) {
            return k(23, str.getBytes("US-ASCII"));
        }

        static byte[] m(String str) {
            return k(12, str.getBytes("UTF-8"));
        }

        private static void n(ByteArrayOutputStream byteArrayOutputStream, long j) throws IOException {
            if (j < 0) {
                throw new IOException("negative OID arc");
            }
            int i = 1;
            while ((j >>> (i * 7)) != 0) {
                i++;
            }
            for (int i2 = i - 1; i2 >= 0; i2--) {
                int i3 = (int) ((j >>> (i2 * 7)) & 127);
                if (i2 != 0) {
                    i3 |= 128;
                }
                byteArrayOutputStream.write(i3);
            }
        }
    }

    static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final byte[] f1072a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final String f1073b;

        b(byte[] bArr, String str) {
            this.f1072a = bArr;
            this.f1073b = str;
        }
    }

    private static void a(X509Certificate x509Certificate) throws GeneralSecurityException {
        String sigAlgOID = x509Certificate.getSigAlgOID();
        String sigAlgName = x509Certificate.getSigAlgName();
        if ("1.2.840.113549.1.1.11".equals(sigAlgOID) || "SHA256WITHRSA".equals(d(sigAlgName))) {
            return;
        }
        throw new GeneralSecurityException("unexpected signature algorithm: " + sigAlgOID + " / " + sigAlgName);
    }

    private static byte[] b(byte[]... bArr) {
        int length = 0;
        for (byte[] bArr2 : bArr) {
            length += bArr2.length;
        }
        byte[] bArr3 = new byte[length];
        int length2 = 0;
        for (byte[] bArr4 : bArr) {
            System.arraycopy(bArr4, 0, bArr3, length2, bArr4.length);
            length2 += bArr4.length;
        }
        return bArr3;
    }

    private static boolean c(byte[] bArr) {
        for (byte b2 : bArr) {
            if (b2 != 0) {
                return false;
            }
        }
        return true;
    }

    static String d(String str) {
        if (str == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder(str.length());
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (Character.isLetterOrDigit(cCharAt)) {
                sb.append(Character.toUpperCase(cCharAt));
            }
        }
        return sb.toString();
    }

    private static void e(byte[] bArr, RSAPublicKey rSAPublicKey, byte[] bArr2, String str) throws GeneralSecurityException {
        CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            X509Certificate x509Certificate = (X509Certificate) certificateFactory.generateCertificate(byteArrayInputStream);
            if (byteArrayInputStream.available() != 0) {
                throw new GeneralSecurityException("certificate has trailing bytes: " + byteArrayInputStream.available());
            }
            if (x509Certificate.getVersion() != 3) {
                throw new GeneralSecurityException("certificate is not v3: " + x509Certificate.getVersion());
            }
            if (!x509Certificate.getIssuerX500Principal().equals(x509Certificate.getSubjectX500Principal()) || !Arrays.equals(x509Certificate.getIssuerX500Principal().getEncoded(), x509Certificate.getSubjectX500Principal().getEncoded())) {
                throw new GeneralSecurityException("issuer and subject differ");
            }
            if (!x509Certificate.getSerialNumber().equals(new BigInteger(1, bArr2))) {
                throw new GeneralSecurityException("serial mismatch");
            }
            if (!Arrays.equals(x509Certificate.getPublicKey().getEncoded(), rSAPublicKey.getEncoded())) {
                throw new GeneralSecurityException("public key mismatch");
            }
            a(x509Certificate);
            if (x509Certificate.getNotBefore().getTime() == f1069a && x509Certificate.getNotAfter().getTime() == f1070b) {
                if (!str.equals(f(bArr))) {
                    throw new GeneralSecurityException("certificate digest mismatch");
                }
                x509Certificate.verify(rSAPublicKey);
            } else {
                throw new GeneralSecurityException("validity mismatch: " + x509Certificate.getNotBefore().getTime() + " / " + x509Certificate.getNotAfter().getTime());
            }
        } catch (ClassCastException e2) {
            throw new GeneralSecurityException("generated certificate is not X.509", e2);
        }
    }

    private static String f(byte[] bArr) {
        return i(MessageDigest.getInstance("SHA-256").digest(bArr));
    }

    static b g(byte[] bArr) throws GeneralSecurityException, IOException {
        if (bArr == null) {
            throw new GeneralSecurityException("missing CERT.SF bytes");
        }
        SecureRandom secureRandom = new SecureRandom();
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
        keyPairGenerator.initialize(new RSAKeyGenParameterSpec(2048, RSAKeyGenParameterSpec.F4), secureRandom);
        KeyPair keyPairGenerateKeyPair = keyPairGenerator.generateKeyPair();
        if (!(keyPairGenerateKeyPair.getPublic() instanceof RSAPublicKey)) {
            throw new GeneralSecurityException("RSA key generator returned a non-RSA public key");
        }
        RSAPublicKey rSAPublicKey = (RSAPublicKey) keyPairGenerateKeyPair.getPublic();
        if (rSAPublicKey.getModulus().bitLength() != 2048 || rSAPublicKey.getPublicExponent().intValue() != 65537) {
            throw new GeneralSecurityException("unexpected RSA profile: " + rSAPublicKey.getModulus().bitLength() + " bits, exponent " + rSAPublicKey.getPublicExponent());
        }
        byte[] bArr2 = new byte[16];
        do {
            secureRandom.nextBytes(bArr2);
        } while (c(bArr2));
        byte[] bArr3 = new byte[16];
        secureRandom.nextBytes(bArr3);
        String strI = i(bArr3);
        byte[] bArrI = a.i(b(a.h("1.2.840.113549.1.1.11"), a.f()));
        byte[] bArrI2 = a.i(b(a.h("2.16.840.1.101.3.4.2.1"), a.f()));
        byte[] bArrI3 = a.i(b(a.h("1.2.840.113549.1.1.1"), a.f()));
        byte[] bArrE = a.e(bArr2);
        byte[] bArrI4 = a.i(a.j(a.i(b(a.h("2.5.4.3"), a.m(strI)))));
        byte[] bArrI5 = a.i(b(a.b(0, a.e(new byte[]{2})), bArrE, bArrI, bArrI4, a.i(b(a.l("000101000000Z"), a.d("20991231235959Z"))), bArrI4, rSAPublicKey.getEncoded()));
        Signature signature = Signature.getInstance("SHA256withRSA");
        signature.initSign(keyPairGenerateKeyPair.getPrivate());
        signature.update(bArrI5);
        byte[] bArrI6 = a.i(b(bArrI5, bArrI, a.a(signature.sign(), 0)));
        Signature signature2 = Signature.getInstance("SHA256withRSA");
        signature2.initSign(keyPairGenerateKeyPair.getPrivate());
        signature2.update(bArr);
        byte[] bArrSign = signature2.sign();
        long length = bArrI6.length;
        if (length >= 65536) {
            throw new IOException("certificate too large: " + length);
        }
        byte[] bArrI7 = a.i(b(a.h("1.2.840.113549.1.7.2"), a.b(0, a.i(b(a.e(new byte[]{1}), a.j(bArrI2), a.i(a.h("1.2.840.113549.1.7.1")), a.c(0, bArrI6), a.j(a.i(b(a.e(new byte[]{1}), a.i(b(bArrI4, bArrE)), bArrI2, bArrI3, a.g(bArrSign)))))))));
        if (bArrI7.length < 65536) {
            String strF = f(bArrI6);
            e(bArrI6, rSAPublicKey, bArr2, strF);
            return new b(bArrI7, strF);
        }
        throw new IOException("CERT.RSA too large: " + bArrI7.length);
    }

    static String h(byte[] bArr) {
        StringBuilder sb = new StringBuilder(((bArr.length + 2) / 3) * 4);
        int i = 0;
        while (true) {
            int i2 = i + 2;
            if (i2 >= bArr.length) {
                break;
            }
            int i3 = (bArr[i2] & 255) | ((bArr[i] & 255) << 16) | ((bArr[i + 1] & 255) << 8);
            char[] cArr = f1071c;
            sb.append(cArr[(i3 >>> 18) & 63]);
            sb.append(cArr[(i3 >>> 12) & 63]);
            sb.append(cArr[(i3 >>> 6) & 63]);
            sb.append(cArr[i3 & 63]);
            i += 3;
        }
        int length = bArr.length - i;
        if (length == 1) {
            int i4 = (bArr[i] & 255) << 16;
            char[] cArr2 = f1071c;
            sb.append(cArr2[(i4 >>> 18) & 63]);
            sb.append(cArr2[(i4 >>> 12) & 63]);
            sb.append("==");
        } else if (length == 2) {
            int i5 = ((bArr[i + 1] & 255) << 8) | ((bArr[i] & 255) << 16);
            char[] cArr3 = f1071c;
            sb.append(cArr3[(i5 >>> 18) & 63]);
            sb.append(cArr3[(i5 >>> 12) & 63]);
            sb.append(cArr3[(i5 >>> 6) & 63]);
            sb.append('=');
        }
        return sb.toString();
    }

    static String i(byte[] bArr) {
        char[] charArray = "0123456789abcdef".toCharArray();
        char[] cArr = new char[bArr.length * 2];
        for (int i = 0; i < bArr.length; i++) {
            byte b2 = bArr[i];
            int i2 = i * 2;
            cArr[i2] = charArray[(b2 & 255) >>> 4];
            cArr[i2 + 1] = charArray[b2 & 15];
        }
        return new String(cArr);
    }

    private static long j(int i, int i2, int i3, int i4, int i5, int i6) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getTimeZone("UTC"));
        gregorianCalendar.clear();
        gregorianCalendar.set(i, i2, i3, i4, i5, i6);
        return gregorianCalendar.getTimeInMillis();
    }
}
