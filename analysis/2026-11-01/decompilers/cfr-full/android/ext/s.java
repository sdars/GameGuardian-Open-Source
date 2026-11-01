/*
 * Decompiled with CFR 0.152.
 */
package android.ext;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Arrays;

abstract class s {
    private static final Charset a = Charset.forName("UTF-16LE");
    private static final Charset b = Charset.forName("UTF-8");

    private static String a(byte[] byArray, int n3, int n4, boolean bl) {
        if (bl) {
            int n5;
            n4 = n5 = n3 + 1;
            if ((byArray[n3] & 0x80) != 0) {
                n4 = byArray[n5];
                n4 = n3 + 2;
            }
            int n6 = n4 + 1;
            byte by = byArray[n4];
            n5 = by & 0xFF;
            n3 = n6;
            if ((by & 0x80) != 0) {
                n5 = (by & 0x7F) << 8 | byArray[n6] & 0xFF;
                n3 = n4 + 2;
            }
            return new String(byArray, n3, n5, s.i());
        }
        int n7 = byArray[n3] & 0xFF | (byArray[n3 + 1] & 0xFF) << 8;
        if ((0x8000 & n7) != 0) {
            n7 = (n7 & Short.MAX_VALUE) << 16 | (byArray[n3 + 2] & 0xFF | (byArray[n3 + 3] & 0xFF) << 8);
            n4 = 4;
        } else {
            n4 = 2;
        }
        return new String(byArray, n3 + n4, n7 * 2, s.h());
    }

    private static byte[] b(String object, boolean bl) {
        if (bl) {
            byte[] byArray = ((String)object).getBytes(s.i());
            int n3 = ((String)object).length();
            if (n3 < 128 && byArray.length < 128) {
                int n4 = byArray.length;
                object = new byte[n4 + 3];
                object[0] = (byte)n3;
                object[1] = (byte)byArray.length;
                System.arraycopy(byArray, 0, object, 2, byArray.length);
                object[n4 + 2] = false;
                return object;
            }
            throw new IOException("replacement string too long");
        }
        if (((String)object).length() <= Short.MAX_VALUE) {
            byte[] byArray = ((String)object).getBytes(s.h());
            int n5 = ((String)object).length();
            object = new byte[byArray.length + 4];
            object[0] = (byte)n5;
            object[1] = (byte)(n5 >> 8);
            System.arraycopy(byArray, 0, object, 2, byArray.length);
            return object;
        }
        throw new IOException("replacement string too long");
    }

    private static int c(byte[] byArray, byte[] byArray2, int n3) {
        block0: for (n3 = Math.max(0, n3); n3 <= byArray.length - byArray2.length; ++n3) {
            for (int i3 = 0; i3 < byArray2.length; ++i3) {
                if (byArray[n3 + i3] == byArray2[i3]) continue;
                continue block0;
            }
            return n3;
        }
        return -1;
    }

    static byte[] d(byte[] object, byte[] byArray, byte[] byArray2, String string2) {
        if (object != null && byArray != null && byArray2 != null) {
            if (byArray.length != 0 && byArray.length == byArray2.length) {
                int n3 = s.c((byte[])object, byArray, 0);
                if (n3 >= 0) {
                    if (s.c((byte[])object, byArray, n3 + 1) < 0) {
                        object = (byte[])object.clone();
                        System.arraycopy(byArray2, 0, object, n3, byArray2.length);
                        return object;
                    }
                    object = new StringBuilder();
                    ((StringBuilder)object).append(string2);
                    ((StringBuilder)object).append(": expected byte pattern appears more than once");
                    throw new IOException(((StringBuilder)object).toString());
                }
                object = new StringBuilder();
                ((StringBuilder)object).append(string2);
                ((StringBuilder)object).append(": expected byte pattern not found");
                throw new IOException(((StringBuilder)object).toString());
            }
            object = new StringBuilder();
            ((StringBuilder)object).append(string2);
            ((StringBuilder)object).append(": replacement length must equal the pattern length");
            throw new IOException(((StringBuilder)object).toString());
        }
        object = new StringBuilder();
        ((StringBuilder)object).append(string2);
        ((StringBuilder)object).append(": null input");
        throw new IOException(((StringBuilder)object).toString());
    }

