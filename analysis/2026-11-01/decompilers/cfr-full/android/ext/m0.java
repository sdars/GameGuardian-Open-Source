/*
 * Decompiled with CFR 0.152.
 */
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
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAKeyGenParameterSpec;
import java.util.Arrays;
import java.util.GregorianCalendar;
import java.util.TimeZone;

abstract class m0 {
    private static final long a = m0.j(2000, 0, 1, 0, 0, 0);
    private static final long b = m0.j(2099, 11, 31, 23, 59, 59);
    private static final char[] c = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".toCharArray();

    private static void a(X509Certificate serializable) {
        String string2 = ((X509Certificate)serializable).getSigAlgOID();
        String string3 = ((X509Certificate)serializable).getSigAlgName();
        if (!"1.2.840.113549.1.1.11".equals(string2) && !"SHA256WITHRSA".equals(m0.d(string3))) {
            serializable = new StringBuilder();
            ((StringBuilder)serializable).append("unexpected signature algorithm: ");
            ((StringBuilder)serializable).append(string2);
            ((StringBuilder)serializable).append(" / ");
            ((StringBuilder)serializable).append(string3);
            throw new GeneralSecurityException(((StringBuilder)serializable).toString());
        }
    }

    private static byte[] b(byte[] ... byArray) {
        int n3;
        int n4 = byArray.length;
        int n5 = 0;
        for (n3 = 0; n3 < n4; ++n3) {
            n5 += byArray[n3].length;
        }
        byte[] byArray2 = new byte[n5];
        n4 = byArray.length;
        n3 = 0;
        for (n5 = 0; n5 < n4; ++n5) {
            byte[] byArray3 = byArray[n5];
            System.arraycopy(byArray3, 0, byArray2, n3, byArray3.length);
            n3 += byArray3.length;
        }
        return byArray2;
    }

    private static boolean c(byte[] byArray) {
        for (int i3 = 0; i3 < byArray.length; ++i3) {
            if (byArray[i3] == 0) continue;
            return false;
        }
        return true;
    }

