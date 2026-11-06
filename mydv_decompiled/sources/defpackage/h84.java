package defpackage;

/* loaded from: classes2.dex */
public final class h84 implements xw0 {
    public static final long[] o = {4794697086780616226L, 8158064640168781261L, -5349999486874862801L, -1606136188198331460L, 4131703408338449720L, 6480981068601479193L, -7908458776815382629L, -6116909921290321640L, -2880145864133508542L, 1334009975649890238L, 2608012711638119052L, 6128411473006802146L, 8268148722764581231L, -9160688886553864527L, -7215885187991268811L, -4495734319001033068L, -1973867731355612462L, -1171420211273849373L, 1135362057144423861L, 2597628984639134821L, 3308224258029322869L, 5365058923640841347L, 6679025012923562964L, 8573033837759648693L, -7476448914759557205L, -6327057829258317296L, -5763719355590565569L, -4658551843659510044L, -4116276920077217854L, -3051310485924567259L, 489312712824947311L, 1452737877330783856L, 2861767655752347644L, 3322285676063803686L, 5560940570517711597L, 5996557281743188959L, 7280758554555802590L, 8532644243296465576L, -9096487096722542874L, -7894198246740708037L, -6719396339535248540L, -6333637450476146687L, -4446306890439682159L, -4076793802049405392L, -3345356375505022440L, -2983346525034927856L, -860691631967231958L, 1182934255886127544L, 1847814050463011016L, 2177327727835720531L, 2830643537854262169L, 3796741975233480872L, 4115178125766777443L, 5681478168544905931L, 6601373596472566643L, 7507060721942968483L, 8399075790359081724L, 8693463985226723168L, -8878714635349349518L, -8302665154208450068L, -8016688836872298968L, -6606660893046293015L, -4685533653050689259L, -4147400797238176981L, -3880063495543823972L, -3348786107499101689L, -1523767162380948706L, -757361751448694408L, 500013540394364858L, 748580250866718886L, 1242879168328830382L, 1977374033974150939L, 2944078676154940804L, 3659926193048069267L, 4368137639120453308L, 4836135668995329356L, 5532061633213252278L, 6448918945643986474L, 6902733635092675308L, 7801388544844847127L};
    public long c;
    public long d;
    public long e;
    public long f;
    public long g;
    public long h;
    public long i;
    public long j;
    public long k;
    public long l;
    public int n;
    public final byte[] a = new byte[8];
    public final long[] m = new long[16];
    public int b = 0;

    public h84() {
        m();
        ((hm0) jm0.c.get()).getClass();
        m();
    }

    public static long e(long j, long j2, long j3) {
        return (j & (j2 ^ j3)) ^ j3;
    }

    public static long f(long j, long j2, long j3) {
        return ((j ^ j2) & j3) | (j & j2);
    }

    public static long g(long j) {
        return (j >>> 7) ^ (((j << 63) | (j >>> 1)) ^ ((j << 56) | (j >>> 8)));
    }

    public static long h(long j) {
        return (j >>> 6) ^ (((j << 45) | (j >>> 19)) ^ ((j << 3) | (j >>> 61)));
    }

    public static long i(long j) {
        return ((j >>> 39) | (j << 25)) ^ (((j << 36) | (j >>> 28)) ^ ((j << 30) | (j >>> 34)));
    }

    public static long j(long j) {
        return ((j >>> 41) | (j << 23)) ^ (((j << 50) | (j >>> 14)) ^ ((j << 46) | (j >>> 18)));
    }

    @Override // defpackage.xw0
    public final int a(int i, byte[] bArr) {
        long j = this.c;
        if (j > 2305843009213693951L) {
            this.d += j >>> 61;
            j &= 2305843009213693951L;
            this.c = j;
        }
        long j2 = j << 3;
        long j3 = this.d;
        byte b = Byte.MIN_VALUE;
        while (true) {
            b(b);
            if (this.b == 0) {
                break;
            }
            b = 0;
        }
        if (this.n > 14) {
            k();
        }
        long[] jArr = this.m;
        jArr[14] = j3;
        jArr[15] = j2;
        k();
        dq2.n0(bArr, i, this.e);
        dq2.n0(bArr, i + 8, this.f);
        dq2.n0(bArr, i + 16, this.g);
        dq2.n0(bArr, i + 24, this.h);
        dq2.n0(bArr, i + 32, this.i);
        dq2.n0(bArr, i + 40, this.j);
        dq2.n0(bArr, i + 48, this.k);
        dq2.n0(bArr, i + 56, this.l);
        m();
        return 64;
    }