    static byte[] e(byte[] object, String object2, String object3, String object4) {
        block32: {
            block33: {
                block34: {
                    block35: {
                        block36: {
                            block37: {
                                block38: {
                                    block39: {
                                        block40: {
                                            block41: {
                                                block42: {
                                                    block43: {
                                                        block44: {
                                                            block45: {
                                                                block46: {
                                                                    block47: {
                                                                        int n3;
                                                                        int n4;
                                                                        int n5;
                                                                        int n6;
                                                                        int n7;
                                                                        int n8;
                                                                        int[] nArray;
                                                                        boolean bl;
                                                                        int n9;
                                                                        int n10;
                                                                        int n11;
                                                                        int n12;
                                                                        int n13;
                                                                        int n14;
                                                                        int n15;
                                                                        int n16;
                                                                        int n17;
                                                                        Object object5;
                                                                        block30: {
                                                                            long l3;
                                                                            long l4;
                                                                            long l5;
                                                                            if (object == null) break block32;
                                                                            if (object2 == null || object3 == null) break block33;
                                                                            if (((String)object2).isEmpty()) break block34;
                                                                            if (((byte[])object).length < 36) break block35;
                                                                            if (((Object)object).length > 0x100000) break block36;
                                                                            object5 = ByteBuffer.wrap((byte[])object).order(ByteOrder.LITTLE_ENDIAN);
                                                                            n17 = ((ByteBuffer)object5).getShort(0);
                                                                            n16 = ((ByteBuffer)object5).getShort(2);
                                                                            n15 = ((ByteBuffer)object5).getInt(4);
                                                                            if ((n17 & 0xFFFF) != 3) break block37;
                                                                            if ((n16 & 0xFFFF) != 8) break block38;
                                                                            if (n15 < 8 || n15 != ((Object)object).length || n15 % 4 != 0) break block39;
                                                                            n16 = ((ByteBuffer)object5).getShort(8);
                                                                            n14 = ((ByteBuffer)object5).getShort(10) & 0xFFFF;
                                                                            n13 = ((ByteBuffer)object5).getInt(12);
                                                                            if ((n16 & 0xFFFF) != 1) break block40;
                                                                            if (n14 < 28) break block41;
                                                                            if (n13 < n14 || n13 % 4 != 0 || (l5 = (l4 = (long)n13) + 8L) > (long)((Object)object).length) break block42;
                                                                            n16 = ((ByteBuffer)object5).getInt(16);
                                                                            n12 = ((ByteBuffer)object5).getInt(20);
                                                                            n11 = ((ByteBuffer)object5).getInt(24);
                                                                            n10 = ((ByteBuffer)object5).getInt(28);
                                                                            n9 = ((ByteBuffer)object5).getInt(32);
                                                                            bl = (n11 & 0x100) != 0;
                                                                            if (n16 < 1 || n16 > 65536) break block43;
                                                                            if (n12 < 0 || n12 > 4096) break block44;
                                                                            if (n10 % 4 != 0 || n10 < n14 || (l3 = (long)n10) + 8L > l5) break block45;
                                                                            if (n12 > 0 && (n9 % 4 != 0 || n9 <= n10 || (long)n9 + 8L > l5)) {
                                                                                object = new StringBuilder();
                                                                                ((StringBuilder)object).append((String)object4);
                                                                                ((StringBuilder)object).append(": stylesStart is not a 4-aligned offset after the strings");
                                                                                throw new IOException(((StringBuilder)object).toString());
                                                                            }
                                                                            if ((long)n14 + (long)(n16 + n12) * 4L > l3) break block46;
                                                                            nArray = new int[n16];
                                                                            for (n17 = 0; n17 < n16; ++n17) {
                                                                                nArray[n17] = n8 = ((ByteBuffer)object5).getInt(n14 + 8 + n17 * 4);
                                                                                if (n8 >= 0 && (long)n8 + l3 < l4) {
                                                                                    if (n17 <= 0 || n8 >= nArray[n17 - 1]) continue;
                                                                                    object = new StringBuilder();
                                                                                    ((StringBuilder)object).append((String)object4);
                                                                                    ((StringBuilder)object).append(": string offsets are not non-decreasing");
                                                                                    throw new IOException(((StringBuilder)object).toString());
                                                                                }
                                                                                object = new StringBuilder();
                                                                                ((StringBuilder)object).append((String)object4);
                                                                                ((StringBuilder)object).append(": string offset ");
                                                                                ((StringBuilder)object).append(n17);
                                                                                ((StringBuilder)object).append(" is outside the string data");
                                                                                throw new IOException(((StringBuilder)object).toString());
                                                                            }
                                                                            n17 = n16;
                                                                            if (nArray[0] != 0) break block47;
                                                                            n16 = n17;
                                                                            if (n12 > 0) {
                                                                                n8 = 0;
                                                                                while (true) {
                                                                                    n16 = n17;
                                                                                    if (n8 >= n12) break block30;
                                                                                    n7 = n17 + n8;
                                                                                    n16 = n14 + 8;
                                                                                    n6 = ((ByteBuffer)object5).getInt(n7 * 4 + n16);
                                                                                    if (n6 < 0 || (long)n6 + 8L > (long)(n13 - n9)) break;
                                                                                    if (n8 > 0 && n6 < ((ByteBuffer)object5).getInt(n16 + (n7 - 1) * 4)) {
                                                                                        object = new StringBuilder();
                                                                                        ((StringBuilder)object).append((String)object4);
                                                                                        ((StringBuilder)object).append(": style offsets are not non-decreasing");
                                                                                        throw new IOException(((StringBuilder)object).toString());
                                                                                    }
                                                                                    ++n8;
                                                                                }
                                                                                object = new StringBuilder();
                                                                                ((StringBuilder)object).append((String)object4);
                                                                                ((StringBuilder)object).append(": style offset ");
                                                                                ((StringBuilder)object).append(n8);
                                                                                ((StringBuilder)object).append(" is outside the style data");
                                                                                throw new IOException(((StringBuilder)object).toString());
                                                                            }
                                                                        }
                                                                        for (n8 = n17 = n13 + 8; n8 < ((Object)object).length; n8 += n7) {
                                                                            if (n8 + 8 <= ((Object)object).length) {
                                                                                n6 = ((ByteBuffer)object5).getShort(n8 + 2) & 0xFFFF;
                                                                                n7 = ((ByteBuffer)object5).getInt(n8 + 4);
                                                                                if (n6 >= 8 && n7 >= n6 && (long)n8 + (long)n7 <= (long)((Object)object).length) {
                                                                                    continue;
                                                                                }
                                                                                object = new StringBuilder();
                                                                                ((StringBuilder)object).append((String)object4);
                                                                                ((StringBuilder)object).append(": trailing chunk at ");
                                                                                ((StringBuilder)object).append(n8);
                                                                                ((StringBuilder)object).append(" is invalid");
                                                                                throw new IOException(((StringBuilder)object).toString());
                                                                            }
                                                                            object = new StringBuilder();
                                                                            ((StringBuilder)object).append((String)object4);
                                                                            ((StringBuilder)object).append(": trailing chunk header truncated at ");
                                                                            ((StringBuilder)object).append(n8);
                                                                            throw new IOException(((StringBuilder)object).toString());
                                                                        }
                                                                        int n18 = n10 + 8;
                                                                        n8 = n12 > 0 ? n9 + 8 : n17;
                                                                        n7 = n8 - n18;
                                                                        n8 = n16;
                                                                        object5 = new int[n8];
                                                                        n6 = 0;
                                                                        n16 = n7;
                                                                        while (n6 < n8) {
                                                                            block48: {
                                                                                block49: {
                                                                                    block52: {
                                                                                        block51: {
                                                                                            block50: {
                                                                                                n5 = n6 + 1;
                                                                                                n7 = n5 < n8 ? nArray[n5] : n16;
                                                                                                if (n7 <= (n4 = nArray[n6])) break block48;
                                                                                                n3 = bl ? s.g((byte[])object, n18 + n4, n7 - n4) : s.f((byte[])object, n18 + n4, n7 - n4);
                                                                                                object5[n6] = n3;
                                                                                                if (n3 <= 0) break block49;
                                                                                                n7 -= n4;
                                                                                                if (n5 >= n8) break block50;
                                                                                                if (n3 != n7) {
                                                                                                    object = new StringBuilder();
                                                                                                    ((StringBuilder)object).append((String)object4);
                                                                                                    ((StringBuilder)object).append(": string ");
                                                                                                    ((StringBuilder)object).append(n6);
                                                                                                    ((StringBuilder)object).append(" does not tile up to the next offset");
                                                                                                    throw new IOException(((StringBuilder)object).toString());
                                                                                                }
                                                                                                break block51;
                                                                                            }
                                                                                            if (n3 > n7 || n7 - n3 >= 4) break block52;
                                                                                        }
                                                                                        n6 = n5;
                                                                                        continue;
                                                                                    }
                                                                                    object = new StringBuilder();
                                                                                    ((StringBuilder)object).append((String)object4);
                                                                                    ((StringBuilder)object).append(": trailing padding after the last string is invalid");
                                                                                    throw new IOException(((StringBuilder)object).toString());
                                                                                }
                                                                                object = new StringBuilder();
                                                                                ((StringBuilder)object).append((String)object4);
                                                                                ((StringBuilder)object).append(": string ");
                                                                                ((StringBuilder)object).append(n6);
                                                                                ((StringBuilder)object).append(" is malformed or truncated");
                                                                                throw new IOException(((StringBuilder)object).toString());
                                                                            }
                                                                            object = new StringBuilder();
                                                                            ((StringBuilder)object).append((String)object4);
                                                                            ((StringBuilder)object).append(": string ");
                                                                            ((StringBuilder)object).append(n6);
                                                                            ((StringBuilder)object).append(" has an empty region");
                                                                            throw new IOException(((StringBuilder)object).toString());
                                                                        }
                                                                        n16 = 0;
                                                                        for (n7 = 0; n7 < n8; ++n7) {
                                                                            n6 = n16;
                                                                            if (((String)object2).equals(s.a((byte[])object, nArray[n7] + n18, (int)object5[n7], bl))) {
                                                                                n6 = n16 + 1;
                                                                            }
                                                                            n16 = n6;
                                                                        }
                                                                        if (n16 != 0) {
                                                                            if (n16 <= 1) {
                                                                                block31: {
                                                                                    object4 = s.b((String)object3, bl);
                                                                                    for (n16 = 0; n16 < n8; ++n16) {
                                                                                        if (!((String)object2).equals(s.a((byte[])object, nArray[n16] + n18, (int)object5[n16], bl))) {
                                                                                            continue;
                                                                                        }
                                                                                        break block31;
                                                                                    }
                                                                                    n16 = -1;
                                                                                }
                                                                                n5 = ((Object)object4).length - object5[n16];
                                                                                n6 = n8 - 1;
                                                                                n10 = n10 + (nArray[n6] + object5[n6]) + n5;
                                                                                n4 = (4 - n10 % 4) % 4;
                                                                                if (n12 > 0) {
                                                                                    n6 = n10 + n4;
                                                                                    n10 = n13 - n9 + n6;
                                                                                } else {
                                                                                    n10 += n4;
                                                                                    n6 = 0;
                                                                                }
                                                                                int n19 = n10 - n13;
                                                                                byte[] byArray = new byte[((Object)object).length + n19];
                                                                                System.arraycopy(object, 0, byArray, 0, n18);
                                                                                ByteBuffer byteBuffer = ByteBuffer.wrap(byArray).order(ByteOrder.LITTLE_ENDIAN);
                                                                                n7 = 0;
                                                                                object2 = object5;
                                                                                for (n3 = 0; n3 < n8; ++n3) {
                                                                                    if (n3 == n16) {
                                                                                        object3 = object4;
                                                                                    } else {
                                                                                        int n20 = nArray[n3];
                                                                                        object3 = Arrays.copyOfRange((byte[])object, n18 + n20, n18 + n20 + object2[n3]);
                                                                                    }
                                                                                    if (n3 > n16) {
                                                                                        nArray[n3] = nArray[n3] + n5;
                                                                                    }
                                                                                    byteBuffer.putInt(n14 + 8 + n3 * 4, n7);
                                                                                    System.arraycopy(object3, 0, byArray, n18 + n7, ((Object)object3).length);
                                                                                    n7 += ((Object)object3).length;
                                                                                }
                                                                                for (n16 = 0; n16 < n4; ++n16) {
                                                                                    byArray[n18 + n7 + n16] = 0;
                                                                                }
                                                                                if (n12 > 0) {
                                                                                    System.arraycopy(object, n9 + 8, byArray, n18 + (n7 + n4), n13 - n9);
                                                                                    byteBuffer.putInt(32, n6);
                                                                                }
                                                                                byteBuffer.putInt(12, n10);
                                                                                byteBuffer.putInt(24, n11 & 0xFFFFFFFE);
                                                                                byteBuffer.putInt(4, n15 + n19);
                                                                                System.arraycopy(object, n17, byArray, n10 + 8, ((Object)object).length - n17);
                                                                                return byArray;
                                                                            }
                                                                            object = new StringBuilder();
                                                                            ((StringBuilder)object).append((String)object4);
                                                                            ((StringBuilder)object).append(": expected string appears more than once in the string pool");
                                                                            throw new IOException(((StringBuilder)object).toString());
                                                                        }
                                                                        object = new StringBuilder();
                                                                        ((StringBuilder)object).append((String)object4);
                                                                        ((StringBuilder)object).append(": expected string not found in the string pool");
                                                                        throw new IOException(((StringBuilder)object).toString());
                                                                    }
                                                                    object = new StringBuilder();
                                                                    ((StringBuilder)object).append((String)object4);
                                                                    ((StringBuilder)object).append(": first string offset is not zero");
                                                                    throw new IOException(((StringBuilder)object).toString());
                                                                }
                                                                object = new StringBuilder();
                                                                ((StringBuilder)object).append((String)object4);
                                                                ((StringBuilder)object).append(": string offsets overlap the string data");
                                                                throw new IOException(((StringBuilder)object).toString());
                                                            }
                                                            object = new StringBuilder();
                                                            ((StringBuilder)object).append((String)object4);
                                                            ((StringBuilder)object).append(": stringsStart is not a 4-aligned offset inside the pool");
                                                            throw new IOException(((StringBuilder)object).toString());
                                                        }
                                                        object = new StringBuilder();
                                                        ((StringBuilder)object).append((String)object4);
                                                        ((StringBuilder)object).append(": style count is out of bounds");
                                                        throw new IOException(((StringBuilder)object).toString());
                                                    }
                                                    object = new StringBuilder();
                                                    ((StringBuilder)object).append((String)object4);
                                                    ((StringBuilder)object).append(": string count is out of bounds");
                                                    throw new IOException(((StringBuilder)object).toString());
                                                }
                                                object = new StringBuilder();
                                                ((StringBuilder)object).append((String)object4);
                                                ((StringBuilder)object).append(": string pool size is not a valid chunk");
                                                throw new IOException(((StringBuilder)object).toString());
                                            }
                                            object = new StringBuilder();
                                            ((StringBuilder)object).append((String)object4);
                                            ((StringBuilder)object).append(": string pool header size is too small");
                                            throw new IOException(((StringBuilder)object).toString());
                                        }
                                        object = new StringBuilder();
                                        ((StringBuilder)object).append((String)object4);
                                        ((StringBuilder)object).append(": chunk after the root header is not a string pool");
                                        throw new IOException(((StringBuilder)object).toString());
                                    }
                                    object = new StringBuilder();
                                    ((StringBuilder)object).append((String)object4);
                                    ((StringBuilder)object).append(": root chunk size does not match the document");
                                    throw new IOException(((StringBuilder)object).toString());
                                }
                                object = new StringBuilder();
                                ((StringBuilder)object).append((String)object4);
                                ((StringBuilder)object).append(": root chunk header size is not 8");
                                throw new IOException(((StringBuilder)object).toString());
                            }
                            object = new StringBuilder();
                            ((StringBuilder)object).append((String)object4);
                            ((StringBuilder)object).append(": root chunk type is not RES_XML_TYPE");
                            throw new IOException(((StringBuilder)object).toString());
                        }
                        object = new StringBuilder();
                        ((StringBuilder)object).append((String)object4);
                        ((StringBuilder)object).append(": binary XML unreasonably large");
                        throw new IOException(((StringBuilder)object).toString());
                    }
                    object = new StringBuilder();
                    ((StringBuilder)object).append((String)object4);
                    ((StringBuilder)object).append(": binary XML too small for a root + string pool header");
                    throw new IOException(((StringBuilder)object).toString());
                }
                object = new StringBuilder();
                ((StringBuilder)object).append((String)object4);
                ((StringBuilder)object).append(": expected string is empty");
                throw new IOException(((StringBuilder)object).toString());
            }
            object = new StringBuilder();
            ((StringBuilder)object).append((String)object4);
            ((StringBuilder)object).append(": expected/replacement strings are null");
            throw new IOException(((StringBuilder)object).toString());
        }
        object = new StringBuilder();
        ((StringBuilder)object).append((String)object4);
        ((StringBuilder)object).append(": binary XML is null");
        throw new IOException(((StringBuilder)object).toString());
    }

