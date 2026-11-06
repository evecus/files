package defpackage;

import androidx.media3.exoplayer.RendererCapabilities;
import com.github.mytv.dv.model.Author;
import com.github.mytv.dv.model.Aweme;
import com.github.mytv.dv.model.HotWord;
import com.github.mytv.dv.model.LiveRoom;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class qo0 implements jn1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ List J;
    public final /* synthetic */ tm1 K;

    public /* synthetic */ qo0(byte b, tm1 tm1Var, List list) {
        this.I = b;
        this.J = list;
        this.K = tm1Var;
    }

    @Override // defpackage.jn1
    public final Object c(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        Object obj5 = de0.a;
        List list = this.J;
        tm1 tm1Var = this.K;
        switch (b) {
            case 0:
                zd2 zd2Var = (zd2) obj;
                int intValue = ((Number) obj2).intValue();
                fe0 fe0Var = (fe0) obj3;
                int intValue2 = ((Number) obj4).intValue();
                if ((intValue2 & 6) == 0) {
                    i = intValue2 | (((go1) fe0Var).g(zd2Var) ? 4 : 2);
                } else {
                    i = intValue2;
                }
                if ((intValue2 & 48) == 0) {
                    i |= ((go1) fe0Var).e(intValue) ? 32 : 16;
                }
                go1 go1Var = (go1) fe0Var;
                if (!go1Var.T(i & 1, (i & 147) != 146)) {
                    go1Var.W();
                    break;
                } else {
                    String str = (String) list.get(intValue);
                    go1Var.d0(405125026);
                    boolean g = go1Var.g(tm1Var) | go1Var.g(str);
                    Object Q = go1Var.Q();
                    if (g || Q == obj5) {
                        Q = new po0(tm1Var, str, (byte) 0);
                        go1Var.o0(Q);
                    }
                    a5.e(str, (rm1) Q, null, go1Var, 0);
                    go1Var.q(false);
                    break;
                }
            case 1:
                fd2 fd2Var = (fd2) obj;
                int intValue3 = ((Number) obj2).intValue();
                fe0 fe0Var2 = (fe0) obj3;
                int intValue4 = ((Number) obj4).intValue();
                if ((intValue4 & 6) == 0) {
                    i2 = intValue4 | (((go1) fe0Var2).g(fd2Var) ? 4 : 2);
                } else {
                    i2 = intValue4;
                }
                if ((intValue4 & 48) == 0) {
                    i2 |= ((go1) fe0Var2).e(intValue3) ? 32 : 16;
                }
                go1 go1Var2 = (go1) fe0Var2;
                if (!go1Var2.T(i2 & 1, (i2 & 147) != 146)) {
                    go1Var2.W();
                    break;
                } else {
                    LiveRoom liveRoom = (LiveRoom) list.get(intValue3);
                    go1Var2.d0(1538420614);
                    boolean g2 = go1Var2.g(tm1Var) | go1Var2.i(liveRoom);
                    Object Q2 = go1Var2.Q();
                    if (g2 || Q2 == obj5) {
                        Q2 = new yu1(tm1Var, liveRoom, (byte) 4);
                        go1Var2.o0(Q2);
                    }
                    he4.b(liveRoom, (rm1) Q2, go1Var2, LiveRoom.$stable);
                    go1Var2.q(false);
                    break;
                }
            case 2:
                zd2 zd2Var2 = (zd2) obj;
                int intValue5 = ((Number) obj2).intValue();
                fe0 fe0Var3 = (fe0) obj3;
                int intValue6 = ((Number) obj4).intValue();
                if ((intValue6 & 6) == 0) {
                    i3 = intValue6 | (((go1) fe0Var3).g(zd2Var2) ? 4 : 2);
                } else {
                    i3 = intValue6;
                }
                if ((intValue6 & 48) == 0) {
                    i3 |= ((go1) fe0Var3).e(intValue5) ? 32 : 16;
                }
                go1 go1Var3 = (go1) fe0Var3;
                if (!go1Var3.T(i3 & 1, (i3 & 147) != 146)) {
                    go1Var3.W();
                    break;
                } else {
                    String str2 = (String) list.get(intValue5);
                    go1Var3.d0(1542617317);
                    hx1 I = k21.I();
                    boolean g3 = go1Var3.g(tm1Var) | go1Var3.g(str2);
                    Object Q3 = go1Var3.Q();
                    if (g3 || Q3 == obj5) {
                        Q3 = new po0(tm1Var, str2, (byte) 1);
                        go1Var3.o0(Q3);
                    }
                    he4.o(str2, (rm1) Q3, I, null, 0L, go1Var3, 0, 24);
                    go1Var3.q(false);
                    break;
                }
            case 3:
                zd2 zd2Var3 = (zd2) obj;
                int intValue7 = ((Number) obj2).intValue();
                fe0 fe0Var4 = (fe0) obj3;
                int intValue8 = ((Number) obj4).intValue();
                if ((intValue8 & 6) == 0) {
                    i4 = intValue8 | (((go1) fe0Var4).g(zd2Var3) ? 4 : 2);
                } else {
                    i4 = intValue8;
                }
                if ((intValue8 & 48) == 0) {
                    i4 |= ((go1) fe0Var4).e(intValue7) ? 32 : 16;
                }
                go1 go1Var4 = (go1) fe0Var4;
                if (!go1Var4.T(i4 & 1, (i4 & 147) != 146)) {
                    go1Var4.W();
                    break;
                } else {
                    HotWord hotWord = (HotWord) list.get(intValue7);
                    go1Var4.d0(-388818104);
                    String word = hotWord.getWord();
                    int i8 = intValue7 + 1;
                    long hotValue = hotWord.getHotValue();
                    boolean g4 = go1Var4.g(tm1Var) | go1Var4.i(hotWord);
                    Object Q4 = go1Var4.Q();
                    if (g4 || Q4 == obj5) {
                        Q4 = new yu1(tm1Var, hotWord, (byte) 5);
                        go1Var4.o0(Q4);
                    }
                    he4.o(word, (rm1) Q4, null, Integer.valueOf(i8), hotValue, go1Var4, 0, 4);
                    go1Var4.q(false);
                    break;
                }
            case 4:
                mg2 mg2Var = (mg2) obj;
                int intValue9 = ((Number) obj2).intValue();
                fe0 fe0Var5 = (fe0) obj3;
                int intValue10 = ((Number) obj4).intValue();
                if ((intValue10 & 6) == 0) {
                    i5 = intValue10 | (((go1) fe0Var5).g(mg2Var) ? 4 : 2);
                } else {
                    i5 = intValue10;
                }
                if ((intValue10 & 48) == 0) {
                    i5 |= ((go1) fe0Var5).e(intValue9) ? 32 : 16;
                }
                go1 go1Var5 = (go1) fe0Var5;
                if (!go1Var5.T(i5 & 1, (i5 & 147) != 146)) {
                    go1Var5.W();
                    break;
                } else {
                    cd4 cd4Var = (cd4) list.get(intValue9);
                    go1Var5.d0(601033207);
                    Aweme aweme = cd4Var.b;
                    boolean g5 = go1Var5.g(tm1Var) | go1Var5.i(aweme);
                    Object Q5 = go1Var5.Q();
                    if (g5 || Q5 == obj5) {
                        Q5 = new yd4(tm1Var, aweme, (byte) 0);
                        go1Var5.o0(Q5);
                    }
                    eu5.c(aweme, (rm1) Q5, nq4.e(i13.a, 1.0f), 0.0f, null, false, false, false, 0L, 0L, go1Var5, Aweme.$stable | RendererCapabilities.DECODER_SUPPORT_MASK, 2040);
                    go1Var5.q(false);
                    break;
                }
            case 5:
                zd2 zd2Var4 = (zd2) obj;
                int intValue11 = ((Number) obj2).intValue();
                fe0 fe0Var6 = (fe0) obj3;
                int intValue12 = ((Number) obj4).intValue();
                if ((intValue12 & 6) == 0) {
                    i6 = intValue12 | (((go1) fe0Var6).g(zd2Var4) ? 4 : 2);
                } else {
                    i6 = intValue12;
                }
                if ((intValue12 & 48) == 0) {
                    i6 |= ((go1) fe0Var6).e(intValue11) ? 32 : 16;
                }
                go1 go1Var6 = (go1) fe0Var6;
                if (!go1Var6.T(i6 & 1, (i6 & 147) != 146)) {
                    go1Var6.W();
                    break;
                } else {
                    Author author = (Author) list.get(intValue11);
                    go1Var6.d0(-419582636);
                    boolean g6 = go1Var6.g(tm1Var) | go1Var6.i(author);
                    Object Q6 = go1Var6.Q();
                    if (g6 || Q6 == obj5) {
                        Q6 = new gw3(tm1Var, author, (byte) 1);
                        go1Var6.o0(Q6);
                    }
                    he4.p(author, (rm1) Q6, go1Var6, Author.$stable);
                    go1Var6.q(false);
                    break;
                }
            default:
                fd2 fd2Var2 = (fd2) obj;
                int intValue13 = ((Number) obj2).intValue();
                fe0 fe0Var7 = (fe0) obj3;
                int intValue14 = ((Number) obj4).intValue();
                if ((intValue14 & 6) == 0) {
                    i7 = intValue14 | (((go1) fe0Var7).g(fd2Var2) ? 4 : 2);
                } else {
                    i7 = intValue14;
                }
                if ((intValue14 & 48) == 0) {
                    i7 |= ((go1) fe0Var7).e(intValue13) ? 32 : 16;
                }
                go1 go1Var7 = (go1) fe0Var7;
                if (!go1Var7.T(i7 & 1, (i7 & 147) != 146)) {
                    go1Var7.W();
                    break;
                } else {
                    Author author2 = (Author) list.get(intValue13);
                    go1Var7.d0(532372358);
                    boolean g7 = go1Var7.g(tm1Var) | go1Var7.i(author2);
                    Object Q7 = go1Var7.Q();
                    if (g7 || Q7 == obj5) {
                        Q7 = new gw3(tm1Var, author2, (byte) 2);
                        go1Var7.o0(Q7);
                    }
                    he4.p(author2, (rm1) Q7, go1Var7, Author.$stable);
                    go1Var7.q(false);
                    break;
                }
        }
        return wd5Var;
    }
}