    static String d(String string2) {
        if (string2 == null) {
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder(string2.length());
        for (int i3 = 0; i3 < string2.length(); ++i3) {
            char c4 = string2.charAt(i3);
            if (!Character.isLetterOrDigit(c4)) continue;
            stringBuilder.append(Character.toUpperCase(c4));
        }
        return stringBuilder.toString();
    }

    private static void e(byte[] object, RSAPublicKey rSAPublicKey, byte[] byArray, String string2) {
        Object object2 = CertificateFactory.getInstance("X.509");
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream((byte[])object);
        try {
            object2 = (X509Certificate)((CertificateFactory)object2).generateCertificate(byteArrayInputStream);
        }
        catch (ClassCastException classCastException) {
            throw new GeneralSecurityException("generated certificate is not X.509", classCastException);
        }
        if (byteArrayInputStream.available() == 0) {
            if (((X509Certificate)object2).getVersion() == 3) {
                if (((X509Certificate)object2).getIssuerX500Principal().equals(((X509Certificate)object2).getSubjectX500Principal()) && Arrays.equals(((X509Certificate)object2).getIssuerX500Principal().getEncoded(), ((X509Certificate)object2).getSubjectX500Principal().getEncoded())) {
                    if (((X509Certificate)object2).getSerialNumber().equals(new BigInteger(1, byArray))) {
                        if (Arrays.equals(((Certificate)object2).getPublicKey().getEncoded(), rSAPublicKey.getEncoded())) {
                            m0.a((X509Certificate)object2);
                            if (((X509Certificate)object2).getNotBefore().getTime() == a && ((X509Certificate)object2).getNotAfter().getTime() == b) {
                                if (string2.equals(m0.f((byte[])object))) {
                                    ((Certificate)object2).verify(rSAPublicKey);
                                    return;
                                }
                                throw new GeneralSecurityException("certificate digest mismatch");
                            }
                            object = new StringBuilder();
                            ((StringBuilder)object).append("validity mismatch: ");
                            ((StringBuilder)object).append(((X509Certificate)object2).getNotBefore().getTime());
                            ((StringBuilder)object).append(" / ");
                            ((StringBuilder)object).append(((X509Certificate)object2).getNotAfter().getTime());
                            throw new GeneralSecurityException(((StringBuilder)object).toString());
                        }
                        throw new GeneralSecurityException("public key mismatch");
                    }
                    throw new GeneralSecurityException("serial mismatch");
                }
                throw new GeneralSecurityException("issuer and subject differ");
            }
            object = new StringBuilder();
            ((StringBuilder)object).append("certificate is not v3: ");
            ((StringBuilder)object).append(((X509Certificate)object2).getVersion());
            throw new GeneralSecurityException(((StringBuilder)object).toString());
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("certificate has trailing bytes: ");
        ((StringBuilder)object).append(byteArrayInputStream.available());
        throw new GeneralSecurityException(((StringBuilder)object).toString());
    }

    private static String f(byte[] byArray) {
        return m0.i(MessageDigest.getInstance("SHA-256").digest(byArray));
    }

    static b g(byte[] object) {
        if (object != null) {
            Object object2 = new SecureRandom();
            Object object3 = KeyPairGenerator.getInstance("RSA");
            ((KeyPairGenerator)object3).initialize(new RSAKeyGenParameterSpec(2048, RSAKeyGenParameterSpec.F4), (SecureRandom)object2);
            KeyPair keyPair = ((KeyPairGenerator)object3).generateKeyPair();
            if (keyPair.getPublic() instanceof RSAPublicKey) {
                object3 = (RSAPublicKey)keyPair.getPublic();
                if (object3.getModulus().bitLength() == 2048 && object3.getPublicExponent().intValue() == 65537) {
                    byte[] byArray = new byte[16];
                    do {
                        ((SecureRandom)object2).nextBytes(byArray);
                    } while (m0.c(byArray));
                    byte[] byArray2 = new byte[16];
                    ((SecureRandom)object2).nextBytes(byArray2);
                    Object object4 = m0.i(byArray2);
                    byte[] byArray3 = android.ext.m0$a.i(m0.b(android.ext.m0$a.h("1.2.840.113549.1.1.11"), android.ext.m0$a.f()));
                    object2 = android.ext.m0$a.i(m0.b(android.ext.m0$a.h("2.16.840.1.101.3.4.2.1"), android.ext.m0$a.f()));
                    byte[] byArray4 = android.ext.m0$a.i(m0.b(android.ext.m0$a.h("1.2.840.113549.1.1.1"), android.ext.m0$a.f()));
                    byArray2 = android.ext.m0$a.e(byArray);
                    object4 = android.ext.m0$a.i(android.ext.m0$a.j(android.ext.m0$a.i(m0.b(android.ext.m0$a.h("2.5.4.3"), android.ext.m0$a.m((String)object4)))));
                    Object object5 = android.ext.m0$a.i(m0.b(android.ext.m0$a.b(0, android.ext.m0$a.e(new byte[]{2})), byArray2, byArray3, (byte[])object4, android.ext.m0$a.i(m0.b(android.ext.m0$a.l("000101000000Z"), android.ext.m0$a.d("20991231235959Z"))), (byte[])object4, object3.getEncoded()));
                    Signature signature = Signature.getInstance("SHA256withRSA");
                    signature.initSign(keyPair.getPrivate());
                    signature.update((byte[])object5);
                    byArray3 = android.ext.m0$a.i(m0.b(new byte[][]{object5, byArray3, android.ext.m0$a.a(signature.sign(), 0)}));
                    object5 = Signature.getInstance("SHA256withRSA");
                    ((Signature)object5).initSign(keyPair.getPrivate());
                    ((Signature)object5).update((byte[])object);
                    object = ((Signature)object5).sign();
                    long l3 = byArray3.length;
                    if (l3 < 65536L) {
                        object = android.ext.m0$a.i(m0.b(android.ext.m0$a.e(new byte[]{1}), android.ext.m0$a.i(m0.b((byte[])object4, byArray2)), (byte[])object2, byArray4, android.ext.m0$a.g(object)));
                        object = android.ext.m0$a.i(m0.b(android.ext.m0$a.e(new byte[]{1}), android.ext.m0$a.j((byte[])object2), android.ext.m0$a.i(android.ext.m0$a.h("1.2.840.113549.1.7.1")), android.ext.m0$a.c(0, byArray3), android.ext.m0$a.j(object)));
                        object = android.ext.m0$a.i(m0.b(android.ext.m0$a.h("1.2.840.113549.1.7.2"), android.ext.m0$a.b(0, object)));
                        if (((byte[])object).length < 65536) {
                            object2 = m0.f(byArray3);
                            m0.e(byArray3, (RSAPublicKey)object3, byArray, (String)object2);
                            return new b((byte[])object, (String)object2);
                        }
                        object3 = new StringBuilder();
                        ((StringBuilder)object3).append("CERT.RSA too large: ");
                        ((StringBuilder)object3).append(((byte[])object).length);
                        throw new IOException(((StringBuilder)object3).toString());
                    }
                    object = new StringBuilder();
                    object.append("certificate too large: ");
                    object.append(l3);
                    throw new IOException(object.toString());
                }
                object = new StringBuilder();
                object.append("unexpected RSA profile: ");
                object.append(object3.getModulus().bitLength());
                object.append(" bits, exponent ");
                object.append(object3.getPublicExponent());
                throw new GeneralSecurityException(object.toString());
            }
            throw new GeneralSecurityException("RSA key generator returned a non-RSA public key");
        }
        throw new GeneralSecurityException("missing CERT.SF bytes");
    }

    static String h(byte[] objectArray) {
        int n3;
        StringBuilder stringBuilder = new StringBuilder((objectArray.length + 2) / 3 * 4);
        int n4 = 0;
        while ((n3 = n4 + 2) < objectArray.length) {
            byte by = objectArray[n4];
            byte by2 = objectArray[n4 + 1];
            n3 = objectArray[n3] & 0xFF | ((by & 0xFF) << 16 | (by2 & 0xFF) << 8);
            char[] cArray = c;
            stringBuilder.append(cArray[n3 >>> 18 & 0x3F]);
            stringBuilder.append(cArray[n3 >>> 12 & 0x3F]);
            stringBuilder.append(cArray[n3 >>> 6 & 0x3F]);
            stringBuilder.append(cArray[n3 & 0x3F]);
            n4 += 3;
        }
        n3 = objectArray.length - n4;
        if (n3 == 1) {
            n4 = (objectArray[n4] & 0xFF) << 16;
            objectArray = c;
            stringBuilder.append((char)objectArray[n4 >>> 18 & 0x3F]);
            stringBuilder.append((char)objectArray[n4 >>> 12 & 0x3F]);
            stringBuilder.append("==");
        } else if (n3 == 2) {
            n3 = objectArray[n4];
            n4 = (objectArray[n4 + 1] & 0xFF) << 8 | (n3 & 0xFF) << 16;
            objectArray = c;
            stringBuilder.append((char)objectArray[n4 >>> 18 & 0x3F]);
            stringBuilder.append((char)objectArray[n4 >>> 12 & 0x3F]);
            stringBuilder.append((char)objectArray[n4 >>> 6 & 0x3F]);
            stringBuilder.append('=');
        }
        return stringBuilder.toString();
    }

    static String i(byte[] byArray) {
        char[] cArray = "0123456789abcdef".toCharArray();
        char[] cArray2 = new char[byArray.length * 2];
        for (int i3 = 0; i3 < byArray.length; ++i3) {
            byte by = byArray[i3];
            int n3 = i3 * 2;
            cArray2[n3] = cArray[(by & 0xFF) >>> 4];
            cArray2[n3 + 1] = cArray[by & 0xF];
        }
        return new String(cArray2);
    }

    private static long j(int n3, int n4, int n5, int n6, int n7, int n8) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getTimeZone("UTC"));
        gregorianCalendar.clear();
        gregorianCalendar.set(n3, n4, n5, n6, n7, n8);
        return gregorianCalendar.getTimeInMillis();
    }