    private static int f(byte[] byArray, int n3, int n4) {
        int n5 = 4;
        if (n4 < 4) {
            return 0;
        }
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray).order(ByteOrder.LITTLE_ENDIAN);
        int n6 = byteBuffer.getChar(n3);
        if ((0x8000 & n6) != 0) {
            if (n4 < 6) {
                return 0;
            }
            n6 = (n6 & Short.MAX_VALUE) << 16 | byteBuffer.getChar(n3 + 2);
        } else {
            n5 = 2;
        }
        if (n6 > Short.MAX_VALUE) {
            return 0;
        }
        if ((n6 = n5 + n6 * 2 + 2) <= n4 && byArray[(n3 += n6) - 2] == 0 && byArray[n3 - 1] == 0) {
            return n6;
        }
        return 0;
    }

    private static int g(byte[] byArray, int n3, int n4) {
        int n5 = n3 + n4;
        if (n5 - n3 < 3) {
            return 0;
        }
        int n6 = n3 + 1;
        int n7 = byArray[n3];
        int n8 = n7 & 0xFF;
        int n9 = n6;
        if ((n7 & 0x80) != 0) {
            if (n6 >= n5) {
                return 0;
            }
            n8 = byArray[n6] & 0xFF | (n7 & 0x7F) << 8;
            n9 = n3 + 2;
        }
        if (n8 > Short.MAX_VALUE) {
            return 0;
        }
        n7 = n9 + 1;
        byte by = byArray[n9];
        n6 = by & 0xFF;
        n8 = n7;
        if ((by & 0x80) != 0) {
            if (n7 >= n5) {
                return 0;
            }
            n6 = (by & 0x7F) << 8 | byArray[n7] & 0xFF;
            n8 = n9 + 2;
        }
        if ((n9 = n8 - n3 + n6 + 1) > n4) {
            return 0;
        }
        if (byArray[n3 + n9 - 1] != 0) {
            return 0;
        }
        return n9;
    }

    private static Charset h() {
        return a;
    }

    private static Charset i() {
        return b;
    }
}

