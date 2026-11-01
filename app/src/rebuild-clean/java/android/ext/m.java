package android.ext;

import catch_.me_.if_.you_.can_.R;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public abstract class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static long[] f1062a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static short[] f1063b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int[] f1064c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static short[] f1065d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final n.f f1066e = new n.f();

    static class a implements Comparable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        long f1067a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f1068b;

        public a(long j, int i) {
            this.f1067a = j;
            this.f1068b = i;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(a aVar) {
            long j = this.f1067a;
            long j2 = aVar.f1067a;
            if (j < j2) {
                return -1;
            }
            return j == j2 ? 0 : 1;
        }
    }

    private static boolean a(int i, int i2, int i3, int i4) {
        if (i == 1 && i2 != 1) {
            return false;
        }
        if (i == 0 && (i2 != 0 || (i3 >> 5) != 0)) {
            return false;
        }
        if (i3 < 16) {
            return ((-i4) & 15) <= 15 - i3;
        }
        int i5 = (i == 1 ? 64 : 32) - 15;
        return i3 >= i5 && (i4 & 15) <= i3 - i5;
    }

    private static int b(int i) {
        if (i == 968) {
            return 65540;
        }
        if (i == 969) {
            return 65541;
        }
        if (i == 7075) {
            return 131085;
        }
        if (i == 7076) {
            return 131086;
        }
        if (i == 9152) {
            return 65542;
        }
        if (i == 9153) {
            return 65543;
        }
        if (i == 9217) {
            return 262174;
        }
        if (i == 9218) {
            return 262175;
        }
        switch (i) {
            case 904:
                return 196608;
            case 936:
                return 196609;
            case 945:
                return 131072;
            case 946:
                return 131073;
            case 947:
                return 131074;
            case 948:
                return 131075;
            case 949:
                return 131076;
            case 950:
                return 131077;
            case 978:
                return 131078;
            case 980:
                return 131079;
            case 982:
                return 131080;
            case 1010:
                return 131081;
            case 1012:
                return 131082;
            case 1014:
                return 131083;
            case 1037:
                return 262148;
            case 1039:
                return 262149;
            case 1041:
                return 262150;
            case 1043:
                return 262151;
            case 1045:
                return 262152;
            case 1053:
                return 262158;
            case 1055:
                return 262159;
            case 1065:
                return 262160;
            case 1067:
                return 262161;
            case 1069:
                return 262162;
            case 1071:
                return 262163;
            case 1073:
                return 262164;
            case 1075:
                return 262165;
            case 1077:
                return 262166;
            case 1085:
                return 262172;
            case 1087:
                return 262173;
            case 7073:
                return 131084;
            case 7081:
                return 196610;
            case 7121:
                return 131087;
            case 7123:
                return 131088;
            case 7125:
                return 131089;
            case 7129:
                return 131090;
            case 7137:
                return 131091;
            case 7139:
                return 131092;
            case 7141:
                return 131093;
            case 7145:
                return 131094;
            case 7147:
                return 131095;
            case 7149:
                return 131096;
            case 7153:
                return 131097;
            case 7155:
                return 131098;
            case 7157:
                return 131099;
            case 9221:
                return 262176;
            case 9222:
                return 262177;
            case 9224:
                return 262178;
            case 9225:
                return 262179;
            case 9228:
                return 262180;
            case 9229:
                return 262181;
            case 9230:
                return 262182;
            case 9233:
                return 262183;
            case 9237:
                return 262184;
            case 9240:
                return 262185;
            case 9241:
                return 262186;
            case 9244:
                return 262187;
            case 9245:
                return 262188;
            case 9246:
                return 262189;
            case 9248:
                return 262190;
            case 9249:
                return 262191;
            case 9250:
                return 262192;
            case 9251:
                return 262193;
            case 9252:
                return 262194;
            case 9253:
                return 262195;
            case 9254:
                return 262196;
            case 9255:
                return 262197;
            case 9257:
                return 262198;
            case 9261:
                return 262199;
            case 9265:
                return 262200;
            case 9269:
                return 262201;
            case 9272:
                return 262202;
            case 9273:
                return 262203;
            case 9276:
                return 262204;
            case 9277:
                return 262205;
            case 9278:
                return 262206;
            case 13248:
                return 65548;
            case 13249:
                return 65549;
            case 13320:
                return 262207;
            case 13321:
                return 262208;
            case 13325:
                return 262209;
            case 13329:
                return 262210;
            case 13333:
                return 262211;
            case 13336:
                return 262212;
            case 13337:
                return 262213;
            case 13341:
                return 262214;
            case 13353:
                return 262215;
            case 13357:
                return 262216;
            case 13361:
                return 262217;
            case 13365:
                return 262218;
            case 13368:
                return 262219;
            case 13369:
                return 262220;
            case 13373:
                return 262221;
            default:
                switch (i) {
                    case 960:
                        return 65536;
                    case 961:
                        return 65537;
                    case 962:
                        return 65538;
                    case 963:
                        return 65539;
                    default:
                        switch (i) {
                            case 1032:
                                return 262144;
                            case 1033:
                                return 262145;
                            case 1034:
                                return 262146;
                            case 1035:
                                return 262147;
                            default:
                                switch (i) {
                                    case 1047:
                                        return 262153;
                                    case 1048:
                                        return 262154;
                                    case 1049:
                                        return 262155;
                                    case 1050:
                                        return 262156;
                                    case 1051:
                                        return 262157;
                                    default:
                                        switch (i) {
                                            case 1079:
                                                return 262167;
                                            case 1080:
                                                return 262168;
                                            case 1081:
                                                return 262169;
                                            case 1082:
                                                return 262170;
                                            case 1083:
                                                return 262171;
                                            default:
                                                switch (i) {
                                                    case 9156:
                                                        return 65544;
                                                    case 9157:
                                                        return 65545;
                                                    case 9158:
                                                        return 65546;
                                                    case 9159:
                                                        return 65547;
                                                    default:
                                                        return 0;
                                                }
                                        }
                                }
                        }
                }
        }
    }

    private static int c(int i) {
        switch (i) {
            case 65536:
                return 960;
            case 65537:
                return 961;
            case 65538:
                return 962;
            case 65539:
                return 963;
            case 65540:
                return 968;
            case 65541:
                return 969;
            case 65542:
                return 9152;
            case 65543:
                return 9153;
            case 65544:
                return 9156;
            case 65545:
                return 9157;
            case 65546:
                return 9158;
            case 65547:
                return 9159;
            case 65548:
                return 13248;
            case 65549:
                return 13249;
            default:
                switch (i) {
                    case 131072:
                        return 945;
                    case 131073:
                        return 946;
                    case 131074:
                        return 947;
                    case 131075:
                        return 948;
                    case 131076:
                        return 949;
                    case 131077:
                        return 950;
                    case 131078:
                        return 978;
                    case 131079:
                        return 980;
                    case 131080:
                        return 982;
                    case 131081:
                        return 1010;
                    case 131082:
                        return 1012;
                    case 131083:
                        return 1014;
                    case 131084:
                        return 7073;
                    case 131085:
                        return 7075;
                    case 131086:
                        return 7076;
                    case 131087:
                        return 7121;
                    case 131088:
                        return 7123;
                    case 131089:
                        return 7125;
                    case 131090:
                        return 7129;
                    case 131091:
                        return 7137;
                    case 131092:
                        return 7139;
                    case 131093:
                        return 7141;
                    case 131094:
                        return 7145;
                    case 131095:
                        return 7147;
                    case 131096:
                        return 7149;
                    case 131097:
                        return 7153;
                    case 131098:
                        return 7155;
                    case 131099:
                        return 7157;
                    default:
                        switch (i) {
                            case 196608:
                                return 904;
                            case 196609:
                                return 936;
                            case 196610:
                                return 7081;
                            default:
                                switch (i) {
                                    case 262144:
                                        return 1032;
                                    case 262145:
                                        return 1033;
                                    case 262146:
                                        return 1034;
                                    case 262147:
                                        return 1035;
                                    case 262148:
                                        return 1037;
                                    case 262149:
                                        return 1039;
                                    case 262150:
                                        return 1041;
                                    case 262151:
                                        return 1043;
                                    case 262152:
                                        return 1045;
                                    case 262153:
                                        return 1047;
                                    case 262154:
                                        return 1048;
                                    case 262155:
                                        return 1049;
                                    case 262156:
                                        return 1050;
                                    case 262157:
                                        return 1051;
                                    case 262158:
                                        return 1053;
                                    case 262159:
                                        return 1055;
                                    case 262160:
                                        return 1065;
                                    case 262161:
                                        return 1067;
                                    case 262162:
                                        return 1069;
                                    case 262163:
                                        return 1071;
                                    case 262164:
                                        return 1073;
                                    case 262165:
                                        return 1075;
                                    case 262166:
                                        return 1077;
                                    case 262167:
                                        return 1079;
                                    case 262168:
                                        return 1080;
                                    case 262169:
                                        return 1081;
                                    case 262170:
                                        return 1082;
                                    case 262171:
                                        return 1083;
                                    case 262172:
                                        return 1085;
                                    case 262173:
                                        return 1087;
                                    case 262174:
                                        return 9217;
                                    case 262175:
                                        return 9218;
                                    case 262176:
                                        return 9221;
                                    case 262177:
                                        return 9222;
                                    case 262178:
                                        return 9224;
                                    case 262179:
                                        return 9225;
                                    case 262180:
                                        return 9228;
                                    case 262181:
                                        return 9229;
                                    case 262182:
                                        return 9230;
                                    case 262183:
                                        return 9233;
                                    case 262184:
                                        return 9237;
                                    case 262185:
                                        return 9240;
                                    case 262186:
                                        return 9241;
                                    case 262187:
                                        return 9244;
                                    case 262188:
                                        return 9245;
                                    case 262189:
                                        return 9246;
                                    case 262190:
                                        return 9248;
                                    case 262191:
                                        return 9249;
                                    case 262192:
                                        return 9250;
                                    case 262193:
                                        return 9251;
                                    case 262194:
                                        return 9252;
                                    case 262195:
                                        return 9253;
                                    case 262196:
                                        return 9254;
                                    case 262197:
                                        return 9255;
                                    case 262198:
                                        return 9257;
                                    case 262199:
                                        return 9261;
                                    case 262200:
                                        return 9265;
                                    case 262201:
                                        return 9269;
                                    case 262202:
                                        return 9272;
                                    case 262203:
                                        return 9273;
                                    case 262204:
                                        return 9276;
                                    case 262205:
                                        return 9277;
                                    case 262206:
                                        return 9278;
                                    case 262207:
                                        return 13320;
                                    case 262208:
                                        return 13321;
                                    case 262209:
                                        return 13325;
                                    case 262210:
                                        return 13329;
                                    case 262211:
                                        return 13333;
                                    case 262212:
                                        return 13336;
                                    case 262213:
                                        return 13337;
                                    case 262214:
                                        return 13341;
                                    case 262215:
                                        return 13353;
                                    case 262216:
                                        return 13357;
                                    case 262217:
                                        return 13361;
                                    case 262218:
                                        return 13365;
                                    case 262219:
                                        return 13368;
                                    case 262220:
                                        return 13369;
                                    case 262221:
                                        return 13373;
                                    default:
                                        return 0;
                                }
                        }
                }
        }
    }

    public static int[] d() {
        return new int[8];
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:3368:0x9f2e
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:143)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:58)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    public static int e(android.ext.n r51, int[] r52, long r53, java.lang.String r55, int r56) {
        /*
            Method dump skipped, instruction units count: 43396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.ext.m.e(android.ext.n, int[], long, java.lang.String, int):int");
    }

    private static int f(boolean z, boolean z2, long j) {
        if (f1062a == null) {
            a[] aVarArr = new a[8192];
            for (int i = 0; i < 8192; i++) {
                aVarArr[i] = new a(h((i >> 12) & 1, (i >> 6) & 63, i & 63), i);
            }
            Arrays.sort(aVarArr);
            long[] jArr = new long[8192];
            short[] sArr = new short[8192];
            for (int i2 = 0; i2 < 8192; i2++) {
                a aVar = aVarArr[i2];
                long j2 = aVar.f1067a;
                jArr[i2] = j2;
                int i3 = aVar.f1068b;
                sArr[i2] = (short) i3;
                aVar.f1067a = (i3 >> 12) == 0 ? (int) j2 : Long.MAX_VALUE;
            }
            f1062a = jArr;
            f1063b = sArr;
            Arrays.sort(aVarArr);
            int[] iArr = new int[4096];
            short[] sArr2 = new short[4096];
            for (int i4 = 0; i4 < 4096; i4++) {
                a aVar2 = aVarArr[i4];
                iArr[i4] = (int) aVar2.f1067a;
                sArr2[i4] = (short) aVar2.f1068b;
            }
            f1064c = iArr;
            f1065d = sArr2;
        }
        if (z2) {
            int iBinarySearch = Arrays.binarySearch(f1062a, j);
            boolean z3 = iBinarySearch < 0;
            if (z3 && (iBinarySearch = (-iBinarySearch) - 1) > 8191) {
                iBinarySearch = 8191;
            }
            if (z) {
                long j3 = f1062a[iBinarySearch];
                while (iBinarySearch > 0 && f1062a[iBinarySearch - 1] == j3) {
                    iBinarySearch--;
                }
                while (iBinarySearch < 8191) {
                    int i5 = iBinarySearch + 1;
                    if (f1062a[i5] != j3) {
                        break;
                    }
                    short s = f1063b[iBinarySearch];
                    if (!a(1, s >> 12, (s >> 6) & 63, s & 63)) {
                        break;
                    }
                    iBinarySearch = i5;
                }
            }
            short s2 = f1063b[iBinarySearch];
            return z3 ? -s2 : s2;
        }
        int iBinarySearch2 = Arrays.binarySearch(f1064c, (int) j);
        boolean z4 = iBinarySearch2 < 0;
        if (z4 && (iBinarySearch2 = (-iBinarySearch2) - 1) > 4095) {
            iBinarySearch2 = 4095;
        }
        if (z) {
            int i6 = f1064c[iBinarySearch2];
            while (iBinarySearch2 > 0 && f1064c[iBinarySearch2 - 1] == i6) {
                iBinarySearch2--;
            }
            while (iBinarySearch2 < 4095) {
                int i7 = iBinarySearch2 + 1;
                if (f1064c[i7] != i6) {
                    break;
                }
                short s3 = f1065d[iBinarySearch2];
                if (!a(0, s3 >> 12, (s3 >> 6) & 63, s3 & 63)) {
                    break;
                }
                iBinarySearch2 = i7;
            }
        }
        short s4 = f1065d[iBinarySearch2];
        return z4 ? -s4 : s4;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:1581:0x4163  */
    /* JADX WARN: Code duplicated, block: B:1583:0x4168 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:1584:0x416a  */
    /* JADX WARN: Code duplicated, block: B:1585:0x416d  */
    /* JADX WARN: Code duplicated, block: B:1587:0x4171  */
    /* JADX WARN: Code duplicated, block: B:1590:0x4186  */
    /* JADX WARN: Code duplicated, block: B:1591:0x4188 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:1597:0x419c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:1598:0x419e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:1607:0x41c0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:1611:0x41cf  */
    /* JADX WARN: Code duplicated, block: B:1613:0x41d3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:1614:0x41d5  */
    /* JADX WARN: Code duplicated, block: B:1615:0x41d8  */
    /* JADX WARN: Code duplicated, block: B:1618:0x41dd  */
    /* JADX WARN: Code duplicated, block: B:1619:0x41e0  */
    /* JADX WARN: Code duplicated, block: B:1622:0x41e8  */
    /* JADX WARN: Code duplicated, block: B:1625:0x41ee  */
    /* JADX WARN: Code duplicated, block: B:1627:0x41f2  */
    /* JADX WARN: Code duplicated, block: B:1633:0x4232  */
    /* JADX WARN: Code duplicated, block: B:1635:0x4238  */
    /* JADX WARN: Code duplicated, block: B:1640:0x424d  */
    /* JADX WARN: Code duplicated, block: B:1643:0x4255  */
    /* JADX WARN: Code duplicated, block: B:1646:0x4263  */
    /* JADX WARN: Code duplicated, block: B:1648:0x426d  */
    /* JADX WARN: Code duplicated, block: B:1651:0x4279  */
    /* JADX WARN: Code duplicated, block: B:1654:0x428a  */
    /* JADX WARN: Code duplicated, block: B:1656:0x428e  */
    /* JADX WARN: Code duplicated, block: B:1658:0x4293  */
    /* JADX WARN: Code duplicated, block: B:1659:0x42a5  */
    /* JADX WARN: Code duplicated, block: B:1661:0x42ab  */
    /* JADX WARN: Code duplicated, block: B:1663:0x42b5  */
    /* JADX WARN: Code duplicated, block: B:1665:0x42bd A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:1672:0x42d2  */
    /* JADX WARN: Code duplicated, block: B:1674:0x42dd  */
    /* JADX WARN: Code duplicated, block: B:1677:0x42f1  */
    /* JADX WARN: Code duplicated, block: B:1679:0x4303  */
    /* JADX WARN: Code duplicated, block: B:1681:0x430b  */
    /* JADX WARN: Code duplicated, block: B:1683:0x4315  */
    /* JADX WARN: Code duplicated, block: B:1684:0x431e  */
    /* JADX WARN: Code duplicated, block: B:1685:0x4327  */
    /* JADX WARN: Code duplicated, block: B:1687:0x432b  */
    /* JADX WARN: Code duplicated, block: B:1689:0x4331  */
    /* JADX WARN: Code duplicated, block: B:1692:0x433a  */
    /* JADX WARN: Code duplicated, block: B:1693:0x433d  */
    /* JADX WARN: Code duplicated, block: B:1695:0x4346  */
    /* JADX WARN: Code duplicated, block: B:1696:0x4349  */
    /* JADX WARN: Code duplicated, block: B:1697:0x434d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:1699:0x4350  */
    /* JADX WARN: Code duplicated, block: B:1700:0x4353  */
    /* JADX WARN: Code duplicated, block: B:1702:0x4356  */
    /* JADX WARN: Code duplicated, block: B:1703:0x4359 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:1704:0x435b  */
    /* JADX WARN: Code duplicated, block: B:1705:0x435e  */
    /* JADX WARN: Code duplicated, block: B:1708:0x4367  */
    /* JADX WARN: Code duplicated, block: B:1710:0x436f  */
    /* JADX WARN: Code duplicated, block: B:1712:0x4375  */
    /* JADX WARN: Code duplicated, block: B:1713:0x4377  */
    /* JADX WARN: Code duplicated, block: B:1716:0x437c  */
    /* JADX WARN: Code duplicated, block: B:1717:0x437f  */
    /* JADX WARN: Code duplicated, block: B:1720:0x4383  */
    /* JADX WARN: Code duplicated, block: B:1721:0x4386  */
    /* JADX WARN: Code duplicated, block: B:1724:0x4390  */
    /* JADX WARN: Code duplicated, block: B:1726:0x4396  */
    /* JADX WARN: Code duplicated, block: B:1727:0x4398  */
    /* JADX WARN: Code duplicated, block: B:1730:0x439d  */
    /* JADX WARN: Code duplicated, block: B:1731:0x43a0  */
    /* JADX WARN: Code duplicated, block: B:1734:0x43a4  */
    /* JADX WARN: Code duplicated, block: B:1735:0x43a7  */
    /* JADX WARN: Code duplicated, block: B:1738:0x43ab  */
    /* JADX WARN: Code duplicated, block: B:1739:0x43ae  */
    /* JADX WARN: Code duplicated, block: B:1742:0x43b2  */
    /* JADX WARN: Code duplicated, block: B:1743:0x43b4  */
    /* JADX WARN: Code duplicated, block: B:1746:0x43b8  */
    /* JADX WARN: Code duplicated, block: B:1747:0x43ba  */
    /* JADX WARN: Code duplicated, block: B:1750:0x43be  */
    /* JADX WARN: Code duplicated, block: B:1751:0x43c1  */
    /* JADX WARN: Code duplicated, block: B:1754:0x43c6  */
    /* JADX WARN: Code duplicated, block: B:1755:0x43c8  */
    /* JADX WARN: Code duplicated, block: B:1758:0x43d0  */
    /* JADX WARN: Code duplicated, block: B:1760:0x43d6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:1761:0x43d8  */
    /* JADX WARN: Code duplicated, block: B:1762:0x43dc  */
    /* JADX WARN: Code duplicated, block: B:1764:0x43e0  */
    /* JADX WARN: Code duplicated, block: B:1765:0x43e3  */
    /* JADX WARN: Code duplicated, block: B:1767:0x43e6  */
    /* JADX WARN: Code duplicated, block: B:1768:0x43e9  */
    /* JADX WARN: Code duplicated, block: B:1772:0x43f5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:1774:0x43f9  */
    /* JADX WARN: Code duplicated, block: B:1776:0x43fc  */
    /* JADX WARN: Code duplicated, block: B:1777:0x43ff A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:1778:0x4401  */
    /* JADX WARN: Code duplicated, block: B:1779:0x4404  */
    /* JADX WARN: Code duplicated, block: B:1781:0x440b  */
    /* JADX WARN: Code duplicated, block: B:1784:0x4410 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:1785:0x4412  */
    /* JADX WARN: Code duplicated, block: B:1787:0x4419  */
    /* JADX WARN: Code duplicated, block: B:1789:0x4428  */
    /* JADX WARN: Code duplicated, block: B:1790:0x4434  */
    /* JADX WARN: Code duplicated, block: B:1793:0x4439 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:1794:0x443b  */
    /* JADX WARN: Code duplicated, block: B:1796:0x4440  */
    /* JADX WARN: Code duplicated, block: B:1797:0x4445  */
    /* JADX WARN: Code duplicated, block: B:1799:0x4451  */
    /* JADX WARN: Code duplicated, block: B:1802:0x4456 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:1804:0x4459  */
    /* JADX WARN: Code duplicated, block: B:1805:0x4464  */
    /* JADX WARN: Code duplicated, block: B:1807:0x446f  */
    /* JADX WARN: Code duplicated, block: B:1808:0x4478  */
    /* JADX WARN: Code duplicated, block: B:1810:0x4483  */
    /* JADX WARN: Code duplicated, block: B:1813:0x449a  */
    /* JADX WARN: Code duplicated, block: B:1815:0x44a5  */
    /* JADX WARN: Code duplicated, block: B:1816:0x44a7  */
    /* JADX WARN: Code duplicated, block: B:1819:0x44ac  */
    /* JADX WARN: Code duplicated, block: B:1820:0x44af  */
    /* JADX WARN: Code duplicated, block: B:1823:0x44b3  */
    /* JADX WARN: Code duplicated, block: B:1824:0x44b6  */
    /* JADX WARN: Code duplicated, block: B:1827:0x44ba  */
    /* JADX WARN: Code duplicated, block: B:1828:0x44bd  */
    /* JADX WARN: Code duplicated, block: B:1831:0x44c1  */
    /* JADX WARN: Code duplicated, block: B:1832:0x44c3  */
    /* JADX WARN: Code duplicated, block: B:1835:0x44c7  */
    /* JADX WARN: Code duplicated, block: B:1836:0x44c9  */
    /* JADX WARN: Code duplicated, block: B:1839:0x44cd  */
    /* JADX WARN: Code duplicated, block: B:1840:0x44cf  */
    /* JADX WARN: Code duplicated, block: B:1843:0x44d7  */
    /* JADX WARN: Code duplicated, block: B:1844:0x44da  */
    /* JADX WARN: Code duplicated, block: B:1846:0x44dd  */
    /* JADX WARN: Code duplicated, block: B:1847:0x44e0  */
    /* JADX WARN: Code duplicated, block: B:1849:0x44e9  */
    /* JADX WARN: Code duplicated, block: B:1850:0x44ed  */
    /* JADX WARN: Code duplicated, block: B:1852:0x44f8  */
    /* JADX WARN: Code duplicated, block: B:1853:0x44fa  */
    /* JADX WARN: Code duplicated, block: B:1856:0x44ff  */
    /* JADX WARN: Code duplicated, block: B:1857:0x4502  */
    /* JADX WARN: Code duplicated, block: B:1860:0x4506  */
    /* JADX WARN: Code duplicated, block: B:1861:0x4509  */
    /* JADX WARN: Code duplicated, block: B:1864:0x450d  */
    /* JADX WARN: Code duplicated, block: B:1865:0x4510  */
    /* JADX WARN: Code duplicated, block: B:1868:0x4514  */
    /* JADX WARN: Code duplicated, block: B:1869:0x4516  */
    /* JADX WARN: Code duplicated, block: B:1872:0x451a  */
    /* JADX WARN: Code duplicated, block: B:1873:0x451c  */
    /* JADX WARN: Code duplicated, block: B:1876:0x4522  */
    /* JADX WARN: Code duplicated, block: B:1877:0x4524  */
    /* JADX WARN: Code duplicated, block: B:1879:0x4531  */
    /* JADX WARN: Code duplicated, block: B:1880:0x4535  */
    /* JADX WARN: Code duplicated, block: B:1882:0x4540  */
    /* JADX WARN: Code duplicated, block: B:1883:0x4542  */
    /* JADX WARN: Code duplicated, block: B:1886:0x4547  */
    /* JADX WARN: Code duplicated, block: B:1887:0x454a  */
    /* JADX WARN: Code duplicated, block: B:1890:0x454e  */
    /* JADX WARN: Code duplicated, block: B:1891:0x4551  */
    /* JADX WARN: Code duplicated, block: B:1894:0x4566  */
    /* JADX WARN: Code duplicated, block: B:1895:0x4574  */
    /* JADX WARN: Code duplicated, block: B:1897:0x457f  */
    /* JADX WARN: Code duplicated, block: B:1899:0x4583  */
    /* JADX WARN: Code duplicated, block: B:1902:0x458c  */
    /* JADX WARN: Code duplicated, block: B:1903:0x458f  */
    /* JADX WARN: Code duplicated, block: B:1906:0x4597  */
    /* JADX WARN: Code duplicated, block: B:1907:0x459a  */
    /* JADX WARN: Code duplicated, block: B:1910:0x45a2  */
    /* JADX WARN: Code duplicated, block: B:1911:0x45a5  */
    /* JADX WARN: Code duplicated, block: B:1914:0x45ad  */
    /* JADX WARN: Code duplicated, block: B:1915:0x45b0  */
    /* JADX WARN: Code duplicated, block: B:1918:0x45b8  */
    /* JADX WARN: Code duplicated, block: B:1919:0x45bb  */
    /* JADX WARN: Code duplicated, block: B:1922:0x45c3  */
    /* JADX WARN: Code duplicated, block: B:1923:0x45c6  */
    /* JADX WARN: Code duplicated, block: B:1926:0x45ce  */
    /* JADX WARN: Code duplicated, block: B:1927:0x45d1  */
    /* JADX WARN: Code duplicated, block: B:1928:0x45d3  */
    /* JADX WARN: Code duplicated, block: B:1929:0x45e0  */
    /* JADX WARN: Code duplicated, block: B:1931:0x45e4  */
    /* JADX WARN: Code duplicated, block: B:1933:0x45f0  */
    /* JADX WARN: Code duplicated, block: B:1935:0x4601  */
    /* JADX WARN: Code duplicated, block: B:1936:0x4604  */
    /* JADX WARN: Code duplicated, block: B:1939:0x460e  */
    /* JADX WARN: Code duplicated, block: B:1940:0x4622  */
    /* JADX WARN: Code duplicated, block: B:1942:0x463b  */
    /* JADX WARN: Code duplicated, block: B:1943:0x4643  */
    /* JADX WARN: Code duplicated, block: B:1945:0x4658  */
    /* JADX WARN: Code duplicated, block: B:1946:0x466a  */
    /* JADX WARN: Code duplicated, block: B:1947:0x467a  */
    /* JADX WARN: Code duplicated, block: B:1949:0x468d  */
    /* JADX WARN: Code duplicated, block: B:1951:0x4692  */
    /* JADX WARN: Code duplicated, block: B:1952:0x4696  */
    /* JADX WARN: Code duplicated, block: B:1954:0x469a  */
    /* JADX WARN: Code duplicated, block: B:1955:0x469e  */
    /* JADX WARN: Code duplicated, block: B:1957:0x46a3  */
    /* JADX WARN: Code duplicated, block: B:1958:0x46a7  */
    /* JADX WARN: Code duplicated, block: B:1960:0x46b0  */
    /* JADX WARN: Code duplicated, block: B:1962:0x46b6  */
    /* JADX WARN: Code duplicated, block: B:1963:0x46b9  */
    /* JADX WARN: Code duplicated, block: B:1967:0x46c4  */
    /* JADX WARN: Code duplicated, block: B:1969:0x46d5  */
    /* JADX WARN: Code duplicated, block: B:1970:0x46d8  */
    /* JADX WARN: Code duplicated, block: B:1972:0x46dd  */
    /* JADX WARN: Code duplicated, block: B:1973:0x46e0  */
    /* JADX WARN: Code duplicated, block: B:1975:0x46e5  */
    /* JADX WARN: Code duplicated, block: B:1976:0x46e8  */
    /* JADX WARN: Code duplicated, block: B:1980:0x46f5  */
    /* JADX WARN: Code duplicated, block: B:1983:0x4724  */
    /* JADX WARN: Code duplicated, block: B:1984:0x4741  */
    /* JADX WARN: Code duplicated, block: B:1985:0x4753  */
    /* JADX WARN: Code duplicated, block: B:1986:0x475c  */
    /* JADX WARN: Code duplicated, block: B:1988:0x476c  */
    /* JADX WARN: Code duplicated, block: B:1989:0x476f  */
    /* JADX WARN: Code duplicated, block: B:1991:0x477b  */
    /* JADX WARN: Code duplicated, block: B:1993:0x4792  */
    /* JADX WARN: Code duplicated, block: B:1995:0x47a2  */
    /* JADX WARN: Code duplicated, block: B:1996:0x47a5  */
    /* JADX WARN: Code duplicated, block: B:1997:0x47b8  */
    /* JADX WARN: Code duplicated, block: B:1999:0x47bd  */
    /* JADX WARN: Code duplicated, block: B:2000:0x47c1  */
    /* JADX WARN: Code duplicated, block: B:2003:0x47c7  */
    /* JADX WARN: Code duplicated, block: B:2006:0x47cd  */
    /* JADX WARN: Code duplicated, block: B:2008:0x47d2  */
    /* JADX WARN: Code duplicated, block: B:2009:0x47d6  */
    /* JADX WARN: Code duplicated, block: B:2012:0x47dc  */
    /* JADX WARN: Code duplicated, block: B:2015:0x47e2  */
    /* JADX WARN: Code duplicated, block: B:2017:0x47f4  */
    /* JADX WARN: Code duplicated, block: B:2018:0x47f7  */
    /* JADX WARN: Code duplicated, block: B:2020:0x47fb  */
    /* JADX WARN: Code duplicated, block: B:2021:0x47fe  */
    /* JADX WARN: Code duplicated, block: B:2022:0x4801  */
    /* JADX WARN: Code duplicated, block: B:2025:0x4808  */
    /* JADX WARN: Code duplicated, block: B:2028:0x480e  */
    /* JADX WARN: Code duplicated, block: B:2030:0x4818  */
    /* JADX WARN: Code duplicated, block: B:2031:0x481b  */
    /* JADX WARN: Code duplicated, block: B:2033:0x481f  */
    /* JADX WARN: Code duplicated, block: B:2034:0x4822  */
    /* JADX WARN: Code duplicated, block: B:2036:0x4826  */
    /* JADX WARN: Code duplicated, block: B:2037:0x4829  */
    /* JADX WARN: Code duplicated, block: B:2041:0x4834  */
    /* JADX WARN: Code duplicated, block: B:2043:0x4846  */
    /* JADX WARN: Code duplicated, block: B:2044:0x4848  */
    /* JADX WARN: Code duplicated, block: B:2046:0x484c  */
    /* JADX WARN: Code duplicated, block: B:2047:0x484e  */
    /* JADX WARN: Code duplicated, block: B:2049:0x4852  */
    /* JADX WARN: Code duplicated, block: B:2050:0x4854  */
    /* JADX WARN: Code duplicated, block: B:2052:0x4858  */
    /* JADX WARN: Code duplicated, block: B:2055:0x486b  */
    /* JADX WARN: Code duplicated, block: B:2058:0x4870  */
    /* JADX WARN: Code duplicated, block: B:2061:0x4875  */
    /* JADX WARN: Code duplicated, block: B:2063:0x487f  */
    /* JADX WARN: Code duplicated, block: B:2064:0x4882  */
    /* JADX WARN: Code duplicated, block: B:2066:0x4886  */
    /* JADX WARN: Code duplicated, block: B:2067:0x488b  */
    /* JADX WARN: Code duplicated, block: B:2069:0x488f  */
    /* JADX WARN: Code duplicated, block: B:2070:0x4892  */
    /* JADX WARN: Code duplicated, block: B:2074:0x489c  */
    /* JADX WARN: Code duplicated, block: B:2075:0x48a0  */
    /* JADX WARN: Code duplicated, block: B:2076:0x48a4  */
    /* JADX WARN: Code duplicated, block: B:2078:0x48a7  */
    /* JADX WARN: Code duplicated, block: B:2079:0x48ab  */
    /* JADX WARN: Code duplicated, block: B:2081:0x48ae  */
    /* JADX WARN: Code duplicated, block: B:2082:0x48b2  */
    /* JADX WARN: Code duplicated, block: B:2085:0x48b7  */
    /* JADX WARN: Code duplicated, block: B:2086:0x48bb  */
    /* JADX WARN: Code duplicated, block: B:2088:0x48ce  */
    /* JADX WARN: Code duplicated, block: B:2091:0x48d2  */
    /* JADX WARN: Code duplicated, block: B:2094:0x48d7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:2096:0x48db  */
    /* JADX WARN: Code duplicated, block: B:2097:0x48df  */
    /* JADX WARN: Code duplicated, block: B:2099:0x48ee  */
    /* JADX WARN: Code duplicated, block: B:2100:0x48f2  */
    /* JADX WARN: Code duplicated, block: B:2101:0x48f6  */
    /* JADX WARN: Code duplicated, block: B:2102:0x4902  */
    /* JADX WARN: Code duplicated, block: B:2103:0x490c  */
    /* JADX WARN: Code duplicated, block: B:2104:0x491d  */
    /* JADX WARN: Code duplicated, block: B:2107:0x4922  */
    /* JADX WARN: Code duplicated, block: B:2110:0x4927 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:2112:0x492b  */
    /* JADX WARN: Code duplicated, block: B:2113:0x492f  */
    /* JADX WARN: Code duplicated, block: B:2116:0x4934  */
    /* JADX WARN: Code duplicated, block: B:2119:0x4939  */
    /* JADX WARN: Code duplicated, block: B:2122:0x493e  */
    /* JADX WARN: Code duplicated, block: B:2125:0x4943  */
    /* JADX WARN: Code duplicated, block: B:2128:0x4948  */
    /* JADX WARN: Code duplicated, block: B:2131:0x494d  */
    /* JADX WARN: Code duplicated, block: B:2132:0x495f  */
    /* JADX WARN: Code duplicated, block: B:2133:0x4970  */
    /* JADX WARN: Code duplicated, block: B:2136:0x4975  */
    /* JADX WARN: Code duplicated, block: B:2138:0x4978  */
    /* JADX WARN: Code duplicated, block: B:2139:0x497b  */
    /* JADX WARN: Code duplicated, block: B:2141:0x4982  */
    /* JADX WARN: Code duplicated, block: B:2144:0x4987  */
    /* JADX WARN: Code duplicated, block: B:2145:0x498b  */
    /* JADX WARN: Code duplicated, block: B:2147:0x49a0  */
    /* JADX WARN: Code duplicated, block: B:2149:0x49b2  */
    /* JADX WARN: Code duplicated, block: B:2150:0x49bf  */
    /* JADX WARN: Code duplicated, block: B:2152:0x49ce  */
    /* JADX WARN: Code duplicated, block: B:2153:0x49d1  */
    /* JADX WARN: Code duplicated, block: B:2155:0x49dc  */
    /* JADX WARN: Code duplicated, block: B:2158:0x49ec  */
    /* JADX WARN: Code duplicated, block: B:2160:0x49fb  */
    /* JADX WARN: Code duplicated, block: B:2161:0x49fe  */
    /* JADX WARN: Code duplicated, block: B:2163:0x4a06  */
    /* JADX WARN: Code duplicated, block: B:2166:0x4a0b  */
    /* JADX WARN: Code duplicated, block: B:2169:0x4a10  */
    /* JADX WARN: Code duplicated, block: B:2170:0x4a14  */
    /* JADX WARN: Code duplicated, block: B:2171:0x4a18  */
    /* JADX WARN: Code duplicated, block: B:2172:0x4a1c  */
    /* JADX WARN: Code duplicated, block: B:2174:0x4a2d  */
    /* JADX WARN: Code duplicated, block: B:2175:0x4a30  */
    /* JADX WARN: Code duplicated, block: B:2177:0x4a35  */
    /* JADX WARN: Code duplicated, block: B:2178:0x4a38  */
    /* JADX WARN: Code duplicated, block: B:2180:0x4a3d  */
    /* JADX WARN: Code duplicated, block: B:2181:0x4a40  */
    /* JADX WARN: Code duplicated, block: B:2182:0x4a43  */
    /* JADX WARN: Code duplicated, block: B:2184:0x4a47  */
    /* JADX WARN: Code duplicated, block: B:2185:0x4a49  */
    /* JADX WARN: Code duplicated, block: B:2187:0x4a4e  */
    /* JADX WARN: Code duplicated, block: B:2188:0x4a50  */
    /* JADX WARN: Code duplicated, block: B:2190:0x4a55  */
    /* JADX WARN: Code duplicated, block: B:2191:0x4a57  */
    /* JADX WARN: Code duplicated, block: B:2193:0x4a5c  */
    /* JADX WARN: Code duplicated, block: B:2195:0x4a6d  */
    /* JADX WARN: Code duplicated, block: B:2196:0x4a70  */
    /* JADX WARN: Code duplicated, block: B:2198:0x4a75  */
    /* JADX WARN: Code duplicated, block: B:2199:0x4a78  */
    /* JADX WARN: Code duplicated, block: B:2201:0x4a7d  */
    /* JADX WARN: Code duplicated, block: B:2202:0x4a80  */
    /* JADX WARN: Code duplicated, block: B:2205:0x4a89  */
    /* JADX WARN: Code duplicated, block: B:2206:0x4a8d  */
    /* JADX WARN: Code duplicated, block: B:2209:0x4a95  */
    /* JADX WARN: Code duplicated, block: B:2212:0x4a9c  */
    /* JADX WARN: Code duplicated, block: B:2215:0x4aa3  */
    /* JADX WARN: Code duplicated, block: B:2216:0x4aa9  */
    /* JADX WARN: Code duplicated, block: B:2217:0x4aab  */
    /* JADX WARN: Code duplicated, block: B:2218:0x4aaf  */
    /* JADX WARN: Code duplicated, block: B:2220:0x4abd  */
    /* JADX WARN: Code duplicated, block: B:2221:0x4ac8  */
    /* JADX WARN: Code duplicated, block: B:2222:0x4ad6  */
    /* JADX WARN: Code duplicated, block: B:2223:0x4adc  */
    /* JADX WARN: Code duplicated, block: B:2224:0x4ae2  */
    /* JADX WARN: Code duplicated, block: B:2225:0x4af0  */
    /* JADX WARN: Code duplicated, block: B:2226:0x4afe  */
    /* JADX WARN: Code duplicated, block: B:2228:0x4b04  */
    /* JADX WARN: Code duplicated, block: B:2229:0x4b08  */
    /* JADX WARN: Code duplicated, block: B:2230:0x4b0f  */
    /* JADX WARN: Code duplicated, block: B:2232:0x4b15  */
    /* JADX WARN: Code duplicated, block: B:2233:0x4b19  */
    /* JADX WARN: Code duplicated, block: B:2234:0x4b20  */
    /* JADX WARN: Code duplicated, block: B:2236:0x4b26  */
    /* JADX WARN: Code duplicated, block: B:2237:0x4b2a  */
    /* JADX WARN: Code duplicated, block: B:2238:0x4b2e  */
    /* JADX WARN: Code duplicated, block: B:2241:0x4b35  */
    /* JADX WARN: Code duplicated, block: B:2245:0x4b57  */
    /* JADX WARN: Code duplicated, block: B:2247:0x4b5d  */
    /* JADX WARN: Code duplicated, block: B:2250:0x4b65  */
    /* JADX WARN: Code duplicated, block: B:2253:0x4b6e A[PHI: r7
      0x4b6e: PHI (r7v1137 int) = (r7v1099 int), (r7v1100 int), (r7v1102 int), (r7v1116 int), (r7v1124 int), (r7v1138 int) binds: [B:2366:0x4d2e, B:2359:0x4d1c, B:2351:0x4d04, B:2308:0x4c44, B:2282:0x4bf7, B:2252:0x4b6c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:2255:0x4b74 A[PHI: r7
      0x4b74: PHI (r7v1135 int) = (r7v1110 int), (r7v1124 int), (r7v1138 int) binds: [B:2325:0x4c80, B:2282:0x4bf7, B:2252:0x4b6c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:2256:0x4b78  */
    /* JADX WARN: Code duplicated, block: B:2258:0x4b7e  */
    /* JADX WARN: Code duplicated, block: B:2259:0x4b85  */
    /* JADX WARN: Code duplicated, block: B:2261:0x4b97 A[PHI: r7
      0x4b97: PHI (r7v1132 int) = (r7v1127 int), (r7v1133 int) binds: [B:2269:0x4bc4, B:2260:0x4b95] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:2262:0x4b99 A[PHI: r7
      0x4b99: PHI (r7v1130 int) = (r7v1126 int), (r7v1127 int), (r7v1129 int), (r7v1133 int) binds: [B:2272:0x4bd7, B:2268:0x4bc2, B:2265:0x4bae, B:2260:0x4b95] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:2264:0x4b9e  */
    /* JADX WARN: Code duplicated, block: B:2266:0x4bb0 A[PHI: r7
      0x4bb0: PHI (r7v1128 int) = (r7v1127 int), (r7v1129 int) binds: [B:2269:0x4bc4, B:2265:0x4bae] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:2267:0x4bb2  */
    /* JADX WARN: Code duplicated, block: B:2269:0x4bc4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:2271:0x4bc7  */
    /* JADX WARN: Code duplicated, block: B:2273:0x4bd9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:2274:0x4bdb  */
    /* JADX WARN: Code duplicated, block: B:2275:0x4bdd  */
    /* JADX WARN: Code duplicated, block: B:2276:0x4bdf  */
    /* JADX WARN: Code duplicated, block: B:2277:0x4be5  */
    /* JADX WARN: Code duplicated, block: B:2279:0x4bed  */
    /* JADX WARN: Code duplicated, block: B:2280:0x4bf0  */
    /* JADX WARN: Code duplicated, block: B:2284:0x4bfb  */
    /* JADX WARN: Code duplicated, block: B:2286:0x4c01  */
    /* JADX WARN: Code duplicated, block: B:2287:0x4c0b  */
    /* JADX WARN: Code duplicated, block: B:2289:0x4c12  */
    /* JADX WARN: Code duplicated, block: B:2290:0x4c14 A[PHI: r7
      0x4c14: PHI (r7v1121 int) = (r7v1107 int), (r7v1122 int) binds: [B:2331:0x4cc3, B:2289:0x4c12] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:2291:0x4c17  */
    /* JADX WARN: Code duplicated, block: B:2293:0x4c1a  */
    /* JADX WARN: Code duplicated, block: B:2294:0x4c1c A[PHI: r7
      0x4c1c: PHI (r7v1118 int) = (r7v1107 int), (r7v1122 int) binds: [B:2334:0x4cc8, B:2293:0x4c1a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:2295:0x4c1f  */
    /* JADX WARN: Code duplicated, block: B:2297:0x4c22 A[PHI: r7
      0x4c22: PHI (r7v1117 int) = (r7v1107 int), (r7v1122 int) binds: [B:2334:0x4cc8, B:2296:0x4c20] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:2298:0x4c25 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:2299:0x4c27  */
    /* JADX WARN: Code duplicated, block: B:2300:0x4c2a  */
    /* JADX WARN: Code duplicated, block: B:2302:0x4c2f A[PHI: r7
      0x4c2f: PHI (r7v1119 int) = (r7v1106 int), (r7v1116 int), (r7v1120 int) binds: [B:2340:0x4cd9, B:2308:0x4c44, B:2301:0x4c2c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:2303:0x4c34  */
    /* JADX WARN: Code duplicated, block: B:2305:0x4c3a  */
    /* JADX WARN: Code duplicated, block: B:2306:0x4c3d  */
    /* JADX WARN: Code duplicated, block: B:2310:0x4c48  */
    /* JADX WARN: Code duplicated, block: B:2312:0x4c4e  */
    /* JADX WARN: Code duplicated, block: B:2314:0x4c5a  */
    /* JADX WARN: Code duplicated, block: B:2316:0x4c62  */
    /* JADX WARN: Code duplicated, block: B:2318:0x4c6e  */
    /* JADX WARN: Code duplicated, block: B:2320:0x4c75  */
    /* JADX WARN: Code duplicated, block: B:2321:0x4c78  */
    /* JADX WARN: Code duplicated, block: B:2323:0x4c7b  */
    /* JADX WARN: Code duplicated, block: B:2324:0x4c7e  */
    /* JADX WARN: Code duplicated, block: B:2326:0x4c85  */
    /* JADX WARN: Code duplicated, block: B:2328:0x4c8b  */
    /* JADX WARN: Code duplicated, block: B:2329:0x4c93  */
    /* JADX WARN: Code duplicated, block: B:2330:0x4cc0  */
    /* JADX WARN: Code duplicated, block: B:2333:0x4cc7  */
    /* JADX WARN: Code duplicated, block: B:2336:0x4ccc  */
    /* JADX WARN: Code duplicated, block: B:2338:0x4cd2  */
    /* JADX WARN: Code duplicated, block: B:2340:0x4cd9  */
    /* JADX WARN: Code duplicated, block: B:2341:0x4ce0  */
    /* JADX WARN: Code duplicated, block: B:2343:0x4ce6  */
    /* JADX WARN: Code duplicated, block: B:2344:0x4cea  */
    /* JADX WARN: Code duplicated, block: B:2345:0x4cef A[PHI: r7
      0x4cef: PHI (r7v1103 int) = (r7v1099 int), (r7v1104 int) binds: [B:2366:0x4d2e, B:2344:0x4cea] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:2346:0x4cf4  */
    /* JADX WARN: Code duplicated, block: B:2348:0x4cf8  */
    /* JADX WARN: Code duplicated, block: B:2349:0x4cfb  */
    /* JADX WARN: Code duplicated, block: B:2354:0x4d0c  */
    /* JADX WARN: Code duplicated, block: B:2356:0x4d10  */
    /* JADX WARN: Code duplicated, block: B:2357:0x4d13  */
    /* JADX WARN: Code duplicated, block: B:2361:0x4d20  */
    /* JADX WARN: Code duplicated, block: B:2363:0x4d24  */
    /* JADX WARN: Code duplicated, block: B:2364:0x4d27  */
    /* JADX WARN: Code duplicated, block: B:2368:0x4d32  */
    /* JADX WARN: Code duplicated, block: B:2371:0x4d41  */
    /* JADX WARN: Code duplicated, block: B:2372:0x4d51  */
    /* JADX WARN: Code duplicated, block: B:2373:0x4d5a  */
    /* JADX WARN: Code duplicated, block: B:2374:0x4d66  */
    /* JADX WARN: Code duplicated, block: B:2376:0x4d71  */
    /* JADX WARN: Code duplicated, block: B:2380:0x4db2  */
    /* JADX WARN: Code duplicated, block: B:2383:0x4df0  */
    /* JADX WARN: Code duplicated, block: B:2386:0x4e2f  */
    /* JADX WARN: Code duplicated, block: B:2388:0x4e64  */
    /* JADX WARN: Code duplicated, block: B:2389:0x4e6c  */
    /* JADX WARN: Code duplicated, block: B:2390:0x4e83  */
    /* JADX WARN: Code duplicated, block: B:2391:0x4e9a  */
    /* JADX WARN: Code duplicated, block: B:2392:0x4eb1  */
    /* JADX WARN: Code duplicated, block: B:2393:0x4ec7  */
    /* JADX WARN: Code duplicated, block: B:2394:0x4ecf  */
    /* JADX WARN: Code duplicated, block: B:2395:0x4ed7  */
    /* JADX WARN: Code duplicated, block: B:2396:0x4edf  */
    /* JADX WARN: Code duplicated, block: B:2397:0x4ee7  */
    /* JADX WARN: Code duplicated, block: B:2398:0x4f0a  */
    /* JADX WARN: Code duplicated, block: B:2399:0x4f2d  */
    /* JADX WARN: Code duplicated, block: B:2400:0x4f50  */
    /* JADX WARN: Code duplicated, block: B:2401:0x4f73  */
    /* JADX WARN: Code duplicated, block: B:2402:0x4f7b  */
    /* JADX WARN: Code duplicated, block: B:2403:0x4f83  */
    /* JADX WARN: Code duplicated, block: B:2404:0x4f8b  */
    /* JADX WARN: Code duplicated, block: B:2405:0x4f93  */
    /* JADX WARN: Code duplicated, block: B:2407:0x4fae  */
    /* JADX WARN: Code duplicated, block: B:2409:0x4fc5  */
    /* JADX WARN: Code duplicated, block: B:2411:0x4fdc  */
    /* JADX WARN: Code duplicated, block: B:2412:0x4fea  */
    /* JADX WARN: Code duplicated, block: B:2414:0x4ff4 A[PHI: r7
      0x4ff4: PHI (r7v1053 int) = (r7v1052 int), (r7v1054 int) binds: [B:2417:0x5004, B:2413:0x4ff2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:2415:0x4ff8  */
    /* JADX WARN: Code duplicated, block: B:2416:0x4ffc  */
    /* JADX WARN: Code duplicated, block: B:2418:0x5006  */
    /* JADX WARN: Code duplicated, block: B:2419:0x500a  */
    /* JADX WARN: Code duplicated, block: B:2421:0x5014  */
    /* JADX WARN: Code duplicated, block: B:2422:0x5018  */
    /* JADX WARN: Code duplicated, block: B:2423:0x501c  */
    /* JADX WARN: Code duplicated, block: B:2425:0x5023  */
    /* JADX WARN: Code duplicated, block: B:2426:0x5027  */
    /* JADX WARN: Code duplicated, block: B:2427:0x502b  */
    /* JADX WARN: Code duplicated, block: B:2429:0x5035  */
    /* JADX WARN: Code duplicated, block: B:2430:0x5039  */
    /* JADX WARN: Code duplicated, block: B:2431:0x503d  */
    /* JADX WARN: Code duplicated, block: B:2433:0x5047  */
    /* JADX WARN: Code duplicated, block: B:2437:0x5060  */
    /* JADX WARN: Code duplicated, block: B:2439:0x5067  */
    /* JADX WARN: Code duplicated, block: B:2440:0x506b  */
    /* JADX WARN: Code duplicated, block: B:2442:0x5075  */
    /* JADX WARN: Code duplicated, block: B:2443:0x508c  */
    /* JADX WARN: Code duplicated, block: B:2446:0x50ab  */
    /* JADX WARN: Code duplicated, block: B:2447:0x50b6  */
    /* JADX WARN: Code duplicated, block: B:2448:0x50d6  */
    /* JADX WARN: Code duplicated, block: B:2449:0x50ea  */
    /* JADX WARN: Code duplicated, block: B:2450:0x50f7  */
    /* JADX WARN: Code duplicated, block: B:2452:0x5101  */
    /* JADX WARN: Code duplicated, block: B:2454:0x510a  */
    /* JADX WARN: Code duplicated, block: B:2455:0x5113  */
    /* JADX WARN: Code duplicated, block: B:2456:0x511d  */
    /* JADX WARN: Code duplicated, block: B:2457:0x5127  */
    /* JADX WARN: Code duplicated, block: B:2458:0x5167  */
    /* JADX WARN: Code duplicated, block: B:2464:0x5188  */
    /* JADX WARN: Code duplicated, block: B:2466:0x5192  */
    /* JADX WARN: Code duplicated, block: B:2468:0x519d  */
    /* JADX WARN: Code duplicated, block: B:2469:0x51a6  */
    /* JADX WARN: Code duplicated, block: B:2470:0x51af  */
    /* JADX WARN: Code duplicated, block: B:2471:0x51b8  */
    /* JADX WARN: Code duplicated, block: B:2472:0x51c5  */
    /* JADX WARN: Code duplicated, block: B:2473:0x51d2  */
    /* JADX WARN: Code duplicated, block: B:2475:0x51da  */
    /* JADX WARN: Code duplicated, block: B:2476:0x51e3  */
    /* JADX WARN: Code duplicated, block: B:2478:0x5211  */
    /* JADX WARN: Code duplicated, block: B:2479:0x5214  */
    /* JADX WARN: Code duplicated, block: B:2481:0x5231  */
    /* JADX WARN: Code duplicated, block: B:2483:0x5246  */
    /* JADX WARN: Code duplicated, block: B:2485:0x5254  */
    /* JADX WARN: Code duplicated, block: B:2486:0x5257  */
    /* JADX WARN: Code duplicated, block: B:2489:0x5260 A[PHI: r0 r4 r20 r22 r25 r26
      0x5260: PHI (r0v23 java.lang.String) = (r0v17 java.lang.String), (r0v19 java.lang.String), (r0v24 java.lang.String) binds: [B:2514:0x52f6, B:2501:0x52b0, B:2488:0x525e] A[DONT_GENERATE, DONT_INLINE]
      0x5260: PHI (r4v1045 int) = (r4v1039 int), (r4v1041 int), (r4v1046 int) binds: [B:2514:0x52f6, B:2501:0x52b0, B:2488:0x525e] A[DONT_GENERATE, DONT_INLINE]
      0x5260: PHI (r20v13 int) = (r20v7 int), (r20v9 int), (r20v14 int) binds: [B:2514:0x52f6, B:2501:0x52b0, B:2488:0x525e] A[DONT_GENERATE, DONT_INLINE]
      0x5260: PHI (r22v14 int) = (r22v8 int), (r22v10 int), (r22v15 int) binds: [B:2514:0x52f6, B:2501:0x52b0, B:2488:0x525e] A[DONT_GENERATE, DONT_INLINE]
      0x5260: PHI (r25v13 int) = (r25v7 int), (r25v9 int), (r25v14 int) binds: [B:2514:0x52f6, B:2501:0x52b0, B:2488:0x525e] A[DONT_GENERATE, DONT_INLINE]
      0x5260: PHI (r26v12 int) = (r26v6 int), (r26v8 int), (r26v13 int) binds: [B:2514:0x52f6, B:2501:0x52b0, B:2488:0x525e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:2490:0x5263  */
    /* JADX WARN: Code duplicated, block: B:2491:0x5268  */
    /* JADX WARN: Code duplicated, block: B:2492:0x527e  */
    /* JADX WARN: Code duplicated, block: B:2494:0x528c  */
    /* JADX WARN: Code duplicated, block: B:2496:0x5298  */
    /* JADX WARN: Code duplicated, block: B:2498:0x52a6  */
    /* JADX WARN: Code duplicated, block: B:2499:0x52a9  */
    /* JADX WARN: Code duplicated, block: B:2503:0x52b3  */
    /* JADX WARN: Code duplicated, block: B:2504:0x52b8  */
    /* JADX WARN: Code duplicated, block: B:2506:0x52cf  */
    /* JADX WARN: Code duplicated, block: B:2507:0x52d5  */
    /* JADX WARN: Code duplicated, block: B:2509:0x52de  */
    /* JADX WARN: Code duplicated, block: B:2511:0x52ec  */
    /* JADX WARN: Code duplicated, block: B:2512:0x52ef  */
    /* JADX WARN: Code duplicated, block: B:2516:0x52fa  */
    /* JADX WARN: Code duplicated, block: B:2517:0x52ff  */
    /* JADX WARN: Code duplicated, block: B:2519:0x530d  */
    /* JADX WARN: Code duplicated, block: B:2520:0x5316  */
    /* JADX WARN: Code duplicated, block: B:2521:0x532c  */
    /* JADX WARN: Code duplicated, block: B:2523:0x533e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:2524:0x5340  */
    /* JADX WARN: Code duplicated, block: B:2525:0x5343  */
    /* JADX WARN: Code duplicated, block: B:2527:0x534a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:2528:0x534c  */
    /* JADX WARN: Code duplicated, block: B:2529:0x534f  */
    /* JADX WARN: Code duplicated, block: B:2531:0x5359  */
    /* JADX WARN: Code duplicated, block: B:2533:0x536b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:2534:0x536d  */
    /* JADX WARN: Code duplicated, block: B:2535:0x5370  */
    /* JADX WARN: Code duplicated, block: B:2537:0x5376 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:2538:0x5378  */
    /* JADX WARN: Code duplicated, block: B:2539:0x537b  */
    /* JADX WARN: Code duplicated, block: B:2542:0x5389  */
    /* JADX WARN: Code duplicated, block: B:2544:0x53a2  */
    /* JADX WARN: Code duplicated, block: B:2545:0x53a4  */
    /* JADX WARN: Code duplicated, block: B:2548:0x53aa  */
    /* JADX WARN: Code duplicated, block: B:2549:0x53ad  */
    /* JADX WARN: Code duplicated, block: B:2552:0x53cd  */
    /* JADX WARN: Code duplicated, block: B:2553:0x53d0  */
    /* JADX WARN: Code duplicated, block: B:2556:0x53e0  */
    /* JADX WARN: Code duplicated, block: B:2557:0x53e3  */
    /* JADX WARN: Code duplicated, block: B:2561:0x53fe  */
    /* JADX WARN: Code duplicated, block: B:2566:0x5421  */
    /* JADX WARN: Code duplicated, block: B:2567:0x5434 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:2568:0x5436  */
    /* JADX WARN: Code duplicated, block: B:2572:0x5418 A[SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:1978:0x46ef, code lost:
    
        if ((r8 & 15) == 0) goto L1979;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1979:0x46f1, code lost:
    
        r0 = '?';
     */
    /* JADX WARN: Code restructure failed: missing block: B:2039:0x4830, code lost:
    
        if (r0 == 0) goto L1979;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2072:0x4898, code lost:
    
        if (r0 == 0) goto L1979;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2351:0x4d04, code lost:
    
        if (r0 == 31) goto L2253;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2353:0x4d08, code lost:
    
        r0 = r0 & 31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2359:0x4d1c, code lost:
    
        if (r0 == 31) goto L2253;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.StringBuilder g(int[] r56, long r57, int r59, java.lang.StringBuilder r60) {
        /*
            Method dump skipped, instruction units count: 21972
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.ext.m.g(int[], long, int, java.lang.StringBuilder):java.lang.StringBuilder");
    }

    private static long h(int i, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7 = 6;
        int i8 = (i << 6) | ((~i2) & 63);
        while (i7 >= 0 && ((1 << i7) & i8) == 0) {
            i7--;
        }
        if (i7 < 1 || (i6 = i2 & (i5 = (i4 = 1 << i7) - 1)) == i5) {
            return -1L;
        }
        int i9 = i3 & i5;
        long j = (-1) >>> (64 - (i6 + 1));
        long j2 = (j << (i4 - i9)) | (j >>> i9);
        long j3 = j2;
        for (int i10 = i4; i10 < 64; i10 += i4) {
            j3 |= j2 << i10;
        }
        return j3;
    }

    private static String i(String str, int i) {
        if (str == null) {
            return "?";
        }
        int i2 = 0;
        while (i > 0) {
            int iIndexOf = str.indexOf(0, i2);
            if (iIndexOf < 0) {
                return "?";
            }
            i2 = iIndexOf + 1;
            i--;
        }
        if (i2 == str.length()) {
            return "?";
        }
        int iIndexOf2 = str.indexOf(0, i2);
        if (iIndexOf2 >= 0) {
            return str.substring(i2, iIndexOf2);
        }
        return i2 == 0 ? str : str.substring(i2);
    }

    /* JADX WARN: Code duplicated, block: B:137:0x0177  */
    /* JADX WARN: Code duplicated, block: B:204:0x021a  */
    private static String j(int i, int i2, int i3, int i4, int i5) {
        String str;
        if (i == 2) {
            if (i2 != 0) {
                if (i2 != 3) {
                    if (i2 == 4 && i3 == 0 && i4 == 7) {
                        str = "DBGVCR32_EL2";
                        i4 = i5;
                    }
                } else if (i3 == 0 && i5 == 0) {
                    str = "?\u0000MDCCSR_EL0\u0000?\u0000?\u0000DBGDTR_EL0\u0000DBGDTRRX_EL0";
                }
                i4 = i5;
            } else if (i3 == 0) {
                if (i4 == 0) {
                    str = "?\u0000?\u0000OSDTRRX_EL1";
                } else if (i4 == 6) {
                    str = "?\u0000?\u0000OSECCR_EL1";
                } else if (i4 == 2) {
                    str = "MDCCINT_EL1\u0000?\u0000MDSCR_EL1";
                } else if (i4 == 3) {
                    str = "?\u0000?\u0000OSDTRTX_EL1";
                } else if (i5 == 4) {
                    str = "DBGBVR0_EL1\u0000DBGBVR1_EL1\u0000DBGBVR2_EL1\u0000DBGBVR3_EL1\u0000DBGBVR4_EL1\u0000DBGBVR5_EL1\u0000DBGBVR6_EL1\u0000DBGBVR7_EL1";
                } else if (i5 == 5) {
                    str = "DBGBCR0_EL1\u0000DBGBCR1_EL1\u0000DBGBCR2_EL1\u0000DBGBCR3_EL1\u0000DBGBCR4_EL1\u0000DBGBCR5_EL1\u0000DBGBCR6_EL1\u0000DBGBCR7_EL1";
                } else if (i5 != 6) {
                    str = i5 != 7 ? null : "DBGWCR0_EL1\u0000DBGWCR1_EL1\u0000DBGWCR2_EL1\u0000DBGWCR3_EL1\u0000DBGWCR4_EL1\u0000DBGWCR5_EL1\u0000DBGWCR6_EL1\u0000DBGWCR7_EL1";
                } else {
                    str = "DBGWVR0_EL1\u0000DBGWVR1_EL1\u0000DBGWVR2_EL1\u0000DBGWVR3_EL1\u0000DBGWVR4_EL1\u0000DBGWVR5_EL1\u0000DBGWVR6_EL1\u0000DBGWVR7_EL1";
                }
                i4 = i5;
            } else if (i3 != 1) {
                if (i3 == 7 && i5 == 6) {
                    str = "?\u0000?\u0000?\u0000?\u0000?\u0000?\u0000?\u0000?\u0000DBGCLAIMSET_EL1\u0000DBGCLAIMCLR_EL1\u0000?\u0000?\u0000?\u0000?\u0000DBGAUTHSTATUS_EL1";
                } else {
                    i4 = i5;
                }
            } else if (i4 == 0) {
                str = "MDRAR_EL1\u0000?\u0000?\u0000?\u0000OSLAR_EL1";
                i4 = i5;
            } else if (i5 == 4) {
                str = "OSLSR_EL1\u0000?\u0000OSDLR_EL1\u0000DBGPRCR_EL1";
            } else {
                i4 = i5;
            }
            i5 = i4;
        } else if (i == 3) {
            switch (i2) {
                case 0:
                    switch (i3) {
                        case 0:
                            if (i4 != 0) {
                                i4 = i5;
                            } else {
                                str = "MIDR_EL1\u0000?\u0000?\u0000?\u0000?\u0000MPIDR_EL1\u0000REVIDR_EL1\u0000?\u0000ID_PFR0_EL1\u0000ID_PFR1_EL1\u0000ID_DFR0_EL1\u0000ID_AFR0_EL1\u0000ID_MMFR0_EL1\u0000ID_MMFR1_EL1\u0000ID_MMFR2_EL1\u0000ID_MMFR3_EL1\u0000ID_ISAR0_EL1\u0000ID_ISAR1_EL1\u0000ID_ISAR2_EL1\u0000ID_ISAR2_EL1\u0000ID_ISAR3_EL1\u0000ID_ISAR4_EL1\u0000ID_ISAR5_EL1\u0000ID_MMFR4_EL1\u0000?\u0000MVFR0_EL1\u0000MVFR1_EL1\u0000MVFR2_EL1\u0000?\u0000?\u0000?\u0000?\u0000?\u0000ID_A64PFR0_EL1\u0000ID_A64PFR1_EL1\u0000?\u0000?\u0000ID_A64ZFR0_EL1\u0000?\u0000?\u0000?\u0000ID_A64DFR0_EL1\u0000ID_A64DFR1_EL1\u0000?\u0000?\u0000ID_A64AFR0_EL1\u0000ID_A64AFR1_EL1\u0000?\u0000?\u0000ID_A64ISAR0_EL1\u0000ID_A64ISAR1_EL1\u0000?\u0000?\u0000?\u0000?\u0000?\u0000?\u0000ID_A64MMFR0_EL1\u0000ID_A64MMFR1_EL1\u0000ID_A64MMFR2_EL1";
                                i4 = i5;
                            }
                            break;
                        case 1:
                            if (i4 == 0) {
                                str = "SCTLR_EL1\u0000ACTLR_EL1\u0000CPACR_EL1";
                            } else if (i4 != 2) {
                                str = null;
                            } else {
                                str = "ZCR_EL1";
                            }
                            i4 = i5;
                            break;
                        case 2:
                            if (i4 != 0) {
                                i4 = i5;
                            } else {
                                str = "TTBR0_EL1\u0000TTBR1_EL1\u0000TCR_EL1";
                                i4 = i5;
                            }
                            break;
                        case 3:
                        case 8:
                        case 11:
                        default:
                            i4 = i5;
                            break;
                        case 4:
                            if (i4 == 0) {
                                str = "SPSR_EL1\u0000ELR_EL1";
                            } else if (i4 == 1) {
                                str = "SP_EL0";
                            } else if (i4 == 2) {
                                str = "SPSel\u0000?\u0000CurrentEL\u0000PAN\u0000UAO";
                            } else if (i4 != 6) {
                                str = null;
                            } else {
                                str = "ICC_PMR_EL1";
                            }
                            i4 = i5;
                            break;
                        case 5:
                            if (i4 == 1) {
                                str = "AFSR0_EL1\u0000AFSR1_EL1";
                            } else if (i4 == 2) {
                                str = "ESR_EL1";
                            } else if (i4 == 3) {
                                str = "ERRIDR_EL1\u0000ERRSELR_EL1";
                            } else if (i4 == 4) {
                                str = "ERXFR_EL1\u0000ERXCTLR_EL1\u0000ERXSTATUS_EL1\u0000ERXADDR_EL1";
                            } else if (i4 != 5) {
                                str = null;
                            } else {
                                str = "ERXMISC0_EL1\u0000ERXMISC1_EL1";
                            }
                            i4 = i5;
                            break;
                        case 6:
                            if (i4 != 0) {
                                i4 = i5;
                            } else {
                                str = "FAR_EL1";
                                i4 = i5;
                            }
                            break;
                        case 7:
                            if (i4 != 4) {
                                i4 = i5;
                            } else {
                                str = "PAR_EL1";
                                i4 = i5;
                            }
                            break;
                        case 9:
                            if (i4 == 9) {
                                str = "PMSCR_EL1\u0000?\u0000PMSICR_EL1\u0000PMSIRR_EL1\u0000PMSFCR_EL1\u0000PMSEVFR_EL1\u0000PMSLATFR_EL1\u0000PMSIDR_EL1\u0000PMSIDR_EL1";
                            } else if (i4 == 10) {
                                str = "PMBLIMITR_EL1\u0000PMBPTR_EL1\u0000?\u0000PMBSR_EL1\u0000?\u0000?\u0000?\u0000PMBIDR_EL1";
                            } else if (i4 != 14) {
                                str = null;
                            } else {
                                str = "?\u0000PMINTENSET_EL1\u0000PMINTENCLR_EL1";
                            }
                            i4 = i5;
                            break;
                        case 10:
                            if (i4 == 4) {
                                str = "LORSA_EL1\u0000LOREA_EL1\u0000LORN_EL1\u0000LORC_EL1\u0000?\u0000?\u0000?\u0000LORID_EL1";
                                i4 = i5;
                            } else if (i4 != 4 && i5 == 0) {
                                str = "?\u0000?\u0000MAIR_EL1\u0000AMAIR_EL1";
                            } else {
                                i4 = i5;
                            }
                            break;
                        case 12:
                            if (i4 == 0) {
                                str = "VBAR_EL1\u0000RVBAR_EL1\u0000RMR_EL1";
                            } else if (i4 == 1) {
                                str = "ISR_EL1\u0000DISR_EL1";
                            } else if (i4 == 8) {
                                str = "ICC_IAR0_EL1\u0000ICC_EOIR0_EL1\u0000ICC_HPPIR0_EL1\u0000ICC_BPR0_EL1\u0000ICC_AP0R0_EL1\u0000ICC_AP0R1_EL1\u0000ICC_AP0R2_EL1\u0000ICC_AP0R3_EL1";
                            } else if (i4 == 9) {
                                str = "ICC_AP1R0_EL1\u0000ICC_AP1R1_EL1\u0000ICC_AP1R2_EL1\u0000ICC_AP1R3_EL1";
                            } else if (i4 == 11) {
                                str = "?\u0000ICC_DIR_EL1\u0000?\u0000ICC_RPR_EL1\u0000?\u0000ICC_SGI1R_EL1\u0000ICC_ASGI1R_EL1\u0000ICC_SGI0R_EL1";
                            } else if (i4 != 12) {
                                str = null;
                            } else {
                                str = "ICC_IAR1_EL1\u0000ICC_EOIR1_EL1\u0000ICC_HPPIR1_EL1\u0000ICC_BPR1_EL1\u0000ICC_CTLR_EL1\u0000ICC_SRE_EL1\u0000ICC_IGRPEN0_EL1\u0000ICC_IGRPEN1_EL1";
                            }
                            i4 = i5;
                            break;
                        case 13:
                            if (i4 != 0) {
                                i4 = i5;
                            } else {
                                str = "?\u0000CONTEXTIDR_EL1\u0000?\u0000?\u0000TPIDR_EL1";
                                i4 = i5;
                            }
                            break;
                        case 14:
                            if (i4 != 1) {
                                i4 = i5;
                            } else {
                                str = "CNTKCTL_EL1";
                                i4 = i5;
                            }
                            break;
                    }
                    i5 = i4;
                    break;
                case 1:
                    str = (i3 != 0 || i4 != 0) ? null : "CCSIDR_EL1\u0000CLIDR_EL1\u0000?\u0000?\u0000?\u0000?\u0000?\u0000AIDR_EL1";
                    break;
                case 2:
                    str = (i3 != 0 || i4 != 0) ? null : "CSSELR_EL1";
                    break;
                case 3:
                    if (i3 != 0) {
                        if (i3 != 4) {
                            if (i3 != 9) {
                                if (i3 == 13) {
                                    str = i4 != 0 ? null : "?\u0000?\u0000TPIDR_EL0\u0000TPIDRRO_EL0";
                                } else if (i3 != 14) {
                                    str = null;
                                } else if (i4 == 0) {
                                    str = "CNTFRQ_EL0\u0000CNTPCT_EL0\u0000CNTVCT_EL0";
                                } else if (i4 == 2) {
                                    str = "CNTP_TVAL_EL0\u0000CNTP_CTL_EL0\u0000CNTP_CVAL_EL0";
                                } else if (i4 == 3) {
                                    str = "CNTV_TVAL_EL0\u0000CNTV_CTL_EL0\u0000CNTV_CVAL_EL0";
                                } else {
                                    str = null;
                                }
                                break;
                            } else {
                                switch (i4) {
                                    case 12:
                                        str = "PMCR_EL0\u0000PMCNTENSET_EL0\u0000PMCNTENCLR_EL0\u0000PMOVSCLR_EL0\u0000PMSWINC_EL0\u0000PMSELR_EL0\u0000PMCEID0_EL0\u0000PMCEID1_EL0";
                                        break;
                                    case 13:
                                        str = "PMCCNTR_EL0\u0000PMXEVTYPER_EL0\u0000PMXEVCNTR_EL0";
                                        break;
                                    case 14:
                                        str = "PMUSERENR_EL0\u0000?\u0000?\u0000PMOVSSET_EL0";
                                        break;
                                    default:
                                        str = null;
                                        break;
                                }
                            }
                        } else {
                            if (i4 == 2) {
                                str = "NZCV\u0000DAIF";
                            } else if (i4 == 4) {
                                str = "FPCR\u0000FPSR";
                            } else if (i4 == 5) {
                                str = "DSPSR_EL0\u0000DLR_EL0";
                            } else {
                                str = null;
                            }
                            break;
                        }
                    } else {
                        str = i4 != 0 ? null : "?\u0000CTR_EL0\u0000?\u0000?\u0000?\u0000?\u0000?\u0000DCZID_EL0";
                        break;
                    }
                    break;
                case 4:
                    switch (i3) {
                        case 0:
                            str = i4 != 0 ? null : "VPIDR_EL2\u0000?\u0000?\u0000?\u0000?\u0000VMPIDR_EL2";
                            break;
                        case 1:
                            if (i4 == 0) {
                                str = "SCTLR_EL2\u0000ACTLR_EL2";
                            } else if (i4 == 1) {
                                str = "HCR_EL2\u0000MDCR_EL2\u0000CPTR_EL2\u0000HSTR_EL2\u0000?\u0000?\u0000?\u0000HACR_EL2";
                            } else if (i4 == 2) {
                                str = "ZCR_EL2";
                            } else {
                                str = null;
                            }
                            break;
                        case 2:
                            if (i4 == 0) {
                                str = "TTBR0_EL2\u0000?\u0000TCR_EL2";
                            } else if (i4 == 1) {
                                str = "VTTBR0_EL2\u0000?\u0000VTCR_EL2";
                            } else {
                                str = null;
                            }
                            break;
                        case 3:
                            str = i4 != 0 ? null : "DACR32_EL2";
                            break;
                        case 4:
                            if (i4 == 0) {
                                str = "SPSR_EL2\u0000ELR_EL2";
                            } else if (i4 == 1) {
                                str = "SP_EL1";
                            } else if (i4 == 3) {
                                str = "SPSR_irq\u0000SPSR_abt\u0000SPSR_und\u0000SPSR_fiq";
                            } else {
                                str = null;
                            }
                            break;
                        case 5:
                            if (i4 == 0) {
                                str = "?\u0000IFSR32_EL2";
                            } else if (i4 == 1) {
                                str = "AFSR0_EL2\u0000AFSR1_EL2";
                            } else if (i4 == 2) {
                                str = "ESR_EL2\u0000?\u0000?\u0000VSESR_EL2";
                            } else if (i4 == 3) {
                                str = "FPEXC32_EL2";
                            } else {
                                str = null;
                            }
                            break;
                        case 6:
                            str = i4 != 0 ? null : "FAR_EL2\u0000?\u0000?\u0000?\u0000HPFAR_EL2";
                            break;
                        case 7:
                        case 8:
                        case 11:
                        default:
                            str = null;
                            break;
                        case 9:
                            str = i4 != 9 ? null : "PMSCR_EL2";
                            break;
                        case 10:
                            if (i4 == 2) {
                                str = "MAIR_EL2";
                            } else if (i4 == 3) {
                                str = "AMAIR_EL2";
                            } else {
                                str = null;
                            }
                            break;
                        case 12:
                            if (i4 != 0) {
                                if (i4 != 1) {
                                    if (i4 != 8) {
                                        if (i4 != 9) {
                                            switch (i4) {
                                                case 11:
                                                    str = "ICH_HCR_EL2\u0000ICH_VTR_EL2\u0000ICH_MISR_EL2\u0000ICH_EISR_EL2\u0000?\u0000ICH_ELRSR_EL2\u0000?\u0000ICH_VMCR_EL2";
                                                    break;
                                                case 12:
                                                    str = "ICH_LR0_EL2\u0000ICH_LR1_EL2\u0000ICH_LR2_EL2\u0000ICH_LR3_EL2\u0000ICH_LR4_EL2\u0000ICH_LR5_EL2\u0000ICH_LR6_EL2\u0000ICH_LR7_EL2";
                                                    break;
                                                case 13:
                                                    str = "ICH_LR8_EL2\u0000ICH_LR9_EL2\u0000ICH_LR10_EL2\u0000ICH_LR11_EL2\u0000ICH_LR12_EL2\u0000ICH_LR13_EL2\u0000ICH_LR14_EL2\u0000ICH_LR15_EL2";
                                                    break;
                                                default:
                                                    str = null;
                                                    break;
                                            }
                                        } else {
                                            str = "ICH_AP1R0_EL2\u0000ICH_AP1R1_EL2\u0000ICH_AP1R2_EL2\u0000ICH_AP1R3_EL2\u0000ICC_SRE_EL2";
                                            break;
                                        }
                                    } else {
                                        str = "ICH_AP0R0_EL2\u0000ICH_AP0R1_EL2\u0000ICH_AP0R2_EL2\u0000ICH_AP0R3_EL2";
                                        break;
                                    }
                                } else {
                                    str = "?\u0000VDISR_EL2";
                                    break;
                                }
                            } else {
                                str = "VBAR_EL2\u0000RVBAR_EL2\u0000RMR_EL2";
                                break;
                            }
                            break;
                        case 13:
                            str = i4 != 0 ? null : "?\u0000CONTEXTIDR_EL2\u0000TPIDR_EL2";
                            break;
                        case 14:
                            if (i4 == 0) {
                                str = "?\u0000?\u0000?\u0000CNTVOFF_EL2";
                            } else if (i4 == 1) {
                                str = "CNTHCTL_EL2";
                            } else if (i4 == 2) {
                                str = "CNTHP_TVAL_EL2\u0000CNTHP_CTL_EL2\u0000CNTHP_CVAL_EL2";
                            } else if (i4 == 3) {
                                str = "CNTHV_TVAL_EL2\u0000CNTHV_CTL_EL2\u0000CNTHV_CVAL_EL2";
                            } else {
                                str = null;
                            }
                            break;
                    }
                    break;
                case 5:
                    str = (i3 != 4 || i4 != 0) ? null : "SPSR_EL12\u0000ELR_EL12";
                    break;
                case 6:
                    str = (i3 != 4 || i4 != 1) ? null : "SP_EL2";
                    break;
                case 7:
                    str = (i3 != 14 || i4 != 2) ? null : "CNTPS_TVAL_EL1\u0000CNTPS_CTL_EL1\u0000CNTPS_CVAL_EL1";
                    break;
                default:
                    str = null;
                    break;
            }
        } else {
            str = null;
        }
        if (str != null) {
            return i(str, i5);
        }
        return null;
    }

    public static int k(n nVar, int[] iArr, long j, String str) {
        if (nVar == null) {
            nVar = new n();
        }
        if (iArr == null) {
            iArr = d();
        }
        int iE = e(nVar, iArr, j, str, -1);
        if (iE != -1) {
            return iE;
        }
        String strTrim = g(iArr, j, nVar.f1081c.f1092e, new StringBuilder()).toString().trim();
        StringBuilder sb = new StringBuilder();
        sb.append(Tools.L1(b2.f(R.string.asm_failed), "ARM64").trim());
        sb.append("\n'");
        sb.append(str);
        sb.append("'\n\n");
        sb.append(Tools.L1(b2.f(R.string.asm_suggestion), "\n'" + strTrim + "'\n").trim());
        n.b bVar = new n.b(sb.toString());
        int iIndexOf = strTrim.indexOf(59);
        if (iIndexOf != -1) {
            strTrim = strTrim.substring(0, iIndexOf).trim();
        }
        bVar.f1084a = strTrim;
        bVar.f1085b = str;
        throw bVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:173:0x030a  */
    /* JADX WARN: Code duplicated, block: B:175:0x030f  */
    /* JADX WARN: Code duplicated, block: B:178:0x0318  */
    /* JADX WARN: Code duplicated, block: B:180:0x031d  */
    /* JADX WARN: Code duplicated, block: B:181:0x0320  */
    /* JADX WARN: Code duplicated, block: B:184:0x0325  */
    /* JADX WARN: Code duplicated, block: B:186:0x032a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:189:0x0330  */
    /* JADX WARN: Code duplicated, block: B:191:0x0336  */
    /* JADX WARN: Code duplicated, block: B:195:0x0342 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:238:0x03af  */
    /* JADX WARN: Code duplicated, block: B:240:0x03b8  */
    /* JADX WARN: Code duplicated, block: B:244:0x03c5  */
    /* JADX WARN: Code duplicated, block: B:246:0x03c9  */
    /* JADX WARN: Code duplicated, block: B:251:0x03d2  */
    /* JADX WARN: Code duplicated, block: B:254:0x03d7  */
    /* JADX WARN: Code duplicated, block: B:260:0x03d5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:261:0x03cf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:262:0x03cf A[SYNTHETIC] */
    private static int l(int i, int i2, int i3) {
        boolean z;
        int iLowestOneBit;
        int iHighestOneBit;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27 = 63;
        int i28 = 1;
        switch (i2) {
            case -83:
                i3 += ((((i >>> 21) & 1) != 0 ? -64 : 0) | (63 & (i >>> 16))) - 1;
                i2 = 64512;
                i27 = 0;
                z = true;
                if (z) {
                    if (i3 > (1 << Integer.bitCount(i2)) - 1) {
                        throw f1066e;
                    }
                    iLowestOneBit = Integer.lowestOneBit(i2);
                    iHighestOneBit = Integer.highestOneBit(i2);
                    while (true) {
                        if ((i2 & iLowestOneBit) != 0) {
                            if ((i3 & i28) != 0) {
                                i |= iLowestOneBit;
                            }
                            i28 <<= 1;
                            if (iLowestOneBit == iHighestOneBit) {
                            }
                        }
                        iLowestOneBit <<= 1;
                    }
                }
                if (i27 != 0 || ((~i27) & i3) == 0) {
                    return i;
                }
                throw f1066e;
            case -82:
                i3--;
                i2 = 64512;
                i27 = 0;
                z = true;
                if (z) {
                    if (i3 > (1 << Integer.bitCount(i2)) - 1) {
                        throw f1066e;
                    }
                    iLowestOneBit = Integer.lowestOneBit(i2);
                    iHighestOneBit = Integer.highestOneBit(i2);
                    while (true) {
                        if ((i2 & iLowestOneBit) != 0) {
                            if ((i3 & i28) != 0) {
                                i |= iLowestOneBit;
                            }
                            i28 <<= 1;
                            if (iLowestOneBit == iHighestOneBit) {
                            }
                        }
                        iLowestOneBit <<= 1;
                    }
                }
                if (i27 != 0) {
                    break;
                }
                return i;
            case -81:
                i3 ^= 1;
                i2 = 61440;
                i27 = 0;
                z = true;
                if (z) {
                    if (i3 > (1 << Integer.bitCount(i2)) - 1) {
                        throw f1066e;
                    }
                    iLowestOneBit = Integer.lowestOneBit(i2);
                    iHighestOneBit = Integer.highestOneBit(i2);
                    while (true) {
                        if ((i2 & iLowestOneBit) != 0) {
                            if ((i3 & i28) != 0) {
                                i |= iLowestOneBit;
                            }
                            i28 <<= 1;
                            if (iLowestOneBit == iHighestOneBit) {
                            }
                        }
                        iLowestOneBit <<= 1;
                    }
                }
                if (i27 != 0) {
                    break;
                }
                return i;
            case -80:
                int iC = c((65535 & i3) | (((i & 524256) >> 5) << 16));
                i &= -524257;
                if (iC == 0) {
                    throw f1066e;
                }
                i3 = iC;
                i2 = 524256;
                i27 = 0;
                z = true;
                if (z) {
                    if (i3 > (1 << Integer.bitCount(i2)) - 1) {
                        throw f1066e;
                    }
                    iLowestOneBit = Integer.lowestOneBit(i2);
                    iHighestOneBit = Integer.highestOneBit(i2);
                    while (true) {
                        if ((i2 & iLowestOneBit) != 0) {
                            if ((i3 & i28) != 0) {
                                i |= iLowestOneBit;
                            }
                            i28 <<= 1;
                            if (iLowestOneBit == iHighestOneBit) {
                            }
                        }
                        iLowestOneBit <<= 1;
                    }
                }
                if (i27 != 0) {
                    break;
                }
                return i;
            default:
                z = false;
                switch (i2) {
                    case -72:
                        if (i3 == 2 || i3 == -1 || i3 == -2) {
                            return i;
                        }
                        throw f1066e;
                    case -71:
                        if (i3 == 1 || i3 == -1 || i3 == -3) {
                            return i;
                        }
                        throw f1066e;
                    case -70:
                        if (i3 == 0 || i3 == -2 || i3 == -3) {
                            return i;
                        }
                        throw f1066e;
                    case -69:
                        if (i2 != -48) {
                            i4 = (i >>> 31) & 1;
                            if (i4 == 0) {
                                i5 = -32;
                            } else {
                                i5 = -64;
                            }
                            if ((i5 & i3) != 0) {
                                throw f1066e;
                            }
                            i3 = -i3;
                            i6 = i3 >> 5;
                            if (i6 != 0 && i6 != -1) {
                                i3 &= 63;
                            }
                            if (i4 == 0) {
                                i3 &= 31;
                            }
                            i2 = -48;
                        }
                        i |= (i3 & 63) << 16;
                        i8 = i3 >> 5;
                        if (i8 != 0 && i8 != -1) {
                            throw f1066e;
                        }
                        i27 = 0;
                        if (z) {
                            if (i3 > (1 << Integer.bitCount(i2)) - 1) {
                                throw f1066e;
                            }
                            iLowestOneBit = Integer.lowestOneBit(i2);
                            iHighestOneBit = Integer.highestOneBit(i2);
                            while (true) {
                                if ((i2 & iLowestOneBit) != 0) {
                                    if ((i3 & i28) != 0) {
                                        i |= iLowestOneBit;
                                    }
                                    i28 <<= 1;
                                    if (iLowestOneBit == iHighestOneBit) {
                                    }
                                }
                                iLowestOneBit <<= 1;
                            }
                        }
                        if (i27 != 0) {
                            break;
                        }
                        return i;
                    case -68:
                        if (i2 != -48) {
                            i |= (((i >>> 31) & 1) == 0 ? 31 : 63) << 10;
                            i2 = -48;
                        }
                        if (i2 != -48) {
                            i4 = (i >>> 31) & 1;
                            if (i4 == 0) {
                                i5 = -32;
                            } else {
                                i5 = -64;
                            }
                            if ((i5 & i3) != 0) {
                                throw f1066e;
                            }
                            i3 = -i3;
                            i6 = i3 >> 5;
                            if (i6 != 0) {
                                i3 &= 63;
                            }
                            if (i4 == 0) {
                                i3 &= 31;
                            }
                            i2 = -48;
                        }
                        i |= (i3 & 63) << 16;
                        i8 = i3 >> 5;
                        if (i8 != 0) {
                            throw f1066e;
                        }
                        i27 = 0;
                        if (z) {
                            if (i3 > (1 << Integer.bitCount(i2)) - 1) {
                                throw f1066e;
                            }
                            iLowestOneBit = Integer.lowestOneBit(i2);
                            iHighestOneBit = Integer.highestOneBit(i2);
                            while (true) {
                                if ((i2 & iLowestOneBit) != 0) {
                                    if ((i3 & i28) != 0) {
                                        i |= iLowestOneBit;
                                    }
                                    i28 <<= 1;
                                    if (iLowestOneBit == iHighestOneBit) {
                                    }
                                }
                                iLowestOneBit <<= 1;
                            }
                        }
                        if (i27 != 0) {
                            break;
                        }
                        return i;
                    case -67:
                        if (i2 != -48) {
                            int i29 = (i >>> 31) & 1;
                            if (i3 == 0) {
                                throw f1066e;
                            }
                            i3 = (i29 == 0 ? 32 : 64) - i3;
                            i |= ((i3 - 1) & 63) << 10;
                            i2 = -48;
                        }
                        if (i2 != -48) {
                            i |= (((i >>> 31) & 1) == 0 ? 31 : 63) << 10;
                            i2 = -48;
                        }
                        if (i2 != -48) {
                            i4 = (i >>> 31) & 1;
                            if (i4 == 0) {
                                i5 = -32;
                            } else {
                                i5 = -64;
                            }
                            if ((i5 & i3) != 0) {
                                throw f1066e;
                            }
                            i3 = -i3;
                            i6 = i3 >> 5;
                            if (i6 != 0) {
                                i3 &= 63;
                            }
                            if (i4 == 0) {
                                i3 &= 31;
                            }
                            i2 = -48;
                        }
                        i |= (i3 & 63) << 16;
                        i8 = i3 >> 5;
                        if (i8 != 0) {
                            throw f1066e;
                        }
                        i27 = 0;
                        if (z) {
                            if (i3 > (1 << Integer.bitCount(i2)) - 1) {
                                throw f1066e;
                            }
                            iLowestOneBit = Integer.lowestOneBit(i2);
                            iHighestOneBit = Integer.highestOneBit(i2);
                            while (true) {
                                if ((i2 & iLowestOneBit) != 0) {
                                    if ((i3 & i28) != 0) {
                                        i |= iLowestOneBit;
                                    }
                                    i28 <<= 1;
                                    if (iLowestOneBit == iHighestOneBit) {
                                    }
                                }
                                iLowestOneBit <<= 1;
                            }
                        }
                        if (i27 != 0) {
                            break;
                        }
                        return i;
                    case -66:
                        int i30 = (i >>> 23) & 1;
                        int i31 = 4095 << (i30 == 0 ? (i >>> 30) & 3 : 4);
                        i |= ((i3 >>> (i30 == 0 ? (i >>> 30) & 3 : 4)) & 4095) << 10;
                        i27 = i31;
                        if (z) {
                            if (i3 > (1 << Integer.bitCount(i2)) - 1) {
                                throw f1066e;
                            }
                            iLowestOneBit = Integer.lowestOneBit(i2);
                            iHighestOneBit = Integer.highestOneBit(i2);
                            while (true) {
                                if ((i2 & iLowestOneBit) != 0) {
                                    if ((i3 & i28) != 0) {
                                        i |= iLowestOneBit;
                                    }
                                    i28 <<= 1;
                                    if (iLowestOneBit == iHighestOneBit) {
                                    }
                                }
                                iLowestOneBit <<= 1;
                            }
                        }
                        if (i27 != 0) {
                            break;
                        }
                        return i;
                    case -65:
                        i7 = ((i >>> 30) & 1) + 2;
                        i |= ((i3 >>> i7) & 4095) << 10;
                        i27 = 4095 << i7;
                        if (z) {
                            if (i3 > (1 << Integer.bitCount(i2)) - 1) {
                                throw f1066e;
                            }
                            iLowestOneBit = Integer.lowestOneBit(i2);
                            iHighestOneBit = Integer.highestOneBit(i2);
                            while (true) {
                                if ((i2 & iLowestOneBit) != 0) {
                                    if ((i3 & i28) != 0) {
                                        i |= iLowestOneBit;
                                    }
                                    i28 <<= 1;
                                    if (iLowestOneBit == iHighestOneBit) {
                                    }
                                }
                                iLowestOneBit <<= 1;
                            }
                        }
                        if (i27 != 0) {
                            break;
                        }
                        return i;
                    case -64:
                        i |= ((i3 >>> 3) & 4095) << 10;
                        i27 = 32760;
                        if (z) {
                            if (i3 > (1 << Integer.bitCount(i2)) - 1) {
                                throw f1066e;
                            }
                            iLowestOneBit = Integer.lowestOneBit(i2);
                            iHighestOneBit = Integer.highestOneBit(i2);
                            while (true) {
                                if ((i2 & iLowestOneBit) != 0) {
                                    if ((i3 & i28) != 0) {
                                        i |= iLowestOneBit;
                                    }
                                    i28 <<= 1;
                                    if (iLowestOneBit == iHighestOneBit) {
                                    }
                                }
                                iLowestOneBit <<= 1;
                            }
                        }
                        if (i27 != 0) {
                            break;
                        }
                        return i;
                    case -63:
                        i |= ((i3 >>> 2) & 4095) << 10;
                        i27 = 16380;
                        if (z) {
                            if (i3 > (1 << Integer.bitCount(i2)) - 1) {
                                throw f1066e;
                            }
                            iLowestOneBit = Integer.lowestOneBit(i2);
                            iHighestOneBit = Integer.highestOneBit(i2);
                            while (true) {
                                if ((i2 & iLowestOneBit) != 0) {
                                    if ((i3 & i28) != 0) {
                                        i |= iLowestOneBit;
                                    }
                                    i28 <<= 1;
                                    if (iLowestOneBit == iHighestOneBit) {
                                    }
                                }
                                iLowestOneBit <<= 1;
                            }
                        }
                        if (i27 != 0) {
                            break;
                        }
                        return i;
                    default:
                        switch (i2) {
                            case -61:
                                i7 = (i >>> 30) & 1;
                                i |= ((i3 >>> i7) & 4095) << 10;
                                i27 = 4095 << i7;
                                if (z) {
                                    if (i3 > (1 << Integer.bitCount(i2)) - 1) {
                                        throw f1066e;
                                    }
                                    iLowestOneBit = Integer.lowestOneBit(i2);
                                    iHighestOneBit = Integer.highestOneBit(i2);
                                    while (true) {
                                        if ((i2 & iLowestOneBit) != 0) {
                                            if ((i3 & i28) != 0) {
                                                i |= iLowestOneBit;
                                            }
                                            i28 <<= 1;
                                            if (iLowestOneBit == iHighestOneBit) {
                                            }
                                        }
                                        iLowestOneBit <<= 1;
                                    }
                                }
                                if (i27 != 0) {
                                    break;
                                }
                                return i;
                            case -60:
                                if (i3 == -1) {
                                    i |= 524288;
                                } else if (i3 != 0) {
                                    throw f1066e;
                                }
                                i27 = 0;
                                if (z) {
                                    if (i3 > (1 << Integer.bitCount(i2)) - 1) {
                                        throw f1066e;
                                    }
                                    iLowestOneBit = Integer.lowestOneBit(i2);
                                    iHighestOneBit = Integer.highestOneBit(i2);
                                    while (true) {
                                        if ((i2 & iLowestOneBit) != 0) {
                                            if ((i3 & i28) != 0) {
                                                i |= iLowestOneBit;
                                            }
                                            i28 <<= 1;
                                            if (iLowestOneBit == iHighestOneBit) {
                                            }
                                        }
                                        iLowestOneBit <<= 1;
                                    }
                                }
                                if (i27 != 0) {
                                    break;
                                }
                                return i;
                            case -59:
                                i |= (i3 & 4095) << 10;
                                int i32 = i3 >> 11;
                                if (i32 != 0 && i32 != -1) {
                                    throw f1066e;
                                }
                                i27 = 0;
                                if (z) {
                                    if (i3 > (1 << Integer.bitCount(i2)) - 1) {
                                        throw f1066e;
                                    }
                                    iLowestOneBit = Integer.lowestOneBit(i2);
                                    iHighestOneBit = Integer.highestOneBit(i2);
                                    while (true) {
                                        if ((i2 & iLowestOneBit) != 0) {
                                            if ((i3 & i28) != 0) {
                                                i |= iLowestOneBit;
                                            }
                                            i28 <<= 1;
                                            if (iLowestOneBit == iHighestOneBit) {
                                            }
                                        }
                                        iLowestOneBit <<= 1;
                                    }
                                }
                                if (i27 != 0) {
                                    break;
                                }
                                return i;
                            case -58:
                                i |= (i3 & 16383) << 5;
                                int i33 = i3 >> 13;
                                if (i33 != 0 && i33 != -1) {
                                    throw f1066e;
                                }
                                i27 = 0;
                                if (z) {
                                    if (i3 > (1 << Integer.bitCount(i2)) - 1) {
                                        throw f1066e;
                                    }
                                    iLowestOneBit = Integer.lowestOneBit(i2);
                                    iHighestOneBit = Integer.highestOneBit(i2);
                                    while (true) {
                                        if ((i2 & iLowestOneBit) != 0) {
                                            if ((i3 & i28) != 0) {
                                                i |= iLowestOneBit;
                                            }
                                            i28 <<= 1;
                                            if (iLowestOneBit == iHighestOneBit) {
                                            }
                                        }
                                        iLowestOneBit <<= 1;
                                    }
                                }
                                if (i27 != 0) {
                                    break;
                                }
                                return i;
                            case -57:
                                i |= 67108863 & i3;
                                int i34 = i3 >> 25;
                                if (i34 != 0 && i34 != -1) {
                                    throw f1066e;
                                }
                                i27 = 0;
                                if (z) {
                                    if (i3 > (1 << Integer.bitCount(i2)) - 1) {
                                        throw f1066e;
                                    }
                                    iLowestOneBit = Integer.lowestOneBit(i2);
                                    iHighestOneBit = Integer.highestOneBit(i2);
                                    while (true) {
                                        if ((i2 & iLowestOneBit) != 0) {
                                            if ((i3 & i28) != 0) {
                                                i |= iLowestOneBit;
                                            }
                                            i28 <<= 1;
                                            if (iLowestOneBit == iHighestOneBit) {
                                            }
                                        }
                                        iLowestOneBit <<= 1;
                                    }
                                }
                                if (i27 != 0) {
                                    break;
                                }
                                return i;
                            case -56:
                                i |= (i3 & 63) << 10;
                                int i35 = i3 >> 5;
                                if (i35 != 0 && i35 != -1) {
                                    throw f1066e;
                                }
                                i27 = 0;
                                if (z) {
                                    if (i3 > (1 << Integer.bitCount(i2)) - 1) {
                                        throw f1066e;
                                    }
                                    iLowestOneBit = Integer.lowestOneBit(i2);
                                    iHighestOneBit = Integer.highestOneBit(i2);
                                    while (true) {
                                        if ((i2 & iLowestOneBit) != 0) {
                                            if ((i3 & i28) != 0) {
                                                i |= iLowestOneBit;
                                            }
                                            i28 <<= 1;
                                            if (iLowestOneBit == iHighestOneBit) {
                                            }
                                        }
                                        iLowestOneBit <<= 1;
                                    }
                                }
                                if (i27 != 0) {
                                    break;
                                }
                                return i;
                            case -55:
                                i |= (i3 & 7) << 16;
                                int i36 = i3 >> 2;
                                if (i36 != 0 && i36 != -1) {
                                    throw f1066e;
                                }
                                i27 = 0;
                                if (z) {
                                    if (i3 > (1 << Integer.bitCount(i2)) - 1) {
                                        throw f1066e;
                                    }
                                    iLowestOneBit = Integer.lowestOneBit(i2);
                                    iHighestOneBit = Integer.highestOneBit(i2);
                                    while (true) {
                                        if ((i2 & iLowestOneBit) != 0) {
                                            if ((i3 & i28) != 0) {
                                                i |= iLowestOneBit;
                                            }
                                            i28 <<= 1;
                                            if (iLowestOneBit == iHighestOneBit) {
                                            }
                                        }
                                        iLowestOneBit <<= 1;
                                    }
                                }
                                if (i27 != 0) {
                                    break;
                                }
                                return i;
                            case -54:
                                i |= (i3 & 15) << 8;
                                int i37 = i3 >> 3;
                                if (i37 != 0 && i37 != -1) {
                                    throw f1066e;
                                }
                                i27 = 0;
                                if (z) {
                                    if (i3 > (1 << Integer.bitCount(i2)) - 1) {
                                        throw f1066e;
                                    }
                                    iLowestOneBit = Integer.lowestOneBit(i2);
                                    iHighestOneBit = Integer.highestOneBit(i2);
                                    while (true) {
                                        if ((i2 & iLowestOneBit) != 0) {
                                            if ((i3 & i28) != 0) {
                                                i |= iLowestOneBit;
                                            }
                                            i28 <<= 1;
                                            if (iLowestOneBit == iHighestOneBit) {
                                            }
                                        }
                                        iLowestOneBit <<= 1;
                                    }
                                }
                                if (i27 != 0) {
                                    break;
                                }
                                return i;
                            case -53:
                                i |= (65535 & i3) << 5;
                                int i38 = i3 >> 15;
                                if (i38 != 0 && i38 != -1) {
                                    throw f1066e;
                                }
                                i27 = 0;
                                if (z) {
                                    if (i3 > (1 << Integer.bitCount(i2)) - 1) {
                                        throw f1066e;
                                    }
                                    iLowestOneBit = Integer.lowestOneBit(i2);
                                    iHighestOneBit = Integer.highestOneBit(i2);
                                    while (true) {
                                        if ((i2 & iLowestOneBit) != 0) {
                                            if ((i3 & i28) != 0) {
                                                i |= iLowestOneBit;
                                            }
                                            i28 <<= 1;
                                            if (iLowestOneBit == iHighestOneBit) {
                                            }
                                        }
                                        iLowestOneBit <<= 1;
                                    }
                                }
                                if (i27 != 0) {
                                    break;
                                }
                                return i;
                            case -52:
                                i |= (i3 & 511) << 12;
                                int i39 = i3 >> 8;
                                if (i39 != 0 && i39 != -1) {
                                    throw f1066e;
                                }
                                i27 = 0;
                                if (z) {
                                    if (i3 > (1 << Integer.bitCount(i2)) - 1) {
                                        throw f1066e;
                                    }
                                    iLowestOneBit = Integer.lowestOneBit(i2);
                                    iHighestOneBit = Integer.highestOneBit(i2);
                                    while (true) {
                                        if ((i2 & iLowestOneBit) != 0) {
                                            if ((i3 & i28) != 0) {
                                                i |= iLowestOneBit;
                                            }
                                            i28 <<= 1;
                                            if (iLowestOneBit == iHighestOneBit) {
                                            }
                                        }
                                        iLowestOneBit <<= 1;
                                    }
                                }
                                if (i27 != 0) {
                                    break;
                                }
                                return i;
                            case -51:
                                i |= (i3 & 15) << 11;
                                int i40 = i3 >> 3;
                                if (i40 != 0 && i40 != -1) {
                                    throw f1066e;
                                }
                                i27 = 0;
                                if (z) {
                                    if (i3 > (1 << Integer.bitCount(i2)) - 1) {
                                        throw f1066e;
                                    }
                                    iLowestOneBit = Integer.lowestOneBit(i2);
                                    iHighestOneBit = Integer.highestOneBit(i2);
                                    while (true) {
                                        if ((i2 & iLowestOneBit) != 0) {
                                            if ((i3 & i28) != 0) {
                                                i |= iLowestOneBit;
                                            }
                                            i28 <<= 1;
                                            if (iLowestOneBit == iHighestOneBit) {
                                            }
                                        }
                                        iLowestOneBit <<= 1;
                                    }
                                }
                                if (i27 != 0) {
                                    break;
                                }
                                return i;
                            case -50:
                                i |= (i3 & 127) << 15;
                                int i41 = i3 >> 6;
                                if (i41 != 0 && i41 != -1) {
                                    throw f1066e;
                                }
                                i27 = 0;
                                if (z) {
                                    if (i3 > (1 << Integer.bitCount(i2)) - 1) {
                                        throw f1066e;
                                    }
                                    iLowestOneBit = Integer.lowestOneBit(i2);
                                    iHighestOneBit = Integer.highestOneBit(i2);
                                    while (true) {
                                        if ((i2 & iLowestOneBit) != 0) {
                                            if ((i3 & i28) != 0) {
                                                i |= iLowestOneBit;
                                            }
                                            i28 <<= 1;
                                            if (iLowestOneBit == iHighestOneBit) {
                                            }
                                        }
                                        iLowestOneBit <<= 1;
                                    }
                                }
                                if (i27 != 0) {
                                    break;
                                }
                                return i;
                            case -49:
                                i |= (524287 & i3) << 5;
                                int i42 = i3 >> 18;
                                if (i42 != 0 && i42 != -1) {
                                    throw f1066e;
                                }
                                i27 = 0;
                                if (z) {
                                    if (i3 > (1 << Integer.bitCount(i2)) - 1) {
                                        throw f1066e;
                                    }
                                    iLowestOneBit = Integer.lowestOneBit(i2);
                                    iHighestOneBit = Integer.highestOneBit(i2);
                                    while (true) {
                                        if ((i2 & iLowestOneBit) != 0) {
                                            if ((i3 & i28) != 0) {
                                                i |= iLowestOneBit;
                                            }
                                            i28 <<= 1;
                                            if (iLowestOneBit == iHighestOneBit) {
                                            }
                                        }
                                        iLowestOneBit <<= 1;
                                    }
                                }
                                if (i27 != 0) {
                                    break;
                                }
                                return i;
                            case -48:
                                i |= (i3 & 63) << 16;
                                i8 = i3 >> 5;
                                if (i8 != 0) {
                                    throw f1066e;
                                }
                                i27 = 0;
                                if (z) {
                                    if (i3 > (1 << Integer.bitCount(i2)) - 1) {
                                        throw f1066e;
                                    }
                                    iLowestOneBit = Integer.lowestOneBit(i2);
                                    iHighestOneBit = Integer.highestOneBit(i2);
                                    while (true) {
                                        if ((i2 & iLowestOneBit) != 0) {
                                            if ((i3 & i28) != 0) {
                                                i |= iLowestOneBit;
                                            }
                                            i28 <<= 1;
                                            if (iLowestOneBit == iHighestOneBit) {
                                            }
                                        }
                                        iLowestOneBit <<= 1;
                                    }
                                }
                                if (i27 != 0) {
                                    break;
                                }
                                return i;
                            case -47:
                                i9 = ((i3 & 12) << 27) | ((i3 & 2) << 23);
                                i10 = (i3 & 1) << 21;
                                i |= i9 | i10;
                                i27 = 15;
                                if (z) {
                                    if (i3 > (1 << Integer.bitCount(i2)) - 1) {
                                        throw f1066e;
                                    }
                                    iLowestOneBit = Integer.lowestOneBit(i2);
                                    iHighestOneBit = Integer.highestOneBit(i2);
                                    while (true) {
                                        if ((i2 & iLowestOneBit) != 0) {
                                            if ((i3 & i28) != 0) {
                                                i |= iLowestOneBit;
                                            }
                                            i28 <<= 1;
                                            if (iLowestOneBit == iHighestOneBit) {
                                            }
                                        }
                                        iLowestOneBit <<= 1;
                                    }
                                }
                                if (i27 != 0) {
                                    break;
                                }
                                return i;
                            case -46:
                                i11 = (i3 & 2) << 29;
                                i12 = (i3 & 1) << 24;
                                i |= i11 | i12;
                                i27 = 3;
                                if (z) {
                                    if (i3 > (1 << Integer.bitCount(i2)) - 1) {
                                        throw f1066e;
                                    }
                                    iLowestOneBit = Integer.lowestOneBit(i2);
                                    iHighestOneBit = Integer.highestOneBit(i2);
                                    while (true) {
                                        if ((i2 & iLowestOneBit) != 0) {
                                            if ((i3 & i28) != 0) {
                                                i |= iLowestOneBit;
                                            }
                                            i28 <<= 1;
                                            if (iLowestOneBit == iHighestOneBit) {
                                            }
                                        }
                                        iLowestOneBit <<= 1;
                                    }
                                }
                                if (i27 != 0) {
                                    break;
                                }
                                return i;
                            case -45:
                                i11 = (i3 & 2) << 29;
                                i12 = (i3 & 1) << 10;
                                i |= i11 | i12;
                                i27 = 3;
                                if (z) {
                                    if (i3 > (1 << Integer.bitCount(i2)) - 1) {
                                        throw f1066e;
                                    }
                                    iLowestOneBit = Integer.lowestOneBit(i2);
                                    iHighestOneBit = Integer.highestOneBit(i2);
                                    while (true) {
                                        if ((i2 & iLowestOneBit) != 0) {
                                            if ((i3 & i28) != 0) {
                                                i |= iLowestOneBit;
                                            }
                                            i28 <<= 1;
                                            if (iLowestOneBit == iHighestOneBit) {
                                            }
                                        }
                                        iLowestOneBit <<= 1;
                                    }
                                }
                                if (i27 != 0) {
                                    break;
                                }
                                return i;
                            case -44:
                                i11 = (i3 & 2) << 11;
                                i12 = (i3 & 1) << 10;
                                i |= i11 | i12;
                                i27 = 3;
                                if (z) {
                                    if (i3 > (1 << Integer.bitCount(i2)) - 1) {
                                        throw f1066e;
                                    }
                                    iLowestOneBit = Integer.lowestOneBit(i2);
                                    iHighestOneBit = Integer.highestOneBit(i2);
                                    while (true) {
                                        if ((i2 & iLowestOneBit) != 0) {
                                            if ((i3 & i28) != 0) {
                                                i |= iLowestOneBit;
                                            }
                                            i28 <<= 1;
                                            if (iLowestOneBit == iHighestOneBit) {
                                            }
                                        }
                                        iLowestOneBit <<= 1;
                                    }
                                }
                                if (i27 != 0) {
                                    break;
                                }
                                return i;
                            case -43:
                                i11 = (i3 & 2) << 30;
                                i12 = (i3 & 1) << 11;
                                i |= i11 | i12;
                                i27 = 3;
                                if (z) {
                                    if (i3 > (1 << Integer.bitCount(i2)) - 1) {
                                        throw f1066e;
                                    }
                                    iLowestOneBit = Integer.lowestOneBit(i2);
                                    iHighestOneBit = Integer.highestOneBit(i2);
                                    while (true) {
                                        if ((i2 & iLowestOneBit) != 0) {
                                            if ((i3 & i28) != 0) {
                                                i |= iLowestOneBit;
                                            }
                                            i28 <<= 1;
                                            if (iLowestOneBit == iHighestOneBit) {
                                            }
                                        }
                                        iLowestOneBit <<= 1;
                                    }
                                }
                                if (i27 != 0) {
                                    break;
                                }
                                return i;
                            case -42:
                                i13 = (i3 & 32) << 26;
                                i14 = (i3 & 31) << 19;
                                i |= i13 | i14;
                                if (z) {
                                    if (i3 > (1 << Integer.bitCount(i2)) - 1) {
                                        throw f1066e;
                                    }
                                    iLowestOneBit = Integer.lowestOneBit(i2);
                                    iHighestOneBit = Integer.highestOneBit(i2);
                                    while (true) {
                                        if ((i2 & iLowestOneBit) != 0) {
                                            if ((i3 & i28) != 0) {
                                                i |= iLowestOneBit;
                                            }
                                            i28 <<= 1;
                                            if (iLowestOneBit == iHighestOneBit) {
                                            }
                                        }
                                        iLowestOneBit <<= 1;
                                    }
                                }
                                if (i27 != 0) {
                                    break;
                                }
                                return i;
                            case -41:
                                i11 = (i3 & 2) << 23;
                                i12 = (i3 & 1) << 22;
                                i |= i11 | i12;
                                i27 = 3;
                                if (z) {
                                    if (i3 > (1 << Integer.bitCount(i2)) - 1) {
                                        throw f1066e;
                                    }
                                    iLowestOneBit = Integer.lowestOneBit(i2);
                                    iHighestOneBit = Integer.highestOneBit(i2);
                                    while (true) {
                                        if ((i2 & iLowestOneBit) != 0) {
                                            if ((i3 & i28) != 0) {
                                                i |= iLowestOneBit;
                                            }
                                            i28 <<= 1;
                                            if (iLowestOneBit == iHighestOneBit) {
                                            }
                                        }
                                        iLowestOneBit <<= 1;
                                    }
                                }
                                if (i27 != 0) {
                                    break;
                                }
                                return i;
                            case -40:
                                i11 = (i3 & 2) << 17;
                                i12 = (i3 & 1) << 16;
                                i |= i11 | i12;
                                i27 = 3;
                                if (z) {
                                    if (i3 > (1 << Integer.bitCount(i2)) - 1) {
                                        throw f1066e;
                                    }
                                    iLowestOneBit = Integer.lowestOneBit(i2);
                                    iHighestOneBit = Integer.highestOneBit(i2);
                                    while (true) {
                                        if ((i2 & iLowestOneBit) != 0) {
                                            if ((i3 & i28) != 0) {
                                                i |= iLowestOneBit;
                                            }
                                            i28 <<= 1;
                                            if (iLowestOneBit == iHighestOneBit) {
                                            }
                                        }
                                        iLowestOneBit <<= 1;
                                    }
                                }
                                if (i27 != 0) {
                                    break;
                                }
                                return i;
                            case -39:
                                i9 = (i3 & 8) << 19;
                                i25 = i3 & 7;
                                i10 = i25 << 12;
                                i |= i9 | i10;
                                i27 = 15;
                                if (z) {
                                    if (i3 > (1 << Integer.bitCount(i2)) - 1) {
                                        throw f1066e;
                                    }
                                    iLowestOneBit = Integer.lowestOneBit(i2);
                                    iHighestOneBit = Integer.highestOneBit(i2);
                                    while (true) {
                                        if ((i2 & iLowestOneBit) != 0) {
                                            if ((i3 & i28) != 0) {
                                                i |= iLowestOneBit;
                                            }
                                            i28 <<= 1;
                                            if (iLowestOneBit == iHighestOneBit) {
                                            }
                                        }
                                        iLowestOneBit <<= 1;
                                    }
                                }
                                if (i27 != 0) {
                                    break;
                                }
                                return i;
                            case -38:
                                i11 = (i3 & 2) << 21;
                                i12 = (i3 & 1) << 11;
                                i |= i11 | i12;
                                i27 = 3;
                                if (z) {
                                    if (i3 > (1 << Integer.bitCount(i2)) - 1) {
                                        throw f1066e;
                                    }
                                    iLowestOneBit = Integer.lowestOneBit(i2);
                                    iHighestOneBit = Integer.highestOneBit(i2);
                                    while (true) {
                                        if ((i2 & iLowestOneBit) != 0) {
                                            if ((i3 & i28) != 0) {
                                                i |= iLowestOneBit;
                                            }
                                            i28 <<= 1;
                                            if (iLowestOneBit == iHighestOneBit) {
                                            }
                                        }
                                        iLowestOneBit <<= 1;
                                    }
                                }
                                if (i27 != 0) {
                                    break;
                                }
                                return i;
                            case -37:
                                i15 = (i3 & 6) << 21;
                                i16 = (i3 & 1) << 15;
                                i |= i15 | i16;
                                i27 = 7;
                                if (z) {
                                    if (i3 > (1 << Integer.bitCount(i2)) - 1) {
                                        throw f1066e;
                                    }
                                    iLowestOneBit = Integer.lowestOneBit(i2);
                                    iHighestOneBit = Integer.highestOneBit(i2);
                                    while (true) {
                                        if ((i2 & iLowestOneBit) != 0) {
                                            if ((i3 & i28) != 0) {
                                                i |= iLowestOneBit;
                                            }
                                            i28 <<= 1;
                                            if (iLowestOneBit == iHighestOneBit) {
                                            }
                                        }
                                        iLowestOneBit <<= 1;
                                    }
                                }
                                if (i27 != 0) {
                                    break;
                                }
                                return i;
                            case -36:
                                i9 = (i3 & 8) << 6;
                                i10 = (i3 & 7) << 5;
                                i |= i9 | i10;
                                i27 = 15;
                                if (z) {
                                    if (i3 > (1 << Integer.bitCount(i2)) - 1) {
                                        throw f1066e;
                                    }
                                    iLowestOneBit = Integer.lowestOneBit(i2);
                                    iHighestOneBit = Integer.highestOneBit(i2);
                                    while (true) {
                                        if ((i2 & iLowestOneBit) != 0) {
                                            if ((i3 & i28) != 0) {
                                                i |= iLowestOneBit;
                                            }
                                            i28 <<= 1;
                                            if (iLowestOneBit == iHighestOneBit) {
                                            }
                                        }
                                        iLowestOneBit <<= 1;
                                    }
                                }
                                if (i27 != 0) {
                                    break;
                                }
                                return i;
                            case -35:
                                i15 = (i3 & 4) << 19;
                                i16 = i3 & 3;
                                i |= i15 | i16;
                                i27 = 7;
                                if (z) {
                                    if (i3 > (1 << Integer.bitCount(i2)) - 1) {
                                        throw f1066e;
                                    }
                                    iLowestOneBit = Integer.lowestOneBit(i2);
                                    iHighestOneBit = Integer.highestOneBit(i2);
                                    while (true) {
                                        if ((i2 & iLowestOneBit) != 0) {
                                            if ((i3 & i28) != 0) {
                                                i |= iLowestOneBit;
                                            }
                                            i28 <<= 1;
                                            if (iLowestOneBit == iHighestOneBit) {
                                            }
                                        }
                                        iLowestOneBit <<= 1;
                                    }
                                }
                                if (i27 != 0) {
                                    break;
                                }
                                return i;
                            case -34:
                                i11 = (i3 & 2) << 22;
                                i12 = (i3 & 1) << 15;
                                i |= i11 | i12;
                                i27 = 3;
                                if (z) {
                                    if (i3 > (1 << Integer.bitCount(i2)) - 1) {
                                        throw f1066e;
                                    }
                                    iLowestOneBit = Integer.lowestOneBit(i2);
                                    iHighestOneBit = Integer.highestOneBit(i2);
                                    while (true) {
                                        if ((i2 & iLowestOneBit) != 0) {
                                            if ((i3 & i28) != 0) {
                                                i |= iLowestOneBit;
                                            }
                                            i28 <<= 1;
                                            if (iLowestOneBit == iHighestOneBit) {
                                            }
                                        }
                                        iLowestOneBit <<= 1;
                                    }
                                }
                                if (i27 != 0) {
                                    break;
                                }
                                return i;
                            case -33:
                                i11 = (i3 & 2) << 28;
                                i12 = (i3 & 1) << 12;
                                i |= i11 | i12;
                                i27 = 3;
                                if (z) {
                                    if (i3 > (1 << Integer.bitCount(i2)) - 1) {
                                        throw f1066e;
                                    }
                                    iLowestOneBit = Integer.lowestOneBit(i2);
                                    iHighestOneBit = Integer.highestOneBit(i2);
                                    while (true) {
                                        if ((i2 & iLowestOneBit) != 0) {
                                            if ((i3 & i28) != 0) {
                                                i |= iLowestOneBit;
                                            }
                                            i28 <<= 1;
                                            if (iLowestOneBit == iHighestOneBit) {
                                            }
                                        }
                                        iLowestOneBit <<= 1;
                                    }
                                }
                                if (i27 != 0) {
                                    break;
                                }
                                return i;
                            case -32:
                                i17 = (i3 & 16) << 25;
                                i18 = (i3 & 8) << 18;
                                i21 = i17 | i18;
                                i22 = (i3 & 7) << 11;
                                i |= i21 | i22;
                                i27 = 31;
                                if (z) {
                                    if (i3 > (1 << Integer.bitCount(i2)) - 1) {
                                        throw f1066e;
                                    }
                                    iLowestOneBit = Integer.lowestOneBit(i2);
                                    iHighestOneBit = Integer.highestOneBit(i2);
                                    while (true) {
                                        if ((i2 & iLowestOneBit) != 0) {
                                            if ((i3 & i28) != 0) {
                                                i |= iLowestOneBit;
                                            }
                                            i28 <<= 1;
                                            if (iLowestOneBit == iHighestOneBit) {
                                            }
                                        }
                                        iLowestOneBit <<= 1;
                                    }
                                }
                                if (i27 != 0) {
                                    break;
                                }
                                return i;
                            case -31:
                                i15 = (i3 & 4) << 27;
                                i16 = (i3 & 3) << 22;
                                i |= i15 | i16;
                                i27 = 7;
                                if (z) {
                                    if (i3 > (1 << Integer.bitCount(i2)) - 1) {
                                        throw f1066e;
                                    }
                                    iLowestOneBit = Integer.lowestOneBit(i2);
                                    iHighestOneBit = Integer.highestOneBit(i2);
                                    while (true) {
                                        if ((i2 & iLowestOneBit) != 0) {
                                            if ((i3 & i28) != 0) {
                                                i |= iLowestOneBit;
                                            }
                                            i28 <<= 1;
                                            if (iLowestOneBit == iHighestOneBit) {
                                            }
                                        }
                                        iLowestOneBit <<= 1;
                                    }
                                }
                                if (i27 != 0) {
                                    break;
                                }
                                return i;
                            case -30:
                                i15 = ((i3 & 4) << 27) | ((i3 & 2) << 15);
                                i19 = i3 & 1;
                                i16 = i19 << 12;
                                i |= i15 | i16;
                                i27 = 7;
                                if (z) {
                                    if (i3 > (1 << Integer.bitCount(i2)) - 1) {
                                        throw f1066e;
                                    }
                                    iLowestOneBit = Integer.lowestOneBit(i2);
                                    iHighestOneBit = Integer.highestOneBit(i2);
                                    while (true) {
                                        if ((i2 & iLowestOneBit) != 0) {
                                            if ((i3 & i28) != 0) {
                                                i |= iLowestOneBit;
                                            }
                                            i28 <<= 1;
                                            if (iLowestOneBit == iHighestOneBit) {
                                            }
                                        }
                                        iLowestOneBit <<= 1;
                                    }
                                }
                                if (i27 != 0) {
                                    break;
                                }
                                return i;
                            case -29:
                                i13 = ((i3 & 32) << 24) | ((i3 & 16) << 19) | ((i3 & 8) << 13);
                                i20 = i3 & 7;
                                i14 = i20 << 12;
                                i |= i13 | i14;
                                if (z) {
                                    if (i3 > (1 << Integer.bitCount(i2)) - 1) {
                                        throw f1066e;
                                    }
                                    iLowestOneBit = Integer.lowestOneBit(i2);
                                    iHighestOneBit = Integer.highestOneBit(i2);
                                    while (true) {
                                        if ((i2 & iLowestOneBit) != 0) {
                                            if ((i3 & i28) != 0) {
                                                i |= iLowestOneBit;
                                            }
                                            i28 <<= 1;
                                            if (iLowestOneBit == iHighestOneBit) {
                                            }
                                        }
                                        iLowestOneBit <<= 1;
                                    }
                                }
                                if (i27 != 0) {
                                    break;
                                }
                                return i;
                            case -28:
                                i11 = (i3 & 2) << 28;
                                i12 = (i3 & 1) << 14;
                                i |= i11 | i12;
                                i27 = 3;
                                if (z) {
                                    if (i3 > (1 << Integer.bitCount(i2)) - 1) {
                                        throw f1066e;
                                    }
                                    iLowestOneBit = Integer.lowestOneBit(i2);
                                    iHighestOneBit = Integer.highestOneBit(i2);
                                    while (true) {
                                        if ((i2 & iLowestOneBit) != 0) {
                                            if ((i3 & i28) != 0) {
                                                i |= iLowestOneBit;
                                            }
                                            i28 <<= 1;
                                            if (iLowestOneBit == iHighestOneBit) {
                                            }
                                        }
                                        iLowestOneBit <<= 1;
                                    }
                                }
                                if (i27 != 0) {
                                    break;
                                }
                                return i;
                            case -27:
                                i17 = (i3 & 16) << 25;
                                i18 = (i3 & 8) << 20;
                                i21 = i17 | i18;
                                i22 = (i3 & 7) << 11;
                                i |= i21 | i22;
                                i27 = 31;
                                if (z) {
                                    if (i3 > (1 << Integer.bitCount(i2)) - 1) {
                                        throw f1066e;
                                    }
                                    iLowestOneBit = Integer.lowestOneBit(i2);
                                    iHighestOneBit = Integer.highestOneBit(i2);
                                    while (true) {
                                        if ((i2 & iLowestOneBit) != 0) {
                                            if ((i3 & i28) != 0) {
                                                i |= iLowestOneBit;
                                            }
                                            i28 <<= 1;
                                            if (iLowestOneBit == iHighestOneBit) {
                                            }
                                        }
                                        iLowestOneBit <<= 1;
                                    }
                                }
                                if (i27 != 0) {
                                    break;
                                }
                                return i;
                            case -26:
                                i9 = ((i3 & 8) << 27) | ((i3 & 6) << 21);
                                i10 = (i3 & 1) << 11;
                                i |= i9 | i10;
                                i27 = 15;
                                if (z) {
                                    if (i3 > (1 << Integer.bitCount(i2)) - 1) {
                                        throw f1066e;
                                    }
                                    iLowestOneBit = Integer.lowestOneBit(i2);
                                    iHighestOneBit = Integer.highestOneBit(i2);
                                    while (true) {
                                        if ((i2 & iLowestOneBit) != 0) {
                                            if ((i3 & i28) != 0) {
                                                i |= iLowestOneBit;
                                            }
                                            i28 <<= 1;
                                            if (iLowestOneBit == iHighestOneBit) {
                                            }
                                        }
                                        iLowestOneBit <<= 1;
                                    }
                                }
                                if (i27 != 0) {
                                    break;
                                }
                                return i;
                            case -25:
                                i11 = (i3 & 2) << 29;
                                i12 = (i3 & 1) << 11;
                                i |= i11 | i12;
                                i27 = 3;
                                if (z) {
                                    if (i3 > (1 << Integer.bitCount(i2)) - 1) {
                                        throw f1066e;
                                    }
                                    iLowestOneBit = Integer.lowestOneBit(i2);
                                    iHighestOneBit = Integer.highestOneBit(i2);
                                    while (true) {
                                        if ((i2 & iLowestOneBit) != 0) {
                                            if ((i3 & i28) != 0) {
                                                i |= iLowestOneBit;
                                            }
                                            i28 <<= 1;
                                            if (iLowestOneBit == iHighestOneBit) {
                                            }
                                        }
                                        iLowestOneBit <<= 1;
                                    }
                                }
                                if (i27 != 0) {
                                    break;
                                }
                                return i;
                            case -24:
                                i23 = (i3 & 16) << 26;
                                i24 = (i3 & 8) << 19;
                                i21 = i23 | i24;
                                i26 = i3 & 7;
                                i22 = i26 << 12;
                                i |= i21 | i22;
                                i27 = 31;
                                if (z) {
                                    if (i3 > (1 << Integer.bitCount(i2)) - 1) {
                                        throw f1066e;
                                    }
                                    iLowestOneBit = Integer.lowestOneBit(i2);
                                    iHighestOneBit = Integer.highestOneBit(i2);
                                    while (true) {
                                        if ((i2 & iLowestOneBit) != 0) {
                                            if ((i3 & i28) != 0) {
                                                i |= iLowestOneBit;
                                            }
                                            i28 <<= 1;
                                            if (iLowestOneBit == iHighestOneBit) {
                                            }
                                        }
                                        iLowestOneBit <<= 1;
                                    }
                                }
                                if (i27 != 0) {
                                    break;
                                }
                                return i;
                            case -23:
                                i11 = (i3 & 2) << 29;
                                i12 = (i3 & 1) << 22;
                                i |= i11 | i12;
                                i27 = 3;
                                if (z) {
                                    if (i3 > (1 << Integer.bitCount(i2)) - 1) {
                                        throw f1066e;
                                    }
                                    iLowestOneBit = Integer.lowestOneBit(i2);
                                    iHighestOneBit = Integer.highestOneBit(i2);
                                    while (true) {
                                        if ((i2 & iLowestOneBit) != 0) {
                                            if ((i3 & i28) != 0) {
                                                i |= iLowestOneBit;
                                            }
                                            i28 <<= 1;
                                            if (iLowestOneBit == iHighestOneBit) {
                                            }
                                        }
                                        iLowestOneBit <<= 1;
                                    }
                                }
                                if (i27 != 0) {
                                    break;
                                }
                                return i;
                            case -22:
                                i11 = (i3 & 2) << 13;
                                i12 = (i3 & 1) << 12;
                                i |= i11 | i12;
                                i27 = 3;
                                if (z) {
                                    if (i3 > (1 << Integer.bitCount(i2)) - 1) {
                                        throw f1066e;
                                    }
                                    iLowestOneBit = Integer.lowestOneBit(i2);
                                    iHighestOneBit = Integer.highestOneBit(i2);
                                    while (true) {
                                        if ((i2 & iLowestOneBit) != 0) {
                                            if ((i3 & i28) != 0) {
                                                i |= iLowestOneBit;
                                            }
                                            i28 <<= 1;
                                            if (iLowestOneBit == iHighestOneBit) {
                                            }
                                        }
                                        iLowestOneBit <<= 1;
                                    }
                                }
                                if (i27 != 0) {
                                    break;
                                }
                                return i;
                            case -21:
                                i13 = (i3 & 32) << 16;
                                i14 = (i3 & 31) << 10;
                                i |= i13 | i14;
                                if (z) {
                                    if (i3 > (1 << Integer.bitCount(i2)) - 1) {
                                        throw f1066e;
                                    }
                                    iLowestOneBit = Integer.lowestOneBit(i2);
                                    iHighestOneBit = Integer.highestOneBit(i2);
                                    while (true) {
                                        if ((i2 & iLowestOneBit) != 0) {
                                            if ((i3 & i28) != 0) {
                                                i |= iLowestOneBit;
                                            }
                                            i28 <<= 1;
                                            if (iLowestOneBit == iHighestOneBit) {
                                            }
                                        }
                                        iLowestOneBit <<= 1;
                                    }
                                }
                                if (i27 != 0) {
                                    break;
                                }
                                return i;
                            case -20:
                                i11 = (i3 & 2) << 21;
                                i12 = (i3 & 1) << 13;
                                i |= i11 | i12;
                                i27 = 3;
                                if (z) {
                                    if (i3 > (1 << Integer.bitCount(i2)) - 1) {
                                        throw f1066e;
                                    }
                                    iLowestOneBit = Integer.lowestOneBit(i2);
                                    iHighestOneBit = Integer.highestOneBit(i2);
                                    while (true) {
                                        if ((i2 & iLowestOneBit) != 0) {
                                            if ((i3 & i28) != 0) {
                                                i |= iLowestOneBit;
                                            }
                                            i28 <<= 1;
                                            if (iLowestOneBit == iHighestOneBit) {
                                            }
                                        }
                                        iLowestOneBit <<= 1;
                                    }
                                }
                                if (i27 != 0) {
                                    break;
                                }
                                return i;
                            case -19:
                                i9 = ((i3 & 8) << 27) | ((i3 & 6) << 21);
                                i10 = (i3 & 1) << 15;
                                i |= i9 | i10;
                                i27 = 15;
                                if (z) {
                                    if (i3 > (1 << Integer.bitCount(i2)) - 1) {
                                        throw f1066e;
                                    }
                                    iLowestOneBit = Integer.lowestOneBit(i2);
                                    iHighestOneBit = Integer.highestOneBit(i2);
                                    while (true) {
                                        if ((i2 & iLowestOneBit) != 0) {
                                            if ((i3 & i28) != 0) {
                                                i |= iLowestOneBit;
                                            }
                                            i28 <<= 1;
                                            if (iLowestOneBit == iHighestOneBit) {
                                            }
                                        }
                                        iLowestOneBit <<= 1;
                                    }
                                }
                                if (i27 != 0) {
                                    break;
                                }
                                return i;
                            case -18:
                                i11 = (i3 & 2) << 21;
                                i12 = (i3 & 1) << 15;
                                i |= i11 | i12;
                                i27 = 3;
                                if (z) {
                                    if (i3 > (1 << Integer.bitCount(i2)) - 1) {
                                        throw f1066e;
                                    }
                                    iLowestOneBit = Integer.lowestOneBit(i2);
                                    iHighestOneBit = Integer.highestOneBit(i2);
                                    while (true) {
                                        if ((i2 & iLowestOneBit) != 0) {
                                            if ((i3 & i28) != 0) {
                                                i |= iLowestOneBit;
                                            }
                                            i28 <<= 1;
                                            if (iLowestOneBit == iHighestOneBit) {
                                            }
                                        }
                                        iLowestOneBit <<= 1;
                                    }
                                }
                                if (i27 != 0) {
                                    break;
                                }
                                return i;
                            case -17:
                                i9 = (i3 & 8) << 26;
                                i25 = i3 & 7;
                                i10 = i25 << 12;
                                i |= i9 | i10;
                                i27 = 15;
                                if (z) {
                                    if (i3 > (1 << Integer.bitCount(i2)) - 1) {
                                        throw f1066e;
                                    }
                                    iLowestOneBit = Integer.lowestOneBit(i2);
                                    iHighestOneBit = Integer.highestOneBit(i2);
                                    while (true) {
                                        if ((i2 & iLowestOneBit) != 0) {
                                            if ((i3 & i28) != 0) {
                                                i |= iLowestOneBit;
                                            }
                                            i28 <<= 1;
                                            if (iLowestOneBit == iHighestOneBit) {
                                            }
                                        }
                                        iLowestOneBit <<= 1;
                                    }
                                }
                                if (i27 != 0) {
                                    break;
                                }
                                return i;
                            case -16:
                                i13 = (i3 & 32) << 24;
                                i14 = (i3 & 31) << 11;
                                i |= i13 | i14;
                                if (z) {
                                    if (i3 > (1 << Integer.bitCount(i2)) - 1) {
                                        throw f1066e;
                                    }
                                    iLowestOneBit = Integer.lowestOneBit(i2);
                                    iHighestOneBit = Integer.highestOneBit(i2);
                                    while (true) {
                                        if ((i2 & iLowestOneBit) != 0) {
                                            if ((i3 & i28) != 0) {
                                                i |= iLowestOneBit;
                                            }
                                            i28 <<= 1;
                                            if (iLowestOneBit == iHighestOneBit) {
                                            }
                                        }
                                        iLowestOneBit <<= 1;
                                    }
                                }
                                if (i27 != 0) {
                                    break;
                                }
                                return i;
                            case -15:
                                i15 = (i3 & 4) << 27;
                                i16 = (i3 & 3) << 14;
                                i |= i15 | i16;
                                i27 = 7;
                                if (z) {
                                    if (i3 > (1 << Integer.bitCount(i2)) - 1) {
                                        throw f1066e;
                                    }
                                    iLowestOneBit = Integer.lowestOneBit(i2);
                                    iHighestOneBit = Integer.highestOneBit(i2);
                                    while (true) {
                                        if ((i2 & iLowestOneBit) != 0) {
                                            if ((i3 & i28) != 0) {
                                                i |= iLowestOneBit;
                                            }
                                            i28 <<= 1;
                                            if (iLowestOneBit == iHighestOneBit) {
                                            }
                                        }
                                        iLowestOneBit <<= 1;
                                    }
                                }
                                if (i27 != 0) {
                                    break;
                                }
                                return i;
                            case -14:
                                i23 = (i3 & 16) << 25;
                                i24 = (i3 & 8) << 20;
                                i21 = i23 | i24;
                                i26 = i3 & 7;
                                i22 = i26 << 12;
                                i |= i21 | i22;
                                i27 = 31;
                                if (z) {
                                    if (i3 > (1 << Integer.bitCount(i2)) - 1) {
                                        throw f1066e;
                                    }
                                    iLowestOneBit = Integer.lowestOneBit(i2);
                                    iHighestOneBit = Integer.highestOneBit(i2);
                                    while (true) {
                                        if ((i2 & iLowestOneBit) != 0) {
                                            if ((i3 & i28) != 0) {
                                                i |= iLowestOneBit;
                                            }
                                            i28 <<= 1;
                                            if (iLowestOneBit == iHighestOneBit) {
                                            }
                                        }
                                        iLowestOneBit <<= 1;
                                    }
                                }
                                if (i27 != 0) {
                                    break;
                                }
                                return i;
                            case -13:
                                i15 = (i3 & 4) << 27;
                                i19 = i3 & 3;
                                i16 = i19 << 12;
                                i |= i15 | i16;
                                i27 = 7;
                                if (z) {
                                    if (i3 > (1 << Integer.bitCount(i2)) - 1) {
                                        throw f1066e;
                                    }
                                    iLowestOneBit = Integer.lowestOneBit(i2);
                                    iHighestOneBit = Integer.highestOneBit(i2);
                                    while (true) {
                                        if ((i2 & iLowestOneBit) != 0) {
                                            if ((i3 & i28) != 0) {
                                                i |= iLowestOneBit;
                                            }
                                            i28 <<= 1;
                                            if (iLowestOneBit == iHighestOneBit) {
                                            }
                                        }
                                        iLowestOneBit <<= 1;
                                    }
                                }
                                if (i27 != 0) {
                                    break;
                                }
                                return i;
                            case -12:
                                i15 = (i3 & 4) << 21;
                                i19 = i3 & 3;
                                i16 = i19 << 12;
                                i |= i15 | i16;
                                i27 = 7;
                                if (z) {
                                    if (i3 > (1 << Integer.bitCount(i2)) - 1) {
                                        throw f1066e;
                                    }
                                    iLowestOneBit = Integer.lowestOneBit(i2);
                                    iHighestOneBit = Integer.highestOneBit(i2);
                                    while (true) {
                                        if ((i2 & iLowestOneBit) != 0) {
                                            if ((i3 & i28) != 0) {
                                                i |= iLowestOneBit;
                                            }
                                            i28 <<= 1;
                                            if (iLowestOneBit == iHighestOneBit) {
                                            }
                                        }
                                        iLowestOneBit <<= 1;
                                    }
                                }
                                if (i27 != 0) {
                                    break;
                                }
                                return i;
                            case -11:
                                i15 = (i3 & 4) << 27;
                                i16 = (i3 & 3) << 11;
                                i |= i15 | i16;
                                i27 = 7;
                                if (z) {
                                    if (i3 > (1 << Integer.bitCount(i2)) - 1) {
                                        throw f1066e;
                                    }
                                    iLowestOneBit = Integer.lowestOneBit(i2);
                                    iHighestOneBit = Integer.highestOneBit(i2);
                                    while (true) {
                                        if ((i2 & iLowestOneBit) != 0) {
                                            if ((i3 & i28) != 0) {
                                                i |= iLowestOneBit;
                                            }
                                            i28 <<= 1;
                                            if (iLowestOneBit == iHighestOneBit) {
                                            }
                                        }
                                        iLowestOneBit <<= 1;
                                    }
                                }
                                if (i27 != 0) {
                                    break;
                                }
                                return i;
                            case -10:
                                i9 = ((i3 & 8) << 26) | ((i3 & 6) << 13);
                                i25 = i3 & 1;
                                i10 = i25 << 12;
                                i |= i9 | i10;
                                i27 = 15;
                                if (z) {
                                    if (i3 > (1 << Integer.bitCount(i2)) - 1) {
                                        throw f1066e;
                                    }
                                    iLowestOneBit = Integer.lowestOneBit(i2);
                                    iHighestOneBit = Integer.highestOneBit(i2);
                                    while (true) {
                                        if ((i2 & iLowestOneBit) != 0) {
                                            if ((i3 & i28) != 0) {
                                                i |= iLowestOneBit;
                                            }
                                            i28 <<= 1;
                                            if (iLowestOneBit == iHighestOneBit) {
                                            }
                                        }
                                        iLowestOneBit <<= 1;
                                    }
                                }
                                if (i27 != 0) {
                                    break;
                                }
                                return i;
                            case -9:
                                i21 = (i3 & 16) << 25;
                                i26 = i3 & 15;
                                i22 = i26 << 12;
                                i |= i21 | i22;
                                i27 = 31;
                                if (z) {
                                    if (i3 > (1 << Integer.bitCount(i2)) - 1) {
                                        throw f1066e;
                                    }
                                    iLowestOneBit = Integer.lowestOneBit(i2);
                                    iHighestOneBit = Integer.highestOneBit(i2);
                                    while (true) {
                                        if ((i2 & iLowestOneBit) != 0) {
                                            if ((i3 & i28) != 0) {
                                                i |= iLowestOneBit;
                                            }
                                            i28 <<= 1;
                                            if (iLowestOneBit == iHighestOneBit) {
                                            }
                                        }
                                        iLowestOneBit <<= 1;
                                    }
                                }
                                if (i27 != 0) {
                                    break;
                                }
                                return i;
                            case -8:
                                i11 = (i3 & 2) << 28;
                                i12 = (i3 & 1) << 13;
                                i |= i11 | i12;
                                i27 = 3;
                                if (z) {
                                    if (i3 > (1 << Integer.bitCount(i2)) - 1) {
                                        throw f1066e;
                                    }
                                    iLowestOneBit = Integer.lowestOneBit(i2);
                                    iHighestOneBit = Integer.highestOneBit(i2);
                                    while (true) {
                                        if ((i2 & iLowestOneBit) != 0) {
                                            if ((i3 & i28) != 0) {
                                                i |= iLowestOneBit;
                                            }
                                            i28 <<= 1;
                                            if (iLowestOneBit == iHighestOneBit) {
                                            }
                                        }
                                        iLowestOneBit <<= 1;
                                    }
                                }
                                if (i27 != 0) {
                                    break;
                                }
                                return i;
                            case -7:
                                i15 = (i3 & 4) << 27;
                                i16 = (i3 & 3) << 13;
                                i |= i15 | i16;
                                i27 = 7;
                                if (z) {
                                    if (i3 > (1 << Integer.bitCount(i2)) - 1) {
                                        throw f1066e;
                                    }
                                    iLowestOneBit = Integer.lowestOneBit(i2);
                                    iHighestOneBit = Integer.highestOneBit(i2);
                                    while (true) {
                                        if ((i2 & iLowestOneBit) != 0) {
                                            if ((i3 & i28) != 0) {
                                                i |= iLowestOneBit;
                                            }
                                            i28 <<= 1;
                                            if (iLowestOneBit == iHighestOneBit) {
                                            }
                                        }
                                        iLowestOneBit <<= 1;
                                    }
                                }
                                if (i27 != 0) {
                                    break;
                                }
                                return i;
                            case -6:
                                i13 = (i3 & 48) << 18;
                                i20 = i3 & 15;
                                i14 = i20 << 12;
                                i |= i13 | i14;
                                if (z) {
                                    if (i3 > (1 << Integer.bitCount(i2)) - 1) {
                                        throw f1066e;
                                    }
                                    iLowestOneBit = Integer.lowestOneBit(i2);
                                    iHighestOneBit = Integer.highestOneBit(i2);
                                    while (true) {
                                        if ((i2 & iLowestOneBit) != 0) {
                                            if ((i3 & i28) != 0) {
                                                i |= iLowestOneBit;
                                            }
                                            i28 <<= 1;
                                            if (iLowestOneBit == iHighestOneBit) {
                                            }
                                        }
                                        iLowestOneBit <<= 1;
                                    }
                                }
                                if (i27 != 0) {
                                    break;
                                }
                                return i;
                            case -5:
                                i |= ((i3 & 224) << 11) | ((i3 & 31) << 5);
                                i27 = 255;
                                if (z) {
                                    if (i3 > (1 << Integer.bitCount(i2)) - 1) {
                                        throw f1066e;
                                    }
                                    iLowestOneBit = Integer.lowestOneBit(i2);
                                    iHighestOneBit = Integer.highestOneBit(i2);
                                    while (true) {
                                        if ((i2 & iLowestOneBit) != 0) {
                                            if ((i3 & i28) != 0) {
                                                i |= iLowestOneBit;
                                            }
                                            i28 <<= 1;
                                            if (iLowestOneBit == iHighestOneBit) {
                                            }
                                        }
                                        iLowestOneBit <<= 1;
                                    }
                                }
                                if (i27 != 0) {
                                    break;
                                }
                                return i;
                            case -4:
                                i11 = (i3 & 2) << 20;
                                i12 = (i3 & 1) << 15;
                                i |= i11 | i12;
                                i27 = 3;
                                if (z) {
                                    if (i3 > (1 << Integer.bitCount(i2)) - 1) {
                                        throw f1066e;
                                    }
                                    iLowestOneBit = Integer.lowestOneBit(i2);
                                    iHighestOneBit = Integer.highestOneBit(i2);
                                    while (true) {
                                        if ((i2 & iLowestOneBit) != 0) {
                                            if ((i3 & i28) != 0) {
                                                i |= iLowestOneBit;
                                            }
                                            i28 <<= 1;
                                            if (iLowestOneBit == iHighestOneBit) {
                                            }
                                        }
                                        iLowestOneBit <<= 1;
                                    }
                                }
                                if (i27 != 0) {
                                    break;
                                }
                                return i;
                            case -3:
                                i11 = (i3 & 2) << 10;
                                i12 = (i3 & 1) << 21;
                                i |= i11 | i12;
                                i27 = 3;
                                if (z) {
                                    if (i3 > (1 << Integer.bitCount(i2)) - 1) {
                                        throw f1066e;
                                    }
                                    iLowestOneBit = Integer.lowestOneBit(i2);
                                    iHighestOneBit = Integer.highestOneBit(i2);
                                    while (true) {
                                        if ((i2 & iLowestOneBit) != 0) {
                                            if ((i3 & i28) != 0) {
                                                i |= iLowestOneBit;
                                            }
                                            i28 <<= 1;
                                            if (iLowestOneBit == iHighestOneBit) {
                                            }
                                        }
                                        iLowestOneBit <<= 1;
                                    }
                                }
                                if (i27 != 0) {
                                    break;
                                }
                                return i;
                            case -2:
                                i15 = (i3 & 4) << 9;
                                i16 = (i3 & 3) << 20;
                                i |= i15 | i16;
                                i27 = 7;
                                if (z) {
                                    if (i3 > (1 << Integer.bitCount(i2)) - 1) {
                                        throw f1066e;
                                    }
                                    iLowestOneBit = Integer.lowestOneBit(i2);
                                    iHighestOneBit = Integer.highestOneBit(i2);
                                    while (true) {
                                        if ((i2 & iLowestOneBit) != 0) {
                                            if ((i3 & i28) != 0) {
                                                i |= iLowestOneBit;
                                            }
                                            i28 <<= 1;
                                            if (iLowestOneBit == iHighestOneBit) {
                                            }
                                        }
                                        iLowestOneBit <<= 1;
                                    }
                                }
                                if (i27 != 0) {
                                    break;
                                }
                                return i;
                            case -1:
                                i9 = (i3 & 14) << 20;
                                i10 = (i3 & 1) << 15;
                                i |= i9 | i10;
                                i27 = 15;
                                if (z) {
                                    if (i3 > (1 << Integer.bitCount(i2)) - 1) {
                                        throw f1066e;
                                    }
                                    iLowestOneBit = Integer.lowestOneBit(i2);
                                    iHighestOneBit = Integer.highestOneBit(i2);
                                    while (true) {
                                        if ((i2 & iLowestOneBit) != 0) {
                                            if ((i3 & i28) != 0) {
                                                i |= iLowestOneBit;
                                            }
                                            i28 <<= 1;
                                            if (iLowestOneBit == iHighestOneBit) {
                                            }
                                        }
                                        iLowestOneBit <<= 1;
                                    }
                                }
                                if (i27 != 0) {
                                    break;
                                }
                                return i;
                            case 0:
                                return i;
                            default:
                                i27 = 0;
                                z = true;
                                if (z) {
                                    if (i3 > (1 << Integer.bitCount(i2)) - 1) {
                                        throw f1066e;
                                    }
                                    iLowestOneBit = Integer.lowestOneBit(i2);
                                    iHighestOneBit = Integer.highestOneBit(i2);
                                    while (true) {
                                        if ((i2 & iLowestOneBit) != 0) {
                                            if ((i3 & i28) != 0) {
                                                i |= iLowestOneBit;
                                            }
                                            i28 <<= 1;
                                            if (iLowestOneBit == iHighestOneBit) {
                                            }
                                        }
                                        iLowestOneBit <<= 1;
                                    }
                                }
                                if (i27 != 0) {
                                    break;
                                }
                                return i;
                        }
                }
        }
    }

    private static int m(n.d dVar, int i, String str, int i2) {
        int i3 = dVar.i(str);
        if (i3 != -1) {
            return l(i, i2, i3);
        }
        throw f1066e;
    }

    private static void n(StringBuilder sb, int i) {
        if (i < 0 && i >= -268435455) {
            i = -i;
            sb.append('-');
        }
        sb.append("0x");
        sb.append(Integer.toHexString(i).toUpperCase(Locale.US));
    }

    private static void o(StringBuilder sb, long j) {
        if (j < 0 && j >= -1152921504606846975L) {
            j = -j;
            sb.append('-');
        }
        sb.append("0x");
        sb.append(Long.toHexString(j).toUpperCase(Locale.US));
    }
}
