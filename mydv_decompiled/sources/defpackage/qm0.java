package defpackage;

/* loaded from: classes2.dex */
public final class qm0 extends j16 {
    public final /* synthetic */ int A0;
    public final /* synthetic */ Object B0;
    public final /* synthetic */ v51 C0;
    public final /* synthetic */ byte z0;

    public /* synthetic */ qm0(v51 v51Var, int i, Object obj, byte b) {
        this.z0 = b;
        this.A0 = i;
        this.B0 = obj;
        this.C0 = v51Var;
    }

    @Override // defpackage.j16
    public final int A() {
        switch (this.z0) {
        }
        return this.A0;
    }

    @Override // defpackage.j16
    public final g61 K(int i) {
        byte b = this.z0;
        v51 v51Var = this.C0;
        Object obj = this.B0;
        int i2 = this.A0;
        switch (b) {
            case 0:
                int[] iArr = new int[8];
                int[] iArr2 = new int[8];
                int i3 = 0;
                for (int i4 = 0; i4 < i2; i4++) {
                    int i5 = ((i4 ^ i) - 1) >> 31;
                    for (int i6 = 0; i6 < 8; i6++) {
                        int[] iArr3 = (int[]) obj;
                        iArr[i6] = iArr[i6] ^ (iArr3[i3 + i6] & i5);
                        iArr2[i6] = iArr2[i6] ^ (iArr3[(i3 + 8) + i6] & i5);
                    }
                    i3 += 16;
                }
                return new tm0((rm0) v51Var, new sm0(iArr), new sm0(iArr2), rm0.l, (byte) 0);
            case 1:
                int[] iArr4 = new int[8];
                int[] iArr5 = new int[8];
                int i7 = 0;
                for (int i8 = 0; i8 < i2; i8++) {
                    int i9 = ((i8 ^ i) - 1) >> 31;
                    for (int i10 = 0; i10 < 8; i10++) {
                        int[] iArr6 = (int[]) obj;
                        iArr4[i10] = iArr4[i10] ^ (iArr6[i7 + i10] & i9);
                        iArr5[i10] = iArr5[i10] ^ (iArr6[(i7 + 8) + i10] & i9);
                    }
                    i7 += 16;
                }
                return new tm0((l84) v51Var, new m84(iArr4), new m84(iArr5), l84.j, (byte) 2);
            case 2:
                int[] iArr7 = new int[4];
                int[] iArr8 = new int[4];
                int i11 = 0;
                for (int i12 = 0; i12 < i2; i12++) {
                    int i13 = ((i12 ^ i) - 1) >> 31;
                    for (int i14 = 0; i14 < 4; i14++) {
                        int[] iArr9 = (int[]) obj;
                        iArr7[i14] = iArr7[i14] ^ (iArr9[i11 + i14] & i13);
                        iArr8[i14] = iArr8[i14] ^ (iArr9[(i11 + 4) + i14] & i13);
                    }
                    i11 += 8;
                }
                return ((ze4) v51Var).d(new af4(iArr7), new af4(iArr8));
            case 3:
                int[] iArr10 = new int[5];
                int[] iArr11 = new int[5];
                int i15 = 0;
                for (int i16 = 0; i16 < i2; i16++) {
                    int i17 = ((i16 ^ i) - 1) >> 31;
                    for (int i18 = 0; i18 < 5; i18++) {
                        int[] iArr12 = (int[]) obj;
                        iArr10[i18] = iArr10[i18] ^ (iArr12[i15 + i18] & i17);
                        iArr11[i18] = iArr11[i18] ^ (iArr12[(i15 + 5) + i18] & i17);
                    }
                    i15 += 10;
                }
                return ((bf4) v51Var).d(new ff4(iArr10), new ff4(iArr11));
            case 4:
                int[] iArr13 = new int[5];
                int[] iArr14 = new int[5];
                int i19 = 0;
                for (int i20 = 0; i20 < i2; i20++) {
                    int i21 = ((i20 ^ i) - 1) >> 31;
                    for (int i22 = 0; i22 < 5; i22++) {
                        int[] iArr15 = (int[]) obj;
                        iArr13[i22] = iArr13[i22] ^ (iArr15[i19 + i22] & i21);
                        iArr14[i22] = iArr14[i22] ^ (iArr15[(i19 + 5) + i22] & i21);
                    }
                    i19 += 10;
                }
                return ((cf4) v51Var).d(new df4(iArr13), new df4(iArr14));
            case 5:
                int[] iArr16 = new int[5];
                int[] iArr17 = new int[5];
                int i23 = 0;
                for (int i24 = 0; i24 < i2; i24++) {
                    int i25 = ((i24 ^ i) - 1) >> 31;
                    for (int i26 = 0; i26 < 5; i26++) {
                        int[] iArr18 = (int[]) obj;
                        iArr16[i26] = iArr16[i26] ^ (iArr18[i23 + i26] & i25);
                        iArr17[i26] = iArr17[i26] ^ (iArr18[(i23 + 5) + i26] & i25);
                    }
                    i23 += 10;
                }
                return ((ef4) v51Var).d(new ff4(iArr16), new ff4(iArr17));
            case 6:
                int[] iArr19 = new int[6];
                int[] iArr20 = new int[6];
                int i27 = 0;
                for (int i28 = 0; i28 < i2; i28++) {
                    int i29 = ((i28 ^ i) - 1) >> 31;
                    for (int i30 = 0; i30 < 6; i30++) {
                        int[] iArr21 = (int[]) obj;
                        iArr19[i30] = iArr19[i30] ^ (iArr21[i27 + i30] & i29);
                        iArr20[i30] = iArr20[i30] ^ (iArr21[(i27 + 6) + i30] & i29);
                    }
                    i27 += 12;
                }
                return ((gf4) v51Var).d(new hf4(iArr19), new hf4(iArr20));
            case 7:
                int[] iArr22 = new int[6];
                int[] iArr23 = new int[6];
                int i31 = 0;
                for (int i32 = 0; i32 < i2; i32++) {
                    int i33 = ((i32 ^ i) - 1) >> 31;
                    for (int i34 = 0; i34 < 6; i34++) {
                        int[] iArr24 = (int[]) obj;
                        iArr22[i34] = iArr22[i34] ^ (iArr24[i31 + i34] & i33);
                        iArr23[i34] = iArr23[i34] ^ (iArr24[(i31 + 6) + i34] & i33);
                    }
                    i31 += 12;
                }
                return ((if4) v51Var).d(new jf4(iArr22), new jf4(iArr23));
            case 8:
                int[] iArr25 = new int[7];
                int[] iArr26 = new int[7];
                int i35 = 0;
                for (int i36 = 0; i36 < i2; i36++) {
                    int i37 = ((i36 ^ i) - 1) >> 31;
                    for (int i38 = 0; i38 < 7; i38++) {
                        int[] iArr27 = (int[]) obj;
                        iArr25[i38] = iArr25[i38] ^ (iArr27[i35 + i38] & i37);
                        iArr26[i38] = iArr26[i38] ^ (iArr27[(i35 + 7) + i38] & i37);
                    }
                    i35 += 14;
                }
                return ((kf4) v51Var).d(new lf4(iArr25), new lf4(iArr26));
            case 9:
                int[] iArr28 = new int[7];
                int[] iArr29 = new int[7];
                int i39 = 0;
                for (int i40 = 0; i40 < i2; i40++) {
                    int i41 = ((i40 ^ i) - 1) >> 31;
                    for (int i42 = 0; i42 < 7; i42++) {
                        int[] iArr30 = (int[]) obj;
                        iArr28[i42] = iArr28[i42] ^ (iArr30[i39 + i42] & i41);
                        iArr29[i42] = iArr29[i42] ^ (iArr30[(i39 + 7) + i42] & i41);
                    }
                    i39 += 14;
                }
                return ((mf4) v51Var).d(new nf4(iArr28), new nf4(iArr29));
            case 10:
                int[] iArr31 = new int[8];
                int[] iArr32 = new int[8];
                int i43 = 0;
                for (int i44 = 0; i44 < i2; i44++) {
                    int i45 = ((i44 ^ i) - 1) >> 31;
                    for (int i46 = 0; i46 < 8; i46++) {
                        int[] iArr33 = (int[]) obj;
                        iArr31[i46] = iArr31[i46] ^ (iArr33[i43 + i46] & i45);
                        iArr32[i46] = iArr32[i46] ^ (iArr33[(i43 + 8) + i46] & i45);
                    }
                    i43 += 16;
                }
                return ((of4) v51Var).d(new pf4(iArr31), new pf4(iArr32));
            case 11:
                int[] iArr34 = new int[8];
                int[] iArr35 = new int[8];
                int i47 = 0;
                for (int i48 = 0; i48 < i2; i48++) {
                    int i49 = ((i48 ^ i) - 1) >> 31;
                    for (int i50 = 0; i50 < 8; i50++) {
                        int[] iArr36 = (int[]) obj;
                        iArr34[i50] = iArr34[i50] ^ (iArr36[i47 + i50] & i49);
                        iArr35[i50] = iArr35[i50] ^ (iArr36[(i47 + 8) + i50] & i49);
                    }
                    i47 += 16;
                }
                return ((qf4) v51Var).d(new rf4(iArr34), new rf4(iArr35));
            case 12:
                int[] iArr37 = new int[12];
                int[] iArr38 = new int[12];
                int i51 = 0;
                for (int i52 = 0; i52 < i2; i52++) {
                    int i53 = ((i52 ^ i) - 1) >> 31;
                    for (int i54 = 0; i54 < 12; i54++) {
                        int[] iArr39 = (int[]) obj;
                        iArr37[i54] = iArr37[i54] ^ (iArr39[i51 + i54] & i53);
                        iArr38[i54] = iArr38[i54] ^ (iArr39[(i51 + 12) + i54] & i53);
                    }
                    i51 += 24;
                }
                return ((sf4) v51Var).d(new tf4(iArr37), new tf4(iArr38));
            case 13:
                int[] iArr40 = new int[17];
                int[] iArr41 = new int[17];
                int i55 = 0;
                for (int i56 = 0; i56 < i2; i56++) {
                    int i57 = ((i56 ^ i) - 1) >> 31;
                    for (int i58 = 0; i58 < 17; i58++) {
                        int[] iArr42 = (int[]) obj;
                        iArr40[i58] = iArr40[i58] ^ (iArr42[i55 + i58] & i57);
                        iArr41[i58] = iArr41[i58] ^ (iArr42[(i55 + 17) + i58] & i57);
                    }
                    i55 += 34;
                }
                return ((uf4) v51Var).d(new vf4(iArr40), new vf4(iArr41));
            case 14:
                long[] jArr = new long[2];
                long[] jArr2 = new long[2];
                int i59 = 0;
                for (int i60 = 0; i60 < i2; i60++) {
                    long j = ((i60 ^ i) - 1) >> 31;
                    for (int i61 = 0; i61 < 2; i61++) {
                        long[] jArr3 = (long[]) obj;
                        jArr[i61] = jArr[i61] ^ (jArr3[i59 + i61] & j);
                        jArr2[i61] = jArr2[i61] ^ (jArr3[(i59 + 2) + i61] & j);
                    }
                    i59 += 4;
                }
                return new h61((xf4) v51Var, new wf4(jArr), new wf4(jArr2), xf4.i, (byte) 1);
            case 15:
                long[] jArr4 = new long[2];
                long[] jArr5 = new long[2];
                int i62 = 0;
                for (int i63 = 0; i63 < i2; i63++) {
                    long j2 = ((i63 ^ i) - 1) >> 31;
                    for (int i64 = 0; i64 < 2; i64++) {
                        long[] jArr6 = (long[]) obj;
                        jArr4[i64] = jArr4[i64] ^ (jArr6[i62 + i64] & j2);
                        jArr5[i64] = jArr5[i64] ^ (jArr6[(i62 + 2) + i64] & j2);
                    }
                    i62 += 4;
                }
                return new h61((yf4) v51Var, new wf4(jArr4), new wf4(jArr5), yf4.i, (byte) 2);
            case 16:
                long[] jArr7 = new long[3];
                long[] jArr8 = new long[3];
                int i65 = 0;
                for (int i66 = 0; i66 < i2; i66++) {
                    long j3 = ((i66 ^ i) - 1) >> 31;
                    for (int i67 = 0; i67 < 3; i67++) {
                        long[] jArr9 = (long[]) obj;
                        jArr7[i67] = jArr7[i67] ^ (jArr9[i65 + i67] & j3);
                        jArr8[i67] = jArr8[i67] ^ (jArr9[(i65 + 3) + i67] & j3);
                    }
                    i65 += 6;
                }
                return new h61((ag4) v51Var, new zf4(jArr7), new zf4(jArr8), ag4.i, (byte) 3);
            case 17:
                long[] jArr10 = new long[3];
                long[] jArr11 = new long[3];
                int i68 = 0;
                for (int i69 = 0; i69 < i2; i69++) {
                    long j4 = ((i69 ^ i) - 1) >> 31;
                    for (int i70 = 0; i70 < 3; i70++) {
                        long[] jArr12 = (long[]) obj;
                        jArr10[i70] = jArr10[i70] ^ (jArr12[i68 + i70] & j4);
                        jArr11[i70] = jArr11[i70] ^ (jArr12[(i68 + 3) + i70] & j4);
                    }
                    i68 += 6;
                }
                return new h61((bg4) v51Var, new zf4(jArr10), new zf4(jArr11), bg4.i, (byte) 4);
            case 18:
                long[] jArr13 = new long[3];
                long[] jArr14 = new long[3];
                int i71 = 0;
                for (int i72 = 0; i72 < i2; i72++) {
                    long j5 = ((i72 ^ i) - 1) >> 31;
                    for (int i73 = 0; i73 < 3; i73++) {
                        long[] jArr15 = (long[]) obj;
                        jArr13[i73] = jArr13[i73] ^ (jArr15[i71 + i73] & j5);
                        jArr14[i73] = jArr14[i73] ^ (jArr15[(i71 + 3) + i73] & j5);
                    }
                    i71 += 6;
                }
                return new h61((dg4) v51Var, new cg4(jArr13), new cg4(jArr14), dg4.i, (byte) 5);
            case 19:
                long[] jArr16 = new long[3];
                long[] jArr17 = new long[3];
                int i74 = 0;
                for (int i75 = 0; i75 < i2; i75++) {
                    long j6 = ((i75 ^ i) - 1) >> 31;
                    for (int i76 = 0; i76 < 3; i76++) {
                        long[] jArr18 = (long[]) obj;
                        jArr16[i76] = jArr16[i76] ^ (jArr18[i74 + i76] & j6);
                        jArr17[i76] = jArr17[i76] ^ (jArr18[(i74 + 3) + i76] & j6);
                    }
                    i74 += 6;
                }
                return new h61((eg4) v51Var, new cg4(jArr16), new cg4(jArr17), eg4.i, (byte) 6);
            case 20:
                long[] jArr19 = new long[3];
                long[] jArr20 = new long[3];
                int i77 = 0;
                for (int i78 = 0; i78 < i2; i78++) {
                    long j7 = ((i78 ^ i) - 1) >> 31;
                    for (int i79 = 0; i79 < 3; i79++) {
                        long[] jArr21 = (long[]) obj;
                        jArr19[i79] = jArr19[i79] ^ (jArr21[i77 + i79] & j7);
                        jArr20[i79] = jArr20[i79] ^ (jArr21[(i77 + 3) + i79] & j7);
                    }
                    i77 += 6;
                }
                return new h61((fg4) v51Var, new cg4(jArr19), new cg4(jArr20), fg4.i, (byte) 7);
            case 21:
                long[] jArr22 = new long[4];
                long[] jArr23 = new long[4];
                int i80 = 0;
                for (int i81 = 0; i81 < i2; i81++) {
                    long j8 = ((i81 ^ i) - 1) >> 31;
                    for (int i82 = 0; i82 < 4; i82++) {
                        long[] jArr24 = (long[]) obj;
                        jArr22[i82] = jArr22[i82] ^ (jArr24[i80 + i82] & j8);
                        jArr23[i82] = jArr23[i82] ^ (jArr24[(i80 + 4) + i82] & j8);
                    }
                    i80 += 8;
                }
                return new h61((hg4) v51Var, new gg4(jArr22), new gg4(jArr23), hg4.i, (byte) 8);
            case 22:
                long[] jArr25 = new long[4];
                long[] jArr26 = new long[4];
                int i83 = 0;
                for (int i84 = 0; i84 < i2; i84++) {
                    long j9 = ((i84 ^ i) - 1) >> 31;
                    for (int i85 = 0; i85 < 4; i85++) {
                        long[] jArr27 = (long[]) obj;
                        jArr25[i85] = jArr25[i85] ^ (jArr27[i83 + i85] & j9);
                        jArr26[i85] = jArr26[i85] ^ (jArr27[(i83 + 4) + i85] & j9);
                    }
                    i83 += 8;
                }
                return new h61((ig4) v51Var, new gg4(jArr25), new gg4(jArr26), ig4.i, (byte) 9);
            case 23:
                long[] jArr28 = new long[4];
                long[] jArr29 = new long[4];
                int i86 = 0;
                for (int i87 = 0; i87 < i2; i87++) {
                    long j10 = ((i87 ^ i) - 1) >> 31;
                    for (int i88 = 0; i88 < 4; i88++) {
                        long[] jArr30 = (long[]) obj;
                        jArr28[i88] = jArr28[i88] ^ (jArr30[i86 + i88] & j10);
                        jArr29[i88] = jArr29[i88] ^ (jArr30[(i86 + 4) + i88] & j10);
                    }
                    i86 += 8;
                }
                return new h61((kg4) v51Var, new jg4(jArr28), new jg4(jArr29), kg4.i, (byte) 10);
            case 24:
                long[] jArr31 = new long[4];
                long[] jArr32 = new long[4];
                int i89 = 0;
                for (int i90 = 0; i90 < i2; i90++) {
                    long j11 = ((i90 ^ i) - 1) >> 31;
                    for (int i91 = 0; i91 < 4; i91++) {
                        long[] jArr33 = (long[]) obj;
                        jArr31[i91] = jArr31[i91] ^ (jArr33[i89 + i91] & j11);
                        jArr32[i91] = jArr32[i91] ^ (jArr33[(i89 + 4) + i91] & j11);
                    }
                    i89 += 8;
                }
                return new h61((lg4) v51Var, new jg4(jArr31), new jg4(jArr32), lg4.i, (byte) 11);
            case 25:
                long[] jArr34 = new long[4];
                long[] jArr35 = new long[4];
                int i92 = 0;
                for (int i93 = 0; i93 < i2; i93++) {
                    long j12 = ((i93 ^ i) - 1) >> 31;
                    for (int i94 = 0; i94 < 4; i94++) {
                        long[] jArr36 = (long[]) obj;
                        jArr34[i94] = jArr34[i94] ^ (jArr36[i92 + i94] & j12);
                        jArr35[i94] = jArr35[i94] ^ (jArr36[(i92 + 4) + i94] & j12);
                    }
                    i92 += 8;
                }
                return new h61((ng4) v51Var, new mg4(jArr34), new mg4(jArr35), ng4.i, (byte) 12);
            case 26:
                long[] jArr37 = new long[5];
                long[] jArr38 = new long[5];
                int i95 = 0;
                for (int i96 = 0; i96 < i2; i96++) {
                    long j13 = ((i96 ^ i) - 1) >> 31;
                    for (int i97 = 0; i97 < 5; i97++) {
                        long[] jArr39 = (long[]) obj;
                        jArr37[i97] = jArr37[i97] ^ (jArr39[i95 + i97] & j13);
                        jArr38[i97] = jArr38[i97] ^ (jArr39[(i95 + 5) + i97] & j13);
                    }
                    i95 += 10;
                }
                return new h61((pg4) v51Var, new og4(jArr37), new og4(jArr38), pg4.i, (byte) 13);
            case 27:
                long[] jArr40 = new long[5];
                long[] jArr41 = new long[5];
                int i98 = 0;
                for (int i99 = 0; i99 < i2; i99++) {
                    long j14 = ((i99 ^ i) - 1) >> 31;
                    for (int i100 = 0; i100 < 5; i100++) {
                        long[] jArr42 = (long[]) obj;
                        jArr40[i100] = jArr40[i100] ^ (jArr42[i98 + i100] & j14);
                        jArr41[i100] = jArr41[i100] ^ (jArr42[(i98 + 5) + i100] & j14);
                    }
                    i98 += 10;
                }
                return new h61((qg4) v51Var, new og4(jArr40), new og4(jArr41), qg4.i, (byte) 14);
            case 28:
                long[] jArr43 = new long[7];
                long[] jArr44 = new long[7];
                int i101 = 0;
                for (int i102 = 0; i102 < i2; i102++) {
                    long j15 = ((i102 ^ i) - 1) >> 31;
                    for (int i103 = 0; i103 < 7; i103++) {
                        long[] jArr45 = (long[]) obj;
                        jArr43[i103] = jArr43[i103] ^ (jArr45[i101 + i103] & j15);
                        jArr44[i103] = jArr44[i103] ^ (jArr45[(i101 + 7) + i103] & j15);
                    }
                    i101 += 14;
                }
                return new h61((sg4) v51Var, new rg4(jArr43), new rg4(jArr44), sg4.i, (byte) 15);
            default:
                long[] jArr46 = new long[7];
                long[] jArr47 = new long[7];
                int i104 = 0;
                for (int i105 = 0; i105 < i2; i105++) {
                    long j16 = ((i105 ^ i) - 1) >> 31;
                    for (int i106 = 0; i106 < 7; i106++) {
                        long[] jArr48 = (long[]) obj;
                        jArr46[i106] = jArr46[i106] ^ (jArr48[i104 + i106] & j16);
                        jArr47[i106] = jArr47[i106] ^ (jArr48[(i104 + 7) + i106] & j16);
                    }
                    i104 += 14;
                }
                return new h61((tg4) v51Var, new rg4(jArr46), new rg4(jArr47), tg4.i, (byte) 16);
        }
    }
}