    @Override // defpackage.xw0
    public final void b(byte b) {
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        byte[] bArr = this.a;
        bArr[i] = b;
        if (i2 == bArr.length) {
            l(0, bArr);
            this.b = 0;
        }
        this.c++;
    }

    @Override // defpackage.xw0
    public final String c() {
        return "SHA-512";
    }

    @Override // defpackage.xw0
    public final int d() {
        return 64;
    }

    public final void k() {
        long j;
        long i;
        long j2;
        long i2;
        long i3;
        long j3 = this.c;
        if (j3 > 2305843009213693951L) {
            this.d += j3 >>> 61;
            this.c = j3 & 2305843009213693951L;
        }
        long[] jArr = this.m;
        long j4 = jArr[0];
        long j5 = jArr[1];
        long j6 = jArr[2];
        long j7 = jArr[3];
        long j8 = jArr[4];
        long j9 = jArr[5];
        long j10 = jArr[6];
        long j11 = jArr[7];
        long j12 = jArr[8];
        long j13 = jArr[9];
        long j14 = jArr[10];
        long j15 = jArr[11];
        long j16 = jArr[12];
        long j17 = jArr[13];
        long j18 = jArr[14];
        long j19 = jArr[15];
        long j20 = j4;
        long j21 = this.e;
        long j22 = this.f;
        long j23 = this.g;
        long j24 = this.h;
        long j25 = this.i;
        long j26 = this.j;
        long j27 = this.k;
        long j28 = this.l;
        long j29 = j16;
        long j30 = j17;
        long j31 = j18;
        long j32 = j19;
        int i4 = 0;
        long j33 = j7;
        long j34 = j8;
        long j35 = j9;
        long j36 = j10;
        long j37 = j22;
        long j38 = j27;
        long j39 = j12;
        long j40 = j15;
        long j41 = j6;
        long j42 = j26;
        long j43 = j14;
        long j44 = j5;
        long j45 = j25;
        long j46 = j13;
        long j47 = j21;
        long j48 = j11;
        while (true) {
            long j49 = j38;
            long j50 = j(j45) + e(j45, j42, j38);
            long[] jArr2 = o;
            long j51 = j28 + j50 + jArr2[i4] + j20;
            long j52 = j24 + j51;
            long j53 = j37;
            long i5 = i(j47) + f(j47, j53, j23) + j51;
            long j54 = j42;
            long j55 = j45;
            long j56 = j(j52) + e(j52, j55, j54) + jArr2[i4 + 1] + j44 + j49;
            long j57 = j23 + j56;
            long i6 = i(i5) + f(i5, j47, j53) + j56;
            long j58 = j(j57) + e(j57, j52, j55) + jArr2[i4 + 2] + j41 + j54;
            long j59 = j53 + j58;
            long i7 = i(i6) + f(i6, i5, j47) + j58;
            long j60 = j(j59) + e(j59, j57, j52) + jArr2[i4 + 3] + j33 + j55;
            long j61 = j47 + j60;
            long i8 = i(i7) + f(i7, i6, i5) + j60;
            long j62 = j(j61) + e(j61, j59, j57) + jArr2[i4 + 4] + j34 + j52;
            long j63 = i5 + j62;
            long i9 = i(i8) + f(i8, i7, i6) + j62;
            long j64 = j(j63) + e(j63, j61, j59) + jArr2[i4 + 5] + j35 + j57;
            long j65 = i6 + j64;
            long i10 = i(i9) + f(i9, i8, i7) + j64;
            long j66 = j(j65) + e(j65, j63, j61) + jArr2[i4 + 6] + j36 + j59;
            long j67 = i7 + j66;
            long i11 = i(i10) + f(i10, i9, i8) + j66;
            long j68 = j(j67) + e(j67, j65, j63) + jArr2[i4 + 7] + j48 + j61;
            long j69 = i8 + j68;
            long i12 = i(i11) + f(i11, i10, i9) + j68;
            long j70 = j(j69) + e(j69, j67, j65) + jArr2[i4 + 8] + j39 + j63;
            long j71 = i9 + j70;
            long i13 = i(i12) + f(i12, i11, i10) + j70;
            long j72 = j(j71) + e(j71, j69, j67) + jArr2[i4 + 9] + j46 + j65;
            long j73 = i10 + j72;
            long i14 = i(i13) + f(i13, i12, i11) + j72;
            long j74 = j(j73) + e(j73, j71, j69) + jArr2[i4 + 10] + j43 + j67;
            long j75 = i11 + j74;
            long i15 = i(i14) + f(i14, i13, i12) + j74;
            long j76 = j(j75) + e(j75, j73, j71) + jArr2[i4 + 11] + j40 + j69;
            long j77 = i12 + j76;
            long i16 = i(i15) + f(i15, i14, i13) + j76;
            long j78 = j(j77) + e(j77, j75, j73) + jArr2[i4 + 12] + j29 + j71;
            j = i13 + j78;
            i = i(i16) + f(i16, i15, i14) + j78;
            long j79 = j(j) + e(j, j77, j75) + jArr2[i4 + 13] + j30 + j73;
            j2 = i14 + j79;
            i2 = i(i) + f(i, i16, i15) + j79;
            long j80 = j(j2) + e(j2, j, j77) + jArr2[i4 + 14] + j31 + j75;
            long j81 = i15 + j80;
            i3 = i(i2) + f(i2, i, i16) + j80;
            j42 = j81;
            long j82 = j(j81) + e(j81, j2, j) + jArr2[i4 + 15] + j32 + j77;
            j45 = i16 + j82;
            j47 = i(i3) + f(i3, i2, i) + j82;
            if (i4 == 64) {
                break;
            }
            j20 = g(j44) + h(j31) + j46 + j20;
            j44 = g(j41) + h(j32) + j43 + j44;
            j41 = g(j33) + h(j20) + j40 + j41;
            j33 = g(j34) + h(j44) + j29 + j33;
            j34 = g(j35) + h(j41) + j30 + j34;
            j35 = g(j36) + h(j33) + j31 + j35;
            j36 = g(j48) + h(j34) + j32 + j36;
            j48 = g(j39) + h(j35) + j20 + j48;
            j39 = g(j46) + h(j36) + j44 + j39;
            j46 = g(j43) + h(j48) + j41 + j46;
            j43 = g(j40) + h(j39) + j33 + j43;
            j40 = g(j29) + h(j46) + j34 + j40;
            j29 = g(j30) + h(j43) + j35 + j29;
            j30 = g(j31) + h(j40) + j36 + j30;
            j31 = g(j32) + h(j29) + j48 + j31;
            j32 = g(j20) + h(j30) + j39 + j32;
            i4 += 16;
            j28 = j;
            j24 = i;
            j37 = i3;
            j23 = i2;
            j38 = j2;
        }
        this.e += j47;
        this.f += i3;
        this.g += i2;
        this.h += i;
        this.i += j45;
        this.j += j42;
        this.k += j2;
        this.l += j;
        this.n = 0;
        for (int i17 = 0; i17 < 16; i17++) {
            jArr[i17] = 0;
        }
    }

