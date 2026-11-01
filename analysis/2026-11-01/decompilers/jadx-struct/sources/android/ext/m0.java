package android.ext;

import java.io.ByteArrayInputStream;
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

/* JADX INFO: loaded from: classes.dex */
abstract class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long f1069a = j(2000, 0, 1, 0, 0, 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f1070b = j(2099, 11, 31, 23, 59, 59);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final char[] f1071c = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".toCharArray();

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

    static m0$b g(byte[] bArr) throws GeneralSecurityException, IOException {
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
        byte[] bArrI = m0$a.i(b(m0$a.h("1.2.840.113549.1.1.11"), m0$a.f()));
        byte[] bArrI2 = m0$a.i(b(m0$a.h("2.16.840.1.101.3.4.2.1"), m0$a.f()));
        byte[] bArrI3 = m0$a.i(b(m0$a.h("1.2.840.113549.1.1.1"), m0$a.f()));
        byte[] bArrE = m0$a.e(bArr2);
        byte[] bArrI4 = m0$a.i(m0$a.j(m0$a.i(b(m0$a.h("2.5.4.3"), m0$a.m(strI)))));
        byte[] bArrI5 = m0$a.i(b(m0$a.b(0, m0$a.e(new byte[]{2})), bArrE, bArrI, bArrI4, m0$a.i(b(m0$a.l("000101000000Z"), m0$a.d("20991231235959Z"))), bArrI4, rSAPublicKey.getEncoded()));
        Signature signature = Signature.getInstance("SHA256withRSA");
        signature.initSign(keyPairGenerateKeyPair.getPrivate());
        signature.update(bArrI5);
        byte[] bArrI6 = m0$a.i(b(bArrI5, bArrI, m0$a.a(signature.sign(), 0)));
        Signature signature2 = Signature.getInstance("SHA256withRSA");
        signature2.initSign(keyPairGenerateKeyPair.getPrivate());
        signature2.update(bArr);
        byte[] bArrSign = signature2.sign();
        long length = bArrI6.length;
        if (length >= 65536) {
            throw new IOException("certificate too large: " + length);
        }
        byte[] bArrI7 = m0$a.i(b(m0$a.h("1.2.840.113549.1.7.2"), m0$a.b(0, m0$a.i(b(m0$a.e(new byte[]{1}), m0$a.j(bArrI2), m0$a.i(m0$a.h("1.2.840.113549.1.7.1")), m0$a.c(0, bArrI6), m0$a.j(m0$a.i(b(m0$a.e(new byte[]{1}), m0$a.i(b(bArrI4, bArrE)), bArrI2, bArrI3, m0$a.g(bArrSign)))))))));
        if (bArrI7.length < 65536) {
            String strF = f(bArrI6);
            e(bArrI6, rSAPublicKey, bArr2, strF);
            return new m0$b(bArrI7, strF);
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