    static final abstract class a {
        static byte[] a(byte[] object, int n3) {
            if (n3 >= 0 && n3 <= 7) {
                byte[] byArray = new byte[((byte[])object).length + 1];
                byArray[0] = (byte)n3;
                System.arraycopy(object, 0, byArray, 1, ((Object)object).length);
                return android.ext.m0$a.k(3, byArray);
            }
            object = new StringBuilder();
            ((StringBuilder)object).append("bad unused bit count: ");
            ((StringBuilder)object).append(n3);
            throw new IOException(((StringBuilder)object).toString());
        }

        static byte[] b(int n3, byte[] byArray) {
            return android.ext.m0$a.k(n3 | 0xA0, byArray);
        }

        static byte[] c(int n3, byte[] byArray) {
            return android.ext.m0$a.k(n3 | 0xA0, byArray);
        }

        static byte[] d(String string2) {
            return android.ext.m0$a.k(24, string2.getBytes("US-ASCII"));
        }

        static byte[] e(byte[] byArray) {
            if (byArray.length != 0) {
                int n3 = (byArray[0] & 0x80) != 0 ? 1 : 0;
                byte[] byArray2 = new byte[byArray.length + n3];
                System.arraycopy(byArray, 0, byArray2, n3, byArray.length);
                return android.ext.m0$a.k(2, byArray2);
            }
            throw new IOException("empty INTEGER");
        }