    public final void l(int i, byte[] bArr) {
        this.m[this.n] = (dq2.k(i + 4, bArr) & 4294967295L) | ((dq2.k(i, bArr) & 4294967295L) << 32);
        int i2 = this.n + 1;
        this.n = i2;
        if (i2 == 16) {
            k();
        }
    }

    public final void m() {
        this.c = 0L;
        this.d = 0L;
        int i = 0;
        this.b = 0;
        int i2 = 0;
        while (true) {
            byte[] bArr = this.a;
            if (i2 >= bArr.length) {
                break;
            }
            bArr[i2] = 0;
            i2++;
        }
        this.n = 0;
        while (true) {
            long[] jArr = this.m;
            if (i == jArr.length) {
                this.e = 7640891576956012808L;
                this.f = -4942790177534073029L;
                this.g = 4354685564936845355L;
                this.h = -6534734903238641935L;
                this.i = 5840696475078001361L;
                this.j = -7276294671716946913L;
                this.k = 2270897969802886507L;
                this.l = 6620516959819538809L;
                return;
            }
            jArr[i] = 0;
            i++;
        }
    }

    @Override // defpackage.xw0
    public final void update(byte[] bArr, int i, int i2) {
        while (this.b != 0 && i2 > 0) {
            b(bArr[i]);
            i++;
            i2--;
        }
        while (true) {
            byte[] bArr2 = this.a;
            if (i2 < bArr2.length) {
                break;
            }
            l(i, bArr);
            i += bArr2.length;
            i2 -= bArr2.length;
            this.c += bArr2.length;
        }
        while (i2 > 0) {
            b(bArr[i]);
            i++;
            i2--;
        }
    }
}