        static byte[] f() {
            return android.ext.m0$a.k(5, new byte[0]);
        }

        static byte[] g(byte[] byArray) {
            return android.ext.m0$a.k(4, byArray);
        }

        static byte[] h(String object) {
            Object object2 = ((String)object).split("\\.");
            int n3 = ((String[])object2).length;
            if (n3 >= 2) {
                long l3 = Long.parseLong(object2[0]);
                long l4 = Long.parseLong((String)object2[1]);
                if (l3 >= 0L && l3 <= 2L && l4 >= 0L && l4 <= 39L) {
                    object = new ByteArrayOutputStream();
                    android.ext.m0$a.n((ByteArrayOutputStream)object, l3 * 40L + l4);
                    for (int i3 = 2; i3 < ((Object)object2).length; ++i3) {
                        android.ext.m0$a.n((ByteArrayOutputStream)object, Long.parseLong((String)object2[i3]));
                    }
                    return android.ext.m0$a.k(6, ((ByteArrayOutputStream)object).toByteArray());
                }
                object2 = new StringBuilder();
                ((StringBuilder)object2).append("malformed OID arc: ");
                ((StringBuilder)object2).append((String)object);
                throw new IOException(((StringBuilder)object2).toString());
            }
            object2 = new StringBuilder();
            ((StringBuilder)object2).append("malformed OID: ");
            ((StringBuilder)object2).append((String)object);
            throw new IOException(((StringBuilder)object2).toString());
        }

        static byte[] i(byte[] byArray) {
            return android.ext.m0$a.k(48, byArray);
        }

        static byte[] j(byte[] byArray) {
            return android.ext.m0$a.k(49, byArray);
        }

        private static byte[] k(int n3, byte[] byArray) {
            if (byArray.length < 65536) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(byArray.length + 6);
                byteArrayOutputStream.write(n3);
                int n4 = byArray.length;
                if (n4 < 128) {
                    byteArrayOutputStream.write(n4);
                } else {
                    n3 = 1;
                    while (n4 >>> n3 * 8 != 0) {
                        ++n3;
                    }
                    byteArrayOutputStream.write(n3 | 0x80);
                    --n3;
                    while (n3 >= 0) {
                        byteArrayOutputStream.write(n4 >>> n3 * 8 & 0xFF);
                        --n3;
                    }
                }
                byteArrayOutputStream.write(byArray, 0, byArray.length);
                return byteArrayOutputStream.toByteArray();
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("DER value too large: ");
            stringBuilder.append(byArray.length);
            throw new IOException(stringBuilder.toString());
        }

        static byte[] l(String string2) {
            return android.ext.m0$a.k(23, string2.getBytes("US-ASCII"));
        }

        static byte[] m(String string2) {
            return android.ext.m0$a.k(12, string2.getBytes("UTF-8"));
        }

        private static void n(ByteArrayOutputStream byteArrayOutputStream, long l3) {
            if (l3 >= 0L) {
                int n3 = 1;
                while (l3 >>> n3 * 7 != 0L) {
                    ++n3;
                }
                --n3;
                while (n3 >= 0) {
                    int n4 = (int)(l3 >>> n3 * 7 & 0x7FL);
                    if (n3 != 0) {
                        n4 |= 0x80;
                    }
                    byteArrayOutputStream.write(n4);
                    --n3;
                }
                return;
            }
            throw new IOException("negative OID arc");
        }
    }

    static final class b {
        final byte[] a;
        final String b;

        b(byte[] byArray, String string2) {
            this.a = byArray;
            this.b = string2;
        }
    }
}

